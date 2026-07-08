package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0SAH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAH {
    public Aweme LIZIZ;
    public int LIZLLL;
    public Long LJIIL;
    public Long LJIILIIL;
    public boolean LJIILJJIL;
    public C0SAB LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public String LIZ = "";
    public String LIZJ = "";
    public final Map<Integer, Boolean> LJ = new LinkedHashMap();
    public final Map<Integer, Boolean> LJFF = new LinkedHashMap();
    public final Map<Integer, Boolean> LJI = new LinkedHashMap();
    public final Map<Integer, Boolean> LJII = new LinkedHashMap();
    public final Map<Integer, Boolean> LJIIIIZZ = new LinkedHashMap();
    public final Map<Integer, Boolean> LJIIIZ = new LinkedHashMap();
    public final Map<Integer, Boolean> LJIIJ = new LinkedHashMap();
    public final Map<Integer, C0SAA> LJIIJJI = new LinkedHashMap();

    public final C0SAA LIZ() {
        Integer num;
        Map<Integer, C0SAA> map = this.LJIIJJI;
        C0SAB c0sab = this.LJIILL;
        return (C0SAA) ((LinkedHashMap) map).get(Integer.valueOf((c0sab == null || (num = c0sab.LIZ) == null) ? 0 : num.intValue()));
    }

    public static String LIZJ(String str) {
        boolean z;
        String str2;
        String string;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || (str2 = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJ(a0.LJJJLL(e3.f, a0.LJJJJZ(e3.e, a0.LJLIIIL(str).toString())), new char[]{','}, false, 0, 6))) == null || (string = a0.LJLIIIL(str2).toString()) == null) {
            return "";
        }
        return string;
    }

    public final void LIZLLL(int i) {
        C0SAB c0sab = this.LJIILL;
        if (c0sab != null) {
            if (c0sab.LIZ == null) {
                c0sab.LIZ = Integer.valueOf(i);
            }
            C0SAA c0saaLIZ = LIZ();
            if (c0saaLIZ != null && c0saaLIZ.LIZ == C0SAO.SUCCESS.getCode()) {
                c0sab.LIZIZ = true;
            }
        }
    }

    public static void LJ(Aweme aweme, C0RRP c0rrp) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C583420MuS c583420MuS = C583420MuS.LIZ;
        C583420MuS.LIZLLL(aid, c0rrp.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r35, X.EnumC310600CFm r36) {
        /*
            Method dump skipped, instruction units count: 1477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SAH.LIZIZ(int, X.0CFm):void");
    }
}
