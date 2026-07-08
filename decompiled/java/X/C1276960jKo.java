package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276960jKo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ JSONObject LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1276960jKo(C1276910jKj c1276910jKj, String str, String str2, JSONObject jSONObject) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str = this.LL.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTTLHAbChannelParams, scene = ");
        sbLIZ.append(this.LL.LLILZ.LIZJ);
        sbLIZ.append(", cdid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LLILLL);
        C1AZW.LJIIJ(12, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LL.LJJLIL(this.LLILLJJLI, this.LLILLL);
        InterfaceC1276380jJs interfaceC1276380jJs = this.LL.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.LJJJJ(this.LLILLJJLI, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
