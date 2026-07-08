package X;

/* JADX INFO: renamed from: X.0PBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC640710PBd implements C0P74 {
    public C588600N6s LL;

    @Override // X.C0P74
    public final void LJL() {
        this.LL = null;
    }

    public void LIZIZ() {
        LIZJ(new C588560N6o(C13BV.INSTANCE, false, null, 6));
    }

    public void LIZJ(C588560N6o c588560N6o) {
        C588600N6s c588600N6s = this.LL;
        if (c588600N6s != null) {
            c588600N6s.LIZ(c588560N6o);
        }
    }

    @Override // X.C0P74
    public final void z1(C588600N6s c588600N6s) {
        this.LL = c588600N6s;
    }
}
