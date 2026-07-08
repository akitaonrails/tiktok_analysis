package X;

import android.util.JsonReader;
import java.io.BufferedReader;
import java.io.StringReader;

/* JADX INFO: renamed from: X.1Acr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183471Acr {
    public static Object LIZ(String str, C2261501DfQ c2261501DfQ) {
        if (str == null) {
            return null;
        }
        return c2261501DfQ.LIZ(new JsonReader(new BufferedReader(new StringReader(str), 8192)));
    }
}
