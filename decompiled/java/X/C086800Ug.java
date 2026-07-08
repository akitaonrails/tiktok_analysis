package X;

import java.util.ArrayList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00Ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C086800Ug {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList<String> LIZ(String str) {
        if (str != null && str.length() != 0) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (Object obj : a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) {
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return new ArrayList<>();
    }
}
