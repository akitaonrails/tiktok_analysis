package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.feed.MGModuleInteraction;

/* JADX INFO: renamed from: X.0IpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478330IpL extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ EnumC479370Ir1 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<List<MGModuleInteraction>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478330IpL(EnumC479370Ir1 enumC479370Ir1, long j, Function1 function1, C2252611DEt c2252611DEt) {
        super(1);
        this.LL = enumC479370Ir1;
        this.LLILLJJLI = j;
        this.LLILLL = function1;
        this.LLILZ = c2252611DEt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveTopModuleVM preloadInteractModuleData: Failed to preload interact modules: scene=");
        sbLIZ.append(this.LL);
        C20441214yg.LJFF("MultiTopLiveTopModuleVM", C2188811AlT.LIZIZ(sbLIZ), th2);
        if (EnumC479370Ir1.INIT == this.LL && this.LLILLJJLI > 0) {
            C479670IrV c479670IrV = C479670IrV.LIZ;
            System.currentTimeMillis();
            c479670IrV.getClass();
        }
        Function1<Throwable, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(th2);
        }
        InterfaceC20236714Gf<List<MGModuleInteraction>> interfaceC20236714Gf = this.LLILZ;
        C098200Yq c098200Yq = new C098200Yq(th2);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        return Unit.LIZ;
    }
}
