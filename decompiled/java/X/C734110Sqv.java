package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS680S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734110Sqv {
    public final String LIZ;
    public final WeakReference<Context> LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> LJFF;
    public long LJI;
    public boolean LJII;
    public volatile boolean LJIIIIZZ;
    public long LJIIIZ;
    public int LJIIJ;
    public Aweme LJIIJJI;
    public final C734550Srd LJIIL;

    public final void LJ(Aweme aweme) {
        boolean zIsLike;
        long diggCount;
        AwemeStatistics statistics;
        this.LJIIJJI = aweme;
        int userDigg = 0;
        if (aweme != null) {
            zIsLike = aweme.isLike();
        } else {
            zIsLike = false;
        }
        this.LJII = zIsLike;
        this.LJIIIIZZ = false;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        this.LJI = diggCount;
        if (aweme != null) {
            userDigg = aweme.getUserDigg();
        }
        this.LJIIJ = userDigg;
        this.LJIIIZ = this.LJI;
    }

    public final void LIZLLL(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        String aid = aweme.getAid();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (i != 0) {
                if (i == 1) {
                    C740470T2v.LJ(C740470T2v.LIZ() + 1);
                    aweme.setUserDigg(1);
                    AwemeStatistics statistics = aweme.getStatistics();
                    if (statistics != null) {
                        statistics.setDiggCount(this.LJI);
                    }
                    C1440005kM.LIZ(new C737030Svd(13, aid));
                    return;
                }
                return;
            }
            int iLIZ = C740470T2v.LIZ() - 1;
            if (iLIZ < 0) {
                iLIZ = 0;
            }
            C740470T2v.LJ(iLIZ);
            aweme.setUserDigg(0);
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                statistics2.setDiggCount(this.LJI);
            }
            C1440005kM.LIZ(new C737030Svd(13, aid));
            return;
        }
        HashMap map = new HashMap();
        map.put("aweme_id", aid);
        map.put("type", String.valueOf(i));
        map.put("channel_id", String.valueOf(C737370SwB.LIZ("eventType")));
        C735080SsU.LIZJ("eventType", null, map);
        this.LJIIIIZZ = true;
        this.LJIIL.LIZJ(map);
    }

    public final long LJFF(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LJII = z;
            if (z) {
                if (this.LJIIJ == 1) {
                    if (this.LJIIIZ < 1 && !AwemeExtKt.isDelete(aweme)) {
                        this.LJIIIZ = 1L;
                    }
                    return this.LJIIIZ;
                }
                return this.LJIIIZ + 1;
            }
            if (this.LJIIJ == 1 && !AwemeExtKt.isDelete(aweme)) {
                return this.LJIIIZ - 1;
            }
            return this.LJIIIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDiggView when aweme is null:");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C2344809Gs.LIZLLL(6, "Explore", C2188811AlT.LIZIZ(sbLIZ));
        return 0L;
    }

    public static C731910SnN LIZJ(long j, Aweme aweme, boolean z) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (j < 0) {
            j = 0;
        }
        boolean z2 = false;
        if (aweme != null && ((commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getDiggShowScene() != 1)) {
            z2 = true;
        }
        C15UU.LIZ.getClass();
        return new C731910SnN(C618720OOo.LIZ(j), z, z2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final java.lang.Integer r9, final com.ss.android.ugc.aweme.feed.model.Aweme r10, final int r11) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C734110Sqv.LIZIZ(java.lang.Integer, com.ss.android.ugc.aweme.feed.model.Aweme, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x022f A[PHI: r12
      0x022f: PHI (r12v11 java.lang.String) = (r12v6 java.lang.String), (r12v12 java.lang.String) binds: [B:82:0x022d, B:80:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0235 A[PHI: r12
      0x0235: PHI (r12v10 java.lang.String) = (r12v6 java.lang.String), (r12v11 java.lang.String) binds: [B:82:0x022d, B:84:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bd A[PHI: r10
      0x02bd: PHI (r10v27 java.lang.String) = (r10v19 java.lang.String), (r10v28 java.lang.String) binds: [B:75:0x021e, B:73:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r24, com.ss.android.ugc.aweme.feed.model.Aweme r25, java.lang.Integer r26, int r27) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C734110Sqv.LIZ(boolean, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, int):void");
    }

    public C734110Sqv(String str, WeakReference weakReference, Long l, String str2, String str3, AwS680S0100000_31 awS680S0100000_31) {
        this.LIZ = str;
        this.LIZIZ = weakReference;
        this.LIZJ = l;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = awS680S0100000_31;
        C734550Srd c734550Srd = new C734550Srd();
        this.LJIIL = c734550Srd;
        c734550Srd.LJIIJ(new C737390SwD());
        c734550Srd.LLILLJJLI = new InterfaceC734510SrZ() { // from class: X.0Sqw
            @Override // X.InterfaceC734510SrZ
            public final void KE(Exception exc) {
                boolean z;
                String aid;
                C734110Sqv c734110Sqv = this.LL;
                Aweme aweme = c734110Sqv.LJIIJJI;
                if (aweme == null) {
                    return;
                }
                if (!c734110Sqv.LJII) {
                    c734110Sqv.LJI++;
                    z = true;
                } else {
                    c734110Sqv.LJI--;
                    z = false;
                }
                long jLJFF = c734110Sqv.LJFF(aweme, z);
                C734110Sqv c734110Sqv2 = this.LL;
                InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> interfaceC1631620sYq = c734110Sqv2.LJFF;
                Aweme aweme2 = c734110Sqv2.LJIIJJI;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                interfaceC1631620sYq.invoke(aid, C734110Sqv.LIZJ(jLJFF, this.LL.LJIIJJI, z), Boolean.FALSE);
                this.LL.LJIIIIZZ = false;
            }

            @Override // X.InterfaceC734510SrZ
            public final void oP1(C0WIY<String, Integer> c0wiy) {
                String str4;
                Integer num;
                String aid;
                Aweme aweme;
                String str5 = null;
                if (c0wiy != null) {
                    str4 = c0wiy.LIZ;
                } else {
                    str4 = null;
                }
                C737030Svd c737030Svd = new C737030Svd(13, str4);
                Bundle bundle = new Bundle();
                if (c0wiy == null || (num = c0wiy.LIZIZ) == null) {
                    num = -1;
                }
                Aweme aweme2 = this.LL.LJIIJJI;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (c0wiy != null) {
                    str5 = c0wiy.LIZ;
                }
                if (Intrinsics.LJFF(aid, str5) && (aweme = this.LL.LJIIJJI) != null) {
                    aweme.setUserDigg(num.intValue());
                }
                bundle.putInt("user_digged", num.intValue());
                c737030Svd.LIZJ = bundle;
                C1440005kM.LIZ(c737030Svd);
                C1440005kM.LIZ(new C734240Sr8(num.intValue()));
                this.LL.LJIIIIZZ = false;
            }
        };
    }
}
