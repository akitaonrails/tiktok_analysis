package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.LsImageReporter$handleImageSensible$1", f = "LsImageReporter.kt", l = {}, m = "invokeSuspend")
public final class C1202670hOz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C1202680hP0 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function1<Map<String, String>, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1202670hOz(String str, String str2, JSONObject jSONObject, long j, C1202680hP0 c1202680hP0, String str3, int i, String str4, Function1<? super Map<String, String>, Unit> function1, InterfaceC1364105Vn<? super C1202670hOz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = jSONObject;
        this.LLILZ = j;
        this.LLILZIL = c1202680hP0;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = str4;
        this.LLJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1202670hOz(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objOpt;
        Boolean bool;
        Object objOpt2;
        Object objOpt3;
        Number numberLJ;
        Object objOpt4;
        Object objOpt5;
        String str;
        Object obj2;
        String str2;
        Number number;
        Object obj3;
        C1C7U.LIZ("LsImageReporter@96fe.handleImageSensible$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_tag", this.LL);
            if (C123100dR.LIZ(this.LLILLJJLI)) {
                linkedHashMap.put("scene_tag", this.LLILLJJLI);
            }
            JSONObject jSONObject = this.LLILLL;
            String str3 = null;
            if (jSONObject != null) {
                objOpt = jSONObject.opt("isSuccess");
            } else {
                objOpt = null;
            }
            if (objOpt instanceof Boolean) {
                bool = (Boolean) objOpt;
            } else {
                bool = null;
            }
            String str4 = "1";
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_success", obj3);
            }
            JSONObject jSONObject2 = this.LLILLL;
            if (jSONObject2 != null) {
                objOpt2 = jSONObject2.opt("duration");
            } else {
                objOpt2 = null;
            }
            if ((objOpt2 instanceof Number) && (number = (Number) objOpt2) != null) {
                linkedHashMap.put("overall_duration", number.toString());
            }
            linkedHashMap.put("total_duration", String.valueOf(this.LLILZ));
            JSONObject jSONObject3 = this.LLILLL;
            if (jSONObject3 == null) {
                objOpt3 = null;
            } else {
                objOpt3 = jSONObject3.opt("from");
            }
            if (objOpt3 instanceof Number) {
                numberLJ = (Number) objOpt3;
            } else {
                numberLJ = null;
            }
            if (numberLJ == null) {
                numberLJ = C2286608xc.LJ(-1);
            }
            linkedHashMap.put("from", numberLJ.toString());
            JSONObject jSONObject4 = this.LLILLL;
            if (jSONObject4 != null) {
                objOpt4 = jSONObject4.opt("image_type");
            } else {
                objOpt4 = null;
            }
            if ((objOpt4 instanceof String) && (str2 = (String) objOpt4) != null) {
                linkedHashMap.put("codeType", str2);
            }
            JSONObject jSONObject5 = this.LLILLL;
            if (jSONObject5 != null) {
                objOpt5 = jSONObject5.opt("uri");
            } else {
                objOpt5 = null;
            }
            if (objOpt5 instanceof String) {
                str3 = (String) objOpt5;
            }
            C1336320ksY c1336320ksY = C1336320ksY.LIZ;
            String str5 = "";
            if (str3 == null) {
                str = "";
            } else {
                str = str3;
            }
            c1336320ksY.getClass();
            C603820NmG<String, Boolean> c603820NmG = C1336320ksY.LJ;
            if (c603820NmG.LIZJ(str) != null) {
                c603820NmG.LJ(str);
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_preload", obj2);
            if (str3 != null) {
                str5 = str3;
            }
            C603820NmG<String, Boolean> c603820NmG2 = C1336320ksY.LJFF;
            if (c603820NmG2.LIZJ(str5) != null) {
                c603820NmG2.LJ(str5);
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("handler_opt", str4);
            C1336320ksY.LIZLLL(str3, linkedHashMap);
            linkedHashMap.put("dpr", String.valueOf(C1336320ksY.LJI));
            C1202680hP0 c1202680hP0 = this.LLILZIL;
            if (c1202680hP0 != null) {
                String str6 = c1202680hP0.LIZ;
                if (str6 != null) {
                    linkedHashMap.put("poi_id", str6);
                }
                String str7 = c1202680hP0.LIZIZ;
                if (str7 != null) {
                    linkedHashMap.put("image_source", str7);
                }
                String str8 = c1202680hP0.LIZJ;
                if (str8 != null) {
                    linkedHashMap.put("instance_id", str8);
                }
                String str9 = c1202680hP0.LIZLLL;
                if (str9 != null) {
                    linkedHashMap.put("sub_scene", str9);
                }
                String str10 = c1202680hP0.LJ;
                if (str10 != null) {
                    linkedHashMap.put("data_source", str10);
                }
            }
            linkedHashMap.put("page_state", this.LLILZLL);
            if (!Intrinsics.LJFF(numberLJ, C2286608xc.LJ(0)) && !Intrinsics.LJFF(numberLJ, C2286608xc.LJ(-1))) {
                C1336320ksY.LJIIIIZZ(this.LLIZLLLIL, linkedHashMap);
                Function1<Map<String, String>, Unit> function1 = this.LLJ;
                if (function1 != null) {
                    function1.invoke(linkedHashMap);
                }
            } else {
                Map<String, String> mapLJ = C1336320ksY.LIZJ.LJ(C2286608xc.LJ(this.LLIZ));
                if (mapLJ != null) {
                    mapLJ.putAll(linkedHashMap);
                    C1336320ksY.LJIIIIZZ(this.LLIZLLLIL, mapLJ);
                    Function1<Map<String, String>, Unit> function12 = this.LLJ;
                    if (function12 != null) {
                        function12.invoke(mapLJ);
                    }
                } else {
                    C1336320ksY.LIZIZ.LIZLLL(C2286608xc.LJ(this.LLIZ), linkedHashMap);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LsImageReporter@96fe.handleImageSensible$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
