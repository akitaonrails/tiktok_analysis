package X;

import com.fackbook.drawee.IDraweeConfigOutService;
import com.ss.android.ugc.aweme.image.DraweeConfigOutService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320880kTe extends C09AY implements Function0<InterfaceC1320070kSL<? extends AbstractC1320720kTO<?, ?, ?, ?>>> {
    public C1320880kTe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1320070kSL<? extends AbstractC1320720kTO<?, ?, ?, ?>> invoke() {
        IDraweeConfigOutService iDraweeConfigOutService;
        Object objLIZ = C04TD.LIZ(IDraweeConfigOutService.class, false);
        if (objLIZ != null) {
            iDraweeConfigOutService = (IDraweeConfigOutService) objLIZ;
        } else {
            if (C04TD.o1 == null) {
                synchronized (IDraweeConfigOutService.class) {
                    if (C04TD.o1 == null) {
                        C04TD.o1 = new DraweeConfigOutService();
                    }
                }
            }
            iDraweeConfigOutService = C04TD.o1;
        }
        if (iDraweeConfigOutService != null) {
            return iDraweeConfigOutService.LIZ();
        }
        return null;
    }
}
