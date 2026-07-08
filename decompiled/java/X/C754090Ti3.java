package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ti3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.privacy.setting.prompt.removeoff.RemoveOffPopupManager$tryToShowRemoveOffPopup$1", f = "RemoveOffPopupManager.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C754090Ti3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754090Ti3(C19EG c19eg, String str, InterfaceC1364105Vn<? super C754090Ti3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754090Ti3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RemoveOffPopupManager@e08b.tryToShowRemoveOffPopup$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C754080Ti2 c754080Ti2 = new C754080Ti2(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c754080Ti2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RemoveOffPopupManager@e08b.tryToShowRemoveOffPopup$1");
                return objLJFF;
            }
        }
        RemoveOffProps removeOffProps = (RemoveOffProps) obj;
        if (removeOffProps == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RemoveOffPopupManager@e08b.tryToShowRemoveOffPopup$1");
            return unit;
        }
        if (!this.LLILLJJLI.isFinishing() && !this.LLILLJJLI.isDestroyed()) {
            C108P c108p = C108P.LIZ;
            C19EG c19eg = this.LLILLJJLI;
            String str = this.LLILLL;
            c108p.getClass();
            C108P.LIZIZ(c19eg, removeOffProps, str);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RemoveOffPopupManager@e08b.tryToShowRemoveOffPopup$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RemoveOffPopupManager@e08b.tryToShowRemoveOffPopup$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
