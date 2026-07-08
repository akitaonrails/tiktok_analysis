package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14XP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XP extends C09AY implements Function1<InterfaceC1692950u9l, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C14XN LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14XP(boolean z, C14XN c14xn, C013C c013c, float f, float f2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = c14xn;
        this.LLILLL = c013c;
        this.LLILZ = f;
        this.LLILZIL = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1692950u9l interfaceC1692950u9l) {
        InterfaceC1692950u9l interfaceC1692950u9l2 = interfaceC1692950u9l;
        if (!this.LL) {
            C20286814Zm c20286814Zm = this.LLILLJJLI.LLJJI;
            if (c20286814Zm != null) {
                c20286814Zm.LJJL = this.LLILLL.element;
            }
            int iLIZ = (int) ((this.LLILZ * this.LLILZIL) - ((int) (interfaceC1692950u9l2.LIZ() & 4294967295L)));
            C20286814Zm c20286814Zm2 = this.LLILLJJLI.LLJJI;
            if (c20286814Zm2 != null) {
                c20286814Zm2.LJIL(-iLIZ);
            }
        }
        return Unit.LIZ;
    }
}
