package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1158, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class AnonymousClass1158 extends C2217421BqW implements Function1<Boolean, Unit> {
    public AnonymousClass1158(C11Y7 c11y7) {
        super(1, c11y7, C11Y7.class, "close", "close(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws JSONException {
        ((C11Y7) this.receiver).t5(bool.booleanValue());
        return Unit.LIZ;
    }
}
