package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.mingap.MinGapViolationResult;
import com.ss.android.ugc.aweme.feed.mingap.ViolateMinGapItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.InterventionInfoStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.OperatorInfoStruct;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567320qt8 implements InterfaceC606850Nr9, InterfaceC1601540rmK {
    public WeakReference<DataLayerAbility> LIZ;
    public List<ContentInfoStruct> LIZJ;
    public List<ContentInfoStruct> LIZLLL;
    public final ExecutorService LIZIZ = C823050WQl.LJFF();
    public final C1567330qt9 LJ = new C1567330qt9();
    public final ArrayList<Future<?>> LJFF = new ArrayList<>();

    @Override // X.InterfaceC606850Nr9
    public final void LIZ(List<? extends Aweme> list) {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJFF() {
    }

    @Override // X.InterfaceC1601540rmK
    public final void LJIIIIZZ(FeedItemList feedItemList, boolean z) {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJIIJ(List<? extends Aweme> list) {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJII(Map map) {
        DataLayerAbility dataLayerAbility;
        WeakReference<DataLayerAbility> weakReference = this.LIZ;
        if (weakReference != null && (dataLayerAbility = weakReference.get()) != null) {
            HashMap map2 = (HashMap) map;
            Set setKeySet = map2.keySet();
            int iMin = Math.min(((Number) C13LP.LJJZZIII(setKeySet)).intValue() - 8, 0);
            LJIILIIL(iMin, null, Math.max(((Number) C13LP.LJJLJ(setKeySet)).intValue() + 8, dataLayerAbility.Q0()), iMin, new ArrayList(dataLayerAbility.getItems()));
            List<ContentInfoStruct> list = this.LIZJ;
            if (list != null) {
                LJIILJJIL(null, new ArrayList(map2.values()), list);
            }
        }
    }

    @Override // X.InterfaceC1601540rmK
    public final void LJIIIZ(List<? extends Aweme> list) {
        String aid;
        for (Aweme aweme : (ArrayList) list) {
            List<ContentInfoStruct> list2 = this.LIZJ;
            if (list2 != null) {
                Iterator it2 = ((ArrayList) list2).iterator();
                while (it2.hasNext()) {
                    String str = ((ContentInfoStruct) it2.next()).awemeId;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(str, aid)) {
                        it2.remove();
                    }
                }
            }
        }
    }

    public static void LJIILJJIL(String str, List list, List list2) {
        Object next;
        String str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            Iterator it3 = list2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(((ContentInfoStruct) next).awemeId, aweme.getAid())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ContentInfoStruct contentInfoStruct = (ContentInfoStruct) next;
            if (contentInfoStruct != null) {
                OperatorInfoStruct operatorInfoStruct = new OperatorInfoStruct();
                operatorInfoStruct.operator = 1;
                if (str == null) {
                    str2 = "unknown";
                } else {
                    str2 = str;
                }
                operatorInfoStruct.reason = str2;
                operatorInfoStruct.stage = 4;
                operatorInfoStruct.opTimestamp = jCurrentTimeMillis;
                C717002r2.LIZ(contentInfoStruct, operatorInfoStruct);
            }
        }
    }

    @Override // X.InterfaceC606850Nr9
    public final void LIZIZ(int i, String str, List list) {
        WeakReference<DataLayerAbility> weakReference;
        DataLayerAbility dataLayerAbility;
        String str2;
        if (!Intrinsics.LJFF("shared_video", str) && !Intrinsics.LJFF("playback_recovery_when_accident", str) && (weakReference = this.LIZ) != null && (dataLayerAbility = weakReference.get()) != null) {
            LJIILIIL(Math.max(0, i - 8), str, Math.min(dataLayerAbility.Q0() - 1, i + 8 + list.size()), i, new ArrayList(dataLayerAbility.getItems()));
            List<ContentInfoStruct> list2 = this.LIZJ;
            if (list2 == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Aweme aweme = (Aweme) it2.next();
                    ContentInfoStruct contentInfoStruct = new ContentInfoStruct();
                    contentInfoStruct.awemeId = aweme.getAid();
                    contentInfoStruct.marketSubType = aweme.getMarketSubType();
                    contentInfoStruct.logId = aweme.getRequestId();
                    OperatorInfoStruct operatorInfoStruct = new OperatorInfoStruct();
                    operatorInfoStruct.operator = 2;
                    if (str == null) {
                        str2 = "unknown";
                    } else {
                        str2 = str;
                    }
                    operatorInfoStruct.reason = str2;
                    operatorInfoStruct.stage = 4;
                    operatorInfoStruct.opTimestamp = jCurrentTimeMillis;
                    C717002r2.LIZ(contentInfoStruct, operatorInfoStruct);
                    arrayList.add(contentInfoStruct);
                }
                this.LIZLLL = new ArrayList(arrayList);
                return;
            }
            LJIILL(i, str, list, list2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    @Override // X.InterfaceC1601540rmK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r7, com.ss.android.ugc.aweme.feed.model.FeedItemList r8, boolean r9) {
        /*
            r6 = this;
            if (r8 != 0) goto L3
            return
        L3:
            if (r9 == 0) goto L6
            return
        L6:
            com.ss.android.ugc.aweme.feed.model.intervention.InterventionInfoStruct r0 = r8.interventionInfo
            r4 = 0
            if (r0 == 0) goto L8a
            java.util.List r2 = r0.getOriginContentInfo()
            if (r2 == 0) goto L8a
            java.util.Iterator r3 = r2.iterator()
        L15:
            boolean r1 = r3.hasNext()
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct r1 = (com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct) r1
            java.lang.String r0 = r1.logId
            if (r0 == 0) goto L2d
            int r0 = r0.length()
            if (r0 != 0) goto L15
        L2d:
            java.lang.String r0 = r8.getRequestId()
            r1.logId = r0
            goto L15
        L34:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r7 == r0) goto L5d
            r0 = 4
            if (r7 == r0) goto L4b
            r0 = 8
            if (r7 == r0) goto L4b
            r0 = 19
            if (r7 == r0) goto L5d
            r0 = 20
            if (r7 == r0) goto L4b
            return
        L4b:
            java.util.List<com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct> r0 = r6.LIZJ
            if (r0 == 0) goto L52
            r3.addAll(r0)
        L52:
            r3.addAll(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r6.LIZJ = r0
            goto L70
        L5d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            java.util.List<com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct> r0 = r6.LIZLLL
            if (r0 == 0) goto L69
            r1.addAll(r5, r0)
        L69:
            r6.LIZJ = r1
            r6.LIZLLL = r4
            r3.addAll(r1)
        L70:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r0 = r8.getItems()
            r2.<init>(r0)
            java.util.concurrent.ExecutorService r1 = r6.LIZIZ
            X.0hez r0 = new X.0hez
            r0.<init>()
            java.util.concurrent.Future r1 = r1.submit(r0)
            java.util.ArrayList<java.util.concurrent.Future<?>> r0 = r6.LJFF
            r0.add(r1)
            return
        L8a:
            r6.LIZJ = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567320qt8.LIZJ(int, com.ss.android.ugc.aweme.feed.model.FeedItemList, boolean):void");
    }

    @Override // X.InterfaceC606850Nr9
    public final void LIZLLL(int i, Aweme aweme, String str) {
        DataLayerAbility dataLayerAbility;
        WeakReference<DataLayerAbility> weakReference = this.LIZ;
        if (weakReference == null || (dataLayerAbility = weakReference.get()) == null || Intrinsics.LJFF(AwemeExtKt.getCustomPayload(aweme, "min_gap_aweme_show"), Boolean.TRUE)) {
            return;
        }
        LJIILIIL(Math.max(0, i - 8), str, Math.min(dataLayerAbility.Q0() - 1, i + 8), i, new ArrayList(dataLayerAbility.getItems()));
        List<ContentInfoStruct> list = this.LIZJ;
        if (list != null) {
            LJIILJJIL(str, Collections.singletonList(aweme), list);
        }
    }

    @Override // X.InterfaceC1601540rmK
    public final void LJI(FeedItemList feedItemList, List<? extends Aweme> list, String str) {
        InterventionInfoStruct interventionInfoStruct;
        List<ContentInfoStruct> originContentInfo;
        if (feedItemList != null && list != null && !list.isEmpty() && (interventionInfoStruct = feedItemList.interventionInfo) != null && (originContentInfo = interventionInfoStruct.getOriginContentInfo()) != null) {
            LJIILJJIL(str, list, originContentInfo);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJIIL(String str, List list, List list2) {
        EnumC1910390zoT enumC1910390zoTLIZIZ;
        List list3;
        Object next;
        EnumC1910390zoT enumC1910390zoTLIZIZ2;
        OperatorInfoStruct operatorInfoStruct;
        if (list.isEmpty()) {
            return;
        }
        C1567330qt9 c1567330qt9 = this.LJ;
        if (c1567330qt9.LIZ == null) {
            try {
                ReentrantLock reentrantLock = c1567330qt9.LIZIZ;
                reentrantLock.lock();
                try {
                    boolean zAwait = c1567330qt9.LIZJ.await(30000L, TimeUnit.MILLISECONDS);
                    reentrantLock.unlock();
                    C189200o6.m2constructorimpl(Boolean.valueOf(zAwait));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        InterfaceC830890Wid interfaceC830890Wid = c1567330qt9.LIZ;
        Exception errorMessage = null;
        if (interfaceC830890Wid == null) {
            C1567330qt9.LIZIZ(1, 0L, null);
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ContentInfoStruct contentInfoStruct = (ContentInfoStruct) it2.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("aid", contentInfoStruct.awemeId);
                jSONObject.putOpt("market_sub_type", Integer.valueOf(contentInfoStruct.marketSubType));
                List<OperatorInfoStruct> list4 = contentInfoStruct.operatorInfoList;
                if (list4 != null) {
                    operatorInfoStruct = (OperatorInfoStruct) C13LP.LJJLIIIJL(list4);
                } else {
                    operatorInfoStruct = null;
                }
                if (operatorInfoStruct != null) {
                    jSONObject.putOpt("operator", Integer.valueOf(operatorInfoStruct.operator));
                    jSONObject.putOpt("reason", operatorInfoStruct.reason);
                    jSONObject.putOpt("timestamp", Long.valueOf(operatorInfoStruct.opTimestamp));
                } else {
                    jSONObject.putOpt("operator", 0);
                    jSONObject.putOpt("reason", "");
                    jSONObject.putOpt("timestamp", 0);
                }
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("shadow_list", jSONArray);
            TTMParamData tTMParamData = new TTMParamData(jSONObject2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, (String) C2508009sE.LIZ.getValue(), tTMParamData);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (interfaceC805220ViKRunScene != null) {
                enumC1910390zoTLIZIZ = interfaceC805220ViKRunScene.LIZIZ();
            } else {
                enumC1910390zoTLIZIZ = null;
            }
            if (enumC1910390zoTLIZIZ != EnumC1910390zoT.CelResult) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                if (interfaceC805220ViKRunScene != null) {
                    enumC1910390zoTLIZIZ2 = interfaceC805220ViKRunScene.LIZIZ();
                } else {
                    enumC1910390zoTLIZIZ2 = null;
                }
                sbLIZ.append(enumC1910390zoTLIZIZ2);
                sbLIZ.append(',');
                if (interfaceC805220ViKRunScene != null) {
                    errorMessage = interfaceC805220ViKRunScene.getErrorMessage();
                }
                sbLIZ.append(errorMessage);
                C1567330qt9.LIZIZ(2, 0L, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            Object objLIZJ = interfaceC805220ViKRunScene.LIZJ();
            if (objLIZJ instanceof List) {
                list3 = (List) objLIZJ;
            } else {
                list3 = null;
            }
            List listLIZ = C1567330qt9.LIZ(list, list3, jSONObject2);
            if (listLIZ != null) {
                C1567330qt9.LIZIZ(0, jCurrentTimeMillis2, null);
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    Aweme aweme = (Aweme) it3.next();
                    Iterator it4 = listLIZ.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.LJFF(aweme.getAid(), ((ViolateMinGapItem) next).aid)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ViolateMinGapItem violateMinGapItem = (ViolateMinGapItem) next;
                    if (violateMinGapItem != null) {
                        C1567350qtB c1567350qtB = (C1567350qtB) AwemeExtKt.getCustomPayload(aweme, "min_gap_tag");
                        List<MinGapViolationResult> list5 = violateMinGapItem.violationRules;
                        if (c1567350qtB == null) {
                            if (str != null && list5 != null) {
                                Iterator<MinGapViolationResult> it5 = list5.iterator();
                                while (it5.hasNext()) {
                                    it5.next().reason = str;
                                }
                            }
                            C1567350qtB c1567350qtB2 = new C1567350qtB();
                            CopyOnWriteArrayList<MinGapViolationResult> copyOnWriteArrayList = c1567350qtB2.LIZ;
                            List<MinGapViolationResult> list6 = list5;
                            if (list5 == null) {
                                list6 = C13BV.INSTANCE;
                            }
                            copyOnWriteArrayList.addAll(list6);
                            AwemeExtKt.putCustomPayload(aweme, "min_gap_tag", c1567350qtB2);
                        } else {
                            CopyOnWriteArrayList<MinGapViolationResult> copyOnWriteArrayList2 = c1567350qtB.LIZ;
                            if (list5 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (MinGapViolationResult minGapViolationResult : copyOnWriteArrayList2) {
                                    MinGapViolationResult minGapViolationResult2 = minGapViolationResult;
                                    if (!list5.isEmpty()) {
                                        Iterator<MinGapViolationResult> it6 = list5.iterator();
                                        while (it6.hasNext()) {
                                            if (Intrinsics.LJFF(minGapViolationResult2.minGapRuleId, it6.next().minGapRuleId)) {
                                                break;
                                            }
                                        }
                                    }
                                    arrayList.add(minGapViolationResult);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (MinGapViolationResult minGapViolationResult3 : list5) {
                                    MinGapViolationResult minGapViolationResult4 = minGapViolationResult3;
                                    if (!copyOnWriteArrayList2.isEmpty()) {
                                        Iterator<MinGapViolationResult> it7 = copyOnWriteArrayList2.iterator();
                                        while (it7.hasNext()) {
                                            if (Intrinsics.LJFF(minGapViolationResult4.minGapRuleId, it7.next().minGapRuleId)) {
                                                break;
                                            }
                                        }
                                    }
                                    arrayList2.add(minGapViolationResult3);
                                }
                                copyOnWriteArrayList2.removeAll(arrayList);
                                if (str != null) {
                                    Iterator it8 = arrayList2.iterator();
                                    while (it8.hasNext()) {
                                        ((MinGapViolationResult) it8.next()).reason = str;
                                    }
                                }
                                copyOnWriteArrayList2.addAll(arrayList2);
                            }
                        }
                    } else {
                        AwemeExtKt.removeCustomPayload(aweme, "min_gap_tag");
                    }
                }
                return;
            }
            C1567330qt9.LIZIZ(3, 0L, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "min_gap_cal");
            C1567330qt9.LIZIZ(4, 0L, e.getMessage());
        }
    }

    @Override // X.InterfaceC1601540rmK
    public final void LJ(FeedItemList feedItemList, Aweme aweme, int i, String str) {
        InterventionInfoStruct interventionInfoStruct;
        List<ContentInfoStruct> originContentInfo;
        if (feedItemList != null && (interventionInfoStruct = feedItemList.interventionInfo) != null && (originContentInfo = interventionInfoStruct.getOriginContentInfo()) != null && i <= originContentInfo.size() && i >= 0) {
            ContentInfoStruct contentInfoStruct = new ContentInfoStruct();
            contentInfoStruct.awemeId = aweme.getAid();
            contentInfoStruct.marketSubType = aweme.getMarketSubType();
            contentInfoStruct.logId = aweme.getRequestId();
            OperatorInfoStruct operatorInfoStruct = new OperatorInfoStruct();
            operatorInfoStruct.operator = 2;
            operatorInfoStruct.reason = str;
            operatorInfoStruct.stage = 4;
            operatorInfoStruct.opTimestamp = System.currentTimeMillis();
            C717002r2.LIZ(contentInfoStruct, operatorInfoStruct);
            ListProtector.add(originContentInfo, i, contentInfoStruct);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00de, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(int r11, java.lang.String r12, java.util.List r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567320qt8.LJIILL(int, java.lang.String, java.util.List, java.util.List):void");
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJIIJJI(int i, int i2, String str, List list, List list2) {
        DataLayerAbility dataLayerAbility;
        WeakReference<DataLayerAbility> weakReference = this.LIZ;
        if (weakReference != null && (dataLayerAbility = weakReference.get()) != null) {
            LJIILIIL(Math.max(0, i - 8), str, Math.min(dataLayerAbility.Q0() - 1, list.size() + i + 8), i, new ArrayList(dataLayerAbility.getItems()));
            List<ContentInfoStruct> list3 = this.LIZJ;
            if (list3 != null) {
                int size = list.size();
                int size2 = list2.size();
                int i3 = size + 1;
                int[][] iArr = new int[i3][];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr[i4] = new int[size2 + 1];
                }
                if (1 <= size) {
                    int i5 = 1;
                    while (true) {
                        if (1 <= size2) {
                            int i6 = 1;
                            while (true) {
                                int i7 = i5 - 1;
                                int i8 = i6 - 1;
                                if (Intrinsics.LJFF(((Aweme) ListProtector.get(list, i7)).getAid(), ((Aweme) ListProtector.get(list2, i8)).getAid())) {
                                    iArr[i5][i6] = iArr[i7][i8] + 1;
                                } else {
                                    int[] iArr2 = iArr[i5];
                                    iArr2[i6] = Math.max(iArr[i7][i6], iArr2[i8]);
                                }
                                if (i6 == size2) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                        }
                        if (i5 == size) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                while (size > 0 && size2 > 0) {
                    int i9 = size - 1;
                    int i10 = size2 - 1;
                    if (Intrinsics.LJFF(((Aweme) ListProtector.get(list, i9)).getAid(), ((Aweme) ListProtector.get(list2, i10)).getAid())) {
                        ListProtector.add(arrayList, 0, ((Aweme) ListProtector.get(list, i9)).getAid());
                        size = i9;
                    } else if (iArr[i9][size2] > iArr[size][i10]) {
                        size = i9;
                    }
                    size2 = i10;
                }
                ArrayList arrayList2 = new ArrayList();
                int size3 = list2.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size3; i12++) {
                    Aweme aweme = (Aweme) ListProtector.get(list2, i12);
                    if (i11 < arrayList.size() && Intrinsics.LJFF(ListProtector.get(arrayList, i11), aweme.getAid())) {
                        i11++;
                    } else {
                        arrayList2.add(aweme);
                    }
                }
                LJIILJJIL(str, arrayList2, list3);
                int size4 = list.size();
                int i13 = 0;
                for (int i14 = 0; i14 < size4; i14++) {
                    Aweme aweme2 = (Aweme) ListProtector.get(list, i14);
                    if (i13 < arrayList.size() && Intrinsics.LJFF(ListProtector.get(arrayList, i13), aweme2.getAid())) {
                        i13++;
                    } else {
                        LJIILL(-1, str, Collections.singletonList(aweme2), list3);
                    }
                }
            }
        }
    }

    public final void LJIILIIL(final int i, final String str, final int i2, final int i3, final List list) {
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty() && i >= 0 && i2 < arrayList.size()) {
            this.LJFF.add(this.LIZIZ.submit(new Runnable() { // from class: X.0hf1
                public final void LIZ() {
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = i3;
                    int i5 = i;
                    if (i5 <= i2) {
                        while (true) {
                            Aweme aweme = (Aweme) ListProtector.get(list, i5);
                            ContentInfoStruct contentInfoStruct = new ContentInfoStruct();
                            contentInfoStruct.awemeId = aweme.getAid();
                            contentInfoStruct.marketSubType = aweme.getMarketSubType();
                            contentInfoStruct.logId = aweme.getRequestId();
                            arrayList2.add(contentInfoStruct);
                            if (i5 == i2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    C1567320qt8 c1567320qt8 = this;
                    List<Aweme> list2 = list;
                    ArrayList arrayList3 = new ArrayList(list2.subList(i4, Math.min(i2 + 1, list2.size())));
                    String str2 = str;
                    c1567320qt8.getClass();
                    try {
                        c1567320qt8.LJIIL(str2, arrayList2, arrayList3);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJFF(e, "min_gap_cal");
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MinGapAnalyticsAgent@3fac.postCheckMinGapInRange$task$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MinGapAnalyticsAgent@3fac.postCheckMinGapInRange$task$1");
                }
            }));
        }
    }
}
