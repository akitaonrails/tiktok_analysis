package X;

import java.util.List;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181581AZo extends C09AY implements InterfaceC1631620sYq<Long, C1AZ9, List<? extends C2181251AYh>, Unit> {
    public final /* synthetic */ C955320ay2 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C2181471AZd LLILZ;
    public final /* synthetic */ C259800zU<List<C1276580jKC>> LLILZIL;
    public final /* synthetic */ JSONObject LLILZLL;
    public final /* synthetic */ JSONObject LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181581AZo(C955320ay2 c955320ay2, C2181471AZd c2181471AZd, String str, String str2, C259800zU c259800zU, JSONObject jSONObject, JSONObject jSONObject2) {
        super(3);
        this.LL = c955320ay2;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c2181471AZd;
        this.LLILZIL = c259800zU;
        this.LLILZLL = jSONObject;
        this.LLIZ = jSONObject2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, C1AZ9 c1az9, List<? extends C2181251AYh> list) {
        List<C1276580jKC> listLJIILL;
        long jLongValue = l.longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task invoke, remote layout animation task[");
        sbLIZ.append(jLongValue);
        sbLIZ.append("] start, layoutKey:");
        sbLIZ.append(this.LL.LIZIZ);
        sbLIZ.append(", effectId:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", effectResPath:");
        sbLIZ.append(this.LLILLL);
        C20441214yg.LIZIZ("LayoutAnimationManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2182051AaZ interfaceC2182051AaZLIZ = this.LLILZ.LIZ();
        String strMixStream = null;
        if (interfaceC2182051AaZLIZ != null) {
            C2181471AZd c2181471AZd = this.LLILZ;
            C1AZ9 c1az92 = interfaceC2182051AaZLIZ.LJII().LIZIZ;
            int i = (int) c1az92.LIZIZ;
            int i2 = (int) c1az92.LIZJ;
            listLJIILL = c2181471AZd.LLILLJJLI.LJIILL();
            if (interfaceC2182051AaZLIZ instanceof InterfaceC1276590jKD) {
                strMixStream = ((InterfaceC1276590jKD) interfaceC2182051AaZLIZ).mixStream(i, i2, listLJIILL);
            } else {
                listLJIILL = null;
            }
        } else {
            listLJIILL = null;
        }
        this.LLILZ.LLILLJJLI.LJJLI(this.LLILLJJLI, this.LLILLL, this.LLILZIL.element, null, listLJIILL, null, strMixStream, this.LLILZLL, this.LLIZ);
        return Unit.LIZ;
    }
}
