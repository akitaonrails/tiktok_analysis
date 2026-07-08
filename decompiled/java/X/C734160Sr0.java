package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734160Sr0 {
    public static final /* synthetic */ int LJIIL = 0;
    public final String LIZ = "poi_detail";
    public final Context LIZIZ;
    public final C734200Sr4 LIZJ;
    public final InterfaceC665370Q7z LIZLLL;
    public final InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> LJ;
    public long LJFF;
    public boolean LJI;
    public volatile boolean LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public Aweme LJIIJ;
    public final C734550Srd LJIIJJI;

    public final void LJFF(Aweme aweme) {
        boolean zIsLike;
        long diggCount;
        AwemeStatistics statistics;
        this.LJIIJ = aweme;
        int userDigg = 0;
        if (aweme != null) {
            zIsLike = aweme.isLike();
        } else {
            zIsLike = false;
        }
        this.LJI = zIsLike;
        this.LJII = false;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        this.LJFF = diggCount;
        if (aweme != null) {
            userDigg = aweme.getUserDigg();
        }
        this.LJIIIZ = userDigg;
        this.LJIIIIZZ = this.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final int r9, final com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C734160Sr0.LIZIZ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJ(int i, Aweme aweme) {
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
                    LIZLLL(this.LJFF, aweme, true);
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
            LIZLLL(this.LJFF, aweme, false);
            C1440005kM.LIZ(new C737030Svd(13, aid));
            return;
        }
        HashMap map = new HashMap();
        map.put("aweme_id", aid);
        map.put("type", String.valueOf(i));
        map.put("channel_id", String.valueOf(C737370SwB.LIZ("eventType")));
        C735080SsU.LIZJ("eventType", null, map);
        this.LJII = true;
        this.LJIIJJI.LIZJ(map);
    }

    public final long LJI(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LJI = z;
            if (z) {
                if (this.LJIIIZ == 1) {
                    if (this.LJIIIIZZ < 1 && !AwemeExtKt.isDelete(aweme)) {
                        this.LJIIIIZZ = 1L;
                    }
                    return this.LJIIIIZZ;
                }
                return this.LJIIIIZZ + 1;
            }
            if (this.LJIIIZ == 1 && !AwemeExtKt.isDelete(aweme)) {
                return this.LJIIIIZZ - 1;
            }
            return this.LJIIIIZZ;
        }
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
        return new C731910SnN(C618720OOo.LIZ(j), z, z2, true);
    }

    public static void LIZLLL(long j, Aweme aweme, boolean z) {
        String aid;
        Aweme awemeLLILZ;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            aweme.setUserDigg(z ? 1 : 0);
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                statistics.setDiggCount(j);
            }
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(aid)) != null && awemeLLILZ != aweme) {
                awemeLLILZ.setUserDigg(z ? 1 : 0);
                AwemeStatistics statistics2 = awemeLLILZ.getStatistics();
                if (statistics2 != null) {
                    statistics2.setDiggCount(j);
                }
            }
        }
    }

    public final void LIZ(Aweme aweme, int i, boolean z) {
        Activity activityLIZ;
        boolean zLIZIZ;
        long jLJI;
        boolean z2;
        Activity activityLIZ2;
        int i2;
        int i3;
        String str;
        String str2;
        C735360Ssw c735360Ssw;
        String str3;
        String str4;
        Context context = this.LIZIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            if (z) {
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
                sbLIZ.append(this.LJII);
                sbLIZ.append(", isDigged = ");
                sbLIZ.append(this.LJI);
                sbLIZ.append(", userDigg = ");
                sbLIZ.append(aweme.getUserDigg());
                C2188811AlT.LIZIZ(sbLIZ);
                String str5 = "story";
                if (!this.LJI && aweme.getUserDigg() == 0) {
                    this.LJFF++;
                    jLJI = LJI(aweme, true);
                    LJ(1, aweme);
                    String strValueOf = String.valueOf(i);
                    C734200Sr4 c734200Sr4 = this.LIZJ;
                    InterfaceC665370Q7z interfaceC665370Q7z = this.LIZLLL;
                    try {
                        c735360Ssw = new C735360Ssw();
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        c735360Ssw.LJLJJI = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 1 : 0;
                        c735360Ssw.LJL = "post_card";
                        c735360Ssw.LIZLLL = "poi_detail";
                        c735360Ssw.LLIIIL = CardStruct.IStatusCode.DEFAULT;
                        c735360Ssw.LJIJI(aweme);
                        C729980SkG.LJII(aweme);
                        C735840Sti c735840Sti = C735840Sti.LIZ;
                        User author = aweme.getAuthor();
                        c735840Sti.getClass();
                        c735360Ssw.LJJJLL = C735840Sti.LJIIIIZZ(author);
                        if (!C729510SjV.LJJIJIL(aweme)) {
                            str5 = "post";
                        }
                        c735360Ssw.LJJJLZIJ = str5;
                        c735360Ssw.LJJJZ = C729510SjV.LJII(aweme);
                        int i4 = 1;
                        if (!aweme.getIsStoryToNormal()) {
                            i4 = 0;
                        }
                        c735360Ssw.LJJLI = i4;
                        C735370Ssx.LIZJ(aweme);
                        C1380890m2R.LIZIZ(c735360Ssw, aweme.getAid());
                        C1D0F c1d0f = C1D0F.LIZ;
                        c735360Ssw.LJI(c1d0f.LIZ(), c1d0f.isConnected());
                        String strLIZIZ = c1d0f.LIZIZ();
                        String strLIZJ = c1d0f.LIZJ();
                        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
                        c735360Ssw.LJFF(strLIZIZ, strLIZJ, c2082308Dt);
                        c735360Ssw.LJFF("poi_detail_rank", strValueOf, c2082308Dt);
                        if (c734200Sr4 == null) {
                            str3 = null;
                        } else {
                            str3 = c734200Sr4.LIZIZ;
                        }
                        c735360Ssw.LJFF("tab_code", str3, c2082308Dt);
                        if (c734200Sr4 == null) {
                            str4 = null;
                        } else {
                            str4 = c734200Sr4.LIZ;
                        }
                        c735360Ssw.LJFF("tag_code", str4, c2082308Dt);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            c735360Ssw.LJ((String) entry.getKey(), (String) entry.getValue());
                        }
                        c735360Ssw.LJIILJJIL();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    z2 = true;
                } else if (this.LJI && aweme.getUserDigg() != 0) {
                    this.LJFF--;
                    jLJI = LJI(aweme, false);
                    Context context2 = this.LIZIZ;
                    if (context2 != null && (activityLIZ2 = C1388190mED.LIZ(context2)) != null) {
                        try {
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        if (C036E.LIZ.LIZIZ()) {
                            LJ(0, aweme);
                            String strValueOf2 = String.valueOf(i);
                            C734200Sr4 c734200Sr42 = this.LIZJ;
                            InterfaceC665370Q7z interfaceC665370Q7z2 = this.LIZLLL;
                            try {
                                try {
                                    C735360Ssw c735360Ssw2 = new C735360Ssw("like_cancel");
                                    if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                    c735360Ssw2.LJLJJI = i2;
                                    c735360Ssw2.LJL = "post_card";
                                    c735360Ssw2.LIZLLL = "poi_detail";
                                    c735360Ssw2.LLIIIL = CardStruct.IStatusCode.DEFAULT;
                                    c735360Ssw2.LJIJI(aweme);
                                    C729980SkG.LJII(aweme);
                                    C735840Sti c735840Sti2 = C735840Sti.LIZ;
                                    User author2 = aweme.getAuthor();
                                    c735840Sti2.getClass();
                                    c735360Ssw2.LJJJLL = C735840Sti.LJIIIIZZ(author2);
                                    if (!C729510SjV.LJJIJIL(aweme)) {
                                        str5 = "post";
                                    }
                                    c735360Ssw2.LJJJLZIJ = str5;
                                    c735360Ssw2.LJJJZ = C729510SjV.LJII(aweme);
                                    if (aweme.getIsStoryToNormal()) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    c735360Ssw2.LJJLI = i3;
                                    C735370Ssx.LIZJ(aweme);
                                    C1380890m2R.LIZIZ(c735360Ssw2, aweme.getAid());
                                    C1D0F c1d0f2 = C1D0F.LIZ;
                                    c735360Ssw2.LJI(c1d0f2.LIZ(), c1d0f2.isConnected());
                                    String strLIZIZ2 = c1d0f2.LIZIZ();
                                    String strLIZJ2 = c1d0f2.LIZJ();
                                    C2082308Dt c2082308Dt2 = InterfaceC1210900hcG.LIZ;
                                    c735360Ssw2.LJFF(strLIZIZ2, strLIZJ2, c2082308Dt2);
                                    c735360Ssw2.LJFF("poi_detail_rank", strValueOf2, c2082308Dt2);
                                    if (c734200Sr42 == null) {
                                        str = null;
                                    } else {
                                        str = c734200Sr42.LIZIZ;
                                    }
                                    c735360Ssw2.LJFF("tab_code", str, c2082308Dt2);
                                    if (c734200Sr42 == null) {
                                        str2 = null;
                                    } else {
                                        str2 = c734200Sr42.LIZ;
                                    }
                                    c735360Ssw2.LJFF("tag_code", str2, c2082308Dt2);
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    C1182410gsJ.LIZ(linkedHashMap2, interfaceC665370Q7z2);
                                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                        c735360Ssw2.LJ((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                    c735360Ssw2.LJIILJJIL();
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th3) {
                                    th = th3;
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                            c1389890mGx2.LJIIIZ(2131837962);
                            c1389890mGx2.LJIIJJI();
                        }
                    }
                    z2 = false;
                } else {
                    boolean z3 = true;
                    if (aweme.getUserDigg() != 1) {
                        z3 = false;
                    }
                    this.LJI = z3;
                    jLJI = LJI(aweme, z3);
                    z2 = this.LJI;
                    if (z2) {
                        this.LJFF++;
                    } else {
                        this.LJFF--;
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
                LIZLLL(jLJI, aweme, z2);
                C731910SnN c731910SnNLIZJ = LIZJ(jLJI, aweme, z2);
                InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> interfaceC1631620sYq = this.LJ;
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                interfaceC1631620sYq.invoke(aid, c731910SnNLIZJ, Boolean.TRUE);
                return;
            }
            C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ);
            c1389890mGx3.LJIIIZ(2131858551);
            c1389890mGx3.LJIIJJI();
        }
    }

    public C734160Sr0(Context context, C734200Sr4 c734200Sr4, InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LIZIZ = context;
        this.LIZJ = c734200Sr4;
        this.LIZLLL = interfaceC665370Q7z;
        this.LJ = interfaceC1631620sYq;
        C734550Srd c734550Srd = new C734550Srd();
        this.LJIIJJI = c734550Srd;
        c734550Srd.LJIIJ(new C737390SwD());
        c734550Srd.LLILLJJLI = new InterfaceC734510SrZ() { // from class: X.0Sr1
            @Override // X.InterfaceC734510SrZ
            public final void KE(Exception exc) {
                int i;
                String aid;
                C734160Sr0 c734160Sr0 = this.LL;
                Aweme aweme = c734160Sr0.LJIIJ;
                if (aweme == null) {
                    return;
                }
                long j = c734160Sr0.LJFF;
                boolean z = c734160Sr0.LJI;
                if (!z) {
                    i = 1;
                } else {
                    i = -1;
                }
                c734160Sr0.LJFF = j + ((long) i);
                boolean z2 = !z;
                long jLJI = c734160Sr0.LJI(aweme, z2);
                C734160Sr0.LIZLLL(jLJI, this.LL.LJIIJ, z2);
                C734160Sr0 c734160Sr02 = this.LL;
                InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> interfaceC1631620sYq2 = c734160Sr02.LJ;
                Aweme aweme2 = c734160Sr02.LJIIJ;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                interfaceC1631620sYq2.invoke(aid, C734160Sr0.LIZJ(jLJI, this.LL.LJIIJ, z2), Boolean.FALSE);
                this.LL.LJII = false;
            }

            @Override // X.InterfaceC734510SrZ
            public final void oP1(C0WIY<String, Integer> c0wiy) {
                String str;
                Integer num;
                String str2;
                Integer num2;
                String aid;
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
                Aweme aweme = this.LL.LJIIJ;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (c0wiy != null) {
                    str3 = c0wiy.LIZ;
                }
                if (Intrinsics.LJFF(aid, str3)) {
                    Aweme aweme2 = this.LL.LJIIJ;
                    if (aweme2 != null) {
                        aweme2.setUserDigg(num2.intValue());
                    }
                    C734160Sr0 c734160Sr0 = this.LL;
                    Aweme aweme3 = c734160Sr0.LJIIJ;
                    long j = c734160Sr0.LJFF;
                    boolean z = true;
                    if (num2.intValue() != 1) {
                        z = false;
                    }
                    C734160Sr0.LIZLLL(j, aweme3, z);
                }
                bundle.putInt("user_digged", num2.intValue());
                c737030Svd.LIZJ = bundle;
                C1440005kM.LIZ(c737030Svd);
                C1440005kM.LIZ(new C734240Sr8(num2.intValue()));
                this.LL.LJII = false;
            }
        };
    }
}
