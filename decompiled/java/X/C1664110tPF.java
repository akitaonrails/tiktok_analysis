package X;

import android.content.Context;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0tPF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664110tPF extends C21674119s3 {
    public final C01GW LJIILL;
    public float LJIILLIIL;

    public C1664110tPF(Context context) {
        super(context);
        this.LJIILL = C452501pT.LIZIZ(new AwS426S0200000_25(this, context, 106));
        this.LJIILLIIL = 1.0f;
    }

    @Override // X.C21674119s3
    public final int LJIILIIL(int i) {
        return (int) Math.ceil(Math.abs(i) * this.LJIILLIIL);
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
