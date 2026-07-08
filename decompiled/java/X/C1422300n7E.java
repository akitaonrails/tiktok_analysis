package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1422300n7E extends C2217421BqW implements Function1<C1422540n7c, Unit> {
    public C1422300n7E(C1422180n72 c1422180n72) {
        super(1, c1422180n72, C1422180n72.class, "onPlayEvent", "onPlayEvent(Lcom/ss/android/ugc/aweme/tools/mvtemplate/mob/TemplatePlayEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1422540n7c c1422540n7c) {
        C1422540n7c c1422540n7c2 = c1422540n7c;
        InterfaceC1422310n7F interfaceC1422310n7F = ((C1422180n72) this.receiver).LIZJ;
        if (interfaceC1422310n7F != null) {
            interfaceC1422310n7F.F1(c1422540n7c2);
        }
        return Unit.LIZ;
    }
}
