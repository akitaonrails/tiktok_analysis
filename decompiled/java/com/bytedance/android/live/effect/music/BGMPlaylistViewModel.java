package com.bytedance.android.live.effect.music;

import X.C01GW;
import X.C095G;
import X.C099R;
import X.C09IR;
import X.C13LP;
import X.C1DEK;
import X.C2252331DDr;
import X.C2286608xc;
import X.C23250099c;
import X.C292401Bi;
import X.C452501pT;
import X.C500260Jjc;
import X.C762140Tv2;
import X.C762280TvG;
import X.C762290TvH;
import X.C763260Twq;
import X.C763480TxC;
import X.InterfaceC1364105Vn;
import X.InterfaceC763330Twx;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.dataChannel.BGMPlaylistInitial;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public final class BGMPlaylistViewModel extends ViewModel {
    public final C763480TxC LL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C1DEK LLILLJJLI = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final C2252331DDr LLILLL = C09IR.LIZIZ(0, 10, null, 4);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 54));
    public final C01GW LLJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 53));

    public final List<MusicSong> yQ2() {
        return C13LP.LLIIII(this.LL.LIZIZ);
    }

    public static void GQ2(Throwable th) {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS556S0100000_12(th, 55));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C762850TwB
            if (r0 == 0) goto L27
            r8 = r11
            X.0TwB r8 = (X.C762850TwB) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r9 = r8.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r1 = 1
            r5 = 0
            r6 = 3
            r4 = 2
            if (r0 == 0) goto L35
            if (r0 == r1) goto L55
            if (r0 == r4) goto L6f
            if (r0 != r6) goto L2d
            goto L7d
        L27:
            X.0TwB r8 = new X.0TwB
            r8.<init>(r10, r11)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r9)
            boolean r0 = r10.LLIZ
            if (r0 != 0) goto L46
            boolean r0 = r10.LLILZ
            if (r0 != 0) goto L46
            r0 = 1
        L41:
            if (r0 != 0) goto L48
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            r0 = 0
            goto L41
        L48:
            r10.LLIZ = r1
            X.0TxC r0 = r10.LL     // Catch: java.lang.Throwable -> L86
            r8.LLILLL = r1     // Catch: java.lang.Throwable -> L86
            java.lang.Object r9 = r0.LJFF(r8)     // Catch: java.lang.Throwable -> L86
            if (r9 != r7) goto L58
            return r7
        L55:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L86
        L58:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L86
            X.1DDr r3 = r10.LLILLL     // Catch: java.lang.Throwable -> L86
            X.0TvJ r2 = new X.0TvJ     // Catch: java.lang.Throwable -> L86
            java.util.List r1 = r10.yQ2()     // Catch: java.lang.Throwable -> L86
            r0 = 4
            r2.<init>(r1, r9, r5, r0)     // Catch: java.lang.Throwable -> L86
            r8.LLILLL = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r3.emit(r2, r8)     // Catch: java.lang.Throwable -> L86
            if (r0 != r7) goto L72
            return r7
        L6f:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L86
        L72:
            r10.LLIZ = r5     // Catch: java.lang.Throwable -> L86
            r8.LLILLL = r6     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r10.xQ2(r8)     // Catch: java.lang.Throwable -> L86
            if (r0 != r7) goto L80
            return r7
        L7d:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L86
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L86
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L86
            goto L92
        L86:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L92:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L9d
            r10.LLILZLL = r5
            GQ2(r0)
        L9d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.AQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C762860TwC
            if (r0 == 0) goto L27
            r9 = r11
            X.0TwC r9 = (X.C762860TwC) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r2 = r9.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r7 = 0
            r6 = 3
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 == r1) goto L43
            if (r0 == r5) goto L5a
            if (r0 != r6) goto L2d
            goto L66
        L27:
            X.0TwC r9 = new X.0TwC
            r9.<init>(r10, r11)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r2)
            X.0TxC r0 = r10.LL     // Catch: java.lang.Throwable -> L6f
            r9.LLILLL = r1     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r0.LJII(r9)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r8) goto L46
            return r8
        L43:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L6f
        L46:
            X.1DDr r4 = r10.LLILLL     // Catch: java.lang.Throwable -> L6f
            X.0TvJ r3 = new X.0TvJ     // Catch: java.lang.Throwable -> L6f
            X.13BV r2 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L6f
            r1 = 0
            r0 = 6
            r3.<init>(r2, r7, r1, r0)     // Catch: java.lang.Throwable -> L6f
            r9.LLILLL = r5     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r4.emit(r3, r9)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r8) goto L5d
            return r8
        L5a:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L6f
        L5d:
            r9.LLILLL = r6     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r10.FQ2(r7, r9)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r8) goto L69
            return r8
        L66:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L6f
        L69:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L6f
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L6f
            goto L7b
        L6f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L7b:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L84
            GQ2(r0)
        L84:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.CQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C762870TwD
            if (r0 == 0) goto L2c
            r6 = r12
            X.0TwD r6 = (X.C762870TwD) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r10 = 1
            r9 = 2
            r7 = 5
            r8 = 4
            r4 = 3
            if (r0 == 0) goto L3a
            if (r0 == r10) goto L48
            if (r0 == r9) goto L60
            if (r0 == r4) goto L76
            if (r0 == r8) goto L82
            if (r0 != r7) goto L32
            goto L8e
        L2c:
            X.0TwD r6 = new X.0TwD
            r6.<init>(r11, r12)
            goto L12
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.C155000ia.LIZIZ(r1)
            X.0TxC r0 = r11.LL     // Catch: java.lang.Throwable -> L97
            r6.LLILLL = r10     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> L97
            if (r0 != r5) goto L4b
            return r5
        L48:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97
        L4b:
            X.1DDr r3 = r11.LLILLL     // Catch: java.lang.Throwable -> L97
            X.0TvJ r2 = new X.0TvJ     // Catch: java.lang.Throwable -> L97
            java.util.List r1 = r11.yQ2()     // Catch: java.lang.Throwable -> L97
            r0 = 0
            r2.<init>(r1, r0, r10, r9)     // Catch: java.lang.Throwable -> L97
            r6.LLILLL = r9     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r3.emit(r2, r6)     // Catch: java.lang.Throwable -> L97
            if (r0 != r5) goto L63
            return r5
        L60:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97
        L63:
            java.util.List r0 = r11.yQ2()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)     // Catch: java.lang.Throwable -> L97
            webcast.data.MusicSong r0 = (webcast.data.MusicSong) r0     // Catch: java.lang.Throwable -> L97
            r6.LLILLL = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r11.FQ2(r0, r6)     // Catch: java.lang.Throwable -> L97
            if (r0 != r5) goto L79
            return r5
        L76:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97
        L79:
            r6.LLILLL = r8     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r11.xQ2(r6)     // Catch: java.lang.Throwable -> L97
            if (r0 != r5) goto L85
            return r5
        L82:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97
        L85:
            r6.LLILLL = r7     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r11.wQ2(r6)     // Catch: java.lang.Throwable -> L97
            if (r0 != r5) goto L91
            return r5
        L8e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L97
        L91:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L97
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L97
            goto La3
        L97:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        La3:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto Lac
            GQ2(r0)
        Lac:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.EQ2(X.05Vn):java.lang.Object");
    }

    public final Object wQ2(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zLJI = this.LL.LJI();
        if (zLJI != this.LLILZIL) {
            this.LLILZIL = zLJI;
            Object objEmit = this.LLILLL.emit(C762290TvH.LIZ, interfaceC1364105Vn);
            if (objEmit == C099R.LJFF()) {
                return objEmit;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public final Object xQ2(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean z;
        C763480TxC c763480TxC = this.LL;
        if (!((ArrayList) c763480TxC.LIZIZ).isEmpty() && c763480TxC.LIZ != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.LLILZ) {
            this.LLILZ = z;
            Object objEmit = this.LLILLL.emit(C762280TvG.LIZ, interfaceC1364105Vn);
            if (objEmit == C099R.LJFF()) {
                return objEmit;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C762840TwA
            if (r0 == 0) goto L27
            r7 = r11
            X.0TwA r7 = (X.C762840TwA) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r2 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r1 = 1
            r5 = 0
            r8 = 3
            r9 = 2
            if (r0 == 0) goto L35
            if (r0 == r1) goto L55
            if (r0 == r9) goto L6e
            if (r0 != r8) goto L2d
            goto L7c
        L27:
            X.0TwA r7 = new X.0TwA
            r7.<init>(r10, r11)
            goto L12
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r2)
            boolean r0 = r10.LLILZLL
            if (r0 != 0) goto L46
            boolean r0 = r10.LLILZIL
            if (r0 != 0) goto L46
            r0 = 1
        L41:
            if (r0 != 0) goto L48
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            r0 = 0
            goto L41
        L48:
            r10.LLILZLL = r1
            X.0TxC r0 = r10.LL     // Catch: java.lang.Throwable -> L85
            r7.LLILLL = r1     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r0.LJ(r7)     // Catch: java.lang.Throwable -> L85
            if (r0 != r6) goto L58
            return r6
        L55:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L85
        L58:
            X.1DDr r4 = r10.LLILLL     // Catch: java.lang.Throwable -> L85
            X.0TvJ r3 = new X.0TvJ     // Catch: java.lang.Throwable -> L85
            java.util.List r2 = r10.yQ2()     // Catch: java.lang.Throwable -> L85
            r1 = 0
            r0 = 6
            r3.<init>(r2, r1, r5, r0)     // Catch: java.lang.Throwable -> L85
            r7.LLILLL = r9     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r4.emit(r3, r7)     // Catch: java.lang.Throwable -> L85
            if (r0 != r6) goto L71
            return r6
        L6e:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L85
        L71:
            r10.LLILZLL = r5     // Catch: java.lang.Throwable -> L85
            r7.LLILLL = r8     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r10.wQ2(r7)     // Catch: java.lang.Throwable -> L85
            if (r0 != r6) goto L7f
            return r6
        L7c:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L85
        L7f:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L85
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L85
            goto L91
        L85:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L91:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 == 0) goto L9c
            r10.LLILZLL = r5
            GQ2(r0)
        L9c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.zQ2(X.05Vn):java.lang.Object");
    }

    public BGMPlaylistViewModel(C763480TxC c763480TxC, DataChannel dataChannel) {
        this.LL = c763480TxC;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C762140Tv2(this, null), 3);
        C763260Twq.LIZ(new InterfaceC763330Twx() { // from class: X.0Tv4
            @Override // X.InterfaceC763330Twx
            public final void WE() {
            }

            @Override // X.InterfaceC763330Twx
            public final void onPlayerPause() {
            }

            @Override // X.InterfaceC763330Twx
            public final void zk() {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL), null, null, new C762150Tv3(this.LL, null), 3);
            }
        });
        c763480TxC.LIZLLL = new AwS591S0100000_12(this, 88);
        if (dataChannel != null) {
            dataChannel.BQ2(null, BGMPlaylistInitial.class, new AwS591S0100000_12(this, 89));
        }
    }

    public static Object BQ2(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        Long lLJFF;
        MusicSong musicSongLIZLLL = bGMPlaylistViewModel.LL.LIZLLL();
        if (musicSongLIZLLL != null) {
            Object objFQ2 = bGMPlaylistViewModel.FQ2(musicSongLIZLLL, interfaceC1364105Vn);
            if (objFQ2 != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objFQ2;
        }
        MusicSong musicSong = bGMPlaylistViewModel.LL.LJ;
        if (musicSong != null) {
            Long lLJFF2 = C2286608xc.LJFF(musicSong.id);
            MusicSong musicSong2 = (MusicSong) C13LP.LJJLIIIJL(bGMPlaylistViewModel.yQ2());
            if (musicSong2 != null) {
                lLJFF = C2286608xc.LJFF(musicSong2.id);
            } else {
                lLJFF = null;
            }
            if (Intrinsics.LJFF(lLJFF2, lLJFF) && bGMPlaylistViewModel.LLILZIL) {
                Object objEQ2 = bGMPlaylistViewModel.EQ2(interfaceC1364105Vn);
                if (objEQ2 == C099R.LJFF()) {
                    return objEQ2;
                }
                return Unit.LIZ;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(webcast.data.MusicSong r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.DQ2(webcast.data.MusicSong, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FQ2(webcast.data.MusicSong r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.FQ2(webcast.data.MusicSong, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
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
    public final java.lang.Object vQ2(java.util.List<webcast.data.MusicSong> r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMPlaylistViewModel.vQ2(java.util.List, X.05Vn):java.lang.Object");
    }
}
