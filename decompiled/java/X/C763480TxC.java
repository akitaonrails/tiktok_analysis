package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0TxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C763480TxC {
    public long LIZJ;
    public Function1<? super Long, Unit> LIZLLL;
    public MusicSong LJ;
    public boolean LJFF;
    public long LIZ = -1;
    public List<MusicSong> LIZIZ = new ArrayList();
    public final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(284));

    public final MusicSong LIZLLL() {
        Integer numLIZJ = LIZJ(this.LJ);
        if (numLIZJ == null) {
            return null;
        }
        int iIntValue = numLIZJ.intValue() + 1;
        if (iIntValue < ((ArrayList) this.LIZIZ).size()) {
            return (MusicSong) ListProtector.get(this.LIZIZ, iIntValue);
        }
        if (this.LIZ == 0 && LJI()) {
            return (MusicSong) C13LP.LJJJJZI(this.LIZIZ);
        }
        return null;
    }

    public final boolean LJI() {
        return this.LIZIZ.isEmpty() || this.LIZ + ((long) this.LIZIZ.size()) >= this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C763530TxH
            if (r0 == 0) goto L5a
            r5 = r7
            X.0TxH r5 = (X.C763530TxH) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L46
            if (r0 != r3) goto L66
            X.C155000ia.LIZIZ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r2 = r1.data
            tikcast.api.anchor.PlaylistSongsResponse$ResponseData r2 = (tikcast.api.anchor.PlaylistSongsResponse.ResponseData) r2
            if (r2 == 0) goto L60
            long r0 = r2.total
            r6.LJIIJ(r0)
            r0 = 0
            r6.LIZ = r0
            java.util.List<webcast.data.MusicSong> r0 = r6.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<webcast.data.MusicSong> r1 = r6.LIZIZ
            java.util.List<webcast.data.MusicSong> r0 = r2.songs
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0TxE r1 = new X.0TxE
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L5a:
            X.0TxH r5 = new X.0TxH
            r5.<init>(r6, r7)
            goto L12
        L60:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            throw r0
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763480TxC.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final Integer LIZJ(MusicSong musicSong) {
        if (musicSong == null) {
            return null;
        }
        Iterator<MusicSong> it2 = this.LIZIZ.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().id == musicSong.id) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            return null;
        }
        return numValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C763540TxI
            if (r0 == 0) goto L5b
            r7 = r9
            X.0TxI r7 = (X.C763540TxI) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L3b
            if (r0 != r5) goto L67
            X.C155000ia.LIZIZ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r2 = r1.data
            tikcast.api.anchor.PlaylistSongsResponse$ResponseData r2 = (tikcast.api.anchor.PlaylistSongsResponse.ResponseData) r2
            if (r2 == 0) goto L61
            java.util.List<webcast.data.MusicSong> r1 = r8.LIZIZ
            java.util.List<webcast.data.MusicSong> r0 = r2.songs
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
            long r0 = r2.total
            r8.LJIIJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3b:
            X.C155000ia.LIZIZ(r1)
            long r3 = r8.LIZ
            java.util.List<webcast.data.MusicSong> r0 = r8.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            long r0 = (long) r0
            long r3 = r3 + r0
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0TxB r1 = new X.0TxB
            r0 = 0
            r1.<init>(r8, r3, r0)
            r7.LLILLL = r5
            java.lang.Object r1 = X.C23250099c.LJI(r7, r2, r1)
            if (r1 != r6) goto L22
            return r6
        L5b:
            X.0TxI r7 = new X.0TxI
            r7.<init>(r8, r9)
            goto L12
        L61:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            throw r0
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763480TxC.LJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super java.util.List<webcast.data.MusicSong>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C763550TxJ
            if (r0 == 0) goto L68
            r6 = r9
            X.0TxJ r6 = (X.C763550TxJ) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            if (r0 == 0) goto L48
            if (r0 != r5) goto L74
            X.C155000ia.LIZIZ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r4 = r1.data
            tikcast.api.anchor.PlaylistSongsResponse$ResponseData r4 = (tikcast.api.anchor.PlaylistSongsResponse.ResponseData) r4
            if (r4 == 0) goto L6e
            java.util.List<webcast.data.MusicSong> r2 = r8.LIZIZ
            java.util.List<webcast.data.MusicSong> r1 = r4.songs
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r0 = 0
            r2.addAll(r0, r1)
            long r2 = r8.LIZ
            java.util.List<webcast.data.MusicSong> r0 = r4.songs
            int r0 = r0.size()
            long r0 = (long) r0
            long r2 = r2 - r0
            r8.LIZ = r2
            long r0 = r4.total
            r8.LJIIJ(r0)
            java.util.List<webcast.data.MusicSong> r0 = r4.songs
            return r0
        L48:
            X.C155000ia.LIZIZ(r1)
            long r2 = r8.LIZ
            r0 = 50
            long r0 = (long) r0
            long r2 = r2 - r0
            r0 = 0
            long r3 = java.lang.Math.max(r2, r0)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0TxA r1 = new X.0TxA
            r0 = 0
            r1.<init>(r8, r3, r0)
            r6.LLILLL = r5
            java.lang.Object r1 = X.C23250099c.LJI(r6, r2, r1)
            if (r1 != r7) goto L22
            return r7
        L68:
            X.0TxJ r6 = new X.0TxJ
            r6.<init>(r8, r9)
            goto L12
        L6e:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            throw r0
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763480TxC.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C763560TxK
            if (r0 == 0) goto L44
            r4 = r6
            X.0TxK r4 = (X.C763560TxK) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L4a
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List<webcast.data.MusicSong> r0 = r5.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.lang.String r1 = "0"
            int r0 = X.C763260Twq.LIZJ
            X.C763230Twn.LIZJ(r0, r1)
            r0 = 0
            X.C763260Twq.LIZJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L36:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            r0 = -1
            java.lang.Object r0 = r5.LJIIIZ(r0, r4)
            if (r0 != r2) goto L22
            return r2
        L44:
            X.0TxK r4 = new X.0TxK
            r4.<init>(r5, r6)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763480TxC.LJII(X.05Vn):java.lang.Object");
    }

    public final void LJIIJ(long j) {
        this.LIZJ = j;
        Function1<? super Long, Unit> function1 = this.LIZLLL;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<webcast.data.MusicSong> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763480TxC.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C763520TxG
            if (r0 == 0) goto L44
            r4 = r7
            X.0TxG r4 = (X.C763520TxG) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L4a
            int r6 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.util.List<webcast.data.MusicSong> r0 = r5.LIZIZ
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r0, r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            java.util.List<webcast.data.MusicSong> r0 = r5.LIZIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            webcast.data.MusicSong r0 = (webcast.data.MusicSong) r0
            long r0 = r0.id
            r4.LL = r6
            r4.LLILZ = r2
            java.lang.Object r0 = r5.LJIIIZ(r0, r4)
            if (r0 != r3) goto L24
            return r3
        L44:
            X.0TxG r4 = new X.0TxG
            r4.<init>(r5, r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763480TxC.LJIIIIZZ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(long r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C763570TxL
            if (r0 == 0) goto L46
            r5 = r9
            X.0TxL r5 = (X.C763570TxL) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L52
            X.C155000ia.LIZIZ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r0 = r1.data
            tikcast.api.anchor.PlaylistDeleteResponse$ResponseData r0 = (tikcast.api.anchor.PlaylistDeleteResponse.ResponseData) r0
            if (r0 == 0) goto L4c
            long r0 = r0.total
            r6.LJIIJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0TxD r1 = new X.0TxD
            r0 = 0
            r1.<init>(r6, r7, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L46:
            X.0TxL r5 = new X.0TxL
            r5.<init>(r6, r9)
            goto L12
        L4c:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            throw r0
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C763480TxC.LJIIIZ(long, X.05Vn):java.lang.Object");
    }
}
