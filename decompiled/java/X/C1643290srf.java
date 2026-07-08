package X;

import Y.ACListenerS24S0301000_25;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0srf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643290srf extends AbstractC21673619ry<C1643310srh> {
    public final int LL;
    public final String LLILLJJLI;
    public final List<C1643300srg> LLILLL;
    public final List<Integer> LLILZ;
    public final Function1<C1643220srY, Unit> LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        C1643310srh c1643310srh = (C1643310srh) viewHolder;
        C1643300srg c1643300srg = (C1643300srg) ListProtector.get(this.LLILLL, i);
        if (c1643300srg.LJIIJJI != null) {
            C443530HaJ c443530HaJ = new C443530HaJ(c1643310srh.itemView.getResources(), c1643300srg.LJIIJJI);
            c443530HaJ.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c1643310srh.LL.setBackground(c443530HaJ);
        } else if (Intrinsics.LJFF(c1643300srg.LIZIZ, "")) {
            C1324750kZt.LIZIZ(c1643310srh.LL, R.drawable.c43);
            c1643310srh.LL.setBackground(null);
        } else {
            c1643310srh.LL.setBackground(null);
            C1324750kZt.LJIIIZ(c1643310srh.LL, c1643300srg.LIZIZ, -1, -1);
        }
        if (c1643300srg.LJIIJ && !this.LLILZ.contains(Integer.valueOf(i))) {
            this.LLILZ.add(Integer.valueOf(i));
        }
        C786410Ut5.I7(new ACListenerS24S0301000_25(this, c1643300srg, c1643310srh, i, 0), c1643310srh.itemView);
        FrameLayout frameLayout = c1643310srh.LLILLL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1643300srg.LJI))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1643300srg.LJII))));
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams);
        int i2 = (c1643300srg.LJI - 4) - 4;
        if (c1643300srg.LJIIIZ == EnumC1154660g9Y.LOCAL) {
            if (Intrinsics.LJFF(c1643300srg.LIZJ, "")) {
                FrameLayout frameLayout2 = c1643310srh.LLILZ;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                layoutParams2.gravity = 17;
                C786410Ut5.a6(frameLayout2, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1643300srg.LJIIIIZZ))));
                Context context = c1643310srh.LLILZ.getContext();
                if (context != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.dy, context)) != null) {
                    gradientDrawable.setColor(numLIZJ3.intValue());
                }
                c1643310srh.LLILZ.setBackground(gradientDrawable);
                C1322110kVd c1322110kVd = c1643310srh.LL;
                if (c1322110kVd != null) {
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    layoutParams3.gravity = 17;
                    C786410Ut5.c7(c1322110kVd, layoutParams3);
                }
            } else {
                C1322110kVd c1322110kVd2 = c1643310srh.LL;
                if (c1322110kVd2 != null) {
                    C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    C1331090kk7 c1331090kk7 = new C1331090kk7(c1322110kVd2.getContext().getResources());
                    c1331090kk7.LJIIZILJ = c1331100kk8LIZLLL;
                    c1322110kVd2.setHierarchy(c1331090kk7.LIZ());
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                    layoutParams4.gravity = 17;
                    C786410Ut5.c7(c1322110kVd2, layoutParams4);
                }
            }
        } else {
            c1643310srh.LLILZ.setBackgroundColor(0);
            C1322110kVd c1322110kVd3 = c1643310srh.LL;
            if (c1322110kVd3 != null) {
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))));
                layoutParams5.gravity = 17;
                C786410Ut5.c7(c1322110kVd3, layoutParams5);
            }
            FrameLayout frameLayout3 = c1643310srh.LLILZ;
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams6.gravity = 17;
            C786410Ut5.a6(frameLayout3, layoutParams6);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        if (c1643300srg.LJIIJ && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, c1643310srh.LL.getContext())) != null) {
            gradientDrawable2.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), numLIZJ2.intValue());
        }
        gradientDrawable2.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1643300srg.LJIIIIZZ))));
        if (c1643300srg.LJIIIZ == EnumC1154660g9Y.REMOTE && (numLIZJ = C1308910kAL.LIZJ(R.attr.dy, c1643310srh.LLILLL.getContext())) != null) {
            gradientDrawable2.setColor(numLIZJ.intValue());
        }
        c1643310srh.LLILLL.setBackground(gradientDrawable2);
        FrameLayout frameLayout4 = c1643310srh.LLILLL;
        frameLayout4.setOnTouchListener(new ViewOnTouchListenerC1657570tEh(0.9f, 100L, frameLayout4));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1643310srh c1643310srh = new C1643310srh(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.du5, viewGroup, false));
        try {
            View view = c1643310srh.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1643310srh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1643310srh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1643310srh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1643310srh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1643310srh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1643310srh.class.getName();
        return c1643310srh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1643290srf(int i, String str, List<C1643300srg> list, List<Integer> list2, Function1<? super C1643220srY, Unit> function1) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = function1;
    }
}
