package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.InterventionInfoStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.OperatorInfoStruct;
import com.ss.android.ugc.aweme.feed.utils.DataOperation;
import com.ss.android.ugc.aweme.feed.utils.ResponseSectionMeta;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564450qoV implements InterfaceC606850Nr9, InterfaceC1601540rmK {
    public WeakReference<DataLayerAbility> LIZ;
    public final ArrayList<ResponseSectionMeta> LIZIZ = new ArrayList<>();

    @Override // X.InterfaceC606850Nr9
    public final void LIZ(List<? extends Aweme> list) {
    }

    @Override // X.InterfaceC1601540rmK
    public final void LJ(FeedItemList feedItemList, Aweme aweme, int i, String str) {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJFF() {
    }

    @Override // X.InterfaceC1601540rmK
    public final void LJI(FeedItemList feedItemList, List<? extends Aweme> list, String str) {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJII(Map map) {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJIIJ(List<? extends Aweme> list) {
    }

    @Override // X.InterfaceC1601540rmK
    public final void LJIIIZ(List<? extends Aweme> list) {
        for (Aweme aweme : (ArrayList) list) {
            for (ResponseSectionMeta responseSectionMeta : this.LIZIZ) {
                Iterator<DataOperation> it2 = responseSectionMeta.operations.iterator();
                while (it2.hasNext()) {
                    List<String> list2 = it2.next().newItems;
                    if (list2 != null && list2.contains(aweme.getAid())) {
                        it2.remove();
                        responseSectionMeta.LIZIZ--;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1601540rmK
    public final void LJIIIIZZ(FeedItemList feedItemList, boolean z) {
        String str;
        if (feedItemList == null) {
            return;
        }
        Map<String, String> map = feedItemList.localExtra;
        if (map != null) {
            str = map.get("request_pull_type");
        } else {
            str = null;
        }
        if ((!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) && !Intrinsics.LJFF(str, "1") && !Intrinsics.LJFF(str, "2") && !Intrinsics.LJFF(str, "4")) || feedItemList.isFromColdCache) {
            return;
        }
        String logId = feedItemList.getLogId();
        if (logId == null) {
            logId = "null";
        }
        if (!z) {
            this.LIZIZ.add(new ResponseSectionMeta(logId, str));
        }
    }

    @Override // X.InterfaceC606850Nr9
    public final void LIZIZ(int i, String str, List list) {
        if (str == null) {
            return;
        }
        try {
            for (ResponseSectionMeta responseSectionMeta : this.LIZIZ) {
                int i2 = responseSectionMeta.LIZ;
                if (i >= i2) {
                    int i3 = responseSectionMeta.LIZIZ;
                    if (i <= i3 + 1) {
                        responseSectionMeta.LIZIZ = i3 + list.size();
                        if (!Intrinsics.LJFF("playback_recovery_when_accident", str)) {
                            int i4 = i - responseSectionMeta.LIZ;
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((Aweme) it2.next()).getAid());
                            }
                            responseSectionMeta.operations.add(new DataOperation(str, "insert", i4, null, arrayList));
                        }
                    }
                }
                if (i < i2) {
                    responseSectionMeta.LIZ = i2 + list.size();
                    responseSectionMeta.LIZIZ += list.size();
                }
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AwemeExtKt.appendMobParam((Aweme) it3.next(), "aweme_insert_reason", str);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1601540rmK
    public final void LIZJ(int i, FeedItemList feedItemList, boolean z) {
        ResponseSectionMeta next;
        WeakReference<DataLayerAbility> weakReference;
        DataLayerAbility dataLayerAbility;
        int size;
        List<ContentInfoStruct> originContentInfo;
        WeakReference<DataLayerAbility> weakReference2;
        DataLayerAbility dataLayerAbility2;
        if (feedItemList == null) {
            return;
        }
        ResponseSectionMeta responseSectionMeta = null;
        if (z) {
            Iterator<ResponseSectionMeta> it2 = this.LIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ResponseSectionMeta next2 = it2.next();
                if (Intrinsics.LJFF(next2.logId, feedItemList.getLogId())) {
                    responseSectionMeta = next2;
                    break;
                }
            }
            ResponseSectionMeta responseSectionMeta2 = responseSectionMeta;
            if (responseSectionMeta2 != null && (weakReference2 = this.LIZ) != null && (dataLayerAbility2 = weakReference2.get()) != null) {
                int iQ0 = responseSectionMeta2.LIZIZ - (dataLayerAbility2.Q0() - 1);
                for (ResponseSectionMeta responseSectionMeta3 : this.LIZIZ) {
                    responseSectionMeta3.LIZ = Math.max(0, responseSectionMeta3.LIZ - iQ0);
                    responseSectionMeta3.LIZIZ = Math.max(0, responseSectionMeta3.LIZIZ - iQ0);
                }
                return;
            }
            return;
        }
        Iterator<ResponseSectionMeta> it3 = this.LIZIZ.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(next.logId, feedItemList.getLogId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ResponseSectionMeta responseSectionMeta4 = next;
        if (responseSectionMeta4 != null && (weakReference = this.LIZ) != null && (dataLayerAbility = weakReference.get()) != null) {
            InterventionInfoStruct interventionInfoStruct = feedItemList.interventionInfo;
            if (interventionInfoStruct != null && (originContentInfo = interventionInfoStruct.getOriginContentInfo()) != null) {
                for (ContentInfoStruct contentInfoStruct : originContentInfo) {
                    List<OperatorInfoStruct> list = contentInfoStruct.operatorInfoList;
                    if (list != null) {
                        for (OperatorInfoStruct operatorInfoStruct : list) {
                            String str = "";
                            if (operatorInfoStruct.stage == 4 && operatorInfoStruct.operator == 1) {
                                String str2 = operatorInfoStruct.reason;
                                String str3 = contentInfoStruct.awemeId;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                responseSectionMeta4.operations.add(new DataOperation(str2, "delete", 0, null, Collections.singletonList(str3)));
                            }
                            if (operatorInfoStruct.stage == 4 && operatorInfoStruct.operator == 2) {
                                String str4 = operatorInfoStruct.reason;
                                String str5 = contentInfoStruct.awemeId;
                                if (str5 != null) {
                                    str = str5;
                                }
                                responseSectionMeta4.operations.add(new DataOperation(str4, "insert", 0, null, Collections.singletonList(str)));
                            }
                        }
                    }
                }
            }
            int iQ02 = dataLayerAbility.Q0() - 1;
            responseSectionMeta4.LIZIZ = iQ02;
            List<Aweme> items = feedItemList.getItems();
            if (items != null) {
                size = items.size();
            } else {
                size = 1;
            }
            responseSectionMeta4.LIZ = (iQ02 - size) + 1;
        }
    }

    @Override // X.InterfaceC606850Nr9
    public final void LIZLLL(int i, Aweme aweme, String str) {
        LJIILIIL(i, aweme, str);
    }

    public final void LJIILIIL(int i, Aweme aweme, String str) {
        int i2;
        try {
            for (ResponseSectionMeta responseSectionMeta : this.LIZIZ) {
                int i3 = responseSectionMeta.LIZ;
                if (i >= i3 && i <= (i2 = responseSectionMeta.LIZIZ)) {
                    responseSectionMeta.LIZIZ = i2 - 1;
                    if (!Intrinsics.LJFF(AwemeExtKt.getCustomPayload(aweme, "min_gap_aweme_show"), Boolean.TRUE)) {
                        responseSectionMeta.operations.add(new DataOperation(str, "delete", i - responseSectionMeta.LIZ, null, Collections.singletonList(aweme.getAid())));
                    }
                } else if (i < i3) {
                    responseSectionMeta.LIZ = i3 - 1;
                    responseSectionMeta.LIZIZ--;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJIIJJI(int i, int i2, String str, List list, List list2) {
        if (str == null) {
            str = "unknown";
        }
        try {
            LJIIL(i, i2, str, list, list2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJIIL(int i, int i2, String str, List list, List list2) {
        List listSubList;
        List listSubList2;
        int iMin;
        int size = list2.size();
        int size2 = list.size();
        int i3 = size2 - size;
        int size3 = this.LIZIZ.size();
        int i4 = 0;
        int size4 = 0;
        int i5 = 0;
        while (i5 < size3) {
            ResponseSectionMeta responseSectionMeta = (ResponseSectionMeta) ListProtector.get(this.LIZIZ, i5);
            int i6 = responseSectionMeta.LIZIZ;
            if (i6 >= i) {
                int i7 = responseSectionMeta.LIZ;
                if (i7 >= i2) {
                    responseSectionMeta.LIZ = i7 + i3;
                    responseSectionMeta.LIZIZ = i6 + i3;
                } else {
                    if (i7 <= i) {
                        if (i6 < i2 - 1) {
                            int i8 = (i6 - i) + 1;
                            listSubList = list2.subList(i4, i8);
                            listSubList2 = list.subList(i4, Math.min(size2, i8));
                            responseSectionMeta.LIZIZ += listSubList2.size() - listSubList.size();
                            size4 += listSubList2.size();
                        } else {
                            responseSectionMeta.LIZIZ = i6 + i3;
                            listSubList2 = list;
                            listSubList = list2;
                        }
                    } else if (i6 < i2 - 1) {
                        int i9 = i7 - i;
                        listSubList = list2.subList(i9, (i6 - i) + 1);
                        if (i3 < 0) {
                            int i10 = (i6 - i7) + 1;
                            int i11 = size2 - size4;
                            if (i11 <= 0) {
                                listSubList2 = C13BV.INSTANCE;
                                responseSectionMeta.LIZ = -1;
                                responseSectionMeta.LIZIZ = -1;
                            } else {
                                iMin = size4 + Math.min(i10, i11);
                                listSubList2 = list.subList(size4, iMin);
                                responseSectionMeta.LIZ = size4 + i;
                                responseSectionMeta.LIZIZ = (r2 + r0) - 1;
                                size4 = iMin;
                            }
                        } else {
                            int i12 = (i6 - i7) + 1 + i9;
                            if (i12 <= size2) {
                                listSubList2 = list.subList(i9, i12);
                            } else {
                                listSubList2 = list.subList(i9, size2);
                            }
                            size4 += listSubList2.size();
                        }
                        iMin = size4;
                        size4 = iMin;
                    } else {
                        listSubList = list2.subList(i7 - i, list2.size());
                        if (size4 >= size2) {
                            listSubList2 = C13BV.INSTANCE;
                        } else {
                            listSubList2 = list.subList(size4, size2);
                        }
                        responseSectionMeta.LIZ = i + size4;
                        responseSectionMeta.LIZIZ += i3;
                    }
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                    Iterator it2 = listSubList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((Aweme) it2.next()).getAid());
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listSubList2, 10));
                    Iterator it3 = listSubList2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((Aweme) it3.next()).getAid());
                    }
                    responseSectionMeta.operations.add(new DataOperation(str, "replace", i, arrayList, arrayList2));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("after replace ");
                    sbLIZ.append(responseSectionMeta.logId);
                    sbLIZ.append(" [");
                    sbLIZ.append(responseSectionMeta.LIZ);
                    sbLIZ.append(", ");
                    sbLIZ.append(responseSectionMeta.LIZIZ);
                    sbLIZ.append(']');
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            i5++;
            i4 = 0;
        }
    }
}
