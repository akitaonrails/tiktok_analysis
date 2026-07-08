package X;

import Y.ACListenerS162S0100000_28;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10LU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LU extends RecyclerView.ViewHolder {
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final C10LV LL;
    public final C10LW LLILLJJLI;
    public final RecSwipeGalleryLayoutManager LLILLL;
    public C10LS LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public UserWithAweme LLJIJIL;

    public final C10LL I5() {
        return (C10LL) this.LLIZLLLIL.getValue();
    }

    public final TuxTextView L5() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public C10LU(View view, C10LV c10lv, C10LW c10lw, RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager) {
        super(view);
        this.LL = c10lv;
        this.LLILLJJLI = c10lw;
        this.LLILLL = recSwipeGalleryLayoutManager;
        this.LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 878));
        this.LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 881));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 879));
        this.LLIZ = c01gwLIZIZ;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 880));
        this.LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 883));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS572S0100000_28(view, 882));
        this.LLJI = c01gwLIZIZ2;
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 132), this.itemView);
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC19332710kH(this, 5));
        C786410Ut5.a9((TuxIconView) c01gwLIZIZ.getValue(), new ACListenerS162S0100000_28(this, 133));
        ((View) c01gwLIZIZ.getValue()).setOnLongClickListener(new ViewOnLongClickListenerC19332710kH(this, 6));
        C2271391DvN.LIZ((View) c01gwLIZIZ2.getValue(), (C1A5L) C2271381DvM.LLJI.getValue());
        C2271391DvN.LIZ((View) c01gwLIZIZ.getValue(), (C1A5L) C2271381DvM.LLJIJIL.getValue());
    }
}
