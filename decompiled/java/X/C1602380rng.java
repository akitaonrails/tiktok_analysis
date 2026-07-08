package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602380rng extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ C1602310rnZ LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C259800zU<List<String>> LLILZ;
    public final /* synthetic */ C259800zU<List<String>> LLILZIL;
    public final /* synthetic */ C259800zU<List<String>> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602380rng(Map<String, String> map, C1602310rnZ c1602310rnZ, C118300cf c118300cf, C259800zU<List<String>> c259800zU, C259800zU<List<String>> c259800zU2, C259800zU<List<String>> c259800zU3, int i) {
        super(2);
        this.LL = map;
        this.LLILLJJLI = c1602310rnZ;
        this.LLILLL = c118300cf;
        this.LLILZ = c259800zU;
        this.LLILZIL = c259800zU2;
        this.LLILZLL = c259800zU3;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        String str2 = str;
        if (bool.booleanValue()) {
            C1602350rnd c1602350rnd = C1602350rnd.LIZ;
            Map<String, String> map = this.LL;
            c1602350rnd.getClass();
            C1602350rnd.LIZ(1, map);
        } else {
            this.LLILLJJLI.LJIL(this.LLILLL.element, this.LLILZ.element, this.LLILZIL.element, this.LLILZLL.element, this.LLIZ, this.LL, true, str2);
        }
        return Unit.LIZ;
    }
}
