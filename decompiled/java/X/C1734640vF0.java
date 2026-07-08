package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.PcsFormFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734640vF0 extends C09AY implements Function2<C03H5, AbstractC1734470vEj, Unit> {
    public final /* synthetic */ IPcsLoadingAbility LL;
    public final /* synthetic */ PcsFormFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734640vF0(IPcsLoadingAbility iPcsLoadingAbility, PcsFormFragment pcsFormFragment) {
        super(2);
        this.LL = iPcsLoadingAbility;
        this.LLILLJJLI = pcsFormFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, AbstractC1734470vEj abstractC1734470vEj) {
        AbstractC1734470vEj abstractC1734470vEj2 = abstractC1734470vEj;
        if (!Intrinsics.LJFF(abstractC1734470vEj2, C1734490vEl.LIZ) && !Intrinsics.LJFF(abstractC1734470vEj2, C1734500vEm.LIZ)) {
            if (Intrinsics.LJFF(abstractC1734470vEj2, C1734480vEk.LIZ)) {
                InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
                if (interfaceC517590KRpLIZ != null) {
                    int i = this.LLILLJJLI.NR().LL;
                    Throwable th = this.LLILLJJLI.NR().getState().LLILZIL;
                    if (th == null) {
                        th = new Throwable();
                    }
                    interfaceC517590KRpLIZ.LJIIIZ(new C0JOM(i, "", th));
                }
                IPcsLoadingAbility iPcsLoadingAbility = this.LL;
                if (iPcsLoadingAbility != null) {
                    iPcsLoadingAbility.Ly2(C1734970vFX.LIZ(new C1734650vF1(this.LLILLJJLI)), null, null);
                }
            } else if (abstractC1734470vEj2 instanceof C1246050iWx) {
                if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
                    if (((C1246050iWx) abstractC1734470vEj2).LIZ) {
                        IPcsLoadingAbility iPcsLoadingAbility2 = this.LL;
                        if (iPcsLoadingAbility2 != null) {
                            iPcsLoadingAbility2.LJJJJL();
                        }
                        this.LLILLJJLI.OR();
                    }
                } else {
                    IPcsLoadingAbility iPcsLoadingAbility3 = this.LL;
                    if (iPcsLoadingAbility3 != null) {
                        iPcsLoadingAbility3.LJJJJL();
                    }
                    this.LLILLJJLI.OR();
                }
            } else if (Intrinsics.LJFF(abstractC1734470vEj2, C1246060iWy.LIZ)) {
                IPcsLoadingAbility iPcsLoadingAbility4 = this.LL;
                if (iPcsLoadingAbility4 != null) {
                    iPcsLoadingAbility4.LJJJJL();
                }
                this.LLILLJJLI.OR();
            } else {
                throw new C1954807lC();
            }
        } else {
            IPcsLoadingAbility iPcsLoadingAbility5 = this.LL;
            if (iPcsLoadingAbility5 != null) {
                iPcsLoadingAbility5.LJLJLJ();
            }
        }
        return Unit.LIZ;
    }
}
