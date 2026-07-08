package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.LsImageReporter$handleImageLoaded$1", f = "LsImageReporter.kt", l = {}, m = "invokeSuspend")
public final class C1202660hOy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1202680hP0 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<Map<String, String>, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1202660hOy(JSONObject jSONObject, boolean z, C1202680hP0 c1202680hP0, int i, String str, Function1<? super Map<String, String>, Unit> function1, InterfaceC1364105Vn<? super C1202660hOy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = jSONObject;
        this.LLILLJJLI = z;
        this.LLILLL = c1202680hP0;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1202660hOy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LsImageReporter@96fe.handleImageLoaded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1336320ksY c1336320ksY = C1336320ksY.LIZ;
            JSONObject jSONObject = this.LL;
            boolean z = this.LLILLJJLI;
            c1336320ksY.getClass();
            C1336320ksY.LJI(linkedHashMap, jSONObject, z);
            C1202680hP0 c1202680hP0 = this.LLILLL;
            if (c1202680hP0 != null) {
                String str = c1202680hP0.LIZ;
                if (str != null) {
                    linkedHashMap.put("poi_id", str);
                }
                String str2 = c1202680hP0.LIZIZ;
                if (str2 != null) {
                    linkedHashMap.put("image_source", str2);
                }
                String str3 = c1202680hP0.LIZJ;
                if (str3 != null) {
                    linkedHashMap.put("instance_id", str3);
                }
                String str4 = c1202680hP0.LIZLLL;
                if (str4 != null) {
                    linkedHashMap.put("sub_scene", str4);
                }
                String str5 = c1202680hP0.LJ;
                if (str5 != null) {
                    linkedHashMap.put("data_source", str5);
                }
            }
            Map<String, String> mapLJ = C1336320ksY.LIZIZ.LJ(C2286608xc.LJ(this.LLILZ));
            if (mapLJ != null) {
                linkedHashMap.putAll(mapLJ);
                C1336320ksY.LJIIIIZZ(this.LLILZIL, linkedHashMap);
                Function1<Map<String, String>, Unit> function1 = this.LLILZLL;
                if (function1 != null) {
                    function1.invoke(linkedHashMap);
                }
            } else {
                C1336320ksY.LIZJ.LIZLLL(C2286608xc.LJ(this.LLILZ), linkedHashMap);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LsImageReporter@96fe.handleImageLoaded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
