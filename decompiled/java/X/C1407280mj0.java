package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler$cropAndCheckValid$downloadModelResult$1", f = "AIGCPictureUploadHandler.kt", l = {402}, m = "invokeSuspend")
public final class C1407280mj0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ AIGCPictureUploadHandler LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407280mj0(AIGCPictureUploadHandler aIGCPictureUploadHandler, InterfaceC1364105Vn<? super C1407280mj0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCPictureUploadHandler;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407280mj0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCPictureUploadHandler@a7fd.cropAndCheckValid$downloadModelResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AIGCPictureUploadHandler aIGCPictureUploadHandler = this.LLILLJJLI;
            this.LL = 1;
            aIGCPictureUploadHandler.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (AIGCPictureUploadHandler.LJIILIIL) {
                C189200o6.m2constructorimpl(true);
                c23260099m.resumeWith(true);
            } else {
                List list = (List) C294130Bfv.LIZ.getValue();
                if (list.isEmpty()) {
                    C189200o6.m2constructorimpl(false);
                    c23260099m.resumeWith(false);
                } else {
                    DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"TikTokAIGC"}, C2097608Jq.LJIIJ(new Pair("TikTokAIGC", list)), new IFetchResourceListener() { // from class: X.0mj1
                        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                        public final void onFailure(Exception exc) {
                            InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                            Boolean bool = Boolean.FALSE;
                            C189200o6.m2constructorimpl(bool);
                            interfaceC1364105Vn.resumeWith(bool);
                        }

                        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                        public final void onSuccess(long j) {
                            AIGCPictureUploadHandler.LJIILIIL = true;
                            InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                            Boolean bool = Boolean.TRUE;
                            C189200o6.m2constructorimpl(bool);
                            interfaceC1364105Vn.resumeWith(bool);
                        }
                    });
                }
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.cropAndCheckValid$downloadModelResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.cropAndCheckValid$downloadModelResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
