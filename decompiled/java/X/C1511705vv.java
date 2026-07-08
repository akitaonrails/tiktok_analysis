package X;

import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM$reportShowCreatorEditPage$1", f = "PublicGroupCreationVM.kt", l = {353}, m = "invokeSuspend")
public final class C1511705vv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PublicGroupCreationVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC1493105sv LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511705vv(PublicGroupCreationVM publicGroupCreationVM, String str, String str2, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C1511705vv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = publicGroupCreationVM;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1511705vv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublicGroupCreationVM@3de.reportShowCreatorEditPage$1");
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
            PublicGroupCreationVM publicGroupCreationVM = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = 1;
            obj = publicGroupCreationVM.yQ2(str, str2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PublicGroupCreationVM@3de.reportShowCreatorEditPage$1");
                return objLJFF;
            }
        }
        this.LLILZIL.sendEvent("group_edit_page_show", (Map) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PublicGroupCreationVM@3de.reportShowCreatorEditPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
