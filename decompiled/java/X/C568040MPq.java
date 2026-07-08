package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.celebration.CelebrationParam;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data.CelebrationMaterialData;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data.RecentCelebrationData;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.AwemeClientCacheStruct;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.ICelebrationRequestApi;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.RecentCelebrationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568040MPq {
    public final String LIZ;
    public AtomicBoolean LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(387));

    public C568040MPq(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public static String LIZIZ(List list) {
        Object c098200Yq;
        Object arrayList;
        Long lLJIILIIL;
        try {
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String aid = ((Aweme) it2.next()).getAid();
                    AwemeClientCacheStruct awemeClientCacheStruct = null;
                    if (aid != null) {
                        lLJIILIIL = C2095008Iq.LJIILIIL(aid);
                    } else {
                        lLJIILIIL = null;
                    }
                    if (lLJIILIIL != null && lLJIILIIL.longValue() != 0) {
                        awemeClientCacheStruct = new AwemeClientCacheStruct(lLJIILIIL.longValue());
                    }
                    if (awemeClientCacheStruct != null) {
                        arrayList.add(awemeClientCacheStruct);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C1227904rF.LIZ.getClass();
            c098200Yq = String.valueOf(C1227904rF.LJI(arrayList));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }

    public static RecentCelebrationResponse LJI(int i) {
        Object c098200Yq;
        AbstractC19484711Kz<RecentCelebrationResponse> abstractC19484711KzRequestRecentCelebration;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ICelebrationRequestApi iCelebrationRequestApi = (ICelebrationRequestApi) C313150CPh.LIZ.getValue();
            if (iCelebrationRequestApi != null && (abstractC19484711KzRequestRecentCelebration = iCelebrationRequestApi.requestRecentCelebration(i)) != null) {
                c098200Yq = abstractC19484711KzRequestRecentCelebration.LJ();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m8isSuccessimpl(c098200Yq)) {
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CeleRepo-recent");
                sbLIZ.append(", request error, e = ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            }
            c098200Yq = null;
        }
        RecentCelebrationResponse recentCelebrationResponse = (RecentCelebrationResponse) c098200Yq;
        C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
        C201955140j.LJIILJJIL(c554890LpX2, "CeleRepo, [info] request recent celebration: " + recentCelebrationResponse);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (recentCelebrationResponse != null && recentCelebrationResponse.status_code == 0) {
            InterfaceC567940MPg interfaceC567940MPg = C0MLA.LIZ;
            if (interfaceC567940MPg != null) {
                interfaceC567940MPg.LJFF(recentCelebrationResponse.getCelebrationParams());
            }
            C568060MPs.LIZ.getClass();
            C568060MPs.LIZLLL(i, jCurrentTimeMillis, jCurrentTimeMillis2, true);
            return recentCelebrationResponse;
        }
        C568060MPs.LIZ.getClass();
        C568060MPs.LIZLLL(i, jCurrentTimeMillis, jCurrentTimeMillis2, false);
        C201955140j.LIZJ(c554890LpX2, "CeleRepo-recent, [return] recent celebration status code != 0");
        return null;
    }

    public final boolean LIZ(String str) {
        String lastPullDate;
        if (this.LIZIZ == null) {
            C568030MPp c568030MPp = C568030MPp.LIZ;
            String str2 = this.LIZ;
            c568030MPp.getClass();
            C568030MPp.LIZ(str2, str);
            RecentCelebrationData recentCelebrationData = C568030MPp.LJ;
            if (recentCelebrationData != null) {
                lastPullDate = recentCelebrationData.getLastPullDate();
            } else {
                lastPullDate = null;
            }
            this.LIZIZ = new AtomicBoolean(Intrinsics.LJFF(lastPullDate, str));
        }
        AtomicBoolean atomicBoolean = this.LIZIZ;
        if (atomicBoolean != null && atomicBoolean.getAndSet(true)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r9, X.InterfaceC1364105Vn<? super X.C0D22> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C568120MPy
            if (r0 == 0) goto L21
            r7 = r10
            X.0MPy r7 = (X.C568120MPy) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r4 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L6a
        L21:
            X.0MPy r7 = new X.0MPy
            r7.<init>(r8, r10)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            X.0MKe r0 = X.C566620MKe.LIZ     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "first_render"
            r7.LLILLL = r1     // Catch: java.lang.Throwable -> L73
            r0.getClass()     // Catch: java.lang.Throwable -> L73
            X.0MLC r0 = X.C0MLC.LIZ     // Catch: java.lang.Throwable -> L73
            java.util.List r3 = r0.LIZIZ(r9)     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L4a
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L4a
            r1 = 0
        L4a:
            if (r1 == 0) goto L5b
            X.0LpX r1 = X.C554890LpX.LIZIZ     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "CeleMaterialRepo, [download return] material is empty"
            X.C201955140j.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L73
            X.0D22 r4 = new X.0D22     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "material empty"
            r4.<init>(r5, r5, r0, r5)     // Catch: java.lang.Throwable -> L73
            goto L67
        L5b:
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L73
            X.0Ccf r1 = new X.0Ccf     // Catch: java.lang.Throwable -> L73
            r0 = 0
            r1.<init>(r3, r9, r4, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r4 = X.C23250099c.LJI(r7, r2, r1)     // Catch: java.lang.Throwable -> L73
        L67:
            if (r4 != r6) goto L6d
            return r6
        L6a:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L73
        L6d:
            X.0D22 r4 = (X.C0D22) r4     // Catch: java.lang.Throwable -> L73
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L73
            goto L7f
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L7f:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r4)
            if (r3 == 0) goto L9a
            X.0LpX r2 = X.C554890LpX.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "CeleRepo, downloadAweme: fail = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJII(r2, r0)
        L9a:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r4)
            if (r0 == 0) goto Lad
            X.0D22 r4 = new X.0D22
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Laa
            java.lang.String r0 = ""
        Laa:
            r4.<init>(r5, r5, r0, r5)
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568040MPq.LIZJ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed A[Catch: all -> 0x011c, TryCatch #0 {all -> 0x011c, blocks: (B:59:0x010e, B:60:0x0116, B:48:0x00d5, B:49:0x00dd, B:51:0x00ed, B:52:0x00f1, B:54:0x00f7, B:42:0x00ae, B:43:0x00b6, B:45:0x00c1, B:23:0x004c, B:25:0x0066, B:27:0x006a, B:29:0x006e, B:31:0x0072, B:33:0x0076, B:35:0x007f, B:37:0x008a, B:39:0x0094), top: B:65:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7 A[Catch: all -> 0x011c, TryCatch #0 {all -> 0x011c, blocks: (B:59:0x010e, B:60:0x0116, B:48:0x00d5, B:49:0x00dd, B:51:0x00ed, B:52:0x00f1, B:54:0x00f7, B:42:0x00ae, B:43:0x00b6, B:45:0x00c1, B:23:0x004c, B:25:0x0066, B:27:0x006a, B:29:0x006e, B:31:0x0072, B:33:0x0076, B:35:0x007f, B:37:0x008a, B:39:0x0094), top: B:65:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.CelebrationMaterialResponse r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568040MPq.LJ(com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.CelebrationMaterialResponse, X.05Vn):java.lang.Object");
    }

    public final void LJII(String str, RecentCelebrationResponse recentCelebrationResponse) {
        Object c098200Yq;
        ArrayList arrayList;
        Object c098200Yq2;
        List<ForwardMedia> forwardMediaList;
        Object c098200Yq3;
        C568030MPp c568030MPp = C568030MPp.LIZ;
        String str2 = this.LIZ;
        c568030MPp.getClass();
        Object obj = null;
        String string = C568030MPp.LJIIIIZZ().getString(str2, null);
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LIZIZ(string, RecentCelebrationData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        RecentCelebrationData recentCelebrationData = (RecentCelebrationData) obj;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CelebrationParam> celebrationParams = recentCelebrationResponse.getCelebrationParams();
        if (celebrationParams != null) {
            for (CelebrationParam celebrationParam : celebrationParams) {
                linkedHashSet.add(Integer.valueOf(celebrationParam.celebrationType));
                if (celebrationParam.isToday) {
                    linkedHashSet2.add(Integer.valueOf(celebrationParam.celebrationType));
                }
                linkedHashMap.put(String.valueOf(celebrationParam.celebrationType), celebrationParam.extraParams);
            }
        }
        if (recentCelebrationData != null) {
            List<Integer> recentCelebration = recentCelebrationData.getRecentCelebration();
            if (recentCelebration != null) {
                Iterator<Integer> it2 = recentCelebration.iterator();
                while (it2.hasNext()) {
                    int iIntValue = it2.next().intValue();
                    if (!linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                        C568030MPp.LIZ.getClass();
                        C0MQ2.LIZ.getClass();
                        try {
                            ((Keva) C0MQ2.LIZLLL.getValue()).erase(String.valueOf(iIntValue));
                            c098200Yq2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                        if (thM5exceptionOrNullimpl != null) {
                            C554890LpX c554890LpX = C554890LpX.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("clear template nle error, ");
                            sbLIZ.append(thM5exceptionOrNullimpl);
                            C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                        }
                        CelebrationMaterialData celebrationMaterialDataLJFF = C568030MPp.LJFF(iIntValue, str2);
                        if (celebrationMaterialDataLJFF != null && (forwardMediaList = celebrationMaterialDataLJFF.getForwardMediaList()) != null) {
                            for (ForwardMedia forwardMedia : forwardMediaList) {
                                try {
                                    if (C2354709Kn.LIZIZ(forwardMedia.localPath)) {
                                        C465201rW.LIZ(new C0VSJ(forwardMedia.localPath));
                                    }
                                    c098200Yq3 = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq3);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    c098200Yq3 = new C098200Yq(th3);
                                    C189200o6.m2constructorimpl(c098200Yq3);
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
                                    C201955140j.LJII(C554890LpX.LIZIZ, "CeleMaterialKeva, delete file error");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            recentCelebrationData = new RecentCelebrationData(null, null, null, new ConcurrentHashMap(), "", "", null);
        }
        recentCelebrationData.setRecentCelebration(new ArrayList(linkedHashSet));
        recentCelebrationData.setTodayCelebration(new ArrayList(linkedHashSet2));
        List<Integer> readyCelebration = recentCelebrationData.getReadyCelebration();
        if (readyCelebration != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Integer num : readyCelebration) {
                if (linkedHashSet2.contains(Integer.valueOf(num.intValue()))) {
                    arrayList2.add(num);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        recentCelebrationData.setReadyCelebration(arrayList);
        recentCelebrationData.setDate(str);
        recentCelebrationData.setLastPullDate(str);
        recentCelebrationData.setExtraParams(linkedHashMap);
        Iterator<Map.Entry<String, String>> it3 = recentCelebrationData.getCelebrationExitDetail().entrySet().iterator();
        while (it3.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(it3.next().getKey());
            if (numLJIIJJI != null && !linkedHashSet2.contains(Integer.valueOf(numLJIIJJI.intValue()))) {
                it3.remove();
            }
        }
        C568030MPp.LIZLLL = str2;
        C568030MPp.LJ = recentCelebrationData;
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CeleMaterialDataStore, storeRecentCelebration: recent = " + linkedHashSet + ", \ntoday = " + linkedHashSet2 + "\nready = " + recentCelebrationData.getReadyCelebration());
        Keva kevaLJIIIIZZ = C568030MPp.LJIIIIZZ();
        C1227904rF.LIZ.getClass();
        kevaLJIIIIZZ.storeString(str2, C1227904rF.LJI(recentCelebrationData));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r8, java.lang.String r9, X.InterfaceC1364105Vn<? super java.lang.String> r10) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568040MPq.LIZLLL(android.content.Context, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.content.Context r13, int r14, int r15, boolean r16, X.InterfaceC1364105Vn r17) {
        /*
            r12 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C568100MPw
            r7 = r12
            if (r0 == 0) goto L57
            r4 = r3
            X.0MPw r4 = (X.C568100MPw) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.LLILLL = r2
        L15:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r11 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L5d
            X.C155000ia.LIZIZ(r1)
        L26:
            if (r1 != 0) goto L2e
            com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult r1 = new com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult
            r0 = -3
            r1.<init>(r0, r11)
        L2e:
            return r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0LpX r1 = X.C554890LpX.LIZIZ
            java.lang.String r0 = "CeleRepo, [start] request celebration material"
            X.C201955140j.LIZJ(r1, r0)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.05X5 r5 = new X.05X5
            r10 = r16
            r6 = r15
            r8 = r14
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r1, r11, r11, r5, r0)
            r4.LLILLL = r2
            java.lang.Object r1 = r0.LJLIIIL(r4)
            if (r1 != r3) goto L26
            return r3
        L57:
            X.0MPw r4 = new X.0MPw
            r4.<init>(r7, r3)
            goto L15
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568040MPq.LJIIIIZZ(android.content.Context, int, int, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:11:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(int r17, java.util.List<java.lang.Integer> r18, android.content.Context r19, boolean r20, boolean r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568040MPq.LJFF(int, java.util.List, android.content.Context, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
