package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0llE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370220llE extends AbstractC1370150ll7 {
    public final InterfaceC1369750lkT LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final EnumC1369720lkQ LLILZ;
    public final C1371590lnR LLILZIL;
    public final C1370200llC LLILZLL;
    public final InterfaceC1362720lZ8 LLIZ;
    public List<? extends InterfaceC1370310llN> LLIZLLLIL;
    public List<Integer> LLJ;
    public int LLJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZLLLIL.size();
    }

    @Override // X.AbstractC1370150ll7
    public final void LLLFZ(List<Integer> list) {
        this.LLJ = list;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        InterfaceC1370310llN interfaceC1370310llN = (InterfaceC1370310llN) C13LP.LJJJLZIJ(i, this.LLIZLLLIL);
        if (interfaceC1370310llN != null) {
            return interfaceC1370310llN.LJIJJLI();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1370230llF c1370230llF;
        int adapterPosition;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C1370230llF) && (c1370230llF = (C1370230llF) viewHolder) != null && (adapterPosition = c1370230llF.getAdapterPosition()) >= 0 && adapterPosition < getItemCount()) {
            ((InterfaceC1370310llN) ListProtector.get(this.LLIZLLLIL, adapterPosition)).LJJIJ(c1370230llF.LLILZIL, c1370230llF.itemView, adapterPosition);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C1370230llF c1370230llF;
        if ((viewHolder instanceof C1370230llF) && (c1370230llF = (C1370230llF) viewHolder) != null) {
            Animation animation = c1370230llF.LLILZIL.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            super.onViewDetachedFromWindow(c1370230llF);
        }
    }

    @Override // X.AbstractC1370150ll7
    public final void setData(List<? extends InterfaceC1370310llN> list) {
        this.LLIZLLLIL = list;
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x03f1  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1370220llE.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        RecyclerView.ViewHolder c1370230llF;
        int i3;
        int i4;
        if (i == 1) {
            i2 = R.layout.d89;
        } else {
            i2 = R.layout.d8_;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i2, viewGroup, false);
        if (i == 1) {
            c1370230llF = new C1370240llG(viewTd);
        } else {
            c1370230llF = new C1370230llF(viewTd, this.LL, this.LLILZ, this.LLILZLL, this.LLILZIL.LJIJJ);
        }
        if ((c1370230llF instanceof C1370230llF) && this.LLILZLL == null && (i3 = this.LLILLJJLI) != 0 && (i4 = this.LLILLL) != 0) {
            C1370230llF c1370230llF2 = (C1370230llF) c1370230llF;
            c1370230llF2.LLILZIL.setColorFilter(i4, PorterDuff.Mode.SRC_ATOP);
            c1370230llF2.LLILZLL.setTextColor(i3);
        }
        try {
            View view = c1370230llF.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1370230llF.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1370230llF.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1370230llF.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1370230llF.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1370230llF.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1370230llF.getClass().getName();
        return c1370230llF;
    }

    public C1370220llE(InterfaceC1369750lkT interfaceC1369750lkT, int i, int i2, EnumC1369720lkQ enumC1369720lkQ, C1371590lnR c1371590lnR, C1370200llC c1370200llC, InterfaceC1362720lZ8 interfaceC1362720lZ8) {
        this.LL = interfaceC1369750lkT;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = enumC1369720lkQ;
        this.LLILZIL = c1371590lnR;
        this.LLILZLL = c1370200llC;
        this.LLIZ = interfaceC1362720lZ8;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLIZLLLIL = c13bv;
        this.LLJ = c13bv;
        this.LLJI = -1;
    }
}
