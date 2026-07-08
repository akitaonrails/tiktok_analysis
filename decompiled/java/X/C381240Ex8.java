package X;

import com.ss.android.ugc.gamora.genaifoundation.core.GenAIFoundationServiceImpl;
import com.ss.android.ugc.gamora.genaifoundation.core.IGenAIFoundationService;

/* JADX INFO: renamed from: X.0Ex8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381240Ex8 implements IGenAIFoundationService {
    public static final C381240Ex8 LIZIZ = new C381240Ex8();
    public final /* synthetic */ IGenAIFoundationService LIZ;

    @Override // com.ss.android.ugc.gamora.genaifoundation.core.IGenAIFoundationService
    public final InterfaceC378020Erw LIZ(C379640EuY c379640EuY) {
        return this.LIZ.LIZ(c379640EuY);
    }

    @Override // com.ss.android.ugc.gamora.genaifoundation.core.IGenAIFoundationService
    public final InterfaceC355850DxH LIZIZ(EnumC379630EuX enumC379630EuX) {
        return this.LIZ.LIZIZ(enumC379630EuX);
    }

    public C381240Ex8() {
        IGenAIFoundationService iGenAIFoundationService;
        Object objLIZ = C04TD.LIZ(IGenAIFoundationService.class, false);
        if (objLIZ != null) {
            iGenAIFoundationService = (IGenAIFoundationService) objLIZ;
        } else {
            if (C04TD.w6 == null) {
                synchronized (IGenAIFoundationService.class) {
                    if (C04TD.w6 == null) {
                        C04TD.w6 = new GenAIFoundationServiceImpl();
                    }
                }
            }
            iGenAIFoundationService = C04TD.w6;
        }
        this.LIZ = iGenAIFoundationService;
    }
}
