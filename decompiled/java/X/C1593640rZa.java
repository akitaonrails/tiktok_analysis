package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spi.IActivityTabService;

/* JADX INFO: renamed from: X.0rZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593640rZa {
    public static final C1593640rZa LIZ = new C1593640rZa();

    public static boolean LIZ() {
        C128Y curFragment;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Object obj = abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZ : null;
        if (!(obj instanceof InterfaceC1603190roz)) {
            return false;
        }
        InterfaceC1603190roz interfaceC1603190roz = (InterfaceC1603190roz) obj;
        if (!(interfaceC1603190roz.getCurFragment() instanceof InterfaceC1593630rZZ) || (curFragment = interfaceC1603190roz.getCurFragment()) == null || !(curFragment instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) curFragment) == null) {
            return false;
        }
        return interfaceC1593630rZZ.Vp();
    }

    public static boolean LIZIZ() {
        IActivityTabService iActivityTabService;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Object obj = abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZ : null;
        if (!(obj instanceof InterfaceC1603190roz)) {
            return false;
        }
        InterfaceC1603190roz interfaceC1603190roz = (InterfaceC1603190roz) obj;
        if (!(interfaceC1603190roz.getCurFragment() instanceof InterfaceC1593630rZZ)) {
            Fragment curFragment = interfaceC1603190roz.getCurFragment();
            return (curFragment == null || (iActivityTabService = (IActivityTabService) PluggableExtentionKt.pluggableSpi$default(IActivityTabService.class, false, false, false, 14, null)) == null || !iActivityTabService.LIZIZ(curFragment)) ? false : true;
        }
        C128Y curFragment2 = interfaceC1603190roz.getCurFragment();
        if (curFragment2 == null || !(curFragment2 instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) curFragment2) == null) {
            return false;
        }
        return interfaceC1593630rZZ.UH();
    }
}
