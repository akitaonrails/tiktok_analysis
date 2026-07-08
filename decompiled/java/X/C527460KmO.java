package X;

import Y.AfS144S0200000_8;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentRepository;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0KmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527460KmO {
    public static C11PQ<List<C535020Kya>> LIZJ;
    public final InterfaceC524600Khm LIZ;
    public boolean LIZIZ;

    public C527460KmO(C535010KyZ c535010KyZ) {
        this.LIZ = c535010KyZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static List LIZJ(C527460KmO c527460KmO) {
        ?? arrayList;
        C11NZ<List<C535020Kya>> c11nzLIZ;
        List list;
        c527460KmO.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C11PQ<List<C535020Kya>> c11pq = LIZJ;
            if (c11pq != null) {
                Iterable iterable = (Iterable) C530200Kqo.LIZ(c11pq, C13BV.INSTANCE);
                arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    TikTokMediaModel tikTokMediaModelLIZ = c527460KmO.LIZ.LIZ((C535020Kya) it2.next());
                    if (tikTokMediaModelLIZ != null) {
                        arrayList.add(tikTokMediaModelLIZ);
                    }
                }
            } else {
                AlbumAiContentRepository albumAiContentRepositoryLIZIZ = C530200Kqo.LIZIZ();
                if (albumAiContentRepositoryLIZIZ != null && (c11nzLIZ = albumAiContentRepositoryLIZIZ.LIZ(new C534820KyG(1, true, false, 3, null, null, 48))) != null && (list = (List) C530200Kqo.LIZ(c11nzLIZ.LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.00Di
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return C13BV.INSTANCE;
                    }
                }), C13BV.INSTANCE)) != null) {
                    arrayList = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        TikTokMediaModel tikTokMediaModelLIZ2 = c527460KmO.LIZ.LIZ((C535020Kya) it3.next());
                        if (tikTokMediaModelLIZ2 != null) {
                            arrayList.add(tikTokMediaModelLIZ2);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
            }
            LIZJ = null;
            C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadLocalAiContentDataSync cost: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C201955140j.LIZLLL(c552700Lm0, "AiContentDataManager", C2188811AlT.LIZIZ(sbLIZ));
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ = null;
            C552700Lm0 c552700Lm02 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadLocalAiContentDataSync cost: ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C201955140j.LIZLLL(c552700Lm02, "AiContentDataManager", C2188811AlT.LIZIZ(sbLIZ2));
            throw th;
        }
    }

    public static void LIZ(C527460KmO c527460KmO, InterfaceC524590Khl interfaceC524590Khl) {
        C11NZ<List<C535020Kya>> c11nzLIZ;
        C201955140j.LJIILL(C552700Lm0.LIZIZ, "AiContentDataManager", "incrementalRefreshAiSelfContentData: fetching only remote data");
        AlbumAiContentRepository albumAiContentRepositoryLIZIZ = C530200Kqo.LIZIZ();
        if (albumAiContentRepositoryLIZIZ != null && (c11nzLIZ = albumAiContentRepositoryLIZIZ.LIZ(new C534820KyG(0, false, true, 3, null, 2, 17))) != null) {
            c11nzLIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS144S0200000_8(interfaceC524590Khl, c527460KmO, 8), new C09JN() { // from class: X.0KmM
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AiContentDataManager@fb1e.incrementalRefreshAiSelfContentData$2");
                    C537680L6w.LIZ(C552700Lm0.LIZIZ, "AiContentDataManager", "incrementalRefreshAiSelfContentData error", (Throwable) obj);
                    C1C7U.LIZIZ("AiContentDataManager@fb1e.incrementalRefreshAiSelfContentData$2");
                }
            }, new InterfaceC781210Ukh() { // from class: X.0KmP
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    C201955140j.LJIILL(C552700Lm0.LIZIZ, "AiContentDataManager", "incrementalRefreshAiSelfContentData done");
                }
            });
        }
    }

    public final C11JF LIZIZ(int i, InterfaceC524590Khl interfaceC524590Khl) {
        C11NZ<List<C535020Kya>> c11nzLIZ;
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadFullAiContentData: hasLoad-");
        sbLIZ.append(this.LIZIZ);
        C201955140j.LJIILL(c552700Lm0, "AiContentDataManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC420801kM interfaceC420801kMLJJZ = null;
        if (this.LIZIZ) {
            return null;
        }
        this.LIZIZ = true;
        AlbumAiContentRepository albumAiContentRepositoryLIZIZ = C530200Kqo.LIZIZ();
        if (albumAiContentRepositoryLIZIZ != null && (c11nzLIZ = albumAiContentRepositoryLIZIZ.LIZ(new C534820KyG(0, true, true, i, null, null, 49))) != null) {
            interfaceC420801kMLJJZ = c11nzLIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS144S0200000_8(interfaceC524590Khl, this, 9), new C09JN() { // from class: X.0KmN
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("AiContentDataManager@fb1e.loadFullAiContentData$2");
                    C537680L6w.LIZ(C552700Lm0.LIZIZ, "AiContentDataManager", "loadFullAiContentData error", (Throwable) obj);
                    C1C7U.LIZIZ("AiContentDataManager@fb1e.loadFullAiContentData$2");
                }
            }, new InterfaceC781210Ukh() { // from class: X.0KmQ
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    C201955140j.LJIILL(C552700Lm0.LIZIZ, "AiContentDataManager", "loadFullAiContentData done");
                }
            });
        }
        return (C11JF) interfaceC420801kMLJJZ;
    }
}
