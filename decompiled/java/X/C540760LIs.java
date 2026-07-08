package X;

import Y.AsS35S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.utils.oh;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540760LIs extends RecyclerView {
    public C0LJV LL;
    public InterfaceC529170Kp9 LLILLJJLI;
    public final C01GW LLILLL;
    public Boolean LLILZ;
    public C0LJU LLILZIL;

    private final int getScreenHeight() {
        return ((Number) this.LLILLL.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RecyclerView recyclerView;
        C0LJV c0ljv = this.LL;
        if (c0ljv != null && (recyclerView = c0ljv.LLILLL) != null) {
            c0ljv.LLJJIJIIJIL = null;
            recyclerView.removeOnScrollListener(c0ljv.LLJJIJIL);
            c0ljv.LLILLL = null;
        }
        this.LLILLJJLI = null;
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0LJV c0ljv = this.LL;
        if (c0ljv != null) {
            c0ljv.LIZ(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC21673619ry<?> abstractC21673619ry) {
        C0LJV c0ljv;
        super.setAdapter(abstractC21673619ry);
        if ((abstractC21673619ry instanceof InterfaceC530060Kqa) && (c0ljv = this.LL) != null) {
            c0ljv.setSectionIndexer((InterfaceC530060Kqa) abstractC21673619ry);
        }
    }

    public final void setFastScrollEnabled(boolean z) {
        C0LJV c0ljv = this.LL;
        if (c0ljv != null) {
            c0ljv.setEnabled(z);
        }
        this.LLILZ = Boolean.valueOf(z);
    }

    public final void setFastScrollListener(C0LJU c0lju) {
        C0LJV c0ljv = this.LL;
        if (c0ljv != null) {
            c0ljv.setFastScrollListener(c0lju);
        }
        this.LLILZIL = c0lju;
    }

    public final void setTimeLineListener(InterfaceC529170Kp9 interfaceC529170Kp9) {
        this.LLILLJJLI = interfaceC529170Kp9;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C0LJV c0ljv = this.LL;
        if (c0ljv != null) {
            int visibility = c0ljv.getVisibility();
            c0ljv.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c0ljv);
        }
    }

    public C540760LIs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void LIZJ(C540760LIs c540760LIs, Context context) {
        C0LJV c0ljv;
        C0LJV c0ljv2;
        c540760LIs.getClass();
        C0LJV c0ljv3 = new C0LJV(context);
        c540760LIs.LL = c0ljv3;
        c0ljv3.setId(R.id.hpj);
        C0LJV c0ljv4 = c540760LIs.LL;
        if (c0ljv4 != null) {
            c0ljv4.setEnabled(false);
        }
        C0LJV c0ljv5 = c540760LIs.LL;
        if (c0ljv5 != null) {
            c0ljv5.setTimeLineSelectStateListener(c540760LIs.LLILLJJLI);
        }
        C0LJV c0ljv6 = c540760LIs.LL;
        if (c0ljv6 != null) {
            c0ljv6.LIZ(c540760LIs);
        }
        if ((c540760LIs.getAdapter() instanceof InterfaceC530060Kqa) && (c0ljv2 = c540760LIs.LL) != null) {
            c0ljv2.setSectionIndexer((InterfaceC530060Kqa) c540760LIs.getAdapter());
        }
        Boolean bool = c540760LIs.LLILZ;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            C0LJV c0ljv7 = c540760LIs.LL;
            if (c0ljv7 != null) {
                c0ljv7.setEnabled(zBooleanValue);
            }
        }
        C0LJU c0lju = c540760LIs.LLILZIL;
        if (c0lju != null && (c0ljv = c540760LIs.LL) != null) {
            c0ljv.setFastScrollListener(c0lju);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        InterfaceC540750LIr interfaceC540750LIr;
        if (Math.abs(i2) > getScreenHeight() * 5) {
            if (InterfaceC540790LIv.LJI.getOpenAlbumOptiGroup() == 2) {
                Object adapter = getAdapter();
                if ((adapter instanceof InterfaceC540750LIr) && (interfaceC540750LIr = (InterfaceC540750LIr) adapter) != null) {
                    interfaceC540750LIr.LLJJIJI();
                }
            }
            oh.LIZJ("tool_album_scroll_high_speed", 500, -1L, null, null);
        }
        if (AbstractC19994813Le.Default.nextFloat() < 0.1d) {
            oh.LIZJ("tool_album_scroll", 500, -1L, null, null);
        }
        return super.fling(i, i2);
    }

    public C540760LIs(final Context context, final AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 262));
        addOnScrollListener(new AbstractC1585810rMx(context, attributeSet) { // from class: X.0LIt
            public final /* synthetic */ Context LLILLJJLI;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i2) {
                this.LL.removeOnScrollListener(this);
                C540760LIs.LIZJ(this.LL, this.LLILLJJLI);
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i2, int i3) {
                if (i2 != 0 || i3 != 0) {
                    this.LL.removeOnScrollListener(this);
                    C540760LIs.LIZJ(this.LL, this.LLILLJJLI);
                }
            }
        });
        addOnScrollListener(new AsS35S0100000_8(this, 0));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
