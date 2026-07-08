package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518500pcO {
    public final String LIZ;
    public final String LIZIZ;
    public EnumC1518490pcN LIZJ;
    public final Map<String, String> LIZLLL = new LinkedHashMap();
    public final Map<String, String> LJ = new LinkedHashMap();

    public final C1518420pcG LIZ() {
        EnumC1518490pcN enumC1518490pcN = this.LIZJ;
        if (enumC1518490pcN == null) {
            enumC1518490pcN = EnumC1518490pcN.GET;
        }
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = str;
        }
        return new C1518420pcG(enumC1518490pcN, str, str2, this.LIZLLL, this.LJ);
    }

    public C1518500pcO(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
