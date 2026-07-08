package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696330RTb implements InterfaceC111300bX {
    public long LL;
    public double LLILLJJLI;
    public final String LLILLL;
    public final C2189821An6 LLILZ;
    public Long LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public HashMap<String, Long> LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public PostModeEgressEtData LLJILJIL;
    public long LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C696330RTb)) {
            return false;
        }
        C696330RTb c696330RTb = (C696330RTb) obj;
        return this.LL == c696330RTb.LL && Double.compare(this.LLILLJJLI, c696330RTb.LLILLJJLI) == 0 && Intrinsics.LJFF(this.LLILLL, c696330RTb.LLILLL) && Intrinsics.LJFF(this.LLILZ, c696330RTb.LLILZ);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.X2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        C2189821An6 c2189821An6 = this.LLILZ;
        return iY2 + (c2189821An6 == null ? 0 : c2189821An6.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedPhotosViewHolderTimeLogger(tempPhotoModeStayDuration=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", startVolumeValue=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", paramsEventType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", feedParam=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZIZ() {
        long jCurrentTimeMillis;
        long j = this.LLJILJILJ;
        Long l = this.LLILZIL;
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            this.LLILZIL = null;
        } else {
            this.LLILZIL = null;
            jCurrentTimeMillis = 0;
        }
        long j2 = j + jCurrentTimeMillis;
        this.LLJILJILJ = 0L;
        return j2;
    }

    public final C0RH3 LIZJ() {
        if (this.LLJI == -1) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJI;
        PostModeEgressEtData postModeEgressEtData = this.LLJILJIL;
        C0RH3 c0rh3 = new C0RH3(postModeEgressEtData.photoModeDuration + jCurrentTimeMillis + this.LLIZ, postModeEgressEtData.postModeDuration + this.LLIZLLLIL);
        C696350RTd c696350RTd = C721270SQz.LLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("totalPlayTime form fullpage: ");
        sbLIZ.append(this.LLJILJIL.photoModeDuration);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJILJIL.postModeDuration);
        C2188811AlT.LIZIZ(sbLIZ);
        c696350RTd.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("totalPlayTime current feed: ");
        sbLIZ2.append(this.LLIZ);
        sbLIZ2.append(", ");
        sbLIZ2.append(this.LLIZLLLIL);
        sbLIZ2.append(", ");
        sbLIZ2.append(jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ2);
        c696350RTd.getClass();
        return c0rh3;
    }

    public static void LIZLLL(C696330RTb c696330RTb) {
        if (!c696330RTb.LLJIJIL) {
            c696330RTb.LLJI = System.currentTimeMillis();
        }
        c696330RTb.LLJIJIL = false;
        c696330RTb.LLILZLL = false;
    }

    public final void LIZ(final Aweme aweme) {
        if (!this.LLJIJIL) {
            long j = this.LLJI;
            if (j != 0 && j != -1) {
                if (this.LLILZLL) {
                    C721190SQr c721190SQr = C721190SQr.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("calculateAndReportStayTime isReporting: ");
                    sbLIZ.append(this.LLILZLL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c721190SQr.getClass();
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJI;
                PostModeEgressEtData postModeEgressEtData = this.LLJILJIL;
                final long j2 = postModeEgressEtData.photoModeDuration + jCurrentTimeMillis;
                final long j3 = postModeEgressEtData.postModeDuration;
                if (j3 + j2 < 100) {
                    return;
                }
                this.LLILZLL = true;
                final HashMap<String, Long> map = this.LLJ;
                C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0RTc
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void LIZ() {
                        String aid;
                        DetailNavArgModel navArgModel;
                        DetailNavArgModel navArgModel2;
                        DetailNavArgModel navArgModel3;
                        long j4 = j2;
                        if (j4 >= 0) {
                            long j5 = j3;
                            if (j5 >= 0) {
                                C0SQK c0sqk = C0SQK.LIZ;
                                Aweme aweme2 = aweme;
                                C696330RTb c696330RTb = this;
                                String str = c696330RTb.LLILLL;
                                double d = c696330RTb.LLILLJJLI;
                                double dLJIIIIZZ = C2179771ASp.LJIIIIZZ();
                                Pair[] pairArr = new Pair[7];
                                pairArr[0] = new Pair("graphic_text_duration", CardStruct.IStatusCode.DEFAULT);
                                pairArr[1] = new Pair("graphic_read_duration", CardStruct.IStatusCode.DEFAULT);
                                pairArr[2] = new Pair("graphic_comment_read_duration", CardStruct.IStatusCode.DEFAULT);
                                C2189821An6 c2189821An6 = this.LLILZ;
                                if (c2189821An6 == null || (aid = c2189821An6.getAid()) == null) {
                                    aid = "";
                                }
                                pairArr[3] = new Pair("explore_innerfeed_entrance_group_id", aid);
                                C2189821An6 c2189821An62 = this.LLILZ;
                                String fromExplorePage = null;
                                pairArr[4] = new Pair("explore_topic_id", String.valueOf((c2189821An62 == null || (navArgModel3 = c2189821An62.getNavArgModel()) == null) ? null : navArgModel3.getExploreTabID()));
                                C2189821An6 c2189821An63 = this.LLILZ;
                                pairArr[5] = new Pair("explore_topic", String.valueOf((c2189821An63 == null || (navArgModel2 = c2189821An63.getNavArgModel()) == null) ? null : navArgModel2.getExploreTabName()));
                                C2189821An6 c2189821An64 = this.LLILZ;
                                if (c2189821An64 != null && (navArgModel = c2189821An64.getNavArgModel()) != null) {
                                    fromExplorePage = navArgModel.getFromExplorePage();
                                }
                                pairArr[6] = new Pair("from_explore_page", String.valueOf(fromExplorePage));
                                C0SQK.LIZ(c0sqk, aweme2, j4, j5, str, d, dLJIIIIZZ, null, C2097608Jq.LJI(pairArr), map, 128);
                            }
                        }
                        C696330RTb c696330RTb2 = this;
                        c696330RTb2.LLIZ += j2;
                        c696330RTb2.LLIZLLLIL += j3;
                        c696330RTb2.LLJI = -1L;
                        c696330RTb2.LL = 0L;
                        c696330RTb2.LLILLJJLI = 0.0d;
                        long j6 = 0;
                        c696330RTb2.LLJILJIL = new PostModeEgressEtData(false, (EnumC721170SQp) null, j6, j6, j6, (Long) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), 255);
                        c696330RTb2.LLILZLL = false;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FeedPhotosViewHolderTimeLogger@e92c.calculateAndReportStayTime$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FeedPhotosViewHolderTimeLogger@e92c.calculateAndReportStayTime$1");
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C696330RTb(String str, C2189821An6 c2189821An6, int i) {
        c2189821An6 = (i & 8) != 0 ? null : c2189821An6;
        this.LL = 0L;
        this.LLILLJJLI = 0.0d;
        this.LLILLL = str;
        this.LLILZ = c2189821An6;
        this.LLJI = -1L;
        long j = 0;
        this.LLJILJIL = new PostModeEgressEtData(false, (EnumC721170SQp) null, j, j, j, (Long) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), 255);
    }
}
