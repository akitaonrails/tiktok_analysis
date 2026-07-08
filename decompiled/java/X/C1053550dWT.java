package X;

import Y.ARunnableS49S0300000_16;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryAdInfo;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryRawAdInfo;
import com.ss.android.ugc.aweme.history.model.IabHistorySaveDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dWT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053550dWT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public volatile C1053650dWd LIZ;
    public volatile C2452409jG LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1053550dWT.class, "historyRepo", "getHistoryRepo()Lcom/ss/android/ugc/aweme/history/AdWebHistoryRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1053550dWT.class, "historyNewDataHolder", "getHistoryNewDataHolder()Lcom/ss/android/ugc/aweme/history/AdWebHistoryNewDataHolder;", 0);
        c09r3.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final C2452409jG LIZIZ() {
        C2452409jG c2452409jG = this.LIZIZ;
        if (c2452409jG == null) {
            synchronized (this) {
                c2452409jG = this.LIZIZ;
                if (c2452409jG == null) {
                    C2452409jG c2452409jG2 = (C2452409jG) C1807670x8n.LJJJJJ();
                    this.LIZIZ = c2452409jG2;
                    return c2452409jG2;
                }
            }
        }
        return c2452409jG;
    }

    public final C1053650dWd LIZJ() {
        C1053650dWd c1053650dWd = this.LIZ;
        if (c1053650dWd == null) {
            synchronized (this) {
                c1053650dWd = this.LIZ;
                if (c1053650dWd == null) {
                    C1053650dWd c1053650dWd2 = (C1053650dWd) C1807670x8n.LJJJJL((C1053740dWm) C1807670x8n.LJJJJJL(), (C1053730dWl) C1807670x8n.LJJJJIZL(), (C2452609jI) C1807670x8n.LJJJJ());
                    this.LIZ = c1053650dWd2;
                    return c1053650dWd2;
                }
            }
        }
        return c1053650dWd;
    }

    public C1053550dWT() {
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new InterfaceC586170Myt() { // from class: X.0dWi
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (i == 3) {
                    C1053650dWd c1053650dWdLIZJ = this.LL.LIZJ();
                    c1053650dWdLIZJ.LIZIZ.LIZ = null;
                    c1053650dWdLIZJ.LIZJ.LIZ();
                    this.LL.LIZIZ().LIZ();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    public final List<AdWebHistoryEntity> LJ() {
        ?? arrayList;
        List<AdWebHistoryEntity> list;
        AdWebHistoryEntity adWebHistoryEntityCopy;
        List<IabHistorySaveDetail> listLIZJ = LIZIZ().LIZJ();
        ArrayList arrayList2 = new ArrayList();
        for (IabHistorySaveDetail iabHistorySaveDetail : (ArrayList) listLIZJ) {
            if (iabHistorySaveDetail == null || (list = iabHistorySaveDetail.adWebHistoryEntities) == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (AdWebHistoryEntity adWebHistoryEntity : list) {
                    if (adWebHistoryEntity != null) {
                        AdWebHistoryAdInfo adWebHistoryAdInfo = adWebHistoryEntity.adWebHistoryAdInfo;
                        if (adWebHistoryAdInfo == null) {
                            adWebHistoryAdInfo = iabHistorySaveDetail.adWebHistoryAdInfo;
                        }
                        adWebHistoryEntityCopy = adWebHistoryEntity.copy(adWebHistoryEntity.url, adWebHistoryEntity.title, adWebHistoryEntity.coverUrl, adWebHistoryEntity.requestTime, adWebHistoryEntity.requestTimeStr, adWebHistoryEntity.order, adWebHistoryEntity.cursorId, adWebHistoryEntity.uniqueId, adWebHistoryAdInfo, adWebHistoryEntity.status, adWebHistoryEntity.containerId);
                    } else {
                        adWebHistoryEntityCopy = null;
                    }
                    arrayList.add(adWebHistoryEntityCopy);
                }
            }
            C19719612Di.LJJI(arrayList, arrayList2);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1053630dWb
            if (r0 == 0) goto L48
            r4 = r6
            X.0dWb r4 = (X.C1053630dWb) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L4e
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse r3 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryDeleteResponse) r3
            if (r3 == 0) goto L37
            java.lang.Integer r0 = r3.statusCode
            if (r0 == 0) goto L37
            int r0 = r0.intValue()
            if (r0 != 0) goto L37
            X.09jG r0 = r5.LIZIZ()
            r0.LIZ()
        L37:
            return r3
        L38:
            X.C155000ia.LIZIZ(r3)
            X.0dWd r0 = r5.LIZJ()
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZ(r4)
            if (r3 != r2) goto L22
            return r2
        L48:
            X.0dWb r4 = new X.0dWb
            r4.<init>(r5, r6)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053550dWT.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1053640dWc
            if (r0 == 0) goto L5f
            r6 = r8
            X.0dWc r6 = (X.C1053640dWc) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L65
            X.C155000ia.LIZIZ(r5)
        L23:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r5 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse) r5
            if (r5 == 0) goto L29
            java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity> r3 = r5.adWebHistoryEntities
        L29:
            return r3
        L2a:
            X.C155000ia.LIZIZ(r5)
            X.0dWd r1 = r7.LIZJ()
            r6.LLILLL = r2
            X.0dWl r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r5 = r0.LIZ
            if (r5 == 0) goto L48
            java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity> r0 = r5.adWebHistoryEntities
            if (r0 == 0) goto L5d
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L5d
        L45:
            if (r5 != r4) goto L23
            return r4
        L48:
            X.09jI r0 = r1.LIZJ
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r5 = r0.LIZIZ()
            if (r5 == 0) goto L5d
            java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity> r0 = r5.adWebHistoryEntities
            if (r0 == 0) goto L5d
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L5d
            goto L45
        L5d:
            r5 = r3
            goto L45
        L5f:
            X.0dWc r6 = new X.0dWc
            r6.<init>(r7, r8)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053550dWT.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1053580dWW
            if (r0 == 0) goto L9d
            r3 = r9
            X.0dWW r3 = (X.C1053580dWW) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r0 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILZ
            r7 = 1
            if (r1 == 0) goto L8b
            if (r1 != r7) goto La4
            java.lang.Object r6 = r3.LL
            java.util.List r6 = (java.util.List) r6
            X.C155000ia.LIZIZ(r0)
        L26:
            java.util.List r0 = (java.util.List) r0
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "AdWebHistoryManager loadFirstPageFromLocal newDataList size "
            r2.append(r1)
            int r1 = r6.size()
            r2.append(r1)
            java.lang.String r1 = " lastFirstPageList size "
            r2.append(r1)
            if (r0 == 0) goto L89
            int r1 = r0.size()
            java.lang.Integer r1 = X.C2286608xc.LJ(r1)
        L47:
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            boolean r1 = r6.isEmpty()
            r3 = r1 ^ 1
            r2 = 0
            if (r0 == 0) goto L87
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 != r7) goto L87
            r5 = 1
        L5f:
            int r4 = r6.size()
            if (r3 != 0) goto L68
            if (r5 != 0) goto L68
            r7 = 0
        L68:
            X.0dBY r3 = new X.0dBY
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3.<init>(r1)
            X.0dBp r1 = X.C1040750dBp.LIZ
            r1.getClass()
            X.0cKh r2 = X.C1040750dBp.LJJJJI
            X.0dCI r1 = new X.0dCI
            r1.<init>(r7, r5, r4)
            r3.log(r2, r1)
            if (r0 != 0) goto L82
            X.13BV r0 = X.C13BV.INSTANCE
        L82:
            java.util.List r0 = X.C13LP.LJLIL(r0, r6)
            return r0
        L87:
            r5 = 0
            goto L5f
        L89:
            r1 = 0
            goto L47
        L8b:
            X.C155000ia.LIZIZ(r0)
            java.util.List r6 = r8.LJ()
            r3.LL = r6
            r3.LLILZ = r7
            java.lang.Object r0 = r8.LIZLLL(r3)
            if (r0 != r2) goto L26
            return r2
        L9d:
            X.0dWW r3 = new X.0dWW
            r3.<init>(r8, r9)
            goto L12
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053550dWT.LJFF(X.05Vn):java.lang.Object");
    }

    public final void LJIIIIZZ(C1035880d3y c1035880d3y) {
        AwemeRawAd awemeRawAd;
        String refer;
        String str;
        Long l;
        String requestId;
        String awemeId = null;
        if (c1035880d3y == null) {
            awemeRawAd = null;
        } else {
            try {
                awemeRawAd = c1035880d3y.getAwemeRawAd();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return;
            }
        }
        AdWebHistoryRawAdInfo adWebHistoryRawAdInfoLIZ = C1029880cuI.LIZ(awemeRawAd);
        if (c1035880d3y != null) {
            refer = c1035880d3y.getRefer();
        } else {
            refer = null;
        }
        if (Intrinsics.LJFF(refer, "ad_history")) {
            str = "history";
        } else {
            str = "ad";
        }
        if (adWebHistoryRawAdInfoLIZ == null) {
            l = null;
        } else {
            l = adWebHistoryRawAdInfoLIZ.creativeId;
        }
        if (C289060BUq.LIZ()) {
            C823050WQl.LIZIZ().submit(new ARunnableS49S0300000_16(c1035880d3y, adWebHistoryRawAdInfoLIZ, this, 16));
            C2452409jG c2452409jGLIZIZ = LIZIZ();
            c2452409jGLIZIZ.LIZ = str;
            c2452409jGLIZIZ.LIZLLL = null;
            c2452409jGLIZIZ.LJ = l;
            c2452409jGLIZIZ.LJI = c1035880d3y;
            return;
        }
        if (c1035880d3y != null) {
            requestId = c1035880d3y.getRequestId();
            awemeId = c1035880d3y.getAwemeId();
        } else {
            requestId = null;
        }
        Boolean bool = Boolean.TRUE;
        C1227904rF.LIZ.getClass();
        AdWebHistoryAdInfo adWebHistoryAdInfo = new AdWebHistoryAdInfo(requestId, awemeId, null, bool, C1227904rF.LJI(adWebHistoryRawAdInfoLIZ));
        C2452409jG c2452409jGLIZIZ2 = LIZIZ();
        c2452409jGLIZIZ2.LIZ = str;
        c2452409jGLIZIZ2.LIZLLL = adWebHistoryAdInfo;
        c2452409jGLIZIZ2.LJ = l;
        c2452409jGLIZIZ2.LJI = c1035880d3y;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(long r10, X.InterfaceC1364105Vn r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053550dWT.LJI(long, X.05Vn, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(int r6, java.util.List r7, X.InterfaceC1364105Vn r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1053610dWZ
            if (r0 == 0) goto L33
            r4 = r8
            X.0dWZ r4 = (X.C1053610dWZ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L39
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            X.0dWd r0 = r5.LIZJ()
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r6, r7, r4)
            if (r3 != r2) goto L22
            return r2
        L33:
            X.0dWZ r4 = new X.0dWZ
            r4.<init>(r5, r8)
            goto L12
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053550dWT.LJIIIZ(int, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(int r6, java.util.List r7, X.InterfaceC1364105Vn r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1053620dWa
            if (r0 == 0) goto L20
            r4 = r8
            X.0dWa r4 = (X.C1053620dWa) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3a
        L20:
            X.0dWa r4 = new X.0dWa
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = r5.LJIIIZ(r6, r7, r4)     // Catch: java.lang.Throwable -> L43
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L43
        L3d:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r3 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse) r3     // Catch: java.lang.Throwable -> L43
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L43
            goto L4f
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L4f:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r0 == 0) goto L58
            X.C1AF0.LJ(r0)
        L58:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L5f
            r3 = 0
        L5f:
            com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse r3 = (com.ss.android.ugc.aweme.history.model.AdWebHistoryListCommonResponse) r3
            if (r3 == 0) goto L88
            java.lang.Integer r0 = r3.statusCode
            if (r0 == 0) goto L88
            int r0 = r0.intValue()
            if (r0 != 0) goto L88
            r0 = 1
        L6e:
            if (r0 == 0) goto L86
            java.util.List<com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity> r0 = r3.adWebHistoryEntities
            if (r0 == 0) goto L84
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r1) goto L84
            r0 = 1
        L7d:
            if (r0 == 0) goto L86
        L7f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L84:
            r0 = 0
            goto L7d
        L86:
            r1 = 0
            goto L7f
        L88:
            r0 = 0
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053550dWT.LJIIJJI(int, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity r15, java.lang.Boolean r16, java.lang.Boolean r17, int r18) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053550dWT.LJII(com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity, java.lang.Boolean, java.lang.Boolean, int):void");
    }

    /* JADX WARN: Path cross not found for [B:25:0x0094, B:30:0x00a0], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:22:0x008d, B:23:0x0090, B:25:0x0094, B:27:0x0098, B:32:0x00a3, B:34:0x00a7, B:39:0x00b4, B:40:0x00b6, B:15:0x005d, B:17:0x0061, B:19:0x0065, B:42:0x00c0), top: B:50:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:22:0x008d, B:23:0x0090, B:25:0x0094, B:27:0x0098, B:32:0x00a3, B:34:0x00a7, B:39:0x00b4, B:40:0x00b6, B:15:0x005d, B:17:0x0061, B:19:0x0065, B:42:0x00c0), top: B:50:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008a -> B:23:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.util.List<com.ss.android.ugc.aweme.history.model.IabHistorySaveDetail> r12, int r13, int r14, int r15, X.InterfaceC1364105Vn<? super java.lang.Boolean> r16) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053550dWT.LJIIJ(java.util.List, int, int, int, X.05Vn):java.lang.Object");
    }
}
