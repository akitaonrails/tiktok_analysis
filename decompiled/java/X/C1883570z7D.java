package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883570z7D extends PagerAdapter {
    public final InterfaceC1883090z6R LLILLJJLI;
    public final InterfaceC1883470z73 LLILLL;
    public final List<View> LLILZ = new ArrayList();
    public final List<C1883100z6S> LLILZIL = new ArrayList();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1189004ky());
    public boolean LLIZ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    public final void LJJIJIL(int i) {
        ViewGroup viewGroup;
        Unit unit;
        ObjectAnimator objectAnimatorOfFloat;
        View view = (View) C13LP.LJJJLZIJ(i, this.LLILZ);
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.cgt)) != null) {
            try {
                if (Intrinsics.LJFF(((HashMap) this.LLILZLL.getValue()).get(Integer.valueOf(i)), Boolean.TRUE)) {
                    unit = null;
                    if (this.LLIZ) {
                        if (viewGroup.getChildCount() > 0) {
                            this.LLILLJJLI.getEventCenter().LIZIZ(Integer.valueOf(i), "__mix_base_tab_bottom_sheet_btn_show");
                            objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 1.0f);
                        }
                    } else {
                        objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 0.0f);
                    }
                    if (objectAnimatorOfFloat != null) {
                        C786410Ut5.Pd(objectAnimatorOfFloat);
                        unit = Unit.LIZ;
                    }
                } else {
                    C786410Ut5.R4(0.0f, viewGroup);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public C1883570z7D(InterfaceC1883090z6R interfaceC1883090z6R, C1883450z71 c1883450z71) {
        this.LLILLJJLI = interfaceC1883090z6R;
        this.LLILLL = c1883450z71;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        Object obj = ListProtector.get(this.LLILZ, i);
        C1883100z6S c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i, this.LLILZIL);
        if (c1883100z6S != null) {
            c1883100z6S.LJIILJJIL(viewGroup);
        }
        return obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C1883100z6S c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i, this.LLILZIL);
        if (c1883100z6S != null) {
            c1883100z6S.LJIIJJI(viewGroup);
        }
    }
}
