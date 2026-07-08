package X;

import com.ss.android.ugc.aweme.feed.model.live.DeletedLiveInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602290rnX extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ C1602310rnZ LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C259800zU<List<String>> LLILZIL;
    public final /* synthetic */ C259800zU<List<String>> LLILZLL;
    public final /* synthetic */ C259800zU<List<String>> LLIZ;
    public final /* synthetic */ List<DeletedLiveInfo> LLIZLLLIL;
    public final /* synthetic */ List<String> LLJ;
    public final /* synthetic */ C118300cf LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602290rnX(Map<String, String> map, C1602310rnZ c1602310rnZ, int i, int i2, C259800zU<List<String>> c259800zU, C259800zU<List<String>> c259800zU2, C259800zU<List<String>> c259800zU3, List<DeletedLiveInfo> list, List<String> list2, C118300cf c118300cf) {
        super(2);
        this.LL = map;
        this.LLILLJJLI = c1602310rnZ;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
        this.LLIZ = c259800zU3;
        this.LLIZLLLIL = list;
        this.LLJ = list2;
        this.LLJI = c118300cf;
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
            this.LLILLJJLI.LJIIL(this.LLILLL, this.LLILZ, this.LLILZIL.element, this.LLILZLL.element, this.LLIZ.element, this.LLIZLLLIL, this.LLJ, this.LLJI.element, this.LL, true, str2);
        }
        return Unit.LIZ;
    }
}
