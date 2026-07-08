package X;

import android.content.Context;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iSW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.alias.AliasEditDialogUtil$buildActionGroup$1$1$2$2", f = "AliasEditDialogUtil.kt", l = {}, m = "invokeSuspend")
public final class C1243300iSW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1243310iSX LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C1243410iSh LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Exception LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243300iSW(InterfaceC1243310iSX interfaceC1243310iSX, Context context, C1243410iSh c1243410iSh, String str, Exception exc, InterfaceC1364105Vn<? super C1243300iSW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1243310iSX;
        this.LLILLJJLI = context;
        this.LLILLL = c1243410iSh;
        this.LLILZ = str;
        this.LLILZIL = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243300iSW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iD;
        C1C7U.LIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1243310iSX interfaceC1243310iSX = this.LL;
        if (interfaceC1243310iSX != null) {
            interfaceC1243310iSX.onFailed();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLJJLI);
        if (c19egLIZIZ != null) {
            Exception exc = this.LLILZIL;
            if (exc instanceof C0XIR) {
                C0XIR c0xir = (C0XIR) exc;
                if (c0xir.getErrorCode() == 3002512) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx.LJIIIZ(2131824790);
                    c1389890mGx.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZIZ);
                    c1389890mGx2.LJIIIZ(2131848597);
                    c1389890mGx2.LJIIJJI();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("API Error: ");
                sbLIZ.append(c0xir.getErrorCode());
                sbLIZ.append(": ");
                sbLIZ.append(c0xir.getErrorMsg());
                iD = Log.d("AliasEditDialog", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C1389890mGx c1389890mGx3 = new C1389890mGx(c19egLIZIZ);
                c1389890mGx3.LJIIIZ(2131824791);
                c1389890mGx3.LJIIJJI();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Network Error: ");
                sbLIZ2.append(exc.getMessage());
                iD = Log.d("AliasEditDialog", C2188811AlT.LIZIZ(sbLIZ2));
            }
            C2286608xc.LJ(iD);
        }
        C1243400iSg c1243400iSg = C1243400iSg.LIZ;
        C1243410iSh c1243410iSh = this.LLILLL;
        String str = this.LLILZ;
        c1243400iSg.getClass();
        C1243400iSg.LIZ(c1243410iSh, str, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
