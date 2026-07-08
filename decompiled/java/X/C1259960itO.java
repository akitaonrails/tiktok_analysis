package X;

import Y.AObserverS223S0100000_19;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0itO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259960itO extends AbstractC683590Qrd<BaseNotice> {
    public final MusNotificationDetailActivity LL;
    public final InterfaceC1259970itP LLILLJJLI;
    public final InterfaceC1259970itP LLILLL;
    public int LLILZ;
    public final C01GW LLILZIL;
    public final HashMap<String, BaseNotice> LLILZLL;
    public final int LLIZ;

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        BaseNotice baseNotice;
        List<BaseNotice> data = getData();
        if (data != null && (baseNotice = (BaseNotice) ListProtector.get(data, i)) != null && baseNotice.templateNotice != null) {
            return -10000;
        }
        return 0;
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ViewOnClickListenerC1906680ziU viewOnClickListenerC1906680ziU;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof ViewOnClickListenerC1906680ziU) && (viewOnClickListenerC1906680ziU = (ViewOnClickListenerC1906680ziU) viewHolder) != null) {
            viewOnClickListenerC1906680ziU.onAttached();
        }
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(252);
        C1908260zl2 c1908260zl2 = C1908300zl6.LIZ;
        if (c1908260zl2 != null) {
            aFwS271S0000000_28.invoke(c1908260zl2);
        }
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        ViewOnClickListenerC1906680ziU viewOnClickListenerC1906680ziU;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof ViewOnClickListenerC1906680ziU) && (viewOnClickListenerC1906680ziU = (ViewOnClickListenerC1906680ziU) viewHolder) != null) {
            viewOnClickListenerC1906680ziU.onDetached();
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<BaseNotice> list) {
        if (list != null) {
            list = this.LLILLJJLI.LIZJ(list);
        }
        super.setData(list);
    }

    @Override // X.AbstractC683590Qrd
    public final void setDataAfterLoadMore(List<BaseNotice> list) {
        if (list != null) {
            list = this.LLILLJJLI.LIZJ(list);
        }
        super.setDataAfterLoadMore(list);
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BaseNotice baseNotice;
        boolean z;
        List<T> list = this.mmItems;
        if (list != 0) {
            baseNotice = (BaseNotice) ListProtector.get(list, i);
        } else {
            baseNotice = null;
        }
        boolean z2 = true;
        int i2 = 0;
        if (i > this.LLILZ - 1) {
            z = true;
        } else {
            z = false;
        }
        if (baseNotice != null) {
            if (z || this.LLILZLL.get(baseNotice.nid) == null) {
                z2 = z;
            }
            if (viewHolder != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.itemView.getLayoutParams();
                int i3 = marginLayoutParams.leftMargin;
                if (i == 0) {
                    i2 = this.LLIZ;
                }
                marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            if (getBasicItemViewType(i) == -10000) {
                this.LLILLL.LIZ(viewHolder, baseNotice, i, z2);
            } else {
                this.LLILLJJLI.LIZ(viewHolder, baseNotice, i, z2);
            }
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLJFF;
        if (i == -10000) {
            viewHolderLJFF = this.LLILLL.LJFF(viewGroup);
        } else {
            viewHolderLJFF = this.LLILLJJLI.LJFF(viewGroup);
        }
        if (viewHolderLJFF instanceof ViewOnClickListenerC1906680ziU) {
            ((ViewOnClickListenerC1906680ziU) viewHolderLJFF).mClickListener = this.LL;
        }
        return viewHolderLJFF;
    }

    public C1259960itO(MusNotificationDetailActivity musNotificationDetailActivity, InterfaceC1259970itP interfaceC1259970itP, InterfaceC1259970itP interfaceC1259970itP2, int i) {
        super(false);
        this.LL = musNotificationDetailActivity;
        this.LLILLJJLI = interfaceC1259970itP;
        this.LLILLL = interfaceC1259970itP2;
        this.LLILZ = i;
        C01GW c01gwLIZJ = C0DTR.LIZJ(new AwS563S0100000_19(this, 5));
        this.LLILZIL = c01gwLIZJ;
        this.LLILZLL = new HashMap<>(this.LLILZ);
        C844470XAv.LIZ.getClass();
        this.LLIZ = (int) C12ES.LIZJ(8.0f, C844470XAv.LIZ());
        ((LiveData) ((NotificationDetailVM) c01gwLIZJ.getValue()).LLILLJJLI.getValue()).observe(musNotificationDetailActivity, new AObserverS223S0100000_19(this, 5));
    }
}
