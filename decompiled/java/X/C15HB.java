package X;

import Y.AsS56S0100000_31;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.StickerMusicWidget;
import com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15HB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15HB extends C15HC {
    public C15H0 LLILZ;
    public final Fragment LLILZIL;
    public C15GM LLILZLL;
    public int LLIZ;
    public final int LLIZLLLIL;
    public RecyclerView LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public int LLJILLL;
    public final int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final boolean LLJJIJI;
    public InterfaceC20494515Hj<C15HP> LLJJIJIIJIL;
    public C20493215Gw LLJJIJIL;

    @Override // X.AbstractC683590Qrd, X.AbstractC438050HFr
    public final int getBasicItemCount() {
        return this.LLJIJIL ? this.LLIZ + 1 : this.LLIZ;
    }

    @Override // X.C15HC
    public final ListItemWidget LLLFZ(int i) {
        String str;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType != 4) {
                    if (itemViewType != 5) {
                        return null;
                    }
                    ChallengeMusicWidget challengeMusicWidget = new ChallengeMusicWidget();
                    challengeMusicWidget.LLJIJIL = this.LLILZ;
                    challengeMusicWidget.LLJ = this.LLILZIL;
                    challengeMusicWidget.LLJJIII = this.LLJJIJIIJIL;
                    challengeMusicWidget.LLJJIJI = this.LLILZLL;
                    challengeMusicWidget.LLJILJILJ = -2;
                    challengeMusicWidget.LLJJ = this.LLJILJIL;
                    challengeMusicWidget.LLJJI = this.LLJILJILJ;
                    return challengeMusicWidget;
                }
                StickerMusicWidget stickerMusicWidget = new StickerMusicWidget();
                stickerMusicWidget.LLJI = this.LLILZ;
                stickerMusicWidget.LLJJ = this.LLJJIJIIJIL;
                stickerMusicWidget.LLJ = this.LLILZIL;
                stickerMusicWidget.LLJJI = this.LLILZLL;
                stickerMusicWidget.LLJILJILJ = -2;
                stickerMusicWidget.LLJJIII = this.LLJILJIL;
                stickerMusicWidget.LLJJIJI = this.LLJILJILJ;
                return stickerMusicWidget;
            }
            ViewPager2MusicBoardWidget viewPager2MusicBoardWidget = new ViewPager2MusicBoardWidget(this.LLILZIL, this.LLJJ);
            viewPager2MusicBoardWidget.LLJI = this.LLILZ;
            viewPager2MusicBoardWidget.LLJIJIL = this.LLJJIJIL;
            viewPager2MusicBoardWidget.LLJJIJIL = this.LLJJIJIIJIL;
            if (this.LLJIJIL) {
                i--;
            }
            viewPager2MusicBoardWidget.LLJILLL = i;
            viewPager2MusicBoardWidget.LLJJ = i + 10086;
            viewPager2MusicBoardWidget.LLJJJJJIL = this.LLJILJIL;
            viewPager2MusicBoardWidget.LLJJJJLIIL = this.LLJILJILJ;
            viewPager2MusicBoardWidget.LLJJL = this.LLJJIII;
            return viewPager2MusicBoardWidget;
        }
        MusicClassWidget musicClassWidget = new MusicClassWidget(this.LLJJ, this.LLILZIL, this.LLJJIJI);
        if (this.LLJIJIL) {
            i--;
        }
        musicClassWidget.LLJ = i;
        musicClassWidget.LLJI = i + 10086;
        musicClassWidget.LLJILLL = this.LLJILJIL;
        musicClassWidget.LLJJ = this.LLJILJILJ;
        musicClassWidget.LLJJIII = this.LLJJIJIL;
        if (this.LLJJIII) {
            str = "more_song";
        } else {
            str = "recommend";
        }
        musicClassWidget.LLJJI = str;
        return musicClassWidget;
    }

    public final void LLLI(boolean z) {
        LifecycleObserver lifecycleObserver;
        int i;
        int measuredHeight;
        RecyclerView.LayoutManager layoutManager = this.LLJ.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0) {
            for (int i2 = iFindFirstVisibleItemPosition; i2 <= iFindLastVisibleItemPosition; i2++) {
                View childAt = this.LLJ.getChildAt(i2 - iFindFirstVisibleItemPosition);
                if (childAt == null) {
                    return;
                }
                if (this.mShowFooter && i2 == getBasicItemCount()) {
                    return;
                }
                if (i2 < this.LLILLL.size()) {
                    lifecycleObserver = (ListItemWidget) ListProtector.get(this.LLILLL, i2);
                } else {
                    lifecycleObserver = null;
                }
                if (lifecycleObserver instanceof C15HU) {
                    if (z) {
                        ((C15HU) lifecycleObserver).LIZJ();
                    }
                    if (childAt.getTop() > 0) {
                        i = 0;
                    } else {
                        i = -childAt.getTop();
                    }
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int bottom = childAt.getBottom();
                    int i3 = this.LLJI;
                    if (bottom > i3) {
                        measuredHeight = (measuredHeight2 + i3) - childAt.getBottom();
                    } else {
                        measuredHeight = childAt.getMeasuredHeight();
                    }
                    ((C15HU) lifecycleObserver).LJIIIIZZ(i, measuredHeight);
                }
            }
        }
    }

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        if (C1911780zqi.LIZJ(this.LLJJIJI)) {
            if (i == 0 && this.LLJJI) {
                return 1;
            }
            return 2;
        }
        if (this.LLJIJIL) {
            if (i == 0) {
                return this.LLJILLL;
            }
            if (i == 2 && this.LLJJI) {
                return 1;
            }
            return 2;
        }
        if (i == 1 && this.LLJJI) {
            return 1;
        }
        return 2;
    }

    @Override // X.C15HC, X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLJ = recyclerView;
        recyclerView.addOnScrollListener(new AsS56S0100000_31(this, 10));
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    return new C15HI(this.LLIZLLLIL, LLLII(i, C786410Ut5.ne(viewGroup.getContext()), viewGroup), ((Boolean) this.LLILLJJLI.get("key_show_lyric_tag")).booleanValue());
                }
                final View viewLLLII = LLLII(i, C786410Ut5.ne(viewGroup.getContext()), viewGroup);
                final int i2 = this.LLIZLLLIL;
                return new C15HN(i2, viewLLLII) { // from class: X.15HR
                };
            }
            final View viewLLLII2 = LLLII(i, C786410Ut5.ne(viewGroup.getContext()), viewGroup);
            final int i3 = this.LLIZLLLIL;
            C15HL c15hl = new C15HL(i3, viewLLLII2) { // from class: X.15HS
            };
            c15hl.LLJI = ((Boolean) this.LLILLJJLI.get("mvtheme_music_type")).booleanValue();
            c15hl.LLJIJIL = ((Boolean) this.LLILLJJLI.get("is_photo_mv_type")).booleanValue();
            return c15hl;
        }
        return new C15H5(LLLII(i, C786410Ut5.ne(viewGroup.getContext()), viewGroup), this.LLJJIJI);
    }

    public static final View LLLII(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (i == 1) {
            return C786410Ut5.Td(layoutInflater, R.layout.d6t, viewGroup, false);
        }
        if (i != 5 && i != 4) {
            return C786410Ut5.Td(layoutInflater, R.layout.d6s, viewGroup, false);
        }
        return C786410Ut5.Td(layoutInflater, R.layout.d2_, viewGroup, false);
    }

    public C15HB(Fragment fragment, WidgetManager widgetManager, DataCenter dataCenter, C15H0 c15h0, C15GM c15gm, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i, int i2, boolean z) {
        super(widgetManager, dataCenter);
        this.LLILZIL = fragment;
        this.LLILZ = c15h0;
        this.LLILZLL = c15gm;
        this.LLJJIJIIJIL = interfaceC20494515Hj;
        this.LLIZLLLIL = i;
        this.LLJJ = i2;
        this.LLJJIJI = z;
    }
}
