package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iNW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ui.cell.delegate.phase2.IMSearchMessageGroupCellDelegate$cellClickHandler2$1$1", f = "IMSearchMessageCellDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1240200iNW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1240160iNS LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240200iNW(C1240160iNS c1240160iNS, View view, InterfaceC1364105Vn<? super C1240200iNW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1240160iNS;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240200iNW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("IMSearchMessageGroupCellDelegate@d7ff.cellClickHandler2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLIZLLL = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZLLL(this.LL.LJIIIIZZ);
        if (c869590Y9lLIZLLL != null) {
            long index = c869590Y9lLIZLLL.getIndex();
            int msgType = c869590Y9lLIZLLL.getMsgType();
            C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
            View view = this.LLILLJJLI;
            C0Y8T c0y8t = this.LL.LIZ;
            Long lLJFF = C2286608xc.LJFF(index);
            C1240160iNS c1240160iNS = this.LL;
            String str = c1240160iNS.LJI;
            EnumC1240610iOB enumC1240610iOB = EnumC1240610iOB.MESSAGE;
            EnumC1240620iOC enumC1240620iOC = c1240160iNS.LIZIZ;
            if (msgType != 7) {
                z = true;
            } else {
                z = false;
            }
            c1240230iNZ.LIZLLL(view, c0y8t, null, lLJFF, str, enumC1240610iOB, enumC1240620iOC, z);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSearchMessageGroupCellDelegate@d7ff.cellClickHandler2$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMSearchMessageGroupCellDelegate@d7ff.cellClickHandler2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
