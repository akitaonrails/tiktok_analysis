package X;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CategoryInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ChannelInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeCategoryLabels;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeInfoResponse;
import com.ss.android.ugc.aweme.notification.SubscribePanelFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Owi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635780Owi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscribePanelFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SubscribeInfoResponse LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ FragmentManager LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C635780Owi(SubscribePanelFragment subscribePanelFragment, String str, SubscribeInfoResponse subscribeInfoResponse, Map<String, String> map, C19EG c19eg, C118300cf c118300cf, int i, FragmentManager fragmentManager) {
        super(0);
        this.LL = subscribePanelFragment;
        this.LLILLJJLI = str;
        this.LLILLL = subscribeInfoResponse;
        this.LLILZ = map;
        this.LLILZIL = c19eg;
        this.LLILZLL = c118300cf;
        this.LLIZ = i;
        this.LLIZLLLIL = fragmentManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i;
        char c;
        CategoryInfo next;
        List<KeyValueHolder> list;
        List<KeyValueHolder> list2;
        ChannelInfo channelInfo;
        List<KeyValueHolder> list3;
        List<C635800Owk> list4 = this.LL.LLJ;
        ArrayList<C635800Owk> arrayList = new ArrayList();
        Iterator<C635800Owk> it2 = list4.iterator();
        while (true) {
            i = 1;
            c = 0;
            if (!it2.hasNext()) {
                break;
            }
            C635800Owk next2 = it2.next();
            if (next2.LIZ >= 0) {
                arrayList.add(next2);
            }
        }
        ArrayList<SubscribeCategoryLabels> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C635800Owk c635800Owk : arrayList) {
            arrayList2.add(new SubscribeCategoryLabels(c635800Owk.LIZ, c635800Owk.LIZJ ? 1 : 0));
        }
        Boolean boolMR = this.LL.MR();
        C635700Owa c635700Owa = C635700Owa.LIZ;
        String str = this.LLILLJJLI;
        SubscribeInfoResponse subscribeInfoResponse = this.LLILLL;
        Map<String, String> map = this.LLILZ;
        c635700Owa.getClass();
        int i2 = 2;
        if (boolMR == null) {
            for (SubscribeCategoryLabels subscribeCategoryLabels : arrayList2) {
                if (subscribeCategoryLabels.isSubscribe == i) {
                    Pair[] pairArr = new Pair[i2];
                    pairArr[c] = new Pair("enter_from", str);
                    pairArr[i] = new Pair("type", "subscribed");
                    Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    if (subscribeInfoResponse != null) {
                        ChannelInfo channelInfo2 = subscribeInfoResponse.getChannelInfo();
                        if (channelInfo2 != null && (list2 = channelInfo2.eventTrackingExtra) != null) {
                            for (KeyValueHolder keyValueHolder : list2) {
                                mapLJIIJ.put(keyValueHolder.key, keyValueHolder.value);
                            }
                        }
                        List<CategoryInfo> categories = subscribeInfoResponse.getCategories();
                        if (categories != null) {
                            Iterator<CategoryInfo> it3 = categories.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                if (next.label == subscribeCategoryLabels.label) {
                                    break;
                                }
                            }
                            CategoryInfo categoryInfo = next;
                            if (categoryInfo != null && (list = categoryInfo.eventTrackingExtra) != null) {
                                for (KeyValueHolder keyValueHolder2 : list) {
                                    mapLJIIJ.put(keyValueHolder2.key, keyValueHolder2.value);
                                }
                            }
                        }
                    }
                    if (map != null) {
                        mapLJIIJ.putAll(map);
                    }
                    C20684815ws.LJIILLIIL("message_manage_click", mapLJIIJ);
                    i = 1;
                    c = 0;
                    i2 = 2;
                }
            }
        } else if (boolMR.booleanValue()) {
            Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("type", "subscribed"));
            if (subscribeInfoResponse != null && (channelInfo = subscribeInfoResponse.getChannelInfo()) != null && (list3 = channelInfo.eventTrackingExtra) != null) {
                for (KeyValueHolder keyValueHolder3 : list3) {
                    mapLJIIJ2.put(keyValueHolder3.key, keyValueHolder3.value);
                }
            }
            if (map != null) {
                mapLJIIJ2.putAll(map);
            }
            C20684815ws.LJIILLIIL("message_manage_click", mapLJIIJ2);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILZIL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C635760Owg(this.LLILZLL, this.LLIZ, this.LLILZIL, this.LLIZLLLIL, this.LL, arrayList2, null), i2);
        return Unit.LIZ;
    }
}
