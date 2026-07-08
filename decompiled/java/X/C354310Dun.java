package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Dun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C354310Dun extends C2217421BqW implements Function2<Float, Boolean, Unit> {
    public C354310Dun(C12SD c12sd) {
        super(2, c12sd, C12SD.class, "onSeekUp", "onSeekUp(FZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Float f, Boolean bool) {
        ((C12SD) this.receiver).U5(f.floatValue(), bool.booleanValue());
        return Unit.LIZ;
    }
}
