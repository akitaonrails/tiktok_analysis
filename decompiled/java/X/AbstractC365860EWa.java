package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC365860EWa<EFFECT_MODEL> extends AbstractC365870EWb {
    public final List<EFFECT_MODEL> LIZ = new ArrayList();
    public final InterfaceC1635410sex LIZIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
    public final boolean LIZJ = !C297640Bla.LIZ();

    public abstract void LJIIIIZZ(Effect effect, EFFECT_MODEL effect_model);

    public abstract void LJIIJ();

    public abstract String LJIIJJI(EFFECT_MODEL effect_model);

    public abstract List<EFFECT_MODEL> LJIIL();

    @Override // X.AbstractC365870EWb
    public boolean LIZ() {
        return this.LIZJ;
    }

    public InterfaceC1635410sex LJIIIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC365900EWe
    public Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        ((ArrayList) this.LIZ).addAll(LJIIL());
        return Boolean.valueOf(((ArrayList) this.LIZ).isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC365870EWb
    public Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        C19EG c19eg;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftBaseEffectRestoreHandler");
        sbLIZ.append(" ; fileType : ");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(" ; restore start ...");
        C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Object obj = getParams().LIZ;
        if ((obj instanceof C19EG) && (c19eg = (C19EG) obj) != null) {
            C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new AwS406S0200000_5((AbstractC365860EWa) this, (AbstractC365860EWa<Object>) c19eg, (C19EG) 136));
        }
        InterfaceC1635410sex interfaceC1635410sexLJIIIZ = LJIIIZ();
        List<EFFECT_MODEL> list = this.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(LJIIJJI(it2.next()));
        }
        interfaceC1635410sexLJIIIZ.LJFF(arrayList, true, null, new C0FX7(this, c2252611DEt, 1));
        c2252611DEt.LJJII(new AwS584S0100000_5(this, (AbstractC365860EWa<Object>) 1029));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
