package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS154S0101000_14;

/* JADX INFO: renamed from: X.0ZiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907090ZiF extends C21674119s3 {
    public final /* synthetic */ Function0<Unit> LJIILL;

    @Override // X.C21674119s3
    public final int LJIILL() {
        return 1;
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJFF() {
        super.LJFF();
        this.LJIILL.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907090ZiF(Context context, AwS154S0101000_14 awS154S0101000_14) {
        super(context);
        this.LJIILL = awS154S0101000_14;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return (super.LJIIIIZZ(i, i2, i3, i4, i5) - ((i4 - i3) / 2)) + ((i2 - i) / 2);
    }
}
