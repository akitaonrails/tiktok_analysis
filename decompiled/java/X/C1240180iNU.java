package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ui.cell.delegate.phase2.IMSearchMessageDetailCellDelegate$cellClickHandler2$1$1", f = "IMSearchMessageDetailCellDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1240180iNU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1240120iNO LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240180iNU(C1240120iNO c1240120iNO, View view, InterfaceC1364105Vn<? super C1240180iNU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1240120iNO;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240180iNU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        C1C7U.LIZ("IMSearchMessageDetailCellDelegate@f18.cellClickHandler2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLIZLLL = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZLLL(this.LL.LIZLLL);
        if (c869590Y9lLIZLLL != null) {
            long index = c869590Y9lLIZLLL.getIndex();
            int msgType = c869590Y9lLIZLLL.getMsgType();
            C1240120iNO c1240120iNO = this.LL;
            if (c1240120iNO.LJI) {
                C1240230iNZ c1240230iNZ = C1240230iNZ.LIZIZ;
                View view = this.LLILLJJLI;
                C0Y8T c0y8t = c1240120iNO.LJII;
                Long lLJFF = C2286608xc.LJFF(index);
                C1240120iNO c1240120iNO2 = this.LL;
                String str = c1240120iNO2.LJIIIZ;
                EnumC1240610iOB enumC1240610iOB = EnumC1240610iOB.MESSAGE;
                EnumC1240620iOC enumC1240620iOC = c1240120iNO2.LIZIZ;
                if (msgType != 7) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1240230iNZ.LIZLLL(view, c0y8t, null, lLJFF, str, enumC1240610iOB, enumC1240620iOC, z2);
            } else {
                C1240230iNZ c1240230iNZ2 = C1240230iNZ.LIZIZ;
                View view2 = this.LLILLJJLI;
                IMUser iMUser = c1240120iNO.LJIIJ;
                C0Y8T c0y8t2 = c1240120iNO.LJII;
                Long lLJFF2 = C2286608xc.LJFF(index);
                C1240120iNO c1240120iNO3 = this.LL;
                String str2 = c1240120iNO3.LJIIIZ;
                EnumC1240610iOB enumC1240610iOB2 = EnumC1240610iOB.MESSAGE;
                EnumC1240620iOC enumC1240620iOC2 = c1240120iNO3.LIZIZ;
                if (msgType != 7) {
                    z = true;
                } else {
                    z = false;
                }
                c1240230iNZ2.LIZJ(view2, iMUser, c0y8t2, null, lLJFF2, str2, enumC1240610iOB2, enumC1240620iOC2, z);
            }
            C1240600iOA.LIZIZ.LIZIZ(EnumC1240630iOD.ENTER_CHAT, this.LL.LJIILIIL, C0I0B.LJFF.LIZIZ());
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSearchMessageDetailCellDelegate@f18.cellClickHandler2$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMSearchMessageDetailCellDelegate@f18.cellClickHandler2$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
