package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181611AZr extends C09AY implements Function2<Long, C2182171Aal, Unit> {
    public final /* synthetic */ C2181471AZd LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C259800zU<List<C1276780jKW>> LLILZIL;
    public final /* synthetic */ JSONObject LLILZLL;
    public final /* synthetic */ JSONObject LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181611AZr(C2181471AZd c2181471AZd, String str, String str2, String str3, C259800zU<List<C1276780jKW>> c259800zU, JSONObject jSONObject, JSONObject jSONObject2) {
        super(2);
        this.LL = c2181471AZd;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c259800zU;
        this.LLILZLL = jSONObject;
        this.LLIZ = jSONObject2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, C2182171Aal c2182171Aal) {
        long jLongValue = l.longValue();
        this.LL.getClass();
        List<C1276780jKW> listLJ = C2181471AZd.LJ(c2182171Aal);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task invoke, layout animation task[");
        sbLIZ.append(jLongValue);
        sbLIZ.append("] start, layoutKey:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", effectId:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", effectResPath:");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("LayoutAnimationManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LLILLJJLI.LJJLI(this.LLILLL, this.LLILZ, null, this.LLILZIL.element, null, listLJ, null, this.LLILZLL, this.LLIZ);
        return Unit.LIZ;
    }
}
