package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Cvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329440Cvm extends AbstractC1588960rS2<Aweme, TakoAwemeRecallResponse> implements C0PDP {
    public final String LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final String LLILZ;
    public int LLILZIL;
    public final List<String> LLILZLL = new ArrayList();
    public final List<Aweme> LLIZ = new ArrayList();
    public final C329170CvL LLIZLLLIL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t == 0 || ((TakoAwemeRecallResponse) t).hasMore;
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return this.LLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public final void handleData(TakoAwemeRecallResponse takoAwemeRecallResponse) {
        List<TakoVideoItem> list;
        this.mData = takoAwemeRecallResponse;
        if (takoAwemeRecallResponse != 0 && (list = takoAwemeRecallResponse.videoList) != null) {
            Iterator<TakoVideoItem> it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = it2.next().LIZ;
                if (aweme != null) {
                    if (!((ArrayList) this.LLILZLL).contains(aweme.getAid())) {
                        ((ArrayList) this.LLIZ).add(aweme);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C329430Cvl(this, null), 3);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C329430Cvl(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329440Cvm.LJIIJ(java.util.List, X.05Vn):java.lang.Object");
    }

    public C329440Cvm(long j, long j2, String str, String str2, List list) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = str2;
        if (list != null) {
            for (Aweme aweme : (ArrayList) list) {
                ((ArrayList) this.LLILZLL).add(aweme.getAid());
                ((ArrayList) this.LLIZ).add(aweme);
            }
        }
        this.LLIZLLLIL = new C329170CvL();
    }
}
