package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ftb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144770ftb {
    public static final /* synthetic */ int LIZIZ = 0;
    public final UUID LIZ;

    public static final /* synthetic */ C1144770ftb LIZ(UUID uuid) {
        return new C1144770ftb(uuid);
    }

    public final /* synthetic */ UUID LIZJ() {
        return this.LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public /* synthetic */ C1144770ftb(UUID uuid) {
        this.LIZ = uuid;
    }

    public final boolean equals(Object obj) {
        UUID uuid = this.LIZ;
        if (!(obj instanceof C1144770ftb) || !Intrinsics.LJFF(uuid, ((C1144770ftb) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
