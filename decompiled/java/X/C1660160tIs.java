package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.toolbar.ToolbarComponent$state$lambda$4$$inlined$combine$1$3", f = "ToolbarComponent.kt", l = {292}, m = "invokeSuspend")
public final class C1660160tIs extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super List<? extends C1661930tLj<InterfaceC1659860tIO, InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>>>, C1661930tLj<InterfaceC1659860tIO, InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C1660160tIs(InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super List<? extends C1661930tLj<InterfaceC1659860tIO, InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>>> interfaceC346701Wf, C1661930tLj<InterfaceC1659860tIO, InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>[] c1661930tLjArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1660160tIs c1660160tIs = new C1660160tIs(interfaceC1364105Vn);
        c1660160tIs.LLILLJJLI = interfaceC346701Wf;
        c1660160tIs.LLILLL = c1661930tLjArr;
        return c1660160tIs.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolbarComponent@20f4.state$lambda$4$$inlined$combine$1$3");
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
                C1C7U.LIZIZ("ToolbarComponent@20f4.state$lambda$4$$inlined$combine$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolbarComponent@20f4.state$lambda$4$$inlined$combine$1$3");
        return unit;
    }
}
