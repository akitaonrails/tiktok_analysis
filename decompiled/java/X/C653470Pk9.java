package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.search.common.repo.SearchContinuousLoadingApi;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS95S1200000_10;

/* JADX INFO: renamed from: X.0Pk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653470Pk9 extends AbstractC653490PkB<ContinuousLoadingAwemeList> {
    public int LLILLJJLI;
    public String LLILZ;
    public AwS95S1200000_10 LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(434));
    public String LLILLL = CardStruct.IStatusCode.DEFAULT;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(433));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(435));

    @Override // X.AbstractC653490PkB
    public final C11NZ<ContinuousLoadingAwemeList> LJIIJJI() {
        return ((SearchContinuousLoadingApi) this.LLILZLL.getValue()).getAwemeList(LJIILIIL().LIZ, LJIILIIL().LIZIZ, LJIILIIL().LIZJ, LJIILIIL().LIZLLL, LJIILIIL().LJ, LJIILIIL().LJFF);
    }

    public final C653530PkF LJIILIIL() {
        return (C653530PkF) this.LLIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void onModelBound() {
        super.onModelBound();
        String str = this.LLILZ;
        if (str != null) {
            C0PIF c0pif = C0PIF.LIZ;
            List<Aweme> list = ((ContinuousLoadingAwemeList) this.mData).awemeList;
            String str2 = this.LLILLL;
            c0pif.getClass();
            C0PIF.LJ(str, str2, list, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC653490PkB, X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJIILJJIL, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void handleData(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        long createTime;
        super.handleData(continuousLoadingAwemeList);
        if (continuousLoadingAwemeList != null) {
            LJIILIIL().LIZLLL = continuousLoadingAwemeList.cursor;
            C653530PkF c653530PkFLJIILIIL = LJIILIIL();
            Aweme aweme = (Aweme) C13LP.LJJLIIIJL(getItems());
            if (aweme != null) {
                createTime = aweme.getCreateTime();
            } else {
                createTime = 0;
            }
            c653530PkFLJIILIIL.LJFF = createTime;
            C0PFZ c0pfz = C0PFZ.LIZ;
            boolean z = true;
            if (this.mListQueryType != 1) {
                z = false;
            }
            List<Aweme> list = continuousLoadingAwemeList.awemeList;
            int i = this.LLILLJJLI;
            c0pfz.getClass();
            this.LLILLJJLI = C0PFZ.LIZLLL(i, z, list);
            List<Aweme> list2 = continuousLoadingAwemeList.awemeList;
            if (list2 != null) {
                for (Aweme aweme2 : list2) {
                    IAwemeService iAwemeService = (IAwemeService) this.LL.getValue();
                    String aid = aweme2.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    Aweme awemeLLILZ = iAwemeService.LLILZ(aid);
                    if (awemeLLILZ != null) {
                        aweme2.setUserDigg(awemeLLILZ.getUserDigg());
                        AwemeStatistics statistics = awemeLLILZ.getStatistics();
                        if (statistics != null) {
                            aweme2.getStatistics().setDiggCount(statistics.getDiggCount());
                        }
                    }
                    ((IAwemeService) this.LL.getValue()).LLILLL(aweme2);
                }
            }
        }
        String str = this.LLILZ;
        if (str != null) {
            C0PIF c0pif = C0PIF.LIZ;
            List<Aweme> list3 = ((ContinuousLoadingAwemeList) this.mData).awemeList;
            String str2 = this.LLILLL;
            c0pif.getClass();
            C0PIF.LJ(str, str2, list3, false);
        }
        AwS95S1200000_10 awS95S1200000_10 = this.LLILZIL;
        if (awS95S1200000_10 != null) {
            awS95S1200000_10.invoke(continuousLoadingAwemeList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILL(ContinuousLoadingAwemeList continuousLoadingAwemeList) {
        int size;
        this.mData = continuousLoadingAwemeList;
        List<Aweme> list = continuousLoadingAwemeList.awemeList;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        this.LLILLJJLI = size;
    }
}
