package X;

import Y.AComparatorS36S0000000_17;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.publicscreen.BadgeCacheOptimizeEnableSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fpm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142400fpm {
    public static final AtomicLong LJJIIZI = new AtomicLong(0);
    public final long LIZ;
    public volatile long LIZIZ;
    public volatile AnonymousClass0956 LIZLLL;
    public volatile long LJIILIIL;
    public volatile List<BadgeStruct> LJIILJJIL;
    public volatile long LJIILL;
    public volatile long LJIILLIIL;
    public volatile boolean LJIJ;
    public volatile boolean LJIJI;
    public final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    public final Object LJ = new Object();
    public final long LJFF = System.currentTimeMillis();
    public final ConcurrentHashMap<String, C1142430fpp> LJI = new ConcurrentHashMap<>();
    public final ReentrantReadWriteLock LJII = new ReentrantReadWriteLock();
    public final ConcurrentHashMap<Long, Set<String>> LJIIIIZZ = new ConcurrentHashMap<>();
    public final Set<Long> LJIIIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentHashMap<Long, Long> LJIIJ = new ConcurrentHashMap<>();
    public final Object LJIIJJI = new Object();
    public final ConcurrentHashMap<String, C1142430fpp> LJIIL = new ConcurrentHashMap<>();
    public final Object LJIIZILJ = new Object();
    public final Set<String> LJIJJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicLong LJIJJLI = new AtomicLong(0);
    public final AtomicLong LJIL = new AtomicLong(0);
    public final AtomicLong LJJ = new AtomicLong(0);
    public final AtomicLong LJJI = new AtomicLong(0);
    public final AtomicLong LJJIFFI = new AtomicLong(0);
    public final AtomicLong LJJII = new AtomicLong(0);
    public final AtomicLong LJJIII = new AtomicLong(0);
    public final AtomicLong LJJIIJ = new AtomicLong(0);
    public final AtomicLong LJJIIJZLJL = new AtomicLong(0);
    public final AtomicInteger LJJIIZ = new AtomicInteger(0);

    public final int LJIIIZ() {
        ConcurrentHashMap concurrentHashMap;
        Integer num;
        int iIntValue = 0;
        try {
            long j = this.LIZ;
            if (j != 0 && (concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.LLILZ.gg0(C1148010fyp.class)) != null && (num = (Integer) concurrentHashMap.get(Long.valueOf(j))) != null) {
                iIntValue = num.intValue();
                return iIntValue;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iIntValue;
    }

    public final void LJ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            synchronized (this.LJ) {
                try {
                    if (this.LJIJI) {
                        return;
                    }
                    AnonymousClass0956 anonymousClass09562 = this.LIZLLL;
                    if (anonymousClass09562 == null || !anonymousClass09562.isActive()) {
                        this.LIZLLL = C23250099c.LIZLLL(this.LIZJ, null, null, new C1142420fpo(this, null), 3);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIILJJIL() {
        if (this.LJIJI) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LJIJI) {
                    return;
                }
                this.LJIJI = true;
                this.LJIJJ.clear();
                synchronized (this.LJ) {
                    try {
                        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        this.LIZLLL = null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C23250099c.LIZLLL(this.LIZJ, null, null, new C1142410fpn(this, new C1142440fpq(this.LJI.size(), this.LJIJJLI.get(), this.LJIL.get(), this.LJJ.get(), this.LJI.size(), this.LJJIFFI.get(), this.LJJII.get(), this.LJIIL.size(), this.LJJIIJ.get(), this.LJJIIJZLJL.get(), this.LJJIIZ.get(), System.currentTimeMillis() - this.LJFF, BadgeCacheOptimizeEnableSetting.isEnabled(), this.LJJI.get(), this.LJJIII.get()), null), 3).LJII(new AwS596S0100000_17(this, 623));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LJIJJ() {
        int size = this.LJI.size() + this.LJIIL.size();
        int i = this.LJJIIZ.get();
        while (size > i && !this.LJJIIZ.compareAndSet(i, size)) {
            i = this.LJJIIZ.get();
        }
    }

    public final void LJFF() {
        int maxCacheSize;
        try {
            maxCacheSize = BadgeCacheOptimizeEnableSetting.getMaxCacheSize();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            maxCacheSize = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        if (this.LJI.size() >= maxCacheSize) {
            int i = maxCacheSize / 10;
            if (i < 1) {
                i = 1;
            } else if (i > 128) {
                i = 128;
            }
            int size = this.LJI.size();
            if (i > size) {
                i = size;
                if (size <= 0) {
                    return;
                }
            }
            PriorityQueue<Pair> priorityQueue = new PriorityQueue(i, new AComparatorS36S0000000_17(28));
            for (Map.Entry<String, C1142430fpp> entry : this.LJI.entrySet()) {
                String key = entry.getKey();
                C1142430fpp value = entry.getValue();
                if (!value.LJFF) {
                    if (priorityQueue.size() < i) {
                        priorityQueue.offer(new Pair(key, value));
                    } else {
                        Pair pair = (Pair) priorityQueue.peek();
                        if (pair != null && value.LJ < ((C1142430fpp) pair.getSecond()).LJ) {
                            priorityQueue.poll();
                            priorityQueue.offer(new Pair(key, value));
                        }
                    }
                }
            }
            for (Pair pair2 : priorityQueue) {
                String str = (String) pair2.getFirst();
                C1142430fpp c1142430fpp = (C1142430fpp) pair2.getSecond();
                C1142430fpp c1142430fpp2 = this.LJI.get(str);
                if (c1142430fpp2 != null) {
                    c1142430fpp2.LJFF = true;
                }
                this.LJI.remove(str);
                LJIIJJI(c1142430fpp.LIZ, str);
                this.LJJ.incrementAndGet();
            }
        }
    }

    public static boolean LJIIL(long j) {
        long currentUserId;
        try {
            currentUserId = UserService.getInstance().user().getCurrentUserId();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            currentUserId = 0;
        }
        if (j == currentUserId) {
            return true;
        }
        return false;
    }

    public static Long LJIILIIL(AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY == null) {
            return null;
        }
        long messageId = abstractC1136060ffY.getMessageId();
        if (messageId > 0) {
            return Long.valueOf(messageId);
        }
        return Long.valueOf((((long) System.identityHashCode(abstractC1136060ffY)) - (-2147483648L)) - Long.MIN_VALUE);
    }

    public final void LIZJ(GiftMessage giftMessage) {
        Text text;
        if (giftMessage == null || this.LJIJI || !BadgeCacheOptimizeEnableSetting.isEnabled() || !LJIIZILJ(LJIIIZ())) {
            return;
        }
        Long lLJIILIIL = LJIILIIL(giftMessage);
        int iLIZLLL = LIZLLL(giftMessage.displayTextForAnchor, lLJIILIIL) + LIZLLL(giftMessage.displayTextForAudience, lLJIILIIL);
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData != null) {
            text = commonMessageData.displayText;
        } else {
            text = null;
        }
        int iLIZLLL2 = iLIZLLL + LIZLLL(text, lLJIILIIL) + LIZLLL(giftMessage.displayTextForSender, lLJIILIIL) + LIZLLL(giftMessage.trayDisplayText, lLJIILIIL);
        if (iLIZLLL2 > 0) {
            this.LJJI.addAndGet(iLIZLLL2);
        }
    }

    public final String LJI(long j) {
        Set<String> set;
        String str = null;
        if (j <= 0 || (set = this.LJIIIIZZ.get(Long.valueOf(j))) == null || set.isEmpty()) {
            return null;
        }
        ReentrantReadWriteLock.ReadLock lock = this.LJII.readLock();
        lock.lock();
        try {
            long j2 = Long.MIN_VALUE;
            for (String str2 : set) {
                C1142430fpp c1142430fpp = this.LJI.get(str2);
                if (c1142430fpp != null && !c1142430fpp.LJFF) {
                    long j3 = c1142430fpp.LIZLLL;
                    if (j3 > j2) {
                        str = str2;
                        j2 = j3;
                    }
                }
            }
            lock.unlock();
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final List<BadgeStruct> LJIIIIZZ(String str) {
        ReentrantReadWriteLock.ReadLock lock = this.LJII.readLock();
        lock.lock();
        try {
            C1142430fpp c1142430fpp = this.LJI.get(str);
            if (c1142430fpp != null && !c1142430fpp.LJFF) {
                c1142430fpp.LJ = System.currentTimeMillis();
                List<BadgeStruct> list = c1142430fpp.LIZJ;
                lock.unlock();
                return list;
            }
            lock.unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final boolean LJIILL(String str) {
        if (str != null && str.length() != 0) {
            synchronized (this) {
                try {
                    if (this.LJIJI) {
                        return true;
                    }
                    this.LJIJJ.remove(str);
                    if (!this.LJIJJ.isEmpty()) {
                        return false;
                    }
                    LJIILJJIL();
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJIILJJIL();
        return true;
    }

    public final boolean LJIILLIIL(String str) {
        if (str == null || str.length() == 0 || this.LJIJI) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.LJIJI) {
                    return false;
                }
                this.LJIJJ.add(str);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJIIZILJ(int i) {
        if (this.LJIJ) {
            return true;
        }
        if (i <= 0 || i < BadgeCacheOptimizeEnableSetting.getMemberCountThreshold()) {
            return false;
        }
        this.LJIJ = true;
        return true;
    }

    public C1142400fpm(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }

    public final String LIZ(User user, AbstractC1136060ffY abstractC1136060ffY) {
        boolean z;
        int readHoldCount;
        C1142430fpp c1142430fpp;
        if (this.LJIJI || !LJIIZILJ(LJIIIZ())) {
            return null;
        }
        long id = user.getId();
        List<BadgeStruct> badgeList = user.getBadgeList();
        boolean z2 = true;
        int i = 0;
        if (badgeList != null && !badgeList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String strLIZLLL = C1136820fgm.LIZLLL(id, badgeList);
        LJ();
        if (LJIIL(id)) {
            if (!BadgeCacheOptimizeEnableSetting.isSelfViewCacheEnabled()) {
                return null;
            }
            LIZIZ(id, badgeList);
            user.setBadgeList(null);
            this.LJJI.incrementAndGet();
            return strLIZLLL;
        }
        if (this.LIZIZ > 0 && id == this.LIZIZ) {
            LJIJI(user, badgeList);
            return strLIZLLL;
        }
        if (!BadgeCacheOptimizeEnableSetting.isOtherAudienceCacheEnabled() || LJIJ(id, LJIILIIL(abstractC1136060ffY))) {
            return null;
        }
        Set<String> set = this.LJIIIIZZ.get(Long.valueOf(id));
        if (set != null && !set.isEmpty()) {
            ReentrantReadWriteLock.ReadLock lock = this.LJII.readLock();
            lock.lock();
            try {
                for (String str : set) {
                    if (!Intrinsics.LJFF(str, strLIZLLL) && (c1142430fpp = this.LJI.get(str)) != null && !c1142430fpp.LJFF) {
                        lock.unlock();
                        break;
                    }
                }
                lock.unlock();
                z2 = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        } else {
            z2 = false;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.LJII;
        ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
        } else {
            readHoldCount = 0;
        }
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock2.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C1142430fpp c1142430fpp2 = this.LJI.get(strLIZLLL);
            if (c1142430fpp2 != null && !c1142430fpp2.LJFF) {
                c1142430fpp2.LJ = System.currentTimeMillis();
                this.LJIJJLI.incrementAndGet();
            } else {
                if (z2) {
                    this.LJJIIJ.incrementAndGet();
                }
                LJFF();
                this.LJI.put(strLIZLLL, new C1142430fpp(strLIZLLL, id, new ArrayList(badgeList)));
                LJIIJ(id, strLIZLLL);
                this.LJIL.incrementAndGet();
                LJIJJ();
            }
            while (i < readHoldCount) {
                lock2.lock();
                i++;
            }
            writeLock.unlock();
            user.setBadgeList(null);
            this.LJJI.incrementAndGet();
            return strLIZLLL;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            while (i < readHoldCount) {
                lock2.lock();
                i++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final String LIZIZ(long j, List<BadgeStruct> list) {
        String str = null;
        if (!BadgeCacheOptimizeEnableSetting.isSelfViewCacheEnabled() || list == null || list.isEmpty()) {
            return null;
        }
        String strLIZLLL = C1136820fgm.LIZLLL(j, list);
        C1142430fpp c1142430fpp = this.LJIIL.get(strLIZLLL);
        if (c1142430fpp != null && !c1142430fpp.LJFF) {
            c1142430fpp.LJ = System.currentTimeMillis();
            this.LJJIFFI.incrementAndGet();
            return strLIZLLL;
        }
        if (this.LJIIL.size() >= 32) {
            long j2 = Long.MAX_VALUE;
            for (Map.Entry<String, C1142430fpp> entry : this.LJIIL.entrySet()) {
                String key = entry.getKey();
                C1142430fpp value = entry.getValue();
                if (!value.LJFF && value.LJ < j2) {
                    j2 = value.LJ;
                    str = key;
                }
            }
            if (str != null) {
                C1142430fpp c1142430fpp2 = this.LJIIL.get(str);
                if (c1142430fpp2 != null) {
                    c1142430fpp2.LJFF = true;
                }
                this.LJIIL.remove(str);
            }
        }
        this.LJJII.incrementAndGet();
        this.LJIIL.put(strLIZLLL, new C1142430fpp(strLIZLLL, j, new ArrayList(list)));
        LJIJJ();
        return strLIZLLL;
    }

    public final int LIZLLL(Text text, Long l) {
        List<TextPiece> list;
        User user;
        List<BadgeStruct> badgeList;
        long id;
        boolean z;
        List<BadgeStruct> badgeList2;
        boolean zLJIIL;
        int readHoldCount;
        List<BadgeStruct> badgeList3;
        List<BadgeStruct> list2;
        C1142430fpp c1142430fpp;
        if (text == null || (list = text.pieces) == null) {
            return 0;
        }
        HashMap map = new HashMap(list.size());
        Iterator<TextPiece> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            TextPieceUser textPieceUser = it2.next().userValue;
            if (textPieceUser != null && (user = textPieceUser.user) != null && (badgeList = user.getBadgeList()) != null && !badgeList.isEmpty()) {
                Long lValueOf = Long.valueOf(user.getId());
                Object objValueOf = map.get(lValueOf);
                if (objValueOf == null) {
                    long id2 = user.getId();
                    if (id2 > 0 && (badgeList3 = user.getBadgeList()) != null && !badgeList3.isEmpty()) {
                        String strLIZLLL = C1136820fgm.LIZLLL(id2, badgeList3);
                        long jLIZIZ = C1136820fgm.LIZIZ(badgeList3);
                        ReentrantReadWriteLock.ReadLock lock = this.LJII.readLock();
                        lock.lock();
                        try {
                            C1142430fpp c1142430fpp2 = this.LJI.get(strLIZLLL);
                            if (c1142430fpp2 != null && !c1142430fpp2.LJFF) {
                                lock.unlock();
                            } else {
                                lock.unlock();
                                if (!LJIIL(id2) || (c1142430fpp = this.LJIIL.get(strLIZLLL)) == null || c1142430fpp.LJFF) {
                                    synchronized (this.LJIIZILJ) {
                                        try {
                                            if (this.LJIILLIIL != id2 || this.LJIILL != jLIZIZ || (list2 = this.LJIILJJIL) == null || ((ArrayList) list2).isEmpty()) {
                                                id = user.getId();
                                                if (id > 0) {
                                                }
                                                z = false;
                                                objValueOf = Boolean.valueOf(z);
                                                map.put(lValueOf, objValueOf);
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z = true;
                            objValueOf = Boolean.valueOf(z);
                            map.put(lValueOf, objValueOf);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            lock.unlock();
                            throw th2;
                        }
                    } else {
                        id = user.getId();
                        if (id > 0 && BadgeCacheOptimizeEnableSetting.isEnabled() && (badgeList2 = user.getBadgeList()) != null && !badgeList2.isEmpty() && (!(zLJIIL = LJIIL(id)) ? !((this.LJIILLIIL == 0 || id != this.LJIILLIIL) && (!BadgeCacheOptimizeEnableSetting.isOtherAudienceCacheEnabled() || LJIJ(id, l))) : BadgeCacheOptimizeEnableSetting.isSelfViewCacheEnabled())) {
                            LJ();
                            if (zLJIIL) {
                                if (LIZIZ(id, badgeList2) != null) {
                                }
                                objValueOf = Boolean.valueOf(z);
                                map.put(lValueOf, objValueOf);
                            } else {
                                String strLIZLLL2 = C1136820fgm.LIZLLL(id, badgeList2);
                                ReentrantReadWriteLock reentrantReadWriteLock = this.LJII;
                                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                    readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                                        lock2.unlock();
                                    }
                                } else {
                                    readHoldCount = 0;
                                }
                                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                                writeLock.lock();
                                try {
                                    C1142430fpp c1142430fpp3 = this.LJI.get(strLIZLLL2);
                                    if (c1142430fpp3 != null && !c1142430fpp3.LJFF) {
                                        c1142430fpp3.LJ = System.currentTimeMillis();
                                        for (int i3 = 0; i3 < readHoldCount; i3++) {
                                            lock2.lock();
                                        }
                                        writeLock.unlock();
                                    } else {
                                        LJFF();
                                        this.LJI.put(strLIZLLL2, new C1142430fpp(strLIZLLL2, id, new ArrayList(badgeList2)));
                                        LJIIJ(id, strLIZLLL2);
                                        LJIJJ();
                                        for (int i4 = 0; i4 < readHoldCount; i4++) {
                                            lock2.lock();
                                        }
                                        writeLock.unlock();
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    for (int i5 = 0; i5 < readHoldCount; i5++) {
                                        lock2.lock();
                                    }
                                    writeLock.unlock();
                                    throw th3;
                                }
                            }
                            z = true;
                            objValueOf = Boolean.valueOf(z);
                            map.put(lValueOf, objValueOf);
                        }
                        z = false;
                        objValueOf = Boolean.valueOf(z);
                        map.put(lValueOf, objValueOf);
                    }
                }
                if (((Boolean) objValueOf).booleanValue()) {
                    user.setBadgeList(null);
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct> LJII(com.bytedance.android.live.base.model.user.User r12, java.lang.String r13) {
        /*
            r11 = this;
            r10 = 0
            if (r12 != 0) goto L4
            return r10
        L4:
            java.util.List r0 = r12.getBadgeList()
            if (r0 == 0) goto L18
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L18
            r0 = 0
        L11:
            if (r0 != 0) goto L1a
            java.util.List r0 = r12.getBadgeList()
            return r0
        L18:
            r0 = 1
            goto L11
        L1a:
            boolean r0 = com.bytedance.android.livesdk.livesetting.publicscreen.BadgeCacheOptimizeEnableSetting.isEnabled()
            if (r0 != 0) goto L21
            return r10
        L21:
            if (r13 == 0) goto L2a
            java.util.List r0 = r11.LJIIIIZZ(r13)
            if (r0 == 0) goto L2a
            return r0
        L2a:
            long r4 = r12.getId()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb4
            java.lang.String r0 = r11.LJI(r4)
            if (r0 == 0) goto L41
            java.util.List r0 = r11.LJIIIIZZ(r0)
            if (r0 == 0) goto L41
            return r0
        L41:
            boolean r0 = LJIIL(r4)
            if (r0 == 0) goto L97
            boolean r0 = com.bytedance.android.livesdk.livesetting.publicscreen.BadgeCacheOptimizeEnableSetting.isSelfViewCacheEnabled()
            if (r0 == 0) goto L86
            boolean r0 = LJIIL(r4)
            if (r0 == 0) goto L86
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0fpp> r0 = r11.LJIIL
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
            r6 = -9223372036854775808
            r8 = r10
        L60:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getValue()
            X.0fpp r3 = (X.C1142430fpp) r3
            long r1 = r3.LIZ
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L60
            boolean r0 = r3.LJFF
            if (r0 != 0) goto L60
            long r1 = r3.LJ
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L60
            long r6 = r3.LJ
            r8 = r3
            goto L60
        L86:
            r0 = r10
            goto L94
        L88:
            if (r8 == 0) goto L90
            long r0 = java.lang.System.currentTimeMillis()
            r8.LJ = r0
        L90:
            if (r8 == 0) goto L86
            java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct> r0 = r8.LIZJ
        L94:
            if (r0 == 0) goto L97
            return r0
        L97:
            java.lang.Object r3 = r11.LJIIZILJ
            monitor-enter(r3)
            long r1 = r11.LJIILLIIL     // Catch: java.lang.Throwable -> Lae
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto La7
            java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct> r0 = r11.LJIILJJIL     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La7
            java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct> r0 = r11.LJIILJJIL     // Catch: java.lang.Throwable -> Lae
            goto Laa
        La7:
            monitor-exit(r3)
            r0 = r10
            goto Lab
        Laa:
            monitor-exit(r3)
        Lab:
            if (r0 == 0) goto Lb4
            return r0
        Lae:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r3)
            throw r0
        Lb4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142400fpm.LJII(com.bytedance.android.live.base.model.user.User, java.lang.String):java.util.List");
    }

    public final void LJIIJ(long j, String str) {
        Set<String> set = this.LJIIIIZZ.get(Long.valueOf(j));
        if (set != null) {
            set.add(str);
            return;
        }
        Set<String> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.add(str);
        this.LJIIIIZZ.put(Long.valueOf(j), setNewSetFromMap);
    }

    public final void LJIIJJI(long j, String str) {
        Set<String> set;
        if (j <= 0 || (set = this.LJIIIIZZ.get(Long.valueOf(j))) == null) {
            return;
        }
        set.remove(str);
        if (set.isEmpty()) {
            this.LJIIIIZZ.remove(Long.valueOf(j));
        }
    }

    public final boolean LJIJ(long j, Long l) {
        if (!BadgeCacheOptimizeEnableSetting.isDeferredCacheEnabled()) {
            return false;
        }
        synchronized (this.LJIIJJI) {
            try {
                if (l == null) {
                    return this.LJIIIZ.add(Long.valueOf(j));
                }
                Long l2 = this.LJIIJ.get(Long.valueOf(j));
                if (l2 != null) {
                    return Intrinsics.LJFF(l2, l);
                }
                if (!this.LJIIIZ.add(Long.valueOf(j))) {
                    return false;
                }
                this.LJIIJ.put(Long.valueOf(j), l);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJI(User user, List<BadgeStruct> list) {
        synchronized (this.LJIIZILJ) {
            try {
                long id = user.getId();
                if (id > 0 && this.LIZIZ == 0) {
                    this.LIZIZ = id;
                }
                long jLIZIZ = C1136820fgm.LIZIZ(list);
                if (this.LJIILLIIL != user.getId() || this.LJIILJJIL == null || this.LJIILL != jLIZIZ) {
                    this.LJIILJJIL = new ArrayList(list);
                    this.LJIILL = jLIZIZ;
                    this.LJIILLIIL = user.getId();
                }
                user.setBadgeList(null);
                this.LJJI.incrementAndGet();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
