package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O4B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM$refreshBookDetail$1", f = "BookDetailVM.kt", l = {48}, m = "invokeSuspend")
public final class C0O4B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BookDetailVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O4B(BookDetailVM bookDetailVM, InterfaceC1364105Vn<? super C0O4B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bookDetailVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O4B(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0O3P c0o3p;
        C1C7U.LIZ("BookDetailVM@4059.refreshBookDetail$1");
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
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));
            C613220O3k c613220O3k = BookDetailApi.LIZ;
            String strVQ2 = this.LLILLJJLI.vQ2();
            boolean z = this.LLILLJJLI.LLILLL;
            c613220O3k.getClass();
            C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C0O4D(strVQ2));
            C0O4N value = C613220O3k.LJ.getValue();
            AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(35);
            AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(635);
            Intrinsics.LJFF(C0O4C.class, C0O4C.class);
            c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C0O4C.class, C0O4C.class)));
            if (z) {
                c0o3p = C613220O3k.LIZJ;
            } else {
                c0o3p = C613220O3k.LIZIZ;
            }
            C0O7F.LIZIZ(c613960O6gLIZIZ, c0o3p);
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 21);
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("BookDetailVM@4059.refreshBookDetail$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BookDetailVM@4059.refreshBookDetail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
