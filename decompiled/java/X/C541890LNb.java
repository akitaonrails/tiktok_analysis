package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.api.util.addtostory.operation.ForwardOperationManager$showProgressDialog$1", f = "ForwardOperationManager.kt", l = {110}, m = "invokeSuspend")
public final class C541890LNb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0MK9 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541890LNb(C0MK9 c0mk9, Context context, InterfaceC1364105Vn<? super C541890LNb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mk9;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C541890LNb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0956 anonymousClass0956;
        C1C7U.LIZ("ForwardOperationManager@7828.showProgressDialog$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("ForwardOperationManager@7828.showProgressDialog$1");
                return objLJFF;
            }
        }
        C0MK9 c0mk9 = this.LLILLJJLI;
        if (c0mk9.LJ == null && (anonymousClass0956 = c0mk9.LIZJ) != null && anonymousClass0956.isActive()) {
            final C0MK9 c0mk92 = this.LLILLJJLI;
            Context context = this.LLILLL;
            c0mk92.getClass();
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLJLI(context.getString(2131847921));
            dialogC1389620mGW.LJJLL(true);
            dialogC1389620mGW.setCancelable(true);
            dialogC1389620mGW.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0LNc
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    AnonymousClass0956 anonymousClass09562 = c0mk92.LIZJ;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    c0mk92.LIZ.LIZLLL();
                    C0MKK c0mkk = c0mk92.LIZIZ;
                    c0mkk.getClass();
                    C0MKK.LIZ(c0mkk, C0MKA.CANCEL, null, null, null, 14);
                }
            };
            c0mk92.LJ = dialogC1389620mGW;
            DialogC1389620mGW dialogC1389620mGW2 = this.LLILLJJLI.LJ;
            if (dialogC1389620mGW2 != null) {
                C786410Ut5.J4(dialogC1389620mGW2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOperationManager@7828.showProgressDialog$1");
        return unit;
    }
}
