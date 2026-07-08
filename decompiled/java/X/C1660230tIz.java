package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.uiview.EditToolbarViewModel$toolbarState$2$invoke$lambda$8$$inlined$combine$1$3", f = "ToolbarViewModel.kt", l = {292}, m = "invokeSuspend")
public final class C1660230tIz extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>>, C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C1660230tIz(InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super List<? extends C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>> interfaceC346701Wf, C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>[] c1661930tLjArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1660230tIz c1660230tIz = new C1660230tIz(interfaceC1364105Vn);
        c1660230tIz.LLILLJJLI = interfaceC346701Wf;
        c1660230tIz.LLILLL = c1661930tLjArr;
        return c1660230tIz.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditToolbarViewModel@1eb1.toolbarState$2$invoke$lambda$8$$inlined$combine$1$3");
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
            List listLJJLL = C13LQ.LJJLL((Object[]) this.LLILLL);
            this.LL = 1;
            if (interfaceC346701Wf.emit(listLJJLL, this) == objLJFF) {
                C1C7U.LIZIZ("EditToolbarViewModel@1eb1.toolbarState$2$invoke$lambda$8$$inlined$combine$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditToolbarViewModel@1eb1.toolbarState$2$invoke$lambda$8$$inlined$combine$1$3");
        return unit;
    }
}
