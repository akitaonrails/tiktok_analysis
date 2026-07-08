package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model.SeaPdpDaInfoMetaItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuHeaderTopLabelItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuHeaderTopLabelsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.SeaSkuHeaderTopWidget;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.03x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.SeaSkuHeaderTopWidget$updateHeaderTopLabels$2", f = "SeaSkuHeaderTopWidget.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1009203x4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SkuHeaderTopLabelsGroup LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ SeaSkuHeaderTopWidget LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009203x4(SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup, int i, SeaSkuHeaderTopWidget seaSkuHeaderTopWidget, InterfaceC1364105Vn<? super C1009203x4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = skuHeaderTopLabelsGroup;
        this.LLILLL = i;
        this.LLILZ = seaSkuHeaderTopWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1009203x4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Map map;
        Object objLJ;
        C1C7U.LIZ("SeaSkuHeaderTopWidget@b8b3.updateHeaderTopLabels$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1005503wT c1005503wT = C1005503wT.LIZ;
            SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup = this.LLILLJJLI;
            List<SeaPdpDaInfoMetaItem> list = skuHeaderTopLabelsGroup.daInfoMeta;
            List listLL = C13LP.LL(skuHeaderTopLabelsGroup.elements, this.LLILLL);
            ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(((SkuHeaderTopLabelItem) it2.next()).daInfo);
            }
            c1005503wT.getClass();
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (String str : arrayList) {
                    if (str == null || (objLJ = C1741890vQh.LJIIJ(str)) == null) {
                        objLJ = C2097608Jq.LJ();
                    }
                    arrayList2.add(objLJ);
                }
                if (list != null) {
                    for (SeaPdpDaInfoMetaItem seaPdpDaInfoMetaItem : list) {
                        Integer num = seaPdpDaInfoMetaItem.type;
                        int value = EnumC1009303x5.PASS_THROUGH.getValue();
                        if (num != null && num.intValue() == value) {
                            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(seaPdpDaInfoMetaItem.value);
                            if (mapLJIIJ != null) {
                                if (Intrinsics.LJFF(seaPdpDaInfoMetaItem.isCoreBiz, Boolean.TRUE)) {
                                    linkedHashMap.putAll(mapLJIIJ);
                                }
                                linkedHashMap2.putAll(mapLJIIJ);
                            }
                        } else {
                            int value2 = EnumC1009303x5.STRING_AGGREGATE.getValue();
                            boolean z = false;
                            if (num != null && num.intValue() == value2) {
                                String str2 = seaPdpDaInfoMetaItem.template;
                                if (str2 == null || a0.LJJJIL(str2)) {
                                    z = true;
                                }
                                if (!z) {
                                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, new AwS580S0100000_1(seaPdpDaInfoMetaItem, 853), 30);
                                    if (Intrinsics.LJFF(seaPdpDaInfoMetaItem.isCoreBiz, Boolean.TRUE)) {
                                        linkedHashMap.put(seaPdpDaInfoMetaItem.template, strLJJLIIIJ);
                                    }
                                    linkedHashMap2.put(seaPdpDaInfoMetaItem.template, strLJJLIIIJ);
                                }
                            } else {
                                int value3 = EnumC1009303x5.JSON_AGGREGATE.getValue();
                                if (num != null && num.intValue() == value3) {
                                    String str3 = seaPdpDaInfoMetaItem.template;
                                    if (str3 == null || a0.LJJJIL(str3)) {
                                        z = true;
                                    }
                                    if (!z) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            Object objLIZ = C7726030a.LIZ(seaPdpDaInfoMetaItem.template, (Map) it3.next());
                                            if (objLIZ instanceof Map) {
                                                map = (Map) objLIZ;
                                            } else {
                                                map = null;
                                            }
                                            if (map != null) {
                                                arrayList3.add(map);
                                            }
                                        }
                                        if (Intrinsics.LJFF(seaPdpDaInfoMetaItem.isCoreBiz, Boolean.TRUE)) {
                                            linkedHashMap.put(seaPdpDaInfoMetaItem.template, arrayList3);
                                        }
                                        linkedHashMap2.put(seaPdpDaInfoMetaItem.template, arrayList3);
                                    }
                                }
                            }
                        }
                    }
                }
                pair = new Pair(linkedHashMap, linkedHashMap2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1019103yf.LIZ(EnumC1014603xw.ERR110, th, null);
                pair = new Pair(C2097608Jq.LJ(), C2097608Jq.LJ());
            }
            SeaSkuHeaderTopWidget seaSkuHeaderTopWidget = this.LLILZ;
            int i2 = this.LLILLL;
            Map map2 = (Map) pair.getFirst();
            Map map3 = (Map) pair.getSecond();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C991803uG c991803uG = new C991803uG(seaSkuHeaderTopWidget, map2, i2, map3, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c991803uG) == objLJFF) {
                C1C7U.LIZIZ("SeaSkuHeaderTopWidget@b8b3.updateHeaderTopLabels$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaSkuHeaderTopWidget@b8b3.updateHeaderTopLabels$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
