package X;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.0dLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046930dLn {
    public final C1045960dKE LIZ;
    public final WebView LIZIZ;
    public final List<C1045900dK8> LIZJ;
    public final Map<String, C1045900dK8> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final EnumC1046920dLm LJII;

    public C1046930dLn(C1045960dKE c1045960dKE, String str, List list, String str2, EnumC1046920dLm enumC1046920dLm) {
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        this.LIZLLL = new HashMap();
        this.LIZ = c1045960dKE;
        this.LIZIZ = null;
        this.LJ = str;
        this.LJII = enumC1046920dLm;
        if (list != null) {
            arrayList.addAll(list);
            for (Object obj : list) {
                ((HashMap) this.LIZLLL).put(UUID.randomUUID().toString(), obj);
            }
        }
        this.LJI = str2;
        this.LJFF = null;
    }

    public static C1046930dLn LIZ(C1045960dKE c1045960dKE, String str, List list, String str2) {
        C1045780dJw.LIZ(str, "OM SDK JS script content is null");
        C1045780dJw.LIZ(list, "VerificationScriptResources is null");
        return new C1046930dLn(c1045960dKE, str, list, str2, EnumC1046920dLm.NATIVE);
    }
}
