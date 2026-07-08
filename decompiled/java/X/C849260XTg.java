package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849260XTg extends AbstractC849240XTe implements C0XOE {
    public final String LJI;
    public final String LJII;
    public final Map<String, String> LJIIIIZZ;
    public C0XO2 LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C849260XTg)) {
            return false;
        }
        C849260XTg c849260XTg = (C849260XTg) obj;
        return Intrinsics.LJFF(this.LJI, c849260XTg.LJI) && Intrinsics.LJFF(this.LJII, c849260XTg.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c849260XTg.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((this.LJI.hashCode() * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmailCodeLoginQueryObj(email=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0XOE
    public final C0XO2 getUserInfo() {
        return this.LJIIIZ;
    }

    public C849260XTg(String str, String str2, Map<String, String> map) {
        super(22);
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = map;
        this.LJIIIZ = new C0XO2(new JSONObject());
    }
}
