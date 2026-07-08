package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527730Kmp extends C09AY implements InterfaceC2280171EMt<String, String, Long, String, String, String, String, Unit> {
    public final /* synthetic */ InterfaceC1364105Vn<C1660260tJ2<String, String, String, String>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527730Kmp(C23260099m c23260099m) {
        super(7);
        this.LL = c23260099m;
    }

    @Override // X.InterfaceC2280171EMt
    public final Unit yc(String str, String str2, Long l, String str3, String str4, String str5, String str6) {
        l.longValue();
        InterfaceC1364105Vn<C1660260tJ2<String, String, String, String>> interfaceC1364105Vn = this.LL;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        C1660260tJ2 c1660260tJ2 = new C1660260tJ2(str, str2, "", "");
        C189200o6.m2constructorimpl(c1660260tJ2);
        interfaceC1364105Vn.resumeWith(c1660260tJ2);
        return Unit.LIZ;
    }
}
