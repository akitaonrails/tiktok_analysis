package X;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ct2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.TextSegmentHelper$measure$2", f = "TextSegmentHelper.kt", l = {}, m = "invokeSuspend")
public final class C327740Ct2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C327760Ct4 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327740Ct2(C327760Ct4 c327760Ct4, String str, InterfaceC1364105Vn<? super C327740Ct2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c327760Ct4;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327740Ct2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextSegmentHelper@3990.measure$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL = new ArrayList<>();
        this.LL.LIZJ = new HashMap<>();
        C327760Ct4 c327760Ct4 = this.LL;
        String str = this.LLILLJJLI;
        c327760Ct4.getClass();
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        int iFirst = wordInstance.first();
        int next = wordInstance.next();
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = iFirst;
            iFirst = next;
            if (next != -1) {
                arrayList.add(str.subSequence(i, next).toString());
                next = wordInstance.next();
            } else {
                c327760Ct4.LIZ(0, arrayList);
                this.LL.LIZJ.clear();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TextSegmentHelper@3990.measure$2");
                return unit;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
