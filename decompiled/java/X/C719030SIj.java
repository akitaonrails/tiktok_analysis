package X;

import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0SIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719030SIj {
    public static final String LIZ(String str) {
        return new Regex("(<br>\\s*){2,}").replace(str, "<br>");
    }
}
