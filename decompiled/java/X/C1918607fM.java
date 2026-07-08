package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.07fM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1918607fM {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        Integer numValueOf;
        if (str != null && (numValueOf = Integer.valueOf(a0.LJJJJ(str, '.', 0, 6))) != null && numValueOf.intValue() != -1) {
            return str.substring(numValueOf.intValue());
        }
        return "empty_file_suffix";
    }
}
