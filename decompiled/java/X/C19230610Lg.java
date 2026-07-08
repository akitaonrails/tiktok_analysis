package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19230610Lg extends AbstractC683590Qrd<UserWithAweme> implements InterfaceC19231610Lq, InterfaceC19231510Lp, InterfaceC19231710Lr {
    public final GalleryLayoutManager LL;
    public final Function0<Unit> LLILLJJLI;
    public InterfaceC1565540qqG<ViewOnClickListenerC19230910Lj> LLILLL;
    public C10LS LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    @Override // X.InterfaceC19231710Lr
    public final void LJ() {
        this.LLILLJJLI.invoke();
    }

    @Override // X.InterfaceC19231510Lp
    public final void LIZIZ(int i) {
        RecyclerView recyclerView;
        GalleryLayoutManager galleryLayoutManager = this.LL;
        int i2 = galleryLayoutManager.LLILZ;
        if (i2 >= 0 && i2 == i && (recyclerView = galleryLayoutManager.LLJJ) != null && !recyclerView.isAnimating()) {
            List<UserWithAweme> data = getData();
            if (data != null) {
                ListProtector.remove(data, this.LL.LLILZ);
            }
            notifyItemRemoved(this.LL.LLILZ);
        }
    }

    @Override // X.InterfaceC19231610Lq
    public final void LLLF(int i) {
        GalleryLayoutManager galleryLayoutManager = this.LL;
        int i2 = i + 1;
        RecyclerView recyclerView = galleryLayoutManager.LLJJ;
        if (recyclerView != null && i2 >= 0) {
            galleryLayoutManager.smoothScrollToPosition(recyclerView, null, i2);
        }
    }

    public final void LLLFZ(Context context) {
        if (C1389340mG4.LIZJ(context, null).LJFF) {
            double d = ((double) C1389340mG4.LIZJ(context, null).LIZJ) * 0.5d;
            this.LLILZLL = (int) (d / ((double) 1.34f));
            this.LLILZIL = (int) d;
        } else {
            int i = (int) (C1389340mG4.LIZJ(context, null).LIZIZ * 0.712f);
            this.LLILZLL = i;
            this.LLILZIL = (int) (i * 1.34f);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC683590Qrd
    public final void addData(List<? extends UserWithAweme> list) {
        if (list != null && !list.isEmpty()) {
            List<T> list2 = this.mmItems;
            if (list2 != 0) {
                list2.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            this.mmItems = arrayList;
        }
    }

    public C19230610Lg(GalleryLayoutManager galleryLayoutManager, AwS572S0100000_28 awS572S0100000_28) {
        super(false);
        this.LL = galleryLayoutManager;
        this.LLILLJJLI = awS572S0100000_28;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        UserWithAweme userWithAweme;
        ViewOnClickListenerC19230910Lj viewOnClickListenerC19230910Lj = (ViewOnClickListenerC19230910Lj) viewHolder;
        C10LS c10ls = this.LLILZ;
        List<T> list = this.mmItems;
        Video video = null;
        if (list != 0 && i >= 0 && i < list.size()) {
            userWithAweme = (UserWithAweme) ListProtector.get(list, i);
        } else {
            userWithAweme = null;
        }
        viewOnClickListenerC19230910Lj.LLJJIJIL = userWithAweme;
        viewOnClickListenerC19230910Lj.LLIZ = c10ls;
        viewOnClickListenerC19230910Lj.getClass();
        Aweme aweme = userWithAweme.getAweme();
        if (aweme != null) {
            video = aweme.getVideo();
        }
        viewOnClickListenerC19230910Lj.LLJJIJIIJIL = video;
        int i2 = viewOnClickListenerC19230910Lj.LLILZIL;
        int iLIZIZ = viewOnClickListenerC19230910Lj.LLILZLL;
        if (video != null && video.getWidth() != 0 && video.getHeight() != 0) {
            iLIZIZ = C814420VxA.LIZIZ((i2 / video.getWidth()) * video.getHeight());
        }
        viewOnClickListenerC19230910Lj.R5().getLayoutParams().width = i2;
        viewOnClickListenerC19230910Lj.R5().getLayoutParams().height = iLIZIZ;
        ((View) viewOnClickListenerC19230910Lj.LLJILLL.getValue()).getLayoutParams().width = i2;
        ((View) viewOnClickListenerC19230910Lj.LLJILLL.getValue()).getLayoutParams().height = iLIZIZ;
        C786410Ut5.l(viewOnClickListenerC19230910Lj.R5(), 0);
        Video video2 = viewOnClickListenerC19230910Lj.LLJJIJIIJIL;
        if (video2 != null) {
            C1324840ka2.LJFF(viewOnClickListenerC19230910Lj.R5(), video2.getOriginCover());
        }
        viewOnClickListenerC19230910Lj.U5();
        View view = viewHolder.itemView;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1 && this.LLILZLL != -1 && this.LLILZIL != -1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                int i3 = this.LLILZLL;
                if (i3 != layoutParams.width || this.LLILZIL != layoutParams.height) {
                    layoutParams.width = i3;
                }
                layoutParams.height = this.LLILZIL;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i_0, viewGroup, false);
        Context context = viewGroup.getContext();
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1) {
            if (this.LLILZLL == -1 || this.LLILZIL == -1) {
                LLLFZ(context);
            }
            ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.LLILZLL;
                layoutParams.height = this.LLILZIL;
            } else {
                layoutParams = new RecyclerView.LayoutParams(this.LLILZLL, this.LLILZIL);
            }
            C786410Ut5.W5(viewTd, layoutParams);
        }
        return new ViewOnClickListenerC19230910Lj(viewTd, this, this, this, this.LL);
    }
}
