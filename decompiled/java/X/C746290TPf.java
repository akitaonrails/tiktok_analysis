package X;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.lyric.CutMusicLyricLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746290TPf extends FrameLayout {
    public RecyclerView LL;
    public C746310TPh LLILLJJLI;
    public CutMusicLyricLayoutManager LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Integer LLILZLL;
    public int LLIZ;
    public C0TKM LLIZLLLIL;
    public final C11NJ LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    private final ValueAnimator getCutLyricViewAlphaInAnimator() {
        return (ValueAnimator) this.LLJIJIL.getValue();
    }

    private final ValueAnimator getCutLyricViewAlphaOutAnimator() {
        return (ValueAnimator) this.LLJILJIL.getValue();
    }

    public final Interpolator getAnimInterpolator() {
        return (Interpolator) this.LLJI.getValue();
    }

    public final void LIZIZ() {
        C746310TPh c746310TPh;
        ArrayList<C08E2> arrayList;
        if (getVisibility() == 0 || (c746310TPh = this.LLILLJJLI) == null || (arrayList = c746310TPh.LL) == null || arrayList.isEmpty() || this.LLILZ) {
            return;
        }
        getCutLyricViewAlphaInAnimator().start();
    }

    public final void LIZJ() {
        if (getVisibility() == 0 && !this.LLILZIL) {
            getCutLyricViewAlphaOutAnimator().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJ.dispose();
    }

    public C746290TPf(C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLJ = new C11NJ();
        this.LLJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(397));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 868));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 869));
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d31, this, true);
        this.LL = (RecyclerView) findViewById(R.id.tq0);
        this.LLILLJJLI = new C746310TPh();
        CutMusicLyricLayoutManager cutMusicLyricLayoutManager = new CutMusicLyricLayoutManager(getContext());
        this.LLILLL = cutMusicLyricLayoutManager;
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(cutMusicLyricLayoutManager);
            recyclerView.setAdapter(this.LLILLJJLI);
        }
    }

    public final void setData(List<C08E2> list) {
        C746310TPh c746310TPh = this.LLILLJJLI;
        if (c746310TPh != null) {
            c746310TPh.LL.clear();
            if (!list.isEmpty()) {
                c746310TPh.LL.addAll(list);
            }
            c746310TPh.notifyDataSetChanged();
        }
        Integer num = this.LLILZLL;
        if (num != null) {
            LIZ(num.intValue(), false);
        }
    }

    public final void setInitStartTime(int i) {
        this.LLILZLL = Integer.valueOf(i);
    }

    public final void setListener(C0TKM c0tkm) {
        this.LLIZLLLIL = c0tkm;
    }

    public final void LIZ(int i, boolean z) {
        int iIntValue;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C746300TPg c746300TPg;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2;
        C746320TPi c746320TPi;
        C746320TPi c746320TPi2;
        C746310TPh c746310TPh = this.LLILLJJLI;
        if (c746310TPh == null) {
            return;
        }
        C746300TPg c746300TPg2 = null;
        ArrayList<C08E2> arrayList = c746310TPh.LL;
        if (arrayList != null) {
            int i2 = 0;
            for (C08E2 c08e2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C08E2 c08e22 = c08e2;
                    long j = c08e22.LIZIZ;
                    long j2 = c08e22.LIZJ;
                    long j3 = i;
                    if (j <= j3 && j3 < j2) {
                        Integer numValueOf = Integer.valueOf(i2);
                        if (numValueOf != null && (iIntValue = numValueOf.intValue()) >= 0 && iIntValue < c746310TPh.getItemCount() && iIntValue != c746310TPh.LLILLJJLI) {
                            if (z) {
                                CutMusicLyricLayoutManager cutMusicLyricLayoutManager = this.LLILLL;
                                if (cutMusicLyricLayoutManager != null) {
                                    cutMusicLyricLayoutManager.smoothScrollToPosition(this.LL, new C21673919s1(), iIntValue);
                                }
                            } else {
                                CutMusicLyricLayoutManager cutMusicLyricLayoutManager2 = this.LLILLL;
                                if (cutMusicLyricLayoutManager2 != null) {
                                    cutMusicLyricLayoutManager2.scrollToPositionWithOffset(iIntValue, this.LLIZ);
                                }
                            }
                            int i4 = c746310TPh.LLILLJJLI;
                            if (iIntValue != i4) {
                                c746310TPh.LLILLJJLI = iIntValue;
                                RecyclerView recyclerView = c746310TPh.LLILLL;
                                if (recyclerView != null) {
                                    viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i4);
                                } else {
                                    viewHolderFindViewHolderForAdapterPosition = null;
                                }
                                if (viewHolderFindViewHolderForAdapterPosition instanceof C746300TPg) {
                                    c746300TPg = (C746300TPg) viewHolderFindViewHolderForAdapterPosition;
                                } else {
                                    c746300TPg = null;
                                }
                                RecyclerView recyclerView2 = c746310TPh.LLILLL;
                                if (recyclerView2 != null) {
                                    viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(iIntValue);
                                } else {
                                    viewHolderFindViewHolderForAdapterPosition2 = null;
                                }
                                if (viewHolderFindViewHolderForAdapterPosition2 instanceof C746300TPg) {
                                    c746300TPg2 = (C746300TPg) viewHolderFindViewHolderForAdapterPosition2;
                                }
                                if (c746300TPg != null && (c746320TPi2 = c746300TPg.LL) != null) {
                                    c746320TPi2.LIZIZ();
                                }
                                if (c746300TPg2 != null && (c746320TPi = c746300TPg2.LL) != null) {
                                    c746320TPi.LIZ();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
