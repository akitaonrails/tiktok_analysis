package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.07fN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1918707fN {
    public static String LIZ(String str) {
        Integer numValueOf;
        if (str != null && (numValueOf = Integer.valueOf(a0.LJJJJ(str, '.', 0, 6))) != null && numValueOf.intValue() != -1) {
            return str.substring(numValueOf.intValue());
        }
        return "empty_file_suffix";
    }
}
