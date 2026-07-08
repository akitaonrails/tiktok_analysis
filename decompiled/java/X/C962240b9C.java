package X;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0b9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962240b9C extends AbstractC962220b9A<C955590ayT> {
    public static final C962240b9C LIZJ = new C962240b9C();

    @Override // X.AbstractC962220b9A
    public final void LIZLLL(C955590ayT c955590ayT) {
        long jIg0;
        Long lValueOf;
        String str;
        String str2;
        if ((c955590ayT instanceof C957700b1s) && ((C957700b1s) c955590ayT).LJJ == EnumC959280b4Q.FRIENDS_RANKING) {
            IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
            if (iRankService != null) {
                jIg0 = iRankService.Ig0(RankTypeV2.LJJIIZ.type);
            } else {
                jIg0 = -1;
            }
            Room roomLIZJ = C950220apo.LIZJ();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_list_anchor_click");
            c474500IjALIZ.LJIL();
            Pair[] pairArr = new Pair[9];
            Long lValueOf2 = null;
            if (roomLIZJ != null) {
                lValueOf = Long.valueOf(roomLIZJ.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            pairArr[0] = new Pair("anchor_id", String.valueOf(lValueOf));
            if (roomLIZJ != null) {
                lValueOf2 = Long.valueOf(roomLIZJ.getId());
            }
            pairArr[1] = new Pair("room_id", String.valueOf(lValueOf2));
            if (C950220apo.LJI()) {
                str = "anchor";
            } else {
                str = "user";
            }
            pairArr[2] = new Pair("user_type", str);
            String str3 = "1";
            if (jIg0 < 0) {
                str2 = "-1";
            } else if (1 <= jIg0 && jIg0 < 100) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[3] = new Pair("anchor_rank", str2);
            pairArr[4] = new Pair("rank_type", "friends_ranking");
            pairArr[5] = new Pair("page_type", "cohost_search");
            pairArr[6] = new Pair("click_object_id", String.valueOf(c955590ayT.LJ.getOwnerUserId()));
            RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
            if (rivalExtraInfo == null || (rivalExtraInfo.showPlayType != 1 && rivalExtraInfo.showPlayType != 0)) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[7] = new Pair("is_live", str3);
            pairArr[8] = new Pair("rank", String.valueOf(((C957700b1s) c955590ayT).LJJI));
            c474500IjALIZ.LJJIIZI(C2097608Jq.LJIIIIZZ(pairArr));
            c474500IjALIZ.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0232 A[PHI: r1
      0x0232: PHI (r1v18 java.util.List<com.bytedance.android.livesdk.chatroom.model.interact.TagV2$SecondDegreeRelationContent$UserInfo>) = 
      (r1v17 java.util.List<com.bytedance.android.livesdk.chatroom.model.interact.TagV2$SecondDegreeRelationContent$UserInfo>)
      (r1v26 java.util.List<com.bytedance.android.livesdk.chatroom.model.interact.TagV2$SecondDegreeRelationContent$UserInfo>)
      (r1v26 java.util.List<com.bytedance.android.livesdk.chatroom.model.interact.TagV2$SecondDegreeRelationContent$UserInfo>)
     binds: [B:174:0x022e, B:131:0x01ad, B:133:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0411  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // X.AbstractC962220b9A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC962270b9F r22, X.C955590ayT r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C962240b9C.LIZIZ(X.0b9F, X.0ayT, boolean):void");
    }
}
