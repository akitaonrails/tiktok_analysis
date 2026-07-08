package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966990bGr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966920bGk LL;
    public final /* synthetic */ C972290bPP LLILLJJLI;
    public final /* synthetic */ InterfaceC968200bIo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966990bGr(C966920bGk c966920bGk, C972290bPP c972290bPP, InterfaceC968200bIo interfaceC968200bIo) {
        super(0);
        this.LL = c966920bGk;
        this.LLILLJJLI = c972290bPP;
        this.LLILLL = interfaceC968200bIo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC966930bGl interfaceC966930bGl = this.LL.LJ;
        if (interfaceC966930bGl != null) {
            interfaceC966930bGl.LJJZZI(this.LLILLJJLI, this.LLILLL);
        } else {
            C966920bGk c966920bGk = this.LL;
            InterfaceC968200bIo interfaceC968200bIo = this.LLILLL;
            if (c966920bGk.LJI) {
                C500260Jjc.LJJLIIIJILLIZJL(new C967000bGs(c966920bGk, interfaceC968200bIo));
            } else {
                C1304630k3R.LIZ(100001, "createChannel when anchor has not initialized..", c966920bGk.LIZIZ);
            }
        }
        return Unit.LIZ;
    }
}
