package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0L42, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L42 extends C09AY implements Function1<Map<String, ? extends C532330KuF>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function1<C536920L3y, Unit> LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ Function1<C532330KuF, Unit> LLIZ;
    public final /* synthetic */ Function2<String, String, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L42(String str, AFwS239S0000000_8 aFwS239S0000000_8, C118300cf c118300cf, C259800zU c259800zU, long j, C259800zU c259800zU2, Function1 function1, Function2 function2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = aFwS239S0000000_8;
        this.LLILLL = c118300cf;
        this.LLILZ = c259800zU;
        this.LLILZIL = j;
        this.LLILZLL = c259800zU2;
        this.LLIZ = function1;
        this.LLIZLLLIL = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends C532330KuF> map) {
        String str;
        String str2;
        String str3;
        Map<String, ? extends C532330KuF> map2 = map;
        C532330KuF c532330KuF = map2.get(this.LL);
        if (c532330KuF == null && (c532330KuF = (C532330KuF) C13LP.LJJJLIIL(map2.values())) == null) {
            str = null;
        } else {
            str = c532330KuF.LIZ;
        }
        Function1<C536920L3y, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            boolean zLIZ = C123100dR.LIZ(str);
            int i = this.LLILLL.element;
            if (C123100dR.LIZ(str)) {
                str3 = this.LLILZ.element;
            } else {
                str3 = "template url is empty";
            }
            function1.invoke(new C536920L3y(this.LLILZIL, i, str3, this.LLILZLL.element, zLIZ));
        }
        if (c532330KuF != null && C123100dR.LIZ(str)) {
            this.LLIZ.invoke(c532330KuF);
        } else {
            Function2<String, String, Unit> function2 = this.LLIZLLLIL;
            if (function2 != null) {
                if (c532330KuF == null) {
                    str2 = "templateData is null";
                } else {
                    str2 = "templateUrl is null";
                }
                function2.invoke(str2, this.LLILZLL.element);
            }
        }
        return Unit.LIZ;
    }
}
