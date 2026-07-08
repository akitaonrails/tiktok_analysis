package X;

import Y.ACallableS181S0300000_22;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.LoudnessDetectResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1407430mjF {
    public final List<AbstractC1407390mjB> LIZ = new ArrayList();

    public abstract void LIZJ(InterfaceC1452170ntP interfaceC1452170ntP, LoudnessDetectResult[] loudnessDetectResultArr, C1407400mjC[] c1407400mjCArr, InterfaceC1407460mjI interfaceC1407460mjI);

    public final List<C1407400mjC> LIZ() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1407390mjB abstractC1407390mjB : this.LIZ) {
            List<C1407400mjC> listLIZ = abstractC1407390mjB.LIZ();
            Iterator<C1407400mjC> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJII = abstractC1407390mjB;
            }
            arrayList.addAll(listLIZ);
        }
        return arrayList;
    }

    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel, final InterfaceC1452170ntP interfaceC1452170ntP, final InterfaceC1407460mjI interfaceC1407460mjI) {
        final List<C1407400mjC> listLIZ = LIZ();
        if (((ArrayList) listLIZ).isEmpty()) {
            return;
        }
        final C1407420mjE c1407420mjE = (C1407420mjE) this;
        C15O7.LIZJ(new ACallableS181S0300000_22(listLIZ, videoPublishEditModel, c1407420mjE, 1)).LJ(new InterfaceC2385309Wh() { // from class: X.0mjH
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("LoudnessNormalizationOperatorBase@4d85.goTo$2");
                c1407420mjE.LIZJ(interfaceC1452170ntP, (LoudnessDetectResult[]) c15o7.LJIIL(), (C1407400mjC[]) listLIZ.toArray(new C1407400mjC[0]), interfaceC1407460mjI);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LoudnessNormalizationOperatorBase@4d85.goTo$2");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
