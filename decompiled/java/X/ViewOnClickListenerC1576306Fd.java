package X;

import Y.ARunnableS8S1200000_2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import avg.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.06Fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC1576306Fd implements InterfaceC899120ZPa, C06F6, View.OnClickListener {
    public final Context LL;
    public final EnumC1578206Fw LLILLJJLI;
    public final Function1<View, Unit> LLILLL;
    public volatile String LLILZ;
    public volatile Function1<? super Boolean, Unit> LLILZIL;
    public volatile int LLILZLL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile String LLJ;
    public volatile C1590506Kp LLJI;

    public final C1590506Kp LJ() {
        synchronized (this) {
            try {
                C1590506Kp c1590506Kp = this.LLJI;
                if (c1590506Kp != null) {
                    return c1590506Kp;
                }
                C1590506Kp c1590506Kp2 = new C1590506Kp(this.LL);
                if (this.LLILLJJLI == EnumC1578206Fw.CHAT_PAGE) {
                    a aVar = new a(C1848410yCV.LIZ ? new f(this) : this);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(c1590506Kp2);
                    }
                    c1590506Kp2.setOnClickListener(aVar);
                }
                Function1<View, Unit> function1 = this.LLILLL;
                if (function1 != null) {
                    function1.invoke(c1590506Kp2);
                }
                this.LLJI = c1590506Kp2;
                if (this.LLIZLLLIL) {
                    c1590506Kp2.LLJIJIL = true;
                    c1590506Kp2.LIZLLL(c1590506Kp2.LLIZ);
                }
                return c1590506Kp2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC899120ZPa
    public final void LIZ() {
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakHandler: unbind: bondId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", this=");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIIZ(null, false);
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = 0;
    }

    public final void LJFF() {
        C1590506Kp c1590506Kp = this.LLJI;
        if (c1590506Kp != null) {
            c1590506Kp.LLJIJIL = true;
            c1590506Kp.LIZLLL(c1590506Kp.LLIZ);
        }
        this.LLIZLLLIL = true;
    }

    public final C06H2 LJI() {
        switch (C1578106Fv.LIZIZ[this.LLILLJJLI.ordinal()]) {
            case 1:
                return C06H2.INBOX;
            case 2:
                return C06H2.SHARE_PANEL;
            case 3:
            case 4:
                return C06H2.INNER_PUSH;
            case 5:
                return C06H2.CHAT;
            case 6:
                return C06H2.FRIENDS;
            case 7:
                return C06H2.STORY;
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC899120ZPa
    public final C1590506Kp LIZJ() {
        return LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.im.streak.api.StreakData r13) {
        /*
            r12 = this;
            X.06Kp r0 = r12.LLJI
            r9 = 1
            if (r0 == 0) goto L5e
            boolean r2 = r0.LLJI
        L7:
            X.06Kp r3 = r12.LLJI
            r4 = 0
            if (r3 == 0) goto L1d
            X.06Gb r4 = X.EnumC1578706Gb.GONE
            if (r13 != 0) goto L11
            r9 = 0
        L11:
            boolean r10 = r12.LLIZ
            r11 = 30
            r5 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            boolean r4 = X.C1590506Kp.LJ(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L1d:
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r1 = r12.LLILZIL
            if (r1 == 0) goto L26
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.invoke(r0)
        L26:
            if (r13 == 0) goto L41
            if (r4 != 0) goto L36
            if (r2 != 0) goto L36
            java.lang.String r1 = r12.LLJ
            java.lang.String r0 = r12.LLILZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L43
        L36:
            X.06Bk r3 = X.C1566606Bk.LIZ
            X.06Fw r2 = r12.LLILLJJLI
            java.lang.String r1 = r12.LLILZ
            X.06Gb r0 = X.EnumC1578706Gb.GONE
            r3.LJI(r2, r1, r13, r0)
        L41:
            if (r4 != 0) goto L4d
        L43:
            java.lang.String r1 = r12.LLJ
            java.lang.String r0 = r12.LLILZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L5d
        L4d:
            java.lang.String r0 = r12.LLILZ
            r12.LLJ = r0
            X.06FF r1 = X.C06FF.LL
            X.06H2 r0 = r12.LJI()
            r1.getClass()
            X.C06FF.LIZ(r0)
        L5d:
            return
        L5e:
            r2 = 1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1576306Fd.LJIIIIZZ(com.ss.android.ugc.aweme.im.streak.api.StreakData):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activityLIZ;
        if (C0OBG.LIZIZ(view) || view == null || (activityLIZ = C1388190mED.LIZ(view.getContext())) == null) {
            return;
        }
        C1576506Ff c1576506Ff = C1576506Ff.LIZIZ;
        C06G9 c06g9 = C06G9.STREAK_BADGE;
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        C06ET c06et = C06ET.LIZLLL;
        C1576706Fh c1576706Fh = new C1576706Fh(null, C06GA.STREAK.getValue(), C06H2.CHAT, null, null, null, null, null, 1017);
        c1576506Ff.getClass();
        C1576506Ff.LIZ(activityLIZ, c06g9, str, c06et, c1576706Fh);
    }

    public final void LJIIIZ(StreakData streakData, boolean z) {
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        String str;
        if (streakData == null || (enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, false)) == null) {
            enumC1579606GkLJIIIIZZ = EnumC1579606Gk.INVALID;
        }
        boolean z2 = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakHandler: updateStreakView: update to status ");
        sbLIZ.append(enumC1579606GkLJIIIIZZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", convId=");
        if (streakData != null) {
            str = streakData.convId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", this=");
        sbLIZ.append(hashCode());
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        int i = C1578106Fv.LIZ[enumC1579606GkLJIIIIZZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    LJIIIIZZ(streakData);
                } else {
                    throw new C1954807lC();
                }
            } else if (streakData != null) {
                LJII(streakData, true, z);
            }
        } else if (streakData != null) {
            LJII(streakData, false, z);
        }
        this.LLJ = this.LLILZ;
    }

    @Override // X.C06F6
    public final void r80(StreakData streakData, String str) {
        C06GI next;
        if (!Intrinsics.LJFF(this.LLILZ, str)) {
            return;
        }
        if (this.LLILLJJLI == EnumC1578206Fw.CHAT_PAGE) {
            C1576206Fc c1576206FcLIZ = C1572506Dr.LIZ();
            synchronized (c1576206FcLIZ.LIZJ) {
                try {
                    Iterator<C06GI> it2 = c1576206FcLIZ.LIZLLL.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            C06GI c06gi = next;
                            if (Intrinsics.LJFF(c06gi.LIZ, str) && C1572306Dp.LIZ(c06gi.LIZJ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C06GI c06gi2 = next;
                    if (c06gi2 != null) {
                        c06gi2.LIZIZ = streakData.copy(streakData.convType, streakData.convId, streakData.serverMsgId, streakData.timeZoneId, streakData.activeStart, streakData.activeBefore, streakData.endAt, streakData.remindAt, streakData.streak, streakData.userStreak, streakData.restoreAvailableTime, streakData.remainRestoreCnt, streakData.totalRestoreCntThisWindow, streakData.cmdType, streakData.level, streakData.dayBeginArray, streakData.createTime, streakData.logId, streakData.uuid, streakData.version, streakData.source, streakData.msgScene);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C2485509ob.LIZIZ(new ARunnableS8S1200000_2(str, this, streakData, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC1576306Fd(Context context, EnumC1578206Fw enumC1578206Fw, Function1<? super View, Unit> function1) {
        this.LL = context;
        this.LLILLJJLI = enumC1578206Fw;
        this.LLILLL = function1;
        InterfaceC1564806As.LIZIZ.getClass();
        C1575806Ey.LIZJ.getClass();
        C1575806Ey.LIZ(this);
        if (!C1565106Av.LIZIZ) {
            LJ();
        }
    }

    public final void LJII(StreakData streakData, boolean z, boolean z2) {
        EnumC1578706Gb enumC1578706Gb;
        boolean z3;
        boolean z4;
        boolean z5;
        C1590506Kp c1590506KpLJ = LJ();
        InterfaceC1564806As.LIZIZ.getClass();
        C1575806Ey.LIZJ.getClass();
        C1575106Er c1575106Er = C1575806Ey.LJ;
        c1575106Er.getClass();
        C06FO c06fo = C06FO.LIZ;
        c06fo.getClass();
        long jLIZ = C06FO.LIZ(streakData);
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = (jLIZ * j) + 1;
        c06fo.getClass();
        long j3 = (streakData.remindAt * j) + 1;
        synchronized (c1575106Er.LLILLJJLI) {
            try {
                c1575106Er.LIZ(j2, 1, streakData);
                if (streakData.convType == AbstractC1711506n3.LIZIZ) {
                    c1575106Er.LIZ(j3, 2, streakData);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            enumC1578706Gb = EnumC1578706Gb.GREY;
        } else {
            enumC1578706Gb = EnumC1578706Gb.ORANGE;
        }
        int iLJII = C1567806Bw.LJII(streakData);
        int i = streakData.streak;
        if (this.LLILZLL == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && C13LQ.LJJIJIIJI(this.LLILLJJLI, new EnumC1578206Fw[]{EnumC1578206Fw.CHAT_PAGE}) >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean zLJ = C1590506Kp.LJ(c1590506KpLJ, enumC1578706Gb, iLJII, i, z3, z4, false, this.LLIZ, 32);
        Function1<? super Boolean, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        if (zLJ || !Intrinsics.LJFF(this.LLJ, this.LLILZ)) {
            C1566606Bk.LIZ.LJI(this.LLILLJJLI, this.LLILZ, streakData, enumC1578706Gb);
            C06FF c06ff = C06FF.LL;
            String str = this.LLILZ;
            if (str == null) {
                str = "";
            }
            C06H2 c06h2LJI = LJI();
            if (C13LQ.LJJIJIIJI(this.LLILLJJLI, new EnumC1578206Fw[]{EnumC1578206Fw.DM_IN_APP_PUSH, EnumC1578206Fw.NOTICE_IN_APP_PUSH}) >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            C06FF.LIZLLL(c06ff, str, streakData, z, c06h2LJI, z5);
        }
    }

    @Override // X.InterfaceC899120ZPa
    public final void LIZIZ(int i, String str, Function1 function1, boolean z) throws Throwable {
        LIZLLL(i, C0YNP.LJ(str), function1, z);
    }

    @Override // X.InterfaceC899120ZPa
    public final void LIZLLL(int i, String str, Function1 function1, boolean z) throws Throwable {
        this.LLILZ = str;
        this.LLILZIL = function1;
        this.LLILZLL = i;
        this.LLIZ = z;
        boolean z2 = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakHandler: bind: bondId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", this=");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1564806As.LIZIZ.getClass();
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJII = C1575806Ey.LJII(str);
        LJIIIZ(streakDataLJII, false);
        if (this.LLILLJJLI == EnumC1578206Fw.CHAT_PAGE) {
            C1576206Fc c1576206FcLIZ = C1572506Dr.LIZ();
            synchronized (c1576206FcLIZ.LIZJ) {
                try {
                    try {
                        Iterator<C06GI> it2 = c1576206FcLIZ.LIZLLL.iterator();
                        int i2 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                C06GI next = it2.next();
                                if (Intrinsics.LJFF(next.LIZ, str) && C1572306Dp.LIZ(next.LIZJ)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        StreakData streakDataCopy = null;
                        if (i2 != -1) {
                            C06GI c06giRemove = c1576206FcLIZ.LIZLLL.remove(i2);
                            LinkedList<C06GI> linkedList = c1576206FcLIZ.LIZLLL;
                            if (streakDataLJII != null) {
                                streakDataCopy = streakDataLJII.copy(streakDataLJII.convType, streakDataLJII.convId, streakDataLJII.serverMsgId, streakDataLJII.timeZoneId, streakDataLJII.activeStart, streakDataLJII.activeBefore, streakDataLJII.endAt, streakDataLJII.remindAt, streakDataLJII.streak, streakDataLJII.userStreak, streakDataLJII.restoreAvailableTime, streakDataLJII.remainRestoreCnt, streakDataLJII.totalRestoreCntThisWindow, streakDataLJII.cmdType, streakDataLJII.level, streakDataLJII.dayBeginArray, streakDataLJII.createTime, streakDataLJII.logId, streakDataLJII.uuid, streakDataLJII.version, streakDataLJII.source, streakDataLJII.msgScene);
                            }
                            c06giRemove.LIZIZ = streakDataCopy;
                            linkedList.offer(c06giRemove);
                        } else {
                            if (c1576206FcLIZ.LIZLLL.size() >= c1576206FcLIZ.LIZIZ) {
                                c1576206FcLIZ.LIZLLL.poll();
                            }
                            LinkedList<C06GI> linkedList2 = c1576206FcLIZ.LIZLLL;
                            if (streakDataLJII != null) {
                                streakDataCopy = streakDataLJII.copy(streakDataLJII.convType, streakDataLJII.convId, streakDataLJII.serverMsgId, streakDataLJII.timeZoneId, streakDataLJII.activeStart, streakDataLJII.activeBefore, streakDataLJII.endAt, streakDataLJII.remindAt, streakDataLJII.streak, streakDataLJII.userStreak, streakDataLJII.restoreAvailableTime, streakDataLJII.remainRestoreCnt, streakDataLJII.totalRestoreCntThisWindow, streakDataLJII.cmdType, streakDataLJII.level, streakDataLJII.dayBeginArray, streakDataLJII.createTime, streakDataLJII.logId, streakDataLJII.uuid, streakDataLJII.version, streakDataLJII.source, streakDataLJII.msgScene);
                            }
                            String curUserId = c1576206FcLIZ.LIZ.getCurUserId();
                            if (curUserId == null) {
                                curUserId = "";
                            }
                            linkedList2.offer(new C06GI(streakDataCopy, str, curUserId));
                        }
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }
}
