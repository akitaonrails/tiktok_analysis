package X;

import com.ss.android.ugc.aweme.analytics.IMediaUploadPerformanceMonitor;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS286S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.09KO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.send.service.VisualPoetImageUploadStepImpl$transform$2$1$1$1", f = "VisualPoetImageUploadStepImpl.kt", l = {43}, m = "invokeSuspend")
public final class C09KO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DMUploadImageResult>, Object> {
    public int LL;
    public final /* synthetic */ C09KL LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09KO(C09KL c09kl, MediaModel mediaModel, InterfaceC1364105Vn<? super C09KO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09kl;
        this.LLILLL = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09KO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1435230nS5 interfaceC1435230nS5LIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("VisualPoetImageUploadStepImpl@591.transform$2$1$1$1");
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
            final C09KL c09kl = this.LLILLJJLI;
            MediaModel mediaModel = this.LLILLL;
            this.LL = 1;
            c09kl.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final String string = UUID.randomUUID().toString();
            C09KU c09ku = c09kl.LIZ;
            if (c09ku != null) {
                c09ku.LIZ(mediaModel.fileSize, string);
            }
            IMediaUploadPerformanceMonitor iMediaUploadPerformanceMonitor = (IMediaUploadPerformanceMonitor) PluggableExtentionKt.pluggableSpiForReal(IMediaUploadPerformanceMonitor.class);
            if (iMediaUploadPerformanceMonitor != null && (interfaceC1435230nS5LIZ = iMediaUploadPerformanceMonitor.LIZ(string)) != null) {
                interfaceC1435230nS5LIZ.LIZIZ(C18ZL.VISUAL_POET);
            }
            IMediaPublishManager iMediaPublishManager = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
            if (iMediaPublishManager != null) {
                iMediaPublishManager.LJIIIZ(string, mediaModel.LJFF(), false, C09KR.VISUAL_POET.getScene(), false, true, true, false, C2097608Jq.LJ(), AFwS286S0000000_3.get$arr$(13));
            }
            IMediaPublishManager iMediaPublishManager2 = (IMediaPublishManager) PluggableExtentionKt.pluggableSpiForReal(IMediaPublishManager.class);
            if (iMediaPublishManager2 != null) {
                iMediaPublishManager2.LIZIZ(new C09KS<DMUploadImageResult>() { // from class: X.09KN
                    @Override // X.C09KS
                    public final void Uj(C0OPV c0opv) {
                    }

                    @Override // X.C09KS
                    public final void Z3(C912060ZqG c912060ZqG) {
                    }

                    @Override // X.C09KS
                    public final void m4(String str) {
                    }

                    @Override // X.C09KS
                    public final void onProgress(int i2) {
                    }

                    @Override // X.C09KS
                    public final void l1(C09KK c09kk) {
                        C09KU c09ku2 = c09kl.LIZ;
                        if (c09ku2 != null) {
                            c09ku2.LJIIIIZZ(string);
                        }
                        InterfaceC1364105Vn<DMUploadImageResult> interfaceC1364105Vn = c23260099m;
                        C189200o6.m2constructorimpl(c09kk);
                        interfaceC1364105Vn.resumeWith(c09kk);
                    }

                    @Override // X.C09KS
                    public final void rf(C1898507c7 c1898507c7) {
                        C09KU c09ku2 = c09kl.LIZ;
                        if (c09ku2 != null) {
                            c09ku2.LJFF(c1898507c7.LIZIZ, string, c1898507c7.LIZ);
                        }
                        InterfaceC1364105Vn<DMUploadImageResult> interfaceC1364105Vn = c23260099m;
                        C098200Yq c098200Yq = new C098200Yq(new C09KP(c1898507c7.LIZ, c1898507c7.LIZIZ));
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC1364105Vn.resumeWith(c098200Yq);
                    }
                }, string);
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("VisualPoetImageUploadStepImpl@591.transform$2$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VisualPoetImageUploadStepImpl@591.transform$2$1$1$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DMUploadImageResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
