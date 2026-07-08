package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945830aij extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ CoHostOperationCell LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C500400Jjq LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C945830aij(boolean z, CoHostOperationCell coHostOperationCell, boolean z2, View view, int i, C500400Jjq c500400Jjq) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = coHostOperationCell;
        this.LLILLL = z2;
        this.LLILZ = view;
        this.LLILZIL = i;
        this.LLILZLL = c500400Jjq;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C955540ayO c955540ayOLJIJJ;
        List listLIZ;
        MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus;
        if (this.LL) {
            CoHostOperationCell coHostOperationCell = this.LLILLJJLI;
            if (Intrinsics.LJFF(coHostOperationCell.LL.LJIIIIZZ.mClickUserPosition, "music_spotlight")) {
                c955540ayOLJIJJ = C955540ayO.LJJJJZI;
            } else {
                String str = coHostOperationCell.LLJJJ;
                c955540ayOLJIJJ = Intrinsics.LJFF(str, EnumC955630ayX.HOURLY_RANK.getRankName()) ? C955540ayO.LJIILLIIL : Intrinsics.LJFF(str, EnumC955630ayX.WEEKLY_RANK.getRankName()) ? C955540ayO.LJIILL : Intrinsics.LJFF(str, EnumC955630ayX.WEEKLY_ROOKIE_RANK.getRankName()) ? C955540ayO.LJIJ : Intrinsics.LJFF(str, "mutual_follow") ? C955540ayO.LIZJ : Intrinsics.LJFF(str, "recommend") ? C955540ayO.LIZLLL : Intrinsics.LJFF(str, EnumC955630ayX.DAILY_RANK.getRankName()) ? C955540ayO.LJIJI : Intrinsics.LJFF(str, EnumC955630ayX.DAILY_RANK_HALL_OF_FAME.getRankName()) ? C955540ayO.LJIJJ : Intrinsics.LJFF(str, RankTypeV2.LJIIZILJ.rankName) ? C955540ayO.LJJ : Intrinsics.LJFF(str, RankTypeV2.LJIJ.rankName) ? C955540ayO.LJJI : Intrinsics.LJFF(str, RankTypeV2.LJIJI.rankName) ? C955540ayO.LJJIFFI : Intrinsics.LJFF(str, RankTypeV2.LJIJJ.rankName) ? C955540ayO.LJJII : Intrinsics.LJFF(str, RankTypeV2.LJIJJLI.rankName) ? C955540ayO.LJJIIJZLJL : Intrinsics.LJFF(str, RankTypeV2.LJJIJ.rankName) ? C955540ayO.LJJIJ : Intrinsics.LJFF(str, RankTypeV2.LJIL.rankName) ? C955540ayO.LJJIJIIJI : C955540ayO.LIZIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inviteType is ");
            sbLIZ.append(c955540ayOLJIJJ.LIZ);
            sbLIZ.append(". isQuickBattle=");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ("CoHostOperationCell", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLILLL) {
                c955540ayOLJIJJ = this.LLILLJJLI.LJIJJ();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("inviteType eventually sent to co-host is ");
            sbLIZ2.append(c955540ayOLJIJJ.LIZ);
            C20441214yg.LIZIZ("CoHostOperationCell", C2188811AlT.LIZIZ(sbLIZ2));
            IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            CoHostOperationCell coHostOperationCell2 = this.LLILLJJLI;
            C500370Jjn c500370Jjn = coHostOperationCell2.LLJJLIIIJLLLLLLLZ;
            if (iInteractService.dD(coHostOperationCell2.LLJJIJIIJIL, !((c500370Jjn == null || (linkmicStatus = c500370Jjn.LIZIZ) == null || linkmicStatus.playType != 0) ? false : true))) {
                C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ("rank"));
                Map<String, String> map = this.LLILLJJLI.LLJJJJJIL;
                Map<String, String> map2 = map != null && map.containsKey("rank_period") ? this.LLILLJJLI.LLJJJJJIL : Intrinsics.LJFF(this.LLILLJJLI.LLJJJ, "league_campaign_rank") ? this.LLILLJJLI.LL.LJIIIIZZ.trackExtra : null;
                C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                String strValueOf = String.valueOf(this.LLILLJJLI.LL.LJII);
                User user = this.LLILLJJLI.LLJILJILJ;
                if (user == null) {
                    user = null;
                }
                String secUid = user.getSecUid();
                String strValueOf2 = String.valueOf(this.LLILLJJLI.LLJJIJIL);
                User user2 = this.LLILLJJLI.LLJILJILJ;
                if (user2 == null) {
                    user2 = null;
                }
                C0KVU.LIZ(user2);
                User user3 = this.LLILLJJLI.LLJILJILJ;
                ImageModel avatarThumb = (user3 != null ? user3 : null).getAvatarThumb();
                if (avatarThumb == null || (listLIZ = C842240X2g.LIZ(avatarThumb)) == null) {
                    listLIZ = C13BV.INSTANCE;
                }
                c784440UpuLIZ.LIZIZ(new C944610agl(new C950360aq2(strValueOf, secUid, strValueOf2, c955540ayOLJIJJ, listLIZ, null, map2, false, "profile_card", null, this.LLILZIL, null, null, null, null, this.LLILZLL, 125696)));
                this.LLILZ.setClickable(false);
                this.LLILLJJLI.LL.LIZLLL.dismiss();
                CoHostOperationCell coHostOperationCell3 = this.LLILLJJLI;
                C973660bRc.LIZ.LJL(coHostOperationCell3.LJIJI(), false, coHostOperationCell3.LJIJJ());
                CoHostOperationCell coHostOperationCell4 = this.LLILLJJLI;
                coHostOperationCell4.getClass();
                List<C954460awe> listSingletonList = Collections.singletonList(new C954460awe(C950220apo.LJ()));
                List<C954460awe> listSingletonList2 = Collections.singletonList(new C954460awe(coHostOperationCell4.LL.LJII));
                C925640aCA.LJ(C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
                C973660bRc.LIZ.LJLJLLL(coHostOperationCell4.LL.LJII, listSingletonList, listSingletonList2, false, false, "1v1", null, c955540ayOLJIJJ);
            } else {
                this.LLILZ.setClickable(false);
                this.LLILLJJLI.LL.LIZLLL.dismiss();
            }
        }
        return Unit.LIZ;
    }
}
