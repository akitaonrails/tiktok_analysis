package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15lI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20613015lI {
    public final C20612815lG LIZ = new C20612815lG();

    public final C20612815lG LIZ() {
        if (Intrinsics.LJFF(this.LIZ.LIZJ, "undefined")) {
            throw new IllegalArgumentException("Mention scene must be specified.");
        }
        return this.LIZ;
    }

    public final void LIZIZ(Class... clsArr) {
        this.LIZ.LJI = Arrays.asList(clsArr);
    }
}
