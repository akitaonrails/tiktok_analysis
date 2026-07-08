package X;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637920sj0 extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C1637900siy LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637920sj0(C1637900siy c1637900siy, String str, String str2) {
        super(1);
        this.LL = c1637900siy;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        Set<InterfaceC1637930sj1> set = this.LL.LIZLLL;
        String str3 = this.LLILLJJLI;
        String str4 = this.LLILLL;
        Iterator<InterfaceC1637930sj1> it2 = set.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLLLLL(str3, str2, str4);
        }
        return Unit.LIZ;
    }
}
