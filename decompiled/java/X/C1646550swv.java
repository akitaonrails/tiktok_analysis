package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS75S0200000_6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bfk.b0;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0swv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646550swv extends C19A3 implements InterfaceC379610EuV {
    public final C1DRG LLJILLL;
    public final C560530Lyd<C1647390syH> LLJJ;
    public final h0<Integer> LLJJI;
    public final C385670FAf<Boolean> LLJJIII;
    public final C385670FAf<Unit> LLJJIJI;
    public final LiveEvent<C002D> LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final C538770LBb<Integer> LLJJJ;
    public TabHost LLJJJIL;
    public C0GUE LLJJJJ;
    public View LLJJJJJIL;
    public final int LLJJJJLIIL = C366700EZg.LIZ(40.0d);
    public final Set<String> LLJJL = new LinkedHashSet();
    public final Map<Integer, View> LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public int LLJLL;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final void LLLLIIIILLL(int i, String str, String str2) {
        C0GUE c0gue = this.LLJJJJ;
        C0GUE c0gue2 = null;
        if (c0gue == null) {
            c0gue = null;
        }
        b0 b0Var = new b0(c0gue.getContext(), 0);
        b0Var.h0(6);
        b0Var.setText(str);
        b0Var.setTag(str2);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(b0Var);
        b0Var.setLayoutParams(layoutParams);
        C0GUE c0gue3 = this.LLJJJJ;
        if (c0gue3 != null) {
            c0gue2 = c0gue3;
        }
        c0gue2.addView(b0Var, i);
        this.LLJJL.add(str2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.d93, viewGroup, false);
        TabHost tabHost = (TabHost) viewGroup2.findViewById(R.id.vvc);
        this.LLJJJIL = tabHost;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        }
        this.LLJJJJ = (C0GUE) tabHost.findViewById(R.id.eqx);
        TabHost tabHost3 = this.LLJJJIL;
        if (tabHost3 == null) {
            tabHost3 = null;
        }
        this.LLJJJJJIL = tabHost3.findViewById(R.id.vv_);
        int i2 = this.LLJL;
        if (i2 >= 0) {
            String string = C0CHQ.LIZ.getString(2131850220);
            C1631530sYh.LIZ.getClass();
            LLLLIIIILLL(i2, string, C1631530sYh.LIZLLL);
        }
        int i3 = this.LLJLIL;
        String string2 = C0CHQ.LIZ.getString(2131845838);
        C1631530sYh.LIZ.getClass();
        String str = C1631530sYh.LIZJ;
        LLLLIIIILLL(i3, string2, str);
        LLLLIIIILLL(this.LLJLILLLLZIIL, C0CHQ.LIZ.getString(2131845837), C1631530sYh.LIZIZ);
        TabHost tabHost4 = this.LLJJJIL;
        if (tabHost4 == null) {
            tabHost4 = null;
        }
        tabHost4.setOnIndexChangedListener(new InterfaceC1653420t80() { // from class: X.0sww
            @Override // X.InterfaceC1653420t80
            public final void LIZ(int i4, int i5, Object obj, boolean z, boolean z2) {
                b0 b0Var;
                TextView textView;
                TabHost tabHost5 = this.LIZ.LLJJJIL;
                if (tabHost5 == null) {
                    tabHost5 = null;
                }
                Object objLIZ = tabHost5.LIZ(i4);
                if (objLIZ != null) {
                    this.LIZ.LLJJ.LJIIJ(new C1647390syH(obj, objLIZ, i5, z2, false, false, null, z, false, 368));
                }
                C0GUE c0gue = this.LIZ.LLJJJJ;
                if (c0gue == null) {
                    c0gue = null;
                }
                int childCount = c0gue.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    C0GUE c0gue2 = this.LIZ.LLJJJJ;
                    if (c0gue2 == null) {
                        c0gue2 = null;
                    }
                    View childAt = c0gue2.getChildAt(i6);
                    if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null && (textView = b0Var.getTextView()) != null) {
                        C1646550swv c1646550swv = this.LIZ;
                        if (i6 == i4) {
                            textView.setShadowLayer(8.0f, 0.0f, 1.0f, ColorProtector.parseColor("#80000000"));
                            HandlerHook.viewPost(textView, new ARunnableS75S0200000_6(c1646550swv, textView, 57));
                        } else {
                            textView.setShadowLayer(8.0f, 0.0f, 1.0f, ColorProtector.parseColor("#40000000"));
                        }
                    }
                }
            }
        });
        String str2 = this.LLJJIJIL;
        if (Intrinsics.LJFF(str2, C1631530sYh.LIZLLL)) {
            i = this.LLJL;
            if (i < 0) {
                i = this.LLJLILLLLZIIL;
            }
        } else if (Intrinsics.LJFF(str2, str)) {
            i = this.LLJLIL;
        } else {
            i = this.LLJLILLLLZIIL;
        }
        TabHost tabHost5 = this.LLJJJIL;
        if (tabHost5 != null) {
            tabHost2 = tabHost5;
        }
        tabHost2.LJFF(true, i, 0, false, true);
        this.LLJJI.LIZ(this, new AObjectS246S0100000_25(this, 323));
        C385670FAf<Boolean> c385670FAf = this.LLJJIII;
        if (c385670FAf != null) {
            c385670FAf.LIZ(this, new AObjectS246S0100000_25(this, 324));
        }
        C385670FAf<Unit> c385670FAf2 = this.LLJJIJI;
        if (c385670FAf2 != null) {
            c385670FAf2.LIZ(this, new AObjectS246S0100000_25(this, 325));
        }
        LiveEvent<C002D> liveEvent = this.LLJJIJIIJIL;
        if (liveEvent != null) {
            liveEvent.LIZ(this, new AObjectS246S0100000_25(this, 326));
        }
        this.LLJJJ.LIZ(this, new AObjectS246S0100000_25(this, 327));
        return viewGroup2;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public C1646550swv(C1DRG c1drg, C560530Lyd c560530Lyd, h0 h0Var, C385670FAf c385670FAf, h0 h0Var2, C560530Lyd c560530Lyd2, String str, boolean z, C538770LBb c538770LBb) {
        int i;
        this.LLJILLL = c1drg;
        this.LLJJ = c560530Lyd;
        this.LLJJI = h0Var;
        this.LLJJIII = c385670FAf;
        this.LLJJIJI = h0Var2;
        this.LLJJIJIIJIL = c560530Lyd2;
        this.LLJJIJIL = str;
        this.LLJJJ = c538770LBb;
        new C1646570swx();
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashMap();
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        this.LLJL = i;
        this.LLJLIL = i + 1;
        this.LLJLILLLLZIIL = i + 2;
    }
}
