package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.108h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191969108h {
    public final Map<String, String> LIZ = new HashMap();

    public final void LIZ(int i, String str) {
        LIZLLL(str, String.valueOf(i));
    }

    public final void LIZIZ(long j, String str) {
        LIZLLL(str, String.valueOf(j));
    }

    public final void LIZJ(String str, String str2) {
        LIZLLL(str, str2);
    }

    public final void LIZLLL(String str, String str2) {
        ((HashMap) this.LIZ).put(str, C191970108i.LIZ(str2));
    }
}
