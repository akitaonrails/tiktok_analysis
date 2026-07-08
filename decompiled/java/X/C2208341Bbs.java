package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Bbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208341Bbs extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ InterfaceC2207911BbB LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2208341Bbs(Function0<Unit> function0, InterfaceC2207911BbB interfaceC2207911BbB, long j, String str) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = interfaceC2207911BbB;
        this.LLILLL = j;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLILLJJLI.LIZ(this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
