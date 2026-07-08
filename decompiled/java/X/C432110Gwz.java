package X;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.VipSubscriptionPrice;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Gwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432110Gwz {
    public final int LIZ = R.dimen.b5;
    public List<String> LIZIZ = C13BV.INSTANCE;
    public final Map<String, View> LIZJ = new LinkedHashMap();

    public final void LIZ(ViewGroup viewGroup, List<VipSubscriptionPurchaseOption> list, String str, UrlModel urlModel, Map<String, String> map, Map<String, String> map2, String str2, final Function1<? super String, Unit> function1) {
        Object c098200Yq;
        List<String> urlList;
        String str3;
        boolean z;
        int i;
        int i2;
        final String str4;
        int i3;
        String str5;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<VipSubscriptionPurchaseOption> it2 = list.iterator();
        while (true) {
            String str6 = "";
            if (!it2.hasNext()) {
                break;
            }
            VipSubscriptionPrice vipSubscriptionPrice = it2.next().price;
            if (vipSubscriptionPrice != null && (str5 = vipSubscriptionPrice.basePlanId) != null) {
                str6 = str5;
            }
            arrayList.add(str6);
        }
        if (!Intrinsics.LJFF(arrayList, this.LIZIZ)) {
            C786410Ut5.LJJJJI(viewGroup);
            ((LinkedHashMap) this.LIZJ).clear();
            this.LIZIZ = arrayList;
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
            for (VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption : list) {
                View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.bif, viewGroup, false);
                VipSubscriptionPrice vipSubscriptionPrice2 = vipSubscriptionPurchaseOption.price;
                if (vipSubscriptionPrice2 == null || (str4 = vipSubscriptionPrice2.basePlanId) == null) {
                    str4 = "";
                }
                this.LIZJ.put(str4, viewTd);
                viewTd.setClipToOutline(true);
                viewTd.setOutlineProvider(new C0IDB(this, 6));
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.01pW
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String str7 = str4;
                        if (str7.length() > 0) {
                            function1.invoke(str7);
                        }
                    }
                }, viewTd);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                if (viewGroup.getChildCount() == 0) {
                    i3 = 0;
                } else {
                    i3 = (int) (viewGroup.getResources().getDisplayMetrics().density * 8.0f);
                }
                marginLayoutParams.topMargin = i3;
                C786410Ut5.W5(viewTd, marginLayoutParams);
                viewGroup.addView(viewTd);
            }
        }
        for (VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption2 : list) {
            VipSubscriptionPrice vipSubscriptionPrice3 = vipSubscriptionPurchaseOption2.price;
            if (vipSubscriptionPrice3 == null || (str3 = vipSubscriptionPrice3.basePlanId) == null) {
                str3 = "";
            }
            View view = (View) ((LinkedHashMap) this.LIZJ).get(str3);
            if (view != null) {
                ((TextView) view.findViewById(R.id.vip_plan_name)).setText(C079800Ro.LIZ(view.getContext(), vipSubscriptionPurchaseOption2.title));
                String str7 = map.get(str3);
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = map2.get(str3);
                if (str8 == null) {
                    str8 = "";
                }
                ((TextView) view.findViewById(R.id.vip_plan_price)).setText(str7);
                TextView textView = (TextView) view.findViewById(R.id.vip_plan_original_price);
                if ((!a0.LJJJIL(str8)) && !Intrinsics.LJFF(str8, str7)) {
                    z = true;
                } else {
                    z = false;
                }
                int i4 = 8;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, textView);
                textView.setText(str8);
                textView.setPaintFlags(textView.getPaintFlags() | 16);
                TextView textView2 = (TextView) view.findViewById(R.id.vip_plan_discount_badge);
                if (Intrinsics.LJFF(vipSubscriptionPurchaseOption2.isBest(), Boolean.TRUE)) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, textView2);
                textView2.setText(view.getContext().getString(2131848166));
                TextView textView3 = (TextView) view.findViewById(R.id.vip_plan_price_desc);
                String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(C079800Ro.LIZ(view.getContext(), vipSubscriptionPurchaseOption2.desc), "{s_amount1}", str7, false), "{s_amount2}", str8, false), "{s_amount}", str8, false), "{s_currency}", "", false), "{s_date}", str2, false);
                if (strLJJIFFI.length() > 0) {
                    i4 = 0;
                }
                C786410Ut5.LJLLLLLL(i4, textView3);
                textView3.setText(strLJJIFFI);
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
            Object key = entry.getKey();
            final View view2 = (View) entry.getValue();
            boolean zLJFF = Intrinsics.LJFF(key, str);
            view2.setSelected(zLJFF);
            if (!zLJFF) {
                view2.setBackgroundResource(R.drawable.bfm);
                view2.setForeground(null);
                view2.setTag(R.id.vip_plan_name, null);
            } else if (urlModel == null) {
                view2.setBackgroundResource(R.drawable.bfm);
                view2.setForeground(null);
                view2.setTag(R.id.vip_plan_name, null);
            } else {
                view2.setForeground(view2.getContext().getDrawable(R.drawable.bfn));
                try {
                    c098200Yq = urlModel.getUri();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str9 = (String) c098200Yq;
                if (str9 == null && ((urlList = urlModel.getUrlList()) == null || (str9 = (String) C13LP.LJJJLL(urlList)) == null)) {
                    str9 = "";
                }
                Object tag = view2.getTag(R.id.vip_plan_name);
                if (!(tag instanceof String)) {
                    tag = null;
                }
                if (str9.length() <= 0 || !Intrinsics.LJFF(str9, tag)) {
                    view2.setTag(R.id.vip_plan_name, str9);
                    C1324840ka2.LJIJ(urlModel, 0, 0, new InterfaceC447230HgH() { // from class: X.01pV
                        @Override // X.InterfaceC447230HgH
                        public final void accept(Object obj) {
                            Bitmap bitmap = (Bitmap) obj;
                            if (bitmap != null) {
                                View view3 = view2;
                                HandlerHook.viewPost(view3, new RunnableC514501zT(view3, bitmap, 19));
                            }
                        }
                    });
                }
            }
        }
    }
}
