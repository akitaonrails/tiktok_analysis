package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383320F1e extends AbstractC1664490tPr<C383380F1k, C0F21> {
    public RecyclerView LLJJJIL;
    public TuxTextView LLJJJJ;
    public C371550EhV LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public InterfaceC374530EmJ LLJJL;
    public C383460F1s LLJJLIIIJLLLLLLLZ;

    public C383320F1e() {
        setTheme(R.style.y0);
        this.LLJJJJLIIL = true;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(248));
        C1664590tQ1.LIZLLL(this, "CutoutStrokeAdjustScene", false, AFwS234S0000000_5.get$arr$(249), 2);
        C1664600tQ2.LIZ(this, "CutoutStrokeAdjustScene", new AwS584S0100000_5(this, 491));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            RecyclerView recyclerView = null;
            InterfaceC374530EmJ interfaceC374530EmJ = (InterfaceC374530EmJ) c1drg.LJIIL(null, InterfaceC374530EmJ.class);
            this.LLJJL = interfaceC374530EmJ;
            if (interfaceC374530EmJ != null) {
                interfaceC374530EmJ.setTitle("");
                interfaceC374530EmJ.DM0(EnumC377110EqT.RESET, false);
                interfaceC374530EmJ.s00(new C377060EqO(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 2, Integer.valueOf(R.raw.icon_tick)));
            }
            this.LLJJJJJIL = (C371550EhV) findViewById(R.id.wd6);
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.vkg);
            this.LLJJJJ = tuxTextView;
            if (tuxTextView != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                tuxTextView.setBackground(c384050F3z.LIZ(this.mView.getContext()));
            }
            this.LLJJLIIIJLLLLLLLZ = new C383460F1s(requireSceneContext(), this.LLJJJJ);
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.wb0);
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.LLJJLIIIJLLLLLLLZ);
                final Context contextRequireSceneContext = requireSceneContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(contextRequireSceneContext) { // from class: com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.stroke.ui.CutoutStrokeAdjustScene$initView$3$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final boolean canScrollVertically() {
                        return this.LL.LLJJJJLIIL;
                    }
                });
                recyclerView2.setItemAnimator(null);
                recyclerView = recyclerView2;
            }
            this.LLJJJIL = recyclerView;
            C371550EhV c371550EhV = this.LLJJJJJIL;
            if (c371550EhV != null) {
                c371550EhV.LIZJ(0.0f, C418440Gaw.LIZIZ(14), 0.0f, C418440Gaw.LIZIZ(32));
            }
            InterfaceC374530EmJ interfaceC374530EmJ2 = this.LLJJL;
            if (interfaceC374530EmJ2 != null) {
                interfaceC374530EmJ2.u11(new InterfaceC374650EmV() { // from class: X.0F1i
                    @Override // X.InterfaceC374650EmV
                    public final void onCancel() {
                    }

                    @Override // X.InterfaceC374650EmV
                    public final void LIZ() {
                        this.LIZ.LLLLIL().LJ.invoke();
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F1g
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C383380F1k) obj).LIZJ);
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 485));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F1l
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C383380F1k) obj).LIZIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 486));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0F1j
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C383380F1k) obj).LIZLLL;
                }
            }, new AwS584S0100000_5(this, 488));
            C383460F1s c383460F1s = this.LLJJLIIIJLLLLLLLZ;
            if (c383460F1s != null) {
                c383460F1s.LLILZ = new C383400F1m(this);
            }
            RecyclerView recyclerView3 = this.LLJJJIL;
            if (recyclerView3 != null) {
                recyclerView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 2));
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0q, viewGroup, false);
    }
}
