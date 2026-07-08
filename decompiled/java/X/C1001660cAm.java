package X;

import com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoModeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.photomode.CommercePhotoModeAssem$onCreate$6$1", f = "CommercePhotoModeAssem.kt", l = {183}, m = "invokeSuspend")
public final class C1001660cAm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1000880c9W LLILLJJLI;
    public final /* synthetic */ CommercePhotoModeAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001660cAm(C1000880c9W c1000880c9W, CommercePhotoModeAssem commercePhotoModeAssem, InterfaceC1364105Vn<? super C1001660cAm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1000880c9W;
        this.LLILLL = commercePhotoModeAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001660cAm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommercePhotoModeAssem@4183.onCreate$6$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("CommercePhotoModeAssem@4183.onCreate$6$1");
                return objLJFF;
            }
        }
        C1000880c9W c1000880c9W = this.LLILLJJLI;
        if (c1000880c9W != null) {
            c1000880c9W.LIZ(false);
        }
        this.LLILLL.LLJJJJLIIL.LJ = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommercePhotoModeAssem@4183.onCreate$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
