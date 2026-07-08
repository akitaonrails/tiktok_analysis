package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ubs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710380ubs {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public long LJ;

    public final void LIZ() {
        this.LJ = System.currentTimeMillis();
        C1708610uZ1.LIZIZ(this.LIZ).LJI(this.LIZJ, this.LIZIZ, C2097908Jt.LIZJ(new Pair("option_name", this.LIZLLL)));
    }

    public final void LIZIZ(String str, String str2) {
        C1708610uZ1.LIZIZ(this.LIZ).LJIIJ(System.currentTimeMillis() - this.LJ, this.LIZJ, C2097608Jq.LJIIIIZZ(new Pair("input_method", "normal"), new Pair("option_name", this.LIZLLL)), this.LIZIZ);
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(this.LIZ);
        String str3 = this.LIZJ;
        String str4 = this.LIZIZ;
        Pair[] pairArr = new Pair[3];
        String str5 = "1";
        pairArr[0] = new Pair("is_fullscreen", "1");
        pairArr[1] = new Pair("option_name", this.LIZLLL);
        if (str != null && C123100dR.LIZ(str)) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_valid", str5);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str != null) {
            mapLJIIJ.put("error_msg", str);
        }
        if (str2 != null) {
            mapLJIIJ.put("error_type", str2);
        }
        interfaceC1709310ua9LIZIZ.LIZLLL(str3, str4, mapLJIIJ);
    }

    public C1710380ubs(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
