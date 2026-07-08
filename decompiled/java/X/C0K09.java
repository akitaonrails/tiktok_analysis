package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0K09, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K09 extends C09AY implements Function1<C514600KGc, Unit> {
    public final /* synthetic */ C0K0B LL;
    public final /* synthetic */ List<SubPackageSummary> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K09(C0K0B c0k0b, List<SubPackageSummary> list) {
        super(1);
        this.LL = c0k0b;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514600KGc c514600KGc) {
        int size;
        C0KH1 c0kh1;
        TemplateListData templateListData;
        List<SubPackagePrivilege> list;
        String str;
        TextView textView;
        Map<String, List<SubscriptionProductDetailWithTemplateInfo>> map;
        C514600KGc c514600KGc2 = c514600KGc;
        if (c514600KGc2 != null && (map = c514600KGc2.LIZ) != null) {
            size = map.size();
        } else {
            size = 0;
        }
        if (size <= 1) {
            C21546719Ub c21546719Ub = this.LL.LL;
            if (c21546719Ub != null) {
                C500260Jjc.LJIILIIL(c21546719Ub);
            }
        } else {
            C21546719Ub c21546719Ub2 = this.LL.LL;
            if (c21546719Ub2 != null) {
                C500260Jjc.LLFFF(c21546719Ub2);
            }
        }
        if (c514600KGc2 != null && (c0kh1 = c514600KGc2.LIZLLL) != null && (templateListData = c0kh1.LIZ) != null && (list = templateListData.packagePrivilegeList) != null && !list.isEmpty() && !this.LL.LLILLJJLI) {
            List<SubPackageSummary> list2 = this.LLILLJJLI;
            Iterator<SubPackagePrivilege> it2 = list.iterator();
            while (it2.hasNext()) {
                SubPackageSummary subPackageSummary = it2.next().packageSummary;
                if (subPackageSummary != null) {
                    list2.add(subPackageSummary);
                }
            }
            List<SubPackageSummary> list3 = this.LLILLJJLI;
            final C0K0B c0k0b = this.LL;
            for (SubPackageSummary subPackageSummary2 : list3) {
                final int size2 = list3.size();
                c0k0b.getClass();
                if (c514600KGc2 != null) {
                    str = c514600KGc2.LIZIZ;
                } else {
                    str = null;
                }
                boolean zLJFF = Intrinsics.LJFF(str, subPackageSummary2.id);
                C21546719Ub c21546719Ub3 = c0k0b.LL;
                View viewSd = C786410Ut5.Sd(R.layout.hnw, C786410Ut5.ne(c21546719Ub3.getContext()), null);
                if (viewSd != null && (textView = (TextView) viewSd.findViewById(R.id.wz2)) != null) {
                    textView.setText(subPackageSummary2.name);
                }
                c21546719Ub3.setTabTextColors(C21546719Ub.LJII(C20736316Cj.LIZIZ(R.attr.ezt, c21546719Ub3.getContext()), C20736316Cj.LIZIZ(R.attr.ezq, c21546719Ub3.getContext())));
                float f = 0;
                c21546719Ub3.setTabPaddingStart((int) C497740JfY.LIZIZ(f));
                c21546719Ub3.setTabPaddingEnd((int) C497740JfY.LIZIZ(f));
                c21546719Ub3.setTabPaddingTop((int) C497740JfY.LIZIZ(f));
                c21546719Ub3.setTabPaddingBottom((int) C497740JfY.LIZIZ(f));
                ViewGroup.LayoutParams layoutParams = c21546719Ub3.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) C497740JfY.LIZIZ(40.0f);
                    C786410Ut5.W5(c21546719Ub3, layoutParams);
                    c21546719Ub3.setTabIndicatorFullWidth(true);
                    c21546719Ub3.setTabMode(0);
                    c21546719Ub3.setTabGravity(0);
                    C21546719Ub c21546719Ub4 = c0k0b.LL;
                    final C763970Txz c763970TxzLJIIJJI = c21546719Ub4.LJIIJJI();
                    HandlerHook.viewPost(c763970TxzLJIIJJI.LJIIIIZZ, new Runnable() { // from class: X.0K0A
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FlashPlanSelectTabItemViewHolder@3b0.addTab$2$1");
                            try {
                                int width = c0k0b.LL.getWidth();
                                int i = size2;
                                if (i == 0) {
                                    i = 1;
                                }
                                c763970TxzLJIIJJI.LJIIIIZZ.setMinimumWidth(width / i);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FlashPlanSelectTabItemViewHolder@3b0.addTab$2$1");
                        }
                    });
                    c763970TxzLJIIJJI.LIZJ(viewSd);
                    c21546719Ub4.LIZIZ(c21546719Ub4.LL.size(), c763970TxzLJIIJJI, zLJFF);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            this.LL.LLILLJJLI = true;
        }
        return Unit.LIZ;
    }
}
