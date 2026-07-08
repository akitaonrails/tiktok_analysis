package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lB7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347830lB7 extends C09AY implements Function1<C1347810lB5, C1347810lB5> {
    public final /* synthetic */ EnumC1347820lB6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347830lB7(EnumC1347820lB6 enumC1347820lB6) {
        super(1);
        this.LL = enumC1347820lB6;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C1347810lB5 invoke(C1347810lB5 c1347810lB5) {
        EnumC1347820lB6 enumC1347820lB6 = this.LL;
        c1347810lB5.getClass();
        return new C1347810lB5(enumC1347820lB6);
    }
}
