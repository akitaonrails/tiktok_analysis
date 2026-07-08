package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS141S1100000_27;

/* JADX INFO: renamed from: X.0wzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1802090wzn extends C2217421BqW implements Function1<String, Unit> {
    public C1802090wzn(C1802070wzl c1802070wzl) {
        super(1, c1802070wzl, C1802070wzl.class, "showMissionPanel", "showMissionPanel(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        C1802070wzl c1802070wzl = (C1802070wzl) this.receiver;
        c1802070wzl.LJIIJ.LIZIZ(c1802070wzl.LIZIZ.invoke(), str2, new AwS141S1100000_27(c1802070wzl, str2, 12));
        return Unit.LIZ;
    }
}
