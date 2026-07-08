package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.lynx.core.ui.viewholder.DynamicViewHolder;

/* JADX INFO: renamed from: X.0Pbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648180Pbc {
    public static DynamicViewHolder LIZ(String str, ViewGroup viewGroup) {
        C1D3S c1d3s;
        ComponentCallbacks2 componentCallbacks2LJFF;
        if (C647630Paj.LJIIIIZZ(str)) {
            c1d3s = C1D3S.PRE_LAYOUT;
        } else {
            c1d3s = C1D3S.NORMAL;
        }
        Context contextLIZ = C657990PrR.LIZ(viewGroup);
        if (contextLIZ == null) {
            contextLIZ = viewGroup.getContext();
        }
        Fragment fragmentLIZ = C946803n0.LIZ(viewGroup);
        InterfaceC214902198i interfaceC214902198i = null;
        if (fragmentLIZ != null) {
            Context context = fragmentLIZ.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (true) {
                    if (fragmentLIZ instanceof InterfaceC214902198i) {
                        interfaceC214902198i = (InterfaceC214902198i) fragmentLIZ;
                        break;
                    }
                    fragmentLIZ = fragmentLIZ.getParentFragment();
                    if (fragmentLIZ == null) {
                        break;
                    }
                }
            }
        }
        Context contextLIZIZ = C661350Pwr.LIZIZ(contextLIZ, interfaceC214902198i);
        C1D66 c1d66 = new C1D66(contextLIZIZ, str, c1d3s, C682060QpA.LIZ());
        FrameLayout frameLayoutLJFF = c1d66.LJFF();
        if (frameLayoutLJFF != null) {
            C648160Pba c648160Pba = new C648160Pba();
            c648160Pba.LJIIJJI.LIZIZ(c1d3s);
            c648160Pba.LJIIIIZZ.LIZIZ(c1d66);
            if (((Number) C04SI.LIZ.getValue()).intValue() == 1) {
                FrameLayout frameLayout = new FrameLayout(contextLIZIZ);
                C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
                frameLayout.addView(frameLayoutLJFF);
                frameLayoutLJFF = frameLayout;
            }
            return new DynamicViewHolder(frameLayoutLJFF, c648160Pba);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
