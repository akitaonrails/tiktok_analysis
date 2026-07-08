package X;

import java.util.LinkedHashMap;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0ZzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917670ZzJ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C917680ZzK c917680ZzK) {
        Integer numValueOf;
        PosIdentity posIdentity = c917680ZzK.LIZ;
        if (posIdentity == null || (numValueOf = Integer.valueOf(posIdentity.type)) == null) {
            return null;
        }
        if (numValueOf.intValue() == 0) {
            return C924810aAp.LJ().LJIILJJIL;
        }
        if (numValueOf.intValue() != 1) {
            return null;
        }
        return c917680ZzK.LIZ.value;
    }

    public static String LIZIZ(PosIdentity posIdentity, long j) {
        Integer numValueOf;
        if (posIdentity != null && (numValueOf = Integer.valueOf(posIdentity.type)) != null) {
            if (numValueOf.intValue() == 2) {
                return "notice_board";
            }
            if (numValueOf.intValue() == 1) {
                if (j == C950220apo.LJ()) {
                    return "anchor_Spot";
                }
                return "guest_spot";
            }
            return "empty_spot";
        }
        return "empty_spot";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r3, java.util.Map r4) {
        /*
            X.0IjA r2 = X.C0IJT.LIZ(r3)
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = X.C930540aK4.LJIIIZ()
            if (r3 == 0) goto L20
            long r0 = r3.getOwnerUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "room_id"
            java.lang.String r0 = r3.getIdStr()
            r2.LJJII(r0, r1)
        L20:
            X.0a8R r0 = X.C923330a8R.LIZ
            java.lang.String r1 = X.C923330a8R.LIZLLL()
            java.lang.String r0 = "is_multi_guest_moderator"
            r2.LJJII(r1, r0)
            boolean r0 = X.C931790aM5.LIZIZ()
            if (r0 == 0) goto L42
            X.0a86 r0 = X.C940770aaZ.LIZ()
            X.0a3Q r0 = r0.getDataSource()
            java.lang.String r1 = r0.LIZ()
            java.lang.String r0 = "layout_key"
            r2.LJJII(r1, r0)
        L42:
            java.lang.String r1 = X.C917520Zz4.LIZJ()
            java.lang.String r0 = "layout_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto L8c
            java.util.List r0 = r0.LIZLLL()
            if (r0 == 0) goto L8c
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L63:
            boolean r0 = X.C930540aK4.LIZLLL()
            if (r0 == 0) goto L81
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = X.C916490ZxP.LIZJ()
            if (r0 == 0) goto L8a
            int r0 = r0.LJJIFFI
        L71:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "guest_cnt"
            r2.LJJII(r1, r0)
            r2.LJJIIZI(r4)
            r2.LIZ()
            return
        L81:
            if (r1 == 0) goto L8a
            int r0 = r1.intValue()
            int r0 = r0 + (-1)
            goto L71
        L8a:
            r0 = 0
            goto L71
        L8c:
            r1 = 0
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C917670ZzJ.LIZLLL(java.lang.String, java.util.Map):void");
    }

    public static void LIZJ(String str, boolean z, C917680ZzK c917680ZzK, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button_action_type", str);
        linkedHashMap.put("is_grey", String.valueOf(z ? 1 : 0));
        linkedHashMap.put("from_spot_number", String.valueOf(c917680ZzK.LIZLLL));
        long j = c917680ZzK.LIZIZ;
        if (j > 0) {
            linkedHashMap.put("from_user_id", String.valueOf(j));
        }
        if (str2.length() == 0) {
            str2 = LIZIZ(c917680ZzK.LIZ, c917680ZzK.LIZIZ);
        }
        linkedHashMap.put("from_spot_type", str2);
        linkedHashMap.put("guest_link_index", String.valueOf(c917680ZzK.LIZJ));
        String strLIZ = LIZ(c917680ZzK);
        if (strLIZ != null) {
            linkedHashMap.put("link_id", strLIZ);
        }
        LIZLLL("livesdk_multi_anchor_switch_spot_entrance", linkedHashMap);
    }
}
