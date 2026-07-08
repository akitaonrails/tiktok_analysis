package X;

import com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputVM$onPrepared$1", f = "IMQuickMessageInputVM.kt", l = {136}, m = "invokeSuspend")
public final class C456630HvR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMQuickMessageInputVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456630HvR(IMQuickMessageInputVM iMQuickMessageInputVM, InterfaceC1364105Vn<? super C456630HvR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMQuickMessageInputVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456630HvR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        String str;
        InterfaceC876950Yaj interfaceC876950YajLIZIZ;
        C0Y8T c0y8tLJIL;
        C1C7U.LIZ("IMQuickMessageInputVM@b1e6.onPrepared$1");
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
            IMQuickMessageInputVM iMQuickMessageInputVM = this.LLILLJJLI;
            this.LL = 1;
            C456970Hvz c456970Hvz = (C456970Hvz) iMQuickMessageInputVM.LLILZ.getValue();
            if (c456970Hvz == null || (str = c456970Hvz.LLILLJJLI) == null || (c0y8tLJIL = (interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ)).LJIL(str)) == null) {
                unit = Unit.LIZ;
            } else {
                C2272701DxU c2272701DxULIZ = C903170Zbv.LIZ(c0y8tLJIL);
                if (c2272701DxULIZ.camera_status != null && c2272701DxULIZ.voice_message_entrance_status != null) {
                    unit = Unit.LIZ;
                } else {
                    if (C0YNP.LJII(str) <= 0) {
                        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                        if (lLJIILIIL != null) {
                            interfaceC876950YajLIZIZ.LJJI(str, lLJIILIIL.longValue(), AbstractC1711506n3.LIZIZ, null);
                        } else {
                            unit = Unit.LIZ;
                        }
                    } else {
                        interfaceC876950YajLIZIZ.LJJI(str, c0y8tLJIL.getConversationShortId(), AbstractC1711506n3.LIZ, null);
                    }
                    unit = Unit.LIZ;
                }
            }
            if (unit == objLJFF) {
                C1C7U.LIZIZ("IMQuickMessageInputVM@b1e6.onPrepared$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickMessageInputVM@b1e6.onPrepared$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
