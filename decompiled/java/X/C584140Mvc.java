package X;

import android.util.LruCache;
import android.view.Surface;
import com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerManagerComponent;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Mvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584140Mvc implements InterfaceC21699519w9 {
    public final IFeedMobParamsProvider LIZ;
    public C584150Mvd LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(416));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1683));

    public final C1483410ohn LJ() {
        return (C1483410ohn) this.LIZLLL.getValue();
    }

    public C584140Mvc(FriendsV3PlayerManagerComponent friendsV3PlayerManagerComponent) {
        this.LIZ = friendsV3PlayerManagerComponent;
    }

    @Override // X.InterfaceC21699519w9
    public final void LIZIZ(InterfaceC1588310rQz interfaceC1588310rQz) {
        String aid;
        Aweme aweme;
        Aweme aweme2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPause, aid=");
        String aid2 = null;
        if (interfaceC1588310rQz != null && (aweme2 = interfaceC1588310rQz.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C0W17.LIZJ("playerManager", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1588310rQz != null && (aweme = interfaceC1588310rQz.getAweme()) != null) {
            aid2 = aweme.getAid();
        }
        Long lValueOf = Long.valueOf(LJ().getCurrentPosition());
        Long lValueOf2 = Long.valueOf(LJ().getDuration());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("recordPlayData, aid: ");
        sbLIZ2.append(aid2);
        sbLIZ2.append(", position: ");
        sbLIZ2.append(lValueOf);
        sbLIZ2.append(", duration: ");
        sbLIZ2.append(lValueOf2);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (aid2 != null && lValueOf != null) {
            lValueOf.longValue();
            if (lValueOf2 != null) {
                lValueOf2.longValue();
                ((LruCache) C584160Mve.LIZ.getValue()).put(aid2, new C584170Mvf(lValueOf.longValue(), lValueOf2.longValue()));
            }
        }
        C1483410ohn c1483410ohnLJ = LJ();
        if (c1483410ohnLJ != null) {
            c1483410ohnLJ.LJJLI(false);
        }
    }

    @Override // X.InterfaceC21699519w9
    public final void LIZJ(String str) {
        LJ().LIZJ(str);
    }

    @Override // X.InterfaceC21699519w9
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        LJ().LJJIJ(onUIPlayListener);
    }

    @Override // X.InterfaceC21699519w9
    public final void setSurface(Surface surface) {
        LJ().setSurface(surface);
    }

    @Override // X.InterfaceC21699519w9
    public final void LIZ(Aweme aweme, C584190Mvh c584190Mvh) {
        if (aweme.getAid() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryPlay, awemeId=");
            sbLIZ.append(aweme.getAid());
            C0W17.LIZJ("playerManager", C2188811AlT.LIZIZ(sbLIZ));
            C584150Mvd c584150MvdLJFF = LJFF(aweme, c584190Mvh);
            this.LIZIZ = c584150MvdLJFF;
            LJ().LJJII(c584150MvdLJFF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C584150Mvd LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r33, X.C584190Mvh r34) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C584140Mvc.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme, X.0Mvh):X.0Mvd");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    @Override // X.InterfaceC21699519w9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r7, X.C584190Mvh r8, X.InterfaceC1588310rQz r9) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C584140Mvc.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, X.0Mvh, X.0rQz):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bd A[PHI: r1 r10 r12 r16
      0x01bd: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v9 java.lang.String) binds: [B:99:0x01b9, B:32:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r10v3 java.lang.Boolean) = (r10v2 java.lang.Boolean), (r10v6 java.lang.Boolean) binds: [B:99:0x01b9, B:32:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r12v4 java.lang.Boolean) = (r12v3 java.lang.Boolean), (r12v6 java.lang.Boolean) binds: [B:99:0x01b9, B:32:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r16v2 java.lang.Integer) = (r16v1 java.lang.Integer), (r16v4 java.lang.Integer) binds: [B:99:0x01b9, B:32:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c7 A[PHI: r9 r17
      0x01c7: PHI (r9v1 java.lang.Boolean) = (r9v0 java.lang.Boolean), (r9v6 java.lang.Boolean) binds: [B:104:0x01c3, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r17v2 java.lang.Integer) = (r17v1 java.lang.Integer), (r17v6 java.lang.Integer) binds: [B:104:0x01c3, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cc A[PHI: r9 r15 r17
      0x01cc: PHI (r9v2 java.lang.Boolean) = (r9v1 java.lang.Boolean), (r9v5 java.lang.Boolean) binds: [B:107:0x01c8, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r15v1 java.lang.Boolean) = (r15v0 java.lang.Boolean), (r15v3 java.lang.Boolean) binds: [B:107:0x01c8, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x01cc: PHI (r17v3 java.lang.Integer) = (r17v2 java.lang.Integer), (r17v5 java.lang.Integer) binds: [B:107:0x01c8, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad A[PHI: r12
      0x01ad: PHI (r12v1 java.lang.Boolean) = (r12v0 java.lang.Boolean), (r12v9 java.lang.Boolean) binds: [B:90:0x01a9, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2 A[PHI: r10 r12
      0x01b2: PHI (r10v1 java.lang.Boolean) = (r10v0 java.lang.Boolean), (r10v8 java.lang.Boolean) binds: [B:93:0x01ae, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r12v2 java.lang.Boolean) = (r12v1 java.lang.Boolean), (r12v8 java.lang.Boolean) binds: [B:93:0x01ae, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b8 A[PHI: r10 r12 r16
      0x01b8: PHI (r10v2 java.lang.Boolean) = (r10v1 java.lang.Boolean), (r10v7 java.lang.Boolean) binds: [B:96:0x01b4, B:29:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r12v3 java.lang.Boolean) = (r12v2 java.lang.Boolean), (r12v7 java.lang.Boolean) binds: [B:96:0x01b4, B:29:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x01b8: PHI (r16v1 java.lang.Integer) = (r16v0 java.lang.Integer), (r16v5 java.lang.Integer) binds: [B:96:0x01b4, B:29:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.feed.model.Aweme r20, X.C584190Mvh r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C584140Mvc.LJI(com.ss.android.ugc.aweme.feed.model.Aweme, X.0Mvh, boolean):void");
    }
}
