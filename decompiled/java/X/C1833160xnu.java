package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833160xnu extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<? extends AbstractC1825390xbN> LL;
    public final Function1<AbstractC1825450xbT, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LL, i);
        if (obj instanceof C1825400xbO) {
            return 0;
        }
        if (obj instanceof C1825430xbR) {
            return 1;
        }
        if (obj instanceof C1825410xbP) {
            return 2;
        }
        if (obj instanceof C1825440xbS) {
            return 3;
        }
        if (obj instanceof C1825420xbQ) {
            return 4;
        }
        throw new C1954807lC();
    }

    public C1833160xnu(List list, C1825310xbF c1825310xbF) {
        this.LL = list;
        this.LLILLJJLI = c1825310xbF;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC1825390xbN abstractC1825390xbN = (AbstractC1825390xbN) ListProtector.get(this.LL, i);
        if (!(viewHolder instanceof C1833270xo5)) {
            if (viewHolder instanceof C1833210xnz) {
                final C1833210xnz c1833210xnz = (C1833210xnz) viewHolder;
                final C1825430xbR c1825430xbR = (C1825430xbR) abstractC1825390xbN;
                c1833210xnz.itemView.setSelected(c1825430xbR.LIZ);
                C786410Ut5.D7(c1833210xnz.LL.LLJJJIL, null);
                c1833210xnz.LL.LLJJJIL.setChecked(c1825430xbR.LIZ);
                C786410Ut5.D7(c1833210xnz.LL.LLJJJIL, new CompoundButton.OnCheckedChangeListener() { // from class: X.0xnw
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C1833210xnz c1833210xnz2 = c1833210xnz;
                        c1833210xnz2.itemView.setSelected(c1833210xnz2.LL.LLJJJIL.isChecked());
                        c1825430xbR.LIZ = c1833210xnz.itemView.isSelected();
                        c1833210xnz.LLILLJJLI.invoke(c1825430xbR);
                    }
                });
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xo2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c1833210xnz.LL.LLJJJIL.setChecked(!r1.isChecked());
                    }
                }, c1833210xnz.itemView);
                C0TGC.LIZLLL(c1833210xnz.LL.LLJJJJ, "ttlive_pcs_onboarding_message_left.9.png", new C741960T8o());
                C0TGC.LIZLLL(c1833210xnz.LL.LLJJJJJIL, "ttlive_pcs_onboarding_message_right.9.png", new C741970T8p());
                return;
            }
            if (viewHolder instanceof C1833140xns) {
                final C1833140xns c1833140xns = (C1833140xns) viewHolder;
                final C1825410xbP c1825410xbP = (C1825410xbP) abstractC1825390xbN;
                c1833140xns.itemView.setSelected(c1825410xbP.LIZ);
                c1833140xns.LL.LLJJJJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                ConstraintLayout constraintLayout = c1833140xns.LL.LLJJJJ;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    C786410Ut5.W5(constraintLayout, marginLayoutParams);
                    C786410Ut5.D7(c1833140xns.LL.LLJJJIL, null);
                    c1833140xns.LL.LLJJJIL.setChecked(c1825410xbP.LIZ);
                    C786410Ut5.D7(c1833140xns.LL.LLJJJIL, new CompoundButton.OnCheckedChangeListener() { // from class: X.0xnr
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            C1833140xns c1833140xns2 = c1833140xns;
                            c1833140xns2.itemView.setSelected(c1833140xns2.LL.LLJJJIL.isChecked());
                            c1825410xbP.LIZ = c1833140xns.itemView.isSelected();
                            c1833140xns.LLILLJJLI.invoke(c1825410xbP);
                            if (c1833140xns.itemView.isSelected()) {
                                c1833140xns.LL.LLJJJJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                                ConstraintLayout constraintLayout2 = c1833140xns.LL.LLJJJJ;
                                ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                                if (layoutParams2 != null) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                    marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                                    C786410Ut5.W5(constraintLayout2, marginLayoutParams2);
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            c1833140xns.LL.LLJJJJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                            ConstraintLayout constraintLayout3 = c1833140xns.LL.LLJJJJ;
                            ViewGroup.LayoutParams layoutParams3 = constraintLayout3.getLayoutParams();
                            if (layoutParams3 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                                marginLayoutParams3.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                                C786410Ut5.W5(constraintLayout3, marginLayoutParams3);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    });
                    C0TGC.LIZIZ(c1833140xns.LL.LLJJJJLIIL, "ttlive_pcs_onboarding_ic_booking.png");
                    C0TGC.LIZIZ(c1833140xns.LL.LLJJJJJIL, "ttlive_pcs_onboarding_booking.png");
                    C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xnt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            c1833140xns.LL.LLJJJIL.setChecked(!r1.isChecked());
                        }
                    }, c1833140xns.itemView);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            if (viewHolder instanceof C1833220xo0) {
                final C1833220xo0 c1833220xo0 = (C1833220xo0) viewHolder;
                final C1825440xbS c1825440xbS = (C1825440xbS) abstractC1825390xbN;
                c1833220xo0.itemView.setSelected(c1825440xbS.LIZ);
                C786410Ut5.D7(c1833220xo0.LL.LLJJJIL, null);
                c1833220xo0.LL.LLJJJIL.setChecked(c1825440xbS.LIZ);
                C786410Ut5.D7(c1833220xo0.LL.LLJJJIL, new CompoundButton.OnCheckedChangeListener() { // from class: X.0xnx
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        C1833220xo0 c1833220xo02 = c1833220xo0;
                        c1833220xo02.itemView.setSelected(c1833220xo02.LL.LLJJJIL.isChecked());
                        c1825440xbS.LIZ = c1833220xo0.itemView.isSelected();
                        c1833220xo0.LLILLJJLI.invoke(c1825440xbS);
                    }
                });
                C0TGC.LIZIZ(c1833220xo0.LL.LLJJJJJIL, "ttlive_pcs_onboarding_ic_form.png");
                C0TGC.LIZIZ(c1833220xo0.LL.LLJJJJ, "ttlive_pcs_onboarding_form.png");
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xo3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c1833220xo0.LL.LLJJJIL.setChecked(!r1.isChecked());
                    }
                }, c1833220xo0.itemView);
                return;
            }
            if (!(viewHolder instanceof C1833200xny)) {
                return;
            }
            final C1833200xny c1833200xny = (C1833200xny) viewHolder;
            final C1825420xbQ c1825420xbQ = (C1825420xbQ) abstractC1825390xbN;
            c1833200xny.itemView.setSelected(c1825420xbQ.LIZ);
            C786410Ut5.D7(c1833200xny.LL.LLJJJIL, null);
            c1833200xny.LL.LLJJJIL.setChecked(c1825420xbQ.LIZ);
            C786410Ut5.D7(c1833200xny.LL.LLJJJIL, new CompoundButton.OnCheckedChangeListener() { // from class: X.0xnv
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    IHostResource iHostResource;
                    C1833200xny c1833200xny2 = c1833200xny;
                    c1833200xny2.itemView.setSelected(c1833200xny2.LL.LLJJJIL.isChecked());
                    c1825420xbQ.LIZ = c1833200xny.itemView.isSelected();
                    if (c1825420xbQ.LIZ && (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) != null) {
                        iHostResource.ud2("tiktok_live_pcs_onboarding_preview");
                    }
                    c1833200xny.LLILLJJLI.invoke(c1825420xbQ);
                }
            });
            C0TGC.LIZIZ(c1833200xny.LL.LLJJJJ, "ttlive_pcs_onboarding_img_course.png");
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xo1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c1833200xny.LL.LLJJJIL.setChecked(!r1.isChecked());
                }
            }, c1833200xny.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1833210xnz;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            c1833210xnz = new C1833200xny((AbstractC1833300xo8) C1842040y2E.LIZ(layoutInflaterNe, R.layout.gtj, viewGroup, false, null), this.LLILLJJLI);
                        } else {
                            throw new IllegalArgumentException("Invalid view type");
                        }
                    } else {
                        c1833210xnz = new C1833220xo0((AbstractC1833290xo7) C1842040y2E.LIZ(layoutInflaterNe, R.layout.gtl, viewGroup, false, null), this.LLILLJJLI);
                    }
                } else {
                    c1833210xnz = new C1833140xns((AbstractC1833260xo4) C1842040y2E.LIZ(layoutInflaterNe, R.layout.gti, viewGroup, false, null), this.LLILLJJLI);
                }
            } else {
                c1833210xnz = new C1833210xnz((AbstractC1833280xo6) C1842040y2E.LIZ(layoutInflaterNe, R.layout.gtk, viewGroup, false, null), this.LLILLJJLI);
            }
        } else {
            final AbstractC1833320xoA abstractC1833320xoA = (AbstractC1833320xoA) C1842040y2E.LIZ(layoutInflaterNe, R.layout.gtm, viewGroup, false, null);
            c1833210xnz = new RecyclerView.ViewHolder(abstractC1833320xoA) { // from class: X.0xo5
                {
                    super(abstractC1833320xoA.LLILZ);
                }
            };
        }
        try {
            View view = c1833210xnz.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1833210xnz.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1833210xnz.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1833210xnz.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1833210xnz.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1833210xnz.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1833210xnz.getClass().getName();
        return c1833210xnz;
    }
}
