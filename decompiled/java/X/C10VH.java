package X;

/* JADX INFO: renamed from: X.10VH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC1841100y0i
public final class C10VH {
    public static final C10VI Companion = new C10VI();
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    public C10VH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10VH)) {
            return false;
        }
        C10VH c10vh = (C10VH) obj;
        return this.LIZ == c10vh.LIZ && this.LIZIZ == c10vh.LIZIZ && this.LIZJ == c10vh.LIZJ && this.LIZLLL == c10vh.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShortcutEntryForFeedRefreshSettingsModel(skipNum=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tooltipDelayShow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tooltipDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tooltipMaxShowTimes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C10VH(int i) {
        this.LIZ = 8;
        this.LIZIZ = 0L;
        this.LIZJ = 3000L;
        this.LIZLLL = 1;
    }

    public /* synthetic */ C10VH(int i, int i2, long j, long j2, int i3) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.LIZ = 8;
            } else {
                this.LIZ = i2;
            }
            if ((i & 2) == 0) {
                this.LIZIZ = 0L;
            } else {
                this.LIZIZ = j;
            }
            if ((i & 4) == 0) {
                this.LIZJ = 3000L;
            } else {
                this.LIZJ = j2;
            }
            if ((i & 8) == 0) {
                this.LIZLLL = 1;
                return;
            } else {
                this.LIZLLL = i3;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13IH.LIZ.getDescriptor());
        throw null;
    }
}
