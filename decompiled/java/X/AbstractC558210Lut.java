package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC558210Lut implements InterfaceC1891350zJl {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public AbstractC558210Lut() {
        this(0);
    }

    public abstract AbstractC558210Lut LIZ(boolean z);

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public String LIZIZ() {
        return this.LLILZIL;
    }

    public String LIZLLL() {
        return this.LLILLL;
    }

    public String LJ() {
        return this.LLILLJJLI;
    }

    public boolean LJI() {
        return this.LLILZ;
    }

    public boolean isSelected() {
        return this.LL;
    }

    public AbstractC558210Lut(int i) {
        this.LL = false;
        this.LLILLJJLI = null;
        this.LLILLL = "";
        this.LLILZ = false;
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof AbstractC558210Lut)) {
            return false;
        }
        AbstractC558210Lut abstractC558210Lut = (AbstractC558210Lut) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(abstractC558210Lut.LJ(), LJ()) || abstractC558210Lut.isSelected() != isSelected() || !Intrinsics.LJFF(abstractC558210Lut.LIZLLL(), LIZLLL())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof AbstractC558210Lut) {
            return Intrinsics.LJFF(((AbstractC558210Lut) interfaceC1891350zJl).LJ(), LJ());
        }
        return false;
    }
}
