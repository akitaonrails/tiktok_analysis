package X;

import com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LZN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity$init$1$2", f = "AILivePhotoMiddleActivity.kt", l = {}, m = "invokeSuspend")
public final class C0LZN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AILivePhotoMiddleActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZN(AILivePhotoMiddleActivity aILivePhotoMiddleActivity, InterfaceC1364105Vn<? super C0LZN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aILivePhotoMiddleActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LZN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoMiddleActivity@e38d.init$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AILivePhotoMiddleActivity aILivePhotoMiddleActivity = this.LL;
        C2419809e0.LIZ(aILivePhotoMiddleActivity, new AwS552S0100000_8(aILivePhotoMiddleActivity, 33));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoMiddleActivity@e38d.init$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
