package X;

import android.net.Uri;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.lite.LiteLynxKitView$load$2", f = "LiteLynxKitView.kt", l = {}, m = "invokeSuspend")
public final class C1522570pix extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1537720q7O LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1522570pix(C1537720q7O c1537720q7O, InterfaceC1364105Vn<? super C1522570pix> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1537720q7O;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1522570pix(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Uri uriLIZ;
        String schema;
        C1537480q70 hybridContext;
        String strLJIIJJI;
        C1C7U.LIZ("LiteLynxKitView@73dd.load$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1537910q7h c1537910q7h = this.LL.LLILZIL;
            if (c1537910q7h != null) {
                uriLIZ = c1537910q7h.LIZ();
            } else {
                uriLIZ = null;
            }
            linkedHashMap.put("last_lynx_url", String.valueOf(uriLIZ));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C1529870puj.LIZ.getClass();
            for (Map.Entry entry : ((LinkedHashMap) C1529870puj.LIZLLL()).entrySet()) {
                InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) ((WeakReference) entry.getValue()).get();
                if (interfaceC1541990qEH == null || (schema = interfaceC1541990qEH.getSchema()) == null) {
                    schema = "";
                }
                arrayList.add(schema);
                InterfaceC1541990qEH interfaceC1541990qEH2 = (InterfaceC1541990qEH) ((WeakReference) entry.getValue()).get();
                if (interfaceC1541990qEH2 != null && (hybridContext = interfaceC1541990qEH2.getHybridContext()) != null && (strLJIIJJI = hybridContext.LJIIJJI()) != null) {
                    arrayList2.add(strLJIIJJI);
                }
            }
            linkedHashMap.put("recent_lynx_url_list", arrayList.toString());
            linkedHashMap.put("lynx_instance_num", String.valueOf(arrayList.size()));
            linkedHashMap.put("lynx_version", LynxEnv.inst().getLynxVersion());
            Npth.addTags(linkedHashMap);
            C1520970pgN c1520970pgN = C1520970pgN.LIZ;
            String strLJIJI = this.LL.getHybridContext().LJIJI();
            EnumC1520910pgH enumC1520910pgH = EnumC1520910pgH.LYNX;
            c1520970pgN.getClass();
            C1520970pgN.LIZIZ(strLJIJI, enumC1520910pgH, arrayList2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1490740otc.LIZIZ(C1490740otc.LIZ, String.valueOf(th.getMessage()), EnumC1490770otf.E, null, 4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiteLynxKitView@73dd.load$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
