package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0eMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1085840eMY extends C2217421BqW implements Function2<Integer, Boolean, Unit> {
    public C1085840eMY(C19753112Qf c19753112Qf) {
        super(2, c19753112Qf, C19753112Qf.class, "onSeek", "onSeek(IZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Boolean bool) {
        ((C19753112Qf) this.receiver).M5(num.intValue(), bool.booleanValue());
        return Unit.LIZ;
    }
}
