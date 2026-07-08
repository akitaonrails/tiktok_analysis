package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.util.network.ICommerceCommonApi;
import com.ss.android.ugc.aweme.commercialize.util.network.model.TranslationResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.comment.translation.CommerceCommentTranslationRepository$translate$2", f = "CommerceCommentTranslationRepository.kt", l = {53}, m = "invokeSuspend")
public final class C1049560dQ2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Comment LLILLJJLI;
    public final /* synthetic */ C1049550dQ1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1049560dQ2(Comment comment, C1049550dQ1 c1049550dQ1, InterfaceC1364105Vn<? super C1049560dQ2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = comment;
        this.LLILLL = c1049550dQ1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1049560dQ2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("CommerceCommentTranslationRepository@3e09.translate$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Comment comment = this.LLILLJJLI;
                ICommerceCommonApi.LIZ.getClass();
                ICommerceCommonApi iCommerceCommonApi = C1407305f5.LIZIZ;
                String text = comment.getText();
                String strLLIIZ = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIZ();
                this.LL = 1;
                obj = iCommerceCommonApi.getSingleTranslation(text, strLLIIZ, 2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CommerceCommentTranslationRepository@3e09.translate$2");
                    return objLJFF;
                }
            }
            c098200Yq = (TranslationResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Comment comment2 = this.LLILLJJLI;
        C1049550dQ1 c1049550dQ1 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            TranslationResponse translationResponse = (TranslationResponse) c098200Yq;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFetchSuccess: text after translate is ");
            sbLIZ.append(translationResponse.translatedContent);
            C2188811AlT.LIZIZ(sbLIZ);
            Comment commentM169clone = comment2.m169clone();
            commentM169clone.setText(translationResponse.translatedContent);
            c1049550dQ1.LIZIZ.put(commentM169clone.getCid(), commentM169clone);
            c1049550dQ1.LIZIZ(comment2, commentM169clone, true);
        }
        C1049550dQ1 c1049550dQ12 = this.LLILLL;
        final Comment comment3 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onFetchFail: error message is ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            c1049550dQ12.LIZ(comment3.getCid()).setValue(new AbstractC1049500dPw(comment3) { // from class: X.0dQ4
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceCommentTranslationRepository@3e09.translate$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
