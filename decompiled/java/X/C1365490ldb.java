package X;

import android.app.Dialog;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS456S0200000_21;
import njp.a;

/* JADX INFO: renamed from: X.0ldb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.I18nUploadSuccessPopWindow$onChannelClicked$1", f = "I18nUploadSuccessPopWindow.kt", l = {97}, m = "invokeSuspend")
public final class C1365490ldb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1365470ldZ LLILLL;
    public final /* synthetic */ InterfaceC1369790lkX LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365490ldb(C1365470ldZ c1365470ldZ, InterfaceC1369790lkX interfaceC1369790lkX, View view, InterfaceC1364105Vn<? super C1365490ldb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1365470ldZ;
        this.LLILZ = interfaceC1369790lkX;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1365490ldb c1365490ldb = new C1365490ldb(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1365490ldb.LLILLJJLI = obj;
        return c1365490ldb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nUploadSuccessPopWindow@bf84.onChannelClicked$1");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C1365500ldc(this.LLILLL, this.LLILZ, null), 3);
            this.LL = 1;
            if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("I18nUploadSuccessPopWindow@bf84.onChannelClicked$1");
                return objLJFF;
            }
        }
        C1365470ldZ c1365470ldZ = this.LLILLL;
        BaseSharePackage baseSharePackage = c1365470ldZ.LLJJIII.LJIJJ;
        InterfaceC1369790lkX interfaceC1369790lkX = this.LLILZ;
        if (!baseSharePackage.LJII(interfaceC1369790lkX, c1365470ldZ.LLJJJJJIL, this.LLILZIL, null, new AwS387S0200000_21(c1365470ldZ, interfaceC1369790lkX, 1))) {
            if (C1366550lfJ.LIZ(this.LLILZ.key())) {
                C0FNV.LIZJ((Dialog) this.LLILLL.LLJJL.getValue());
            }
            C1365470ldZ c1365470ldZ2 = this.LLILLL;
            BaseSharePackage baseSharePackage2 = c1365470ldZ2.LLJJIII.LJIJJ;
            InterfaceC1369790lkX interfaceC1369790lkX2 = this.LLILZ;
            baseSharePackage2.LJIJ(interfaceC1369790lkX2, new AwS456S0200000_21(c1365470ldZ2, interfaceC1369790lkX2, 0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nUploadSuccessPopWindow@bf84.onChannelClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
