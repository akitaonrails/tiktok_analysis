package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC777950UfR {
    public InterfaceC778710Ugf LIZ;
    public AbstractC777790UfB LIZIZ;
    public CharSequence LIZJ;
    public String LIZLLL;

    public abstract EnumC777930UfP LIZJ();

    public abstract CharSequence LIZLLL();

    public abstract EnumC777480Ueg LJ();

    public int LIZ() {
        if (C777940UfQ.LIZ[LIZJ().ordinal()] != 1) {
            return -1;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.etr, C497740JfY.LJII());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -46022;
    }

    public int LIZIZ() {
        int i = C777940UfQ.LIZ[LIZJ().ordinal()];
        if (i == 1 || i == 2) {
            return -1;
        }
        if (i == 3) {
            return 10;
        }
        if (i == 4) {
            return 5;
        }
        throw new C1954807lC();
    }
}
