package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1908607dk {
    public static C1908707dl LIZ(String... strArr) {
        return new C1908707dl(LIZIZ(C13LQ.LJLIIL(strArr)), null, 6);
    }

    public static Set LIZIZ(Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!a0.LJJJIL((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }
}
