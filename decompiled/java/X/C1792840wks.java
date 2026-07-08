package X;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0wks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1792840wks extends C1792220wjs {
    public String LJIIJ;
    public C1792170wjn LJIIJJI;
    public EnumC1794260wnA LJIIL;

    public C1792840wks() {
        this(-1, -1, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ() {
        C1152610g6F c1152610g6F = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJIIIIZZ;
        c1152610g6F.LIZ();
        if (c1152610g6F.LIZJ.enableStandardMapping.booleanValue()) {
            C0WIY c0wiyLIZIZ = C1792850wkt.LIZIZ(this.LIZ, this.LIZIZ, this.LJ);
            this.LJI = (String) c0wiyLIZIZ.LIZ;
            this.LJII = (String) c0wiyLIZIZ.LIZIZ;
        }
    }

    @Override // X.C1792220wjs
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapResult{mCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mDetailCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mMessage='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mPayload='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mIapPayRequest=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", payType=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1792840wks LIZJ(C1792220wjs c1792220wjs) {
        if (c1792220wjs instanceof C1792840wks) {
            return (C1792840wks) c1792220wjs;
        }
        return new C1792840wks(c1792220wjs.LIZ, c1792220wjs.LIZIZ, c1792220wjs.LJ);
    }

    public static int LIZLLL(int i, String str) {
        C1152610g6F c1152610g6F = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJIIIIZZ;
        c1152610g6F.LIZ();
        Map<String, Integer> map = c1152610g6F.LIZJ.messageMappingConfig.get(Integer.valueOf(i));
        if (map == null) {
            return -1;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).contains(entry.getKey().toLowerCase(locale))) {
                if (entry.getValue() == null) {
                    return -1;
                }
                return entry.getValue().intValue();
            }
        }
        return -1;
    }

    public C1792840wks(int i, int i2, String str) {
        this.LJIIL = EnumC1794260wnA.UNKNOWN;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LJ = str;
        if (str != "") {
            LJ();
        }
    }

    public C1792840wks(int i, int i2, int i3, String str) {
        this.LJIIL = EnumC1794260wnA.UNKNOWN;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = i3;
        this.LJ = str;
        LJ();
    }
}
