package X;

import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService;
import com.ss.android.ugc.aweme.aikit.api.common.FileService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Lf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548370Lf1 extends AbstractC2255721DQs<InterfaceC548460LfA> implements InterfaceC548460LfA, InterfaceC379610EuV {
    public static final C548450Lf9 LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public CreativeLoadingDialog LLJI;
    public int LLJILJILJ;
    public final InterfaceC548460LfA LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC548420Lf6.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC548440Lf8.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), IAITheaterCreationLauncher.EnterParams.class, null);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 419));
    public final AtomicBoolean LLJIJIL = new AtomicBoolean(false);
    public String LLJILJIL = "init";
    public EnumC548410Lf5 LLJILLL = EnumC548410Lf5.USER_CLICK;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Lf9] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C548370Lf1.class, "dataApi", "getDataApi()Lcom/ss/android/ugc/aweme/aikit/api/create/generation/AIGCGenerationDataApi;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C548370Lf1.class, "navApi", "getNavApi()Lcom/ss/android/ugc/aweme/aikit/api/create/generation/AIGCGenerationNavApi;", 0), new C2217381BqS(C548370Lf1.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0), new C2217381BqS(C548370Lf1.class, "sceneContext", "getSceneContext()Landroid/content/Context;", 0), new C2217381BqS(C548370Lf1.class, "enterParams", "getEnterParams()Lcom/ss/android/ugc/aweme/theater/service/IAITheaterCreationLauncher$EnterParams;", 0)};
        LLJJ = new Object() { // from class: X.0Lf9
        };
    }

    public final boolean v3() {
        List listLJIIJJI = C1697810uHb.LJIIJJI(AIGC.AICreationSceneName.PROACTIVE_CRT_CREATE.INSTANCE, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE, AIGC.AICreationSceneName.SAVE_DRAFT_CAST_AGAIN.INSTANCE);
        AIGCEntranceInfo aIGCEntranceInfo = H2().entranceInfo;
        if (!C13LP.LJJJJ(aIGCEntranceInfo != null ? aIGCEntranceInfo.sceneName : null, listLJIIJJI)) {
            return false;
        }
        AIGCEntranceInfo aIGCEntranceInfo2 = H2().entranceInfo;
        return aIGCEntranceInfo2 == null || aIGCEntranceInfo2.recallWay == null;
    }

    private final DraftService<Object, Object> G2() {
        C548590LfN.LIZ.getClass();
        return C548590LfN.LIZ();
    }

    private final FileService T2() {
        C547860LeC.LIZ.getClass();
        return C547860LeC.LJ();
    }

    private final InterfaceC549370Lgd c3() {
        return (InterfaceC549370Lgd) this.LLILZLL.getValue(this, LLJJI[2]);
    }

    private final CreativeModel o2() {
        return (CreativeModel) this.LLJ.getValue();
    }

    private final Context q3() {
        return (Context) this.LLIZ.getValue(this, LLJJI[3]);
    }

    private final InterfaceC548420Lf6 w2() {
        return (InterfaceC548420Lf6) this.LLILZ.getValue(this, LLJJI[0]);
    }

    public final IAITheaterCreationLauncher.EnterParams H2() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLIZLLLIL.getValue(this, LLJJI[4]);
    }

    public final InterfaceC548440Lf8 i3() {
        return (InterfaceC548440Lf8) this.LLILZIL.getValue(this, LLJJI[1]);
    }

    @Override // X.InterfaceC548460LfA
    public void O() {
        Context contextLJIIIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (contextLJIIIZ = abstractC1387200mCcLJ.LIZIZ()) == null) {
            contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        }
        boolean z = false;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJIIIZ()) {
            z = true;
        }
        if (z && !creativeToolsPluginService.LIZJ(contextLJIIIZ, "ai_theater_creation", true)) {
            C537540L6i.LIZ.LIZIZ("AIGCGenerationDraftComponent", "ve plugin not installed", null);
        } else if (this.LLJIJIL.getAndSet(true)) {
            C537540L6i.LIZ.LIZIZ("AIGCGenerationDraftComponent", "generationGuard", null);
            C546030LbF.LIZJ(C546030LbF.LIZ, o2(), EnumC548240Leo.SAVE_DRAFT_DUPLICATE_GUARD, 0, 0, null, C2097908Jt.LIZJ(new Pair("save_reason", this.LLJILLL.getTag())), 24);
        } else {
            C546030LbF.LIZJ(C546030LbF.LIZ, o2(), EnumC548240Leo.SAVE_DRAFT_TRIGGER, 1, 0, null, C2097908Jt.LIZJ(new Pair("save_reason", this.LLJILLL.getTag())), 24);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C548380Lf2(this, contextLJIIIZ, null), 3);
        }
    }

    @Override // X.InterfaceC548460LfA
    public C00FB lD0() {
        String str;
        List<String> listAa1 = w2().Aa1();
        C547860LeC.LIZ.getClass();
        String strLIZ = C547860LeC.LJI().LIZ(C548430Lf7.LIZIZ);
        String str2 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        AIGCEntranceInfo aIGCEntranceInfo = H2().entranceInfo;
        if (aIGCEntranceInfo != null && (str = aIGCEntranceInfo.shootWay) != null) {
            str2 = str;
        }
        return new C00FB(listAa1, strLIZ, str2);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLJIJIL.set(false);
    }

    public InterfaceC548460LfA Z1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final EnumC548410Lf5 m3() {
        return this.LLJILLL;
    }

    public final void E3(EnumC548410Lf5 enumC548410Lf5) {
        this.LLJILLL = enumC548410Lf5;
    }

    public final void L1(int i) {
        C547860LeC.LIZ.getClass();
        C547860LeC.LIZJ().LIZJ(8009, i);
    }

    public final CreativeLoadingDialog W2(Context context) {
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.loadingMessage(context.getString(R.string.txr));
        return c19576911iZ.createLoadingDialog(context, 2005, creativeLoadingDialogBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X1(X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r24) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C548370Lf1.X1(X.05Vn):java.lang.Object");
    }

    public C548370Lf1(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    public final void B3(Object obj, long j) {
        String str;
        String message;
        CreativeLoadingDialog creativeLoadingDialog = this.LLJI;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        this.LLJI = null;
        if (C189200o6.m8isSuccessimpl(obj)) {
            L1(2131826226);
            if (v3()) {
                str = "new_creation";
            } else {
                str = "close";
            }
        } else {
            str = "fail";
        }
        InterfaceC549370Lgd interfaceC549370LgdC3 = c3();
        if (interfaceC549370LgdC3 != null) {
            interfaceC549370LgdC3.nm0(C189200o6.m8isSuccessimpl(obj), j, this.LLJILJILJ, this.LLJILJIL);
        }
        if (C189200o6.m7isFailureimpl(obj)) {
            CreativeModel creativeModelO2 = o2();
            int i = this.LLJILJILJ;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
            if (thM5exceptionOrNullimpl == null || (message = thM5exceptionOrNullimpl.getMessage()) == null) {
                message = "";
            }
            String str2 = this.LLJILJIL;
            EnumC548410Lf5 enumC548410Lf5 = this.LLJILLL;
            EnumC548240Leo enumC548240Leo = EnumC548240Leo.FAIL_SAVE_DRAFT;
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("nav_type", str), new Pair("save_stage", str2), new Pair("save_reason", enumC548410Lf5.getTag()));
            C547410LdT c547410LdT = C547410LdT.LIZ;
            EnumC543480LTe enumC543480LTe = EnumC543480LTe.SAVE;
            String branchName = enumC548240Leo.getBranchName();
            Map mapLJ = C2097608Jq.LJ();
            c547410LdT.getClass();
            C547410LdT.LIZJ(creativeModelO2, enumC543480LTe, branchName, 0, i, message, mapLJIIIIZZ, mapLJ);
        } else if (this.LLJILLL == EnumC548410Lf5.PLUGIN_MISSING) {
            C546030LbF.LIZJ(C546030LbF.LIZ, o2(), EnumC548240Leo.SAVE_DRAFT_EXIT_PLUGIN_MISSING, 1, 0, null, C2097608Jq.LJIIIIZZ(new Pair("nav_type", str), new Pair("save_stage", this.LLJILJIL), new Pair("save_reason", this.LLJILLL.getTag())), 24);
        } else if (v3()) {
            C546030LbF.LIZJ(C546030LbF.LIZ, o2(), EnumC548240Leo.NEW_CREATION_AFTER_SAVE, 1, 0, null, C2097608Jq.LJIIIIZZ(new Pair("nav_type", str), new Pair("save_stage", this.LLJILJIL), new Pair("save_reason", this.LLJILLL.getTag())), 24);
        } else {
            C546030LbF.LIZJ(C546030LbF.LIZ, o2(), EnumC548240Leo.CLOSE_ALL_AFTER_SAVE, 1, 0, null, C2097608Jq.LJIIIIZZ(new Pair("nav_type", str), new Pair("save_stage", this.LLJILJIL), new Pair("save_reason", this.LLJILLL.getTag())), 24);
        }
        this.LLJILLL = EnumC548410Lf5.USER_CLICK;
        if (!C189200o6.m8isSuccessimpl(obj)) {
            return;
        }
        ARunnableS108S0100000_8 aRunnableS108S0100000_8 = new ARunnableS108S0100000_8(this, 72);
        View view = this.LL.mView;
        if (view != null) {
            HandlerHook.viewPost(view, aRunnableS108S0100000_8);
        } else {
            aRunnableS108S0100000_8.run();
        }
    }

    private final List<String> W1(Source source, CreativeInfo creativeInfo, List<String> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                String strLJ = T2().LJ(source, creativeInfo, it2.next());
                if (strLJ != null) {
                    arrayList.add(strLJ);
                }
            }
            w2().Y90(arrayList);
            return C13LP.LLIIII(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        C547860LeC.LIZ.getClass();
        String strLIZ = C547860LeC.LJI().LIZ(C548430Lf7.LIZIZ);
        if (strLIZ != null) {
            arrayList2.add(strLIZ);
        }
        return C13LP.LLIIII(arrayList2);
    }
}
