package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeSheetUtil$showFilterAllExpiredSheet$3$1", f = "CreatorCareModeSheetUtil.kt", l = {80}, m = "invokeSuspend")
public final class C1523705xr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<TuxSheet> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C770770ULj LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523705xr(C259800zU<TuxSheet> c259800zU, Context context, C770770ULj c770770ULj, InterfaceC1364105Vn<? super C1523705xr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = context;
        this.LLILZ = c770770ULj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523705xr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        String string;
        C632200Oqw c632200Oqw;
        C1C7U.LIZ("CreatorCareModeSheetUtil@dd8b.showFilterAllExpiredSheet$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1415705gR c1415705gR = C1415705gR.LIZ;
            this.LL = 1;
            objLIZ = c1415705gR.LIZ(this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CreatorCareModeSheetUtil@dd8b.showFilterAllExpiredSheet$3$1");
                return objLJFF;
            }
        }
        C259800zU<TuxSheet> c259800zU = this.LLILLJJLI;
        Context context = this.LLILLL;
        C770770ULj c770770ULj = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZ);
        if (thM5exceptionOrNullimpl == null) {
            TuxSheet tuxSheet = c259800zU.element;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//creator_care_mode/simplify_settings");
            smartRouteBuildRoute.withParam("enter_scene", EnumC1620106Vz.FILTER_ALL_POPUP.getValue());
            smartRouteBuildRoute.open();
        } else {
            C197039127h c197039127h = c770770ULj.LIZ;
            if (c197039127h != null) {
                if (!(thM5exceptionOrNullimpl instanceof C632200Oqw) || (c632200Oqw = (C632200Oqw) thM5exceptionOrNullimpl) == null || (string = c632200Oqw.getErrorMsg()) == null || string.length() <= 0) {
                    string = context.getString(2131835079);
                }
                C1389890mGx c1389890mGx = new C1389890mGx(c197039127h);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorCareModeSheetUtil@dd8b.showFilterAllExpiredSheet$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
