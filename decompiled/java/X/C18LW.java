package X;

import Y.ARunnableS100S0200000_31;
import android.app.Activity;
import android.content.Context;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18LW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18LW extends C09AY implements Function1<PanelVoucherInfo, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PanelVoucherInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C21268418La LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18LW(String str, PanelVoucherInfo panelVoucherInfo, String str2, String str3, Map<String, String> map, Context context, String str4, C21268418La c21268418La) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = panelVoucherInfo;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = map;
        this.LLILZLL = context;
        this.LLIZ = str4;
        this.LLIZLLLIL = c21268418La;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PanelVoucherInfo panelVoucherInfo) {
        ArrayList arrayList;
        Activity activityLIZ;
        PanelVoucherInfo panelVoucherInfo2 = panelVoucherInfo;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        String str = this.LL;
        PanelVoucherInfo panelVoucherInfo3 = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        Map<String, String> map = this.LLILZIL;
        c21271918Mj.getClass();
        C21271918Mj.LJIILLIIL(str, panelVoucherInfo3, str2, str3, "video_multi_anchor_top", null, null, map);
        Context context = this.LLILZLL;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            activityLIZ.runOnUiThread(new ARunnableS100S0200000_31(this.LLIZLLLIL, panelVoucherInfo2, 11));
        }
        C1739800vNK c1739800vNK = C1739800vNK.LIZ;
        String str4 = this.LL;
        String str5 = this.LLIZ;
        c1739800vNK.getClass();
        C21272518Mp.LIZ.getClass();
        if (str4 != null && str4.length() != 0 && panelVoucherInfo2 != null) {
            LruCache<String, List<PanelVoucherInfo>> lruCache = C21272518Mp.LJFF;
            List<PanelVoucherInfo> list = lruCache.get(str4);
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = new ArrayList();
            }
            C19719612Di.LJJIIZI(arrayList);
            ListProtector.add(arrayList, 0, panelVoucherInfo2);
            lruCache.put(C21272518Mp.LJFF(str4, str5), C13LP.LLIIII(arrayList));
        }
        return Unit.LIZ;
    }
}
