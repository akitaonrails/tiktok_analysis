package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03BW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BW extends AbstractC21673619ry<C03BX> {
    public C752702wn LL;
    public List<C03BY> LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ = true;
    public final /* synthetic */ USAddonOrderCell LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C03BQ c03bq;
        HashMap<String, Object> map;
        String str;
        C03BX c03bx = (C03BX) viewHolder;
        C03BY c03by = (C03BY) C7727030b.LIZ(i, this.LLILLJJLI);
        if (c03by != null) {
            C736680Sv4.LJIJJ(this.LLILZIL.T5(), new AwS580S0100000_1(c03bx, 103));
            USAddonOrderCell uSAddonOrderCell = this.LLILZIL;
            if (uSAddonOrderCell.LLJLL != null && (map = uSAddonOrderCell.LLJLILLLLZIIL) != null && (str = uSAddonOrderCell.T5().LLLLLZL) != null) {
                map.put("more_required_amt", str);
            }
            View view = c03bx.itemView;
            if ((view instanceof C03BQ) && (c03bq = (C03BQ) view) != null) {
                C752702wn c752702wn = this.LL;
                C719102rN c719102rN = c03by.LIZ;
                boolean z = c03by.LIZIZ;
                int i2 = c03by.LIZJ;
                Integer num = c03by.LIZLLL;
                boolean z2 = this.LLILZ;
                USAddonOrderCell uSAddonOrderCell2 = this.LLILZIL;
                c03bq.LIZ(c752702wn, c719102rN, z, i2, num, z2, uSAddonOrderCell2.LLJLL, uSAddonOrderCell2.LLJLLL);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03BQ c03bk;
        int i2 = this.LLILLL;
        if (i2 != 7 && i2 != 9) {
            USAddonOrderCell uSAddonOrderCell = this.LLILZIL;
            if (uSAddonOrderCell.LLJJJIL) {
                if (uSAddonOrderCell.LLJJJJ) {
                    c03bk = new C03BS(viewGroup.getContext());
                } else {
                    c03bk = new C03BT(viewGroup.getContext());
                }
            } else {
                c03bk = new C03BN(viewGroup.getContext());
            }
        } else {
            c03bk = new C03BK(viewGroup.getContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03bk);
            c03bk.setLayoutParams(layoutParams);
        }
        C03BX c03bx = new C03BX(c03bk);
        try {
            View view = c03bx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03bx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03bx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C03BX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03bx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03bx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C03BX.class.getName();
        return c03bx;
    }

    public C03BW(USAddonOrderCell uSAddonOrderCell, C752702wn c752702wn, List list, int i) {
        this.LLILZIL = uSAddonOrderCell;
        this.LL = c752702wn;
        this.LLILLJJLI = list;
        this.LLILLL = i;
    }
}
