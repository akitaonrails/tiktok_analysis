package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C968830bJp implements InterfaceC968930bJz {
    public final Function1<Map<String, OnLineMicInfo>, Unit> LIZ;
    public Map<String, OnLineMicInfo> LIZIZ = C2097608Jq.LJ();
    public Map<String, OnLineMicInfo> LIZJ = C2097608Jq.LJ();
    public Map<Integer, Integer> LIZLLL;

    @Override // X.InterfaceC968930bJz
    public final void LJJJJJ() {
    }

    @Override // X.InterfaceC968930bJz
    public final int LJJIIJZLJL() {
        return this.LIZIZ.size();
    }

    @Override // X.InterfaceC968930bJz
    public final Map<String, OnLineMicInfo> LJIIIIZZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC968930bJz
    public final Map<String, OnLineMicInfo> LJJJJIZL() {
        return this.LIZJ;
    }

    public C968830bJp(C967460bHc c967460bHc) {
        this.LIZ = c967460bHc;
    }

    @Override // X.InterfaceC968930bJz
    public final void LJIIZILJ(InterfaceC940430aa1 interfaceC940430aa1) {
        String str;
        String str2;
        String str3;
        int iIntValue;
        int i;
        int iIntValue2;
        int i2;
        Integer num;
        Integer num2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i3 = 1;
        if (interfaceC940430aa1 instanceof SeiAppData) {
            List<SeiRegion> list = ((SeiAppData) interfaceC940430aa1).grids;
            if (list != null) {
                for (SeiRegion seiRegion : list) {
                    String str4 = seiRegion.uidStr;
                    if (str4 != null) {
                        String str5 = seiRegion.contentType;
                        if (((str5 == null || CastIntegerProtector.parseInt(str5) != i3) && (((str = seiRegion.contentType) == null || CastIntegerProtector.parseInt(str) != 2) && ((str2 = seiRegion.contentType) == null || CastIntegerProtector.parseInt(str2) != 3))) || (str3 = seiRegion.streamId) == null) {
                            str3 = str4;
                        }
                        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
                        builder.setOnLinePattern(i3);
                        int i4 = seiRegion.position;
                        Map<Integer, Integer> map = this.LIZLLL;
                        if (map != null && (num2 = map.get(Integer.valueOf(i4))) != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = i4;
                        }
                        String str6 = seiRegion.contentType;
                        if (str6 != null) {
                            i = CastIntegerProtector.parseInt(str6);
                        } else {
                            i = 0;
                        }
                        builder.setMicPositionData(new MicPositionInfo(0, i4, iIntValue, 0L, i, str4));
                        linkedHashMap.put(str3, builder.build());
                        OnLineMicInfo.Builder builder2 = new OnLineMicInfo.Builder();
                        builder2.setOnLinePattern(1);
                        int i5 = seiRegion.position;
                        Map<Integer, Integer> map2 = this.LIZLLL;
                        if (map2 != null && (num = map2.get(Integer.valueOf(i5))) != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = i5;
                        }
                        String str7 = seiRegion.contentType;
                        if (str7 != null) {
                            i2 = CastIntegerProtector.parseInt(str7);
                        } else {
                            i2 = 0;
                        }
                        builder2.setMicPositionData(new MicPositionInfo(0, i5, iIntValue2, 0L, i2, str4));
                        linkedHashMap2.put(str3, builder2.build());
                    }
                    i3 = 1;
                }
            }
        } else {
            String strLIZIZ = interfaceC940430aa1.LIZIZ();
            Map<String, Integer> mapLIZJ = interfaceC940430aa1.LIZJ();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry<String, Integer> entry : mapLIZJ.entrySet()) {
                if ((Intrinsics.LJFF(entry.getKey(), strLIZIZ) && entry.getValue().intValue() == 0) || (!Intrinsics.LJFF(entry.getKey(), strLIZIZ) && entry.getValue().intValue() > 0)) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                Object key = entry2.getKey();
                OnLineMicInfo.Builder builder3 = new OnLineMicInfo.Builder();
                builder3.setOnLinePattern(1);
                builder3.setMicPositionData(new MicPositionInfo(0, ((Number) entry2.getValue()).intValue(), -1, 0L, 0, null));
                linkedHashMap.put(key, builder3.build());
                OnLineMicInfo.Builder builder4 = new OnLineMicInfo.Builder();
                builder4.setOnLinePattern(1);
                builder4.setMicPositionData(new MicPositionInfo(0, ((Number) entry2.getValue()).intValue(), -1, 0L, 0, null));
                linkedHashMap2.put(key, builder4.build());
            }
        }
        C968820bJo c968820bJo = C968840bJq.LJII;
        Map<String, OnLineMicInfo> map3 = this.LIZIZ;
        c968820bJo.getClass();
        if (!C968820bJo.LIZ(map3, linkedHashMap)) {
            this.LIZIZ = linkedHashMap;
            C473410IhP.LIZIZ(new Runnable() { // from class: X.0bJt
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RustAudiencePositionManager@ec86.updateMicPositionInfoBySei$4");
                    try {
                        C968830bJp c968830bJp = this.LL;
                        c968830bJp.LIZ.invoke(c968830bJp.LIZIZ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RustAudiencePositionManager@ec86.updateMicPositionInfoBySei$4");
                }
            });
        }
        if (!C968820bJo.LIZ(this.LIZJ, linkedHashMap2)) {
            this.LIZJ = linkedHashMap2;
        }
    }

    @Override // X.InterfaceC968930bJz
    public final void LJIJ(Map<Integer, Integer> map) {
        this.LIZLLL = map;
        LIZJ(this.LIZIZ, map);
        LIZJ(this.LIZJ, map);
    }

    @Override // X.InterfaceC968930bJz
    public final OnLineMicInfo LJJIJIIJI(String str) {
        return this.LIZIZ.get(str);
    }

    @Override // X.InterfaceC968930bJz
    public final OnLineMicInfo LJJIJLIJ(String str) {
        return this.LIZJ.get(str);
    }

    public static void LIZJ(Map map, Map map2) {
        int iIntValue;
        if (!map2.isEmpty()) {
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                MicPositionInfo micPositionInfo = ((OnLineMicInfo) it2.next()).micPositionData;
                if (micPositionInfo != null) {
                    Integer num = (Integer) map2.get(Integer.valueOf(micPositionInfo.position));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    micPositionInfo.setUiPos(iIntValue);
                }
            }
            return;
        }
        Iterator it3 = map.values().iterator();
        while (it3.hasNext()) {
            MicPositionInfo micPositionInfo2 = ((OnLineMicInfo) it3.next()).micPositionData;
            if (micPositionInfo2 != null) {
                micPositionInfo2.setUiPos(micPositionInfo2.position);
            }
        }
    }
}
