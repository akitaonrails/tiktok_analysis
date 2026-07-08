package X;

import android.content.Context;

/* JADX INFO: renamed from: X.04JD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JD extends C21674119s3 {
    public final int $t;

    public static final int LJIILL$0(C04JD c04jd) {
        return -1;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return this.$t != 0 ? super.LJIIIIZZ(i, i2, i3, i4, i5) : LJIIIIZZ$0(this, i, i2, i3, i4, i5);
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        return 1 - this.$t != 0 ? super.LJIILL() : LJIILL$0(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04JD(Context context, int i) {
        super(context);
        this.$t = i;
    }

    public static final int LJIIIIZZ$0(C04JD c04jd, int i, int i2, int i3, int i4, int i5) {
        return ((i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
    }
}
