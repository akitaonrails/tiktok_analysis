package X;

import Y.AObjectS241S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bfk.b0;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654050t91 extends AbstractC1664490tPr<C1654150t9B, C1654140t9A> {
    public final List<InterfaceC1654200t9G> LLJJJIL;
    public final C385670FAf<Boolean> LLJJJJ;
    public TabHost LLJJJJLIIL;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 385));
    public final h0<Boolean> LLJJL = new h0<>(Boolean.FALSE);

    public final int LLLLLJIL(Object obj) {
        Object objLIZ;
        TabHost tabHost = this.LLJJJJLIIL;
        if (tabHost != null) {
            int tabCount = tabHost.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabHost tabHost2 = this.LLJJJJLIIL;
                if (tabHost2 != null) {
                    objLIZ = tabHost2.LIZ(i);
                } else {
                    objLIZ = null;
                }
                if (Intrinsics.LJFF(obj, objLIZ)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Context context;
        TuxTextView tuxTextView;
        super.onActivityCreated(bundle);
        TabHost tabHost = (TabHost) requireViewById(R.id.ch_);
        tabHost.setSelectedTextColor(R.attr.ee);
        tabHost.setUnselectedTextColor(R.attr.hp);
        tabHost.setSelectedTextFont(43);
        tabHost.setUnselectedTextFont(42);
        tabHost.setTabHostGestureListener(new C1653630t8L(requireSceneContext(), tabHost, this.LLJJL));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t9J
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1654150t9B) obj).LIZ;
            }
        }, new AwS391S0200000_25(this, tabHost, 88));
        tabHost.setOnIndexChangedListener(new InterfaceC1653420t80() { // from class: X.0t96
            @Override // X.InterfaceC1653420t80
            public final void LIZ(int i, int i2, Object obj, boolean z, boolean z2) {
                this.LIZ.LLLLIL().LIZ.invoke((InterfaceC1654200t9G) ListProtector.get(this.LIZ.LLJJJIL, i), Integer.valueOf(i2));
            }
        });
        this.LLJJJJLIIL = tabHost;
        ImageView imageView = (ImageView) requireViewById(R.id.sz2);
        if (((Boolean) C861980Xrg.LIZ.getValue()).booleanValue()) {
            C786410Ut5.LJZI(8, imageView);
        }
        LLLLIL().LIZIZ.invoke(this.LLJJL);
        for (InterfaceC1654200t9G interfaceC1654200t9G : this.LLJJJIL) {
            View view = (View) this.LLJJJJJIL.getValue();
            if (view != null && (context = view.getContext()) != null) {
                b0 b0Var = new b0(context, 0);
                String strLIZ = interfaceC1654200t9G.LIZ();
                interfaceC1654200t9G.LJIIL();
                b0Var.setText(strLIZ);
                TextView textView = b0Var.getTextView();
                if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                    tuxTextView.LJJJJI(16.0f);
                }
                b0Var.setEnabled(true);
                b0Var.setTag(interfaceC1654200t9G.LJIIJJI().getTag());
                b0Var.e0();
                ViewGroup viewGroup = (ViewGroup) this.LLJJJJJIL.getValue();
                if (viewGroup != null) {
                    viewGroup.addView(b0Var);
                }
            }
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t9I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1654150t9B) obj).LIZ;
            }
        }, new AwS604S0100000_25(this, 264));
        C385670FAf<Boolean> c385670FAf = this.LLJJJJ;
        if (c385670FAf != null) {
            c385670FAf.LIZ(this, new AObjectS241S0100000_8(this, 29));
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t9K
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1654150t9B) obj).LIZIZ;
            }
        }, new AwS604S0100000_25(this, 265));
    }

    public C1654050t91(List<InterfaceC1654200t9G> list, C385670FAf<Boolean> c385670FAf) {
        this.LLJJJIL = list;
        this.LLJJJJ = c385670FAf;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).loadLayoutFiles("ShootBottomTabScene", getSceneContext(), layoutInflater, R.layout.i91, viewGroup, false);
    }
}
