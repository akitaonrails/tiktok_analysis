package X;

import com.ss.android.ugc.aweme.service.proactive.ActiveLoginCommentService;
import com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService;

/* JADX INFO: renamed from: X.0l3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342970l3H implements C10HB {
    public static final C1342970l3H LIZ = new C1342970l3H();
    public static final IActiveLoginCommentService LIZIZ = ActiveLoginCommentService.LJIIIZ();
    public static C1340820kzo LIZJ;
    public static InterfaceC1342980l3I LIZLLL;
    public static String LJ;

    public static boolean LIZIZ(Long l) {
        return LIZIZ.LJFF(l);
    }

    @Override // X.C10HB
    public final void LIZ(boolean z, boolean z2) {
        InterfaceC1342980l3I interfaceC1342980l3I = LIZLLL;
        if (interfaceC1342980l3I != null) {
            interfaceC1342980l3I.vd(z, z2, LIZJ);
        }
        LIZLLL = null;
    }
}
