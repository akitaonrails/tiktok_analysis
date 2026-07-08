package X;

import Y.AkS468S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.bean.ProfileTabStoreData;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.ss.android.ugc.aweme.notification.redpoint.MultiUserNoticeCountResponse;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: renamed from: X.10kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19335310kh implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return then$10(this, c15o7);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return then$11(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return then$12(this, c15o7);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return then$13(this, c15o7);
            default:
                return null;
        }
    }

    public C19335310kh(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C19335310kh c19335310kh, C15O7 c15o7) {
        C1C7U.LIZ("MusNotificationDetailActivity@4eac.onRefresh$1");
        if (!((MusNotificationDetailActivity) c19335310kh.l0).isDestroyed()) {
            C786410Ut5.LLLZLZ(((MusNotificationDetailActivity) c19335310kh.l0).LLLLZLL(), 0);
            C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
            if (c1913380ztI.isStandardUIEnable()) {
                c1913380ztI.setStatusView(((MusNotificationDetailActivity) c19335310kh.l0).LLLLZLL(), "inbox_notification_detail", new C1909030zmH((MusNotificationDetailActivity) c19335310kh.l0), (Exception) null);
                MusNotificationDetailActivity musNotificationDetailActivity = (MusNotificationDetailActivity) c19335310kh.l0;
                c1913380ztI.triggerNetworkTips(musNotificationDetailActivity, "inbox_notification_detail", (Exception) null, musNotificationDetailActivity.LLLLZLL());
            } else {
                C1749280vcc c1749280vccLLLLZLL = ((MusNotificationDetailActivity) c19335310kh.l0).LLLLZLL();
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv6, new C1909040zmI((MusNotificationDetailActivity) c19335310kh.l0));
                c1749280vccLLLLZLL.setStatus(c1722300uv6);
                C1389890mGx c1389890mGx = new C1389890mGx((MusNotificationDetailActivity) c19335310kh.l0);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusNotificationDetailActivity@4eac.onRefresh$1");
        return unit;
    }

    public static final Object then$1(C19335310kh c19335310kh, C15O7 c15o7) {
        C1C7U.LIZ("ScanQRCodeActivityV2@7250.startScan$1");
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) c19335310kh.l0;
        ScanQRCodeActivityV2 scanQRCodeActivityV22 = (ScanQRCodeActivityV2) c19335310kh.l0;
        final ScanQRCodeActivityV2 scanQRCodeActivityV23 = (ScanQRCodeActivityV2) c19335310kh.l0;
        scanQRCodeActivityV2.LLJJJJ = new GestureDetector(scanQRCodeActivityV22, new GestureDetector.SimpleOnGestureListener() { // from class: X.10d3
            public long LL;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                if (scanQRCodeActivityV23.LLJI == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.LL < 500) {
                    return false;
                }
                this.LL = jCurrentTimeMillis;
                if (scanQRCodeActivityV23.LLJJL <= 1.0f) {
                    while (true) {
                        ScanQRCodeActivityV2 scanQRCodeActivityV24 = scanQRCodeActivityV23;
                        float f = scanQRCodeActivityV24.LLJJL;
                        if (f >= 3.0f) {
                            break;
                        }
                        float f2 = f + 0.03f;
                        scanQRCodeActivityV24.LLJJL = f2;
                        scanQRCodeActivityV24.LLJI.zoomByRatio(f2);
                    }
                } else {
                    while (true) {
                        ScanQRCodeActivityV2 scanQRCodeActivityV25 = scanQRCodeActivityV23;
                        float f3 = scanQRCodeActivityV25.LLJJL;
                        if (f3 <= 1.0f) {
                            break;
                        }
                        float f4 = f3 - 0.03f;
                        scanQRCodeActivityV25.LLJJL = f4;
                        scanQRCodeActivityV25.LLJI.zoomByRatio(f4);
                    }
                }
                return false;
            }
        });
        ScanQRCodeActivityV2 scanQRCodeActivityV24 = (ScanQRCodeActivityV2) c19335310kh.l0;
        final ScanQRCodeActivityV2 scanQRCodeActivityV25 = (ScanQRCodeActivityV2) c19335310kh.l0;
        scanQRCodeActivityV24.LLJJJJJIL = new ScaleGestureDetector(scanQRCodeActivityV25, new ScaleGestureDetector.OnScaleGestureListener() { // from class: X.10d5
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onScale(android.view.ScaleGestureDetector r7) {
                /*
                    r6 = this;
                    com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2 r0 = r1
                    com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner r0 = r0.LLJI
                    if (r0 == 0) goto L2b
                    if (r7 == 0) goto L2b
                    float r5 = r7.getScaleFactor()
                    r4 = 1065353216(0x3f800000, float:1.0)
                    int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                    r3 = 1028443341(0x3d4ccccd, float:0.05)
                    if (r0 < 0) goto L2d
                    com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2 r2 = r1
                    float r1 = r2.LLJJL
                    r0 = 1077936128(0x40400000, float:3.0)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 > 0) goto L2d
                    float r1 = r1 + r3
                    r2.LLJJL = r1
                L22:
                    com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2 r0 = r1
                    com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner r1 = r0.LLJI
                    float r0 = r0.LLJJL
                    r1.zoomByRatio(r0)
                L2b:
                    r0 = 0
                    return r0
                L2d:
                    int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L22
                    com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2 r2 = r1
                    float r1 = r2.LLJJL
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 < 0) goto L22
                    float r1 = r1 - r3
                    r2.LLJJL = r1
                    goto L22
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetectorOnScaleGestureListenerC19288110d5.onScale(android.view.ScaleGestureDetector):boolean");
            }
        });
        ScanQRCodeActivityV2 scanQRCodeActivityV26 = (ScanQRCodeActivityV2) c19335310kh.l0;
        final ScanQRCodeActivityV2 scanQRCodeActivityV27 = (ScanQRCodeActivityV2) c19335310kh.l0;
        scanQRCodeActivityV26.LLJJJJLIIL = new GestureDetector(scanQRCodeActivityV27, new GestureDetector.OnGestureListener() { // from class: X.10d0
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                scanQRCodeActivityV27.LLJI.processTouchEvent(motionEvent.getX() / C14KQ.LJIIIIZZ(scanQRCodeActivityV27), motionEvent.getY() / C14KQ.LJ(scanQRCodeActivityV27));
                return true;
            }
        });
        C1C7U.LIZIZ("ScanQRCodeActivityV2@7250.startScan$1");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$10(X.C19335310kh r15, X.C15O7 r16) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19335310kh.then$10(X.10kh, X.15O7):java.lang.Object");
    }

    public static final Object then$11(C19335310kh c19335310kh, C15O7 c15o7) {
        Activity activity;
        C1C7U.LIZ("PraiseDialogHelper@da9c.tryShowActiveDialog$2");
        if (((Boolean) c15o7.LJIIL()).booleanValue() && (activity = (Activity) c19335310kh.l0) != null) {
            C1909230zmb c1909230zmb = C1909230zmb.LIZ;
            C1909110zmP c1909110zmP = new C1909110zmP(activity, EnumC1909250zmd.ACTIVATION);
            c1909230zmb.getClass();
            C1909230zmb.LIZLLL(c1909110zmP);
        }
        C1C7U.LIZIZ("PraiseDialogHelper@da9c.tryShowActiveDialog$2");
        return null;
    }

    public static final Object then$12(C19335310kh c19335310kh, C15O7 c15o7) {
        C1C7U.LIZ("UserListActivity@4fba.doRefresh$1");
        if (!((UserListActivity) c19335310kh.l0).isDestroyed()) {
            C786410Ut5.LLLZLZ(((UserListActivity) c19335310kh.l0).LLLZZIL(), 0);
            C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
            if (c1913380ztI.isStandardUIEnable()) {
                c1913380ztI.setStatusView(((UserListActivity) c19335310kh.l0).LLLZZIL(), "inbox_like_list", new C1909050zmJ((UserListActivity) c19335310kh.l0), (Exception) null);
                UserListActivity userListActivity = (UserListActivity) c19335310kh.l0;
                c1913380ztI.triggerNetworkTips(userListActivity, "inbox_like_list", (Exception) null, userListActivity.LLLZZIL());
            } else {
                C1749280vcc c1749280vccLLLZZIL = ((UserListActivity) c19335310kh.l0).LLLZZIL();
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv6, new C1909060zmK((UserListActivity) c19335310kh.l0));
                c1749280vccLLLZZIL.setStatus(c1722300uv6);
                C1389890mGx c1389890mGx = new C1389890mGx((UserListActivity) c19335310kh.l0);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserListActivity@4fba.doRefresh$1");
        return unit;
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [X.0ilv] */
    public static final Object then$13(C19335310kh c19335310kh, C15O7 c15o7) {
        MultiUserNoticeCountResponse multiUserNoticeCountResponse;
        int i;
        int i2;
        C0ZAJ c0zaj;
        C1904260zea c1904260zea = (C1904260zea) c19335310kh.l0;
        c1904260zea.getClass();
        C1C7U.LIZ("MultiUserManager@b51.pullMultiUserNoticeCount$1L");
        if (c15o7 != null && c15o7.LJIILJJIL() && (multiUserNoticeCountResponse = (MultiUserNoticeCountResponse) c15o7.LJIIL()) != null && !C086I.LIZIZ(multiUserNoticeCountResponse.noticeLists)) {
            C1255320ilu c1255320ilu = C1255320ilu.LIZ;
            final String str = multiUserNoticeCountResponse.extra.logid;
            c1255320ilu.getClass();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (C1255320ilu.LIZIZ == null) {
                C1255320ilu.LIZJ = new HashMap<>();
                C1255320ilu.LIZIZ = new Object(str, jCurrentTimeMillis) { // from class: X.0ilv
                };
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateCurrentAccountUserDMTrackData, logID=");
                sbLIZ.append(str);
                sbLIZ.append(", serverTime=");
                sbLIZ.append(jCurrentTimeMillis);
                C1720106oR.LJI("AccountSwitchDMTrack", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateCurrentAccountUserDMTrackData, logID=");
                sbLIZ2.append(str);
                sbLIZ2.append(", serverTime=");
                sbLIZ2.append(jCurrentTimeMillis);
                C1720106oR.LJI("AccountSwitchDMTrack", C2188811AlT.LIZIZ(sbLIZ2));
            }
            c1904260zea.LIZ.clear();
            c1904260zea.LIZIZ = 0;
            c1904260zea.LIZJ = 0;
            int i5 = 0;
            for (NoticeList noticeList : multiUserNoticeCountResponse.noticeLists) {
                if (noticeList.getItems() != null) {
                    i2 = 0;
                    for (NoticeCount noticeCount : noticeList.getItems()) {
                        if (noticeCount != null) {
                            Integer num = noticeCount.showType;
                            if (num != null && num.intValue() < C0ZAJ.values().length) {
                                c0zaj = C0ZAJ.values()[num.intValue()];
                            } else {
                                c0zaj = C0ZAJ.ShowDefault;
                            }
                            if (c0zaj == C0ZAJ.ShowNum && noticeCount.muteStatus != 1) {
                                i2 += noticeCount.count;
                            }
                        }
                    }
                } else {
                    i2 = 0;
                }
                int i6 = C2187451AjH.LIZ;
                Locale locale = Locale.ENGLISH;
                C1720106oR.LJI("MultiUserManager", C786410Ut5.k4(locale, "uid: %d, sumCount without dm: %d", new Object[]{noticeList.getUserId(), Integer.valueOf(i2)}));
                int dmCount = (int) (((long) i2) + noticeList.getDmCount());
                C1720106oR.LJI("MultiUserManager", C786410Ut5.k4(locale, "uid: %d, sumCount with dm: %d", new Object[]{noticeList.getUserId(), Integer.valueOf(dmCount)}));
                if (noticeList.getUserId() != null) {
                    c1904260zea.LIZ.put(noticeList.getUserId(), Integer.valueOf(dmCount));
                    C1255320ilu c1255320ilu2 = C1255320ilu.LIZ;
                    String string = noticeList.getUserId().toString();
                    long dmCount2 = noticeList.getDmCount();
                    c1255320ilu2.getClass();
                    HashMap<String, Long> map = C1255320ilu.LIZJ;
                    if (map != null) {
                        map.put(string, Long.valueOf(dmCount2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("updateCurrentAccountUserDMTrackData, userID=");
                        sbLIZ3.append(string);
                        sbLIZ3.append(", dmUnreadCount=");
                        sbLIZ3.append(dmCount2);
                        C1720106oR.LJI("AccountSwitchDMTrack", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    if (CastLongProtector.parseLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) != noticeList.getUserId().longValue()) {
                        i5 += dmCount;
                    }
                }
            }
            c1904260zea.LIZIZ = i5;
            int i7 = C2187451AjH.LIZ;
            Locale locale2 = Locale.ENGLISH;
            C786410Ut5.k4(locale2, "allOtherCount: %d", new Object[]{Integer.valueOf(i5)});
            C09FH c09fh = C09FH.LIZ;
            int i8 = c1904260zea.LIZIZ;
            c09fh.getClass();
            ProfileTabStoreData profileTabStoreDataLIZ = C09FH.LIZ();
            if (profileTabStoreDataLIZ == null) {
                C09FH.LIZJ(new ProfileTabStoreData(false, i8));
                i = -1;
            } else {
                i = profileTabStoreDataLIZ.totalCount;
                profileTabStoreDataLIZ.totalCount = i8;
                C09FH.LIZJ(profileTabStoreDataLIZ);
            }
            c1904260zea.LIZJ = i;
            C1720106oR.LJI("MultiUserManager", C786410Ut5.k4(locale2, "lastAllOtherMultiUserNoticeCount: %d", new Object[]{Integer.valueOf(i)}));
            c1904260zea.LIZLLL = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            C1440005kM.LIZIZ(new IEvent() { // from class: X.0HZO
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
        C1C7U.LIZIZ("MultiUserManager@b51.pullMultiUserNoticeCount$1L");
        return null;
    }

    public static final Object then$2(C19335310kh c19335310kh, C15O7 c15o7) {
        C1C7U.LIZ("ScanQRCodeActivityV2@7250.startScan$2");
        synchronized (((ScanQRCodeActivityV2) c19335310kh.l0)) {
            try {
                ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) c19335310kh.l0;
                IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LLJI;
                if (iQRCodeScanner != null && !scanQRCodeActivityV2.LLJJ) {
                    iQRCodeScanner.stop();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("ScanQRCodeActivityV2@7250.startScan$2");
        return null;
    }

    public static final Object then$3(C19335310kh c19335310kh, C15O7 c15o7) {
        C1C7U.LIZ("ShareQRCodeApi@5342.getQRCodeInfo$1");
        Exception excLJIIJJI = null;
        QRCodeInfo qRCodeInfo = null;
        if (C09UZ.LIZLLL(c15o7)) {
            InterfaceC1912880zsU interfaceC1912880zsU = (InterfaceC1912880zsU) c19335310kh.l0;
            if (c15o7 != null) {
                qRCodeInfo = (QRCodeInfo) c15o7.LJIIL();
            }
            interfaceC1912880zsU.LIZ(qRCodeInfo);
        } else {
            InterfaceC1912880zsU interfaceC1912880zsU2 = (InterfaceC1912880zsU) c19335310kh.l0;
            if (c15o7 != null) {
                excLJIIJJI = c15o7.LJIIJJI();
            }
            interfaceC1912880zsU2.onFailure(excLJIIJJI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareQRCodeApi@5342.getQRCodeInfo$1");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$4(X.C19335310kh r5, X.C15O7 r6) {
        /*
            java.lang.String r4 = "ReplaceMusicServiceImpl@cb3a.replaceDirectInPromoteScene$2"
            X.C1C7U.LIZ(r4)
            boolean r0 = r6.LJIILL()
            r3 = 0
            if (r0 != 0) goto L2d
            boolean r0 = r6.LJIILIIL()
            if (r0 != 0) goto L2d
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService> r0 = com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService r0 = (com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService) r0
            r0.LIZ()
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest r0 = (com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest) r0
            X.15O7 r0 = X.C1911640zqU.LJIIIZ(r0, r3)
        L29:
            X.C1C7U.LIZIZ(r4)
            return r0
        L2d:
            java.lang.Exception r1 = r6.LJIIJJI()
            boolean r0 = r1 instanceof X.C0XIR
            if (r0 == 0) goto L8c
            X.093u r1 = (X.C23112093u) r1
            if (r1 == 0) goto L8c
            int r1 = r1.getErrorCode()
            r0 = 3013002(0x2df98a, float:4.222115E-39)
            if (r1 != r0) goto L8c
            r0 = 1
        L43:
            java.lang.String r2 = "ReplaceMusicToolbarScene"
            if (r0 == 0) goto L6e
            java.lang.Exception r1 = r6.LJIIJJI()
            boolean r0 = r1 instanceof X.C0XIR
            if (r0 == 0) goto L6c
            X.0XIR r1 = (X.C0XIR) r1
            if (r1 == 0) goto L6c
            java.lang.String r0 = r1.getErrorMsg()
        L57:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6e
            java.lang.String r0 = "error code 3013002"
            X.C201955140j.LIZIZ(r2, r0)
        L62:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.15O7 r0 = X.C15O7.LJIIJ(r0)
            goto L29
        L6c:
            r0 = r3
            goto L57
        L6e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "first network error "
            r1.append(r0)
            java.lang.Exception r0 = r6.LJIIJJI()
            if (r0 == 0) goto L81
            java.lang.String r3 = r0.toString()
        L81:
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZIZ(r2, r0)
            goto L62
        L8c:
            r0 = 0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19335310kh.then$4(X.10kh, X.15O7):java.lang.Object");
    }

    public static final Object then$5(C19335310kh c19335310kh, C15O7 c15o7) {
        Object objLJIIIZ;
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.retryInPromoteScene$3");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
            objLJIIIZ = C1911640zqU.LJIIIZ((PromoteReplaceMusicRequest) c19335310kh.l0, null);
        } else {
            C201955140j.LIZIZ("ReplaceMusicToolbarScene", "Retry error code 3013002");
            objLJIIIZ = Unit.LIZ;
        }
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.retryInPromoteScene$3");
        return objLJIIIZ;
    }

    public static final Object then$6(C19335310kh c19335310kh, C15O7 c15o7) {
        C11GO c11go;
        C1C7U.LIZ("PushSettingFollowListAdapter$CampaignItemViewSwitchHolder@6263.onSuccess$2");
        PushSettingFollowListAdapter.CampaignItemViewSwitchHolder campaignItemViewSwitchHolder = (PushSettingFollowListAdapter.CampaignItemViewSwitchHolder) c19335310kh.l0;
        boolean z = true;
        if (C19328310jZ.LIZIZ.LIZLLL("live_campaign_push") != 1) {
            z = false;
        }
        C127M accessory = campaignItemViewSwitchHolder.LLJI.getAccessory();
        if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
            c11go.LJIILJJIL(z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushSettingFollowListAdapter$CampaignItemViewSwitchHolder@6263.onSuccess$2");
        return unit;
    }

    public static final Object then$7(C19335310kh c19335310kh, C15O7 c15o7) {
        C11GO c11go;
        C1C7U.LIZ("PushSettingFollowListAdapter$SubSpaceItemViewSwitchHolder@80dc.onSuccess$2");
        PushSettingFollowListAdapter.SubSpaceItemViewSwitchHolder subSpaceItemViewSwitchHolder = (PushSettingFollowListAdapter.SubSpaceItemViewSwitchHolder) c19335310kh.l0;
        boolean z = true;
        if (C19328310jZ.LIZIZ.LIZLLL("live_sub_space_push") != 1) {
            z = false;
        }
        C127M accessory = subSpaceItemViewSwitchHolder.LLJI.getAccessory();
        if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
            c11go.LJIILJJIL(z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushSettingFollowListAdapter$SubSpaceItemViewSwitchHolder@80dc.onSuccess$2");
        return unit;
    }

    public static final Object then$8(C19335310kh c19335310kh, C15O7 c15o7) {
        C20697415yu c20697415yu = (C20697415yu) c19335310kh.l0;
        c20697415yu.getClass();
        C1C7U.LIZ("UserQRCodeCardViewV2@5a5a.setData$2L");
        if (c15o7.LJIIL() != null) {
            c20697415yu.LLILLJJLI.getHierarchy().LJIJI(0);
            c20697415yu.LLILLJJLI.getHierarchy().LJJIFFI((Drawable) c15o7.LJIIL(), InterfaceC1320380kSq.LJI);
            c20697415yu.LLILZIL = true;
        }
        C1C7U.LIZIZ("UserQRCodeCardViewV2@5a5a.setData$2L");
        return null;
    }

    public static final Object then$9(C19335310kh c19335310kh, C15O7 c15o7) {
        C1C7U.LIZ("PendantLottieResource@ccd6.loadResource$2");
        if (((Boolean) c15o7.LJIIL()).booleanValue()) {
            C1911970zr1 c1911970zr1 = (C1911970zr1) c19335310kh.l0;
            c1911970zr1.LJIIIIZZ = false;
            Iterator it2 = ((ArrayList) c1911970zr1.LJII).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1912070zrB) it2.next()).onSuccess();
            }
            ((ArrayList) ((C1911970zr1) c19335310kh.l0).LJII).clear();
        } else {
            final C1911970zr1 c1911970zr12 = (C1911970zr1) c19335310kh.l0;
            InterfaceC1912070zrB interfaceC1912070zrB = new InterfaceC1912070zrB() { // from class: X.0zr8
                @Override // X.InterfaceC1912070zrB
                public final void onFail() {
                    C1911970zr1 c1911970zr13 = c1911970zr12;
                    c1911970zr13.LJIIIIZZ = false;
                    synchronized (c1911970zr13.LJIIIZ) {
                        try {
                            Iterator<InterfaceC1912070zrB> it3 = c1911970zr13.LJII.iterator();
                            while (it3.hasNext()) {
                                it3.next().onFail();
                            }
                            ((ArrayList) c1911970zr13.LJII).clear();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // X.InterfaceC1912070zrB
                public final void onSuccess() {
                    C1911970zr1 c1911970zr13 = c1911970zr12;
                    c1911970zr13.LJIIIIZZ = false;
                    synchronized (c1911970zr13.LJIIIZ) {
                        try {
                            Iterator<InterfaceC1912070zrB> it3 = c1911970zr13.LJII.iterator();
                            while (it3.hasNext()) {
                                it3.next().onSuccess();
                            }
                            ((ArrayList) c1911970zr13.LJII).clear();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            };
            final C1911980zr2 c1911980zr2 = c1911970zr12.LJFF;
            if (c1911980zr2 != null) {
                C11NZ.LJIJJLI(new C19336110kp(c1911980zr2, 3)).LJJLIIIJL(Long.MAX_VALUE, new InterfaceC19483011Ki<Throwable>() { // from class: X.0zr9
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Throwable th) {
                        C1911980zr2 c1911980zr22 = c1911980zr2;
                        if (c1911980zr22.LIZLLL >= c1911980zr22.LIZIZ.size() - 1) {
                            return false;
                        }
                        c1911980zr2.LIZLLL++;
                        return true;
                    }
                }).LJJJ(new AkS468S0100000_3(c1911980zr2, 18), false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336510kt(interfaceC1912070zrB, 6));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PendantLottieResource@ccd6.loadResource$2");
        return unit;
    }

    public C19335310kh(C1904260zea c1904260zea, String str, int i) {
        this.$t = i;
        this.l0 = c1904260zea;
    }

    public C19335310kh(C1911970zr1 c1911970zr1, Context context, int i) {
        this.$t = i;
        this.l0 = c1911970zr1;
    }
}
