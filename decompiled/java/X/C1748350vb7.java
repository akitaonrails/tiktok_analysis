package X;

/* JADX INFO: renamed from: X.0vb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748350vb7 implements InterfaceC1237390iIz {
    public final CharSequence LIZ;
    public final CharSequence LIZIZ;

    public C1748350vb7(CharSequence charSequence, CharSequence charSequence2) {
        this.LIZ = charSequence;
        this.LIZIZ = charSequence2;
    }

    @Override // X.InterfaceC1237390iIz
    public final void LIZ(C1748330vb5 c1748330vb5, CharSequence charSequence, int i) {
        int length;
        if (charSequence != null) {
            length = charSequence.length();
        } else {
            length = 0;
        }
        c1748330vb5.LLJJI = length;
        c1748330vb5.LLJJIII = i;
        c1748330vb5.LIZ();
        if (i <= 0) {
            c1748330vb5.setMessage(null);
            c1748330vb5.setMessageStyle(C1719580uqi.LIZ);
            c1748330vb5.setCounterStyle(C1748400vbC.LIZ);
        } else if (length == i) {
            c1748330vb5.setMessage(this.LIZ);
            c1748330vb5.setMessageStyle(C1719580uqi.LIZ);
            c1748330vb5.setCounterStyle(C1748400vbC.LIZ);
        } else if (length > i) {
            c1748330vb5.setMessage(this.LIZIZ);
            c1748330vb5.setMessageStyle(C338180DNo.LIZ);
            c1748330vb5.setCounterStyle(C1748390vbB.LIZ);
        } else {
            c1748330vb5.setMessage(null);
            c1748330vb5.setMessageStyle(C1719580uqi.LIZ);
            c1748330vb5.setCounterStyle(C1748400vbC.LIZ);
        }
    }
}
