package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428840Gri extends LinearLayout {
    public C1295960jpS LL;
    public FrameLayout LLILLJJLI;
    public final boolean LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS == null || c1295960jpS.isAnimating()) {
            return;
        }
        c1295960jpS.playAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
    }

    public C428840Gri(Context context, boolean z) {
        super(context, null, 0);
        boolean zBooleanValue = ((Boolean) C07B3.LIZ.getValue()).booleanValue();
        this.LLILLL = zBooleanValue;
        setOrientation(1);
        if (z && ((Boolean) C0A05.LIZ.getValue()).booleanValue()) {
            int i = (int) (64 * getResources().getDisplayMetrics().density);
            int i2 = (int) (8 * getResources().getDisplayMetrics().density);
            if (zBooleanValue) {
                C1295960jpS c1295960jpS = new C1295960jpS(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i);
                layoutParams.gravity = 1;
                layoutParams.setMargins(0, i2, 0, 0);
                C786410Ut5.s6(c1295960jpS, layoutParams);
                c1295960jpS.setRepeatCount(-1);
                c1295960jpS.setAnimation(R.raw.tux_lottie_common_ec_search_usresult_loading);
                this.LL = c1295960jpS;
                addView(c1295960jpS, 0);
            } else {
                FrameLayout frameLayout = new FrameLayout(getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i);
                layoutParams2.setMargins(0, i2, 0, 0);
                C786410Ut5.a6(frameLayout, layoutParams2);
                this.LLILLJJLI = frameLayout;
                C1295960jpS c1295960jpS2 = new C1295960jpS(getContext());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
                layoutParams3.gravity = 17;
                C786410Ut5.s6(c1295960jpS2, layoutParams3);
                c1295960jpS2.setRepeatCount(-1);
                C786410Ut5.Wb(c1295960jpS2, 1.5f);
                C786410Ut5.vc(c1295960jpS2, 1.5f);
                c1295960jpS2.setAnimation(R.raw.tux_lottie_common_ec_search_usresult_loading);
                c1295960jpS2.playAnimation();
                this.LL = c1295960jpS2;
                FrameLayout frameLayout2 = this.LLILLJJLI;
                if (frameLayout2 != null) {
                    frameLayout2.addView(c1295960jpS2);
                }
                addView(this.LLILLJJLI, 0);
            }
        }
        RecyclerView recyclerView = new RecyclerView(getContext());
        C786410Ut5.p6(recyclerView, new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new GridLayoutManager(2, 1, recyclerView.getContext(), false));
        recyclerView.setAdapter(new AbstractC21673619ry<C7961039b>() { // from class: X.039a
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return 6;
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bq2, viewGroup, false);
                RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.039b
                };
                try {
                    View view = viewHolder.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewHolder.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C7961039b.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i3);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C7961039b.class.getName();
                return viewHolder;
            }

            @Override // X.AbstractC21673619ry
            public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i3) {
            }
        });
        addView(recyclerView);
    }
}
