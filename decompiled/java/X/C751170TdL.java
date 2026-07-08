package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.tiktok.pns.props.RemoveOffProps;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS128S1200000_12;
import njp.a;

/* JADX INFO: renamed from: X.0TdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl$showRemoveOffPopup$1", f = "PrivacyServiceImpl.kt", l = {223}, m = "invokeSuspend")
public final class C751170TdL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751170TdL(C19EG c19eg, String str, InterfaceC1364105Vn<? super C751170TdL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751170TdL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PrivacyServiceImpl@87d1.showRemoveOffPopup$1");
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
            C751180TdM c751180TdM = new C751180TdM(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c751180TdM);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PrivacyServiceImpl@87d1.showRemoveOffPopup$1");
                return objLJFF;
            }
        }
        RemoveOffProps removeOffProps = (RemoveOffProps) obj;
        if (removeOffProps == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PrivacyServiceImpl@87d1.showRemoveOffPopup$1");
            return unit;
        }
        if (!this.LLILLJJLI.isFinishing() && !this.LLILLJJLI.isDestroyed()) {
            C19EG c19eg = this.LLILLJJLI;
            PopupManager.LJIIZILJ(new C10GR(c19eg, new AwS128S1200000_12(c19eg, removeOffProps, this.LLILLL, 5)) { // from class: X.0TN7
                public final C19EG LL;
                public final Function0<Unit> LLILLJJLI;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 0;
                }

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg2 = this.LL;
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }

                {
                    this.LL = c19eg;
                    this.LLILLJJLI = awS128S1200000_12;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LLILLJJLI.invoke();
                }
            }, new C1668306g5("pns_profile_privacy_account_level_remove_off"));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PrivacyServiceImpl@87d1.showRemoveOffPopup$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PrivacyServiceImpl@87d1.showRemoveOffPopup$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
