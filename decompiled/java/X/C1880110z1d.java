package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.0z1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880110z1d extends C12GK {
    public boolean LLJJJIL;
    public Function1<? super Integer, Boolean> LLJJJJ;

    public C1880110z1d() {
        this(false);
    }

    @Override // X.C12GK, X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    public C1880110z1d(boolean z) {
        super(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), null, z);
        this.LLJJJIL = true;
        this.LLJJJJ = AFwS271S0000000_28.get$arr$(229);
    }

    @Override // X.C12GK
    public final boolean LLLI(int i) {
        if (!this.LLJJJJ.invoke(Integer.valueOf(i)).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.C12GK
    public final boolean LLLII(int i) {
        if (super.LLLII(i) && this.LLJJJIL) {
            return true;
        }
        return false;
    }
}
