package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ya6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876560Ya6 extends C09AY implements Function0<C879090YeB> {
    public final /* synthetic */ C876680YaI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876560Ya6(C876680YaI c876680YaI) {
        super(0);
        this.LL = c876680YaI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C879090YeB invoke() {
        C879090YeB c879090YeB = new C879090YeB(this.LL.LIZLLL);
        final C876680YaI c876680YaI = this.LL;
        c879090YeB.LJFF.add(new InterfaceC876440YZu() { // from class: X.0YZt
            @Override // X.InterfaceC876440YZu
            public final void LIZ(List list) {
                C869590Y9l c869590Y9l;
                C876680YaI c876680YaI2 = c876680YaI;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C876550Ya5 c876550Ya5 : (ArrayList) list) {
                    if (c876550Ya5.LIZIZ != EnumC876540Ya4.RESHOW_UNREAD_CONVERSATION) {
                        c869590Y9l = c876550Ya5.LIZJ;
                    } else {
                        c869590Y9l = null;
                    }
                    arrayList.add(c869590Y9l);
                }
                C876680YaI.LJI(c876680YaI2, arrayList);
            }
        });
        return c879090YeB;
    }
}
