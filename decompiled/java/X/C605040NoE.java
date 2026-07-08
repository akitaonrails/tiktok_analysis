package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NoE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinNinePatchUtil$loadNinePatchDrawable$6", f = "BulletinNinePatchUtil.kt", l = {}, m = "invokeSuspend")
public final class C605040NoE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC605070NoH LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605040NoE(InterfaceC605070NoH interfaceC605070NoH, Throwable th, InterfaceC1364105Vn<? super C605040NoE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC605070NoH;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605040NoE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("BulletinNinePatchUtil@e52f.loadNinePatchDrawable$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC605070NoH interfaceC605070NoH = this.LL;
        if (interfaceC605070NoH != null) {
            interfaceC605070NoH.onFailed(this.LLILLJJLI);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("BulletinNinePatchUtil@e52f.loadNinePatchDrawable$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
