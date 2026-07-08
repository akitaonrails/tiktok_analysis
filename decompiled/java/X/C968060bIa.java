package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968060bIa extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C968060bIa(String str, boolean z, boolean z2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        boolean z;
        InterfaceC965990bFF interfaceC965990bFF2 = interfaceC965990bFF;
        String str = this.LL;
        if (!this.LLILLJJLI && !this.LLILLL) {
            z = false;
        } else {
            z = true;
        }
        interfaceC965990bFF2.LJIJJLI(str, z);
        return Unit.LIZ;
    }
}
