package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.PcsFormFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734620vEy extends C09AY implements Function2<C03H5, C291001Au<? extends AbstractC788420UwK>, Unit> {
    public final /* synthetic */ PcsFormFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734620vEy(PcsFormFragment pcsFormFragment) {
        super(2);
        this.LL = pcsFormFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends AbstractC788420UwK> c291001Au) {
        AbstractC788420UwK abstractC788420UwKLIZ;
        C291001Au<? extends AbstractC788420UwK> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (abstractC788420UwKLIZ = c291001Au2.LIZ()) != null) {
            if (abstractC788420UwKLIZ instanceof C788430UwL) {
                PcsDialogAbility pcsDialogAbility = (PcsDialogAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), PcsDialogAbility.class, null);
                if (pcsDialogAbility != null) {
                    pcsDialogAbility.cj0();
                }
            } else if (!(abstractC788420UwKLIZ instanceof C788410UwJ)) {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }
}
