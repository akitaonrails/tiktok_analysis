package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1ArF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192391ArF extends C09AY implements Function1<C2188851AlX, Unit> {
    public final /* synthetic */ C2192381ArE LL;
    public final /* synthetic */ C259800zU<C2192431ArJ> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192391ArF(C2192381ArE c2192381ArE, C259800zU<C2192431ArJ> c259800zU) {
        super(1);
        this.LL = c2192381ArE;
        this.LLILLJJLI = c259800zU;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.1ArJ] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2188851AlX c2188851AlX) {
        AnonymousClass1503 anonymousClass1503;
        C2188851AlX c2188851AlX2 = c2188851AlX;
        this.LL.getClass();
        c2188851AlX2.getClass();
        ?? r2 = c2188851AlX2.LIZ;
        C2192381ArE c2192381ArE = this.LL;
        r2.LIZ = c2192381ArE.LJ;
        r2.LIZIZ = null;
        if (c2192381ArE.LIZLLL == EnumC20429814wq.SP) {
            anonymousClass1503 = C20448114zn.LIZ;
        } else {
            anonymousClass1503 = C20430814x0.LIZ;
        }
        r2.LJ = anonymousClass1503;
        this.LLILLJJLI.element = r2;
        return Unit.LIZ;
    }
}
