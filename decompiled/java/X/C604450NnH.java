package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.jsb.PipoProbeCollectLocationMethodIDL$handle$1$1", f = "PipoProbeCollectLocationMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C604450NnH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ CompletionBlock<InterfaceC604470NnJ> LLILLJJLI;
    public final /* synthetic */ C604500NnM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604450NnH(Map<String, ? extends Object> map, CompletionBlock<InterfaceC604470NnJ> completionBlock, C604500NnM c604500NnM, InterfaceC1364105Vn<? super C604450NnH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = c604500NnM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604450NnH(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Map mapLJIIIIZZ;
        C1C7U.LIZ("PipoProbeCollectLocationMethodIDL@3d40.handle$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, Object> map = this.LL;
        String containerID = null;
        if (map != null) {
            obj2 = map.get("gps_coordinate");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Map) {
            mapLJIIIIZZ = (Map) obj2;
        } else {
            mapLJIIIIZZ = null;
        }
        if (mapLJIIIIZZ == null) {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("permission", "no_access"), new Pair("longitude", ""), new Pair("latitude", ""));
        }
        CompletionBlock<InterfaceC604470NnJ> completionBlock = this.LLILLJJLI;
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLL.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC604470NnJ.class, containerID);
        InterfaceC604470NnJ interfaceC604470NnJ = (InterfaceC604470NnJ) xBaseModelLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIIIZZ.size()));
        for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap.put(key, value);
        }
        interfaceC604470NnJ.setGpsCoordinate(linkedHashMap);
        interfaceC604470NnJ.setSupported(true);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoProbeCollectLocationMethodIDL@3d40.handle$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
