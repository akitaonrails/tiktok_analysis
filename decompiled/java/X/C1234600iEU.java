package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.ShowInviteDialogOperator$asyncShowDialog$1$2$1", f = "ShowInviteDialogOperator.kt", l = {}, m = "invokeSuspend")
public final class C1234600iEU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C1234530iEN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234600iEU(Aweme aweme, C1234530iEN c1234530iEN, InterfaceC1364105Vn<? super C1234600iEU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = c1234530iEN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234600iEU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShowInviteDialogOperator@11e1.asyncShowDialog$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((ArrayList) C612470O0n.LIZIZ).add(this.LL);
        C1234530iEN c1234530iEN = this.LLILLJJLI;
        c1234530iEN.LJFF = c1234530iEN.LIZJ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShowInviteDialogOperator@11e1.asyncShowDialog$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
