package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.edit.TwitterPresenter$unbindTwitter$2$response$1", f = "TwitterPresenter.kt", l = {131}, m = "invokeSuspend")
public final class C859610Xnr extends C09AX implements Function1<InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;

    public C859610Xnr(InterfaceC1364105Vn<? super C859610Xnr> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859610Xnr(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return new C859610Xnr(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwitterPresenter@7a3a.unbindTwitter$2$response$1");
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
            InterfaceC859630Xnt.LIZ.getClass();
            InterfaceC859630Xnt value = C859620Xns.LIZIZ.getValue();
            this.LL = 1;
            obj = value.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TwitterPresenter@7a3a.unbindTwitter$2$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TwitterPresenter@7a3a.unbindTwitter$2$response$1");
        return obj;
    }
}
