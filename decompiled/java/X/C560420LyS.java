package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560420LyS {
    public static final C560420LyS LIZ = new C560420LyS();

    public static void LIZ(String str, String str2, String str3, long j, long j2, boolean z, String str4) {
        String str5;
        boolean z2;
        EnumC560430LyT next;
        long j3 = j2 - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", str);
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_draft", str5);
        c2344009Gk.LIZLLL(j, "enter_timestamp");
        c2344009Gk.LIZLLL(j2, "leave_timestamp");
        c2344009Gk.LIZLLL(j3, "stay_time");
        if (str3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC560410LyR enumC560410LyR = null;
        if (z2) {
            str3 = EnumC560430LyT.OTHERS.getWay();
        } else if (C0C64.LJIILLIIL().LJIJ(31744, 1, "creative_tool_stay_time_check_enter_leave_way_types", true) > 0) {
            Iterator<EnumC560430LyT> it2 = EnumC560430LyT.getEntries().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getWay(), str3)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EnumC560430LyT enumC560430LyT = next;
            if (enumC560430LyT == null || (str3 = enumC560430LyT.getWay()) == null) {
                str3 = EnumC560430LyT.OTHERS.getWay();
            }
        }
        c2344009Gk.LJIIIIZZ("enter_way", str3);
        if (str4.length() == 0) {
            str4 = EnumC560410LyR.OTHERS.getWay();
        } else if (C0C64.LJIILLIIL().LJIJ(31744, 1, "creative_tool_stay_time_check_enter_leave_way_types", true) > 0) {
            Iterator<EnumC560410LyR> it3 = EnumC560410LyR.getEntries().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                EnumC560410LyR next2 = it3.next();
                if (Intrinsics.LJFF(next2.getWay(), str4)) {
                    enumC560410LyR = next2;
                    break;
                }
            }
            EnumC560410LyR enumC560410LyR2 = enumC560410LyR;
            if (enumC560410LyR2 == null || (str4 = enumC560410LyR2.getWay()) == null) {
                str4 = EnumC560410LyR.OTHERS.getWay();
            }
        }
        c2344009Gk.LJIIIIZZ("leave_way", str4);
        C20684815ws.LJIILLIIL("ttcrt_camera_staytime", c2344009Gk.LIZ);
    }
}
