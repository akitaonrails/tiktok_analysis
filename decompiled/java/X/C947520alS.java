package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0alS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947520alS {
    public static RandomMatchGuestViewModel LIZ;

    public static void LIZ(String str) {
        String str2;
        MutableLiveData<C948850anb> mutableLiveData;
        C948850anb value;
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        HashMap map = new HashMap();
        map.put("link_id", strLJIIJ);
        Long lValueOf = null;
        C01Z4.LIZ(null, map);
        map.put("panel_type", "in_request_panel");
        map.put("randmatch_over_reason", str);
        RandomMatchGuestViewModel randomMatchGuestViewModel = LIZ;
        if (randomMatchGuestViewModel != null && (mutableLiveData = randomMatchGuestViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            lValueOf = Long.valueOf(value.LIZIZ);
        }
        if (lValueOf != null && lValueOf.longValue() > 0) {
            map.put("duration", String.valueOf(C963140bAe.LIZJ() - lValueOf.longValue()));
        } else {
            map.put("duration", CardStruct.IStatusCode.DEFAULT);
        }
        RandomMatchGuestViewModel randomMatchGuestViewModel2 = LIZ;
        if (randomMatchGuestViewModel2 == null || (str2 = randomMatchGuestViewModel2.LLILLL) == null) {
            str2 = "";
        }
        map.put("guest_request_id", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_randmatch_over");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static String LIZJ(Object obj) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            return "";
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C947520alS.LIZIZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
