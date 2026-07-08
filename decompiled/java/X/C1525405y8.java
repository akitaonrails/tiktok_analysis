package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedExtra;
import com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendVideoModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05y8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1525405y8 extends AbstractC1255880imo<Aweme, CommonFeedModel> {
    public final long LL;
    public final String LLILLJJLI;
    public String LLILZIL;
    public VideoDetailRequestParams LLIZ;
    public boolean LLIZLLLIL;
    public final List<RecommendFeedModel> LLILLL = new ArrayList();
    public final List<Aweme> LLILZ = new ArrayList();
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0) {
            return ((CommonFeedModel) t).hasMore;
        }
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return this.LLILZ;
    }

    public final String LJIIL(C2189821An6 c2189821An6) {
        String str = this.LLILLJJLI;
        String from = null;
        if (str != null && C0C64.LJIILLIIL().LJIIIZ(31744, "ec_recommend_feed_path_switch", true, false) && C703302op.LIZ(str)) {
            return str;
        }
        if (c2189821An6 != null) {
            from = c2189821An6.getFrom();
        }
        if (Intrinsics.LJFF(from, "from_ecom_search")) {
            return "search_video_in_stream";
        }
        return "ttmall_video_in_stream";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[Catch: s -> 0x0099, TryCatch #1 {s -> 0x0099, blocks: (B:33:0x0054, B:35:0x0063, B:37:0x0067, B:38:0x0080, B:43:0x0094, B:41:0x0089), top: B:53:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadMoreList(java.lang.Object... r13) {
        /*
            r12 = this;
            r6 = r12
            T r0 = r6.mData
            com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel r0 = (com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel) r0
            r1 = 1
            if (r0 == 0) goto L16
            int r8 = r0.nextCursor
        La:
            r7 = r13[r1]
            boolean r0 = r7 instanceof X.C2189821An6
            r2 = 0
            if (r0 == 0) goto L23
            X.1An6 r7 = (X.C2189821An6) r7
            if (r7 == 0) goto L29
            goto L18
        L16:
            r8 = 1
            goto La
        L18:
            java.lang.String r0 = r7.getAid()     // Catch: java.lang.NumberFormatException -> L25
            if (r0 == 0) goto L29
            long r9 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L25
            goto L2b
        L23:
            r7 = r2
            goto L29
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L29:
            r9 = 0
        L2b:
            if (r7 == 0) goto L52
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r7.getAnchorCustomData()
            if (r0 == 0) goto L52
            java.lang.String r0 = r0.exposureItems
        L35:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto La5
            java.util.List<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = r6.LLILLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La5
            if (r7 == 0) goto La5
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r7.getAnchorCustomData()
            if (r0 == 0) goto La5
            java.lang.String r5 = r0.exposureItems
            if (r5 == 0) goto La5
            goto L54
        L52:
            r0 = r2
            goto L35
        L54:
            com.google.gson.Gson r4 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L99
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L99
            r0.getClass()     // Catch: com.google.gson.s -> L99
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L99
            if (r0 == 0) goto L89
            boolean r0 = r0.LJII     // Catch: com.google.gson.s -> L99
            if (r0 != r1) goto L89
            java.lang.Class<java.util.List> r3 = java.util.List.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L99
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L99
            r1.getClass()     // Catch: com.google.gson.s -> L99
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L99
            X.13JW r0 = X.C13LE.LJIIIIZZ(r3, r0)     // Catch: com.google.gson.s -> L99
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L99
        L80:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r4, r5, r0)     // Catch: com.google.gson.s -> L99
            boolean r0 = r1 instanceof java.util.List     // Catch: com.google.gson.s -> L99
            if (r0 != 0) goto L94
            goto L93
        L89:
            X.05y9 r0 = new X.05y9     // Catch: com.google.gson.s -> L99
            r0.<init>()     // Catch: com.google.gson.s -> L99
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L99
            goto L80
        L93:
            r1 = r2
        L94:
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: com.google.gson.s -> L99
            if (r1 == 0) goto La5
            goto L9e
        L99:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto La5
        L9e:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.video.dto.RecommendFeedModel> r0 = r6.LLILLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r1)
        La5:
            X.03Hh r1 = X.C817503Hh.LL
            X.05WN r5 = new X.05WN
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r11)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r2, r2, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1525405y8.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshList(java.lang.Object... r15) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1525405y8.refreshList(java.lang.Object[]):void");
    }

    @Override // X.AbstractC1255880imo, X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        this.mIsLoading = true;
        if (((ArrayList) this.LLILZ).size() == 1 && ((Aweme) ListProtector.get(this.LLILZ, 0)).getAuthor() == null) {
            this.mListQueryType = 1;
            refreshList(Arrays.copyOf(objArr, objArr.length));
        } else {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 4) {
                        this.mListQueryType = iIntValue;
                        loadMoreList(Arrays.copyOf(objArr, objArr.length));
                        return false;
                    }
                } else {
                    this.mListQueryType = 1;
                    refreshList(Arrays.copyOf(objArr, objArr.length));
                    return false;
                }
            } else {
                this.mListQueryType = iIntValue;
                refreshList(Arrays.copyOf(objArr, objArr.length));
                return false;
            }
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (list != null) {
            ((ArrayList) this.LLILZ).clear();
            ((ArrayList) this.LLILZ).addAll(list);
            List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
            if (list2 != null) {
                Iterator<InterfaceC1526205yG> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().onSuccess();
                }
            }
        }
    }

    public C1525405y8(long j, String str) {
        this.LL = j;
        this.LLILLJJLI = str;
    }

    public final void LJIIJ(CommonFeedModel commonFeedModel, C2189821An6 c2189821An6) {
        String str;
        Type type;
        String str2;
        RecommendVideoModel recommendVideoModel;
        List<RecommendFeedModel> list = commonFeedModel.feedList;
        if (list == null) {
            return;
        }
        String str3 = commonFeedModel.requestId;
        if (str3 == null) {
            str3 = "";
        }
        ArrayList arrayList = new ArrayList();
        for (RecommendFeedModel recommendFeedModel : list) {
            RecommendFeedModel recommendFeedModel2 = recommendFeedModel;
            if (recommendFeedModel2.type == 3 && (recommendVideoModel = recommendFeedModel2.video) != null && recommendVideoModel.awemeStruct != null) {
                arrayList.add(recommendFeedModel);
            }
        }
        List<Aweme> list2 = this.LLILZ;
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                RecommendFeedModel recommendFeedModel3 = (RecommendFeedModel) obj;
                Gson gson = C7740030o.LIZ().getGson();
                RecommendVideoModel recommendVideoModel2 = recommendFeedModel3.video;
                if (recommendVideoModel2 != null) {
                    str = recommendVideoModel2.awemeStruct;
                } else {
                    str = null;
                }
                try {
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(Aweme.class));
                    } else {
                        type = new TypeToken<Aweme>() { // from class: X.05WP
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gson, str, type);
                    if (!(objFromJson instanceof Aweme)) {
                        objFromJson = null;
                    }
                    Aweme aweme = (Aweme) objFromJson;
                    if (aweme != null) {
                        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                        LJIIJJI(aweme, c2189821An6, false);
                        RecommendFeedExtra recommendFeedExtra = recommendFeedModel3.feedExtra;
                        if (recommendFeedExtra == null || (str2 = recommendFeedExtra.recommendInfo) == null) {
                            str2 = "";
                        }
                        int size = ((ArrayList) this.LLILZ).size() + i + 1;
                        HashMap<String, String> mobParams = aweme.getMobParams();
                        if (mobParams != null) {
                            mobParams.put("request_id", str3);
                            mobParams.put("order", String.valueOf(size));
                            mobParams.put("rec_params", str2);
                            mobParams.put("rec_session_id", this.LLILZIL);
                            mobParams.put("action_type", "draw");
                        }
                        ((ArrayList) list2).add(aweme);
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List<RecommendFeedModel> list3 = this.LLILLL;
        for (RecommendFeedModel recommendFeedModel4 : list) {
            ((ArrayList) list3).add(new RecommendFeedModel(recommendFeedModel4.id, recommendFeedModel4.type, null, null));
        }
    }

    public static void LJIIJJI(Aweme aweme, C2189821An6 c2189821An6, boolean z) {
        HashMap<String, String> mobParams;
        String str;
        if (aweme != null && c2189821An6 != null) {
            AnchorCustomData anchorCustomData = c2189821An6.getAnchorCustomData();
            if (anchorCustomData != null) {
                AwemeBizExtKt.setAnchorCustomData(aweme, anchorCustomData);
                String str2 = anchorCustomData.sourceModule;
                if (str2 != null && C703302op.LIZ(str2) && ((mobParams = aweme.getMobParams()) == null || true != mobParams.containsKey("source_module"))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    if (z) {
                        str = "_outer_flow";
                    } else {
                        str = "_inner_flow";
                    }
                    sbLIZ.append(str);
                    AwemeExtKt.appendMobParam(aweme, "source_module", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            HashMap<String, String> logExtra = c2189821An6.getLogExtra();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : logExtra.entrySet()) {
                if (!Intrinsics.LJFF("source_module", entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                AwemeExtKt.appendMobParam(aweme, (String) entry2.getKey(), (String) entry2.getValue());
            }
        }
    }
}
