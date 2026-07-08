package X;

import Y.ACListenerS108S0200000_4;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DGB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGB extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final InterfaceC336390DGr LL;
    public List<? extends C0DCV> LLILLJJLI = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C0DGB(InterfaceC336390DGr interfaceC336390DGr) {
        this.LL = interfaceC336390DGr;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        if (obj instanceof C0DC9) {
            return 0;
        }
        if (obj instanceof C0DC8) {
            return 1;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewGroup.MarginLayoutParams layoutParams;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int iIntValue;
        TuxTextView tuxTextView;
        int iIntValue2;
        TuxTextView tuxTextView2;
        int iIntValue3;
        int iIntValue4;
        C0DCV c0dcv = (C0DCV) ListProtector.get(this.LLILLJJLI, i);
        int i4 = 8;
        if (c0dcv instanceof C0DC9) {
            final C0DGI c0dgi = (C0DGI) viewHolder;
            C0DCA c0dca = ((C0DC9) c0dcv).LIZ;
            c0dgi.getClass();
            C0DCR c0dcr = c0dca.LIZ;
            if (Intrinsics.LJFF(c0dcr, C335180DCa.LIZ)) {
                C786410Ut5.LJLLLLLL(0, c0dgi.LLILLJJLI);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLILZLL);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILLL);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILZ);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILZIL);
            } else if (Intrinsics.LJFF(c0dcr, C0DCZ.LIZ)) {
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILLJJLI);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILZLL);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILLL);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILZ);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILZIL);
            } else if (c0dcr instanceof C0DCE) {
                C786410Ut5.LJLLLLLL(0, c0dgi.LLILLJJLI);
                C0DCE c0dce = (C0DCE) c0dcr;
                String str = c0dce.LIZIZ;
                if (str != null && !a0.LJJJIL(str)) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = !z;
                String str2 = c0dce.LIZJ;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean z4 = !z2;
                C786410Ut5.LJLLLLLL(8, c0dgi.LLILZLL);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLILLL);
                c0dgi.LLILLL.setText(c0dce.LIZ);
                TextView textView = c0dgi.LLILZ;
                if (z3) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, textView);
                c0dgi.LLILZ.setText(c0dce.LIZIZ);
                TextView textView2 = c0dgi.LLILZIL;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, textView2);
                c0dgi.LLILZIL.setText(c0dce.LIZJ);
                if (z3) {
                    c0dgi.LLILZIL.setTextAppearance(R.style.zp);
                    TextView textView3 = c0dgi.LLILZIL;
                    if ((textView3 instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) textView3) != null) {
                        tuxTextView2.setTuxFont(71);
                    }
                    TextView textView4 = c0dgi.LLILZIL;
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, textView4.getContext());
                    if (numLIZJ != null) {
                        iIntValue2 = numLIZJ.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    textView4.setTextColor(iIntValue2);
                } else {
                    c0dgi.LLILZIL.setTextAppearance(R.style.zn);
                    TextView textView5 = c0dgi.LLILZIL;
                    if ((textView5 instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView5) != null) {
                        tuxTextView.setTuxFont(52);
                    }
                    TextView textView6 = c0dgi.LLILZIL;
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, textView6.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    textView6.setTextColor(iIntValue);
                }
            } else {
                throw new C1954807lC();
            }
            c0dgi.LLIZ.setText(c0dgi.itemView.getContext().getString(2131857535));
            C0DCQ c0dcq = c0dca.LIZIZ;
            if (Intrinsics.LJFF(c0dcq, C0DCY.LIZ)) {
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJ);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLIZ);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLIZLLLIL);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJI);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJIJIL);
            } else if (c0dcq instanceof C0DCC) {
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJ);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLIZ);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLIZLLLIL);
                c0dgi.LLIZLLLIL.setText(((C0DCC) c0dcq).LIZ);
                TextView textView7 = c0dgi.LLIZLLLIL;
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1q, textView7.getContext());
                if (numLIZJ3 != null) {
                    iIntValue4 = numLIZJ3.intValue();
                } else {
                    iIntValue4 = 0;
                }
                textView7.setTextColor(iIntValue4);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJI);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJIJIL);
            } else if (c0dcq instanceof C0DCD) {
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJ);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLIZ);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLIZLLLIL);
                c0dgi.LLIZLLLIL.setText(((C0DCD) c0dcq).LIZ);
                TextView textView8 = c0dgi.LLIZLLLIL;
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, textView8.getContext());
                if (numLIZJ4 != null) {
                    iIntValue3 = numLIZJ4.intValue();
                } else {
                    iIntValue3 = 0;
                }
                textView8.setTextColor(iIntValue3);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJI);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJIJIL);
            } else {
                throw new C1954807lC();
            }
            C0DCQ c0dcq2 = c0dca.LIZIZ;
            final boolean z5 = !(c0dcq2 instanceof C0DCY);
            c0dgi.LLJILJIL.setEnabled(z5);
            View view = c0dgi.LLJILJIL;
            final int i5 = c0dcq2 instanceof C0DCD ? 1 : 0;
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0DGs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (z5) {
                        c0dgi.LL.SO(i5);
                    }
                }
            }, view);
            C0DCS c0dcs = c0dca.LIZJ;
            if (Intrinsics.LJFF(c0dcs, C335200DCc.LIZ)) {
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJJIJI);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJJI);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJILJILJ);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJILLL);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJJ);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJJIII);
                c0dgi.LLJJIJI.setEnabled(false);
            } else if (Intrinsics.LJFF(c0dcs, C335190DCb.LIZ)) {
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJJIJI);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJJI);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJILJILJ);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJILLL);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJJ);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJJIII);
                c0dgi.LLJJIJI.setEnabled(false);
            } else if (c0dcs instanceof C0DCB) {
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJJIJI);
                C786410Ut5.LJLLLLLL(8, c0dgi.LLJJI);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJILJILJ);
                C0DCB c0dcb = (C0DCB) c0dcs;
                c0dgi.LLJILJILJ.setText(c0dcb.LIZ);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJILLL);
                c0dgi.LLJILLL.setText(c0dcb.LIZIZ);
                c0dgi.LLJJ.setText(c0dcb.LIZJ);
                TextView textView9 = c0dgi.LLJJ;
                String str3 = c0dcb.LIZJ;
                if (str3 != null && !a0.LJJJIL(str3)) {
                    i4 = 0;
                }
                C786410Ut5.LJLLLLLL(i4, textView9);
                C786410Ut5.LJLLLLLL(0, c0dgi.LLJJIII);
                c0dgi.LLJJIJI.setEnabled(true);
            } else {
                throw new C1954807lC();
            }
            C786410Ut5.I7(new ACListenerS108S0200000_4(c0dgi, c0dca, 0), c0dgi.LLJJIJI);
            return;
        }
        if (c0dcv instanceof C0DC8) {
            C0DGU c0dgu = (C0DGU) viewHolder;
            C0DB8 c0db8 = ((C0DC8) c0dcv).LIZ;
            int iLIZ = C336380DGq.LIZ(c0dgu.LL.LL.getResources(), R.dimen.b3_);
            int iLIZ2 = C336380DGq.LIZ(c0dgu.LL.LL.getResources(), R.dimen.b3_);
            ViewGroup.LayoutParams layoutParams2 = c0dgu.LL.LL.getLayoutParams();
            if (!(layoutParams2 instanceof RecyclerView.LayoutParams) || (layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            }
            layoutParams.setMarginStart(iLIZ);
            layoutParams.topMargin = iLIZ2;
            layoutParams.setMarginEnd(iLIZ);
            layoutParams.bottomMargin = 0;
            C786410Ut5.j6(c0dgu.LL.LL, layoutParams);
            C786410Ut5.LJLLLLLL(8, c0dgu.LL.LLILLJJLI);
            if (c0db8 instanceof C0DB6) {
                c0dgu.LLILLJJLI.c3(c0dgu.LL.LLILLL);
                C786410Ut5.LJLLLLLL(0, c0dgu.LL.LLILZIL);
                C786410Ut5.LJLLLLLL(8, c0dgu.LL.LLILZ);
                C786410Ut5.LJLLLLLL(8, c0dgu.LL.LLILLL);
                return;
            }
            if (c0db8 instanceof C0DB9) {
                C786410Ut5.LJLLLLLL(8, c0dgu.LL.LLILZIL);
                C786410Ut5.LJLLLLLL(0, c0dgu.LL.LLILZ);
                C786410Ut5.LJLLLLLL(8, c0dgu.LL.LLILLL);
                C0DB9 c0db9 = (C0DB9) c0db8;
                c0dgu.LL.LLILZ.LIZ(c0db9.LIZ, c0db9.LIZIZ, new AwS548S0100000_4(c0dgu, 90));
                return;
            }
            if (c0db8 instanceof C0DB7) {
                c0dgu.LLILLJJLI.c3(c0dgu.LL.LLILLL);
                C786410Ut5.LJLLLLLL(8, c0dgu.LL.LLILZIL);
                C786410Ut5.LJLLLLLL(8, c0dgu.LL.LLILZ);
                C786410Ut5.LJLLLLLL(0, c0dgu.LL.LLILLL);
                return;
            }
            throw new C1954807lC();
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0dgu;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i == 0) {
            c0dgu = new C0DGI(C786410Ut5.Td(layoutInflaterNe, R.layout.i45, viewGroup, false), this.LL);
        } else {
            View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.i46, viewGroup, false);
            int i2 = R.id.ucp_checkout_payment_bottom_divider;
            View viewLIZ = C1616006Uk.LIZ(R.id.ucp_checkout_payment_bottom_divider, viewTd);
            if (viewLIZ != null) {
                i2 = R.id.ucp_checkout_payment_cashier_container;
                FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.ucp_checkout_payment_cashier_container, viewTd);
                if (frameLayout != null) {
                    i2 = R.id.ucp_checkout_payment_content;
                    if (C1616006Uk.LIZ(R.id.ucp_checkout_payment_content, viewTd) != null) {
                        i2 = R.id.ucp_checkout_payment_error_view;
                        C336440DGw c336440DGw = (C336440DGw) C1616006Uk.LIZ(R.id.ucp_checkout_payment_error_view, viewTd);
                        if (c336440DGw != null) {
                            i2 = R.id.ucp_checkout_payment_loading_container;
                            LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_payment_loading_container, viewTd);
                            if (linearLayout != null) {
                                i2 = R.id.ucp_checkout_payment_subtitle;
                                if (C1616006Uk.LIZ(R.id.ucp_checkout_payment_subtitle, viewTd) != null) {
                                    i2 = R.id.ucp_checkout_payment_title;
                                    if (C1616006Uk.LIZ(R.id.ucp_checkout_payment_title, viewTd) != null) {
                                        c0dgu = new C0DGU(new C0DGV((CardView) viewTd, viewLIZ, frameLayout, c336440DGw, linearLayout), this.LL);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i2)));
        }
        try {
            View view = c0dgu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dgu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dgu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0dgu.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dgu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dgu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0dgu.getClass().getName();
        return c0dgu;
    }
}
