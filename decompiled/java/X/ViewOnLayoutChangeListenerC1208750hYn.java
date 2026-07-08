package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistFragmentAssem;
import com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitNavBarAssem;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class ViewOnLayoutChangeListenerC1208750hYn implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1208750hYn(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1208750hYn viewOnLayoutChangeListenerC1208750hYn, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((EditPlaylistFragmentAssem) viewOnLayoutChangeListenerC1208750hYn.l0).Zo()) {
            EditPlaylistFragmentAssem editPlaylistFragmentAssem = (EditPlaylistFragmentAssem) viewOnLayoutChangeListenerC1208750hYn.l0;
            ViewOnLayoutChangeListenerC1208750hYn viewOnLayoutChangeListenerC1208750hYn2 = editPlaylistFragmentAssem.LLJJJIL;
            if (viewOnLayoutChangeListenerC1208750hYn2 != null) {
                editPlaylistFragmentAssem.Go().removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1208750hYn2);
            }
            ((EditPlaylistFragmentAssem) viewOnLayoutChangeListenerC1208750hYn.l0).LLJJJIL = null;
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1208750hYn viewOnLayoutChangeListenerC1208750hYn, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZIZ = C1178990gmn.LIZIZ((PoiOrderSubmitNavBarAssem) viewOnLayoutChangeListenerC1208750hYn.l0);
        if (interfaceC1181010gq3LIZIZ != null) {
            interfaceC1181010gq3LIZIZ.ro1(i4 - i2);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1208750hYn viewOnLayoutChangeListenerC1208750hYn, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams;
        int i9 = i4 - i2;
        View view2 = ((SlashFragment) viewOnLayoutChangeListenerC1208750hYn.l0).LLLIIL;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            SlashFragment slashFragment = (SlashFragment) viewOnLayoutChangeListenerC1208750hYn.l0;
            if (i9 != layoutParams.height) {
                layoutParams.height = i9;
                View view3 = slashFragment.LLLIIL;
                if (view3 != null) {
                    view3.requestLayout();
                }
            }
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC1208750hYn viewOnLayoutChangeListenerC1208750hYn, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((Function0) viewOnLayoutChangeListenerC1208750hYn.l0).invoke();
    }
}
