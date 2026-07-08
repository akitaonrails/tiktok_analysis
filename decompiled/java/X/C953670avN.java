package X;

/* JADX INFO: renamed from: X.0avN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953670avN {
    public static void LIZ(Long l) {
        String string;
        C953610avH.LJJIIJ = l;
        C11PQ<String> c11pq = C953610avH.LJJIIZ;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        c11pq.onNext(string);
    }

    public static void LIZIZ(String str) {
        C953610avH.LJJII = str;
        C11PQ<String> c11pq = C953610avH.LJJIII;
        if (str == null) {
            str = "";
        }
        c11pq.onNext(str);
    }
}
