package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.buffer.MessageSearchContentUpdateBuffer$1", f = "MessageSearchContentUpdateBuffer.kt", l = {41}, m = "invokeSuspend")
public final class C907680ZjC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C907690ZjD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907680ZjC(C907690ZjD c907690ZjD, InterfaceC1364105Vn<? super C907680ZjC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c907690ZjD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907680ZjC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageSearchContentUpdateBuffer@d3ec.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346201Wa interfaceC346201WaLJJIIJ = C09IC.LJJIIJ(this.LLILLJJLI.LJ);
            C907690ZjD c907690ZjD = this.LLILLJJLI;
            C095D c095d = new C095D(new C375101cz(interfaceC346201WaLJJIIJ, c907690ZjD.LIZIZ, c907690ZjD.LIZJ, null));
            final C907690ZjD c907690ZjD2 = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0ZjB
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    List<C907660ZjA> list = (List) obj2;
                    C907690ZjD c907690ZjD3 = c907690ZjD2;
                    c907690ZjD3.getClass();
                    if (!list.isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (C907660ZjA c907660ZjA : list) {
                            for (C869590Y9l c869590Y9l : c907660ZjA.LIZ) {
                                linkedHashMap.put(c869590Y9l.getUuid(), new Pair(c869590Y9l, c907660ZjA.LIZIZ));
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Pair pair : linkedHashMap.values()) {
                            Object first = pair.getFirst();
                            int i2 = C907710ZjF.LIZ[((EnumC907700ZjE) pair.getSecond()).ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    arrayList2.add(first);
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                arrayList.add(first);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c907690ZjD3.LIZLLL.LIZJ(arrayList);
                        }
                        if (!arrayList2.isEmpty()) {
                            c907690ZjD3.LIZLLL.LIZ(arrayList2);
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c095d.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MessageSearchContentUpdateBuffer@d3ec.<init>$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageSearchContentUpdateBuffer@d3ec.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
