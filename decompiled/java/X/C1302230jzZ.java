package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1302230jzZ extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1302230jzZ(Object obj) {
        super(1, obj, C1302260jzc.class, "onGlobalMuteStateChanged", "onGlobalMuteStateChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C1302260jzc) this.receiver).LJFF(bool.booleanValue());
        return Unit.LIZ;
    }
}
