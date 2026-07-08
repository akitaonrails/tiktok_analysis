package X;

import android.os.Message;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolInfoStruct;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rs3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605090rs3 extends AbstractC1255880imo<Aweme, C1605160rsA> {
    public final Aweme LL;
    public final SchoolInfoStruct LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(488));
    public final List<Aweme> LLILZ;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
    }

    public final void LJIIL() {
        SchoolPostsAPI schoolPostsAPI = (SchoolPostsAPI) this.LLILLL.getValue();
        if (schoolPostsAPI != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1605080rs2(schoolPostsAPI, this, null), 3);
        } else {
            Exception exc = new Exception("SchoolPostsAPI not available");
            Message messageObtain = Message.obtain();
            messageObtain.obj = exc;
            handleMsg(messageObtain);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        List<Aweme> list;
        C1605160rsA c1605160rsA = (C1605160rsA) this.mData;
        return (c1605160rsA == null || (list = c1605160rsA.LIZ) == null) ? this.LLILZ : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        C1605160rsA c1605160rsA = (C1605160rsA) this.mData;
        return c1605160rsA != null && c1605160rsA.LIZIZ == EnumC311490CIx.TRUE_MORE.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[PHI: r4
      0x004d: PHI (r4v1 java.util.ArrayList) = (r4v0 java.util.ArrayList), (r4v3 java.util.ArrayList) binds: [B:22:0x004a, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1605160rsA LJIIJ(com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsRelatedResponse r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.getInfoList()
            if (r0 == 0) goto L44
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.profile.business.ur.school.datasource.RelatedAwemeResponseInfo r1 = (com.ss.android.ugc.profile.business.ur.school.datasource.RelatedAwemeResponseInfo) r1
            if (r1 == 0) goto L45
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r1.awemeList
            if (r0 == 0) goto L45
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L17:
            java.lang.Integer r0 = r1.hasMore
            if (r0 == 0) goto L4d
            int r3 = r0.intValue()
        L1f:
            T r0 = r5.mData
            X.0rsA r0 = (X.C1605160rsA) r0
            if (r0 == 0) goto L37
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.LIZ
            if (r0 == 0) goto L37
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L2e:
            r1.addAll(r4)
            X.0rsA r0 = new X.0rsA
            r0.<init>(r1, r3)
            return r0
        L37:
            r0 = 1
            com.ss.android.ugc.aweme.feed.model.Aweme[] r2 = new com.ss.android.ugc.aweme.feed.model.Aweme[r0]
            r1 = 0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LL
            r2[r1] = r0
            java.util.List r1 = X.C1697810uHb.LJIILJJIL(r2)
            goto L2e
        L44:
            r1 = 0
        L45:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r1 == 0) goto L4d
            goto L17
        L4d:
            X.0CIx r0 = X.EnumC311490CIx.FALSE_MORE
            int r3 = r0.getValue()
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1605090rs3.LJIIJ(com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsRelatedResponse):X.0rsA");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1605160rsA LJIIJJI(List<? extends Aweme> list) {
        List listLJIILJJIL;
        List<Aweme> list2;
        C1605160rsA c1605160rsA = (C1605160rsA) this.mData;
        if (c1605160rsA != null && (list2 = c1605160rsA.LIZ) != null) {
            listLJIILJJIL = new ArrayList(list2);
        } else {
            listLJIILJJIL = C1697810uHb.LJIILJJIL(this.LL);
        }
        listLJIILJJIL.addAll(list);
        return new C1605160rsA(listLJIILJJIL, EnumC311490CIx.TRUE_MORE.getValue());
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1605100rs4(this, null), 3);
    }

    public C1605090rs3(Aweme aweme, SchoolInfoStruct schoolInfoStruct, List<? extends Aweme> list) {
        this.LL = aweme;
        this.LLILLJJLI = schoolInfoStruct;
        ArrayList arrayList = new ArrayList();
        arrayList.add(aweme);
        arrayList.addAll(list);
        this.LLILZ = arrayList;
        handleData(new C1605160rsA(arrayList, EnumC311490CIx.TRUE_MORE.getValue()));
    }
}
