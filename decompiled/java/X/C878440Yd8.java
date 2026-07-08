package X;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Yd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878440Yd8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0Y8T LL;
    public final /* synthetic */ C878450Yd9 LLILLJJLI;
    public final /* synthetic */ C878470YdB LLILLL;
    public final /* synthetic */ C878460YdA LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878440Yd8(C0Y8T c0y8t, C878450Yd9 c878450Yd9, C878470YdB c878470YdB, C878460YdA c878460YdA, int i) {
        super(0);
        this.LL = c0y8t;
        this.LLILLJJLI = c878450Yd9;
        this.LLILLL = c878470YdB;
        this.LLILZ = c878460YdA;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0Y8T c0y8t = this.LL;
        if (c0y8t != null) {
            C878670YdV.LIZ.getClass();
            if (C878670YdV.LIZIZ(c0y8t) && C878670YdV.LIZ(this.LL)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
                C0Y8T c0y8t2 = this.LL;
                C877210Yb9 c877210Yb9 = this.LLILLL.LIZIZ;
                if (C880370YgF.LJFF(c0y8t2, c877210Yb9.LIZ, c877210Yb9.LIZIZ)) {
                    C878460YdA c878460YdA = this.LLILZ;
                    C0Y8T c0y8t3 = this.LL;
                    C0YM2 c0ym2 = this.LLILLL.LIZ.LL;
                    c878460YdA.getClass();
                    C879540Yeu c879540YeuLJIILLIIL = C878460YdA.LJIILLIIL(c0y8t3, c0ym2);
                    if (c879540YeuLJIILLIIL != null) {
                        arrayList.add(c879540YeuLJIILLIIL);
                        arrayList2.add(c879540YeuLJIILLIIL);
                    }
                } else {
                    C878460YdA c878460YdA2 = this.LLILZ;
                    C0Y8T c0y8t4 = this.LL;
                    C0YM2 c0ym22 = this.LLILLL.LIZ.LL;
                    c878460YdA2.getClass();
                    C879540Yeu c879540YeuLJIILLIIL2 = C878460YdA.LJIILLIIL(c0y8t4, c0ym22);
                    if (c879540YeuLJIILLIIL2 != null) {
                        arrayList2.add(c879540YeuLJIILLIIL2);
                    }
                }
                CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = this.LLILZ.LJIILL().get(this.LLILLL);
                if (copyOnWriteArrayList != null) {
                    C878470YdB c878470YdB = this.LLILLL;
                    C878460YdA c878460YdA3 = this.LLILZ;
                    int i = this.LLILZIL;
                    for (InterfaceC878540YdI interfaceC878540YdI : copyOnWriteArrayList) {
                        C878950Ydx c878950Ydx = c878470YdB.LIZ;
                        String str = c878460YdA3.LIZ;
                        interfaceC878540YdI.LIZJ(c878950Ydx, arrayList, arrayList2, C878360Yd0.LIZIZ(C878360Yd0.LIZIZ(str, "update"), String.valueOf(i)));
                    }
                }
            } else {
                this.LLILLJJLI.LJJLIIIJ(this.LL);
            }
        }
        return Unit.LIZ;
    }
}
