package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0IDI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDI extends C21674119s3 {
    public final int $t;

    public static final int LJIILL$0(C0IDI c0idi) {
        return 1;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return this.$t != 0 ? super.LJIIIIZZ(i, i2, i3, i4, i5) : LJIIIIZZ$0(this, i, i2, i3, i4, i5);
    }

    @Override // X.C21674119s3
    public final int LJIIIZ(int i, View view) {
        return 1 - this.$t != 0 ? super.LJIIIZ(i, view) : super.LJIIIZ(i, view);
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        return 1 - this.$t != 0 ? super.LJIILL() : LJIILL$0(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IDI(Context context, int i) {
        super(context);
        this.$t = i;
    }

    public static final int LJIIIIZZ$0(C0IDI c0idi, int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
