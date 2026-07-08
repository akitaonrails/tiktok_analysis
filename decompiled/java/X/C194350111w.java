package X;

import Y.ARunnableS13S0201000_6;
import Y.ARunnableS18S0500000_29;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS46S0600000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.111w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194350111w extends LinearLayout {
    public final View LL;
    public final C1846060y8i LLILLJJLI;
    public final C20632315oP LLILLL;
    public final C1664420tPk LLILZ;
    public final View LLILZIL;
    public final TuxTextView LLILZLL;
    public final C1087110eOb LLIZ;
    public final C1390410mHn LLIZLLLIL;
    public final View LLJ;
    public final C1664400tPi LLJI;
    public final C01GW LLJIJIL;
    public final List<List<Effect>> LLJILJIL;
    public final List<List<Effect>> LLJILJILJ;
    public boolean LLJILLL;
    public C386190FCf LLJJ;
    public final Map<String, Boolean> LLJJI;
    public final C194340111m LLJJIII;

    public final View getClearView() {
        View view = this.LLILZIL;
        if (view == null) {
            return null;
        }
        return view;
    }

    public final String getCurTabName() {
        CharSequence charSequence;
        String string;
        C20632315oP c20632315oP = this.LLILLL;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        int currentItem = c20632315oP.getCurrentItem();
        C1846060y8i c1846060y8i = this.LLILLJJLI;
        C1845940y8W c1845940y8WLJII = (c1846060y8i != null ? c1846060y8i : null).LJII(currentItem);
        return (c1845940y8WLJII == null || (charSequence = c1845940y8WLJII.LIZJ) == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    public final C12RW getProxyPanel() {
        return (C12RW) this.LLJIJIL.getValue();
    }

    public final TuxTextView getTipView() {
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView == null) {
            return null;
        }
        return tuxTextView;
    }

    public final C0FPW getCurPanel() {
        return getProxyPanel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C194340111m c194340111m = this.LLJJIII;
        C20632315oP c20632315oP = this.LLILLL;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        c194340111m.LJIIIIZZ();
        c20632315oP.LJI(c194340111m.LJI);
    }

    public final void LIZ(Effect effect) {
        C386190FCf c386190FCf;
        if (effect != null && (c386190FCf = this.LLJJ) != null) {
            String strLIZ = C194396113q.LIZ(effect);
            if (strLIZ == null) {
                strLIZ = "";
            }
            if (strLIZ.length() != 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("tab_name", strLIZ);
                c386190FCf.LIZIZ(c2344009Gk);
                C20684815ws.LJIILLIIL("cancel_voice_effect", c2344009Gk.LIZ);
            }
        }
    }

    public final void LIZJ(Effect effect) {
        RecyclerView recyclerView;
        String effectId;
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                Iterator it3 = ((List) next).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next2 = it3.next();
                        String effectId2 = ((Effect) next2).getEffectId();
                        if (effect != null) {
                            effectId = effect.getEffectId();
                        } else {
                            effectId = null;
                        }
                        if (Intrinsics.LJFF(effectId2, effectId)) {
                            if (next2 != null) {
                                C20632315oP c20632315oP = this.LLILLL;
                                if (c20632315oP == null) {
                                    c20632315oP = null;
                                }
                                c20632315oP.setCurrentItem(i);
                            }
                        }
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C20632315oP c20632315oP2 = this.LLILLL;
        if (c20632315oP2 == null) {
            c20632315oP2 = null;
        }
        int currentItem = c20632315oP2.getCurrentItem();
        AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 37);
        C20632315oP c20632315oP3 = this.LLILLL;
        if (c20632315oP3 == null) {
            c20632315oP3 = null;
        }
        View childAt = c20632315oP3.getChildAt(0);
        if (childAt != null && (childAt instanceof RecyclerView) && (recyclerView = (RecyclerView) childAt) != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS13S0201000_6(recyclerView, currentItem, awS643S0100000_29, 11));
        }
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        C194340111m c194340111m = this.LLJJIII;
        C20632315oP c20632315oP = this.LLILLL;
        if (c20632315oP == null) {
            c20632315oP = null;
        }
        c194340111m.LJFF(c20632315oP, z);
    }

    public final void setOnVCItemClickListener(InterfaceC1664180tPM interfaceC1664180tPM) {
        C1664420tPk c1664420tPk = this.LLILZ;
        if (c1664420tPk == null) {
            c1664420tPk = null;
        }
        c1664420tPk.LLILZ = interfaceC1664180tPM;
    }

    public C194350111w(Context context, AttributeSet attributeSet) {
        C20632315oP c20632315oP;
        final C1846060y8i c1846060y8i;
        final C20632315oP c20632315oP2;
        C20632315oP c20632315oP3;
        C20632315oP c20632315oP4;
        super(context, attributeSet, 0);
        this.LLJI = new C1664400tPi();
        this.LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1012));
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new ArrayList();
        this.LLJJI = new LinkedHashMap();
        C194340111m c194340111m = new C194340111m();
        this.LLJJIII = c194340111m;
        this.LL = C786410Ut5.Sd(R.layout.enx, C786410Ut5.ne(context), this);
        C1846060y8i c1846060y8i2 = (C1846060y8i) findViewById(R.id.wx3);
        this.LLILLJJLI = c1846060y8i2;
        C20632315oP c20632315oP5 = (C20632315oP) findViewById(R.id.vp_content);
        this.LLILLL = c20632315oP5;
        if (!C298050BmF.LIZ()) {
            if (c20632315oP5 == null) {
                c20632315oP4 = null;
            } else {
                c20632315oP4 = c20632315oP5;
            }
            c20632315oP4.setOffscreenPageLimit(3);
        }
        C1664420tPk c1664420tPk = new C1664420tPk();
        this.LLILZ = c1664420tPk;
        if (c20632315oP5 == null) {
            c20632315oP = null;
        } else {
            c20632315oP = c20632315oP5;
        }
        c20632315oP.setAdapter(c1664420tPk);
        if (c1846060y8i2 == null) {
            c1846060y8i = null;
        } else {
            c1846060y8i = c1846060y8i2;
        }
        if (c20632315oP5 == null) {
            c20632315oP2 = null;
        } else {
            c20632315oP2 = c20632315oP5;
        }
        c1846060y8i.LIZ(new InterfaceC1846110y8n() { // from class: X.111y
            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                c20632315oP2.setCurrentItem(c1845940y8W.LIZLLL);
            }
        });
        c20632315oP2.LIZIZ(new AbstractC712240Rwk(c1846060y8i) { // from class: X.0gSH
            public final WeakReference<C1846060y8i> LL;
            public int LLILLJJLI;
            public int LLILLL;

            {
                this.LL = new WeakReference<>(c1846060y8i);
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                this.LLILLJJLI = this.LLILLL;
                this.LLILLL = i;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                boolean z;
                C1846060y8i c1846060y8i3 = this.LL.get();
                if (c1846060y8i3 != null && c1846060y8i3.getSelectedTabPosition() != i && i < c1846060y8i3.getTabCount()) {
                    int i2 = this.LLILLL;
                    if (i2 == 0 || (i2 == 2 && this.LLILLJJLI == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1846060y8i3.LJIILL(c1846060y8i3.LJII(i), z);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r1
              0x001a: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:15:0x0020, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC712240Rwk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onPageScrolled(int r7, float r8, int r9) {
                /*
                    r6 = this;
                    java.lang.ref.WeakReference<X.0y8i> r0 = r6.LL
                    java.lang.Object r5 = r0.get()
                    X.0y8i r5 = (X.C1846060y8i) r5
                    if (r5 == 0) goto L1e
                    int r4 = r6.LLILLL
                    r3 = 0
                    r2 = 2
                    r1 = 1
                    if (r4 != r2) goto L1f
                    int r0 = r6.LLILLJJLI
                    if (r0 == r1) goto L1f
                    r1 = 0
                L16:
                    int r0 = r6.LLILLJJLI
                    if (r0 == 0) goto L1b
                L1a:
                    r3 = 1
                L1b:
                    r5.LJIJ(r7, r8, r1, r3)
                L1e:
                    return
                L1f:
                    r1 = 1
                    if (r4 != r2) goto L1a
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1166270gSH.onPageScrolled(int, float, int):void");
            }
        });
        (c1846060y8i2 == null ? null : c1846060y8i2).LJIJJLI(true);
        this.LLILZIL = findViewById(R.id.kgk);
        c1664420tPk.LLILZIL = getProxyPanel();
        this.LLILZLL = (TuxTextView) findViewById(R.id.div);
        if (c20632315oP5 == null) {
            c20632315oP3 = null;
        } else {
            c20632315oP3 = c20632315oP5;
        }
        c20632315oP3.LIZIZ(new C12Y0(this, 2));
        this.LLIZ = (C1087110eOb) findViewById(R.id.j63);
        this.LLIZLLLIL = (C1390410mHn) findViewById(R.id.z06);
        View viewFindViewById = findViewById(R.id.j4v);
        this.LLJ = viewFindViewById;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setColors(new int[]{-16777216, 0});
        (viewFindViewById == null ? null : viewFindViewById).setBackground(gradientDrawable);
        c194340111m.LJ.LJ = true;
        C194340111m c194340111m2 = this.LLJJIII;
        c20632315oP5 = c20632315oP5 == null ? null : c20632315oP5;
        c194340111m2.LJII(c20632315oP5, new C0FGH() { // from class: X.111s
            @Override // X.C0FGH
            public final void LIZ(int i, List<Integer> list) {
                C386190FCf c386190FCf;
                C194350111w c194350111w = this.LIZ;
                try {
                    int i2 = 0;
                    for (Object obj : (Iterable) ((ArrayList) c194350111w.LLJILJIL).get(i)) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            Effect effect = (Effect) obj;
                            if (((ArrayList) list).contains(Integer.valueOf(i2)) && (c386190FCf = c194350111w.LLJJ) != null) {
                                String strLIZ = C194396113q.LIZ(effect);
                                if (strLIZ == null) {
                                    strLIZ = "";
                                }
                                c386190FCf.LIZ(0, strLIZ, effect.getEffectId(), effect.getName());
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        });
        c20632315oP5.LIZIZ(c194340111m2.LJI);
    }

    public final void LIZIZ(C19754712Qv c19754712Qv, Effect effect, Function1 function1, Function2 function2) {
        if ((!((ArrayList) this.LLJILJILJ).isEmpty()) && !this.LLJILLL) {
            HandlerHook.viewPost(this, new ARunnableS18S0500000_29(this, function2, c19754712Qv, effect, function1, 1));
            return;
        }
        C1087110eOb c1087110eOb = this.LLIZ;
        if (c1087110eOb == null) {
            c1087110eOb = null;
        }
        C786410Ut5.LLILZIL(c1087110eOb, 8);
        C1390410mHn c1390410mHn = this.LLIZLLLIL;
        if (c1390410mHn == null) {
            c1390410mHn = null;
        }
        C786410Ut5.LLLZZIL(c1390410mHn, 0);
        C1390410mHn c1390410mHn2 = this.LLIZLLLIL;
        if (c1390410mHn2 == null) {
            c1390410mHn2 = null;
        }
        c1390410mHn2.LIZJ();
        ArrayList arrayList = new ArrayList();
        C1664400tPi c1664400tPi = this.LLJI;
        final AwS46S0600000_29 awS46S0600000_29 = new AwS46S0600000_29((List) arrayList, (List<List<Effect>>) this, (C194350111w) c19754712Qv, (C19754712Qv) effect, (Effect) function2, (Function2<? super Effect, ? super C19754712Qv, Boolean>) function1, (Function1<? super List<List<Effect>>, Unit>) 0);
        c1664400tPi.getClass();
        C2299808zk c2299808zkLIZ = C2296208zA.LIZ();
        InterfaceC2247808rM interfaceC2247808rM = new InterfaceC2247808rM() { // from class: X.111x
            @Override // X.InterfaceC2247808rM
            public final void LIZ(CategoryPageModel categoryPageModel) {
            }

            @Override // X.InterfaceC2247808rM
            public final void LIZJ() {
            }

            @Override // X.InterfaceC2247808rM
            public final void LIZLLL(List<? extends List<? extends Effect>> list) {
                awS46S0600000_29.invoke(list, null, null);
            }

            @Override // X.InterfaceC2247808rM
            public final void LIZIZ(int i, String str) {
                awS46S0600000_29.invoke(null, Integer.valueOf(i), str);
            }
        };
        List<List<Effect>> list = c2299808zkLIZ.LIZJ;
        if (list != null) {
            interfaceC2247808rM.LIZLLL(list);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2247508rJ(interfaceC2247808rM, c2299808zkLIZ, System.currentTimeMillis(), null), 3);
        }
    }
}
