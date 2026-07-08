package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1417780mzw extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1417780mzw(C1417330mzD c1417330mzD) {
        super(1, c1417330mzD, C1417330mzD.class, "playOrPause", "playOrPause(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C1417330mzD) this.receiver).ze(bool.booleanValue());
        return Unit.LIZ;
    }
}
