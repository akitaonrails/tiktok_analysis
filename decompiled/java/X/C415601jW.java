package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01jW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.autoplay.StatusManager$bindScope$1$invokeSuspend$$inlined$flatMapLatest$1", f = "StatusManager.kt", l = {193}, m = "invokeSuspend")
public final class C415601jW extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Boolean>, List<? extends C05YD<? extends Boolean>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C415601jW(InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, List<? extends C05YD<? extends Boolean>> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C415601jW c415601jW = new C415601jW(interfaceC1364105Vn);
        c415601jW.LLILLJJLI = interfaceC346701Wf;
        c415601jW.LLILLL = list;
        return c415601jW.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C516501zn c516501zn;
        C1C7U.LIZ("StatusManager@d0d1.bindScope$1$invokeSuspend$$inlined$flatMapLatest$1");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            List list = (List) this.LLILLL;
            if (list.isEmpty()) {
                c516501zn = new C516501zn(true, 1);
            } else {
                c516501zn = new C516501zn((InterfaceC346201Wa[]) C13LP.LLIIII(list).toArray(new InterfaceC346201Wa[0]), 2);
            }
            this.LL = 1;
            if (C09IC.LJIILLIIL(this, c516501zn, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("StatusManager@d0d1.bindScope$1$invokeSuspend$$inlined$flatMapLatest$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StatusManager@d0d1.bindScope$1$invokeSuspend$$inlined$flatMapLatest$1");
        return unit;
    }
}
