package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.ur.alias.AliasListResponse;
import com.ss.android.ugc.ur.alias.IAliasService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.lego.AliasFetchRequestLegoTask$requestAliasList$1", f = "AliasFetchRequestLegoTask.kt", l = {57}, m = "invokeSuspend")
public final class C372601ca extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<C189200o6<AliasListResponse>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C372601ca(AnonymousClass0957<C189200o6<AliasListResponse>> anonymousClass0957, InterfaceC1364105Vn<? super C372601ca> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C372601ca(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AliasFetchRequestLegoTask@12a4.requestAliasList$1");
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
            AnonymousClass0957<C189200o6<AliasListResponse>> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AliasFetchRequestLegoTask@12a4.requestAliasList$1");
                return objLJFF;
            }
        }
        Object objM10unboximpl = ((C189200o6) obj).m10unboximpl();
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            ((IAliasService) ServiceManager.get().getService(IAliasService.class)).LJIIIIZZ((AliasListResponse) objM10unboximpl, true);
        }
        if (C189200o6.m5exceptionOrNullimpl(objM10unboximpl) != null) {
            ((IAliasService) ServiceManager.get().getService(IAliasService.class)).LJIIIIZZ(null, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliasFetchRequestLegoTask@12a4.requestAliasList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
