package X;

import Y.ACListenerS40S0201000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386640FDy extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final int LL;
    public final Function2<Integer, C0FDZ, Unit> LLILLJJLI;
    public final Function2<Integer, C0FDZ, Unit> LLILLL;
    public final C386590FDt LLILZ;
    public final C1361400lX0 LLILZIL;
    public final int LLILZLL;
    public List<C0FDZ> LLIZ;
    public final Drawable LLIZLLLIL;
    public final Drawable LLJ;
    public final Drawable LLJI;
    public final TuxIconDrawable LLJIJIL;
    public final Integer LLJILJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0FDZ c0fdz = (C0FDZ) C13LP.LJJJLZIJ(i, this.LLIZ);
        if (c0fdz == null) {
            return;
        }
        int i2 = 4;
        Boolean boolValueOf = null;
        List<String> list = null;
        if (viewHolder instanceof C386650FDz) {
            C386400FDa c386400FDa = c0fdz.LIZLLL;
            if (c386400FDa != null) {
                list = c386400FDa.LIZIZ;
            }
            if (list != null && !list.isEmpty()) {
                C383710F2r c383710F2r = ((C386650FDz) viewHolder).LLILLJJLI;
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
                c1331670kl3LJIIJ.LIZLLL = true;
                c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LJIIJ.LJJI(c383710F2r);
                c1331670kl3LJIIJ.LJIIJJI();
            }
            C386650FDz c386650FDz = (C386650FDz) viewHolder;
            View view = c386650FDz.LLILLL;
            if (c0fdz.LIZIZ) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view);
            C786410Ut5.I7(new ACListenerS40S0201000_5(i, c0fdz, this, 2), c386650FDz.LL);
            C786410Ut5.a9(c386650FDz.LLILZ, new ACListenerS40S0201000_5(i, c0fdz, this, 3));
            C386400FDa c386400FDa2 = c0fdz.LIZLLL;
            if (c386400FDa2 != null) {
                EnumC1641420soe enumC1641420soe = c386400FDa2.LJ;
                Integer numValueOf = Integer.valueOf(c386400FDa2.LIZLLL);
                c386650FDz.getClass();
                int i3 = C0FE1.LIZ[enumC1641420soe.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            C337180DJs.LIZ(c386650FDz.LLILZIL);
                            C337180DJs.LIZ(c386650FDz.LLILZ);
                        } else {
                            C337180DJs.LIZ(c386650FDz.LLILZIL);
                            C337180DJs.LIZJ(c386650FDz.LLILZ);
                        }
                    } else {
                        c386650FDz.LLILZIL.setProgress(100);
                        C337180DJs.LIZ(c386650FDz.LLILZIL);
                    }
                } else {
                    C337180DJs.LIZJ(c386650FDz.LLILZIL);
                    C337180DJs.LIZ(c386650FDz.LLILZ);
                }
                if (numValueOf != null) {
                    c386650FDz.LLILZIL.setProgress(numValueOf.intValue());
                    return;
                }
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C0FE0)) {
            return;
        }
        C0FE0 c0fe0 = (C0FE0) viewHolder;
        boolean z = c0fdz.LIZIZ;
        CustomCaptionTemplateData customCaptionTemplateData = c0fdz.LIZJ;
        if (customCaptionTemplateData != null) {
            boolValueOf = Boolean.valueOf(customCaptionTemplateData.hasEdited);
        }
        C786410Ut5.LLLLZLL(c0fe0.LLILLL, 0);
        if (z && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C786410Ut5.LJLLLLLL(0, c0fe0.LLILZ);
            C786410Ut5.LLLLLLZZ(c0fe0.LLILZIL, 0);
        } else {
            C786410Ut5.LJLLLLLL(8, c0fe0.LLILZ);
            C786410Ut5.LLLLLLZZ(c0fe0.LLILZIL, 8);
        }
        View view2 = c0fe0.LLILLJJLI;
        if (c0fdz.LIZIZ) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, view2);
        C786410Ut5.I7(new ACListenerS40S0201000_5(i, c0fdz, this, 4), c0fe0.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        RecyclerView.ViewHolder c386650FDz;
        ViewGroup.LayoutParams layoutParams;
        if (i == 1) {
            i2 = R.layout.c03;
        } else {
            i2 = R.layout.c07;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL), i2, viewGroup, false);
        viewTd.setBackground(this.LLIZLLLIL);
        if (this.LL >= 0 && (layoutParams = viewTd.getLayoutParams()) != null) {
            layoutParams.height = this.LL;
        }
        if (i == 1) {
            c386650FDz = new C0FE0(viewTd, this.LLJ, this.LLJI, this.LLJIJIL);
        } else {
            c386650FDz = new C386650FDz(viewTd, this.LLJ, this.LLILZLL, this.LLJI, this.LLJILJIL);
        }
        try {
            View view = c386650FDz.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c386650FDz.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c386650FDz.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c386650FDz.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c386650FDz.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c386650FDz.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c386650FDz.getClass().getName();
        return c386650FDz;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0FDt] */
    public C386640FDy(Context context, int i, Function2 function2, Function2 function22) {
        int iIntValue;
        ?? r0 = new AbstractC339510DSr<C0FDZ>() { // from class: X.0FDt
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C0FDZ c0fdz, C0FDZ c0fdz2) {
                return Intrinsics.LJFF(c0fdz, c0fdz2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C0FDZ c0fdz, C0FDZ c0fdz2) {
                return Intrinsics.LJFF(c0fdz.LIZ, c0fdz2.LIZ);
            }
        };
        this.LL = i;
        this.LLILLJJLI = function2;
        this.LLILLL = function22;
        this.LLILZ = r0;
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.y0);
        this.LLILZIL = c1361400lX0;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        this.LLILZLL = iIntValue;
        this.LLIZ = C13BV.INSTANCE;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        this.LLIZLLLIL = c384050F3z.LIZ(context);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zc);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        this.LLJ = c384050F3z2.LIZ(context);
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.uk);
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z3.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z3.LJFF = Integer.valueOf(R.attr.zi);
        this.LLJI = c384050F3z3.LIZ(context);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_pen_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        this.LLJIJIL = c419910GdJ.LIZ(context);
        this.LLJILJIL = C1308910kAL.LIZJ(R.attr.a1e, c1361400lX0);
    }
}
