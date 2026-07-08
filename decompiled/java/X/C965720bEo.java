package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965720bEo extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C965670bEj LL;
    public final /* synthetic */ InterfaceC954180awC LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C965710bEn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965720bEo(C965670bEj c965670bEj, InterfaceC954180awC interfaceC954180awC, boolean z, C965710bEn c965710bEn) {
        super(0);
        this.LL = c965670bEj;
        this.LLILLJJLI = interfaceC954180awC;
        this.LLILLL = z;
        this.LLILZ = c965710bEn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CopyOnWriteArrayList<InterfaceC968210bIp> copyOnWriteArrayList = this.LL.LJI;
        InterfaceC954180awC interfaceC954180awC = this.LLILLJJLI;
        Iterator<InterfaceC968210bIp> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLLLZIL(interfaceC954180awC);
        }
        this.LLILLJJLI.LJLJI("resume", EnumC965730bEp.UNKNOWN);
        if (this.LLILLL) {
            this.LL.LJIIJJI(this.LLILZ);
        }
        return Unit.LIZ;
    }
}
