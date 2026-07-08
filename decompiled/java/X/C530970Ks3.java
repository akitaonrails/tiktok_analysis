package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ks3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C530970Ks3 extends C2217421BqW implements Function2<Integer, Boolean, Unit> {
    public C530970Ks3(C531030Ks9 c531030Ks9) {
        super(2, c531030Ks9, C531030Ks9.class, "invokeTemplateSelected", "invokeTemplateSelected(IZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Boolean bool) {
        ((C531030Ks9) this.receiver).v5(num.intValue(), bool.booleanValue());
        return Unit.LIZ;
    }
}
