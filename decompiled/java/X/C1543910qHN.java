package X;

import com.lynx.react.bridge.JavaOnlyMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543910qHN {
    public final C1543190qGD LIZ;
    public Boolean LIZJ;
    public boolean LIZLLL;
    public Object LJIIIIZZ;
    public EnumC1063540dma LJIILL;
    public EnumC1063540dma LJIILLIIL;
    public boolean LJIIZILJ;
    public EnumC1543740qH6 LJIJ;
    public C1543940qHQ LJIJI;
    public String LJIJJLI;
    public EnumC1544180qHo LJIL;
    public long LJJII;
    public int LJJIII;
    public C1544070qHd LJJIIJ;
    public long LJJIIZ;
    public long LJJIIZI;
    public String LJJIJ;
    public JavaOnlyMap LJJIJIIJI;
    public JSONObject LJJIJLIJ;
    public C1543210qGF LJJIL;
    public boolean LJJIZ;
    public String LIZIZ = "";
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public long LJIIL = -1;
    public String LJIILIIL = "";
    public String LJIILJJIL = "";
    public final C1238404sw LJIJJ = new C1238404sw();
    public final C1543850qHH LJJ = new C1543850qHH();
    public EnumC045700El LJJI = EnumC045700El.NONE;
    public final C1543930qHP LJJIFFI = new C1543930qHP();
    public String LJJIIJZLJL = "";
    public boolean LJJIJIIJIL = true;
    public boolean LJJIJIL = true;
    public String LJJIJL = "";
    public String LJJJ = "";

    public final EnumC1543740qH6 LIZ() {
        EnumC1543740qH6 enumC1543740qH6 = this.LJIJ;
        if (enumC1543740qH6 != null) {
            return enumC1543740qH6;
        }
        return null;
    }

    public final String toString() {
        AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
        if (C1544000qHW.LJIIJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BridgeCall(callbackId='");
            sbLIZ.append(this.LJ);
            sbLIZ.append("', bridgeName='");
            sbLIZ.append(this.LJFF);
            sbLIZ.append("')");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BridgeCall(callbackId='");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append("', bridgeName='");
        sbLIZ2.append(this.LJFF);
        sbLIZ2.append("', hitBusinessHandler='");
        sbLIZ2.append(this.LJIIZILJ);
        sbLIZ2.append("', url='");
        sbLIZ2.append(this.LJI);
        sbLIZ2.append("', msgType='");
        sbLIZ2.append(this.LJII);
        sbLIZ2.append("', params='");
        sbLIZ2.append(this.LJIIIIZZ);
        sbLIZ2.append("', sdkVersion=");
        sbLIZ2.append(this.LJIIIZ);
        sbLIZ2.append(", nameSpace='");
        sbLIZ2.append(this.LJIIJ);
        sbLIZ2.append("', frameUrl='");
        sbLIZ2.append(this.LJIIJJI);
        sbLIZ2.append("')");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C1543910qHN(C1543190qGD c1543190qGD) {
        this.LIZ = c1543190qGD;
    }
}
