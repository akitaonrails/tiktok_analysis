package X;

import Y.AComparatorS33S0000000_14;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1Bcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208891Bcl extends AbstractC1446660nkW implements InterfaceC1435360nSI {
    public static final Object LJIILJJIL = new Object();
    public static final AtomicBoolean LJIILL = new AtomicBoolean(false);
    public AnonymousClass0956 LJ;
    public final C054G LJFF;
    public C1434910nRZ LJI;
    public C1431990nMr LJII;
    public C1434970nRf LJIIIIZZ;
    public C1434960nRe LJIIIZ;
    public volatile PublishStuckEventTrackingLocalBean LJIIJ;
    public volatile int LJIIJJI;
    public volatile long LJIIL;
    public volatile ConcurrentHashMap<Object, Boolean> LJIILIIL;

    public final synchronized PublishStuckEventTrackingLocalBean LJIIJ() {
        PublishStuckEventTrackingLocalBean publishStuckEventTrackingLocalBeanLJIIIZ;
        String strValueOf;
        VideoPublishEditModel videoPublishEditModel;
        publishStuckEventTrackingLocalBeanLJIIIZ = this.LJIIJ;
        if (publishStuckEventTrackingLocalBeanLJIIIZ == null) {
            Keva repo = Keva.getRepo("publish_stuck_event_tracking_plus_repo");
            C1434960nRe c1434960nRe = this.LJIIIZ;
            if (c1434960nRe == null || (videoPublishEditModel = c1434960nRe.LIZ) == null || (strValueOf = videoPublishEditModel.getCreationId()) == null) {
                strValueOf = String.valueOf(System.currentTimeMillis());
            }
            String string = repo.getString(strValueOf, null);
            if (string == null || (publishStuckEventTrackingLocalBeanLJIIIZ = LJIIJJI(string)) == null) {
                publishStuckEventTrackingLocalBeanLJIIIZ = LJIIIZ();
            }
        }
        ArrayList<PublishStuckEventTrackingLocalBean.ProgressBean> arrayList = publishStuckEventTrackingLocalBeanLJIIIZ.progressList;
        if (arrayList != null && arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS33S0000000_14(7));
        }
        this.LJIIJ = publishStuckEventTrackingLocalBeanLJIIIZ;
        return publishStuckEventTrackingLocalBeanLJIIIZ;
    }

    public C2208891Bcl() {
        super(2, "DefaultWavePublisher");
        this.LJFF = C2296808zG.LIZ(C0PEM.LIZ);
        this.LJIIL = System.currentTimeMillis();
        this.LJIILIIL = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109 A[PHI: r1
      0x0109: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:78:0x0105, B:44:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2208891Bcl.LJIIIZ():com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean");
    }

    public final void LJIILJJIL() {
        if (!EnableParallelPublishSchedulerV2Exp.LIZ().enable) {
            LJIILL(this);
            return;
        }
        synchronized (LJIILJJIL) {
            try {
                LJIILL(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int LJII(PublishStuckEventTrackingLocalBean.ProgressBean progressBean) {
        Long l;
        if (progressBean != null && (l = progressBean.startTime) != null && progressBean.endTime != null) {
            return (int) C13LZ.LJFF(C19990113Jj.LJIJI(C19990313Jl.LJIIIIZZ(progressBean.endTime.longValue() - l.longValue(), EnumC19990213Jk.MILLISECONDS), EnumC19990213Jk.SECONDS), -2147483648L, 2147483647L);
        }
        return -1;
    }

    public static void LJIIIIZZ(String str) {
        Object c098200Yq;
        try {
            Keva.getRepo("publish_stuck_event_tracking_plus_repo").erase(str);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "PublishStuckEventTrackingMonitor", "clear key not in repo");
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }

    public static PublishStuckEventTrackingLocalBean LJIIJJI(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (PublishStuckEventTrackingLocalBean) C09C2.LIZ().LJII(str, PublishStuckEventTrackingLocalBean.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (PublishStuckEventTrackingLocalBean) c098200Yq;
    }

    public static void LJIIL(C2208891Bcl c2208891Bcl) {
        String strValueOf;
        VideoPublishEditModel videoPublishEditModel;
        C1434960nRe c1434960nRe = c2208891Bcl.LJIIIZ;
        if (c1434960nRe == null || (videoPublishEditModel = c1434960nRe.LIZ) == null || (strValueOf = videoPublishEditModel.getCreationId()) == null) {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        c2208891Bcl.getClass();
        LJIIIIZZ(strValueOf);
        C1434910nRZ c1434910nRZ = c2208891Bcl.LJI;
        if (c1434910nRZ != null) {
            c1434910nRZ.LIZ.remove(c2208891Bcl);
        }
    }

    public static final void LJIILL(C2208891Bcl c2208891Bcl) {
        c2208891Bcl.getClass();
        Keva repo = Keva.getRepo("publish_stuck_event_tracking_plus_repo");
        if (repo.count() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : repo.getAllKey()) {
            PublishStuckEventTrackingLocalBean publishStuckEventTrackingLocalBeanLJIIJJI = LJIIJJI(repo.getString(str, "{}"));
            if (publishStuckEventTrackingLocalBeanLJIIJJI != null) {
                arrayList.add(publishStuckEventTrackingLocalBeanLJIIJJI);
                LJIIIIZZ(str);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c2208891Bcl.LJIILLIIL(new AbstractC862160Xry() { // from class: X.0Xs2
            }, (PublishStuckEventTrackingLocalBean) it2.next());
        }
    }

    public final Object LJIILIIL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishStuckEventTrackingMonitor", "stopLoop");
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            Object objLIZLLL = C23118094a.LIZLLL(anonymousClass0956, interfaceC1364105Vn);
            if (objLIZLLL == C099R.LJFF()) {
                return objLIZLLL;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        super.onEvent(abstractC556190Lrd);
        if (abstractC556190Lrd instanceof C556240Lri) {
            this.LJIILIIL.put(abstractC556190Lrd.LIZ, Boolean.TRUE);
        } else {
            if (!(abstractC556190Lrd instanceof C556220Lrg) && !(abstractC556190Lrd instanceof C556230Lrh) && !(abstractC556190Lrd instanceof C556250Lrj)) {
                return;
            }
            this.LJIILIIL.remove(abstractC556190Lrd.LIZ);
        }
    }

    @Override // X.InterfaceC1435360nSI
    public final void onProgressChanged(int i) {
        if (i == this.LJIIJJI) {
            return;
        }
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgressChanged progress: ");
        sbLIZ.append(i);
        C201955140j.LIZLLL(c830690WiJ, "PublishStuckEventTrackingMonitor", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJJI = i;
        this.LJIIL = System.currentTimeMillis();
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        Object obj2;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishStuckEventTrackingMonitor", "onStart");
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            obj2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1434910nRZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof C1434910nRZ)) {
            next = null;
        }
        this.LJI = (C1434910nRZ) next;
        Iterator<Object> it3 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (next2 instanceof C1431990nMr) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        if (!(next2 instanceof C1431990nMr)) {
            next2 = null;
        }
        this.LJII = (C1431990nMr) next2;
        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it4.hasNext()) {
                next3 = it4.next();
                if (next3 instanceof C1434970nRf) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        if (!(next3 instanceof C1434970nRf)) {
            next3 = null;
        }
        this.LJIIIIZZ = (C1434970nRf) next3;
        C1434910nRZ c1434910nRZ = this.LJI;
        if (c1434910nRZ != null) {
            c1434910nRZ.LIZ.add(this);
        }
        Iterator<Object> it5 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it5.hasNext()) {
                next4 = it5.next();
                if (next4 instanceof C1434960nRe) {
                    break;
                }
            } else {
                next4 = null;
                break;
            }
        }
        if (!(next4 instanceof C1434960nRe)) {
            next4 = null;
        }
        this.LJIIIZ = (C1434960nRe) next4;
        if (!((Boolean) C266640Acg.LIZ.getValue()).booleanValue() || LJIILL.compareAndSet(false, true)) {
            LJIILJJIL();
        }
        Iterator<Object> it6 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it6.hasNext()) {
                next5 = it6.next();
                if (next5 instanceof C1405220mfg) {
                    break;
                }
            } else {
                next5 = null;
                break;
            }
        }
        if (next5 instanceof C1405220mfg) {
            obj2 = next5;
        }
        C1405220mfg c1405220mfg = (C1405220mfg) obj2;
        if (c1405220mfg != null) {
            c1405220mfg.LIZJ(new AwS613S0100000_34(this, 52));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean$ProgressBean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean$ProgressBean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean$ProgressBean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.ss.android.ugc.aweme.wavepublish.monitor.mob.PublishStuckEventTrackingLocalBean$ProgressBean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final void LJIILLIIL(AbstractC862160Xry abstractC862160Xry, PublishStuckEventTrackingLocalBean publishStuckEventTrackingLocalBean) {
        boolean z;
        int iIntValue;
        ArrayList<PublishStuckEventTrackingLocalBean.ProgressBean> arrayList = publishStuckEventTrackingLocalBean.progressList;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bean.progressList=");
            sbLIZ.append(publishStuckEventTrackingLocalBean.progressList);
            sbLIZ.append(", stuckType == ");
            sbLIZ.append(abstractC862160Xry);
            C201955140j.LIZLLL(c830690WiJ, "PublishStuckEventTrackingMonitor", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C259800zU c259800zU = new C259800zU();
        ArrayList<??> arrayList2 = new ArrayList(publishStuckEventTrackingLocalBean.progressList);
        ?? r9 = 0;
        int i = 0;
        int i2 = 0;
        ?? r7 = 0;
        int i3 = 0;
        ?? r8 = 0;
        for (?? r1 : arrayList2) {
            int iLJII = LJII(r1);
            Integer num = publishStuckEventTrackingLocalBean.circleTime;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = ((Number) C280390Ayr.LIZ.getValue()).intValue();
            }
            if (iLJII > 0 && iLJII <= 100000) {
                if (iLJII < iIntValue) {
                    C830690WiJ c830690WiJ2 = C830690WiJ.LIZIZ;
                    ?? LIZ = C2188811AlT.LIZ();
                    LIZ.append("no stuck duration: curDurationTime = ");
                    LIZ.append(iLJII);
                    LIZ.append(", circleTime = ");
                    LIZ.append(iIntValue);
                    LIZ.append(", bean = ");
                    LIZ.append(r1);
                    C201955140j.LIZLLL(c830690WiJ2, "PublishStuckEventTrackingMonitor", C2188811AlT.LIZIZ(LIZ));
                    r7 = r7;
                    r9 = r9;
                } else {
                    i2 += iLJII;
                    ?? r72 = r7;
                    if (r7 == 0) {
                        r72 = r1;
                    }
                    if (iLJII > i3) {
                        r9 = r1;
                        i3 = iLJII;
                    }
                    c259800zU.element = r1;
                    i++;
                    r7 = r72;
                    r9 = r9;
                }
                r8 = r1;
            } else {
                ?? LIZ2 = C2188811AlT.LIZ();
                LIZ2.append("[PublishStuckEventTrackingMonitor]mistake duration = ");
                LIZ2.append(r1);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(LIZ2));
                C830690WiJ c830690WiJ3 = C830690WiJ.LIZIZ;
                ?? LIZ3 = C2188811AlT.LIZ();
                LIZ3.append("mistake duration = ");
                LIZ3.append(r1);
                C201955140j.LIZLLL(c830690WiJ3, "PublishStuckEventTrackingMonitor", C2188811AlT.LIZIZ(LIZ3));
            }
        }
        if (i <= 0) {
            C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishStuckEventTrackingMonitor", "no stuck return");
            return;
        }
        Long l = ((PublishStuckEventTrackingLocalBean.ProgressBean) C13LP.LJJJJZI(arrayList2)).startTime;
        Long l2 = ((PublishStuckEventTrackingLocalBean.ProgressBean) C13LP.LJJLIIIJJI(arrayList2)).endTime;
        if (l != null && l2 != null) {
            int iLJFF = (int) C13LZ.LJFF(C19990113Jj.LJIJI(C19990313Jl.LJIIIIZZ(l2.longValue() - l.longValue(), EnumC19990213Jk.MILLISECONDS), EnumC19990213Jk.SECONDS), -2147483648L, 2147483647L);
            if (iLJFF == 0) {
                C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishStuckEventTrackingMonitor", "totalPollDuration is zero");
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("creation_id", publishStuckEventTrackingLocalBean.creationId);
            c2344009Gk.LJFF("content_type", publishStuckEventTrackingLocalBean.contentType);
            c2344009Gk.LJ(publishStuckEventTrackingLocalBean.isStory, "is_story");
            c2344009Gk.LJ(publishStuckEventTrackingLocalBean.isRetry, "is_retry");
            c2344009Gk.LIZJ(abstractC862160Xry.LIZ, "stuck_type");
            c2344009Gk.LJ(publishStuckEventTrackingLocalBean.netType, "net_type");
            c2344009Gk.LJ(publishStuckEventTrackingLocalBean.sourceDuration, "source_duration");
            c2344009Gk.LIZJ(i, "stuck_progress_count");
            c2344009Gk.LIZJ(iLJFF, "total_poll_duration");
            c2344009Gk.LIZJ(i2, "total_stuck_duration");
            c2344009Gk.LIZJ((int) ((i2 / iLJFF) * 100), "stuck_ratio");
            c2344009Gk.LJFF("shoot_way", publishStuckEventTrackingLocalBean.shootWay);
            c2344009Gk.LJFF("content_source", publishStuckEventTrackingLocalBean.contentSource);
            c2344009Gk.LJ(publishStuckEventTrackingLocalBean.multiPhotoType, "multi_photo_type");
            if (C299860BpA.LIZ() && publishStuckEventTrackingLocalBean.uploaderStuckInfo.length() > 0) {
                c2344009Gk.LJFF("uploader_context", publishStuckEventTrackingLocalBean.uploaderStuckInfo);
            }
            if (C0BXJ.LIZ() && publishStuckEventTrackingLocalBean.compileStuckInfo.length() > 0) {
                c2344009Gk.LJFF("compile_context", publishStuckEventTrackingLocalBean.compileStuckInfo);
            }
            LJI(c2344009Gk, r7, new AbstractC2208901Bcm() { // from class: X.1Bcr
            });
            LJI(c2344009Gk, (PublishStuckEventTrackingLocalBean.ProgressBean) c259800zU.element, new AbstractC2208901Bcm() { // from class: X.1Bcs
            });
            LJI(c2344009Gk, r9, new AbstractC2208901Bcm() { // from class: X.1Bct
            });
            LJI(c2344009Gk, r8, new AbstractC2208901Bcm() { // from class: X.1Bcu
                public static final String LJFF = "max_poll_progress";
                public static final String LJI = "max_poll_progress_duration";

                @Override // X.AbstractC2208901Bcm
                public final String LIZ() {
                    return LJI;
                }

                @Override // X.AbstractC2208901Bcm
                public final String LIZIZ() {
                    return LJFF;
                }
            });
            C20684815ws.LJIILLIIL("publish_stuck", c2344009Gk.LIZ);
            if (C523670KgH.LIZ() && ((Boolean) C266630Acf.LIZ.getValue()).booleanValue()) {
                C23250099c.LIZLLL(this.LJFF, C0PEM.LIZJ, null, new C862120Xru(c259800zU, this, null), 2);
                return;
            }
            return;
        }
        C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishStuckEventTrackingMonitor", "startTime or endTime is null, please check code");
    }

    public static void LJI(C2344009Gk c2344009Gk, PublishStuckEventTrackingLocalBean.ProgressBean progressBean, AbstractC2208901Bcm abstractC2208901Bcm) {
        int iIntValue;
        String strLJJLIIIJ;
        int iIntValue2;
        Integer num;
        List<Object> list;
        Integer num2;
        String strLIZIZ = abstractC2208901Bcm.LIZIZ();
        int iLJII = -1;
        if (progressBean != null && (num2 = progressBean.progress) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = -1;
        }
        c2344009Gk.LIZJ(iIntValue, strLIZIZ);
        String strLIZ = abstractC2208901Bcm.LIZ();
        if (progressBean != null) {
            iLJII = LJII(progressBean);
        }
        c2344009Gk.LIZJ(iLJII, strLIZ);
        String str = abstractC2208901Bcm.LIZJ;
        if (progressBean == null || (list = progressBean.runningNodes) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "empty";
        }
        c2344009Gk.LJFF(str, strLJJLIIIJ);
        String str2 = abstractC2208901Bcm.LIZLLL;
        if (progressBean != null && (num = progressBean.netLevel) != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = -2;
        }
        c2344009Gk.LIZJ(iIntValue2, str2);
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C862150Xrx(this, null), 3);
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C862170Xrz(this, null), 3);
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C862130Xrv(this, null), 3);
    }
}
