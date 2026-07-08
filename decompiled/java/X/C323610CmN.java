package X;

import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0CmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323610CmN implements InterfaceC323360Cly {
    public final EnumC1262370ixH LIZ;
    public final String LIZIZ;
    public final IMafUserApi LIZJ;
    public final C323370Clz LIZLLL;
    public final Set<String> LJ;

    @Override // X.InterfaceC323480CmA
    public final void reset() {
        this.LJ.clear();
    }

    @Override // X.InterfaceC323480CmA
    public final /* bridge */ /* synthetic */ InterfaceC323640CmQ LJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC323360Cly
    public final void LIZIZ(List<String> list) {
        this.LJ.addAll(list);
    }

    public C323610CmN(EnumC1262370ixH enumC1262370ixH, String str) {
        MafUserApiService mafUserApiService = MafUserApiService.LIZIZ;
        C323370Clz c323370Clz = new C323370Clz(0);
        this.LIZ = enumC1262370ixH;
        this.LIZIZ = str;
        this.LIZJ = mafUserApiService;
        this.LIZLLL = c323370Clz;
        this.LJ = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // X.InterfaceC323480CmA
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C323370Clz r10, X.InterfaceC1364105Vn<? super X.AbstractC323330Clv<com.ss.android.ugc.aweme.feed.model.Aweme>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C323620CmO
            if (r0 == 0) goto L22
            r3 = r11
            X.0CmO r3 = (X.C323620CmO) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r2 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r8 = 1
            if (r0 == 0) goto L30
            if (r0 != r8) goto L28
            X.0Clz r10 = r3.LL
            goto L3e
        L22:
            X.0CmO r3 = new X.0CmO
            r3.<init>(r9, r11)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r2)
            r3.LL = r10     // Catch: java.lang.Throwable -> Lb7
            r3.LLILZ = r8     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r2 = r9.LJI(r10, r3)     // Catch: java.lang.Throwable -> Lb7
            if (r2 != r1) goto L41
            return r1
        L3e:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lb7
        L41:
            com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse r2 = (com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse) r2     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = r2.getNextPageToken()     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r2.getHasMore()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L5a
            int r0 = r7.length()     // Catch: java.lang.Throwable -> Lb7
            if (r0 <= 0) goto L54
            goto L56
        L54:
            r0 = 0
            goto L57
        L56:
            r0 = 1
        L57:
            if (r0 == 0) goto L5a
            goto L5b
        L5a:
            r8 = 0
        L5b:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r2.getLogPb()     // Catch: java.lang.Throwable -> Lb7
            r6 = 0
            if (r0 == 0) goto La0
            java.lang.String r5 = r0.getImprId()     // Catch: java.lang.Throwable -> Lb7
        L66:
            java.util.List r0 = r2.getAwemeList()     // Catch: java.lang.Throwable -> Lb7
            java.util.Set<java.lang.String> r4 = r9.LJ     // Catch: java.lang.Throwable -> Lb7
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb7
            r3.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> Lb7
        L75:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La2
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lb7
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r1.getAid()     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r4.contains(r0)     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto L8c
            r1 = r6
        L8c:
            if (r1 == 0) goto L99
            java.lang.String r0 = r1.getAid()     // Catch: java.lang.Throwable -> Lb7
            r4.add(r0)     // Catch: java.lang.Throwable -> Lb7
            r1.setRequestId(r5)     // Catch: java.lang.Throwable -> Lb7
            goto L9a
        L99:
            r1 = r6
        L9a:
            if (r1 == 0) goto L75
            r3.add(r1)     // Catch: java.lang.Throwable -> Lb7
            goto L75
        La0:
            r5 = r6
            goto L66
        La2:
            if (r8 == 0) goto Lb1
            int r0 = r10.LIZIZ     // Catch: java.lang.Throwable -> Lb7
            X.0Clz r1 = new X.0Clz     // Catch: java.lang.Throwable -> Lb7
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> Lb7
            X.0Clx r0 = new X.0Clx     // Catch: java.lang.Throwable -> Lb7
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> Lb7
            return r0
        Lb1:
            X.0Clu r0 = new X.0Clu     // Catch: java.lang.Throwable -> Lb7
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            return r0
        Lb7:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0Clt r0 = new X.0Clt
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323610CmN.LIZLLL(X.0Clz, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C323370Clz r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C323630CmP
            if (r0 == 0) goto L46
            r7 = r10
            X.0CmP r7 = (X.C323630CmP) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 != r5) goto L4c
            X.C155000ia.LIZIZ(r1)
        L22:
            X.08Uu r1 = (X.AbstractC2126608Uu) r1
            r1.checkValid()
            return r1
        L28:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.relation.api.IMafUserApi r4 = r8.LIZJ
            X.0ixH r0 = r8.LIZ
            int r3 = r0.getValue()
            java.lang.String r2 = r8.LIZIZ
            int r1 = r9.LIZIZ
            java.lang.String r0 = r9.LIZ
            X.11Kz r0 = r4.LIZ(r3, r2, r1, r0)
            r7.LLILLL = r5
            java.lang.Object r1 = X.C11UD.LIZIZ(r0, r7)
            if (r1 != r6) goto L22
            return r6
        L46:
            X.0CmP r7 = new X.0CmP
            r7.<init>(r8, r10)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323610CmN.LJI(X.0Clz, X.05Vn):java.lang.Object");
    }
}
