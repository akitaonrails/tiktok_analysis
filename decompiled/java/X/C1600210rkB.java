package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.util.FriendsStoryCacheData;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600210rkB {
    public final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public volatile boolean LIZIZ;
    public volatile String LIZJ;
    public volatile FriendsStoryCacheData LIZLLL;
    public volatile AnonymousClass0956 LJ;
    public volatile InterfaceC1455405mq<InterfaceC1891350zJl> LJFF;
    public volatile int LJI;
    public int LJII;

    public final void LIZ() {
        this.LIZLLL = null;
        Keva repo = Keva.getRepo("friendsV3_skylight_story_cache");
        repo.erase("cache_key_friendsV3_story_list_data");
        repo.erase("cache_key_friendsV3_story_list_extra_data");
    }

    public static String LIZIZ() {
        User userLIZ = C10EU.LIZ();
        if (userLIZ != null) {
            return userLIZ.getUid();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600210rkB.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C1600250rkF
            if (r0 == 0) goto L2c
            r7 = r10
            X.0rkF r7 = (X.C1600250rkF) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r3 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r8 = 2
            r5 = 1
            java.lang.String r4 = "FriendsSkylightStoryDataCenter"
            if (r0 == 0) goto L32
            if (r0 == r5) goto L73
            if (r0 == r8) goto L73
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.0rkF r7 = new X.0rkF
            r7.<init>(r9, r10)
            goto L12
        L32:
            X.C155000ia.LIZIZ(r3)
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "initLayeredDiskCache"
            X.C1720106oR.LJI(r4, r0)
            long r1 = java.lang.System.currentTimeMillis()
            X.0O9j r0 = X.C614770O9j.LIZIZ
            X.0Nxb r3 = r0.LJII()
            r0 = 0
            X.05IL r3 = r3.LIZJ(r0)
            if (r3 != 0) goto L55
            java.lang.String r0 = "initLayeredDiskCache: layeredDiskCache is null"
            X.C1720106oR.LJI(r4, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L55:
            com.ss.android.ugc.aweme.experiment.SkylightFullSceneDiskCacheConfig r0 = X.C596340NaC.LIZIZ()
            int r0 = r0.pagedReadPageCount
            if (r0 <= 0) goto L68
            r7.LL = r1
            r7.LLILZ = r5
            java.lang.Object r0 = r9.LJFF(r3, r0, r7)
            if (r0 != r6) goto L78
            return r6
        L68:
            r7.LL = r1
            r7.LLILZ = r8
            java.lang.Object r0 = r9.LJ(r3, r7)
            if (r0 != r6) goto L78
            return r6
        L73:
            long r1 = r7.LL
            X.C155000ia.LIZIZ(r3)
        L78:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "initLayeredDiskCache: cost="
            r3.append(r0)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r1
            r3.append(r5)
            java.lang.String r0 = "ms, data size="
            r3.append(r0)
            com.ss.android.ugc.aweme.base.util.FriendsStoryCacheData r0 = r9.LIZLLL
            if (r0 == 0) goto Lab
            java.util.List<X.0zJl> r0 = r0.powerItems
            if (r0 == 0) goto Lab
            int r0 = r0.size()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L9e:
            r3.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)
            X.C1720106oR.LJI(r4, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lab:
            r0 = 0
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600210rkB.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C05IL r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1600270rkH
            if (r0 == 0) goto L20
            r3 = r9
            X.0rkH r3 = (X.C1600270rkH) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r6 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L3a
        L20:
            X.0rkH r3 = new X.0rkH
            r3.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r6)
            r3.LLILLL = r0     // Catch: java.lang.Throwable -> L43
            java.lang.Object r6 = r8.LIZIZ(r3)     // Catch: java.lang.Throwable -> L43
            if (r6 != r2) goto L3d
            return r2
        L3a:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L43
        L3d:
            X.0Nxl r6 = (X.C610950Nxl) r6     // Catch: java.lang.Throwable -> L43
            X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L43
            goto L4f
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r6 = new X.00Yq
            r6.<init>(r0)
            X.C189200o6.m2constructorimpl(r6)
        L4f:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r6)
            if (r2 == 0) goto L5e
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "FriendsSkylightStoryDataCenter"
            java.lang.String r0 = "initLayeredDiskCacheFull: read disk cache error"
            X.C1720106oR.LIZIZ(r1, r0, r2)
        L5e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r6)
            if (r0 == 0) goto L65
            r6 = 0
        L65:
            X.0Nxl r6 = (X.C610950Nxl) r6
            if (r6 == 0) goto L7d
            com.ss.android.ugc.aweme.base.util.FriendsStoryCacheData r5 = new com.ss.android.ugc.aweme.base.util.FriendsStoryCacheData
            java.util.List<VO> r4 = r6.LIZIZ
            X.0rkS r3 = new X.0rkS
            com.ss.android.ugc.aweme.dc.core.SnapshotMeta r0 = r6.LIZ
            long r1 = r0.updateAt
            java.lang.String r0 = r0.userId
            r3.<init>(r1, r0)
            r5.<init>(r4, r3)
            r7.LIZLLL = r5
        L7d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600210rkB.LJ(X.05IL, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C05IL r14, int r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600210rkB.LJFF(X.05IL, int, X.05Vn):java.lang.Object");
    }

    public static void LJI(int i, long j, long j2, long j3) {
        C20684815ws.LJIILLIIL("friends_v3_legacy_read_cache", C2097608Jq.LJIIIIZZ(new Pair("keva_duration_ms", String.valueOf(j)), new Pair("deserialize_duration_ms", String.valueOf(j2)), new Pair("total_duration_ms", String.valueOf(j3)), new Pair("item_count", String.valueOf(i))));
    }
}
