package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class DialogC747730TUt extends DialogC1389100mFg {
    public final String LLJILJIL;
    public final List<EffectAttribution> LLJILJILJ;
    public View LLJILLL;
    public TuxIconView LLJJ;
    public RecyclerView LLJJI;
    public final C01GW LLJJIII;
    public final ACListenerS147S0100000_12 LLJJIJI;

    @Override // X.DialogC1389100mFg, X.C19EK, android.app.Dialog
    public final void onStart() {
        FrameLayout.LayoutParams layoutParams;
        super.onStart();
        View viewFindViewById = findViewById(R.id.fpl);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(null);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            bottomSheetBehaviorFrom.setPeekHeight((int) (((double) C12ES.LJIIIIZZ(getContext())) * 0.7d));
            bottomSheetBehaviorFrom.setSkipCollapsed(false);
        }
        View view = this.LLJILLL;
        ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
            return;
        }
        layoutParams.gravity = 80;
        View view2 = this.LLJILLL;
        if (view2 != null) {
            C786410Ut5.W5(view2, layoutParams);
        }
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJ(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.c3b);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        View viewFindViewById = findViewById(R.id.trr);
        if (viewFindViewById != null) {
            this.LLJILLL = viewFindViewById;
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.jzi);
            if (tuxIconView != null) {
                this.LLJJ = tuxIconView;
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.t0e);
                if (recyclerView != null) {
                    this.LLJJI = recyclerView;
                    TuxIconView tuxIconView2 = this.LLJJ;
                    if (tuxIconView2 != null) {
                        C786410Ut5.a9(tuxIconView2, this.LLJJIJI);
                    }
                    RecyclerView recyclerView2 = this.LLJJI;
                    if (recyclerView2 != null) {
                        final List<EffectAttribution> list = this.LLJILJILJ;
                        final AwS378S0200000_12 awS378S0200000_12 = new AwS378S0200000_12(recyclerView2, this, 124);
                        recyclerView2.setAdapter(new AbstractC21673619ry<C747710TUr>(list, awS378S0200000_12) { // from class: X.0TUq
                            public final List<EffectAttribution> LL;
                            public final Function1<EffectAttribution, Boolean> LLILLJJLI;

                            @Override // X.AbstractC21673619ry
                            public final int getItemCount() {
                                return this.LL.size();
                            }

                            {
                                this.LL = list;
                                this.LLILLJJLI = awS378S0200000_12;
                            }

                            @Override // X.AbstractC21673619ry
                            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                                C747710TUr c747710TUr = (C747710TUr) viewHolder;
                                EffectAttribution effectAttribution = (EffectAttribution) ListProtector.get(this.LL, i);
                                TuxTextView tuxTextView = c747710TUr.LLILLJJLI;
                                String str = effectAttribution.name;
                                C1360520lVa c1360520lVa = new C1360520lVa();
                                String str2 = "";
                                if (str == null) {
                                    str = "";
                                }
                                c1360520lVa.LIZ.append((CharSequence) str);
                                tuxTextView.setText(c1360520lVa.LIZ);
                                c747710TUr.LLILLL.setText(C747720TUs.LIZ(effectAttribution, c747710TUr.itemView.getContext()));
                                TuxTextView tuxTextView2 = c747710TUr.LLILZ;
                                String str3 = effectAttribution.license;
                                C1360520lVa c1360520lVa2 = new C1360520lVa();
                                if (str3 != null) {
                                    str2 = str3;
                                }
                                c1360520lVa2.LIZ.append((CharSequence) str2);
                                tuxTextView2.setText(c1360520lVa2.LIZ);
                                c747710TUr.itemView.setOnLongClickListener(new ViewOnLongClickListenerC785900UsG(c747710TUr, effectAttribution, 2));
                            }

                            @Override // X.AbstractC21673619ry
                            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                                C747710TUr c747710TUr = new C747710TUr(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f7v, viewGroup, false), this.LLILLJJLI);
                                try {
                                    View view = c747710TUr.itemView;
                                    if (view != null) {
                                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                c747710TUr.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                                try {
                                    if (c747710TUr.itemView.getParent() != null) {
                                        try {
                                            SettingsManager.LIZLLL().getClass();
                                        } catch (Exception e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                        }
                                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                            stringBuffer.append(C747710TUr.class.getName());
                                            stringBuffer.append(" parent ");
                                            stringBuffer.append(viewGroup.getClass().getName());
                                            stringBuffer.append(" viewType ");
                                            stringBuffer.append(i);
                                            C1AF0.LIZJ(stringBuffer.toString());
                                            ViewGroup viewGroup2 = (ViewGroup) c747710TUr.itemView.getParent();
                                            if (viewGroup2 != null) {
                                                C786410Ut5.LJJJLZIJ(c747710TUr.itemView, viewGroup2);
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    C2081408Dk.LIZ(e3);
                                    C2344809Gs.LIZ(e3);
                                }
                                C20612085q.LIZ = C747710TUr.class.getName();
                                return c747710TUr;
                            }
                        });
                        return;
                    }
                    return;
                }
                throw new ExceptionInInitializerError();
            }
            throw new ExceptionInInitializerError();
        }
        throw new ExceptionInInitializerError();
    }

    public DialogC747730TUt(Context context, String str, List<EffectAttribution> list) {
        super(context, R.style.ab7);
        this.LLJILJIL = str;
        this.LLJILJILJ = list;
        this.LLJJIII = C452501pT.LIZIZ(new AwS556S0100000_12(context, 1003));
        this.LLJJIJI = new ACListenerS147S0100000_12(this, 480);
    }
}
