package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0gyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.slash.plugin.SlashPerformancePlugin$exeTrackActions$1", f = "SlashPerformancePlugin.kt", l = {}, m = "invokeSuspend")
public final class C1186380gyi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<InterfaceC1186470gyr> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ C1186370gyh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1186380gyi(List<InterfaceC1186470gyr> list, Map<String, ? extends Object> map, C1186370gyh c1186370gyh, InterfaceC1364105Vn<? super C1186380gyi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = map;
        this.LLILLL = c1186370gyh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1186380gyi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iHi;
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        Object[] objArr;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        C1C7U.LIZ("SlashPerformancePlugin@3244.exeTrackActions$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        System.currentTimeMillis();
        Iterator<InterfaceC1186470gyr> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            InterfaceC1186470gyr next = it2.next();
            if (next instanceof C1186430gyn) {
                C1187670h0n c1187670h0n = C1187670h0n.LIZ;
                C1186430gyn c1186430gyn = (C1186430gyn) next;
                String str2 = c1186430gyn.LIZ;
                int i = c1186430gyn.LIZIZ;
                Map<String, Object> map = this.LLILLJJLI;
                String str3 = c1186430gyn.LIZJ;
                c1187670h0n.getClass();
                C1187670h0n.LIZLLL(i, str2, str3, map);
            } else {
                String str4 = "";
                if (next instanceof C1186410gyl) {
                    C1187670h0n c1187670h0n2 = C1187670h0n.LIZ;
                    C1186410gyl c1186410gyl = (C1186410gyl) next;
                    String str5 = c1186410gyl.LIZ;
                    String str6 = c1186410gyl.LIZIZ;
                    long j = c1186410gyl.LIZJ;
                    Map<String, Object> map2 = this.LLILLJJLI;
                    String str7 = c1186410gyl.LIZLLL;
                    c1187670h0n2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("key", "chunk_duration");
                    if (str5 == null) {
                        str5 = "";
                    }
                    linkedHashMap.put("biz", str5);
                    linkedHashMap.put("duration", String.valueOf(j));
                    linkedHashMap.put("chunk_name", str6);
                    if (map2 != null) {
                        for (Map.Entry<String, Object> entry : map2.entrySet()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                        }
                    }
                    if (str7 != null) {
                        linkedHashMap.put(Scene.SCENE_SERVICE, "component_refresh");
                    } else {
                        linkedHashMap.put(Scene.SCENE_SERVICE, "page_refresh");
                        str7 = "";
                    }
                    linkedHashMap.put("from_instance_id", str7);
                    C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap);
                    C1187670h0n c1187670h0n3 = C1187670h0n.LIZ;
                    String str8 = c1186410gyl.LIZ;
                    String str9 = c1186410gyl.LIZIZ;
                    Long lLJFF = C2286608xc.LJFF(c1186410gyl.LIZJ);
                    Integer numLJ = C2286608xc.LJ(this.LLILLL.LLILLJJLI ? 1 : 0);
                    C1186370gyh c1186370gyh = this.LLILLL;
                    String str10 = c1186410gyl.LIZIZ;
                    InterfaceC1181010gq3 interfaceC1181010gq3 = c1186370gyh.LL;
                    int iLg = 0;
                    if (interfaceC1181010gq3 != null) {
                        iHi = interfaceC1181010gq3.hi(str10);
                    } else {
                        iHi = 0;
                    }
                    InterfaceC1181010gq3 interfaceC1181010gq32 = c1186370gyh.LL;
                    if (interfaceC1181010gq32 != null) {
                        iLg = interfaceC1181010gq32.Lg();
                    }
                    if (iHi <= 0 && iLg <= 0) {
                        str = "first";
                    } else {
                        str = "act";
                    }
                    Map<String, Object> map3 = this.LLILLJJLI;
                    long j2 = c1186410gyl.LJ;
                    c1187670h0n3.getClass();
                    if (map3 != null && (obj10 = map3.get("poi_id")) != null) {
                        string = obj10.toString();
                    } else {
                        string = null;
                    }
                    if (map3 != null && (obj9 = map3.get("collect_info")) != null) {
                        string2 = obj9.toString();
                    } else {
                        string2 = null;
                    }
                    if (map3 != null && (obj8 = map3.get("enter_from")) != null) {
                        string3 = obj8.toString();
                    } else {
                        string3 = null;
                    }
                    if (map3 != null && (obj7 = map3.get("enter_method")) != null) {
                        string4 = obj7.toString();
                    } else {
                        string4 = null;
                    }
                    if (map3 != null && (obj6 = map3.get("initial_poi_enter_from")) != null) {
                        string5 = obj6.toString();
                    } else {
                        string5 = null;
                    }
                    if (map3 != null && (obj5 = map3.get("initial_poi_enter_method")) != null) {
                        string6 = obj5.toString();
                    } else {
                        string6 = null;
                    }
                    if (map3 != null && (obj4 = map3.get("session_id")) != null) {
                        string7 = obj4.toString();
                    } else {
                        string7 = null;
                    }
                    if (map3 != null && (obj3 = map3.get("has_enter_poi")) != null) {
                        string8 = obj3.toString();
                    } else {
                        string8 = null;
                    }
                    if (map3 != null && (obj2 = map3.get("has_enter_same_poi")) != null) {
                        string9 = obj2.toString();
                    } else {
                        string9 = null;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("key", "data_return");
                    if (str8 == null) {
                        str8 = "";
                    }
                    linkedHashMap2.put("biz", str8);
                    if (str9 == null) {
                        str9 = "";
                    }
                    linkedHashMap2.put("instance_id", str9);
                    if (string == null) {
                        string = "";
                    }
                    linkedHashMap2.put("poi_id", string);
                    linkedHashMap2.put("duration", String.valueOf(lLJFF));
                    if (numLJ == null || (string10 = numLJ.toString()) == null) {
                        string10 = "";
                    }
                    linkedHashMap2.put("page_left", string10);
                    linkedHashMap2.put("refresh_code", str);
                    if (string2 == null) {
                        string2 = "";
                    }
                    linkedHashMap2.put("collect_info", string2);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    if (string3 == null) {
                        string3 = "";
                    }
                    linkedHashMap3.put("enter_from", string3);
                    if (string4 == null) {
                        string4 = "";
                    }
                    linkedHashMap3.put("enter_method", string4);
                    if (string5 == null) {
                        string5 = "";
                    }
                    linkedHashMap3.put("initial_poi_enter_from", string5);
                    if (string6 == null) {
                        string6 = "";
                    }
                    linkedHashMap3.put("initial_poi_enter_method", string6);
                    linkedHashMap2.put("biz_common_params", C2365509Or.LJ(linkedHashMap3));
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    if (string7 == null) {
                        string7 = "";
                    }
                    linkedHashMap4.put("session_id", string7);
                    boolean zLJFF = Intrinsics.LJFF(string8, "true");
                    String str11 = CardStruct.IStatusCode.DEFAULT;
                    if (zLJFF) {
                        objArr = CardStruct.IStatusCode.DEFAULT;
                    } else if (!Intrinsics.LJFF(string8, "false")) {
                        objArr = "";
                    } else {
                        objArr = "1";
                    }
                    linkedHashMap4.put("is_first_enter_page", objArr);
                    if (!Intrinsics.LJFF(string9, "true")) {
                        if (!Intrinsics.LJFF(string9, "false")) {
                            str11 = "";
                        } else {
                            str11 = "1";
                        }
                    }
                    linkedHashMap4.put("is_first_enter_same_poi_page", str11);
                    linkedHashMap2.put("tech_common_params", C2365509Or.LJ(linkedHashMap4));
                    linkedHashMap2.put("stay_time", String.valueOf(j2));
                    C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap2);
                } else if (next instanceof C1186440gyo) {
                    C1187670h0n c1187670h0n4 = C1187670h0n.LIZ;
                    C1186440gyo c1186440gyo = (C1186440gyo) next;
                    String str12 = c1186440gyo.LIZ;
                    String str13 = c1186440gyo.LIZIZ;
                    c1187670h0n4.getClass();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap5.put("key", "data_parse_result");
                    if (str12 != null) {
                        str4 = str12;
                    }
                    linkedHashMap5.put("biz", str4);
                    linkedHashMap5.put("result_type", str13);
                    C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap5);
                } else if (next instanceof C1186420gym) {
                    C1187670h0n c1187670h0n5 = C1187670h0n.LIZ;
                    C1186420gym c1186420gym = (C1186420gym) next;
                    String str14 = c1186420gym.LIZ;
                    long j3 = c1186420gym.LIZIZ;
                    c1187670h0n5.getClass();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    linkedHashMap6.put("key", "data_parse_duration");
                    if (str14 != null) {
                        str4 = str14;
                    }
                    linkedHashMap6.put("biz", str4);
                    linkedHashMap6.put("duration", String.valueOf(j3));
                    C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap6);
                }
            }
            it2.remove();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlashPerformancePlugin@3244.exeTrackActions$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
