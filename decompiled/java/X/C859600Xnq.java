package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Xnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.edit.TwitterPresenter$bindTwitter$2$response$1", f = "TwitterPresenter.kt", l = {106}, m = "invokeSuspend")
public final class C859600Xnq extends C09AX implements Function1<InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859600Xnq(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C859600Xnq> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859600Xnq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwitterPresenter@7a3a.bindTwitter$2$response$1");
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
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            this.LL = 1;
            obj = value.LIZ(str, str2, str3, str4, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TwitterPresenter@7a3a.bindTwitter$2$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TwitterPresenter@7a3a.bindTwitter$2$response$1");
        return obj;
    }
}
