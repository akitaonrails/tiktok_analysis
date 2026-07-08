package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718910SHx {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(char c) {
        return 'a' <= c ? c < '{' : 'A' <= c && c < '[';
    }

    public static String LIZ(String str) {
        EnumC718920SHy.Companion.getClass();
        EnumC718920SHy enumC718920SHy = EnumC718920SHy.CHARACTER_AND;
        EnumC718920SHy enumC718920SHy2 = EnumC718920SHy.CHARACTER_LOWER_THAN;
        EnumC718920SHy enumC718920SHy3 = EnumC718920SHy.CHARACTER_GREATER_THAN;
        for (Map.Entry entry : C2097608Jq.LJIIIIZZ(new Pair(enumC718920SHy.getMarkup(), String.valueOf(enumC718920SHy.getText())), new Pair(enumC718920SHy2.getMarkup(), String.valueOf(enumC718920SHy2.getText())), new Pair(enumC718920SHy3.getMarkup(), String.valueOf(enumC718920SHy3.getText()))).entrySet()) {
            str = u.LJJIFFI(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }
}
