package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactBaseHandler$handle$2", f = "ContactBaseHandler.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1002360cBu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1074840e4o>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1002380cBw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002360cBu(AbstractC1002380cBw abstractC1002380cBw, InterfaceC1364105Vn<? super C1002360cBu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1002380cBw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002360cBu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactBaseHandler@cc97.handle$2");
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
            AbstractC1002380cBw abstractC1002380cBw = this.LLILLJJLI;
            this.LL = 1;
            obj = abstractC1002380cBw.LIZJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContactBaseHandler@cc97.handle$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ContactBaseHandler@cc97.handle$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1074840e4o> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
