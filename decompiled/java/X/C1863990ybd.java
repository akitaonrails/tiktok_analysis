package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.ccl.net.BotCategoryInfo;
import com.ss.android.ugc.aweme.tako.ccl.net.BriefBot;
import com.ss.android.ugc.aweme.tako.ccl.net.CategoryBot;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ybd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863990ybd implements InterfaceC859420XnY {
    public final /* synthetic */ C885790Yoz LL;

    @Override // X.InterfaceC859420XnY
    public final boolean LJIJ() {
        return this.LL.LLILLJJLI;
    }

    public C1863990ybd(C885790Yoz c885790Yoz) {
        this.LL = c885790Yoz;
    }

    @Override // X.InterfaceC859420XnY
    public final Object LJJLI(InterfaceC1364105Vn<? super TakoBotCenterResponse> interfaceC1364105Vn) {
        return C1863980ybc.LIZ.LIZLLL("Chatted", interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    @Override // X.InterfaceC859420XnY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLJLI(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse> r6) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863990ybd.LJJLJLI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC859420XnY
    public final Pair<String, List<TakoBotInfo>> LJLLJ(int i) {
        int size;
        Object arrayList;
        List<CategoryBot> list;
        CategoryBot categoryBot;
        List<BriefBot> list2;
        TreeMap<Long, TakoBotInfo> treeMap;
        TakoBotInfo takoBotInfo;
        List<CategoryBot> list3;
        CategoryBot categoryBot2;
        BotCategoryInfo botCategoryInfo;
        String str;
        List<CategoryBot> list4;
        TakoBotCenterResponse takoBotCenterResponse = this.LL.LL;
        if (takoBotCenterResponse != null && (list4 = takoBotCenterResponse.categoryBots) != null) {
            size = list4.size();
        } else {
            size = 0;
        }
        String str2 = "";
        if (i >= size) {
            return new Pair<>("", C13BV.INSTANCE);
        }
        TakoBotCenterResponse takoBotCenterResponse2 = this.LL.LL;
        if (takoBotCenterResponse2 != null && (list3 = takoBotCenterResponse2.categoryBots) != null && (categoryBot2 = (CategoryBot) ListProtector.get(list3, i)) != null && (botCategoryInfo = categoryBot2.category) != null && (str = botCategoryInfo.categoryKey) != null) {
            str2 = str;
        }
        TakoBotCenterResponse takoBotCenterResponse3 = this.LL.LL;
        if (takoBotCenterResponse3 != null && (list = takoBotCenterResponse3.categoryBots) != null && (categoryBot = (CategoryBot) ListProtector.get(list, i)) != null && (list2 = categoryBot.bots) != null) {
            C885790Yoz c885790Yoz = this.LL;
            arrayList = new ArrayList();
            for (BriefBot briefBot : list2) {
                TakoBotCenterResponse takoBotCenterResponse4 = c885790Yoz.LL;
                if (takoBotCenterResponse4 != null && (treeMap = takoBotCenterResponse4.botDetailInfos) != null && (takoBotInfo = treeMap.get(briefBot.botId)) != null) {
                    arrayList.add(takoBotInfo);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return new Pair<>(str2, arrayList);
    }
}
