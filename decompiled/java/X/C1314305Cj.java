package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl$startActivity$1$avatarInfoAsync$1", f = "LongPressServiceImpl.kt", l = {157}, m = "invokeSuspend")
public final class C1314305Cj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends UrlModel>>, Object> {
    public int LL;
    public final /* synthetic */ LongPressServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1314305Cj(LongPressServiceImpl longPressServiceImpl, InterfaceC1364105Vn<? super C1314305Cj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = longPressServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1314305Cj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LongPressServiceImpl@1400.startActivity$1$avatarInfoAsync$1");
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
            LongPressServiceImpl longPressServiceImpl = this.LLILLJJLI;
            this.LL = 1;
            longPressServiceImpl.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1344805Oc(null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LongPressServiceImpl@1400.startActivity$1$avatarInfoAsync$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LongPressServiceImpl@1400.startActivity$1$avatarInfoAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends UrlModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
