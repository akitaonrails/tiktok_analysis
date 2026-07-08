package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0i4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228700i4y {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final InterfaceC1228750i53 LIZLLL;
    public final Map<String, Object> LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AfterGroupCreationParams(createChatLandingPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", quickChatViewType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trafficType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", businessExt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1228700i4y LIZ(C1228700i4y c1228700i4y, int i, C1228770i55 c1228770i55, int i2) {
        int i3;
        String str;
        InterfaceC1228750i53 interfaceC1228750i53 = c1228770i55;
        int i4 = i;
        if ((i2 & 1) != 0) {
            i4 = c1228700i4y.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1228700i4y.LIZIZ;
        } else {
            i3 = 0;
        }
        Map<String, Object> map = null;
        if ((i2 & 4) != 0) {
            str = c1228700i4y.LIZJ;
        } else {
            str = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC1228750i53 = c1228700i4y.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            map = c1228700i4y.LJ;
        }
        c1228700i4y.getClass();
        return new C1228700i4y(i4, i3, str, interfaceC1228750i53, map);
    }

    public C1228700i4y(int i, int i2, String str, InterfaceC1228750i53 interfaceC1228750i53, Map<String, ? extends Object> map) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = interfaceC1228750i53;
        this.LJ = map;
    }

    public /* synthetic */ C1228700i4y(int i, int i2, String str, InterfaceC1228750i53 interfaceC1228750i53, Map map, int i3) {
        this((i3 & 1) != 0 ? EnumC1228720i50.CHAT_ROOM.getValue() : i, (i3 & 2) != 0 ? 1 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : interfaceC1228750i53, (i3 & 16) != 0 ? C2097608Jq.LJ() : map);
    }
}
