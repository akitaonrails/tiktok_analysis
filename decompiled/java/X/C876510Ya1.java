package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ya1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876510Ya1 extends C09AY implements Function0<C0Z2O> {
    public final /* synthetic */ C876680YaI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876510Ya1(C876680YaI c876680YaI) {
        super(0);
        this.LL = c876680YaI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0Z2O invoke() {
        C0Z2O c0z2o = new C0Z2O(this.LL.LIZIZ(), this.LL.LIZLLL);
        final C876680YaI c876680YaI = this.LL;
        c0z2o.LJ.add(new InterfaceC876420YZs() { // from class: X.0YZr
            @Override // X.InterfaceC876420YZs
            public final void LIZ(C879180YeK c879180YeK, boolean z) {
                C869590Y9l c869590Y9l;
                C876680YaI c876680YaI2 = c876680YaI;
                List<C876550Ya5> list = c879180YeK.LIZIZ;
                ArrayList arrayList = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (C876550Ya5 c876550Ya5 : list) {
                        if (c876550Ya5.LIZIZ != EnumC876540Ya4.RESHOW_UNREAD_CONVERSATION) {
                            c869590Y9l = c876550Ya5.LIZJ;
                        } else {
                            c869590Y9l = null;
                        }
                        arrayList2.add(c869590Y9l);
                    }
                    arrayList = arrayList2;
                }
                C876680YaI.LJI(c876680YaI2, arrayList);
            }
        });
        return c0z2o;
    }
}
