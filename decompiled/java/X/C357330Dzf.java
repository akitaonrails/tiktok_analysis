package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357330Dzf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C357320Dze LL;
    public final /* synthetic */ C357350Dzh LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C354570DvD LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357330Dzf(C357320Dze c357320Dze, C357350Dzh c357350Dzh, boolean z, C354570DvD c354570DvD, int i, String str) {
        super(0);
        this.LL = c357320Dze;
        this.LLILLJJLI = c357350Dzh;
        this.LLILLL = z;
        this.LLILZ = c354570DvD;
        this.LLILZIL = i;
        this.LLILZLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC356810Dyp interfaceC356810Dyp;
        if (Intrinsics.LJFF(this.LL.LIZLLL, this.LLILLJJLI.LIZ)) {
            if (this.LLILLL) {
                if (!Intrinsics.LJFF(this.LLILZ.LIZJ.get("KEY_IS_ASYNC"), "true") && (interfaceC356810Dyp = this.LL.LIZJ) != null) {
                    interfaceC356810Dyp.onProgress(100);
                }
                InterfaceC356810Dyp interfaceC356810Dyp2 = this.LL.LIZJ;
                if (interfaceC356810Dyp2 != null) {
                    interfaceC356810Dyp2.LIZIZ(this.LLILZ);
                }
                this.LL.LIZJ = null;
            } else {
                InterfaceC356810Dyp interfaceC356810Dyp3 = this.LL.LIZJ;
                if (interfaceC356810Dyp3 != null) {
                    interfaceC356810Dyp3.LIZ(new C356900Dyy(this.LLILZIL, this.LLILZLL, this.LLILZ.LIZJ));
                }
                this.LL.LIZJ = null;
            }
        }
        return Unit.LIZ;
    }
}
