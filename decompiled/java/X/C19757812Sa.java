package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19757812Sa extends C2217421BqW implements Function1<Boolean, Unit> {
    public C19757812Sa(C12SD c12sd) {
        super(1, c12sd, C12SD.class, "onClickOriginalSoundCheckbox", "onClickOriginalSoundCheckbox(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C12SD) this.receiver).R5(bool.booleanValue());
        return Unit.LIZ;
    }
}
