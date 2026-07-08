package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IEW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0IEW {
    void LLIIZ(C0II6 c0ii6, boolean z, Function0<Unit> function0);

    void LLJJJ(C0II6 c0ii6);

    void LLLIIII(boolean z, boolean z2);

    void LLLLZLL(boolean z);

    boolean getEnableScroll();

    void setCanInterceptCallback(Function0<Boolean> function0);

    void setCanReallyShowCardCallback(Function0<Boolean> function0);

    void setCardFullyShown(boolean z);

    void setCardType(Boolean bool);

    void setDragDistance(float f);

    void setDragProgressListener(Function1<? super Float, Unit> function1);

    void setDragReleaseListener(InterfaceC1631620sYq<? super Float, ? super Float, ? super Float, Unit> interfaceC1631620sYq);

    void setEnableScroll(boolean z);

    void setScrollUpCallback(Function0<Unit> function0);
}
