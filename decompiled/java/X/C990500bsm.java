package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990500bsm extends LinearLayout implements InterfaceC990510bsn {
    public Function1<? super Boolean, Unit> LL;

    @Override // X.InterfaceC990510bsn
    public Function1<Boolean, Unit> getExposeListener() {
        return this.LL;
    }

    public void setExposeListener(Function1<? super Boolean, Unit> function1) {
        this.LL = function1;
    }

    public C990500bsm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }
}
