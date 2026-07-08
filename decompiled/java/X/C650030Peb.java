package X;

import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0Peb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650030Peb implements Observer<C650120Pek> {
    public Function1<? super C650120Pek, Unit> LL = AFwS241S0000000_10.get$arr$(263);

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C650120Pek c650120Pek) {
        if (c650120Pek != null) {
            this.LL.invoke(c650120Pek);
        }
    }
}
