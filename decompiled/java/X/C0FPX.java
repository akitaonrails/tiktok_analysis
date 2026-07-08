package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0FPX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FPX extends C09AY implements InterfaceC1631630sYr<List<? extends Effect>, Boolean, Integer, String, Unit> {
    public final /* synthetic */ C1664120tPG LL;
    public final /* synthetic */ C19754712Qv LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ InterfaceC1631630sYr<List<? extends Effect>, Boolean, Integer, String, List<Effect>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FPX(C1664120tPG c1664120tPG, C19754712Qv c19754712Qv, Effect effect, InterfaceC1631630sYr<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, ? extends List<? extends Effect>> interfaceC1631630sYr) {
        super(4);
        this.LL = c1664120tPG;
        this.LLILLJJLI = c19754712Qv;
        this.LLILLL = effect;
        this.LLILZ = interfaceC1631630sYr;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(List<? extends Effect> list, Boolean bool, Integer num, String str) {
        List<? extends Effect> list2 = list;
        if (bool.booleanValue()) {
            C1664120tPG c1664120tPG = this.LL;
            C19754712Qv c19754712Qv = this.LLILLJJLI;
            Effect effect = this.LLILLL;
            if (effect == null) {
                effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
            }
            c1664120tPG.LJIIIZ(list2, c19754712Qv, effect);
        } else if (list2 != null) {
            InterfaceC1631630sYr<List<? extends Effect>, Boolean, Integer, String, List<Effect>> interfaceC1631630sYr = this.LLILZ;
            C1664120tPG c1664120tPG2 = this.LL;
            C19754712Qv c19754712Qv2 = this.LLILLJJLI;
            Effect effect2 = this.LLILLL;
            List<Effect> listInvoke = interfaceC1631630sYr.invoke(list2, Boolean.FALSE, num, str);
            if (listInvoke != null) {
                c1664120tPG2.LJIIIZ(listInvoke, c19754712Qv2, effect2);
            }
        }
        return Unit.LIZ;
    }
}
