package X;

import com.ss.android.ugc.aweme.property.bytebench.SmartSynthesisStrategy;

/* JADX INFO: renamed from: X.0naD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440270naD implements InterfaceC1440260naC {
    public static final /* synthetic */ C1440270naD LJIILLIIL = new C1440270naD();
    public final /* synthetic */ InterfaceC1440260naC LJIILL;

    @Override // X.InterfaceC1440260naC
    public final String getModelPath() {
        return this.LJIILL.getModelPath();
    }

    public C1440270naD() {
        InterfaceC1440260naC interfaceC1440260naC;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1440260naC = (InterfaceC1440260naC) c09gaLIZIZ.LJII(SmartSynthesisStrategy.class)) == null) ? new InterfaceC1440260naC() { // from class: X.0naE
            @Override // X.InterfaceC1440260naC
            public final String getModelPath() {
                return null;
            }

            static {
                C1440300naG.LIZ("SmartSynthesisBenchApi -> use DefaultApi");
            }
        } : interfaceC1440260naC;
    }
}
