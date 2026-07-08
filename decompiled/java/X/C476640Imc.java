package X;

import Y.AAListenerS318S0100000_7;
import Y.AUListenerS217S0200000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS408S0200000_7;

/* JADX INFO: renamed from: X.0Imc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476640Imc {
    public static final C476640Imc LIZ = new C476640Imc();

    public static List LIZLLL(long j) {
        LinkedList linkedList = new LinkedList();
        if (j == 0) {
            linkedList.add(0);
        } else {
            while (j > 0) {
                long j2 = 10;
                linkedList.addFirst(Integer.valueOf((int) (j % j2)));
                j /= j2;
            }
        }
        return linkedList;
    }

    public static final void LIZIZ(C013C c013c, Function0<Unit> function0) {
        if (!c013c.element) {
            c013c.element = true;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static void LIZ(Context context, LinearLayout linearLayout, final int i, final int i2, final int i3, final int i4, final long j, final boolean z, final Function0 function0, long j2) {
        final RecyclerView recyclerView = new RecyclerView(context);
        C786410Ut5.p6(recyclerView, new LinearLayout.LayoutParams(-2, i4));
        recyclerView.setAdapter(new AbstractC21673619ry<RecyclerView.ViewHolder>() { // from class: X.03AK
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return 400;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i5) {
                if (viewHolder instanceof C03AL) {
                    ((C03AL) viewHolder).LL.setText(String.valueOf(i5 % 10));
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i5) {
                C03AL c03al = new C03AL(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h82, viewGroup, false));
                try {
                    View view = c03al.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c03al.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c03al.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C03AL.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i5);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c03al.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c03al.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C03AL.class.getName();
                return c03al;
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setOverScrollMode(2);
        linearLayout.addView(recyclerView);
        HandlerHook.viewPostDelay(recyclerView, new Runnable() { // from class: X.0Icl
            public final void LIZ() {
                Function0<Unit> function02;
                int i5 = i + 100;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                linearLayoutManager.scrollToPositionWithOffset(i5, 0);
                int i6 = (i3 * 10) + (((i2 - i) + 10) % 10);
                if (j < 1) {
                    linearLayoutManager.scrollToPositionWithOffset(i5 + i6, 0);
                    if (!z || (function02 = function0) == null) {
                        return;
                    }
                    function02.invoke();
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, i6 * i4);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS217S0200000_7(new C817403Hg(), recyclerView, 4));
                if (z) {
                    valueAnimatorOfFloat.addListener(new AAListenerS318S0100000_7(function0, 4));
                }
                valueAnimatorOfFloat.start();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RollingAnimUtil@775f.addDigit$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RollingAnimUtil@775f.addDigit$2");
            }
        }, j2);
    }

    public static final void LIZJ(final int i, final int i2, final int i3, final long j, final long j2, final Context context, final LinearLayout linearLayout, final List list, final List list2, final List list3, final List list4, final Function0 function0, final C013C c013c, final boolean z) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        boolean z2;
        C786410Ut5.LJJJJJL(linearLayout);
        if (i3 > 0 && list.size() < list2.size()) {
            list.add(ListProtector.get(list2, list.size()));
        }
        int size = list.size();
        boolean z3 = false;
        int i4 = 0;
        while (i4 < size) {
            if (z) {
                C476640Imc c476640Imc = LIZ;
                int size2 = list.size();
                c476640Imc.getClass();
                if ((size2 - i4) % 3 == 0 && i4 != 0 && size2 != i4) {
                    C16F5 c16f5 = new C16F5(context, null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i);
                    layoutParams.gravity = 17;
                    layoutParams.setMarginStart((int) (((double) (-i)) * 0.2d));
                    C786410Ut5.y6(c16f5, layoutParams);
                    c16f5.setText(",");
                    c16f5.setGravity(81);
                    c16f5.setIncludeFontPadding(z3);
                    c16f5.setTextColor(-1);
                    linearLayout.addView(c16f5);
                }
            }
            long j3 = ((long) i4) * 120;
            long j4 = j - j3;
            if (i4 < list2.size()) {
                iIntValue = ((Number) ListProtector.get(list2, i4)).intValue();
            } else {
                iIntValue = 0;
            }
            if (i4 < list3.size()) {
                iIntValue2 = ((Number) ListProtector.get(list3, i4)).intValue();
            } else {
                iIntValue2 = 1;
            }
            if (i4 == list.size() - 1 && i3 == i2 - 1) {
                C476640Imc c476640Imc2 = LIZ;
                if (i4 < list4.size()) {
                    iIntValue4 = ((Number) ListProtector.get(list4, i4)).intValue();
                } else {
                    iIntValue4 = 0;
                }
                if (i4 == list.size() - 1 && i3 == i2 - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AwS408S0200000_7 awS408S0200000_7 = new AwS408S0200000_7(c013c, (C013C) function0, (Function0<Unit>) 35);
                c476640Imc2.getClass();
                LIZ(context, linearLayout, iIntValue4, iIntValue, iIntValue2, i, j4, z2, awS408S0200000_7, j3);
            } else {
                C476640Imc c476640Imc3 = LIZ;
                if (i4 < list4.size()) {
                    iIntValue3 = ((Number) ListProtector.get(list4, i4)).intValue();
                } else {
                    iIntValue3 = 0;
                }
                if (i4 == list.size() - 1 && i3 == i2 - 1) {
                    z3 = true;
                }
                AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(228);
                c476640Imc3.getClass();
                LIZ(context, linearLayout, iIntValue3, iIntValue, iIntValue2, i, j4, z3, aFwS193S0000000_7, j3);
            }
            i4++;
            z3 = false;
        }
        if (i3 < i2 - 1) {
            HandlerHook.viewPostDelay(linearLayout, new Runnable() { // from class: X.0Imd
                public final void LIZ() {
                    LinearLayout linearLayout2 = linearLayout;
                    List<Integer> list5 = list;
                    List<Integer> list6 = list2;
                    boolean z4 = z;
                    Context context2 = context;
                    int i5 = i;
                    long j5 = j;
                    List<Integer> list7 = list3;
                    int i6 = i2;
                    List<Integer> list8 = list4;
                    long j6 = j2;
                    C013C c013c2 = c013c;
                    C476640Imc.LIZJ(i5, i6, i3 + 1, j5, j6, context2, linearLayout2, list5, list6, list7, list8, function0, c013c2, z4);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RollingAnimUtil@775f.runCounter$runPhase$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RollingAnimUtil@775f.runCounter$runPhase$2");
                }
            }, j2);
        }
    }
}
