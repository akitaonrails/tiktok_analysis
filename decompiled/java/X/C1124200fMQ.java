package X;

import Y.ACListenerS120S0200000_17;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0fMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124200fMQ extends AbstractC21673619ry<C1124220fMS> {
    public List<C1124240fMU> LL = C13BV.INSTANCE;
    public C1128630fTZ LLILLJJLI;
    public LiveNewGiftBottomWidget LLILLL;
    public View LLILZ;
    public int LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C1124240fMU) ListProtector.get(this.LL, i)).LIZJ;
    }

    public final void LLLFZ(int i, boolean z) {
        C1128630fTZ c1128630fTZ;
        MutableLiveData<Integer> mutableLiveData;
        if (!z && (c1128630fTZ = this.LLILLJJLI) != null && (mutableLiveData = c1128630fTZ.LIZIZ) != null) {
            mutableLiveData.setValue(Integer.valueOf(i));
        }
        this.LLILZIL = i;
        if (i == 5) {
            LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.LLILLL;
            if (liveNewGiftBottomWidget != null) {
                liveNewGiftBottomWidget.D1(false);
            }
        } else {
            LiveNewGiftBottomWidget liveNewGiftBottomWidget2 = this.LLILLL;
            if (liveNewGiftBottomWidget2 != null) {
                liveNewGiftBottomWidget2.D1(true);
            }
        }
        for (C1124240fMU c1124240fMU : this.LL) {
            if (c1124240fMU.LIZJ == i) {
                c1124240fMU.LJFF = false;
                C0UX6 c0ux6 = c1124240fMU.LJI;
                if (c0ux6 != null) {
                    RedDotExtensionKt.LIZ(c0ux6);
                }
                notifyItemChanged(this.LL.indexOf(c1124240fMU), "item_select");
                String str = c1124240fMU.LIZ;
                if (str != null) {
                    if (C1123380fL6.LIZIZ()) {
                        C1123380fL6.LIZJ(205, true);
                    }
                    C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                    Integer numValueOf = Integer.valueOf(i);
                    c1128760fTm.getClass();
                    C1128760fTm.LJJJJJ(numValueOf, str);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1124220fMS c1124220fMS = (C1124220fMS) viewHolder;
        c1124220fMS.I5((C1124240fMU) ListProtector.get(this.LL, i));
        C786410Ut5.l8(c1124220fMS.LLILLJJLI, new ACListenerS120S0200000_17((C1124240fMU) ListProtector.get(this.LL, i), this, 39));
        if (((Integer) c1124220fMS.LLILLJJLI.getTag()).intValue() == this.LLILZIL) {
            C16F5 c16f5 = c1124220fMS.LLILLJJLI;
            this.LLILZ = c16f5;
            c16f5.setTextColor(ColorProtector.parseColor("#E6FFFFFF"));
            return;
        }
        c1124220fMS.LLILLJJLI.setTextColor(ColorProtector.parseColor("#88FFFFFF"));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1124220fMS c1124220fMS = new C1124220fMS(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gr2, viewGroup, false));
        c1124220fMS.LLILLJJLI.setTextSize(13.0f);
        c1124220fMS.LLILLJJLI.setGravity(17);
        c1124220fMS.LLILLJJLI.setTag(Integer.valueOf(i));
        try {
            View view = c1124220fMS.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1124220fMS.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1124220fMS.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1124220fMS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1124220fMS.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1124220fMS.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1124220fMS.class.getName();
        return c1124220fMS;
    }
}
