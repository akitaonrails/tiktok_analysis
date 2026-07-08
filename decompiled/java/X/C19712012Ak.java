package X;

import Y.AsS37S0200000_29;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.recorder.sticker.gallery.GalleryStickerLayoutManger;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12Ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19712012Ak implements InterfaceC19712612Aq {
    public final ViewGroup LIZ;
    public final C580710Mq5 LIZIZ;
    public final Pair<Integer, Integer> LIZJ;
    public final Function1<Integer, Unit> LIZLLL;

    @Override // X.InterfaceC19712612Aq
    public final void LIZ() {
        ((RecyclerView) this.LIZ.findViewById(R.id.vkt)).addOnScrollListener(new AsS37S0200000_29(this, 4));
        ((RecyclerView) this.LIZ.findViewById(R.id.vkt)).setItemAnimator(new C423520Gj8());
        RecyclerView recyclerView = (RecyclerView) this.LIZ.findViewById(R.id.vkt);
        GalleryStickerLayoutManger galleryStickerLayoutManger = new GalleryStickerLayoutManger(C444960Hcc.LIZIZ());
        galleryStickerLayoutManger.LLJILJIL = true;
        RecyclerView recyclerView2 = (RecyclerView) this.LIZ.findViewById(R.id.vkt);
        if (recyclerView2 == null) {
            "The attach RecycleView must not null!!".toString();
            throw new IllegalArgumentException("The attach RecycleView must not null!!");
        }
        galleryStickerLayoutManger.LLIZLLLIL = recyclerView2;
        galleryStickerLayoutManger.LLILLL = Math.max(0, -1);
        recyclerView2.setLayoutManager(galleryStickerLayoutManger);
        galleryStickerLayoutManger.LLILZIL.LIZIZ(recyclerView2);
        recyclerView2.addOnScrollListener(galleryStickerLayoutManger.LLILZLL);
        galleryStickerLayoutManger.LLJ = new C19711312Ad(this);
        recyclerView.setLayoutManager(galleryStickerLayoutManger);
        C375780EoK.LIZIZ(this.LIZ.findViewById(R.id.pw_), true);
        ViewGroup.LayoutParams layoutParams = this.LIZ.findViewById(R.id.pw_).getLayoutParams();
        layoutParams.width = this.LIZJ.getFirst().intValue();
        layoutParams.height = this.LIZJ.getSecond().intValue();
        C786410Ut5.W5(this.LIZ.findViewById(R.id.pw_), layoutParams);
    }

    public C19712012Ak(ViewGroup viewGroup, C580710Mq5 c580710Mq5, Pair pair, AwS608S0100000_29 awS608S0100000_29) {
        this.LIZ = viewGroup;
        this.LIZIZ = c580710Mq5;
        this.LIZJ = pair;
        this.LIZLLL = awS608S0100000_29;
    }
}
