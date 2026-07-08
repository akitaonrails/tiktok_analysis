package X;

import Y.ACListenerS48S0201000_21;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.LiveRepostAddNoteChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369810lkZ extends AbstractC1366540lfI {
    public final Context LL;
    public final InterfaceC1368050lhj LLILLJJLI;
    public final int LLILZ;
    public final BaseSharePackage LLILZLL;
    public final C1369610lkF LLIZ;
    public final boolean LLILLL = false;
    public final int LLILZIL = -1;
    public List<? extends InterfaceC1369790lkX> LLIZLLLIL = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZLLLIL.size();
    }

    @Override // X.AbstractC1366540lfI
    public final void LLLI(InterfaceC1369790lkX interfaceC1369790lkX) {
        int iIndexOf = this.LLIZLLLIL.indexOf(interfaceC1369790lkX);
        if (iIndexOf != -1) {
            ArrayList arrayList = new ArrayList(this.LLIZLLLIL);
            ListProtector.remove(arrayList, iIndexOf);
            this.LLIZLLLIL = arrayList;
            notifyItemRemoved(iIndexOf);
        }
    }

    @Override // X.AbstractC1366540lfI
    public final void setData(List<? extends InterfaceC1369790lkX> list) {
        this.LLIZLLLIL = list;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC1366540lfI
    public final void LLLFZ(LiveRepostAddNoteChannel liveRepostAddNoteChannel, int i) {
        ArrayList arrayList = new ArrayList(this.LLIZLLLIL);
        ListProtector.add(arrayList, i, liveRepostAddNoteChannel);
        this.LLIZLLLIL = arrayList;
        notifyItemInserted(i);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1369820lka c1369820lka = (C1369820lka) viewHolder;
        ((InterfaceC1369790lkX) ListProtector.get(this.LLIZLLLIL, i)).LJIJI(c1369820lka.LL, false);
        c1369820lka.LLILLL = (InterfaceC1369790lkX) ListProtector.get(this.LLIZLLLIL, i);
        c1369820lka.LLILLJJLI.setText(((InterfaceC1369790lkX) ListProtector.get(this.LLIZLLLIL, i)).label());
        C786410Ut5.I7(new ACListenerS48S0201000_21(i, this, c1369820lka, 5), c1369820lka.itemView);
        if (((InterfaceC1369790lkX) ListProtector.get(this.LLIZLLLIL, i)).LIZJ()) {
            C786410Ut5.T4(c1369820lka.itemView, ((InterfaceC1369790lkX) ListProtector.get(this.LLIZLLLIL, i)).LJJL());
        } else {
            C786410Ut5.T4(c1369820lka.itemView, 1.0f);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z;
        LinearLayout.LayoutParams layoutParams;
        int iIntValue = 0;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d8b, viewGroup, false);
        C1369820lka c1369820lka = new C1369820lka(viewTd);
        if (this.LLILLL) {
            C786410Ut5.LLLLZLL(c1369820lka.LLILLJJLI, 8);
        }
        viewTd.getLayoutParams().width = this.LL.getResources().getDimensionPixelOffset(R.dimen.afy);
        if (this.LLILZIL > 0) {
            c1369820lka.LLILLJJLI.getLayoutParams().width = -2;
            c1369820lka.LLILLJJLI.setMaxWidth(this.LLILZIL);
        } else {
            c1369820lka.LLILLJJLI.getLayoutParams().width = -1;
        }
        InterfaceC1369830lkb interfaceC1369830lkb = C1370370llT.LJIIJ;
        if (interfaceC1369830lkb != null && interfaceC1369830lkb.LIZJ() != null) {
            C1369900lki.LIZIZ(c1369820lka, null);
        }
        if (this.LLIZ != null) {
            c1369820lka.LLILLJJLI.setTextColorRes(R.attr.a1h);
            ViewGroup.LayoutParams layoutParams2 = c1369820lka.LLILLJJLI.getLayoutParams();
            if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.topMargin = this.LLIZ.LJIIIIZZ;
            }
        } else {
            TuxTextView tuxTextView = c1369820lka.LLILLJJLI;
            Integer numValueOf = Integer.valueOf(this.LLILZ);
            if (numValueOf.intValue() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (Boolean.valueOf(z).booleanValue() || (numValueOf = C1308910kAL.LIZJ(R.attr.s3, viewGroup.getContext())) != null) {
                iIntValue = numValueOf.intValue();
            }
            tuxTextView.setTextColor(iIntValue);
        }
        float dimensionPixelSize = this.LL.getResources().getDimensionPixelSize(R.dimen.b4);
        RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.kc7);
        if (radiusLayout != null) {
            radiusLayout.LIZ(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        try {
            View view = c1369820lka.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1369820lka.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1369820lka.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1369820lka.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1369820lka.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1369820lka.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1369820lka.class.getName();
        return c1369820lka;
    }

    public C1369810lkZ(Context context, InterfaceC1368050lhj interfaceC1368050lhj, int i, BaseSharePackage baseSharePackage, C1369610lkF c1369610lkF) {
        this.LL = context;
        this.LLILLJJLI = interfaceC1368050lhj;
        this.LLILZ = i;
        this.LLILZLL = baseSharePackage;
        this.LLIZ = c1369610lkF;
    }
}
