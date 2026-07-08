package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.FollowShopItem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ShopInfo;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0s14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610680s14 extends AbstractC21673619ry<C1610700s16> {
    public final TrendingListViewModel LL;
    public final ArrayList<FollowShopItem> LLILLJJLI = new ArrayList<>();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1610680s14(TrendingListViewModel trendingListViewModel) {
        this.LL = trendingListViewModel;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        String str;
        Image image;
        List<String> urls;
        String str2;
        final C1610700s16 c1610700s16 = (C1610700s16) viewHolder;
        final FollowShopItem followShopItem = (FollowShopItem) ListProtector.get(this.LLILLJJLI, i);
        final TrendingListViewModel trendingListViewModel = this.LL;
        c1610700s16.getClass();
        EnumC1610470s0j enumC1610470s0j = c1610700s16.LLILZ;
        C1610670s13 c1610670s13 = c1610700s16.LL;
        C1610740s1A c1610740s1A = new C1610740s1A(enumC1610470s0j, c1610670s13, c1610670s13, c1610700s16.LLILLL);
        TuxTextView tuxTextView = c1610700s16.LLILLJJLI;
        ShopInfo shopInfo = followShopItem.shopInfo;
        if (shopInfo == null || (str = shopInfo.shopName) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        ShopInfo shopInfo2 = followShopItem.shopInfo;
        if (shopInfo2 != null && (image = shopInfo2.logo) != null && (urls = image.getUrls()) != null && (str2 = (String) C13LP.LJJJLL(urls)) != null) {
            c1610700s16.LL.setImageUrl(str2);
            c1610700s16.LL.setUseLiveAnimStyle(true);
            c1610700s16.LL.LJFF(Intrinsics.LJFF(followShopItem.isLiving(), Boolean.TRUE));
            c1610740s1A.LJFF(null, C1610700s16.class, null, null, null);
            c1610740s1A.LIZ();
        }
        C1610720s18 c1610720s18 = C1610720s18.LIZ;
        PageFinder pageFinder = trendingListViewModel.LLILZLL;
        c1610720s18.getClass();
        C1610720s18.LIZ(followShopItem, "tiktokec_module_show", i, pageFinder);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0s15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                String str3;
                String str4;
                String str5;
                Context context = c1610700s16.itemView.getContext();
                ShopInfo shopInfo3 = followShopItem.shopInfo;
                if (shopInfo3 == null || (str3 = shopInfo3.schema) == null) {
                    str3 = "";
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str3);
                JSONObject jSONObject = new JSONObject();
                C1742820vSC c1742820vSC = trendingListViewModel.LL;
                if (c1742820vSC != null) {
                    str4 = c1742820vSC.LJII;
                } else {
                    str4 = null;
                }
                jSONObject.put("source_module", str4);
                jSONObject.put("previous_page", "auction");
                jSONObject.put("action_type", "click");
                jSONObject.put("enter_method", "auction_follow");
                smartRouteBuildRoute.withParam("log_extra", C786410Ut5.J3(jSONObject));
                IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
                if (iECommerceMallService != null && iECommerceMallService.hitTopTabExpExperiment()) {
                    str5 = "homepage_mall";
                } else {
                    str5 = "mall";
                }
                smartRouteBuildRoute.withParam("enter_from_merge", str5);
                smartRouteBuildRoute.withParam("enter_method", "auction_follow");
                smartRouteBuildRoute.open();
                C1610720s18 c1610720s182 = C1610720s18.LIZ;
                FollowShopItem followShopItem2 = followShopItem;
                int i2 = i;
                PageFinder pageFinder2 = trendingListViewModel.LLILZLL;
                c1610720s182.getClass();
                C1610720s18.LIZ(followShopItem2, "tiktokec_module_click", i2, pageFinder2);
            }
        }, c1610700s16.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1610700s16 c1610700s16 = new C1610700s16(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bsm, viewGroup, false));
        try {
            View view = c1610700s16.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1610700s16.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1610700s16.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1610700s16.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1610700s16.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1610700s16.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1610700s16.class.getName();
        return c1610700s16;
    }
}
