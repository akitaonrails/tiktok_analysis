package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Rdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700480Rdm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C700470Rdl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700480Rdm(C700470Rdl c700470Rdl) {
        super(0);
        this.LL = c700470Rdl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AnonymousClass0956 anonymousClass0956 = this.LL.LIZ;
        if (anonymousClass0956 == null) {
            return Unit.LIZ;
        }
        if (anonymousClass0956.isCompleted()) {
            return Unit.LIZ;
        }
        new AwS555S0100000_11(this.LL, 1533);
        C0T6L.LIZLLL();
        AnonymousClass0956 anonymousClass09562 = this.LL.LIZ;
        if (anonymousClass09562 == null) {
            return null;
        }
        anonymousClass09562.LIZIZ(null);
        return Unit.LIZ;
    }
}
