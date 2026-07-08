package X;

import com.bytedance.ies.sdk.datachannel.Channel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ewA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107920ewA extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Map.Entry<Class<? extends Channel<Boolean>>, EnumC1107860ew4> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1107920ewA(Map.Entry<? extends Class<? extends Channel<Boolean>>, ? extends EnumC1107860ew4> entry) {
        super(1);
        this.LL = entry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        EnumC1107860ew4 enumC1107860ew4;
        boolean zBooleanValue = bool.booleanValue();
        if (zBooleanValue && (enumC1107860ew4 = C1107850ew3.LLIZ) != null) {
            C1107850ew3 c1107850ew3 = C1107850ew3.LL;
            C1107850ew3.LIZLLL(enumC1107860ew4, EnumC1108010ewJ.COVER, null);
        }
        Map<EnumC1107860ew4, InterfaceC1107910ew9> map = C1107850ew3.LLILZIL;
        Map.Entry<Class<? extends Channel<Boolean>>, EnumC1107860ew4> entry = this.LL;
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1107910ew9) ((Map.Entry) it2.next()).getValue()).LIZJ(entry.getValue(), zBooleanValue);
        }
        return Unit.LIZ;
    }
}
