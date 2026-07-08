package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03An, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C799903An extends AbstractC21673619ry<C800003Ao> {
    public final View LL;
    public MainOrderSetting LLILLJJLI;
    public List<C719102rN> LLILLL;
    public Boolean LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL;
    public final /* synthetic */ C815203Gk LLIZ;

    public C799903An() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C719102rN> list = this.LLILLL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C800003Ao c800003Ao = (C800003Ao) viewHolder;
        super.onViewRecycled(c800003Ao);
        c800003Ao.LL.i0();
    }

    public C799903An(C815203Gk c815203Gk, View view) {
        this.LLIZ = c815203Gk;
        this.LL = view;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = -1;
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(c815203Gk, 35));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        String str3;
        BillStarling billStarling;
        BillStarlingText billStarlingText;
        C800003Ao c800003Ao = (C800003Ao) viewHolder;
        List<C719102rN> list = this.LLILLL;
        if (list != null) {
            C815203Gk c815203Gk = this.LLIZ;
            if (i < list.size()) {
                C719102rN c719102rN = (C719102rN) ListProtector.get(list, i);
                List<? extends Map<String, ? extends Object>> listLJIIJJI = C1697810uHb.LJIIJJI(c815203Gk.LLILLJJLI.LLLZLZ.LIZ("c09380.d59539"), c815203Gk.LLILLJJLI.LLLZLZ.LIZ("c09380.d5453"));
                C03AZ c03az = c800003Ao.LL;
                Fragment fragment = c815203Gk.LLILLL;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = c815203Gk.LLILLJJLI;
                BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
                if (billInfoData != null && (billStarling = billInfoData.starlingTexts) != null && (billStarlingText = billStarling.gwpTitle) != null) {
                    str = billStarlingText.text;
                } else {
                    str = null;
                }
                C817603Hi c817603Hi = orderSubmitAssemViewModel.LLLZLZ;
                int i2 = this.LLILZIL;
                HashMap<String, Object> map = orderSubmitAssemViewModel.LLLIL;
                if (map != null) {
                    obj = map.get("previous_page");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                HashMap<String, Object> map2 = c815203Gk.LLILLJJLI.LLLIL;
                if (map2 != null) {
                    obj2 = map2.get("entrance_info");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str3 = (String) obj2;
                } else {
                    str3 = null;
                }
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = c815203Gk.LLILLJJLI;
                HashMap<String, Object> map3 = orderSubmitAssemViewModel2.LLLIL;
                boolean z = c815203Gk.LLILZIL;
                C03AZ.e0(c03az, c719102rN, fragment, str, c817603Hi, new AwS580S0100000_1(c815203Gk, 49), i2, "item_details", str3, str2, map3, orderSubmitAssemViewModel2, z, z, 32);
                c800003Ao.LL.j0(c719102rN, this.LLILLJJLI, listLJIIJJI, (C801803Bg) this.LLILZLL.getValue(), c815203Gk.LLILLJJLI, this.LLILZ, c815203Gk.LLILLL, true);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        C800003Ao c800003Ao = new C800003Ao(C03XA.LIZJ(context, R.layout.b24, viewGroup, false));
        try {
            View view = c800003Ao.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c800003Ao.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c800003Ao.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C800003Ao.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c800003Ao.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c800003Ao.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C800003Ao.class.getName();
        return c800003Ao;
    }
}
