package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ui.cell.delegate.phase2.IMSearchMessageUserCellDelegate$cellClickHandler2$1$1", f = "IMSearchMessageCellDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1240190iNV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1240150iNR LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240190iNV(C1240150iNR c1240150iNR, View view, InterfaceC1364105Vn<? super C1240190iNV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1240150iNR;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240190iNV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("IMSearchMessageUserCellDelegate@1fcf.cellClickHandler2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLIZLLL = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZLLL(this.LL.LJIIJ);
        if (c869590Y9lLIZLLL != null) {
            long index = c869590Y9lLIZLLL.getIndex();
            int msgType = c869590Y9lLIZLLL.getMsgType();
            C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
            View view = this.LLILLJJLI;
            C1240150iNR c1240150iNR = this.LL;
            IMUser iMUser = c1240150iNR.LIZ;
            C0Y8T c0y8t = c1240150iNR.LIZIZ;
            Long lLJFF = C2286608xc.LJFF(index);
            C1240150iNR c1240150iNR2 = this.LL;
            String str = c1240150iNR2.LJIIIIZZ;
            EnumC1240610iOB enumC1240610iOB = EnumC1240610iOB.MESSAGE;
            EnumC1240620iOC enumC1240620iOC = c1240150iNR2.LIZLLL;
            if (msgType != 7) {
                z = true;
            } else {
                z = false;
            }
            c1240230iNZ.LIZJ(view, iMUser, c0y8t, null, lLJFF, str, enumC1240610iOB, enumC1240620iOC, z);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSearchMessageUserCellDelegate@1fcf.cellClickHandler2$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMSearchMessageUserCellDelegate@1fcf.cellClickHandler2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
