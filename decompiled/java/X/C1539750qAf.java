package X;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539750qAf extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C1539580qAO LL;
    public final /* synthetic */ Function1<C1539910qAv, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539750qAf(C1539580qAO c1539580qAO, C1539760qAg c1539760qAg) {
        super(1);
        this.LL = c1539580qAO;
        this.LLILLJJLI = c1539760qAg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C1539580qAO c1539580qAO = this.LL;
        EnumC1539690qAZ enumC1539690qAZ = EnumC1539690qAZ.DOWNGRADED;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Parse SSR bundle failed, baseUrl: ");
        sbLIZ.append(this.LL.LIZ.LJIJI());
        sbLIZ.append(", exception: ");
        sbLIZ.append(Log.getStackTraceString(th));
        c1539580qAO.LJI(enumC1539690qAZ, 224, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.invoke(new C1539910qAv(EnumC1539700qAa.BUNDLE_PARSE_ERROR, "SSR parse failed."));
        return Unit.LIZ;
    }
}
