package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.C09IC;
import X.C09IR;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C319480Cfi;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes5.dex */
public final class GuestMatchEntryViewModel extends ViewModel {
    public final DataChannel LL;
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public final C2252331DDr LLILZ;
    public final AnonymousClass0950 LLILZIL;

    public GuestMatchEntryViewModel() {
        this(null);
    }

    public GuestMatchEntryViewModel(DataChannel dataChannel) {
        this.LL = dataChannel;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C319480Cfi(0));
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZ = c2252331DDrLIZIZ;
        this.LLILZIL = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[PHI: r6
      0x006b: PHI (r6v3 X.0anj) = (r6v1 X.0anj), (r6v4 X.0anj) binds: [B:28:0x0069, B:26:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(X.C0CYD r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C0CYA
            r1 = 0
            r4 = 0
            if (r0 == 0) goto L40
            X.0aAn r0 = X.C924790aAn.LIZLLL()
            T r7 = r0.LIZIZ
            java.lang.Integer r7 = (java.lang.Integer) r7
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r8.LL
            if (r3 == 0) goto L21
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.RandomMatchDataChannel> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.RandomMatchDataChannel.class
            java.lang.Object r4 = r3.gg0(r0)
            X.0anb r4 = (X.C948850anb) r4
            if (r4 == 0) goto L21
            X.0anj r6 = r4.LIZ
            if (r6 != 0) goto L23
        L21:
            X.0anj r6 = X.EnumC948930anj.IDLE
        L23:
            if (r4 == 0) goto L27
            long r1 = r4.LIZLLL
        L27:
            X.1DDq r5 = r8.LLILLJJLI
        L29:
            java.lang.Object r4 = r5.getValue()
            int r3 = r7.intValue()
            r4.getClass()
            X.0Cfi r0 = new X.0Cfi
            r0.<init>(r3, r6, r1)
            boolean r0 = r5.compareAndSet(r4, r0)
            if (r0 == 0) goto L29
            return
        L40:
            boolean r0 = r9 instanceof X.C0CYE
            if (r0 == 0) goto L59
            X.C497010JeN.LIZIZ()
            X.01wk r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0CY6 r1 = new X.0CY6
            r1.<init>(r8, r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
            return
        L59:
            boolean r0 = r9 instanceof X.C0CYF
            if (r0 == 0) goto L87
            X.0CYF r9 = (X.C0CYF) r9
            X.0anb r0 = r9.LIZ
            if (r0 == 0) goto L67
            X.0anj r6 = r0.LIZ
            if (r6 != 0) goto L6b
        L67:
            X.0anj r6 = X.EnumC948930anj.IDLE
            if (r0 == 0) goto L6d
        L6b:
            long r1 = r0.LIZLLL
        L6d:
            X.1DDq r5 = r8.LLILLJJLI
        L6f:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.0Cfi r0 = (X.C319480Cfi) r0
            int r3 = r0.LIZ
            r0.getClass()
            X.0Cfi r0 = new X.0Cfi
            r0.<init>(r3, r6, r1)
            boolean r0 = r5.compareAndSet(r4, r0)
            if (r0 == 0) goto L6f
            return
        L87:
            boolean r0 = r9 instanceof X.C0CYC
            if (r0 == 0) goto Lab
            X.0CYC r9 = (X.C0CYC) r9
            int r6 = r9.LIZ
            X.1DDq r5 = r8.LLILLJJLI
        L91:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.0Cfi r0 = (X.C319480Cfi) r0
            X.0anj r3 = r0.LIZIZ
            long r1 = r0.LIZJ
            r0.getClass()
            X.0Cfi r0 = new X.0Cfi
            r0.<init>(r6, r3, r1)
            boolean r0 = r5.compareAndSet(r4, r0)
            if (r0 == 0) goto L91
            return
        Lab:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel.vQ2(X.0CYD):void");
    }
}
