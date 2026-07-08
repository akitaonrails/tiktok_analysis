package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12SZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C12SZ extends C2217421BqW implements Function1<Boolean, Unit> {
    public C12SZ(C12SE c12se) {
        super(1, c12se, C12SE.class, "onClickOriginalSoundCheckbox", "onClickOriginalSoundCheckbox(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C12SE) this.receiver).C5(bool.booleanValue());
        return Unit.LIZ;
    }
}
