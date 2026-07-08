package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20262714Qf extends C09AY implements Function1<InterfaceC1911280zpu, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20262714Qf(JSONObject jSONObject, String str, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1911280zpu interfaceC1911280zpu) {
        interfaceC1911280zpu.onImageLoaded(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
