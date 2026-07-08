package X;

import Y.ARunnableS81S0200000_12;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS28S0200100_12;
import kotlin.jvm.internal.AwS29S0000100_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.KaraokeTab;

/* JADX INFO: renamed from: X.0U2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U2Y {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final DataChannel LIZLLL;
    public final C765880U2o LJIIJ;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final C01GW LJIILL;
    public final ConcurrentHashMap<Long, C765690U1v> LJ = new ConcurrentHashMap<>();
    public final List<C763870Txp> LJFF = new CopyOnWriteArrayList();
    public final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(539));
    public List<? extends LiveEffect> LJII = C13BV.INSTANCE;
    public final C603820NmG<String, C765690U1v> LJIIIIZZ = new C603820NmG<>(20);
    public long LJIIIZ = -1;
    public volatile long LJIIJJI = -1;
    public volatile long LJIIL = -1;

    public final int LJIIJJI() {
        C765880U2o c765880U2o = this.LJIIJ;
        if (C763810Txj.LIZ(Integer.valueOf(c765880U2o.LIZ)) || !c765880U2o.LIZIZ) {
            return c765880U2o.LIZ;
        }
        return 3;
    }

    public final void LJIL() {
        Iterator it2 = Collections.list(this.LJ.keys()).iterator();
        while (it2.hasNext()) {
            LJFF(((Long) it2.next()).longValue(), AFwS245S0000000_12.get$arr$(246), AFwS245S0000000_12.get$arr$(247));
        }
        Iterator it3 = C13LP.LLIIII(((LinkedHashMap) this.LJIIIIZZ.LJIIIIZZ()).keySet()).iterator();
        while (it3.hasNext()) {
            LIZLLL((String) it3.next(), AFwS245S0000000_12.get$arr$(248), AFwS245S0000000_12.get$arr$(249));
        }
    }

    public final void LJJ() {
        ConcurrentHashMap<Long, C765690U1v> concurrentHashMap = this.LJ;
        boolean z = !C763810Txj.LIZ(Integer.valueOf(LJIIJJI()));
        C13BV c13bv = C13BV.INSTANCE;
        concurrentHashMap.put(-999L, C765530U1f.LIZ(0, z, c13bv));
        this.LJ.put(-998L, C765530U1f.LIZ(0, !C763810Txj.LIZ(Integer.valueOf(LJIIJJI())), c13bv));
    }

    public final boolean LJIILL() {
        return C763810Txj.LIZ(Integer.valueOf(LJIIJJI()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super java.util.List<X.C763870Txp>> r22) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r10) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJIIJ(X.05Vn):java.lang.Object");
    }

    public final synchronized C765690U1v LJIIL(long j) {
        return this.LJ.get(Long.valueOf(j));
    }

    public final boolean LJIILIIL(long j) {
        C765690U1v c765690U1v = this.LJ.get(Long.valueOf(j));
        if (c765690U1v == null || !(!c765690U1v.LIZJ.isEmpty()) || !c765690U1v.LIZIZ) {
            return false;
        }
        return true;
    }

    public final boolean LJIILJJIL(String str) {
        C765690U1v c765690U1vLIZJ = this.LJIIIIZZ.LIZJ(str);
        if (c765690U1vLIZJ == null || !(!c765690U1vLIZJ.LIZJ.isEmpty()) || !c765690U1vLIZJ.LIZIZ) {
            return false;
        }
        return true;
    }

    public final void LJJII(Exception exc) {
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS81S0200000_12(this, exc, 163));
    }

    public final boolean LJJIIJ(Long l) {
        boolean z;
        long jLongValue = ((Number) this.LJIILL.getValue()).longValue();
        if (l != null && l.longValue() == jLongValue) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILIIL = z;
        return z;
    }

    public final void LJJIJIIJI(KaraokeTab karaokeTab) {
        ConcurrentHashMap<Long, C765690U1v> concurrentHashMap = this.LJ;
        Long lValueOf = Long.valueOf(karaokeTab.id);
        int i = (int) karaokeTab.offset;
        boolean z = karaokeTab.hasMore;
        List<KaraokeSong> list = karaokeTab.songList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<KaraokeSong> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C005H.LIZ(it2.next(), null));
        }
        concurrentHashMap.put(lValueOf, C765530U1f.LIZ(i, z, arrayList));
    }

    public final synchronized boolean LIZ(long j, C0U22 c0u22) {
        C765690U1v c765690U1v = this.LJ.get(Long.valueOf(j));
        if (c765690U1v == null) {
            return false;
        }
        if (c765690U1v.LIZIZ) {
            return false;
        }
        if (j == -999 && c765690U1v.LIZJ.isEmpty()) {
            c0u22 = c0u22.LJ(C0U2R.PLAYING);
        }
        this.LJ.put(Long.valueOf(j), C765530U1f.LIZ(c765690U1v.LIZ, c765690U1v.LIZIZ, C13LP.LJLILLLLZI(c0u22, c765690U1v.LIZJ)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0U22 r20, X.InterfaceC1364105Vn<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LIZIZ(X.0U22, X.05Vn):java.lang.Object");
    }

    public final Object LIZJ(long j, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fu1(j, new AwS28S0200100_12(this, j, c23260099m, 4), new AwS591S0100000_12(c23260099m, 1202));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.0U1v] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r16, X.InterfaceC1364105Vn<? super X.C765690U1v> r17) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJII(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.C0U22 r20, X.InterfaceC1364105Vn<? super java.lang.Boolean> r21) {
        /*
            r19 = this;
            r4 = r21
            boolean r0 = r4 instanceof X.C765810U2h
            r5 = r19
            if (r0 == 0) goto L24
            r3 = r4
            X.0U2h r3 = (X.C765810U2h) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILLL = r2
        L16:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L63
        L24:
            X.0U2h r3 = new X.0U2h
            r3.<init>(r5, r4)
            goto L16
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r4)
            X.0Ism r4 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L6a
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r4.getClass()     // Catch: java.lang.Exception -> L6a
            java.lang.Object r6 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L6a
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r6 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r6     // Catch: java.lang.Exception -> L6a
            long r7 = r5.LIZ     // Catch: java.lang.Exception -> L6a
            r0 = r20
            long r9 = r0.LIZ     // Catch: java.lang.Exception -> L6a
            r11 = 9
            r12 = 0
            int r14 = r5.LJIIJJI()     // Catch: java.lang.Exception -> L6a
            java.lang.String r15 = r5.LIZJ     // Catch: java.lang.Exception -> L6a
            long r16 = r0.LJIIIIZZ()     // Catch: java.lang.Exception -> L6a
            r3.LLILLL = r1     // Catch: java.lang.Exception -> L6a
            r18 = r3
            java.lang.Object r4 = r6.updateQueueList(r7, r9, r11, r12, r14, r15, r16, r18)     // Catch: java.lang.Exception -> L6a
            if (r4 != r2) goto L66
            return r2
        L63:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L6a
        L66:
            X.0Icr r4 = (X.C470590Icr) r4     // Catch: java.lang.Exception -> L6a
            r0 = 1
            goto L7d
        L6a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            android.content.Context r1 = X.C497740JfY.LJII()
            r0 = 2131840684(0x7f114eac, float:1.9314655E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            X.C501540Jlg.LIZIZ(r1, r0, r2)
            r0 = 0
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJIIZILJ(X.0U22, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(X.C0U22 r20, X.InterfaceC1364105Vn<? super java.lang.Boolean> r21) {
        /*
            r19 = this;
            r4 = r21
            boolean r0 = r4 instanceof X.C765820U2i
            r5 = r19
            if (r0 == 0) goto L24
            r3 = r4
            X.0U2i r3 = (X.C765820U2i) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILLL = r2
        L16:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L62
        L24:
            X.0U2i r3 = new X.0U2i
            r3.<init>(r5, r4)
            goto L16
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r4)
            X.0Ism r4 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L69
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r4.getClass()     // Catch: java.lang.Exception -> L69
            java.lang.Object r6 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L69
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r6 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r6     // Catch: java.lang.Exception -> L69
            long r7 = r5.LIZ     // Catch: java.lang.Exception -> L69
            r0 = r20
            long r9 = r0.LIZ     // Catch: java.lang.Exception -> L69
            r11 = 3
            r12 = 0
            int r14 = r5.LJIIJJI()     // Catch: java.lang.Exception -> L69
            java.lang.String r15 = r5.LIZJ     // Catch: java.lang.Exception -> L69
            long r16 = r0.LJIIIIZZ()     // Catch: java.lang.Exception -> L69
            r3.LLILLL = r1     // Catch: java.lang.Exception -> L69
            r18 = r3
            java.lang.Object r4 = r6.updateQueueList(r7, r9, r11, r12, r14, r15, r16, r18)     // Catch: java.lang.Exception -> L69
            if (r4 != r2) goto L65
            return r2
        L62:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L69
        L65:
            X.0Icr r4 = (X.C470590Icr) r4     // Catch: java.lang.Exception -> L69
            r0 = 1
            goto L7c
        L69:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            android.content.Context r1 = X.C497740JfY.LJII()
            r0 = 2131840684(0x7f114eac, float:1.9314655E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            X.C501540Jlg.LIZIZ(r1, r0, r2)
            r0 = 0
        L7c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJIJ(X.0U22, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(X.C0U22 r19, X.InterfaceC1364105Vn<? super java.lang.Boolean> r20) {
        /*
            r18 = this;
            r6 = r20
            r2 = r19
            boolean r0 = r6 instanceof X.C765760U2c
            r3 = r18
            if (r0 == 0) goto L28
            r1 = r6
            X.0U2c r1 = (X.C765760U2c) r1
            int r5 = r1.LLILZ
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r4
            if (r0 == 0) goto L28
            int r5 = r5 - r4
            r1.LLILZ = r5
        L18:
            java.lang.Object r5 = r1.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r6 = r1.LLILZ
            r0 = 1
            if (r6 == 0) goto L36
            if (r6 != r0) goto L2e
            X.0U22 r2 = r1.LL
            goto L66
        L28:
            X.0U2c r1 = new X.0U2c
            r1.<init>(r3, r6)
            goto L18
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r5)
            X.0Ism r6 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L74
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r5 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r6.getClass()     // Catch: java.lang.Exception -> L74
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r5)     // Catch: java.lang.Exception -> L74
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r5 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r5     // Catch: java.lang.Exception -> L74
            long r6 = r3.LIZ     // Catch: java.lang.Exception -> L74
            long r8 = r2.LIZ     // Catch: java.lang.Exception -> L74
            r10 = 2
            r11 = 0
            int r13 = r3.LJIIJJI()     // Catch: java.lang.Exception -> L74
            java.lang.String r14 = r3.LIZJ     // Catch: java.lang.Exception -> L74
            long r15 = r2.LJIIIIZZ()     // Catch: java.lang.Exception -> L74
            r1.LL = r2     // Catch: java.lang.Exception -> L74
            r1.LLILZ = r0     // Catch: java.lang.Exception -> L74
            r17 = r1
            java.lang.Object r5 = r5.updateQueueList(r6, r8, r10, r11, r13, r14, r15, r17)     // Catch: java.lang.Exception -> L74
            if (r5 != r4) goto L69
            return r4
        L66:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L74
        L69:
            X.0Icr r5 = (X.C470590Icr) r5     // Catch: java.lang.Exception -> L74
            long r1 = r2.LIZ     // Catch: java.lang.Exception -> L74
            X.00Bp r0 = X.EnumC038300Bp.UN_ADD     // Catch: java.lang.Exception -> L74
            r3.LJJIIZ(r1, r0)     // Catch: java.lang.Exception -> L74
            r0 = 1
            goto L87
        L74:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            android.content.Context r1 = X.C497740JfY.LJII()
            r0 = 2131840684(0x7f114eac, float:1.9314655E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            X.C501540Jlg.LIZIZ(r1, r0, r2)
            r0 = 0
        L87:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJIJI(X.0U22, X.05Vn):java.lang.Object");
    }

    public final synchronized boolean LJIJJ(long j, long j2) {
        C0U22 next;
        C765690U1v c765690U1vLIZ;
        C765690U1v c765690U1v = this.LJ.get(Long.valueOf(j));
        if (c765690U1v == null) {
            return false;
        }
        Iterator<C0U22> it2 = c765690U1v.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == j2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0U22 c0u22 = next;
        if (c0u22 == null) {
            c765690U1vLIZ = c765690U1v;
        } else {
            c765690U1vLIZ = c765690U1v.LIZ(c0u22);
        }
        this.LJ.put(Long.valueOf(j), c765690U1vLIZ);
        return !Intrinsics.LJFF(c765690U1vLIZ, c765690U1v);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(X.C0U22 r12, X.InterfaceC1364105Vn<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C765770U2d
            if (r0 == 0) goto L22
            r10 = r13
            X.0U2d r10 = (X.C765770U2d) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r10.LLILZ = r2
        L12:
            java.lang.Object r1 = r10.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r6 = 1
            if (r0 == 0) goto L30
            if (r0 != r6) goto L28
            X.0U22 r12 = r10.LL
            goto L53
        L22:
            X.0U2d r10 = new X.0U2d
            r10.<init>(r11, r13)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L68
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L68
            java.lang.Object r3 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L68
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r3 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r3     // Catch: java.lang.Exception -> L68
            long r4 = r12.LIZ     // Catch: java.lang.Exception -> L68
            long r7 = r11.LIZ     // Catch: java.lang.Exception -> L68
            java.lang.String r9 = r11.LIZJ     // Catch: java.lang.Exception -> L68
            r10.LL = r12     // Catch: java.lang.Exception -> L68
            r10.LLILZ = r6     // Catch: java.lang.Exception -> L68
            java.lang.Object r1 = r3.requestSong(r4, r6, r7, r9, r10)     // Catch: java.lang.Exception -> L68
            if (r1 != r2) goto L56
            return r2
        L53:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L68
        L56:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L68
            long r2 = r12.LIZ     // Catch: java.lang.Exception -> L68
            kotlin.jvm.internal.AwS27S0010000_12 r1 = new kotlin.jvm.internal.AwS27S0010000_12     // Catch: java.lang.Exception -> L68
            r0 = 6
            r1.<init>(r6, r0)     // Catch: java.lang.Exception -> L68
            r11.LJJIJ(r2, r1)     // Catch: java.lang.Exception -> L68
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> L68
            return r0
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r11.LJJII(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJIJJLI(X.0U22, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(X.C0U22 r20, X.InterfaceC1364105Vn<? super java.lang.Boolean> r21) {
        /*
            r19 = this;
            r4 = r21
            boolean r0 = r4 instanceof X.C765830U2j
            r5 = r19
            if (r0 == 0) goto L24
            r3 = r4
            X.0U2j r3 = (X.C765830U2j) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LLILLL = r2
        L16:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L63
        L24:
            X.0U2j r3 = new X.0U2j
            r3.<init>(r5, r4)
            goto L16
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r4)
            X.0Ism r4 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L6a
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r4.getClass()     // Catch: java.lang.Exception -> L6a
            java.lang.Object r6 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L6a
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r6 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r6     // Catch: java.lang.Exception -> L6a
            long r7 = r5.LIZ     // Catch: java.lang.Exception -> L6a
            r0 = r20
            long r9 = r0.LIZ     // Catch: java.lang.Exception -> L6a
            r11 = 10
            r12 = 0
            int r14 = r5.LJIIJJI()     // Catch: java.lang.Exception -> L6a
            java.lang.String r15 = r5.LIZJ     // Catch: java.lang.Exception -> L6a
            long r16 = r0.LJIIIIZZ()     // Catch: java.lang.Exception -> L6a
            r3.LLILLL = r1     // Catch: java.lang.Exception -> L6a
            r18 = r3
            java.lang.Object r4 = r6.updateQueueList(r7, r9, r11, r12, r14, r15, r16, r18)     // Catch: java.lang.Exception -> L6a
            if (r4 != r2) goto L66
            return r2
        L63:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L6a
        L66:
            X.0Icr r4 = (X.C470590Icr) r4     // Catch: java.lang.Exception -> L6a
            r0 = 1
            goto L7d
        L6a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            android.content.Context r1 = X.C497740JfY.LJII()
            r0 = 2131840684(0x7f114eac, float:1.9314655E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            X.C501540Jlg.LIZIZ(r1, r0, r2)
            r0 = 0
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJJI(X.0U22, X.05Vn):java.lang.Object");
    }

    public final void LJJIIZ(long j, EnumC038300Bp enumC038300Bp) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update add status ");
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(enumC038300Bp);
        C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        LJJIJ(j, new AwS591S0100000_12(enumC038300Bp, 1203));
    }

    public final void LJJIJ(long j, Function1<? super C0U22, C0U22> function1) {
        Iterator it2 = Collections.list(this.LJ.keys()).iterator();
        while (it2.hasNext()) {
            LJFF(((Long) it2.next()).longValue(), new AwS29S0000100_12(j, 3), function1);
        }
        Iterator it3 = C13LP.LLIIII(((LinkedHashMap) this.LJIIIIZZ.LJIIIIZZ()).keySet()).iterator();
        while (it3.hasNext()) {
            LIZLLL((String) it3.next(), new AwS29S0000100_12(j, 4), function1);
        }
    }

    public final void LJJIJIIJIL(long j, C0U24 c0u24) {
        LJJIJ(j, new AwS591S0100000_12(c0u24, 1201));
    }

    public static List LJ(C765690U1v c765690U1v, Function1 function1, Function1 function12) {
        ArrayList arrayList = new ArrayList(c765690U1v.LIZJ.size());
        for (C0U22 c0u22 : c765690U1v.LIZJ) {
            if (((Boolean) function1.invoke(c0u22)).booleanValue()) {
                arrayList.add(function12.invoke(c0u22));
            } else {
                arrayList.add(c0u22);
            }
        }
        return arrayList;
    }

    public final synchronized void LIZLLL(String str, Function1 function1, Function1 function12) {
        C765690U1v c765690U1vLIZJ = this.LJIIIIZZ.LIZJ(str);
        if (c765690U1vLIZJ == null) {
            return;
        }
        this.LJIIIIZZ.LIZLLL(str, C765530U1f.LIZ(c765690U1vLIZJ.LIZ, c765690U1vLIZJ.LIZIZ, LJ(c765690U1vLIZJ, function1, function12)));
    }

    public final synchronized void LJFF(long j, Function1 function1, Function1 function12) {
        C765690U1v c765690U1v = this.LJ.get(Long.valueOf(j));
        if (c765690U1v == null) {
            return;
        }
        List listLJ = LJ(c765690U1v, function1, function12);
        this.LJ.put(Long.valueOf(j), C765530U1f.LIZ(c765690U1v.LIZ, c765690U1v.LIZIZ, listLJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:22:0x0066, B:24:0x006f, B:25:0x0071, B:27:0x0078, B:28:0x007a, B:30:0x007e, B:32:0x0082, B:33:0x0091, B:35:0x0097, B:39:0x00ac, B:50:0x00d5, B:54:0x00db, B:55:0x00dc, B:38:0x00aa, B:19:0x0059, B:40:0x00ad, B:45:0x00c0, B:49:0x00cc, B:48:0x00c8), top: B:76:0x0059, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:22:0x0066, B:24:0x006f, B:25:0x0071, B:27:0x0078, B:28:0x007a, B:30:0x007e, B:32:0x0082, B:33:0x0091, B:35:0x0097, B:39:0x00ac, B:50:0x00d5, B:54:0x00db, B:55:0x00dc, B:38:0x00aa, B:19:0x0059, B:40:0x00ad, B:45:0x00c0, B:49:0x00cc, B:48:0x00c8), top: B:76:0x0059, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:22:0x0066, B:24:0x006f, B:25:0x0071, B:27:0x0078, B:28:0x007a, B:30:0x007e, B:32:0x0082, B:33:0x0091, B:35:0x0097, B:39:0x00ac, B:50:0x00d5, B:54:0x00db, B:55:0x00dc, B:38:0x00aa, B:19:0x0059, B:40:0x00ad, B:45:0x00c0, B:49:0x00cc, B:48:0x00c8), top: B:76:0x0059, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0U1v] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r15, long r16, X.InterfaceC1364105Vn r18) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJI(int, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.0U1v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(int r22, int r23, X.InterfaceC1364105Vn<? super X.C765690U1v> r24) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJIIIZ(int, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.C0U22 r24, X.C0U22 r25, X.InterfaceC1364105Vn<? super java.lang.Boolean> r26) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJIILLIIL(X.0U22, X.0U22, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0U1v] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.bytedance.android.live.effect.karaoke.api.KaraokeApi] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIFFI(int r12, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJJIFFI(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(X.C0U22 r9, boolean r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJJIII(X.0U22, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(int r12, boolean r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C765870U2n
            if (r0 == 0) goto L20
            r10 = r14
            X.0U2n r10 = (X.C765870U2n) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.0U2n r10 = new X.0U2n
            r10.<init>(r11, r14)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L57
            goto L5f
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            if (r13 == 0) goto L39
            r8 = 1
            goto L3a
        L39:
            r8 = 2
        L3a:
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L57
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L57
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L57
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r4 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r4     // Catch: java.lang.Exception -> L57
            long r5 = r11.LIZ     // Catch: java.lang.Exception -> L57
            java.lang.String r9 = r11.LIZJ     // Catch: java.lang.Exception -> L57
            r10.LLILLL = r2     // Catch: java.lang.Exception -> L57
            r7 = r12
            java.lang.Object r0 = r4.updateKaraokeState(r5, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L57
            if (r0 != r3) goto L5f
            return r3
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C20441214yg.LJII(r0)
            r2 = 0
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2Y.LJJIIJZLJL(int, boolean, X.05Vn):java.lang.Object");
    }

    public final void LJJIIZI(long j, long j2, Function1<? super C0U22, C0U22> function1) {
        for (Long l : Collections.list(this.LJ.keys())) {
            if (l != null && l.longValue() == -999) {
                LJFF(l.longValue(), new C0U2C(j, j2), function1);
            } else {
                LJFF(l.longValue(), new AwS29S0000100_12(j, 1), function1);
            }
        }
        Iterator it2 = C13LP.LLIIII(((LinkedHashMap) this.LJIIIIZZ.LJIIIIZZ()).keySet()).iterator();
        while (it2.hasNext()) {
            LIZLLL((String) it2.next(), new AwS29S0000100_12(j, 2), function1);
        }
    }

    public C0U2Y(int i, long j, long j2, String str, DataChannel dataChannel) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = dataChannel;
        this.LJIIJ = new C765880U2o(i);
        LJJ();
        this.LJIILJJIL = true;
        this.LJIILL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(538));
    }
}
