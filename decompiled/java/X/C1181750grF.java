package X;

import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0grF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.slash.plugin.SlashSerialLoadPlugin$onFinalChunk$2$3", f = "SlashSerialLoadPlugin.kt", l = {}, m = "invokeSuspend")
public final class C1181750grF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1181730grD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181750grF(C1181730grD c1181730grD, InterfaceC1364105Vn<? super C1181750grF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1181730grD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1181750grF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        C1180920gpu c1180920gpu;
        BaseComponentData baseComponentData;
        C1C7U.LIZ("SlashSerialLoadPlugin@753b.onFinalChunk$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1181800grK> list = this.LL.LLILZIL;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((C1181800grK) it2.next()).LIZIZ != EnumC1181780grI.LOAD_FINISH) {
                    C1181730grD c1181730grD = this.LL;
                    c1181730grD.LLIZLLLIL = true;
                    c1181730grD.LLILLL.invoke(c1181730grD.LLJ);
                    Iterator<Map.Entry<String, C1181810grL>> it3 = this.LL.LLILZLL.entrySet().iterator();
                    while (true) {
                        str = null;
                        if (!it3.hasNext()) {
                            break;
                        }
                        it3.next().getValue().job.LIZIZ(null);
                    }
                    this.LL.LLILZLL.clear();
                    Iterator it4 = ((ArrayList) this.LL.LLILZIL).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (((C1181800grK) next).LIZIZ == EnumC1181780grI.LOADING) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C1181800grK c1181800grK = (C1181800grK) next;
                    if (c1181800grK != null && (c1180920gpu = c1181800grK.LIZJ) != null && (baseComponentData = c1180920gpu.LIZLLL) != null) {
                        str = baseComponentData.instanceId;
                    }
                    this.LL.LJJIFFI(EnumC1181770grH.LOAD_SERIAL_LOAD_TIME_OUT, str);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.onFinalChunk$2$3");
                    return unit;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.onFinalChunk$2$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
