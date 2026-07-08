package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01Ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
public final class C317901Ld extends C09AX implements InterfaceC1631620sYq<Integer, Throwable, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C317901Ld(InterfaceC1364105Vn<? super C317901Ld> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RememberLottieCompositionKt@1ea3.rememberLottieComposition$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1C7U.LIZIZ("RememberLottieCompositionKt@1ea3.rememberLottieComposition$1");
        return false;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, Throwable th, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        num.intValue();
        return new C317901Ld(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
