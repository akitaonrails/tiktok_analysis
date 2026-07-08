package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0zhz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906370zhz {
    public final String LIZ;
    public final EnumC1584360rKc LIZIZ;
    public final boolean LIZJ;
    public long LIZLLL;
    public final EnumC1619300sEy LJ;
    public long LJFF;
    public long LJI;
    public boolean LJII;
    public EnumC1584360rKc LJIIIIZZ;
    public final transient C1906480ziA LJIIIZ;
    public long LJIIJ;
    public EnumC1905820zh6 LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public EnumC992730bwN LJIIZILJ = EnumC992730bwN.DISMISS_ON_UNSPECIFIED;
    public EnumC1905830zh7 LJIJ;
    public Integer LJIJI;
    public String LJIJJ;
    public long LJIJJLI;
    public String LJIL;
    public String LJJ;
    public Map<String, String> LJJI;

    public final String LIZ() {
        Integer num = this.LJIJI;
        if (num != null && num.intValue() == 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        Integer num2 = this.LJIJI;
        return ((num2 == null || num2.intValue() != 1) && this.LJII) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public final boolean LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LJFF;
        return j != 0 && jCurrentTimeMillis - j < 30000;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showTime: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", clickType: ");
        sbLIZ.append(this.LJIIJJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(EnumC1905830zh7 enumC1905830zh7) {
        if (this.LJIJ == null) {
            this.LJIJ = enumC1905830zh7;
        }
    }

    public C1906370zhz(String str, EnumC1584360rKc enumC1584360rKc, boolean z, long j, EnumC1619300sEy enumC1619300sEy) {
        this.LIZ = str;
        this.LIZIZ = enumC1584360rKc;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = enumC1619300sEy;
        this.LJIIIZ = new C1906480ziA(str);
    }
}
