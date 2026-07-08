package Y;

import X.AbstractC1585810rMx;
import X.C00YH;
import X.C0U2N;
import X.C0UB1;
import X.C0UBH;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C497740JfY;
import X.C500260Jjc;
import X.C749610Tap;
import X.C762470TvZ;
import X.C762480Tva;
import X.C762490Tvb;
import X.C767850UAd;
import X.C767860UAe;
import X.C767880UAg;
import X.C768050UAx;
import X.C768060UAy;
import X.C781660UlQ;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdk.moderator.AddModeratorFragmentSheetNew;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public class AsS39S0100000_12 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$3(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 2:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 4:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS39S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                KaraokeLibrarySongListFragment karaokeLibrarySongListFragment = (KaraokeLibrarySongListFragment) asS39S0100000_12.l0;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int top = 0;
                View childAt = linearLayoutManager.getChildAt(0);
                if (childAt != null) {
                    top = childAt.getTop();
                }
                KaraokeViewModel karaokeViewModel = karaokeLibrarySongListFragment.LLILZIL;
                if (karaokeViewModel != null) {
                    ConcurrentHashMap<Long, Pair<Integer, Integer>> concurrentHashMap = karaokeViewModel.LLJIJIL.get(Integer.valueOf(karaokeLibrarySongListFragment.LLJILJIL));
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap<>();
                        karaokeViewModel.LLJIJIL.put(Integer.valueOf(karaokeLibrarySongListFragment.LLJILJIL), concurrentHashMap);
                    }
                    concurrentHashMap.put(Long.valueOf(karaokeLibrarySongListFragment.LLILZLL), new Pair<>(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(top)));
                }
            }
        }
    }

    public static final void LJJIIJ$1(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((CommunityFlaggedManageSheetFragment) asS39S0100000_12.l0).LLLII = 1;
        }
    }

    public static final void LJJIIJ$2(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((C767880UAg) asS39S0100000_12.l0).LLILZLL.clearFocus();
            KeyBoardUtil.LIZJ(C497740JfY.LJII(), ((C767880UAg) asS39S0100000_12.l0).LLILZLL);
            if (((C767880UAg) asS39S0100000_12.l0).LJII() && ((C767880UAg) asS39S0100000_12.l0).LLJILJIL.CQ2("search")) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(((C767880UAg) asS39S0100000_12.l0).LLJILJIL), null, null, new C768060UAy((C767880UAg) asS39S0100000_12.l0, null), 3);
            }
        }
    }

    public static final void LJJIIJ$3(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C781660UlQ c781660UlQ = (C781660UlQ) asS39S0100000_12.l0;
            if (c781660UlQ.LJIIJJI) {
                c781660UlQ.LIZ();
                C20441214yg.LIZIZ("livesdk_live_karaoke_song_show:scroll", String.valueOf(((C781660UlQ) asS39S0100000_12.l0).hashCode()));
                ((C781660UlQ) asS39S0100000_12.l0).LIZLLL();
            }
        }
    }

    public static final void LJJIIZI$0(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i, int i2) {
        if (((C767850UAd) asS39S0100000_12.l0).LJIIIZ() && ((C767850UAd) asS39S0100000_12.l0).LJIIZILJ.CQ2("search")) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(((C767850UAd) asS39S0100000_12.l0).LJIIZILJ), null, null, new C768050UAx((C767850UAd) asS39S0100000_12.l0, null), 3);
        }
    }

    public static final void LJJIIZI$1(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i, int i2) {
        int position;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        View childAt;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof SpannedGridLayoutManager)) {
            layoutManager = null;
        }
        if (layoutManager != null && layoutManager.getChildCount() != 0 && (childAt = layoutManager.getChildAt(layoutManager.getChildCount() - 1)) != null) {
            position = layoutManager.getPosition(childAt);
        } else {
            position = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(position);
        sbLIZ.append(", ");
        sbLIZ.append(((C767860UAe) asS39S0100000_12.l0).LIZJ.getItemCount());
        sbLIZ.append(", ");
        C0UBH c0ubh = ((C767860UAe) asS39S0100000_12.l0).LJI;
        String str6 = "";
        if (c0ubh == null || (str = c0ubh.LIZIZ) == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(", ");
        C767860UAe c767860UAe = (C767860UAe) asS39S0100000_12.l0;
        StickerEffectViewModel stickerEffectViewModel = c767860UAe.LJIILLIIL;
        C0UBH c0ubh2 = c767860UAe.LJI;
        if (c0ubh2 == null || (str2 = c0ubh2.LIZIZ) == null) {
            str2 = "";
        }
        sbLIZ.append(stickerEffectViewModel.CQ2(str2));
        C20441214yg.LIZIZ("EffectMonitor#loadmore1", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (((C767860UAe) asS39S0100000_12.l0).LIZJ.getItemCount() - position < 10 && jCurrentTimeMillis - ((C767860UAe) asS39S0100000_12.l0).LJIJJ >= 1000) {
            C767860UAe c767860UAe2 = (C767860UAe) asS39S0100000_12.l0;
            StickerEffectViewModel stickerEffectViewModel2 = c767860UAe2.LJIILLIIL;
            C0UBH c0ubh3 = c767860UAe2.LJI;
            if (c0ubh3 == null || (str3 = c0ubh3.LIZIZ) == null) {
                str3 = "";
            }
            if (C500260Jjc.LJJJI(Boolean.valueOf(stickerEffectViewModel2.CQ2(str3)))) {
                ((C767860UAe) asS39S0100000_12.l0).LJIJJ = jCurrentTimeMillis;
                C767860UAe c767860UAe3 = (C767860UAe) asS39S0100000_12.l0;
                StickerEffectViewModel stickerEffectViewModel3 = c767860UAe3.LJIILLIIL;
                C0UBH c0ubh4 = c767860UAe3.LJI;
                if (c0ubh4 != null && (str5 = c0ubh4.LIZIZ) != null) {
                    str6 = str5;
                }
                stickerEffectViewModel3.SQ2(new C00YH(str6, false));
                return;
            }
            if (((C767860UAe) asS39S0100000_12.l0).LIZJ.getItemCount() > 50) {
                return;
            }
            ((C767860UAe) asS39S0100000_12.l0).LJIJJ = jCurrentTimeMillis;
            C767860UAe c767860UAe4 = (C767860UAe) asS39S0100000_12.l0;
            StickerEffectViewModel stickerEffectViewModel4 = c767860UAe4.LJIILLIIL;
            C0UBH c0ubh5 = c767860UAe4.LJI;
            if (c0ubh5 != null && (str4 = c0ubh5.LIZIZ) != null) {
                str6 = str4;
            }
            stickerEffectViewModel4.SQ2(new C00YH(str6, true));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIZI$2(Y.AsS39S0100000_12 r12, androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS39S0100000_12.LJJIIZI$2(Y.AsS39S0100000_12, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public static final void LJJIIZI$3(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int iFindLastVisibleItemPosition;
        if (((C762490Tvb) asS39S0100000_12.l0).getItemCount() <= 2) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        if (((C762490Tvb) asS39S0100000_12.l0).getItemCount() - iFindLastVisibleItemPosition < 10) {
            C762490Tvb c762490Tvb = (C762490Tvb) asS39S0100000_12.l0;
            BGMPlaylistViewModel bGMPlaylistViewModel = c762490Tvb.LL;
            if (!bGMPlaylistViewModel.LLILZLL && !bGMPlaylistViewModel.LLILZIL) {
                C500260Jjc.LJJJJJ(c762490Tvb.LLILLL, null, new C762470TvZ(c762490Tvb, null), 3);
            }
        }
        if (iFindLastVisibleItemPosition < 10) {
            C762490Tvb c762490Tvb2 = (C762490Tvb) asS39S0100000_12.l0;
            BGMPlaylistViewModel bGMPlaylistViewModel2 = c762490Tvb2.LL;
            if (!bGMPlaylistViewModel2.LLIZ && !bGMPlaylistViewModel2.LLILZ) {
                C500260Jjc.LJJJJJ(c762490Tvb2.LLILLL, null, new C762480Tva(c762490Tvb2, null), 3);
            }
        }
    }

    public static final void LJJIIZI$4(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int iFindLastVisibleItemPosition;
        int itemCount;
        String str;
        String str2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Boolean boolValueOf = null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        boolean z = false;
        if (linearLayoutManager != null) {
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        C0U2N c0u2nUR = ((KaraokeSongListFragment) asS39S0100000_12.l0).UR();
        if (c0u2nUR != null) {
            itemCount = c0u2nUR.getItemCount();
        } else {
            itemCount = 0;
        }
        if (itemCount - iFindLastVisibleItemPosition < 10) {
            KaraokeSongListFragment karaokeSongListFragment = (KaraokeSongListFragment) asS39S0100000_12.l0;
            KaraokeViewModel karaokeViewModel = karaokeSongListFragment.LLILZIL;
            if (karaokeViewModel != null) {
                long j = karaokeSongListFragment.LLILZLL;
                if (j != -997 ? !(j != -996 ? !karaokeViewModel.LL.LJIILIIL(j) || karaokeViewModel.LLJJIII.contains(Long.valueOf(j)) : (str = karaokeViewModel.LLJJ.get(2)) == null || !karaokeViewModel.LL.LJIILJJIL(str) || karaokeViewModel.LLJJIJI.contains(karaokeViewModel.LLJJ.get(2))) : !((str2 = karaokeViewModel.LLJJ.get(1)) == null || !karaokeViewModel.LL.LJIILJJIL(str2) || karaokeViewModel.LLJJIJI.contains(karaokeViewModel.LLJJ.get(1)))) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                ((KaraokeSongListFragment) asS39S0100000_12.l0).PR();
            }
        }
    }

    public static final void LJJIIZI$5(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i, int i2) {
        C781660UlQ c781660UlQ = (C781660UlQ) asS39S0100000_12.l0;
        c781660UlQ.LJIIJJI = true;
        c781660UlQ.LJIIIZ = false;
    }

    public static final void LJJIIZI$6(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int iFindLastVisibleItemPosition;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iFindLastVisibleItemPosition);
        sbLIZ.append(", ");
        sbLIZ.append(((C0UB1) asS39S0100000_12.l0).LIZIZ.getItemCount());
        sbLIZ.append(", ");
        C0UBH c0ubh = ((C0UB1) asS39S0100000_12.l0).LIZLLL;
        String str6 = "";
        if (c0ubh == null || (str = c0ubh.LIZIZ) == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(", ");
        C0UB1 c0ub1 = (C0UB1) asS39S0100000_12.l0;
        StickerEffectViewModel stickerEffectViewModel = c0ub1.LJIIL;
        C0UBH c0ubh2 = c0ub1.LIZLLL;
        if (c0ubh2 == null || (str2 = c0ubh2.LIZIZ) == null) {
            str2 = "";
        }
        sbLIZ.append(stickerEffectViewModel.CQ2(str2));
        C20441214yg.LIZIZ("EffectMonitor#loadmore1", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (((C0UB1) asS39S0100000_12.l0).LIZIZ.getItemCount() - iFindLastVisibleItemPosition < 10 && jCurrentTimeMillis - ((C0UB1) asS39S0100000_12.l0).LJIILJJIL >= 1000) {
            C0UB1 c0ub12 = (C0UB1) asS39S0100000_12.l0;
            StickerEffectViewModel stickerEffectViewModel2 = c0ub12.LJIIL;
            C0UBH c0ubh3 = c0ub12.LIZLLL;
            if (c0ubh3 == null || (str3 = c0ubh3.LIZIZ) == null) {
                str3 = "";
            }
            if (C500260Jjc.LJJJI(Boolean.valueOf(stickerEffectViewModel2.CQ2(str3)))) {
                ((C0UB1) asS39S0100000_12.l0).LJIILJJIL = jCurrentTimeMillis;
                C0UB1 c0ub13 = (C0UB1) asS39S0100000_12.l0;
                StickerEffectViewModel stickerEffectViewModel3 = c0ub13.LJIIL;
                C0UBH c0ubh4 = c0ub13.LIZLLL;
                if (c0ubh4 != null && (str5 = c0ubh4.LIZIZ) != null) {
                    str6 = str5;
                }
                stickerEffectViewModel3.SQ2(new C00YH(str6, false));
                return;
            }
            if (((C0UB1) asS39S0100000_12.l0).LIZIZ.getItemCount() > 50) {
                return;
            }
            ((C0UB1) asS39S0100000_12.l0).LJIILJJIL = jCurrentTimeMillis;
            C0UB1 c0ub14 = (C0UB1) asS39S0100000_12.l0;
            StickerEffectViewModel stickerEffectViewModel4 = c0ub14.LJIIL;
            C0UBH c0ubh5 = c0ub14.LIZLLL;
            if (c0ubh5 != null && (str4 = c0ubh5.LIZIZ) != null) {
                str6 = str4;
            }
            stickerEffectViewModel4.SQ2(new C00YH(str6, true));
        }
    }

    public static final void LJJIIZI$7(AsS39S0100000_12 asS39S0100000_12, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int iFindLastVisibleItemPosition;
        if (((AddModeratorFragmentSheetNew) asS39S0100000_12.l0).LLLIIL) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Integer numValueOf = null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        int itemCount = 0;
        if (linearLayoutManager != null) {
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iFindLastVisibleItemPosition);
        sbLIZ.append(", ");
        C749610Tap c749610Tap = ((AddModeratorFragmentSheetNew) asS39S0100000_12.l0).LLLFZ;
        if (c749610Tap != null) {
            numValueOf = Integer.valueOf(c749610Tap.getItemCount());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('}');
        C20441214yg.LIZIZ("EffectMonitor#loadmore1", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C749610Tap c749610Tap2 = ((AddModeratorFragmentSheetNew) asS39S0100000_12.l0).LLLFZ;
        if (c749610Tap2 != null) {
            itemCount = c749610Tap2.getItemCount();
        }
        if (itemCount - iFindLastVisibleItemPosition < 10) {
            AddModeratorFragmentSheetNew addModeratorFragmentSheetNew = (AddModeratorFragmentSheetNew) asS39S0100000_12.l0;
            if (jCurrentTimeMillis - addModeratorFragmentSheetNew.LLLIIII >= 1000 && addModeratorFragmentSheetNew.LLLFFI) {
                addModeratorFragmentSheetNew.LLLIIII = jCurrentTimeMillis;
                AddModeratorFragmentSheetNew.uS(addModeratorFragmentSheetNew, addModeratorFragmentSheetNew.LLLII);
            }
        }
    }
}
