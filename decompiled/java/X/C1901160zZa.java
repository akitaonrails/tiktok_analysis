package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.List;

/* JADX INFO: renamed from: X.0zZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901160zZa extends AbstractC1900910zZB<C1901220zZg, NoticeCombineResponse> {
    public static final C1901160zZa LIZJ = new C1901160zZa();
    public static final String LIZLLL = "JanusNoticePreloadManager";

    @Override // X.AbstractC1900910zZB
    public final boolean LJI() {
        if (C297280Bl0.LIZ() && C2367709Pn.LJIIIIZZ(C1BWL.LIZ())) {
            return false;
        }
        if (((Number) C1866790yg9.LIZ.getValue()).intValue() < 1) {
            if (!C890280YwE.LIZIZ.LIZJ(true)) {
                return false;
            }
            C889930Yvf.LIZ.getClass();
            if (!C890080Yvu.LIZIZ.LIZJ(true)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC1900910zZB
    public final String LJFF() {
        return LIZLLL;
    }

    @Override // X.AbstractC1900910zZB
    public final AbstractC1900890zZ9 LIZIZ(final String str, final String str2) {
        return new AbstractC1900890zZ9<NoticeCombineResponse>(str, str2) { // from class: X.0zZg
            public NoticeCombineResponse LIZLLL;

            @Override // X.AbstractC1900890zZ9
            public final void LIZLLL() {
                NoticeCombineDatas data;
                NoticeCombineDatas data2;
                if (this.LIZJ) {
                    NoticeCombineResponse noticeCombineResponse = this.LIZLLL;
                    List<NoticeItems> list = null;
                    C1900950zZF.LIZLLL((noticeCombineResponse == null || (data2 = noticeCombineResponse.getData()) == null) ? null : data2.reportNotice);
                    NoticeCombineResponse noticeCombineResponse2 = this.LIZLLL;
                    if (noticeCombineResponse2 != null && (data = noticeCombineResponse2.getData()) != null) {
                        list = data.shopNotice;
                    }
                    C1900950zZF.LIZLLL(list);
                }
            }

            @Override // X.AbstractC1900890zZ9
            public final /* bridge */ /* synthetic */ NoticeCombineResponse LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.AbstractC1900890zZ9
            public final void LIZ(BaseNotice baseNotice) {
                NoticeCombineDatas data;
                List<NoticeItems> list;
                NoticeCombineDatas data2;
                List<NoticeItems> list2;
                NoticeCombineResponse noticeCombineResponse = this.LIZLLL;
                if (noticeCombineResponse != null && (data2 = noticeCombineResponse.getData()) != null && (list2 = data2.shopNotice) != null) {
                    C1900950zZF.LIZIZ(list2, baseNotice);
                }
                NoticeCombineResponse noticeCombineResponse2 = this.LIZLLL;
                if (noticeCombineResponse2 != null && (data = noticeCombineResponse2.getData()) != null && (list = data.reportNotice) != null) {
                    C1900950zZF.LIZIZ(list, baseNotice);
                }
            }

            @Override // X.AbstractC1900890zZ9
            public final /* bridge */ /* synthetic */ void LJ(NoticeCombineResponse noticeCombineResponse) {
                this.LIZLLL = noticeCombineResponse;
            }
        };
    }
}
