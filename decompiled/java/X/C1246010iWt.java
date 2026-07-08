package X;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246010iWt extends C21543519Sv {
    public Function1<? super Boolean, Unit> LLJJJJJIL;
    public boolean LLJJJJLIIL;

    public final Function1<Boolean, Unit> getScrimStateListener() {
        return this.LLJJJJJIL;
    }

    public final void setScrimStateListener(Function1<? super Boolean, Unit> function1) {
        this.LLJJJJJIL = function1;
    }

    public C1246010iWt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C21543519Sv
    public final void LIZJ(boolean z, boolean z2) {
        super.LIZJ(z, false);
        if (this.LLJJJJLIIL != z) {
            this.LLJJJJLIIL = z;
            Function1<? super Boolean, Unit> function1 = this.LLJJJJJIL;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
        }
    }
}
