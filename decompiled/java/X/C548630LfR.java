package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548630LfR extends AbstractC2255721DQs<InterfaceC550060Lhk> implements InterfaceC550060Lhk, InterfaceC379610EuV {
    public static final C548660LfU LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), CreativeModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), CreativeInfo.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC548670LfV.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 151));
    public CreativeLoadingDialog LLILZLL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0LfU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C548630LfR.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C548630LfR.class, "creativeInfo", "getCreativeInfo()Lcom/ss/android/ugc/aweme/creative/model/CreativeInfo;", 0), new C2217381BqS(C548630LfR.class, "exitApi", "getExitApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitLoadingExitApi;", 0)};
        LLIZ = new Object() { // from class: X.0LfU
        };
        LLJ = 8;
    }

    public InterfaceC550060Lhk w2() {
        return this;
    }

    private final CreativeInfo G2() {
        return (CreativeInfo) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    private final DraftService<Object, Object> T2() {
        C548590LfN.LIZ.getClass();
        return C548590LfN.LIZ();
    }

    private final String W1() {
        CreativeInfo creativeInfoG2;
        C547860LeC.LIZ.getClass();
        String strLIZ = C547860LeC.LJI().LIZ(C529730Kq3.LIZIZ);
        if (strLIZ == null || (creativeInfoG2 = G2()) == null) {
            return null;
        }
        return C547860LeC.LJ().LJ(Source.AI_PORTRAIT, creativeInfoG2, strLIZ);
    }

    private final AIPortraitModel o2() {
        return (AIPortraitModel) this.LLILZIL.getValue();
    }

    public final CreativeModel H2() {
        return (CreativeModel) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.InterfaceC550060Lhk
    public void O() {
        Context contextLJIIIZ;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitInputInfo aIPortraitInputInfo;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJIIIZ() && !creativeToolsPluginService.LIZJ(C1664590tQ1.LJIIIZ(this), "ai_theater_creation", true)) {
            C201955140j.LJFF(C545870Laz.LIZIZ.LIZ, "ve plugin not installed");
            return;
        }
        AIPortraitModel aIPortraitModelO2 = o2();
        String str = (aIPortraitModelO2 == null || (aIPortraitContextModel = aIPortraitModelO2.contextModel) == null || (aIPortraitInputInfo = aIPortraitContextModel.inputInfo) == null) ? null : aIPortraitInputInfo.coverPath;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (contextLJIIIZ = abstractC1387200mCcLJ.LIZIZ()) == null) {
            contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C548640LfS(this, contextLJIIIZ, str, null), 3);
    }

    public final InterfaceC548670LfV W2() {
        return (InterfaceC548670LfV) this.LLILZ.getValue(this, LLIZLLLIL[2]);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C548630LfR(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void L1(int i) {
        C547860LeC.LIZ.getClass();
        C547860LeC.LIZJ().LIZJ(8009, i);
    }

    public final CreativeLoadingDialog c3(Context context) {
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.loadingMessage(context.getString(R.string.txr));
        return c19576911iZ.createLoadingDialog(context, 2005, creativeLoadingDialogBuilder);
    }

    public final Object X1(final String str, InterfaceC1364105Vn<? super C07UU> interfaceC1364105Vn) {
        Executor executorLIZ;
        CreativeInfo creativeInfoG2 = G2();
        if (creativeInfoG2 == null) {
            return new C07UU("", 0L);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C0VSJ c0vsjLJIIL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIL(creativeInfoG2, C0MI0.AI_PORTRAIT, "cover", false);
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        AbstractC2252651DEx abstractC2252651DEx = (AbstractC2252651DEx) c23260099m.getContext().get(AbstractC2252651DEx.Key);
        if (abstractC2252651DEx != null) {
            executorLIZ = C2182901Abw.LIZ(abstractC2252651DEx);
        } else {
            executorLIZ = null;
        }
        c1331670kl3LJIIIZ.LJJIIJZLJL = executorLIZ;
        c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.08uM
            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
                C201955140j.LIZIZ(C545870Laz.LIZIZ.LIZ, "AIPortraitGenerationDraftComponent -> canceled");
                InterfaceC1364105Vn<C07UU> interfaceC1364105Vn2 = c23260099m;
                C07UU c07uu = new C07UU("", System.currentTimeMillis() - jCurrentTimeMillis);
                C189200o6.m2constructorimpl(c07uu);
                interfaceC1364105Vn2.resumeWith(c07uu);
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) throws Throwable {
                if (bitmap == null) {
                    C201955140j.LIZIZ(C545870Laz.LIZIZ.LIZ, "AIPortraitGenerationDraftComponent -> bitmap is null");
                    InterfaceC1364105Vn<C07UU> interfaceC1364105Vn2 = c23260099m;
                    C07UU c07uu = new C07UU("", System.currentTimeMillis() - jCurrentTimeMillis);
                    C189200o6.m2constructorimpl(c07uu);
                    interfaceC1364105Vn2.resumeWith(c07uu);
                    return;
                }
                try {
                    C0VSV c0vsv = new C0VSV(c0vsjLJIIL);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                        c0vsv.flush();
                        C2107108Nh.LIZ(c0vsv, null);
                        bitmap.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                        String str2 = C545870Laz.LIZIZ.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AIPortraitGenerationDraftComponent -> path = ");
                        sbLIZ.append(str);
                        sbLIZ.append(", coverPath = ");
                        sbLIZ.append(c0vsjLJIIL.getPath());
                        C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC1364105Vn<C07UU> interfaceC1364105Vn3 = c23260099m;
                        C07UU c07uu2 = new C07UU(c0vsjLJIIL.getPath(), System.currentTimeMillis() - jCurrentTimeMillis);
                        C189200o6.m2constructorimpl(c07uu2);
                        interfaceC1364105Vn3.resumeWith(c07uu2);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                th = null;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsv, th);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    bitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                    InterfaceC1364105Vn<C07UU> interfaceC1364105Vn4 = c23260099m;
                    C07UU c07uu3 = new C07UU("", System.currentTimeMillis() - jCurrentTimeMillis);
                    C189200o6.m2constructorimpl(c07uu3);
                    interfaceC1364105Vn4.resumeWith(c07uu3);
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                String message;
                String str2 = C545870Laz.LIZIZ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AIPortraitGenerationDraftComponent -> failed, msg: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1364105Vn<C07UU> interfaceC1364105Vn2 = c23260099m;
                C07UU c07uu = new C07UU("", System.currentTimeMillis() - jCurrentTimeMillis);
                C189200o6.m2constructorimpl(c07uu);
                interfaceC1364105Vn2.resumeWith(c07uu);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:70:0x00f6, B:73:0x00fd, B:74:0x0100, B:37:0x0076, B:38:0x0079, B:39:0x007d, B:41:0x0083, B:42:0x008a, B:44:0x0090, B:46:0x0096, B:48:0x009a, B:50:0x009e, B:52:0x00a2, B:53:0x00ab, B:19:0x0045, B:25:0x0051, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:32:0x0063, B:33:0x0069, B:13:0x002e, B:54:0x00ad, B:56:0x00bd, B:57:0x00cd, B:59:0x00d4, B:61:0x00d8, B:64:0x00de, B:67:0x00e4), top: B:78:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:70:0x00f6, B:73:0x00fd, B:74:0x0100, B:37:0x0076, B:38:0x0079, B:39:0x007d, B:41:0x0083, B:42:0x008a, B:44:0x0090, B:46:0x0096, B:48:0x009a, B:50:0x009e, B:52:0x00a2, B:53:0x00ab, B:19:0x0045, B:25:0x0051, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:32:0x0063, B:33:0x0069, B:13:0x002e, B:54:0x00ad, B:56:0x00bd, B:57:0x00cd, B:59:0x00d4, B:61:0x00d8, B:64:0x00de, B:67:0x00e4), top: B:78:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:70:0x00f6, B:73:0x00fd, B:74:0x0100, B:37:0x0076, B:38:0x0079, B:39:0x007d, B:41:0x0083, B:42:0x008a, B:44:0x0090, B:46:0x0096, B:48:0x009a, B:50:0x009e, B:52:0x00a2, B:53:0x00ab, B:19:0x0045, B:25:0x0051, B:27:0x0057, B:29:0x005d, B:31:0x0061, B:32:0x0063, B:33:0x0069, B:13:0x002e, B:54:0x00ad, B:56:0x00bd, B:57:0x00cd, B:59:0x00d4, B:61:0x00d8, B:64:0x00de, B:67:0x00e4), top: B:78:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:13:0x002e, B:54:0x00ad, B:56:0x00bd, B:57:0x00cd, B:59:0x00d4, B:61:0x00d8, B:64:0x00de, B:67:0x00e4), top: B:78:0x0021, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:13:0x002e, B:54:0x00ad, B:56:0x00bd, B:57:0x00cd, B:59:0x00d4, B:61:0x00d8, B:64:0x00de, B:67:0x00e4), top: B:78:0x0021, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z1(java.lang.String r22, X.InterfaceC1364105Vn<? super X.C189200o6<kotlin.Unit>> r23) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C548630LfR.Z1(java.lang.String, X.05Vn):java.lang.Object");
    }
}
