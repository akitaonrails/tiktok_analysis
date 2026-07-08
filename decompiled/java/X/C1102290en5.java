package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0en5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102290en5 extends C1102320en8 {
    public final int LIZLLL;

    @Override // X.C1102320en8
    public final String LIZ() {
        String str;
        C1102250en1 c1102250en1 = C1102250en1.LIZ;
        int i = this.LIZLLL;
        c1102250en1.getClass();
        Map<String, String> map = C1102250en1.LJIIJ().component;
        return (map == null || (str = map.get(String.valueOf(i))) == null) ? "" : str;
    }

    public C1102290en5(int i, int i2) {
        super(false, i, 1);
        this.LIZLLL = i2;
    }
}
