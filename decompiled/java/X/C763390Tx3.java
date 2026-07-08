package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Tx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763390Tx3 {
    public final Map<Long, C763160Twg> LIZ = new HashMap();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(288));

    public final C763160Twg LIZJ(long j) {
        return (C763160Twg) ((HashMap) this.LIZ).get(Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super java.lang.Long> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C763440Tx8
            if (r0 == 0) goto L25
            r4 = r11
            X.0Tx8 r4 = (X.C763440Tx8) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r7 = 0
            r6 = 1
            r8 = -1
            if (r0 == 0) goto L33
            if (r0 != r6) goto L2b
            long r1 = r4.LL
            goto L61
        L25:
            X.0Tx8 r4 = new X.0Tx8
            r4.<init>(r10, r11)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r3)
            java.util.Map<java.lang.Long, X.0Twg> r1 = r10.LIZ
            java.lang.Long r0 = X.C2286608xc.LJFF(r8)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            X.0Twg r0 = (X.C763160Twg) r0
            if (r0 == 0) goto Lb8
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZ
            if (r0 == 0) goto Lb8
            int r0 = r0.size()
            long r1 = (long) r0
            X.1DFB r3 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L6a
            X.0Tx1 r0 = new X.0Tx1     // Catch: java.lang.Exception -> L6a
            r0.<init>(r10, r1, r7)     // Catch: java.lang.Exception -> L6a
            r4.LL = r1     // Catch: java.lang.Exception -> L6a
            r4.LLILZ = r6     // Catch: java.lang.Exception -> L6a
            java.lang.Object r3 = X.C23250099c.LJI(r4, r3, r0)     // Catch: java.lang.Exception -> L6a
            if (r3 != r5) goto L64
            return r5
        L61:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L68
        L64:
            tikcast.api.anchor.FavouritesSongsResponse$ResponseData r3 = (tikcast.api.anchor.FavouritesSongsResponse.ResponseData) r3     // Catch: java.lang.Exception -> L68
            r7 = r3
            goto L6e
        L68:
            r0 = move-exception
            goto L6b
        L6a:
            r0 = move-exception
        L6b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6e:
            if (r7 != 0) goto L75
            java.lang.Long r0 = X.C2286608xc.LJFF(r8)
            return r0
        L75:
            java.util.List<webcast.data.MusicSong> r0 = r7.songs
            java.util.Iterator r5 = r0.iterator()
        L7b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r4 = r5.next()
            webcast.data.MusicSong r4 = (webcast.data.MusicSong) r4
            r4.isFavourite = r6
            java.util.Map<java.lang.Long, X.0Twg> r3 = r10.LIZ
            java.lang.Long r0 = X.C2286608xc.LJFF(r8)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r0 = r3.get(r0)
            X.0Twg r0 = (X.C763160Twg) r0
            if (r0 == 0) goto L7b
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZ
            if (r0 == 0) goto L7b
            boolean r0 = r0.add(r4)
            java.lang.Boolean.valueOf(r0)
            goto L7b
        La5:
            boolean r0 = r7.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto Lb3
            r1 = 0
        Lb3:
            java.lang.Long r0 = X.C2286608xc.LJFF(r1)
            return r0
        Lb8:
            java.lang.Long r0 = X.C2286608xc.LJFF(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763390Tx3.LJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(webcast.data.MusicSong r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763390Tx3.LIZ(webcast.data.MusicSong, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(webcast.data.MusicSong r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763390Tx3.LIZIZ(webcast.data.MusicSong, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel r12, X.InterfaceC1364105Vn<? super java.util.List<X.C763220Twm>> r13) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763390Tx3.LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(long r14, X.InterfaceC1364105Vn<? super java.lang.Long> r16) {
        /*
            r13 = this;
            r3 = r16
            r8 = r14
            boolean r0 = r3 instanceof X.C763430Tx7
            r7 = r13
            if (r0 == 0) goto L28
            r5 = r3
            X.0Tx7 r5 = (X.C763430Tx7) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L16:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 != r2) goto L34
            long r10 = r5.LLILLJJLI
            long r8 = r5.LL
            goto L2e
        L28:
            X.0Tx7 r5 = new X.0Tx7
            r5.<init>(r7, r3)
            goto L16
        L2e:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L32
            goto L6e
        L32:
            r0 = move-exception
            goto L74
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            X.C155000ia.LIZIZ(r4)
            java.util.Map<java.lang.Long, X.0Twg> r1 = r7.LIZ
            java.lang.Long r0 = X.C2286608xc.LJFF(r8)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            X.0Twg r0 = (X.C763160Twg) r0
            if (r0 == 0) goto Lc0
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZ
            if (r0 == 0) goto Lc0
            int r0 = r0.size()
            long r10 = (long) r0
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L71
            X.0Tx2 r6 = new X.0Tx2     // Catch: java.lang.Exception -> L71
            r12 = 0
            r0 = r6
            r6.<init>(r7, r8, r10, r12)     // Catch: java.lang.Exception -> L71
            r5.LL = r8     // Catch: java.lang.Exception -> L73
            r5.LLILLJJLI = r10     // Catch: java.lang.Exception -> L73
            r5.LLILZIL = r2     // Catch: java.lang.Exception -> L73
            java.lang.Object r4 = X.C23250099c.LJI(r5, r1, r0)     // Catch: java.lang.Exception -> L73
            if (r4 != r3) goto L6e
            return r3
        L6e:
            webcast.api.room.CollectionSongsResponse$PageSongs r4 = (webcast.api.room.CollectionSongsResponse.PageSongs) r4     // Catch: java.lang.Exception -> L73
            goto L78
        L71:
            r0 = move-exception
            goto L74
        L73:
            r0 = move-exception
        L74:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4 = 0
        L78:
            if (r4 != 0) goto L81
            r0 = -1
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            return r0
        L81:
            java.util.List<webcast.data.MusicSong> r0 = r4.songs
            java.util.Iterator r3 = r0.iterator()
        L87:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r2 = r3.next()
            java.util.Map<java.lang.Long, X.0Twg> r1 = r7.LIZ
            java.lang.Long r0 = X.C2286608xc.LJFF(r8)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            X.0Twg r0 = (X.C763160Twg) r0
            if (r0 == 0) goto L87
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZ
            if (r0 == 0) goto L87
            boolean r0 = r0.add(r2)
            java.lang.Boolean.valueOf(r0)
            goto L87
        Lad:
            boolean r0 = r4.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto Lbb
            r10 = 0
        Lbb:
            java.lang.Long r0 = X.C2286608xc.LJFF(r10)
            return r0
        Lc0:
            r0 = -1
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763390Tx3.LJFF(long, X.05Vn):java.lang.Object");
    }
}
