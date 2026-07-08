package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C603360NlW extends C2217421BqW implements Function2<String, String, Unit> {
    public C603360NlW(Object obj) {
        super(2, obj, C603370NlX.class, "onRuleTriggered", "onRuleTriggered(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        ((C603370NlX) this.receiver).LIZ.invoke(str, str2);
        return Unit.LIZ;
    }
}
