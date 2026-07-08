package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19756612Ro extends C2217421BqW implements Function0<Unit> {
    public C19756612Ro(C12SD c12sd) {
        super(0, c12sd, C12SD.class, "pausePlay", "pausePlay()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C12SD) this.receiver).pausePlay();
        return Unit.LIZ;
    }
}
