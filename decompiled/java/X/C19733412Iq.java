package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19733412Iq extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C12J0 LL;
    public final RecyclerView LLILLJJLI;
    public C09AY LLILZIL;
    public AwS573S0100000_29 LLILZLL;
    public C19732412Ig LLIZ;
    public AwS608S0100000_29 LLIZLLLIL;
    public boolean LLJI;
    public final C19732812Ik LLJIJIL;
    public final List<C19734412Ja> LLILLL = new ArrayList();
    public final ArrayList<ComposerBeauty> LLILZ = new ArrayList<>();
    public boolean LLJ = true;
    public final AwS643S0100000_29 LLJILJIL = new AwS643S0100000_29(this, 150);
    public final AwS573S0100000_29 LLJILJILJ = new AwS573S0100000_29(this, 1065);
    public final AwS643S0100000_29 LLJILLL = new AwS643S0100000_29(this, 148);
    public final AwS643S0100000_29 LLJJ = new AwS643S0100000_29(this, 151);
    public final AwS608S0100000_29 LLJJI = new AwS608S0100000_29(this, 804);
    public final AwS643S0100000_29 LLJJIII = new AwS643S0100000_29(this, 149);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public final void LLLFZ(ComposerBeauty composerBeauty) {
        int i = 0;
        for (C19734412Ja c19734412Ja : (ArrayList) this.LLILLL) {
            if ((c19734412Ja instanceof C12JQ) && Intrinsics.LJFF(((C12JQ) c19734412Ja).LIZIZ, composerBeauty)) {
                if (i >= 0 && i < ((ArrayList) this.LLILLL).size()) {
                    notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LLLIIIIL(boolean z) {
        this.LLJ = z;
        if (!this.LLJIJIL.LJJII) {
            return;
        }
        for (C19734412Ja c19734412Ja : this.LLILLL) {
            if (c19734412Ja instanceof C12JT) {
                ((C12JT) c19734412Ja).LIZJ = z;
            } else if (c19734412Ja instanceof C12JQ) {
                ((C12JQ) c19734412Ja).LIZJ = z;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C19734412Ja) ListProtector.get(this.LLILLL, i)).LIZ;
    }

    public C19733412Iq(C12J0 c12j0, C19517811Xs c19517811Xs) {
        this.LL = c12j0;
        this.LLILLJJLI = c19517811Xs;
        this.LLJIJIL = c12j0.LIZLLL;
    }

    public static void LLLI(C19733412Iq c19733412Iq, List list) {
        ComposerBeauty composerBeauty;
        ComposerBeauty composerBeauty2;
        boolean zBooleanValue;
        c19733412Iq.LLILZ.clear();
        c19733412Iq.LLILZ.addAll(list);
        ((ArrayList) c19733412Iq.LLILLL).clear();
        c19733412Iq.LLJ = true;
        if (c19733412Iq.LLJIJIL.LJJII && (composerBeauty2 = (ComposerBeauty) C13LP.LJJJLL(list)) != null && !C12HP.LIZLLL(composerBeauty2) && composerBeauty2.getCategoryExtra() != null && composerBeauty2.getCategoryExtra().showSwitch) {
            AwS608S0100000_29 awS608S0100000_29 = c19733412Iq.LLIZLLLIL;
            if (awS608S0100000_29 != null) {
                zBooleanValue = ((Boolean) awS608S0100000_29.invoke(composerBeauty2.getCategoryId())).booleanValue();
            } else {
                zBooleanValue = c19733412Iq.LL.LJIIIIZZ;
            }
            c19733412Iq.LLJ = zBooleanValue;
            ListProtector.add(c19733412Iq.LLILLL, 0, new C12JT(composerBeauty2.getCategoryId(), c19733412Iq.LLJ));
        }
        if (c19733412Iq.LLJIJIL.LJJIII && (composerBeauty = (ComposerBeauty) C13LP.LJJJLL(list)) != null && composerBeauty.getCategoryExtra() != null && composerBeauty.isBeautyMode()) {
            ListProtector.add(c19733412Iq.LLILLL, 0, new C12JR(false));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ComposerBeauty composerBeauty3 = (ComposerBeauty) it2.next();
            if (composerBeauty3.isBeautyMode()) {
                ((ArrayList) c19733412Iq.LLILLL).add(new C12JS(composerBeauty3));
            } else {
                ((ArrayList) c19733412Iq.LLILLL).add(new C12JQ(composerBeauty3, c19733412Iq.LLJ));
            }
        }
        c19733412Iq.notifyDataSetChanged();
    }

    public final void LLLII(String str, boolean z) {
        for (C19734412Ja c19734412Ja : this.LLILLL) {
            if (c19734412Ja instanceof C12JR) {
                C12JR c12jr = (C12JR) c19734412Ja;
                c12jr.LIZJ = z;
                if (str.length() > 0) {
                    c12jr.LIZIZ = str;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0322  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, int r15) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19733412Iq.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        View viewTd;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        int i2 = C19733512Ir.LLJI;
                        C19732812Ik c19732812Ik = this.LLJIJIL;
                        if (c19732812Ik.LJIILL != 0) {
                            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), c19732812Ik.LJIILL, viewGroup, false);
                        } else {
                            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.uj, viewGroup, false);
                        }
                        C19733312Ip c19733312IpLIZ = C19733112In.LIZ(viewTd.getContext(), c19732812Ik);
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19733312IpLIZ);
                        c19733312IpLIZ.setLayoutParams(layoutParams);
                        c19733312IpLIZ.setId(R.id.l54);
                        TextView textView = c19733312IpLIZ.getTextView();
                        if (textView != null) {
                            textView.setTextSize(1, c19732812Ik.LIZ);
                        }
                        ((ViewGroup) viewTd.findViewById(R.id.i6d)).addView(c19733312IpLIZ, 0);
                        viewTd.findViewById(R.id.l56).setBackgroundResource(c19732812Ik.LJIJ);
                        C19733512Ir c19733512Ir = new C19733512Ir(viewTd, c19732812Ik);
                        c19733512Ir.LLIZLLLIL = this.LLJILJIL;
                        c19733512Ir.LLJ = this.LLJILJILJ;
                        viewHolder = c19733512Ir;
                    } else {
                        int i3 = C12J4.LLJILJILJ;
                        C19732812Ik c19732812Ik2 = this.LLJIJIL;
                        View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ul, viewGroup, false);
                        C19733312Ip c19733312IpLIZ2 = C19733112In.LIZ(viewTd2.getContext(), c19732812Ik2);
                        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19733312IpLIZ2);
                        c19733312IpLIZ2.setLayoutParams(layoutParams2);
                        c19733312IpLIZ2.setId(R.id.l54);
                        C1324800kZy imageView = c19733312IpLIZ2.getImageView();
                        int i4 = C19733512Ir.LLJI;
                        imageView.setBackground(C19734312Iz.LIZ(c19732812Ik2.LIZLLL, R.color.et, viewTd2.getContext(), c19732812Ik2.LJ));
                        c19733312IpLIZ2.getImageView().setActualImageResource(R.drawable.bwp);
                        TextView textView2 = c19733312IpLIZ2.getTextView();
                        if (textView2 != null) {
                            textView2.setTextSize(1, c19732812Ik2.LIZ);
                        }
                        TextView textView3 = c19733312IpLIZ2.getTextView();
                        if (textView3 != null) {
                            textView3.setText(viewTd2.getContext().getResources().getString(0));
                        }
                        ((ViewGroup) viewTd2.findViewById(R.id.i6d)).addView(c19733312IpLIZ2, 0);
                        C12J4 c12j4 = new C12J4(viewTd2, c19732812Ik2);
                        c12j4.LLJILJIL = this.LLJJI;
                        viewHolder = c12j4;
                    }
                } else {
                    int i5 = C12J8.LLJILJILJ;
                    C19732812Ik c19732812Ik3 = this.LLJIJIL;
                    View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.uk, viewGroup, false);
                    C19733312Ip c19733312IpLIZ3 = C19733112In.LIZ(viewTd3.getContext(), c19732812Ik3);
                    ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19733312IpLIZ3);
                    c19733312IpLIZ3.setLayoutParams(layoutParams3);
                    c19733312IpLIZ3.setId(R.id.l54);
                    C1324800kZy imageView2 = c19733312IpLIZ3.getImageView();
                    int i6 = C19733512Ir.LLJI;
                    imageView2.setBackground(C19734312Iz.LIZ(c19732812Ik3.LIZLLL, R.color.et, viewTd3.getContext(), c19732812Ik3.LJ));
                    c19733312IpLIZ3.getImageView().setActualImageResource(R.drawable.bwo);
                    TextView textView4 = c19733312IpLIZ3.getTextView();
                    if (textView4 != null) {
                        textView4.setTextSize(1, c19732812Ik3.LIZ);
                    }
                    TextView textView5 = c19733312IpLIZ3.getTextView();
                    if (textView5 != null) {
                        textView5.setText(viewTd3.getContext().getResources().getString(0));
                    }
                    ((ViewGroup) viewTd3.findViewById(R.id.i6d)).addView(c19733312IpLIZ3, 0);
                    C12J8 c12j8 = new C12J8(viewTd3, c19732812Ik3);
                    c12j8.LLJILJIL = this.LLJJIII;
                    viewHolder = c12j8;
                }
            } else {
                int i7 = C12JE.LLJILLL;
                C19732812Ik c19732812Ik4 = this.LLJIJIL;
                View viewTd4 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.uj, viewGroup, false);
                C19733312Ip c19733312IpLIZ4 = C19733112In.LIZ(viewTd4.getContext(), c19732812Ik4);
                ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-2, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19733312IpLIZ4);
                c19733312IpLIZ4.setLayoutParams(layoutParams4);
                c19733312IpLIZ4.setId(R.id.l54);
                C1324800kZy imageView3 = c19733312IpLIZ4.getImageView();
                int i8 = C19733512Ir.LLJI;
                imageView3.setBackground(C19734312Iz.LIZ(c19732812Ik4.LIZLLL, R.color.et, viewTd4.getContext(), c19732812Ik4.LJ));
                TextView textView6 = c19733312IpLIZ4.getTextView();
                if (textView6 != null) {
                    textView6.setTextSize(1, c19732812Ik4.LIZ);
                }
                ((ViewGroup) viewTd4.findViewById(R.id.i6d)).addView(c19733312IpLIZ4, 0);
                viewTd4.findViewById(R.id.l56).setBackgroundResource(c19732812Ik4.LJIJ);
                C12JE c12je = new C12JE(viewTd4, c19732812Ik4);
                c12je.LLJILJILJ = this.LLJILLL;
                viewHolder = c12je;
            }
        } else {
            int i9 = C19734212Iy.LLJI;
            C19734212Iy c19734212Iy = new C19734212Iy(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.um, viewGroup, false), this, this.LLJIJIL);
            c19734212Iy.LLILZLL = this.LLJJ;
            viewHolder = c19734212Iy;
        }
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
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
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
        C20612085q.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }
}
