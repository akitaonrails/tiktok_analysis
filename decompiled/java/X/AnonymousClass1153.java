package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1153, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class AnonymousClass1153 extends C2217421BqW implements Function2<String, Boolean, Unit> {
    public AnonymousClass1153(C194431114z c194431114z) {
        super(2, c194431114z, C194431114z.class, "mobEnterText", "mobEnterText(Ljava/lang/String;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C194431114z) this.receiver).Gc(str, zBooleanValue);
        return Unit.LIZ;
    }
}
