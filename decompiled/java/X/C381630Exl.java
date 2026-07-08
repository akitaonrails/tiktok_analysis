package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Exl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381630Exl extends AbstractC2255721DQs<InterfaceC560620Lym> implements InterfaceC560620Lym, InterfaceC379610EuV {
    public static final C381770Exz LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C1DRG LL;
    public final C19EG LLILLJJLI;
    public AIGCGenerationParam LLILZLL;
    public C381670Exp LLIZ;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public C09AE LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final InterfaceC560620Lym LLJJIJI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), CreativeModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC381730Exv.class, null);
    public String LLILZIL = G2().creativeInfo.getCreationId();
    public CreativeModel LLIZLLLIL = G2();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Exz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C381630Exl.class, "originCreativeModel", "getOriginCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C381630Exl.class, "aiPlaygroundToolsApi", "getAiPlaygroundToolsApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundToolsApi;", 0)};
        LLJJIJIIJIL = new Object() { // from class: X.0Exz
        };
        LLJJJ = 8;
    }

    private final CreativeModel G2() {
        return (CreativeModel) this.LLILLL.getValue(this, LLJJIJIL[0]);
    }

    private final InterfaceC355850DxH H2() {
        return (InterfaceC355850DxH) this.LLJJIII.getValue();
    }

    private final InterfaceC381940EyG w2() {
        return (InterfaceC381940EyG) this.LLJJI.getValue();
    }

    public final InterfaceC381730Exv W1() {
        return (InterfaceC381730Exv) this.LLILZ.getValue(this, LLJJIJIL[1]);
    }

    public final InterfaceC378020Erw o2() {
        return (InterfaceC378020Erw) this.LLJJ.getValue();
    }

    @Override // X.InterfaceC560620Lym
    public void pY() {
        this.LLJILJILJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C2498809qk(this, CreativeModel.LIZIZ(this.LLIZLLLIL, null, null, null, null, -1, -1, -1, 2097151), this.LLILZIL, null), 2);
    }

    private final void T2() {
        if (C356770Dyl.LIZ()) {
            w2().LJFF(EnumC378030Erx.T2V, EnumC381960EyI.EDIT_AI_PLAYGROUND, null, new AwS584S0100000_5(this, 30));
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.creativeModel = this.LLIZLLLIL;
        videoPublishEditModel.mShootWay = this.LLJ;
        new C381670Exp(lifecycleScope, videoPublishEditModel, new C382160Eyc()).LIZ(null, EnumC381960EyI.EDIT_AI_PLAYGROUND, new AwS584S0100000_5(this, 29));
    }

    @Override // X.InterfaceC560620Lym
    public void kq() {
        if (C356770Dyl.LIZ()) {
            H2().LJII(EnumC382030EyP.EXECUTE_IF_NEEDED, EnumC2331909Bt.CREATION_ID, this.LLILZIL, "GenAITaskService");
            return;
        }
        C381670Exp c381670Exp = this.LLIZ;
        if (c381670Exp != null) {
            c381670Exp.LIZJ.LJII(EnumC382030EyP.EXECUTE_IF_NEEDED, EnumC2331909Bt.CREATION_ID, this.LLILZIL, "GenAITaskService");
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        T2();
    }

    public InterfaceC560620Lym X1() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC560620Lym
    public CreativeModel c52() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    @Override // X.InterfaceC560620Lym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object DO1(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C2499009qm
            if (r0 == 0) goto L51
            r9 = r11
            X.09qm r9 = (X.C2499009qm) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r4 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L38
            if (r0 != r2) goto L57
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            X.09AE r0 = r10.LLJILJILJ
            if (r0 == 0) goto L3b
            r9.LLILLL = r1
            java.lang.Object r0 = r0.LJJZ(r9)
            if (r0 != r3) goto L3b
            return r3
        L38:
            X.C155000ia.LIZIZ(r4)
        L3b:
            com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundNavigationService r4 = X.C1832407Fq.LIZ()
            if (r4 == 0) goto L5f
            X.19EG r5 = r10.LLILLJJLI
            com.ss.android.ugc.aweme.creative.model.CreativeModel r6 = r10.LLIZLLLIL
            java.lang.String r7 = r10.LLJ
            r8 = 1
            r9.LLILLL = r2
            java.lang.Object r0 = r4.LIZ(r5, r6, r7, r8, r9)
            if (r0 != r3) goto L25
            return r3
        L51:
            X.09qm r9 = new X.09qm
            r9.<init>(r10, r11)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381630Exl.DO1(X.05Vn):java.lang.Object");
    }

    public final String Z1(CreativeInfo creativeInfo) {
        C0VSJ c0vsj = new C0VSJ(C383300F1c.LIZJ(creativeInfo));
        C570490MZb.LJI(c0vsj);
        C2486309oj.LIZ.getClass();
        C2486309oj.LIZJ(C2486309oj.LIZ(360, 480), c0vsj);
        return c0vsj.getAbsolutePath();
    }

    @Override // X.InterfaceC560620Lym
    public void h11(boolean z) {
        if (z) {
            G2().editorProAIGCInfoModel.aiPlaygroundCameraModel.clickFrom = "loading_page";
        }
    }

    @Override // X.InterfaceC560620Lym
    public void yv1(boolean z) {
        this.LLJILLL = z;
    }

    public C381630Exl(C1DRG c1drg, C19EG c19eg, Bundle bundle) {
        String string;
        String string2;
        String string3;
        this.LL = c1drg;
        this.LLILLJJLI = c19eg;
        if (bundle != null) {
            string = bundle.getString("shoot_way");
        } else {
            string = null;
        }
        this.LLJ = string;
        if (bundle != null) {
            string2 = bundle.getString("shoot_from");
        } else {
            string2 = null;
        }
        this.LLJI = string2;
        if (bundle != null) {
            string3 = bundle.getString("enter_from");
        } else {
            string3 = null;
        }
        this.LLJIJIL = string3;
        this.LLJILJIL = bundle != null ? bundle.getString("enter_method") : null;
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 45));
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 46));
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 47));
        this.LLJJIJI = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v0, types: [com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType] */
    /* JADX WARN: Type inference failed for: r41v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    @Override // X.InterfaceC560620Lym
    public Object rj1(AIGCGenerationParam aIGCGenerationParam, boolean z, final InterfaceC382380Eyy interfaceC382380Eyy, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String strLIZ;
        String strLIZ2;
        DraftInfoModel draftInfoModel;
        EnumC378310EsP enumC378310EsPLIZIZ;
        AIGCGenerationParam aIGCGenerationParamLIZ = aIGCGenerationParam;
        this.LLILZLL = aIGCGenerationParam;
        String str = aIGCGenerationParam.imagePath;
        List<String> listSingletonList = aIGCGenerationParam.imagePathList;
        if (C307450C3j.LIZ() && !z) {
            if (!listSingletonList.isEmpty()) {
                strLIZ = (String) C2553209zW.LIZ.getValue();
            } else if (str.length() > 0) {
                strLIZ = (String) C2553309zX.LIZ.getValue();
            } else {
                strLIZ = (String) C2553109zV.LIZ.getValue();
            }
        } else if (!listSingletonList.isEmpty()) {
            strLIZ = (String) C2536809ws.LIZ.getValue();
        } else if (str.length() > 0) {
            strLIZ = (String) C274150Aon.LIZ.getValue();
        } else {
            strLIZ = C2536909wt.LIZ();
        }
        if (this.LLJILLL) {
            strLIZ2 = C0DMI.LIZ();
        } else {
            strLIZ2 = this.LLILZIL;
        }
        if (!(!listSingletonList.isEmpty())) {
            listSingletonList = Collections.singletonList(str);
        }
        CreativeModel creativeModelG2 = G2();
        CreativeInfo creativeInfo = G2().creativeInfo;
        CreativeInfo creativeInfoCopy = creativeInfo.copy(strLIZ2, creativeInfo.version, creativeInfo.sessionId);
        if (this.LLJILLL) {
            draftInfoModel = new DraftInfoModel(false, false, false, 0L, "", false, Scene.SCENE_SERVICE, null, -1, 0, "", 0L, 0, false, -1, "", 0L, "", false, true, false, false, 0L, false);
        } else {
            draftInfoModel = G2().draftInfoModel;
        }
        String str2 = null;
        CreativeModel creativeModelLIZIZ = CreativeModel.LIZIZ(creativeModelG2, null, draftInfoModel, creativeInfoCopy, null, -1, -129, -131073, 2097151);
        if (C307450C3j.LIZ()) {
            str2 = null;
            aIGCGenerationParamLIZ = AIGCGenerationParam.LIZ(aIGCGenerationParam, strLIZ, null, null, null, null, null, false, 0, false, null, null, null, null, -2, 7);
        }
        ArrayList<EditorProAIGCMediaItemModel> arrayList = creativeModelLIZIZ.editorProAIGCInfoModel.editorProAIGCMediaItemModelList;
        arrayList.clear();
        arrayList.add(new EditorProAIGCMediaItemModel(str2, str2, str2, str2, 0.0f, aIGCGenerationParamLIZ.mediaType, str2, str2, aIGCGenerationParamLIZ, 0L, str2, str2, false, str2, str2, str2, str2, str2, str2, str2, str2, str2, str2, str2, 16776927, str2));
        this.LLILZIL = strLIZ2;
        this.LLIZLLLIL = creativeModelLIZIZ;
        if (!C356770Dyl.LIZ()) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
            videoPublishEditModel.creativeModel = creativeModelLIZIZ;
            videoPublishEditModel.mShootWay = this.LLJ;
            String str3 = this.LLJI;
            if (str3 != null) {
                videoPublishEditModel.setShootFrom(str3);
            }
            String str4 = this.LLJIJIL;
            if (str4 != null) {
                videoPublishEditModel.setEnterFrom(str4);
            }
            String str5 = this.LLJILJIL;
            if (str5 != null) {
                videoPublishEditModel.setShootEnterMethod(str5);
            }
            this.LLIZ = new C381670Exp(lifecycleScope, videoPublishEditModel, new C382160Eyc());
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C2498909ql(this, null), 2);
            C381670Exp c381670Exp = this.LLIZ;
            if (c381670Exp != null) {
                AIGCGenerationSubType aIGCGenerationSubType = aIGCGenerationParam.subGenerateType;
                if (aIGCGenerationSubType != null) {
                    enumC378310EsPLIZIZ = C378120Es6.LIZIZ(aIGCGenerationSubType);
                } else {
                    enumC378310EsPLIZIZ = null;
                }
                C381700Exs c381700Exs = new C381700Exs(EnumC337080DJi.APPLY, new NLETrackSlot(), new PromptModel("", "", PromptType.NONE, "", "", "", false));
                CreativeInfo creativeInfo2 = creativeModelLIZIZ.creativeInfo;
                String str6 = aIGCGenerationParam.aspectRatio;
                String str7 = aIGCGenerationParam.promptDescription;
                int i = aIGCGenerationParam.duration / LSPassThroughRecordSizeConfig.DEFAULT;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listSingletonList, 10));
                Iterator<String> it2 = listSingletonList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C382120EyY(it2.next(), null, 6));
                }
                c381670Exp.LJIIIIZZ(enumC378310EsPLIZIZ, "", c381700Exs, interfaceC382380Eyy, new C382170Eyd(creativeInfo2, strLIZ, arrayList2, str7, i, str6, "", EnumC377820Erc.CREATE_TAB_VIDEO, EnumC377680ErO.AI_VIDEO, C378120Es6.LIZ(aIGCGenerationParamLIZ).LIZ(), 0, null, 1072691240), EnumC381960EyI.EDIT_AI_PLAYGROUND, true, EnumC381980EyK.EDITOR_PRO_AIGC_T2V);
            }
            return Unit.LIZ;
        }
        H2().LJII(EnumC382030EyP.CANCEL_AND_DELETE, EnumC2331909Bt.CREATION_ID, this.LLILZIL, "GenAITaskService");
        InterfaceC381940EyG interfaceC381940EyGW2 = w2();
        C381600Exi c381600ExiLIZ = C378120Es6.LIZ(aIGCGenerationParamLIZ);
        interfaceC381940EyGW2.LJ(new C381600Exi(c381600ExiLIZ.LIZ, c381600ExiLIZ.LIZIZ, EnumC381960EyI.EDIT_AI_PLAYGROUND, EnumC377680ErO.AI_VIDEO, EnumC377820Erc.CREATE_TAB_VIDEO, c381600ExiLIZ.LJFF, c381600ExiLIZ.LJI, c381600ExiLIZ.LJII, c381600ExiLIZ.LJIIIIZZ, c381600ExiLIZ.LJIIIZ, c381600ExiLIZ.LJIIJ, c381600ExiLIZ.LJIIJJI, c381600ExiLIZ.LJIIL, c381600ExiLIZ.LJIILIIL, c381600ExiLIZ.LJIILJJIL, c381600ExiLIZ.LJIILL, c381600ExiLIZ.LJIILLIIL, c381600ExiLIZ.LJIIZILJ, c381600ExiLIZ.LJIJ, c381600ExiLIZ.LJIJI, c381600ExiLIZ.LJIJJ), true, new InterfaceC382370Eyx() { // from class: X.0Exu
            @Override // X.InterfaceC382370Eyx
            public final void LIZ(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI, String str8, String str9) {
            }

            @Override // X.InterfaceC382370Eyx
            public final void LJIIJ(String str8) {
                interfaceC382380Eyy.onStart();
            }
        });
        return Unit.LIZ;
    }
}
