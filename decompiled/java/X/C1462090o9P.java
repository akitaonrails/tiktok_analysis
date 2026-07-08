package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.componentservices.VideoEditComponentService;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0o9P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1462090o9P extends C1462070o9N {
    public final InterfaceC1462140o9U LLLLLZIL;

    @Override // X.C1462070o9N
    public final void LLLZIL(C539960LFq c539960LFq) {
        super.LLLZIL(c539960LFq);
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.SHOW;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register uiGroupComponent ");
        sbLIZ.append(AbstractC1664510tPt.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC379580EuS.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZJ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC379580EuS.class, AbstractC1664510tPt.class, R.id.gsv, enumC371580EhY, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, this, 131));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("register component ");
        sbLIZ2.append(C1465330oEd.class.getName());
        sbLIZ2.append(" api ");
        sbLIZ2.append(InterfaceC1465230oET.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1465230oET.class, C1465330oEd.class, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, this, 129));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("register component ");
        sbLIZ3.append(C1462440o9y.class.getName());
        sbLIZ3.append(" api ");
        sbLIZ3.append(C05YF.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C1462440o9y.class, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, this, 130));
        Set<VideoEditComponentService> services = ServiceManager.get().getServices(VideoEditComponentService.class, true);
        if (services != null) {
            for (VideoEditComponentService videoEditComponentService : services) {
                LLLLLLL();
                LLLLLLL();
                videoEditComponentService.LIZLLL();
            }
        }
    }

    public C1462090o9P(C1DRG c1drg, boolean z, InterfaceC1462140o9U interfaceC1462140o9U) {
        super(c1drg, 0, z, interfaceC1462140o9U, 2);
        this.LLLLLZIL = interfaceC1462140o9U;
    }
}
