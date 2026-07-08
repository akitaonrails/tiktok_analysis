package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475220oUa {
    public final String LIZ;
    public int LIZIZ;
    public final String LIZJ;
    public final List<C1475530oV5> LIZLLL = new ArrayList();

    public C1475220oUa(int i, String str, String str2, Map map) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        for (C1475370oUp c1475370oUp : map.values()) {
            if (c1475370oUp != null) {
                ((ArrayList) this.LIZLLL).add(new C1475530oV5(c1475370oUp.getSubtitleId(), c1475370oUp.getLanguageCode()));
            }
        }
    }
}
