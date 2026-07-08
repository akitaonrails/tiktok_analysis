package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ys0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC887660Ys0<T> {
    T copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1<? super InterfaceC887660Ys0<?>, Unit> function1);

    boolean getDisplayInMultiSelectMode();

    boolean getEnableSelect();

    Function1<InterfaceC887660Ys0<?>, Unit> getOnSelect();

    boolean isInMultiSelectMode();

    boolean isSelected();

    boolean isSwitchingMode();
}
