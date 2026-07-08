package X;

/* JADX INFO: renamed from: X.0Ykz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883310Ykz extends AbstractC883060Yka {
    public final boolean LIZ;
    public final EnumC883260Yku LIZIZ;

    public C883310Ykz() {
        this((EnumC883260Yku) null, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C883310Ykz(EnumC883260Yku enumC883260Yku, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(z, (i & 2) != 0 ? null : enumC883260Yku);
    }

    public C883310Ykz(boolean z, EnumC883260Yku enumC883260Yku) {
        this.LIZ = z;
        this.LIZIZ = enumC883260Yku;
    }
}
