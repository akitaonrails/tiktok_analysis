package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734210Sr5 implements InterfaceC1205300hTE {
    public final String LIZ = "homepage_nearby";
    public final WeakReference<Context> LIZIZ;
    public final InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public volatile boolean LJFF;
    public long LJI;
    public int LJII;
    public Aweme LJIIIIZZ;
    public int LJIIIZ;
    public final C734550Srd LJIIJ;

    @Override // X.InterfaceC1205300hTE
    public final void LIZ(Aweme aweme) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDiggClick aweme=");
        sbLIZ.append(aweme);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJFF) {
            return;
        }
        LIZLLL(aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C734210Sr5.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C734210Sr5(WeakReference weakReference, AwS667S0100000_18 awS667S0100000_18) {
        this.LIZIZ = weakReference;
        this.LIZJ = awS667S0100000_18;
        C734550Srd c734550Srd = new C734550Srd();
        this.LJIIJ = c734550Srd;
        c734550Srd.LJIIJ(new C737390SwD());
        c734550Srd.LLILLJJLI = new InterfaceC734510SrZ() { // from class: X.0Sr6
            @Override // X.InterfaceC734510SrZ
            public final void KE(Exception exc) {
                int i;
                String aid;
                C734210Sr5 c734210Sr5 = this.LL;
                Aweme aweme = c734210Sr5.LJIIIIZZ;
                if (aweme == null) {
                    return;
                }
                long j = c734210Sr5.LIZLLL;
                boolean z = c734210Sr5.LJ;
                if (!z) {
                    i = 1;
                } else {
                    i = -1;
                }
                c734210Sr5.LIZLLL = j + ((long) i);
                boolean z2 = !z;
                long jLJI = c734210Sr5.LJI(aweme, z2);
                C734210Sr5 c734210Sr52 = this.LL;
                InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> interfaceC1631620sYq = c734210Sr52.LIZJ;
                Aweme aweme2 = c734210Sr52.LJIIIIZZ;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                interfaceC1631620sYq.invoke(aid, C734210Sr5.LJ(jLJI, this.LL.LJIIIIZZ, z2), Boolean.FALSE);
                this.LL.LJFF = false;
            }

            @Override // X.InterfaceC734510SrZ
            public final void oP1(C0WIY<String, Integer> c0wiy) {
                String str;
                Integer num;
                String str2;
                Integer num2;
                String aid;
                Aweme aweme;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onItemDiggSuccess pair=");
                String str3 = null;
                if (c0wiy != null) {
                    str = c0wiy.LIZ;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                sbLIZ.append(" , ");
                if (c0wiy != null) {
                    num = c0wiy.LIZIZ;
                } else {
                    num = null;
                }
                sbLIZ.append(num);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c0wiy != null) {
                    str2 = c0wiy.LIZ;
                } else {
                    str2 = null;
                }
                C737030Svd c737030Svd = new C737030Svd(13, str2);
                Bundle bundle = new Bundle();
                if (c0wiy == null || (num2 = c0wiy.LIZIZ) == null) {
                    num2 = -1;
                }
                Aweme aweme2 = this.LL.LJIIIIZZ;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (c0wiy != null) {
                    str3 = c0wiy.LIZ;
                }
                if (Intrinsics.LJFF(aid, str3) && (aweme = this.LL.LJIIIIZZ) != null) {
                    aweme.setUserDigg(num2.intValue());
                }
                c737030Svd.LIZLLL = "nearby_tab_outflow";
                bundle.putInt("user_digged", num2.intValue());
                c737030Svd.LIZJ = bundle;
                C1440005kM.LIZ(c737030Svd);
                C1440005kM.LIZ(new C734240Sr8(num2.intValue()));
                this.LL.LJFF = false;
            }
        };
    }

    @Override // X.InterfaceC1205300hTE
    public final void LIZIZ(int i, Aweme aweme) {
        boolean zIsLike;
        long diggCount;
        AwemeStatistics statistics;
        this.LJIIIIZZ = aweme;
        this.LJIIIZ = i;
        int userDigg = 0;
        if (aweme != null) {
            zIsLike = aweme.isLike();
        } else {
            zIsLike = false;
        }
        this.LJ = zIsLike;
        this.LJFF = false;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        this.LIZLLL = diggCount;
        if (aweme != null) {
            userDigg = aweme.getUserDigg();
        }
        this.LJII = userDigg;
        this.LJI = this.LIZLLL;
    }

    public final void LIZJ(Aweme aweme, boolean z) {
        Activity activityLIZ;
        boolean zLIZIZ;
        long jLJI;
        Activity activityLIZ2;
        Context context = this.LIZIZ.get();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        if (z) {
            boolean z2 = false;
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
                return;
            }
            if (aweme == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fake handleDiggClick: isDigging = ");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(", isDigged = ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(", userDigg = ");
            sbLIZ.append(aweme.getUserDigg());
            C2188811AlT.LIZIZ(sbLIZ);
            if (!this.LJ && aweme.getUserDigg() == 0) {
                this.LIZLLL++;
                jLJI = LJI(aweme, true);
                LJFF(1, aweme);
                C1205260hTA c1205260hTA = C1205260hTA.LIZ;
                String strValueOf = String.valueOf(this.LJIIIZ);
                c1205260hTA.getClass();
                C1205260hTA.LJI(aweme, strValueOf);
                z2 = true;
            } else if (this.LJ && aweme.getUserDigg() != 0) {
                this.LIZLLL--;
                jLJI = LJI(aweme, false);
                Context context2 = this.LIZIZ.get();
                if (context2 != null && (activityLIZ2 = C1388190mED.LIZ(context2)) != null) {
                    try {
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (C036E.LIZ.LIZIZ()) {
                        LJFF(0, aweme);
                        C1205260hTA c1205260hTA2 = C1205260hTA.LIZ;
                        String strValueOf2 = String.valueOf(this.LJIIIZ);
                        c1205260hTA2.getClass();
                        C1205260hTA.LJII(aweme, strValueOf2);
                    } else {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                        c1389890mGx2.LJIIIZ(2131837962);
                        c1389890mGx2.LJIIJJI();
                    }
                }
            } else {
                if (aweme.getUserDigg() == 1) {
                    z2 = true;
                }
                this.LJ = z2;
                jLJI = LJI(aweme, z2);
                z2 = this.LJ;
                if (z2) {
                    this.LIZLLL++;
                } else {
                    this.LIZLLL--;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fake handleDiggClick: aid = ");
            sbLIZ2.append(aweme.getAid());
            sbLIZ2.append(", selected = ");
            sbLIZ2.append(z2);
            sbLIZ2.append(", diggCount = ");
            sbLIZ2.append(jLJI);
            C2188811AlT.LIZIZ(sbLIZ2);
            C731910SnN c731910SnNLJ = LJ(jLJI, aweme, z2);
            InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> interfaceC1631620sYq = this.LIZJ;
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            interfaceC1631620sYq.invoke(aid, c731910SnNLJ, Boolean.TRUE);
            return;
        }
        C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ);
        c1389890mGx3.LJIIIZ(2131858551);
        c1389890mGx3.LJIIJJI();
    }

    public final void LJFF(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (i != 0) {
                if (i == 1) {
                    C740470T2v.LJ(C740470T2v.LIZ() + 1);
                    aweme.setUserDigg(1);
                    AwemeStatistics statistics = aweme.getStatistics();
                    if (statistics != null) {
                        statistics.setDiggCount(this.LIZLLL);
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
                statistics2.setDiggCount(this.LIZLLL);
            }
            C1440005kM.LIZ(new C737030Svd(13, aid));
            return;
        }
        HashMap map = new HashMap();
        map.put("aweme_id", aid);
        map.put("type", String.valueOf(i));
        map.put("channel_id", String.valueOf(C737370SwB.LIZ("eventType")));
        C735080SsU.LIZJ("eventType", null, map);
        this.LJFF = true;
        this.LJIIJ.LIZJ(map);
    }

    public final long LJI(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LJ = z;
            if (z) {
                if (this.LJII == 1) {
                    if (this.LJI < 1 && !AwemeExtKt.isDelete(aweme)) {
                        this.LJI = 1L;
                    }
                    return this.LJI;
                }
                return this.LJI + 1;
            }
            if (this.LJII == 1 && !AwemeExtKt.isDelete(aweme)) {
                return this.LJI - 1;
            }
            return this.LJI;
        }
        return 0L;
    }

    public static final C731910SnN LJ(long j, Aweme aweme, boolean z) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (j < 0) {
            j = 0;
        }
        boolean z2 = false;
        if (aweme != null && ((commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getDiggShowScene() != 1)) {
            z2 = true;
        }
        C1205150hSz.LIZ.getClass();
        return new C731910SnN(C618720OOo.LIZ(j), z, z2, true);
    }
}
