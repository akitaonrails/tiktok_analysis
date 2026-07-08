package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12W6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12W6 extends AbstractC21673619ry<RecyclerView.ViewHolder> implements C12WD {
    public InterfaceC19767112Vp LLILLL;
    public final VideoEditViewModel LLILZIL;
    public final CutMultiVideoViewModel LLILZLL;
    public C386930FFb LLIZ;
    public List<C12W7> LL = new ArrayList();
    public int LLILLJJLI = 0;
    public boolean LLILZ = true;
    public boolean LLIZLLLIL = true;

    public final long LLLIL() {
        long j = 0;
        if (C580130Mp9.LIZ(this.LL)) {
            return 0L;
        }
        for (C12W7 c12w7 : this.LL) {
            if (c12w7 != null) {
                VideoSegment videoSegment = c12w7.LIZIZ;
                if (!videoSegment.isDeleted) {
                    j += videoSegment.duration;
                }
            }
        }
        return j;
    }

    public final ArrayList<String> LLLILZ() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (C580130Mp9.LIZ(this.LL)) {
            return arrayList;
        }
        for (C12W7 c12w7 : (ArrayList) this.LL) {
            if (c12w7 != null) {
                VideoSegment videoSegment = c12w7.LIZIZ;
                if (!videoSegment.isDeleted) {
                    if (C2471909mP.LJJII(videoSegment.LJFF(false), false, null)) {
                        arrayList.add(c12w7.LIZIZ.thumbnail);
                    } else {
                        arrayList.add(c12w7.LIZIZ.LJFF(false));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        List<C12W7> list = this.LL;
        if (list == null) {
            return 0;
        }
        boolean z = this.LLIZLLLIL;
        int size = list.size();
        return z ? size + 1 : size;
    }

    @Override // X.C12WD
    public final ViewPropertyAnimator LLJL(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f);
    }

    @Override // X.C12WD
    public final void LLJLILLLLZIIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C19765612Va) {
            C19765612Va c19765612Va = (C19765612Va) viewHolder;
            if (c19765612Va.LLILLL != null) {
                C786410Ut5.Sb(c19765612Va.LLILLL, 1.25f);
                C786410Ut5.tc(c19765612Va.LLILLL, 1.25f);
            }
            C574920Mgk c574920Mgk = new C574920Mgk(0, c19765612Va.LLILLJJLI.videoIndex, -1);
            c574920Mgk.LJ = viewHolder.getAdapterPosition();
            this.LLILZLL.LLJIJIL.setValue(c574920Mgk);
        }
    }

    public final void LLLFZ(List<VideoSegment> list) {
        if (C580130Mp9.LIZ(list)) {
            return;
        }
        if (this.LL == null) {
            this.LL = new ArrayList();
        }
        for (VideoSegment videoSegment : list) {
            this.LL.add(new C12W7(videoSegment.videoIndex, videoSegment));
        }
        notifyDataSetChanged();
    }

    public void LLLI(View view) {
        InterfaceC19767112Vp interfaceC19767112Vp = this.LLILLL;
        if (interfaceC19767112Vp != null) {
            interfaceC19767112Vp.LIZ(10003, null);
        }
    }

    public final void LLLII(VideoSegment videoSegment) {
        int i = 0;
        while (true) {
            if (i >= ((ArrayList) this.LL).size()) {
                break;
            }
            if (((C12W7) ListProtector.get(this.LL, i)).LIZIZ.LJFF(true).equals(videoSegment.LJFF(true))) {
                ListProtector.remove(this.LL, i);
                break;
            }
            i++;
        }
        notifyDataSetChanged();
    }

    public C12W7 LLLIILIL(int i) {
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C12W7) ListProtector.get(this.LL, i);
    }

    public final void LLLJ(VideoSegment videoSegment) {
        for (int i = 0; i < ((ArrayList) this.LL).size(); i++) {
            if (((C12W7) ListProtector.get(this.LL, i)).LIZIZ.LJFF(true).equals(videoSegment.LJFF(true))) {
                ((C12W7) ListProtector.get(this.LL, i)).LIZIZ = videoSegment;
                notifyItemChanged(i);
                return;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public long getItemId(int i) {
        if (getItemViewType(i) == 10003) {
            return 10003L;
        }
        return ((C12W7) ListProtector.get(this.LL, i)).LIZ;
    }

    @Override // X.AbstractC21673619ry
    public int getItemViewType(int i) {
        if (i < this.LL.size()) {
            return 10002;
        }
        return 10003;
    }

    public final void setData(List<VideoSegment> list) {
        this.LL.clear();
        for (VideoSegment videoSegment : list) {
            this.LL.add(new C12W7(videoSegment.videoIndex, videoSegment));
        }
    }

    public void LJLZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < ((ArrayList) this.LL).size() && adapterPosition2 < ((ArrayList) this.LL).size()) {
            int i = ((C19765612Va) viewHolder).LLILLJJLI.videoIndex;
            int i2 = ((C19765612Va) viewHolder2).LLILLJJLI.videoIndex;
            ListProtector.add(this.LL, adapterPosition2, ListProtector.remove(this.LL, adapterPosition));
            LLLILZLLLI(i, i2);
            notifyItemMoved(adapterPosition, adapterPosition2);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LLILZLL;
            cutMultiVideoViewModel.LLJIJIL.setValue(new C574920Mgk(1, i, i2));
        }
    }

    @Override // X.C12WD
    public final void LLJILJIL(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (viewHolder instanceof C19765612Va) {
            C19765612Va c19765612Va = (C19765612Va) viewHolder;
            if (c19765612Va.LLILLL != null) {
                C786410Ut5.tc(c19765612Va.LLILLL, 1.0f);
                C786410Ut5.Sb(c19765612Va.LLILLL, 1.0f);
            }
            C574920Mgk c574920Mgk = new C574920Mgk(2, -1, c19765612Va.LLILLJJLI.videoIndex);
            c574920Mgk.LIZLLL = z;
            c574920Mgk.LJFF = viewHolder.getAdapterPosition();
            this.LLILZLL.LLJIJIL.setValue(c574920Mgk);
        }
    }

    public int LLLIIIIL(RecyclerView recyclerView, int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C0WIY<Integer, Integer> c0wiyLIZ = C665750Q9l.LIZ(recyclerView);
        if (i >= c0wiyLIZ.LIZ.intValue() && i <= c0wiyLIZ.LIZIZ.intValue() && i < getItemCount() && i >= 0 && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null) {
            int[] iArr = new int[2];
            viewHolderFindViewHolderForAdapterPosition.itemView.getLocationOnScreen(iArr);
            return iArr[0] + C366700EZg.LIZ(23.5d);
        }
        return -1;
    }

    public final void LLLILZLLLI(int i, int i2) {
        ListProtector.add(this.LLILZIL.zQ2(), i2, ListProtector.remove(this.LLILZIL.zQ2(), i));
        Iterator<VideoSegment> it2 = this.LLILZIL.zQ2().iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            it2.next().videoIndex = i3;
            i3++;
        }
    }

    @Override // X.AbstractC21673619ry
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C19765612Va) {
            C19765612Va c19765612Va = (C19765612Va) viewHolder;
            c19765612Va.I5(LLLIILIL(i), c19765612Va);
        } else {
            if (!(viewHolder instanceof C420990Gf3)) {
                return;
            }
            C420990Gf3 c420990Gf3 = (C420990Gf3) viewHolder;
            C786410Ut5.I7(new C12Y5(c420990Gf3, 12), c420990Gf3.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c19765612Va;
        if (i == 10003) {
            c19765612Va = new C420990Gf3(this, viewGroup);
        } else {
            c19765612Va = new C19765612Va(this, viewGroup);
        }
        try {
            View view = c19765612Va.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19765612Va.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19765612Va.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c19765612Va.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19765612Va.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19765612Va.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c19765612Va.getClass().getName();
        return c19765612Va;
    }

    public C12W6(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        this.LLILZIL = videoEditViewModel;
        this.LLILZLL = cutMultiVideoViewModel;
        setData(list);
        setHasStableIds(true);
    }
}
