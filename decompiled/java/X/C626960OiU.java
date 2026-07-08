package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626960OiU {
    public static final C626960OiU LIZ = new C626960OiU();

    public static void LIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("topic_id", str2);
        c2344009Gk.LJIIIIZZ("topic_title", str3);
        c2344009Gk.LJIIIIZZ("category", "book");
        C20684815ws.LJIILLIIL("click_topic_recommend", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3) {
        if (Intrinsics.LJFF("book", "book")) {
            C20684815ws.LJIILLIIL("enter_topic_detail", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("book_id", str2), new Pair("book_title", str3), new Pair("category", "book")));
        }
    }

    public static void LIZJ(String str, String str2, String str3) {
        C20684815ws.LJIILLIIL("show_topic_recommend", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("topic_id", str2), new Pair("topic_title", str3), new Pair("category", "book")));
    }
}
