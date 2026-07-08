package X;

import Y.ARunnableS122S0100000_22;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.effectmanager.effect.model.FilterReason;
import com.ss.android.ugc.effectmanager.effect.model.FilteredAsset;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS671S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423960n9u extends AbstractC1664490tPr<C1423070n8T, C1422690n7r> {
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public C21597919fl LLJJJJLIIL;
    public C16FB LLJJL;
    public C1390410mHn LLJJLIIIJLLLLLLLZ;
    public C1390410mHn LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public C1427240nFC LLL;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLII;
    public AnimationSet LLLIIIL;
    public AnimationSet LLLIIL;
    public C1389880mGw LLLIILIL;
    public boolean LLLIL;
    public int LLLF = -1;
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 20));
    public final C1423970n9v LLLIIII = new C1423970n9v();
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(16));
    public final C1422800n82 LLLILZ = new C1422800n82(this);
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 19));

    public final void LLLLLLJ() {
        this.LLLII = true;
        View view = this.LLJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        AnimationSet animationSet = this.LLLIIL;
        if (animationSet != null) {
            animationSet.cancel();
        }
        AnimationSet animationSet2 = this.LLLIIIL;
        if (animationSet2 != null) {
            animationSet2.cancel();
        }
        View view2 = this.LLJLIL;
        if (view2 != null) {
            view2.clearAnimation();
        }
        View view3 = this.LLJLILLLLZIIL;
        if (view3 != null) {
            view3.clearAnimation();
        }
    }

    public final C1425030nBd LLLLLJLJLL() {
        return (C1425030nBd) this.LLLILZJ.getValue();
    }

    public final C1419590n2r LLLLLL() {
        C21597919fl c21597919fl = this.LLJJJJLIIL;
        if (c21597919fl != null) {
            return (C1419590n2r) C13LP.LJJJLZIJ(c21597919fl.getCurrentItem(), LLLLLJLJLL().LLILZIL);
        }
        return null;
    }

    public final float LLLLLLIL() {
        return ((Number) this.LLLIIIIL.getValue()).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            r3 = this;
            X.19fl r0 = r3.LLJJJJLIIL
            if (r0 == 0) goto L35
            int r1 = r0.getCurrentItem()
            X.0nBd r0 = r3.LLLLLJLJLL()
            X.0nBj r1 = r0.LJJIJIL(r1)
            if (r1 == 0) goto L35
            r0 = 0
            r1.LLJJL = r0
            android.view.View r0 = r1.LLJ
            X.C337180DJs.LIZ(r0)
            float r2 = r1.getVideoProgress()
        L1e:
            java.lang.Object r0 = r3.LLLLIL()
            X.0n7r r0 = (X.C1422690n7r) r0
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r1 = r0.LIZJ
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.invoke(r0)
            X.0mGw r0 = r3.LLLIILIL
            if (r0 == 0) goto L34
            r0.LIZIZ()
        L34:
            return
        L35:
            r2 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423960n9u.S():void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C21597919fl c21597919fl = this.LLJJJJLIIL;
        if (c21597919fl != null) {
            C1425090nBj c1425090nBjLJJIJIL = LLLLLJLJLL().LJJIJIL(c21597919fl.getCurrentItem());
            if (c1425090nBjLJJIJIL != null) {
                c1425090nBjLJJIJIL.LJII(false);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C1425570nCV.LIZIZ.LJ(this, null);
        C21597919fl c21597919fl = this.LLJJJJLIIL;
        if (c21597919fl != null) {
            C1425090nBj c1425090nBjLJJIJIL = LLLLLJLJLL().LJJIJIL(c21597919fl.getCurrentItem());
            if (c1425090nBjLJJIJIL != null) {
                c1425090nBjLJJIJIL.LJFF(true);
            }
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        C21597919fl c21597919fl;
        super.onResume();
        C1425570nCV.LIZIZ.LJ(this, Boolean.TRUE);
        if ((C299160Bo2.LIZ() && this.LLLIL) || (c21597919fl = this.LLJJJJLIIL) == null) {
            return;
        }
        C1425090nBj c1425090nBjLJJIJIL = LLLLLJLJLL().LJJIJIL(c21597919fl.getCurrentItem());
        if (c1425090nBjLJJIJIL != null) {
            c1425090nBjLJJIJIL.LJI(true);
        }
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        if (Intrinsics.LJFF("template_schema", LLLLILI().LIZ(new C2217381BqS() { // from class: X.0n8d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LJIIJ;
            }
        }).LIZJ()) || this.LLLII || !this.LLLIIII.LIZ.getBoolean("template_guidance_should_show", true)) {
            return;
        }
        ((Handler) this.LLLI.getValue()).postDelayed(new ARunnableS122S0100000_22(this, 4), 1350L);
    }

    public final void LLLLLJIL(C1419590n2r c1419590n2r) {
        FilteredAsset filteredAssetInvoke = LLLLIL().LJIIJJI.invoke(c1419590n2r);
        if (filteredAssetInvoke != null) {
            View view = this.LLJJJJJIL;
            if (view != null) {
                C786410Ut5.T4(view, 0.4f);
            }
            FilterReason filterReason = filteredAssetInvoke.filter_reason;
            if (filterReason != null) {
                LLLLLLL(filterReason.filter_reason);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        C1389880mGw c1389880mGw = this.LLLIILIL;
        if (c1389880mGw != null) {
            c1389880mGw.LIZIZ();
        }
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
    }

    public final void LLLLLLL(String str) {
        C1389880mGw c1389880mGw = this.LLLIILIL;
        if (c1389880mGw == null) {
            c1389880mGw = new C1389880mGw(requireActivity());
            c1389880mGw.LJIIIZ(str);
            c1389880mGw.LIZLLL(3000L);
            this.LLLIILIL = c1389880mGw;
        }
        c1389880mGw.LJIIJ();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJIL = findViewById(R.id.bmy);
        this.LLJJJJ = findViewById(R.id.hff);
        this.LLJJJJJIL = findViewById(R.id.use_template);
        this.LLJJJJLIIL = (C21597919fl) findViewById(R.id.viewpager);
        this.LLJJL = (C16FB) findViewById(R.id.vw9);
        this.LLJJLIIIJLLLLLLLZ = (C1390410mHn) findViewById(R.id.nnp);
        this.LLJL = (C1390410mHn) findViewById(R.id.oc6);
        this.LLJLIL = findViewById(R.id.jak);
        this.LLJLILLLLZIIL = findViewById(R.id.evm);
        this.LLJLL = findViewById(R.id.hbe);
        this.LLJLLIL = findViewById(R.id.tec);
        this.LLJLLL = findViewById(R.id.uan);
        this.LLJZ = findViewById(R.id.u57);
        this.LLJZIJLIL = findViewById(R.id.u7r);
        this.LLL = (C1427240nFC) findViewById(R.id.udj);
        View view = this.LLJJJJJIL;
        if (view != null) {
            C786410Ut5.I7(new C1466570oGd(this, 9), view);
        }
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            C786410Ut5.I7(new C1466570oGd(this, 10), view2);
        }
        View view3 = this.LLJJJJ;
        if (view3 != null) {
            C786410Ut5.I7(new C1466570oGd(this, 1), view3);
        }
        View view4 = this.LLJLLIL;
        if (view4 != null) {
            C786410Ut5.I7(new C1466570oGd(this, 2), view4);
        }
        boolean zLIZ = C298950Bnh.LIZ();
        C1427240nFC c1427240nFC = this.LLL;
        if (c1427240nFC != null) {
            c1427240nFC.setTuxFont(42);
        }
        C1427240nFC c1427240nFC2 = this.LLL;
        if (c1427240nFC2 != null) {
            c1427240nFC2.setTextSizeSp(15.0f);
        }
        C1427240nFC c1427240nFC3 = this.LLL;
        if (c1427240nFC3 != null) {
            c1427240nFC3.setTextColorAttr(R.attr.ef);
        }
        if (!zLIZ) {
            View view5 = this.LLJLLL;
            if (view5 != null) {
                C786410Ut5.I7(new C1466570oGd(this, 6), view5);
            }
        } else {
            View view6 = this.LLJZ;
            if (view6 != null) {
                C786410Ut5.I7(new C1466570oGd(this, 7), view6);
            }
            View view7 = this.LLJZIJLIL;
            if (view7 != null) {
                C786410Ut5.I7(new C1466570oGd(this, 8), view7);
            }
        }
        C16FB c16fb = this.LLJJL;
        if (c16fb != null) {
            c16fb.setMaxOverScrollDistance(C12ES.LIZJ(70.0f, getSceneContext()));
        }
        C16FB c16fb2 = this.LLJJL;
        if (c16fb2 != null) {
            c16fb2.setOnScrollChangeListener(new AwS671S0100000_22(this, 0));
        }
        C21597919fl c21597919fl = this.LLJJJJLIIL;
        if (c21597919fl != null) {
            c21597919fl.setAdapter(LLLLLJLJLL());
        }
        C21597919fl c21597919fl2 = this.LLJJJJLIIL;
        if (c21597919fl2 != null) {
            ((ArrayList) c21597919fl2.LLLIIIL).add(new C1466890oH9(this, 0));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 13));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 15));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1423070n8T) obj).LJI);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 18));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LJII;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 20));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1423070n8T) obj).LJIIIIZZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 17));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1423070n8T) obj).LJIIIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 19));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0n8c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LIZLLL;
            }
        }, new AwS601S0100000_22(this, 21));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0n8e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LIZJ;
            }
        }, new AwS601S0100000_22(this, 23));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0n8f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LJ;
            }
        }, new AwS601S0100000_22(this, 3));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0n8Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LJIIJJI;
            }
        }, new AwS601S0100000_22(this, 4));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0n8a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LJIIL;
            }
        }, new AwS601S0100000_22(this, 5));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LJIILIIL;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 6));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n8E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1423070n8T) obj).LJIILJJIL;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 12));
    }

    public final void LLLLLLLLL(boolean z, boolean z2) {
        if (z2) {
            this.LLLFFI = z;
        }
        if (z) {
            C1390410mHn c1390410mHn = this.LLJJLIIIJLLLLLLLZ;
            if (c1390410mHn != null) {
                C786410Ut5.LLLZZIL(c1390410mHn, 0);
            }
            C1390410mHn c1390410mHn2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZJ();
                return;
            }
            return;
        }
        C1390410mHn c1390410mHn3 = this.LLJJLIIIJLLLLLLLZ;
        if (c1390410mHn3 != null) {
            c1390410mHn3.LIZLLL();
        }
        C1390410mHn c1390410mHn4 = this.LLJJLIIIJLLLLLLLZ;
        if (c1390410mHn4 == null) {
            return;
        }
        C786410Ut5.LLLZZIL(c1390410mHn4, 8);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.sl, viewGroup, false);
    }
}
