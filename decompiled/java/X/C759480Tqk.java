package X;

import java.net.URLEncoder;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS336S0000000_12;

/* JADX INFO: renamed from: X.0Tqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759480Tqk implements C0TWL {
    public final C0TWM LIZ;
    public boolean LIZIZ;
    public final Set<String> LIZJ = new LinkedHashSet();

    @Override // X.C0TWL
    public final void LIZIZ() {
        if (this.LIZIZ) {
            return;
        }
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        C0TWM c0twm = this.LIZ;
        c0twm.getClass();
        c1097680efe.LIZ = "web_promote";
        c1097680efe.LJIJ = c0twm.LIZJ;
        c1097680efe.LJIJI = c0twm.LIZIZ;
        c1097680efe.LJIIIIZZ = AnonymousClass0208.get$arr$(13);
        c1097680efe.LJIJJ = AFwS336S0000000_12.get$arr$(2);
        c1097680efe.LJIJJLI = Collections.singletonList(c0twm.LIZ);
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        this.LIZIZ = true;
    }

    public C759480Tqk(C0TWM c0twm) {
        this.LIZ = c0twm;
    }

    @Override // X.C0TWL
    public final void LIZ(String str) {
        if (this.LIZJ.contains(str)) {
            return;
        }
        C0XI4 c0xi4 = new C0XI4(this.LIZ.LIZ);
        c0xi4.LJ("enter_from", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview?url=");
        sbLIZ.append(URLEncoder.encode(c0xi4.LJFF(), "ISO-8859-1"));
        sbLIZ.append("&use_spark=1&use_preload=1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        this.LIZ.getClass();
        C1537060q6K.LJIIIZ(strLIZIZ, "web_promote", null, 12);
        this.LIZJ.add(str);
    }
}
