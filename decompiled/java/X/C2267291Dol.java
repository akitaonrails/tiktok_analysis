package X;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1Dol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2267291Dol extends C2267081DoQ implements InterfaceC2267421Doy {
    public C2267081DoQ[] LJJLIIIJLLLLLLLZ = new C2267081DoQ[4];
    public int LJJLIIJ;

    public final void LJJIJIIJIL(C2267081DoQ c2267081DoQ) {
        if (c2267081DoQ != this && c2267081DoQ != null) {
            int i = this.LJJLIIJ + 1;
            C2267081DoQ[] c2267081DoQArr = this.LJJLIIIJLLLLLLLZ;
            if (i > c2267081DoQArr.length) {
                this.LJJLIIIJLLLLLLLZ = (C2267081DoQ[]) Arrays.copyOf(c2267081DoQArr, c2267081DoQArr.length * 2);
            }
            C2267081DoQ[] c2267081DoQArr2 = this.LJJLIIIJLLLLLLLZ;
            int i2 = this.LJJLIIJ;
            c2267081DoQArr2[i2] = c2267081DoQ;
            this.LJJLIIJ = i2 + 1;
        }
    }

    public final void LJJIJIL(int i, C2267161DoY c2267161DoY, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.LJJLIIJ; i2++) {
            c2267161DoY.LIZ(this.LJJLIIIJLLLLLLLZ[i2]);
        }
        for (int i3 = 0; i3 < this.LJJLIIJ; i3++) {
            C2267201Doc.LIZ(this.LJJLIIIJLLLLLLLZ[i3], i, arrayList, c2267161DoY);
        }
    }
}
