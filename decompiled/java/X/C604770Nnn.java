package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.invite.BulletinInviteButtonViewConfigManager$unSubscribeBulletin$1", f = "BulletinInviteButtonViewConfigManager.kt", l = {56}, m = "invokeSuspend")
public final class C604770Nnn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C604810Nnr LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C604770Nnn(Context context, C604810Nnr c604810Nnr, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C604770Nnn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c604810Nnr;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604770Nnn(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinInviteButtonViewConfigManager@8829.unSubscribeBulletin$1");
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
            C214824195i c214824195i = C214824195i.LIZIZ;
            Context context = this.LLILLJJLI;
            String strValueOf = String.valueOf(this.LLILLL.LIZ);
            this.LL = 1;
            obj = c214824195i.LJII(context, strValueOf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinInviteButtonViewConfigManager@8829.unSubscribeBulletin$1");
                return objLJFF;
            }
        }
        this.LLILZ.invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinInviteButtonViewConfigManager@8829.unSubscribeBulletin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
