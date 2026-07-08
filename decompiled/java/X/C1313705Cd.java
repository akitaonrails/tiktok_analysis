package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.editcontainer.TextToImageEditContainerScene$onSoftKeyBoardChangeListener$1$keyBoardHide$1$1", f = "TextToImageEditContainerScene.kt", l = {}, m = "invokeSuspend")
public final class C1313705Cd extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public C1313705Cd(InterfaceC1364105Vn<? super C1313705Cd> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1313705Cd(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1313705Cd(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageEditContainerScene@c934.onSoftKeyBoardChangeListener$1$keyBoardHide$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageEditContainerScene@c934.onSoftKeyBoardChangeListener$1$keyBoardHide$1$1");
        return unit;
    }
}
