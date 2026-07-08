package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0owG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492380owG extends C09AY implements Function2<EnumC1492290ow7, HashMap<String, HashMap<String, Object>>, Unit> {
    public final /* synthetic */ AbstractC1492360owE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1492380owG(AbstractC1492360owE abstractC1492360owE) {
        super(2);
        this.LL = abstractC1492360owE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EnumC1492290ow7 enumC1492290ow7, HashMap<String, HashMap<String, Object>> map) {
        EnumC1492290ow7 enumC1492290ow72 = enumC1492290ow7;
        HashMap<String, HashMap<String, Object>> map2 = map;
        AbstractC1492360owE abstractC1492360owE = this.LL;
        if (!abstractC1492360owE.LJ) {
            abstractC1492360owE.LJ = true;
            abstractC1492360owE.LIZJ = Long.valueOf(System.currentTimeMillis());
            AbstractC1492360owE abstractC1492360owE2 = this.LL;
            abstractC1492360owE2.LIZLLL = new C1492390owH(enumC1492290ow72, map2);
            abstractC1492360owE2.LIZJ(enumC1492290ow72, map2);
        }
        return Unit.LIZ;
    }
}
