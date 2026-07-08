package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1EBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277371EBz extends C09AY implements Function1<InterfaceC2277241EBm, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277371EBz(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2277241EBm interfaceC2277241EBm) {
        InterfaceC2277241EBm interfaceC2277241EBm2 = interfaceC2277241EBm;
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            str2 = str3;
        }
        interfaceC2277241EBm2.LJIJ(str, str2);
        return Unit.LIZ;
    }
}
