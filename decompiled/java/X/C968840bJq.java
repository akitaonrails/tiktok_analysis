package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968840bJq implements InterfaceC968940bK0 {
    public static final C968820bJo LJII = new C968820bJo();
    public Map<Integer, Integer> LIZ;
    public final CopyOnWriteArrayList<InterfaceC968880bJu> LIZIZ = new CopyOnWriteArrayList<>();
    public final Map<String, OnLineMicInfo> LIZJ;
    public final Map<String, OnLineMicInfo> LIZLLL;
    public Map<String, OnLineMicInfo> LJ;
    public Map<String, OnLineMicInfo> LJFF;
    public final Map<String, OnLineMicInfo> LJI;

    @Override // X.InterfaceC968940bK0
    public final int LIZIZ() {
        return this.LIZJ.size();
    }

    @Override // X.InterfaceC968940bK0
    public final boolean LJIIL() {
        Map<Integer, Integer> map = this.LIZ;
        return map != null && (map.isEmpty() ^ true);
    }

    @Override // X.InterfaceC968930bJz
    public final int LJJIIJZLJL() {
        return this.LJ.size();
    }

    public C968840bJq() {
        new ArrayList();
        this.LIZJ = C2097608Jq.LJ();
        this.LIZLLL = C2097608Jq.LJ();
        this.LJ = C2097608Jq.LJ();
        this.LJFF = C2097608Jq.LJ();
        this.LJI = C2097608Jq.LJ();
    }

    @Override // X.InterfaceC968930bJz
    public final void LJJJJJ() {
        LJ(C2097608Jq.LJ());
        LIZLLL(C2097608Jq.LJ());
    }

    @Override // X.InterfaceC968940bK0
    public final Map<String, OnLineMicInfo> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC968930bJz
    public final Map<String, OnLineMicInfo> LJIIIIZZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC968940bK0
    public final Map<String, OnLineMicInfo> LJJII() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC968930bJz
    public final Map<String, OnLineMicInfo> LJJJJIZL() {
        return this.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo> r6) {
        /*
            r5 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r5.LIZ
            if (r0 == 0) goto L53
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L53
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getValue()
            com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo) r0
            com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo r2 = r0.micPositionData
            if (r2 == 0) goto L15
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r5.LIZ
            if (r1 == 0) goto L51
            java.lang.Object r0 = r3.getValue()
            com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo) r0
            com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo r0 = r0.micPositionData
            if (r0 == 0) goto L4f
            int r0 = r0.position
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3f:
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L51
            int r0 = r0.intValue()
        L4b:
            r2.setUiPos(r0)
            goto L15
        L4f:
            r0 = 0
            goto L3f
        L51:
            r0 = -1
            goto L4b
        L53:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L5b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo) r0
            com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo r0 = r0.micPositionData
            if (r0 == 0) goto L5b
            int r1 = r0.position
            java.lang.Object r0 = r2.getValue()
            com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo) r0
            com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo r0 = r0.micPositionData
            if (r0 == 0) goto L5b
            r0.setUiPos(r1)
            goto L5b
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C968840bJq.LIZJ(java.util.Map):void");
    }

    public final void LIZLLL(final Map<String, OnLineMicInfo> map) {
        C968820bJo c968820bJo = LJII;
        Map<String, OnLineMicInfo> map2 = this.LJFF;
        c968820bJo.getClass();
        if (C968820bJo.LIZ(map2, map)) {
            return;
        }
        this.LJFF = map;
        LIZJ(map);
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0bJr
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MicPositionManager@cd79.mLiveUsersFloatPositionMap$1");
                try {
                    CopyOnWriteArrayList<InterfaceC968880bJu> copyOnWriteArrayList = this.LL.LIZIZ;
                    Map<String, OnLineMicInfo> map3 = map;
                    Iterator<InterfaceC968880bJu> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(map3);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MicPositionManager@cd79.mLiveUsersFloatPositionMap$1");
            }
        });
    }

    public final void LJ(final Map<String, OnLineMicInfo> map) {
        C968820bJo c968820bJo = LJII;
        Map<String, OnLineMicInfo> map2 = this.LJ;
        c968820bJo.getClass();
        if (C968820bJo.LIZ(map2, map)) {
            return;
        }
        this.LJ = map;
        LIZJ(map);
        C473410IhP.LIZIZ(new Runnable() { // from class: X.0bJs
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MicPositionManager@cd79.mLiveUsersPositionMap$1");
                try {
                    CopyOnWriteArrayList<InterfaceC968880bJu> copyOnWriteArrayList = this.LL.LIZIZ;
                    Map<String, OnLineMicInfo> map3 = map;
                    Iterator<InterfaceC968880bJu> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJJZ(map3);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MicPositionManager@cd79.mLiveUsersPositionMap$1");
            }
        });
    }

    @Override // X.InterfaceC968940bK0
    public final OnLineMicInfo LJFF(String str) {
        return this.LIZLLL.get(str);
    }

    @Override // X.InterfaceC968940bK0
    public final int LJII(int i) {
        Integer num;
        if (LJIIL()) {
            Map<Integer, Integer> map = this.LIZ;
            if (map != null && (num = map.get(Integer.valueOf(i))) != null) {
                return num.intValue();
            }
            return -1;
        }
        return i;
    }

    @Override // X.InterfaceC968940bK0
    public final int LJIILLIIL(int i) {
        if (LJIIL()) {
            Map<Integer, Integer> map = this.LIZ;
            if (map != null) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue().intValue() == i) {
                        return entry.getKey().intValue();
                    }
                }
                return -1;
            }
            return -1;
        }
        return i;
    }

    @Override // X.InterfaceC968930bJz
    public final void LJIIZILJ(InterfaceC940430aa1 interfaceC940430aa1) {
        String str;
        String str2;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        String str3;
        int i;
        int i2;
        int i3 = 1;
        if (interfaceC940430aa1 instanceof SeiAppData) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<SeiRegion> list = ((SeiAppData) interfaceC940430aa1).grids;
            if (list != null) {
                for (SeiRegion seiRegion : list) {
                    String str4 = seiRegion.uidStr;
                    if (str4 != null) {
                        String str5 = seiRegion.contentType;
                        if (((str5 == null || CastIntegerProtector.parseInt(str5) != i3) && (((str = seiRegion.contentType) == null || (numLJIIJJI2 = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI2.intValue() != 2) && ((str2 = seiRegion.contentType) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) == null || numLJIIJJI.intValue() != 3))) || (str3 = seiRegion.streamId) == null) {
                            str3 = str4;
                        }
                        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                        builder.setOnLinePattern(i3);
                        int i4 = seiRegion.position;
                        String str6 = seiRegion.contentType;
                        if (str6 != null) {
                            i = CastIntegerProtector.parseInt(str6);
                        } else {
                            i = 0;
                        }
                        builder.setMicPositionData(new MicPositionInfo(0, i4, i4, 0L, i, str4));
                        linkedHashMap.put(str3, builder.build());
                        OnLineMicInfo.Builder builder2 = new OnLineMicInfo.Builder();
                        builder2.setOnLinePattern(1);
                        int i5 = seiRegion.position;
                        String str7 = seiRegion.contentType;
                        if (str7 != null) {
                            i2 = CastIntegerProtector.parseInt(str7);
                        } else {
                            i2 = 0;
                        }
                        builder2.setMicPositionData(new MicPositionInfo(0, i5, i5, 0L, i2, str4));
                        linkedHashMap2.put(str3, builder2.build());
                    }
                    i3 = 1;
                }
            }
            LJ(linkedHashMap);
            LIZLLL(linkedHashMap2);
            return;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        String strLIZIZ = interfaceC940430aa1.LIZIZ();
        Map<String, Integer> mapLIZJ = interfaceC940430aa1.LIZJ();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : mapLIZJ.entrySet()) {
            if ((Intrinsics.LJFF(entry.getKey(), strLIZIZ) && entry.getValue().intValue() == 0) || (!Intrinsics.LJFF(entry.getKey(), strLIZIZ) && entry.getValue().intValue() > 0)) {
                linkedHashMap5.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
            Object key = entry2.getKey();
            OnLineMicInfo.Builder builder3 = new OnLineMicInfo.Builder();
            builder3.setOnLinePattern(1);
            builder3.setMicPositionData(new MicPositionInfo(0, ((Number) entry2.getValue()).intValue(), -1, 0L, 0, null));
            linkedHashMap3.put(key, builder3.build());
            OnLineMicInfo.Builder builder4 = new OnLineMicInfo.Builder();
            builder4.setOnLinePattern(1);
            builder4.setMicPositionData(new MicPositionInfo(0, ((Number) entry2.getValue()).intValue(), -1, 0L, 0, null));
            linkedHashMap4.put(key, builder4.build());
        }
        LJ(linkedHashMap3);
        LIZLLL(linkedHashMap4);
    }

    @Override // X.InterfaceC968930bJz
    public final void LJIJ(Map<Integer, Integer> map) {
        this.LIZ = map;
        LIZJ(this.LIZJ);
        LIZJ(this.LIZLLL);
        LIZJ(this.LJ);
        LIZJ(this.LJFF);
    }

    @Override // X.InterfaceC968940bK0
    public final OnLineMicInfo LJIJI(String str) {
        return this.LIZJ.get(str);
    }

    @Override // X.InterfaceC968930bJz
    public final void LJJIIZI(C969010bK7 c969010bK7) {
        this.LIZIZ.add(c969010bK7);
    }

    @Override // X.InterfaceC968930bJz
    public final OnLineMicInfo LJJIJIIJI(String str) {
        return this.LJ.get(str);
    }

    @Override // X.InterfaceC968930bJz
    public final OnLineMicInfo LJJIJLIJ(String str) {
        return this.LJFF.get(str);
    }
}
