package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0wuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798720wuM {
    public static final /* synthetic */ int LIZ = 0;

    public static C1798710wuL LIZ(Object obj, String str) {
        if (obj instanceof Context) {
            return new C1798710wuL((Context) obj, str);
        }
        throw new IllegalArgumentException("must parse context arguement in Settings!");
    }
}
