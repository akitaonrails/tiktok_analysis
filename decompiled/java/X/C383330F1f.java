package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.adjustfilter.ui.HorizontalCenterLayoutManager;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383330F1f extends RecyclerView.ViewHolder {
    public final RecyclerView LL;
    public AwS584S0100000_5 LLILLJJLI;
    public final C0EJX LLILLL;
    public final C01GW LLILZ;

    public C383330F1f(RecyclerView recyclerView) {
        super(recyclerView);
        this.LL = recyclerView;
        C0EJX c0ejx = new C0EJX(recyclerView.getContext());
        this.LLILLL = c0ejx;
        this.LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 561));
        C786410Ut5.p6(this.LL, new RecyclerView.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
        C426750GoL.LJIIIZ(recyclerView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), false, 23);
        recyclerView.setAdapter(c0ejx);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new HorizontalCenterLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        C426750GoL.LJIIL(recyclerView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, 26);
        recyclerView.setClipToPadding(false);
        c0ejx.LL = new AwS584S0100000_5(this, 473);
    }
}
