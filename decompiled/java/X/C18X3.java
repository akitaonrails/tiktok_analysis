package X;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18X3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public interface C18X3<T extends ViewGroup> {
    T getContentContainer();

    void setInsetsHandler(C18X6 c18x6);

    void setOnContentHeightChangedListener(Function1<? super Integer, Unit> function1);

    void setSizeMode(AbstractC1776820wL2 abstractC1776820wL2);
}
