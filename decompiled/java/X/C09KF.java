package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS286S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.09KF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.send.service.AIRemixImageUploadStepImpl$transform$2$1$1$1", f = "AIRemixImageUploadStepImpl.kt", l = {41}, m = "invokeSuspend")
public final class C09KF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DMUploadImageResult>, Object> {
    public int LL;
    public final /* synthetic */ C09KG LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09KF(C09KG c09kg, MediaModel mediaModel, InterfaceC1364105Vn<? super C09KF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09kg;
        this.LLILLL = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09KF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long length;
        final String str;
        Object objLIZ = obj;
        C1C7U.LIZ("AIRemixImageUploadStepImpl@66a0.transform$2$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            final C09KG c09kg = this.LLILLJJLI;
            final MediaModel mediaModel = this.LLILLL;
            this.LL = 1;
            c09kg.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            String string = UUID.randomUUID().toString();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uploadSingleImage start, id=");
            sbLIZ.append(string);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("AIRemixImageUploadStepImpl", C2188811AlT.LIZIZ(sbLIZ));
            try {
                length = new C0VSJ(mediaModel.LJFF()).length();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                length = 0;
            }
            C09KU c09ku = c09kg.LIZ;
            if (c09ku != null) {
                c09ku.LIZ(length, mediaModel.id);
            }
            IMediaPublishManager iMediaPublishManager = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
            if (iMediaPublishManager != null) {
                str = string;
                iMediaPublishManager.LJIIIZ(string, mediaModel.LJFF(), false, C09KR.AI_REMIX_SCENE.getScene(), false, true, true, false, C2097608Jq.LJ(), AFwS286S0000000_3.get$arr$(12));
            } else {
                str = string;
            }
            C09KS<DMUploadImageResult> c09ks = new C09KS<DMUploadImageResult>() { // from class: X.09KI
                @Override // X.C09KS
                public final void Uj(C0OPV c0opv) {
                }

                @Override // X.C09KS
                public final void Z3(C912060ZqG c912060ZqG) {
                }

                @Override // X.C09KS
                public final void m4(String str2) {
                }

                @Override // X.C09KS
                public final void onProgress(int i2) {
                }

                @Override // X.C09KS
                public final void l1(C09KK c09kk) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("uploadSingleImage success, id=");
                    sbLIZ2.append(str);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("AIRemixImageUploadStepImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    IMediaPublishManager iMediaPublishManager2 = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
                    if (iMediaPublishManager2 != null) {
                        iMediaPublishManager2.LJIIJJI(this, str);
                    }
                    C09KU c09ku2 = c09kg.LIZ;
                    if (c09ku2 != null) {
                        c09ku2.LJIIIIZZ(mediaModel.id);
                    }
                    InterfaceC1364105Vn<DMUploadImageResult> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(c09kk);
                    interfaceC1364105Vn.resumeWith(c09kk);
                }

                @Override // X.C09KS
                public final void rf(C1898507c7 c1898507c7) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("uploadSingleImage failed, id=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", errMsg=");
                    sbLIZ2.append(c1898507c7);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("AIRemixImageUploadStepImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    IMediaPublishManager iMediaPublishManager2 = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
                    if (iMediaPublishManager2 != null) {
                        iMediaPublishManager2.LJIIJJI(this, str);
                    }
                    C09KU c09ku2 = c09kg.LIZ;
                    if (c09ku2 != null) {
                        c09ku2.LJFF(c1898507c7.LIZIZ, mediaModel.id, c1898507c7.LIZ);
                    }
                    InterfaceC1364105Vn<DMUploadImageResult> interfaceC1364105Vn = c23260099m;
                    C098200Yq c098200Yq = new C098200Yq(new Exception(c1898507c7.LIZ));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn.resumeWith(c098200Yq);
                }
            };
            IMediaPublishManager iMediaPublishManager2 = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
            if (iMediaPublishManager2 != null) {
                iMediaPublishManager2.LIZIZ(c09ks, str);
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AIRemixImageUploadStepImpl@66a0.transform$2$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIRemixImageUploadStepImpl@66a0.transform$2$1$1$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DMUploadImageResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
