package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.componentmanager.ComponentPriorityMaker$attach$$inlined$launchAndCollectIn$default$1$1", f = "ComponentPriorityMaker.kt", l = {365}, m = "invokeSuspend")
public final class C1455605ms extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa LLILLL;
    public final /* synthetic */ C699060RbU LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1455605ms(InterfaceC346201Wa interfaceC346201Wa, InterfaceC1364105Vn interfaceC1364105Vn, C699060RbU c699060RbU) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = c699060RbU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1455605ms c1455605ms = new C1455605ms(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c1455605ms.LLILLJJLI = obj;
        return c1455605ms;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComponentPriorityMaker@4add.attach$$inlined$launchAndCollectIn$default$1$1");
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
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InterfaceC346201Wa interfaceC346201Wa = this.LLILLL;
            final C699060RbU c699060RbU = this.LLILZ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0RbV
                /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
                @Override // X.InterfaceC346701Wf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
                    /*
                        Method dump skipped, instruction units count: 332
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C699070RbV.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            };
            this.LL = 1;
            if (interfaceC346201Wa.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("ComponentPriorityMaker@4add.attach$$inlined$launchAndCollectIn$default$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComponentPriorityMaker@4add.attach$$inlined$launchAndCollectIn$default$1$1");
        return unit;
    }
}
