package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellHighlightAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellSpotlightSlotAssem;
import kotlin.jvm.internal.AwS24S0001000_9;

/* JADX INFO: renamed from: X.0P4V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4V implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C0P4V c0p4v) {
        View viewLJJIJL;
        ViewTreeObserver viewTreeObserver;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((MusicCellSpotlightSlotAssem) c0p4v.l0).LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (viewTreeObserver = viewOnAttachStateChangeListenerC20604515jv.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c0p4v);
            C2187701Ajg.LIZIZ(viewTreeObserver, c0p4v, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        MusicCellSpotlightSlotAssem musicCellSpotlightSlotAssem = (MusicCellSpotlightSlotAssem) c0p4v.l0;
        if (musicCellSpotlightSlotAssem.LLJJIII && (viewLJJIJL = musicCellSpotlightSlotAssem.LJJIJL()) != null) {
            int width = (viewLJJIJL.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            if (width < 0) {
                width = 0;
            }
            int i = width / 3;
            AssemVMLazy assemVMLazy = ((MusicCellSpotlightSlotAssem) c0p4v.l0).LLJLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicCellSpotlightSlotAssem.LLJLLIL;
            assemVMLazy.getValue().setState(new AwS24S0001000_9(i, 13));
        }
    }

    public static final void onGlobalLayout$1(C0P4V c0p4v) {
        C786410Ut5.C3(((MusicCellHighlightAssem) c0p4v.l0).getContentView().getViewTreeObserver(), c0p4v);
        int width = ((MusicCellHighlightAssem) c0p4v.l0).getContentView().getWidth();
        TuxTextView tuxTextView = ((MusicCellHighlightAssem) c0p4v.l0).LLJLIL;
        if (tuxTextView != null) {
            int width2 = tuxTextView.getWidth();
            LinearLayout linearLayout = ((MusicCellHighlightAssem) c0p4v.l0).LLJLILLLLZIIL;
            if (linearLayout != null && linearLayout.getWidth() + width2 > width) {
                int i = width - width2;
                if (i < 0) {
                    i = 0;
                }
                LinearLayout linearLayout2 = ((MusicCellHighlightAssem) c0p4v.l0).LLJLILLLLZIIL;
                if (linearLayout2 != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i;
                        C786410Ut5.W5(linearLayout2, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
    }

    public C0P4V(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
