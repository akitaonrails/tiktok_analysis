package X;

import android.view.View;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06KN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel$onRefresh$5$1", f = "BulletinSettingsChildViewModel.kt", l = {212}, m = "invokeSuspend")
public final class C06KN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ BulletinSettingsChildViewModel LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KN(boolean z, BulletinSettingsChildViewModel bulletinSettingsChildViewModel, View view, InterfaceC1364105Vn<? super C06KN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = bulletinSettingsChildViewModel;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06KN(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Object objLJIIIIZZ;
        String strLIZJ;
        C1C7U.LIZ("BulletinSettingsChildViewModel@3de0.onRefresh$5$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LL;
                C155000ia.LIZIZ(obj);
                objLJIIIIZZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLL) {
                i = 1;
            } else {
                i = 2;
            }
            C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
            this.LL = i;
            this.LLILLJJLI = 1;
            objLJIIIIZZ = c1888220zEi.LJIIIIZZ(i, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.onRefresh$5$1");
                return objLJFF;
            }
        }
        BulletinSettingsChildViewModel bulletinSettingsChildViewModel = this.LLILZ;
        View view = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(objLJIIIIZZ)) {
            bulletinSettingsChildViewModel.LLJILLL = i;
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131829164);
            c1389890mGx.LJIIJJI();
        }
        View view2 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJIIIIZZ);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C632200Oqw) {
                strLIZJ = ((C632200Oqw) thM5exceptionOrNullimpl).getErrorMsg();
            } else {
                strLIZJ = "";
            }
            if (strLIZJ.length() == 0) {
                strLIZJ = C1618770sE7.LIZJ(2131829163);
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(view2);
            c1389890mGx2.LJIIJ(strLIZJ);
            c1389890mGx2.LJIIJJI();
        }
        this.LLILZ.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.onRefresh$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
