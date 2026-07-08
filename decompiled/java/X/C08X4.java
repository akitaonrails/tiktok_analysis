package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08X4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisNativeGameDownloadManager$getPluginCurrentOrder$2", f = "MinisNativeGameDownloadManager.kt", l = {}, m = "invokeSuspend")
public final class C08X4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public C08X4(InterfaceC1364105Vn<? super C08X4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08X4(interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return invoke2(interfaceC497601wk, (InterfaceC1364105Vn<? super List<String>>) interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object arrayList;
        C1C7U.LIZ("MinisNativeGameDownloadManager@99.getPluginCurrentOrder$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2390509Yh.LIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(C2390509Yh.LJIJ());
        if (c0vsj.exists() && c0vsj.length() != 0) {
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(C09BH.LJI(c0vsj, Charsets.UTF_8)), "plugin_order_history");
                arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList = C13BV.INSTANCE;
            }
            C1C7U.LIZIZ("MinisNativeGameDownloadManager@99.getPluginCurrentOrder$2");
            return arrayList;
        }
        C13BV c13bv = C13BV.INSTANCE;
        C1C7U.LIZIZ("MinisNativeGameDownloadManager@99.getPluginCurrentOrder$2");
        return c13bv;
    }
}
