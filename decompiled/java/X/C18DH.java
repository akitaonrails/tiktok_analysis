package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18DH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DH extends C09AY implements Function0<Object> {
    public final /* synthetic */ JSONObject LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18DH(JSONObject jSONObject) {
        super(0);
        this.LL = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.LL;
    }
}
