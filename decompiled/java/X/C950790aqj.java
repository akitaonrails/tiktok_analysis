package X;

import Y.AfS151S0200000_15;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0aqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950790aqj implements InterfaceC950830aqn {
    public static final C950790aqj LIZ = new C950790aqj();

    public static Map LIZIZ(C955590ayT c955590ayT) {
        Long l;
        String str;
        FollowInfo followInfo;
        Long lValueOf = null;
        if (c955590ayT instanceof C955810ayp) {
            C955810ayp c955810ayp = (C955810ayp) c955590ayT;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C955400ayA c955400ayA = C955400ayA.LIZ;
            User owner = c955810ayp.LJ.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                lValueOf = Long.valueOf(followInfo.getFollowStatus());
            }
            linkedHashMap.put("friends_type", C955400ayA.LJJJLZIJ(lValueOf));
            linkedHashMap.put("history_display_time", c955810ayp.LJJ);
            linkedHashMap.put("history_channel_id", String.valueOf(c955810ayp.LJJI));
            linkedHashMap.put("history_pk_id", c955810ayp.LJJIII);
            linkedHashMap.put("history_record_position", String.valueOf(c955810ayp.LJIL));
            String str2 = c955810ayp.LJJIFFI;
            if (str2 != null) {
                linkedHashMap.put("history_match_cnt", str2);
            }
            String str3 = c955810ayp.LJJIIJZLJL;
            if (str3 != null) {
                linkedHashMap.put("history_record_rank", str3);
            }
            return linkedHashMap;
        }
        if (!(c955590ayT instanceof C956150azN)) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map<Long, Long> map = C915980Zwa.LJI().LIZ().LJIILJJIL().get(c955590ayT.LJI);
        if (map != null && (l = map.get(Long.valueOf(c955590ayT.LJ.getOwnerUserId()))) != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("is_tag", str);
            linkedHashMap2.put("interest_tag", String.valueOf(jLongValue));
        }
        String str4 = c955590ayT.LJIJJLI;
        if (str4 != null) {
            linkedHashMap2.put("suggest_creator_type", str4);
        }
        return linkedHashMap2;
    }

    public static void LIZLLL(Room room) {
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJJJJZI = 0L;
        C955400ayA.LJJJLIIL = null;
        C955400ayA.LJLZ("active_apply_withdraw", String.valueOf(room.getOwnerUserId()), null, null, 12);
        long id = room.getId();
        long ownerUserId = room.getOwnerUserId();
        long jLJIILIIL = C950220apo.LJIILIIL(room);
        ArrayList arrayList = new ArrayList();
        arrayList.add("cancelApply");
        C915980Zwa.LJII().LJ(new C920580a40(1, id, ownerUserId, jLJIILIIL, null, "cancelApply", arrayList, 48), new InterfaceC950010apT<C920600a42>() { // from class: X.0Zva
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                C766270U4b.LIZLLL(2131841241);
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) throws Throwable {
                if (th != null) {
                    C950790aqj.LJI(C497740JfY.LJII(), th, false);
                    C1304660k3U.LIZ.LIZIZ(803, "cancel multi_cohost application failed", th, null);
                }
            }
        });
    }

    @Override // X.InterfaceC950830aqn
    public final void LIZ(C955590ayT c955590ayT, Room room) {
        RivalExtraInfo rivalExtraInfo;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJJJJZI = 0L;
        C955400ayA.LJJJLIIL = null;
        C955400ayA.LJLZ("active_invite_withdraw", String.valueOf(room.getOwnerUserId()), null, c955590ayT, 4);
        long id = room.getId();
        long ownerUserId = room.getOwnerUserId();
        long jLJIILIIL = C950220apo.LJIILIIL(room);
        ArrayList arrayList = new ArrayList();
        arrayList.add("cancelInvite");
        C920580a40 c920580a40 = new C920580a40(0, id, ownerUserId, jLJIILIIL, null, "cancelInvite", arrayList, 48);
        InterfaceC950010apT<C920600a42> interfaceC950010apT = new InterfaceC950010apT<C920600a42>() { // from class: X.0ZvZ
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                C766270U4b.LIZLLL(2131841236);
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) throws Throwable {
                C950790aqj.LJI(C497740JfY.LJII(), th, false);
                if (th != null) {
                    C1304660k3U.LIZ.LIZIZ(802, "cancel multi_cohost link invitation failed", th, null);
                }
            }
        };
        if (c955590ayT != null && (rivalExtraInfo = c955590ayT.LJIIJ) != null && rivalExtraInfo.showPlayType == 3) {
            C954460awe c954460awe = C949990apR.LIZ.get(Long.valueOf(c920580a40.LIZLLL));
            if (c954460awe != null) {
                c954460awe.LJJIIZ = EnumC950200apm.CANCELING;
                c954460awe.LJJIJIIJIL = false;
            }
            C480460Ism.LIZ().getClass();
            ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).cancelOffliveInvite(c920580a40.LIZLLL, 2).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(c920580a40, interfaceC950010apT, 8), new AfS151S0200000_15(c920580a40, interfaceC950010apT, 9));
            return;
        }
        C915980Zwa.LJII().LLJJLIIIJLLLLLLLZ(c920580a40, interfaceC950010apT, C915260ZvQ.LIZ);
    }

    public static void LJI(Context context, Throwable th, boolean z) throws Throwable {
        if (th != null && context != null && !z) {
            if (th instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                String alert = c501470JlZ.getAlert();
                String prompt = c501470JlZ.getPrompt();
                if (!TextUtils.isEmpty(alert)) {
                    C501540Jlg.LIZ(context, alert, C497740JfY.LJIJI(2131851921));
                    return;
                } else {
                    if (TextUtils.isEmpty(prompt)) {
                        return;
                    }
                    C766270U4b.LJIIIZ(context, prompt);
                    return;
                }
            }
            if (C958370b2x.LIZJ()) {
                C766270U4b.LJFF(2131851936, context);
            }
            if (!InterfaceC960800b6s.LLJL.LIZIZ().booleanValue() || !C958370b2x.LIZJ()) {
            } else {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[PHI: r0 r13
      0x00a2: PHI (r0v40 com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra) = 
      (r0v10 com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra)
      (r0v53 com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra)
     binds: [B:22:0x00a0, B:20:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r13v4 int) = (r13v0 int), (r13v5 int) binds: [B:22:0x00a0, B:20:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6 A[PHI: r13
      0x00a6: PHI (r13v3 int) = (r13v0 int), (r13v4 int) binds: [B:22:0x00a0, B:24:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.bytedance.android.livesdkapi.depend.model.live.Room r15, int r16, java.lang.Throwable r17, X.InterfaceC950820aqm r18) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C950790aqj.LJFF(com.bytedance.android.livesdkapi.depend.model.live.Room, int, java.lang.Throwable, X.0aqm):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(final X.C955590ayT r21, X.C955540ayO r22, boolean r23, java.lang.String r24, final X.InterfaceC950820aqm r25, long r26) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C950790aqj.LJ(X.0ayT, X.0ayO, boolean, java.lang.String, X.0aqm, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(final X.C955590ayT r25, X.C955540ayO r26, boolean r27, java.lang.String r28, final X.InterfaceC950820aqm r29, long r30, long r32) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C950790aqj.LIZJ(X.0ayT, X.0ayO, boolean, java.lang.String, X.0aqm, long, long):void");
    }
}
