package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20610615ku extends C09AY implements Function2<String, HashMap<String, String>, Unit> {
    public final /* synthetic */ C20608715kb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20610615ku(C20608715kb c20608715kb) {
        super(2);
        this.LL = c20608715kb;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, HashMap<String, String> map) {
        Function2<String, HashMap<String, String>, Unit> function2LJI = this.LL.LIZIZ().LJI();
        if (function2LJI != null) {
            function2LJI.invoke(str, map);
        }
        return Unit.LIZ;
    }
}
