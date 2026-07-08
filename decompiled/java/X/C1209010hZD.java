package X;

import Y.AfS111S0300000_18;
import Y.AfS154S0200000_18;
import Y.AfS187S0100000_18;
import com.ss.android.ugc.aweme.favorites.business.music.raven.MusicCollectionRavenRequest;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.container.slash.api.PoiDetailSlashApi;
import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS52S0100100_18;
import kotlin.jvm.internal.AwS5S1010000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209010hZD implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C1161000gJm> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C1209010hZD c1209010hZD, C09AJ c09aj) {
        boolean z;
        String str;
        String str2;
        C1C7U.LIZ("MusicCollectionRavenRequest@a733.request$1");
        String str3 = ((C1160990gJl) c1209010hZD.l0).LIZIZ.get("to_uid");
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = "/aweme/v1/user/music/collect/";
        } else {
            str = "/aweme/v1/user/music/collect/other/";
        }
        MusicCollectionRavenRequest.MusicCollectionRavenApi musicCollectionRavenApi = (MusicCollectionRavenRequest.MusicCollectionRavenApi) ((MusicCollectionRavenRequest) c1209010hZD.l1).LIZ.getValue();
        String str4 = ((C1160990gJl) c1209010hZD.l0).LIZ;
        if (Intrinsics.LJFF(str, "/aweme/v1/user/music/collect/") && C0C64.LJIILLIIL().LJIIIZ(31744, "offline_music_add_similar", true, false)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        musicCollectionRavenApi.requestRaven(str, str4, "music_collection", null, str2, ((C1160990gJl) c1209010hZD.l0).LIZIZ).LJJZ(new AfS154S0200000_18((C1160990gJl) c1209010hZD.l0, c19482611Ke, 7), new AfS187S0100000_18(c19482611Ke, 15), new C1208880hZ0(c19482611Ke, 2));
        C1C7U.LIZIZ("MusicCollectionRavenRequest@a733.request$1");
    }

    public static final void subscribe$1(C1209010hZD c1209010hZD, C09AJ c09aj) {
        String string;
        List<String> list;
        C1C7U.LIZ("PoiDetailSlashApiRequest@17b.requestSlash$1");
        final C259800zU c259800zU = new C259800zU();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("check_preload", "true"));
        arrayList.add(new C080U("check_preload_cache", "true"));
        final C259800zU c259800zU2 = new C259800zU();
        PoiDetailSlashApi poiDetailSlashApi = (PoiDetailSlashApi) ((C1183540gu8) c1209010hZD.l0).LIZ.getValue();
        SlashRequestParam slashRequestParam = (SlashRequestParam) c1209010hZD.l1;
        String str = slashRequestParam.scene;
        Object obj = slashRequestParam.slashParam;
        List<String> list2 = null;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        SlashRequestParam slashRequestParam2 = (SlashRequestParam) c1209010hZD.l1;
        String str2 = slashRequestParam2.serviceType;
        C1183450gtz c1183450gtzLIZ = C1183460gu0.LIZ(slashRequestParam2);
        if (c1183450gtzLIZ != null) {
            list = c1183450gtzLIZ.LIZ;
        } else {
            list = null;
        }
        C1183450gtz c1183450gtzLIZ2 = C1183460gu0.LIZ((SlashRequestParam) c1209010hZD.l1);
        if (c1183450gtzLIZ2 != null) {
            list2 = c1183450gtzLIZ2.LIZIZ;
        }
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        poiDetailSlashApi.requestSlashFirstFresh("/tiktok/poi/slash/v1", str, string, str2, list, list2, ((SlashRequestParam) c1209010hZD.l1).businessQueryParam, arrayList, null).LJJZ(new AfS111S0300000_18(c19482611Ke, c259800zU2, c259800zU, 6), new AfS187S0100000_18(c19482611Ke, 83), new InterfaceC781210Ukh() { // from class: X.0gu5
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                LocationNetTracker.LIZIZ(null, new AwS52S0100100_18(jCurrentTimeMillis, (long) c259800zU, (C259800zU<SlashPage>) 8));
                C1183520gu6 c1183520gu6 = C1183520gu6.LIZ;
                String strLIZ = C1183650guJ.LIZ(c259800zU2.element);
                c1183520gu6.getClass();
                c1183520gu6.LIZJ("poi_detail_request_result", new AwS5S1010000_18(true, strLIZ, 0));
                c19482611Ke.onComplete();
            }
        });
        C1C7U.LIZIZ("PoiDetailSlashApiRequest@17b.requestSlash$1");
    }

    public static final void subscribe$2(C1209010hZD c1209010hZD, C09AJ c09aj) {
        String string;
        List<String> list;
        List<String> list2;
        String string2;
        List<String> list3;
        List<String> list4;
        C1C7U.LIZ("PoiDetailSlashApiRequest@17b.requestSlashByChunk$1");
        final C259800zU c259800zU = new C259800zU();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1183540gu8 c1183540gu8 = (C1183540gu8) c1209010hZD.l0;
        c1183540gu8.LIZJ = -1L;
        c1183540gu8.LIZLLL = 0L;
        c1183540gu8.LJ = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("check_preload", "true"));
        arrayList.add(new C080U("check_preload_cache", "true"));
        arrayList.add(new C080U("page_tag", "poi_detail"));
        arrayList.add(new C080U("scene_tag", "main"));
        if (C1183570guB.LIZ()) {
            SlashRequestParam slashRequestParam = (SlashRequestParam) c1209010hZD.l1;
            String str = slashRequestParam.scene;
            Object obj = slashRequestParam.slashParam;
            if (obj != null) {
                string2 = obj.toString();
            } else {
                string2 = null;
            }
            SlashRequestParam slashRequestParam2 = (SlashRequestParam) c1209010hZD.l1;
            String str2 = slashRequestParam2.serviceType;
            C1183450gtz c1183450gtzLIZ = C1183460gu0.LIZ(slashRequestParam2);
            if (c1183450gtzLIZ != null) {
                list3 = c1183450gtzLIZ.LIZ;
            } else {
                list3 = null;
            }
            C1183450gtz c1183450gtzLIZ2 = C1183460gu0.LIZ((SlashRequestParam) c1209010hZD.l1);
            if (c1183450gtzLIZ2 != null) {
                list4 = c1183450gtzLIZ2.LIZIZ;
            } else {
                list4 = null;
            }
            Map<String, String> map = ((SlashRequestParam) c1209010hZD.l1).businessQueryParam;
            C1183560guA c1183560guA = new C1183560guA("/tiktok/poi/slash/v1", str, string2, str2, list3, list4, map);
            String str3 = map.get("poi_id");
            if (str3 == null) {
                str3 = "";
            }
            C1188750h2X.LIZ.getClass();
            C1188750h2X.LJIIIIZZ.LIZIZ(str3, c1183560guA);
        }
        PoiDetailSlashApi poiDetailSlashApi = (PoiDetailSlashApi) ((C1183540gu8) c1209010hZD.l0).LIZ.getValue();
        SlashRequestParam slashRequestParam3 = (SlashRequestParam) c1209010hZD.l1;
        String str4 = slashRequestParam3.scene;
        Object obj2 = slashRequestParam3.slashParam;
        if (obj2 != null) {
            string = obj2.toString();
        } else {
            string = null;
        }
        SlashRequestParam slashRequestParam4 = (SlashRequestParam) c1209010hZD.l1;
        String str5 = slashRequestParam4.serviceType;
        C1183450gtz c1183450gtzLIZ3 = C1183460gu0.LIZ(slashRequestParam4);
        if (c1183450gtzLIZ3 != null) {
            list = c1183450gtzLIZ3.LIZ;
        } else {
            list = null;
        }
        C1183450gtz c1183450gtzLIZ4 = C1183460gu0.LIZ((SlashRequestParam) c1209010hZD.l1);
        if (c1183450gtzLIZ4 != null) {
            list2 = c1183450gtzLIZ4.LIZIZ;
        } else {
            list2 = null;
        }
        C11NZ<C0X52<C1515820pY4<SlashPage>>> c11nzRequestSlashByChunk = poiDetailSlashApi.requestSlashByChunk("/tiktok/poi/slash/v1", str4, string, str5, list, list2, ((SlashRequestParam) c1209010hZD.l1).businessQueryParam, arrayList, null);
        final C1183540gu8 c1183540gu82 = (C1183540gu8) c1209010hZD.l0;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        c11nzRequestSlashByChunk.LJJLL(new C09JN() { // from class: X.0gu9
            @Override // X.C09JN
            public final void accept(Object obj3) {
                C1C7U.LIZ("PoiDetailSlashApiRequest@17b.requestSlashByChunk$1$1");
                final C0X52 c0x52 = (C0X52) obj3;
                C1515820pY4 c1515820pY4 = (C1515820pY4) c0x52.LIZIZ;
                final C259800zU<SlashPage> c259800zU2 = c259800zU;
                final C09AJ<SlashApiResponse> c09aj2 = c19482611Ke;
                final C1183540gu8 c1183540gu83 = c1183540gu82;
                final long j = jCurrentTimeMillis;
                c1515820pY4.LIZLLL(new C0POE<SlashPage>() { // from class: X.0gu7
                    public String LIZ;

                    @Override // X.C0POE
                    public final void onComplete() {
                        C1183540gu8 c1183540gu84 = c1183540gu83;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                        c1183540gu84.getClass();
                        C1199460hJo c1199460hJo = C1199460hJo.LIZ;
                        C1199450hJn c1199450hJn = new C1199450hJn("poi_detail_chunk");
                        c1199450hJn.LIZLLL = "on_complete";
                        c1199450hJn.LIZ(jCurrentTimeMillis2);
                        c1199460hJo.getClass();
                        C1199460hJo.LIZ(c1199450hJn);
                        LocationNetTracker.LIZIZ(null, new AwS52S0100100_18(j, (long) c259800zU2, (C259800zU<SlashPage>) 9));
                        C1183520gu6 c1183520gu6 = C1183520gu6.LIZ;
                        String strLIZ = C1183650guJ.LIZ(this.LIZ);
                        c1183520gu6.getClass();
                        c1183520gu6.LIZJ("poi_detail_request_result", new AwS5S1010000_18(true, strLIZ, 0));
                        C1183540gu8 c1183540gu85 = c1183540gu83;
                        int i = c1183540gu85.LJ - 1;
                        boolean z = false;
                        if (i > 0) {
                            z = c1183540gu85.LIZLLL > ((long) (c1183540gu85.LIZIZ * i));
                        }
                        c1183520gu6.LIZJ("poi_detail_request_chunk", new AwS32S0010000_18(z, 18));
                        c09aj2.onComplete();
                    }

                    @Override // X.C0POE
                    public final void onFailed(Throwable th) {
                        C1183520gu6 c1183520gu6 = C1183520gu6.LIZ;
                        c1183520gu6.getClass();
                        c1183520gu6.LIZJ("poi_detail_request_result", new AwS5S1010000_18(false, (String) null, 0));
                        c09aj2.onError(th);
                    }

                    /* JADX WARN: Type inference failed for: r11v1, types: [T, com.ss.android.ugc.aweme.slash.data.SlashPage] */
                    @Override // X.C0POE
                    public final void onNext(SlashPage slashPage) {
                        String str6;
                        Set<String> setKeySet;
                        SlashPage slashPage2 = slashPage;
                        Map<String, Node> nodes = slashPage2.getNodes();
                        C1494600ozq<?> requestInfo = null;
                        if (nodes != null && (setKeySet = nodes.keySet()) != null) {
                            str6 = (String) C13LP.LJJJLIIL(setKeySet);
                        } else {
                            str6 = null;
                        }
                        String str7 = this.LIZ;
                        if (str7 == null || str7.length() == 0) {
                            this.LIZ = slashPage2.getPreloadFlag();
                        }
                        if (str6 != null) {
                            C1183540gu8 c1183540gu84 = c1183540gu83;
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                            c1183540gu84.getClass();
                            C1199460hJo c1199460hJo = C1199460hJo.LIZ;
                            C1199450hJn c1199450hJn = new C1199450hJn("poi_detail_chunk");
                            c1199450hJn.LIZLLL = str6;
                            c1199450hJn.LIZ(jCurrentTimeMillis2);
                            c1199460hJo.getClass();
                            C1199460hJo.LIZ(c1199450hJn);
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            if (c1183540gu84.LIZJ <= 0) {
                                c1183540gu84.LIZJ = jCurrentTimeMillis3;
                            }
                            long j2 = jCurrentTimeMillis3 - c1183540gu84.LIZJ;
                            c1183540gu84.LJ++;
                            c1183540gu84.LIZLLL += j2;
                            c1183540gu84.LIZJ = jCurrentTimeMillis3;
                        }
                        C259800zU<SlashPage> c259800zU3 = c259800zU2;
                        C1494600ozq<?> requestInfo2 = slashPage2.getRequestInfo();
                        if (requestInfo2 == null) {
                            SlashPage slashPage3 = c259800zU3.element;
                            if (slashPage3 != null) {
                                requestInfo = slashPage3.getRequestInfo();
                            }
                        } else {
                            requestInfo = requestInfo2;
                        }
                        slashPage2.setRequestInfo(requestInfo);
                        c259800zU3.element = slashPage2;
                        c09aj2.onNext(new SlashApiResponse(slashPage2, c0x52.LIZ.LIZLLL));
                    }
                });
                C1C7U.LIZIZ("PoiDetailSlashApiRequest@17b.requestSlashByChunk$1$1");
            }
        }, new AfS187S0100000_18(c19482611Ke, 84));
        C1C7U.LIZIZ("PoiDetailSlashApiRequest@17b.requestSlashByChunk$1");
    }

    public static final void subscribe$3(C1209010hZD c1209010hZD, C09AJ c09aj) {
        C1C7U.LIZ("PoiOrderSubmitSlashApiRequest@da68.request$1");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1183470gu1((SlashRequestParam) c1209010hZD.l0, (C1186990gzh) c1209010hZD.l1, c09aj, null), 3);
        C1C7U.LIZIZ("PoiOrderSubmitSlashApiRequest@da68.request$1");
    }

    public C1209010hZD(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
