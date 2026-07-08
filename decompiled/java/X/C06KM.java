package X;

import android.view.View;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06KM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel$onRefresh$4$1", f = "BulletinSettingsChildViewModel.kt", l = {169}, m = "invokeSuspend")
public final class C06KM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ BulletinSettingsChildViewModel LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KM(boolean z, BulletinSettingsChildViewModel bulletinSettingsChildViewModel, View view, InterfaceC1364105Vn<? super C06KM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = bulletinSettingsChildViewModel;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06KM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIJ;
        String strLIZJ;
        C1C7U.LIZ("BulletinSettingsChildViewModel@3de0.onRefresh$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            boolean z = this.LLILLJJLI;
            C1888220zEi c1888220zEi = this.LLILLL.LLILLL;
            this.LL = 1;
            objLJIIJ = c1888220zEi.LJIIJ(z ? 1 : 0, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.onRefresh$4$1");
                return objLJFF;
            }
        }
        BulletinSettingsChildViewModel bulletinSettingsChildViewModel = this.LLILLL;
        boolean z2 = this.LLILLJJLI;
        View view = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(objLJIIJ)) {
            bulletinSettingsChildViewModel.LLJILJIL = z2;
            String statusMsg = ((BaseResponse) objLJIIJ).getStatusMsg();
            if (statusMsg.length() == 0) {
                statusMsg = C1618770sE7.LIZJ(2131829164);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(statusMsg);
            c1389890mGx.LJIIJJI();
        }
        View view2 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJIIJ);
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
        this.LLILLL.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinSettingsChildViewModel@3de0.onRefresh$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
