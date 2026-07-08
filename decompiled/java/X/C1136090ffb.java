package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.Map;

/* JADX INFO: renamed from: X.0ffb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136090ffb {
    public final boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;

    public C1136090ffb(boolean z) {
        this.LIZ = z;
    }

    public final void LIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("self(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(") onAdd:");
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC1136020ffU.LJJIFFI().LJI) {
            this.LIZIZ += interfaceC1136020ffU.LJJIFFI().LJIIJJI.size();
            this.LIZJ++;
            int iLIZJ = C1135870ffF.LIZJ(interfaceC1136020ffU);
            if (iLIZJ <= 70) {
                this.LIZLLL++;
            } else if (iLIZJ < 5200) {
                this.LJ++;
            } else if (5201 <= iLIZJ) {
                if (iLIZJ < 30000) {
                    this.LJFF++;
                } else if (iLIZJ > 30000) {
                    this.LJI++;
                }
            }
            if (C1135870ffF.LJIILJJIL(Integer.valueOf(C1135870ffF.LJII(interfaceC1136020ffU)))) {
                this.LJII++;
            } else {
                C1135870ffF.LJIILIIL(interfaceC1136020ffU);
            }
        }
    }

    public final void LIZIZ(C1135810ff9 c1135810ff9) {
        Gift gift;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("self(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(") onAdd:");
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1135810ff9.LJJLJ) {
            this.LIZIZ += c1135810ff9.LJJJJ.size();
            this.LIZJ++;
            int i = c1135810ff9.LJJJLZIJ;
            if (i <= 70) {
                this.LIZLLL++;
            } else if (i < 5200) {
                this.LJ++;
            } else if (5201 <= i) {
                if (i < 30000) {
                    this.LJFF++;
                } else if (i > 30000) {
                    this.LJI++;
                }
            }
            C1133690fbj c1133690fbj = C1133690fbj.LIZ;
            GiftMessage giftMessage = c1135810ff9.LIZ;
            if (giftMessage != null) {
                gift = giftMessage.mGift;
            } else {
                gift = null;
            }
            c1133690fbj.getClass();
            if (C1133690fbj.LJII(gift)) {
                this.LJII++;
            } else {
                C1133690fbj.LJFF(c1135810ff9);
            }
        }
    }

    public final void LIZJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("self(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(") onAdd:");
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC1136020ffU.LJJIFFI().LJI) {
            int size = this.LIZIZ - interfaceC1136020ffU.LJJIFFI().LJIIJJI.size();
            this.LIZIZ = size;
            if (size < 0) {
                this.LIZIZ = 0;
            }
            int i2 = this.LIZJ;
            if (i2 > 0) {
                this.LIZJ = i2 - 1;
            }
            int iLIZJ = C1135870ffF.LIZJ(interfaceC1136020ffU);
            if (iLIZJ < 70) {
                int i3 = this.LIZLLL;
                if (i3 > 0) {
                    this.LIZLLL = i3 - 1;
                }
            } else if (iLIZJ < 5200) {
                int i4 = this.LJ;
                if (i4 > 0) {
                    this.LJ = i4 - 1;
                }
            } else if (5200 <= iLIZJ) {
                if (iLIZJ < 30000) {
                    int i5 = this.LJFF;
                    if (i5 > 0) {
                        this.LJFF = i5 - 1;
                    }
                } else if (iLIZJ > 30000 && (i = this.LJI) > 0) {
                    this.LJI = i - 1;
                }
            }
            if (C1135870ffF.LJIILJJIL(Integer.valueOf(C1135870ffF.LJII(interfaceC1136020ffU)))) {
                this.LJII--;
            } else {
                C1135870ffF.LJIILIIL(interfaceC1136020ffU);
            }
        }
    }

    public final void LIZLLL(C1135810ff9 c1135810ff9) {
        int i;
        Gift gift;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("self(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(") onAdd:");
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1135810ff9.LJJLJ) {
            int size = this.LIZIZ - c1135810ff9.LJJJJ.size();
            this.LIZIZ = size;
            if (size < 0) {
                this.LIZIZ = 0;
            }
            int i2 = this.LIZJ;
            if (i2 > 0) {
                this.LIZJ = i2 - 1;
            }
            int i3 = c1135810ff9.LJJJLZIJ;
            if (i3 < 70) {
                int i4 = this.LIZLLL;
                if (i4 > 0) {
                    this.LIZLLL = i4 - 1;
                }
            } else if (i3 < 5200) {
                int i5 = this.LJ;
                if (i5 > 0) {
                    this.LJ = i5 - 1;
                }
            } else if (5200 <= i3) {
                if (i3 < 30000) {
                    int i6 = this.LJFF;
                    if (i6 > 0) {
                        this.LJFF = i6 - 1;
                    }
                } else if (i3 > 30000 && (i = this.LJI) > 0) {
                    this.LJI = i - 1;
                }
            }
            C1133690fbj c1133690fbj = C1133690fbj.LIZ;
            GiftMessage giftMessage = c1135810ff9.LIZ;
            if (giftMessage != null) {
                gift = giftMessage.mGift;
            } else {
                gift = null;
            }
            c1133690fbj.getClass();
            if (C1133690fbj.LJII(gift)) {
                this.LJII--;
            } else {
                C1133690fbj.LJFF(c1135810ff9);
            }
        }
    }
}
