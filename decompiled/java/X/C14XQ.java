package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14XQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C14XN LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14XQ(boolean z, C14XN c14xn, String str, Function0<Unit> function0) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c14xn;
        this.LLILLL = str;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL) {
            this.LLILLJJLI.LJJIJIIJI();
            C14XN c14xn = this.LLILLJJLI;
            c14xn.getClass();
            c14xn.LJIJI(EnumC20283814Yi.BACK, null, null);
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
            String str = this.LLILLL;
            if (str != null) {
                C603820NmG<String, C14XX> c603820NmG = c20285414YyLIZ.LIZ;
                if (c603820NmG != null) {
                    c603820NmG.LJ(str);
                }
            } else {
                c20285414YyLIZ.getClass();
            }
            C14XN c14xn2 = this.LLILLJJLI;
            if (c14xn2.LLJJIII != null) {
                this.LLILZ.invoke();
                C20286814Zm c20286814Zm = c14xn2.LLJJI;
                if (c20286814Zm != null) {
                    c20286814Zm.LJJL = false;
                    c20286814Zm.LJIJJLI();
                }
            }
        }
        return Unit.LIZ;
    }
}
