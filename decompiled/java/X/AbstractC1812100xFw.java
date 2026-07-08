package X;

import X.AbstractC1812100xFw;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0xFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1812100xFw<T extends AbstractC1812100xFw<T>> extends AbstractC1812140xG0<AbstractC1812100xFw<T>> {
    public long LIZIZ;
    public boolean LIZJ;
    public HashMap<String, String> LIZLLL;
    public EnumC1812050xFr LJ = EnumC1812050xFr.Default;
    public boolean LJFF;
    public boolean LJI;

    public abstract C1812130xFz LIZJ();

    public abstract T LIZLLL();

    @Override // X.AbstractC1812140xG0
    public /* bridge */ /* synthetic */ AbstractC1812140xG0 LIZ() {
        LIZLLL();
        return this;
    }

    public final T LJ(long j) {
        this.LIZIZ = j;
        LIZLLL();
        return this;
    }
}
