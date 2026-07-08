package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.15HH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C15HH extends PagerAdapter {
    public List<MusicModel> LLILLJJLI = null;
    public final LinkedList<C15HM> LLILLL = new LinkedList<>();
    public final /* synthetic */ C15HI LLILZ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<MusicModel> list = this.LLILLJJLI;
        if (list == null) {
            return 0;
        }
        return (this.LLILLJJLI.size() % 3 != 0 ? 1 : 0) + (list.size() / 3);
    }

    public C15HH(C15HI c15hi) {
        this.LLILZ = c15hi;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        boolean z;
        C15HM c15hmPoll = this.LLILLL.poll();
        if (c15hmPoll == null) {
            Context context = viewGroup.getContext();
            C15HI c15hi = this.LLILZ;
            c15hmPoll = new C15HM(context, c15hi.LLJILJILJ, c15hi.LLJJI);
        }
        C15HI c15hi2 = this.LLILZ;
        C15HQ c15hq = c15hi2.LLILZIL;
        InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = c15hi2.LLIZ;
        c15hmPoll.LLILLJJLI = c15hq;
        c15hmPoll.LLILZIL = interfaceC20494515Hj;
        int i2 = 0;
        if (!c15hmPoll.LL.isEmpty()) {
            int i3 = 0;
            do {
                C15IO c15io = (C15IO) ListProtector.get(c15hmPoll.LL, i3);
                C15HQ c15hq2 = c15hmPoll.LLILLJJLI;
                InterfaceC20494515Hj<C15HP> interfaceC20494515Hj2 = c15hmPoll.LLILZIL;
                c15io.LLLI = c15hq2;
                c15io.LLLIL = interfaceC20494515Hj2;
                i3++;
            } while (i3 < 3);
        }
        List<MusicModel> list = this.LLILLJJLI;
        int i4 = i * 3;
        C15HI c15hi3 = this.LLILZ;
        int i5 = c15hi3.LLIZLLLIL;
        int i6 = c15hi3.LLJ;
        C15HO c15ho = c15hi3.LLJI;
        boolean z2 = c15hi3.LLJILLL;
        boolean z3 = c15hi3.LLJJ;
        if (list != null) {
            int iMin = Math.min(i4 + 3, list.size());
            int i7 = i4;
            while (i7 < iMin) {
                MusicModel musicModel = (MusicModel) ListProtector.get(list, i7);
                C15IP c15ip = (C15IP) ListProtector.get(c15hmPoll.getMusicItemViews(), i7 - i4);
                C786410Ut5.LJLLLLLL(i2, c15ip.itemView);
                boolean zHasExtendMusicList = musicModel.hasExtendMusicList();
                if (i5 == i7) {
                    z = true;
                } else {
                    z = false;
                }
                musicModel.getDuration();
                boolean z4 = z2;
                c15ip.T5(new C15IQ(musicModel, "", z4, false, zHasExtendMusicList, z, z3, 0, i6, i7, c15ho, C1402480mbG.LIZ(), 0, false, false, false));
                i7++;
                z2 = z4;
                i2 = 0;
            }
            for (int i8 = iMin - i4; i8 < 3; i8++) {
                C786410Ut5.LJLLLLLL(8, ((RecyclerView.ViewHolder) ListProtector.get(c15hmPoll.getMusicItemViews(), i8)).itemView);
            }
        }
        viewGroup.addView(c15hmPoll);
        return c15hmPoll;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
        this.LLILLL.offer(obj);
    }
}
