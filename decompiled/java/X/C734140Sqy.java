package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS673S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734140Sqy {
    public final WeakReference<Context> LIZ;
    public final InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public volatile boolean LJ;
    public long LJFF;
    public int LJI;
    public Aweme LJII;
    public final C734550Srd LJIIIIZZ;
    public final C01GW LJIIIZ;

    public final Activity LIZLLL() {
        Activity activityLIZ;
        Context context = this.LIZ.get();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            return activityLIZ;
        }
        Context context2 = this.LIZ.get();
        if (context2 != null) {
            return C1388190mED.LIZIZ(context2);
        }
        return null;
    }

    public final void LJFF(Aweme aweme) {
        boolean zIsLike;
        long diggCount;
        AwemeStatistics statistics;
        this.LJII = aweme;
        int userDigg = 0;
        if (aweme != null) {
            zIsLike = aweme.isLike();
        } else {
            zIsLike = false;
        }
        this.LIZLLL = zIsLike;
        this.LJ = false;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        this.LIZJ = diggCount;
        if (aweme != null) {
            userDigg = aweme.getUserDigg();
        }
        this.LJI = userDigg;
        this.LJFF = this.LIZJ;
    }

    public C734140Sqy(WeakReference weakReference, AwS673S0100000_24 awS673S0100000_24) {
        this.LIZ = weakReference;
        this.LIZIZ = awS673S0100000_24;
        C734550Srd c734550Srd = new C734550Srd();
        this.LJIIIIZZ = c734550Srd;
        this.LJIIIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(664));
        c734550Srd.LJIIJ(new C737390SwD());
        c734550Srd.LLILLJJLI = new InterfaceC734510SrZ() { // from class: X.0Sqz
            @Override // X.InterfaceC734510SrZ
            public final void KE(Exception exc) {
                boolean z;
                String aid;
                C734140Sqy c734140Sqy = this.LL;
                Aweme aweme = c734140Sqy.LJII;
                if (aweme == null) {
                    return;
                }
                if (!c734140Sqy.LIZLLL) {
                    c734140Sqy.LIZJ++;
                    z = true;
                } else {
                    c734140Sqy.LIZJ--;
                    z = false;
                }
                long jLJI = c734140Sqy.LJI(aweme, z);
                C734140Sqy c734140Sqy2 = this.LL;
                InterfaceC1631620sYq<String, C731910SnN, Boolean, Unit> interfaceC1631620sYq = c734140Sqy2.LIZIZ;
                Aweme aweme2 = c734140Sqy2.LJII;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                interfaceC1631620sYq.invoke(aid, C734140Sqy.LIZJ(jLJI, this.LL.LJII, z), Boolean.FALSE);
                this.LL.LJ = false;
            }

            @Override // X.InterfaceC734510SrZ
            public final void oP1(C0WIY<String, Integer> c0wiy) {
                String str;
                int iIntValue;
                String aid;
                Aweme aweme;
                Integer num;
                String str2 = null;
                if (c0wiy != null) {
                    str = c0wiy.LIZ;
                } else {
                    str = null;
                }
                C737030Svd c737030Svd = new C737030Svd(13, str);
                Bundle bundle = new Bundle();
                if (c0wiy != null && (num = c0wiy.LIZIZ) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                Aweme aweme2 = this.LL.LJII;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (c0wiy != null) {
                    str2 = c0wiy.LIZ;
                }
                if (Intrinsics.LJFF(aid, str2) && (aweme = this.LL.LJII) != null) {
                    aweme.setUserDigg(iIntValue);
                }
                bundle.putInt("user_digged", iIntValue);
                c737030Svd.LIZJ = bundle;
                C1440005kM.LIZ(c737030Svd);
                C1440005kM.LIZ(new C734240Sr8(iIntValue));
                this.LL.LJ = false;
            }
        };
    }

    public final void LIZIZ(Aweme aweme, Integer num) {
        boolean z;
        Activity activityLIZ;
        Activity activityLIZ2;
        Activity activityLIZ3;
        Activity activityLIZ4;
        Activity activityLIZ5;
        AwemeRawAd awemeRawAd;
        Activity activityLIZ6;
        if (aweme == null) {
            return;
        }
        if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isDisableLikeType()) {
            Context context = this.LIZ.get();
            if (context != null && (activityLIZ6 = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ6);
                c1389890mGx.LJIIIZ(2131824738);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        int iLIZIZ = C303210BuZ.LIZIZ();
        if (iLIZIZ == 0) {
            z = !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        } else if (iLIZIZ > 0 && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !this.LIZLLL && aweme.getUserDigg() == 0 && C740470T2v.LIZ() >= iLIZIZ) {
            z = true;
        } else {
            z = false;
        }
        Activity activityLIZ7 = null;
        if (z) {
            C735330Sst c735330Sst = new C735330Sst();
            c735330Sst.LIZLLL = "school_community_page";
            c735330Sst.LJJLIIIJLLLLLLLZ = 0;
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            c735330Sst.LJJLIIIJ = aid;
            c735330Sst.LJIJI(aweme);
            c735330Sst.LJJLIIIJJIZ = "click_like";
            c735330Sst.LJJLIIIJL = !C740470T2v.LIZIZ() ? 1 : 0;
            c735330Sst.LJJLIIIJLJLI = 1;
            c735330Sst.LJIILJJIL();
            if (!C740470T2v.LIZIZ()) {
                C740470T2v.LIZJ();
            }
            String aid2 = aweme.getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            Context context2 = this.LIZ.get();
            if (context2 != null) {
                activityLIZ7 = C1388190mED.LIZ(context2);
            }
            C627150Oin c627150Oin = new C627150Oin();
            C786410Ut5.LJJJI("login_title", "", c627150Oin.LIZ);
            C786410Ut5.LJJJI("group_id", aid2, c627150Oin.LIZ);
            C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(aweme), c627150Oin.LIZ);
            C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid2), c627150Oin.LIZ);
            C0XPD.LIZIZ(activityLIZ7, "school_community_page", "click_like", c627150Oin.LIZ, new C738960Syk(this, aweme, 6));
            return;
        }
        if (C0OAD.LIZIZ(aweme) && aweme.getUserDigg() == 0) {
            String strLIZ = C0OAD.LIZ(2131858174, aweme);
            Context context3 = this.LIZ.get();
            if (context3 != null && (activityLIZ5 = C1388190mED.LIZ(context3)) != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ5);
                c1389890mGx2.LJIIJ(strLIZ);
                c1389890mGx2.LJIIJJI();
                return;
            }
            return;
        }
        if (!aweme.isCanPlay() && aweme.getUserDigg() == 0) {
            Context context4 = this.LIZ.get();
            if (context4 != null && (activityLIZ4 = C1388190mED.LIZ(context4)) != null) {
                if (AwemeExtKt.isImage(aweme)) {
                    C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ4);
                    c1389890mGx3.LJIIIZ(2131835839);
                    c1389890mGx3.LJIIJJI();
                    return;
                } else {
                    C1389890mGx c1389890mGx4 = new C1389890mGx(activityLIZ4);
                    c1389890mGx4.LJIIIZ(2131858174);
                    c1389890mGx4.LJIIJJI();
                    return;
                }
            }
            return;
        }
        if (AwemeExtKt.isDelete(aweme) && aweme.getUserDigg() == 0) {
            Context context5 = this.LIZ.get();
            if (context5 != null && (activityLIZ3 = C1388190mED.LIZ(context5)) != null) {
                C1389890mGx c1389890mGx5 = new C1389890mGx(activityLIZ3);
                c1389890mGx5.LJIIIZ(2131858174);
                c1389890mGx5.LJIIJJI();
                return;
            }
            return;
        }
        if (aweme.getVideoControl() != null && aweme.getVideoControl().timerStatus == 0) {
            return;
        }
        if (AwemeExtKt.isProhibited(aweme)) {
            Context context6 = this.LIZ.get();
            if (context6 != null && (activityLIZ2 = C1388190mED.LIZ(context6)) != null) {
                C1389890mGx c1389890mGx6 = new C1389890mGx(activityLIZ2);
                c1389890mGx6.LJIIIZ(2131836471);
                c1389890mGx6.LJIIJJI();
                return;
            }
            return;
        }
        if (C729980SkG.LJIIIIZZ(aweme)) {
            C735280Sso.LIZ.getClass();
            if (C735280Sso.LJFF(aweme) && LIZLLL() != null) {
                Context context7 = this.LIZ.get();
                if (context7 != null && (activityLIZ = C1388190mED.LIZ(context7)) != null) {
                    C1389890mGx c1389890mGx7 = new C1389890mGx(activityLIZ);
                    c1389890mGx7.LJIIIZ(2131845231);
                    c1389890mGx7.LJIIJJI();
                    return;
                }
                return;
            }
        }
        if (!this.LIZLLL) {
            C735280Sso.LIZ.getClass();
            if (C735280Sso.LIZJ(aweme) && C735280Sso.LJ(aweme)) {
                LIZ(null, null, false);
                return;
            }
        }
        LIZ(aweme, num, true);
    }

    public final void LJ(int i, Aweme aweme) {
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
                        statistics.setDiggCount(this.LIZJ);
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
                statistics2.setDiggCount(this.LIZJ);
            }
            C1440005kM.LIZ(new C737030Svd(13, aid));
            return;
        }
        HashMap map = new HashMap();
        map.put("aweme_id", aid);
        map.put("type", String.valueOf(i));
        map.put("channel_id", String.valueOf(C737370SwB.LIZ("eventType")));
        C735080SsU.LIZJ("eventType", null, map);
        this.LJ = true;
        this.LJIIIIZZ.LIZJ(map);
    }

    public final long LJI(Aweme aweme, boolean z) {
        if (aweme != null) {
            this.LIZLLL = z;
            if (z) {
                if (this.LJI == 1) {
                    if (this.LJFF < 1 && !AwemeExtKt.isDelete(aweme)) {
                        this.LJFF = 1L;
                    }
                    return this.LJFF;
                }
                return this.LJFF + 1;
            }
            if (this.LJI == 1 && !AwemeExtKt.isDelete(aweme)) {
                return this.LJFF - 1;
            }
            return this.LJFF;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDiggCount when aweme is null: ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        C2344809Gs.LIZLLL(6, "SchoolPostDigg", C2188811AlT.LIZIZ(sbLIZ));
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
        boolean zLIZIZ = C0OAD.LIZIZ(aweme);
        String strLIZIZ = CardStruct.IStatusCode.DEFAULT;
        if (!zLIZIZ && j > 0) {
            strLIZIZ = C1843500y4a.LIZIZ(j);
        }
        return new C731910SnN(strLIZIZ, z, z2, true);
    }

    public final void LIZ(Aweme aweme, Integer num, boolean z) {
        Activity activityLIZ;
        boolean zLIZIZ;
        long jLJI;
        Activity activityLIZ2;
        if (z) {
            this.LIZ.get();
            boolean z2 = false;
            int iIntValue = 0;
            z = false;
            z = false;
            boolean z3 = false;
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                Context context = this.LIZ.get();
                if (context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ2);
                    c1389890mGx.LJIIIZ(2131837962);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
            if (aweme == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleDiggClick: context=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", aweme=null");
                C2344809Gs.LIZLLL(6, "SchoolPostDigg", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            ((C1910890zpH) this.LJIIIZ.getValue()).LIZ("SchoolPostCell", "allowActionDigg, valid");
            if (!this.LIZLLL && aweme.getUserDigg() == 0) {
                this.LIZJ++;
                jLJI = LJI(aweme, true);
                LJ(1, aweme);
                boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
                C735360Ssw c735360Ssw = new C735360Ssw();
                c735360Ssw.LJLJJI = zIsLogin ? 1 : 0;
                c735360Ssw.LJL = "click_card_like";
                c735360Ssw.LIZLLL = "school_community_page";
                c735360Ssw.LJJLIIIJJIZ = 0;
                c735360Ssw.LJIJI(aweme);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                c735360Ssw.LIZLLL(iIntValue, "model_source");
                C1366720lfa.LIZIZ(aweme, c735360Ssw, "school_community_page", null);
                c735360Ssw.LJIILJJIL();
                z3 = true;
            } else if (this.LIZLLL && aweme.getUserDigg() != 0) {
                this.LIZJ--;
                jLJI = LJI(aweme, false);
                if (!C036E.LIZ.LIZIZ()) {
                    Activity activityLIZLLL = LIZLLL();
                    if (activityLIZLLL != null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZLLL);
                        c1389890mGx2.LJIIIZ(2131837962);
                        c1389890mGx2.LJIIJJI();
                    }
                } else {
                    C735360Ssw c735360Ssw2 = new C735360Ssw("like_cancel");
                    c735360Ssw2.LIZLLL = "school_community_page";
                    c735360Ssw2.LJL = "click_card_like";
                    c735360Ssw2.LJJLIIIJJIZ = 0;
                    c735360Ssw2.LJIJI(aweme);
                    c735360Ssw2.LJIILJJIL();
                    LJ(0, aweme);
                }
            } else {
                if (aweme.getUserDigg() == 1) {
                    z2 = true;
                }
                this.LIZLLL = z2;
                jLJI = LJI(aweme, z2);
                z3 = this.LIZLLL;
                if (z3) {
                    this.LIZJ++;
                } else {
                    this.LIZJ--;
                }
            }
            this.LIZIZ.invoke(aweme.getAid(), LIZJ(jLJI, aweme, z3), Boolean.TRUE);
            return;
        }
        Context context2 = this.LIZ.get();
        if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
            C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ);
            c1389890mGx3.LJIIIZ(2131858551);
            c1389890mGx3.LJIIJJI();
        }
    }
}
