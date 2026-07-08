package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0WAM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAM implements C16DN {
    public static final Pattern LIZIZ = PatternProtector.compile(" ");
    public static final Pattern LIZJ = PatternProtector.compile(",");
    public final String LIZ;

    @Override // X.C16DN
    public final C0WAM LIZ() {
        return new C0WAM(this.LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.C16DN
    public final String LIZJ() {
        return this.LIZ;
    }

    @Override // X.C16DN
    public final String toString() {
        return this.LIZ;
    }

    public C0WAM(String str) {
        if (str != null) {
            this.LIZ = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // X.C16DN
    public final boolean LIZIZ(String str) {
        if ("".equals(this.LIZ)) {
            return true;
        }
        for (String str2 : LIZJ.split(LIZIZ.matcher(str).replaceAll(""))) {
            if (this.LIZ.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0WAM.class == obj.getClass()) {
            return this.LIZ.equals(((C0WAM) obj).LIZ);
        }
        return false;
    }
}
