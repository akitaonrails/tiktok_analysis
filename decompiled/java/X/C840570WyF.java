package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840570WyF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C840600WyI LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C840570WyF(String str, C840600WyI c840600WyI) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c840600WyI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C840560WyE.LIZ.put(this.LL, this.LLILLJJLI);
        String str = this.LL;
        C840600WyI c840600WyI = this.LLILLJJLI;
        Iterator it2 = ((ArrayList) C840560WyE.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC840590WyH) it2.next()).LIZ(str, c840600WyI);
        }
        return Unit.LIZ;
    }
}
