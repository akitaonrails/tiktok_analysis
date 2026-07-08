package X;

import Y.ACListenerS72S0300000_5;
import Y.ALAdapterS0S0300000_5;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHSLFilter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0EF4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EF4 extends AbstractC21673619ry<C0EF6> {
    public final List<C0EF5> LL;
    public C0EF7 LLILLJJLI;
    public C0EF5 LLILLL;
    public boolean LLILZ;

    public final boolean LLLFZ() {
        List<C0EF5> list = this.LL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C0EF5> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJ) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C0EF5 LLLI() {
        C0EF5 c0ef5 = this.LLILLL;
        if (c0ef5 != null) {
            return C0EF5.LIZ(c0ef5);
        }
        return null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0EF4(List<C0EF5> list) {
        this.LL = list;
    }

    public static boolean LLLII(C0EF5 c0ef5) {
        if (c0ef5.LIZ == EnumC355950DxR.HSL) {
            NLESegmentHSLFilter nLESegmentHSLFilterDynamicCast = NLESegmentHSLFilter.dynamicCast((NLENode) c0ef5.LJI);
            if (nLESegmentHSLFilterDynamicCast == null || !C0BZ6.LIZIZ(nLESegmentHSLFilterDynamicCast)) {
                return false;
            }
        } else if (c0ef5.LJIIIIZZ == 0.0f) {
            return false;
        }
        return true;
    }

    public final void LLLIIIIL(int i) {
        C0EF5 c0ef5;
        if (this.LL.indexOf(this.LLILLL) == i || (c0ef5 = (C0EF5) C13LP.LJJJLZIJ(i, this.LL)) == null) {
            return;
        }
        c0ef5.LJFF = true;
        notifyItemChanged(i);
        C0EF5 c0ef52 = this.LLILLL;
        if (c0ef52 != null) {
            c0ef52.LJFF = false;
            notifyItemChanged(this.LL.indexOf(c0ef52));
        }
        this.LLILLL = c0ef5;
    }

    public final void LLLIILIL(Map<EnumC355950DxR, C351400Dq6> map) {
        int i = 0;
        for (C0EF5 c0ef5 : this.LL) {
            int i2 = i + 1;
            NLESegmentFilter nLESegmentFilter = null;
            if (i >= 0) {
                C0EF5 c0ef52 = c0ef5;
                float f = 0.0f;
                if (map.containsKey(c0ef52.LIZ)) {
                    C351400Dq6 c351400Dq6 = map.get(c0ef52.LIZ);
                    if (c351400Dq6 != null) {
                        nLESegmentFilter = c351400Dq6.LIZ;
                    }
                    c0ef52.LJI = nLESegmentFilter;
                    C351400Dq6 c351400Dq62 = map.get(c0ef52.LIZ);
                    if (c351400Dq62 != null) {
                        f = c351400Dq62.LIZJ;
                    }
                    c0ef52.LJIIIIZZ = f;
                } else {
                    c0ef52.LJI = null;
                    c0ef52.LJIIIIZZ = 0.0f;
                }
                c0ef52.LJ = LLLII(c0ef52);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String effectName;
        int i3;
        Integer numValueOf;
        Integer numValueOf2;
        Drawable drawableLIZ;
        Integer numValueOf3;
        int i4;
        C0EF6 c0ef6 = (C0EF6) viewHolder;
        C0EF5 c0ef5 = (C0EF5) ListProtector.get(this.LL, i);
        View view = c0ef6.LLILLJJLI;
        if (c0ef5.LJ) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        TuxTextView tuxTextView = c0ef6.LL;
        if (c0ef5.LIZJ != 0) {
            effectName = c0ef6.itemView.getContext().getString(c0ef5.LIZJ);
        } else {
            effectName = c0ef5.LIZ.getEffectName();
        }
        tuxTextView.setText(effectName);
        TuxIconView tuxIconView = c0ef6.LLILLL;
        EnumC355950DxR enumC355950DxR = c0ef5.LIZ;
        EnumC355950DxR enumC355950DxR2 = EnumC355950DxR.HSL;
        if (enumC355950DxR == enumC355950DxR2) {
            if (c0ef5.LJFF && !C357780E0y.LIZ()) {
                i3 = R.raw.icon_color_adjust_hsl_dark;
            } else {
                i3 = R.raw.icon_color_adjust_hsl;
            }
        } else if (enumC355950DxR == EnumC355950DxR.FADE) {
            if (c0ef5.LJFF && !C357780E0y.LIZ()) {
                i3 = R.raw.icon_color_adjust_fade_dark;
            } else {
                i3 = R.raw.icon_color_adjust_fade;
            }
        } else {
            i3 = c0ef5.LIZIZ;
        }
        EnumC355950DxR enumC355950DxR3 = c0ef5.LIZ;
        Integer numLIZJ = null;
        if (enumC355950DxR3 != enumC355950DxR2 && enumC355950DxR3 != EnumC355950DxR.FADE) {
            if (c0ef5.LJFF && !C357780E0y.LIZ()) {
                i4 = R.attr.a0o;
            } else {
                i4 = R.attr.a00;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i3;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c419910GdJ.LJ = numValueOf;
        tuxIconView.setTuxIcon(c419910GdJ);
        FrameLayout frameLayout = c0ef6.LLILZ;
        if (C357780E0y.LIZ()) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.dz);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            if (c0ef5.LJFF) {
                numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            } else {
                numValueOf3 = null;
            }
            c384050F3z.LIZLLL = numValueOf3;
            if (c0ef5.LJFF) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, tuxIconView.getContext());
            }
            c384050F3z.LJ = numLIZJ;
            drawableLIZ = c384050F3z.LIZ(tuxIconView.getContext());
        } else {
            C384050F3z c384050F3z2 = new C384050F3z();
            if (c0ef5.LJFF) {
                numValueOf2 = Integer.valueOf(R.attr.a1h);
            } else {
                numValueOf2 = Integer.valueOf(R.attr.dz);
            }
            c384050F3z2.LIZIZ = numValueOf2;
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            drawableLIZ = c384050F3z2.LIZ(tuxIconView.getContext());
        }
        frameLayout.setBackground(drawableLIZ);
        C786410Ut5.I7(new ACListenerS72S0300000_5(this, c0ef5, c0ef6, 2), c0ef6.itemView);
        C1295960jpS c1295960jpS = c0ef6.LLILZIL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
            C786410Ut5.LLD(8, c1295960jpS);
        }
        if (c0ef5.LIZ == EnumC355950DxR.AUTO_ADJUST && this.LLILZ && !c0ef5.LJFF) {
            C1295960jpS c1295960jpS2 = new C1295960jpS(c0ef6.itemView.getContext());
            c1295960jpS2.setAnimation(R.raw.tux_lottie_common_creation_editor_auto_adjust_icon);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            layoutParams.gravity = 17;
            C786410Ut5.s6(c1295960jpS2, layoutParams);
            c1295960jpS2.addAnimatorListener(new ALAdapterS0S0300000_5(c0ef6, this, c1295960jpS2, 1));
            c0ef6.LLILZ.addView(c1295960jpS2);
            c1295960jpS2.playAnimation();
            c0ef6.LLILZIL = c1295960jpS2;
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd;
        if (C357780E0y.LIZ()) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bz2, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bz1, viewGroup, false);
        }
        C0EF6 c0ef6 = new C0EF6(viewTd);
        try {
            View view = c0ef6.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ef6.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ef6.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0EF6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ef6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ef6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0EF6.class.getName();
        return c0ef6;
    }
}
