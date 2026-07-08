package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694530uCJ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Locale LIZ;

    public final int hashCode() {
        return this.LIZ.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.LIZ.toLanguageTag();
    }

    public C1694530uCJ(Locale locale) {
        this.LIZ = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1694530uCJ)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.LJFF(this.LIZ.toLanguageTag(), ((C1694530uCJ) obj).LIZ.toLanguageTag());
    }
}
