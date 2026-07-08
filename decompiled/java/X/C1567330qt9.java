package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.mingap.MinGapViolationResult;
import com.ss.android.ugc.aweme.feed.mingap.ViolateMinGapItem;
import com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567330qt9 {
    public InterfaceC830890Wid LIZ;
    public final ReentrantLock LIZIZ;
    public final Condition LIZJ;
    public final C1566800qsI LIZLLL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0qsI] */
    public C1567330qt9() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZIZ = reentrantLock;
        this.LIZJ = reentrantLock.newCondition();
        this.LIZLLL = new InterfaceC829930Wh5() { // from class: X.0qsI
            @Override // X.InterfaceC829930Wh5
            public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                    final C1567330qt9 c1567330qt9 = this.LIZ;
                    if (c1567330qt9.LIZ == null) {
                        c1567330qt9.getClass();
                        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("fyp_min_gap", new ArrayList(), null, new AbstractC830880Wic() { // from class: X.0qsJ
                            @Override // X.AbstractC830880Wic
                            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                                if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                                    C1567330qt9 c1567330qt92 = c1567330qt9;
                                    synchronized (this) {
                                        try {
                                            if (c1567330qt92.LIZ != null) {
                                                TTMStrategyCenterManager.deregisterSceneWithScene(interfaceC830890Wid);
                                            } else {
                                                c1567330qt92.LIZ = interfaceC830890Wid;
                                                TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c1567330qt92.LIZLLL);
                                                ReentrantLock reentrantLock2 = c1567330qt92.LIZIZ;
                                                reentrantLock2.lock();
                                                try {
                                                    c1567330qt92.LIZJ.signalAll();
                                                    reentrantLock2.unlock();
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    reentrantLock2.unlock();
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                if (enumC829940Wh6 != EnumC829940Wh6.TTMStateSceneDataUpdateFinish) {
                    return;
                }
                final C1567330qt9 c1567330qt92 = this.LIZ;
                if (c1567330qt92.LIZ != null) {
                    return;
                }
                c1567330qt92.getClass();
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("fyp_min_gap", new ArrayList(), null, new AbstractC830880Wic() { // from class: X.0qsJ
                    @Override // X.AbstractC830880Wic
                    public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                        if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                            C1567330qt9 c1567330qt922 = c1567330qt92;
                            synchronized (this) {
                                try {
                                    if (c1567330qt922.LIZ != null) {
                                        TTMStrategyCenterManager.deregisterSceneWithScene(interfaceC830890Wid);
                                    } else {
                                        c1567330qt922.LIZ = interfaceC830890Wid;
                                        TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c1567330qt922.LIZLLL);
                                        ReentrantLock reentrantLock2 = c1567330qt922.LIZIZ;
                                        reentrantLock2.lock();
                                        try {
                                            c1567330qt922.LIZJ.signalAll();
                                            reentrantLock2.unlock();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            reentrantLock2.unlock();
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }
                    }
                });
            }
        };
    }

    public static List LIZ(List list, List list2, JSONObject jSONObject) {
        String str;
        String str2;
        int iLongValue;
        String str3;
        String str4;
        Object next;
        String str5;
        String str6;
        Object next2;
        String str7;
        Long l;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list2, i);
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Object obj2 = map.get("aid");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                Object obj3 = map.get("violation");
                if (obj3 instanceof List) {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = ((Collection) obj3).size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Object obj4 = ListProtector.get((List) obj3, i2);
                        if (obj4 instanceof Map) {
                            MinGapViolationResult minGapViolationResult = new MinGapViolationResult(null, 0, null, null, null, null, null, null);
                            Map map2 = (Map) obj4;
                            Object obj5 = map2.get("reason");
                            if (obj5 instanceof String) {
                                str2 = (String) obj5;
                            } else {
                                str2 = null;
                            }
                            minGapViolationResult.reason = str2;
                            Object obj6 = map2.get("gap");
                            if ((obj6 instanceof Long) && (l = (Long) obj6) != null) {
                                iLongValue = (int) l.longValue();
                            } else {
                                iLongValue = -1;
                            }
                            minGapViolationResult.gap = iLongValue;
                            Object obj7 = map2.get("min_gap_rule");
                            if (obj7 instanceof String) {
                                str3 = (String) obj7;
                            } else {
                                str3 = null;
                            }
                            minGapViolationResult.minGapRuleId = str3;
                            Object obj8 = map2.get("last_item_id");
                            if (obj8 instanceof String) {
                                str4 = (String) obj8;
                            } else {
                                str4 = null;
                            }
                            minGapViolationResult.previousItemId = str4;
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(((ContentInfoStruct) next).awemeId, minGapViolationResult.previousItemId)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            ContentInfoStruct contentInfoStruct = (ContentInfoStruct) next;
                            if (contentInfoStruct != null) {
                                str5 = contentInfoStruct.logId;
                            } else {
                                str5 = null;
                            }
                            minGapViolationResult.previousItemLogId = str5;
                            Object obj9 = map2.get("violation_aid");
                            if (obj9 instanceof String) {
                                str6 = (String) obj9;
                            } else {
                                str6 = null;
                            }
                            minGapViolationResult.violationAid = str6;
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    if (Intrinsics.LJFF(((ContentInfoStruct) next2).awemeId, minGapViolationResult.violationAid)) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            ContentInfoStruct contentInfoStruct2 = (ContentInfoStruct) next2;
                            if (contentInfoStruct2 != null) {
                                str7 = contentInfoStruct2.serverExtraInfo;
                            } else {
                                str7 = null;
                            }
                            minGapViolationResult.LIZ = str7;
                            minGapViolationResult.LIZIZ = C786410Ut5.J3(jSONObject);
                            arrayList2.add(minGapViolationResult);
                        }
                    }
                    ViolateMinGapItem violateMinGapItem = new ViolateMinGapItem(null, null);
                    violateMinGapItem.aid = str;
                    violateMinGapItem.violationRules = arrayList2;
                    arrayList.add(violateMinGapItem);
                }
            }
        }
        return arrayList;
    }

    public static void LIZIZ(int i, long j, String str) {
        C793770VBv.LJII("min_gap_cal", C591500NHw.LIZ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i)), new Pair("message", str)), C591500NHw.LIZ(new Pair("duration", Long.valueOf(j))), null);
    }
}
