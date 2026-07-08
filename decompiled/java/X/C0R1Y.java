package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1Y extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX INFO: Incorrect field signature: TT; */
    public final /* synthetic */ InterfaceC2753014t LLILLL;
    public final /* synthetic */ Class<T> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R1Y(InterfaceC665370Q7z interfaceC665370Q7z, InterfaceC2753014t interfaceC2753014t, Class cls, String str) {
        super(0);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC2753014t;
        this.LLILZ = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1554890qZ5 tree = this.LL.getTree();
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "source_default_key";
        }
        tree.LIZLLL(str, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
