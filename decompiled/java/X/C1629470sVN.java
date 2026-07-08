package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sVN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1629470sVN extends C2217421BqW implements Function1<Integer, Unit> {
    public C1629470sVN(C1629630sVd c1629630sVd) {
        super(1, c1629630sVd, InterfaceC1629540sVU.class, "onProgress", "onProgress(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((InterfaceC1629540sVU) this.receiver).onProgress(num.intValue());
        return Unit.LIZ;
    }
}
