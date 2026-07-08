package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171230gaH extends AbstractC1260080ita {
    public final TextView LLIZ;
    public final CheckBox LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final ViewGroup LLJILJIL;
    public final C0M3E LLJILJILJ;
    public final View LLJILLL;
    public final /* synthetic */ CollectionContentAssem LLJJ;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        Video video;
        Aweme aweme = this.LL;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        if (T5(video, "AbsAwemeViewHolder")) {
            this.LLILLL = true;
        } else {
            S5(video.getCover(), "AbsAwemeViewHolder", null, null);
        }
    }

    @Override // X.AbstractC1260080ita
    public final int[] R5() {
        return C422830Gi1.LIZ(200);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171230gaH(CollectionContentAssem collectionContentAssem, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c6v, viewGroup, false));
        this.LLJJ = collectionContentAssem;
        this.LLIZ = (TextView) this.itemView.findViewById(R.id.yfi);
        this.LLIZLLLIL = (CheckBox) this.itemView.findViewById(R.id.ulx);
        View viewFindViewById = this.itemView.findViewById(R.id.umw);
        this.LLJ = viewFindViewById;
        this.LLJI = this.itemView.findViewById(R.id.fv0);
        this.LLJIJIL = this.itemView.findViewById(R.id.f5d);
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.kci);
        this.LLJILJIL = viewGroup2;
        C0M3E c0m3eLJIIJJI = C1EE2.LIZIZ.LJIIJJI(viewGroup2);
        this.LLJILJILJ = c0m3eLJIIJJI;
        this.LLJILLL = this.itemView.findViewById(R.id.video_locked);
        c0m3eLJIIJJI.LIZ(viewFindViewById);
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.cover);
    }
}
