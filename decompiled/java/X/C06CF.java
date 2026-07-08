package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06CF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06CF {
    public static final C06CF LIZJ = new C06CF("streaks_info:pet_panel");
    public static final C06CF LIZLLL = new C06CF("streaks_info:pet_chat_page");
    public static final C06CF LJ = new C06CF("streaks_info:pet_status_msg");
    public static final C06CF LJFF = new C06CF("streaks_pet_delete");
    public static final C06CF LJI = new C06CF("streaks_pet_invitation_accept");
    public static final C06CF LJII = new C06CF("streaks_pet_rename");
    public static final C06CF LJIIIIZZ = new C06CF("streaks_pet_update");
    public static final C06CF LJIIIZ = new C06CF("streaks_pet_local_update_visibility");
    public static final C06CF LJIIJ = new C06CF("streaks_pet_cmd");
    public static final C06CF LJIIJJI = new C06CF("streaks_pet_status");
    public static final C06CF LJIIL = new C06CF("");
    public final String LIZ;
    public String LIZIZ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06CF)) {
            return false;
        }
        C06CF c06cf = (C06CF) obj;
        return Intrinsics.LJFF(this.LIZ, c06cf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c06cf.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetUpdateSource(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", debugInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return Intrinsics.LJFF(this, LIZJ) || Intrinsics.LJFF(this, LIZLLL) || Intrinsics.LJFF(this, LJI) || Intrinsics.LJFF(this, LJII) || Intrinsics.LJFF(this, LJIIIIZZ) || Intrinsics.LJFF(this, LJ) || Intrinsics.LJFF(this, LJFF);
    }

    public C06CF(String str) {
        this.LIZ = str;
    }
}
