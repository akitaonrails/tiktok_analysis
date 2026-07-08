package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900060zXo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900060zXo(String str, JSONObject jSONObject) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C793770VBv.LJII(this.LL, this.LLILLJJLI, null, null);
        return Unit.LIZ;
    }
}
