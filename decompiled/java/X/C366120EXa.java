package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.task.MainTrackEDADataSyncTask$onSyncData$4", f = "MainTrackEDADataSyncTask.kt", l = {}, m = "invokeSuspend")
public final class C366120EXa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0EXK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366120EXa(C0EXK c0exk, InterfaceC1364105Vn<? super C366120EXa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0exk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C366120EXa(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("MainTrackEDADataSyncTask@b606.onSyncData$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0EXK c0exk = this.LL;
        C1664750tQH c1664750tQH = c0exk.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0EXK.LLIZLLLIL;
        InterfaceC1461350o8D interfaceC1461350o8DLIZJ = ((InterfaceC1455850nzL) c1664750tQH.getValue(c0exk, interfaceC2217461BqaArr[1])).TI1().LIZJ();
        if (interfaceC1461350o8DLIZJ != null) {
            interfaceC1461350o8DLIZJ.u1();
        }
        C0EXK c0exk2 = this.LL;
        InterfaceC1455720nz8 interfaceC1455720nz8 = (InterfaceC1455720nz8) c0exk2.LLILZIL.getValue(c0exk2, interfaceC2217461BqaArr[2]);
        if (interfaceC1455720nz8 != null) {
            interfaceC1455720nz8.SS1();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("MainTrackEDADataSyncTask@b606.onSyncData$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
