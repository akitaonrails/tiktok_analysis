package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ldc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.I18nUploadSuccessPopWindow$onChannelClicked$1$preShareJob$1", f = "I18nUploadSuccessPopWindow.kt", l = {96}, m = "invokeSuspend")
public final class C1365500ldc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1365470ldZ LLILLJJLI;
    public final /* synthetic */ InterfaceC1369790lkX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365500ldc(C1365470ldZ c1365470ldZ, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn<? super C1365500ldc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1365470ldZ;
        this.LLILLL = interfaceC1369790lkX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365500ldc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("I18nUploadSuccessPopWindow@bf84.onChannelClicked$1$preShareJob$1");
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
            C1365470ldZ c1365470ldZ = this.LLILLJJLI;
            C1371590lnR c1371590lnR = c1365470ldZ.LLJJIII;
            InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
            if (interfaceC1366490lfD != null) {
                InterfaceC1369790lkX interfaceC1369790lkX = this.LLILLL;
                BaseSharePackage baseSharePackage = c1371590lnR.LJIJJ;
                Activity activity = c1365470ldZ.LLJJJJJIL;
                this.LL = 1;
                if (interfaceC1366490lfD.LJII(activity, baseSharePackage, interfaceC1369790lkX, this) == objLJFF) {
                    C1C7U.LIZIZ("I18nUploadSuccessPopWindow@bf84.onChannelClicked$1$preShareJob$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("I18nUploadSuccessPopWindow@bf84.onChannelClicked$1$preShareJob$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nUploadSuccessPopWindow@bf84.onChannelClicked$1$preShareJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
