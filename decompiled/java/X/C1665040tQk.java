package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1665040tQk extends C2217421BqW implements Function1<Float, Unit> {
    public C1665040tQk(Object obj) {
        super(1, obj, C1665030tQj.class, "soundTrackClick", "soundTrackClick(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        C1665030tQj c1665030tQj = (C1665030tQj) this.receiver;
        InterfaceC1665180tQy value = c1665030tQj.LLILLL.getValue();
        if (value instanceof C1665070tQn) {
            c1665030tQj.LLJIJIL.LIZ("click_choose_start_point_met_template", false);
            C1665070tQn c1665070tQn = (C1665070tQn) value;
            C1665110tQr c1665110tQr = c1665070tQn.LIZ;
            InterfaceC1665140tQu interfaceC1665140tQu = c1665110tQr.LIZJ.LIZJ;
            if (interfaceC1665140tQu instanceof C1665060tQm) {
                float fLJIILIIL = ((c1665030tQj.LLILZ.LJIILIIL() - r2) * fFloatValue) + c1665030tQj.LLILZ.LJII();
                c1665030tQj.LLJJIII = String.valueOf(fLJIILIIL / 1000.0f);
                InterfaceC332260D0u<InterfaceC1665180tQy> interfaceC332260D0u = c1665030tQj.LLILLL;
                C1665120tQs c1665120tQs = c1665110tQr.LIZJ;
                interfaceC332260D0u.setValue(C1665070tQn.LIZ(c1665070tQn, new C1665110tQr(c1665110tQr.LIZ, c1665110tQr.LIZIZ, new C1665120tQs(c1665120tQs.LIZ, c1665120tQs.LIZIZ, new C1665060tQm(C1665030tQj.LJJIIZI(fLJIILIIL), fFloatValue, ((C1665060tQm) interfaceC1665140tQu).LIZJ)))));
            }
        }
        return Unit.LIZ;
    }
}
