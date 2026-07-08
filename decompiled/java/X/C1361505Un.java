package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewCellProtocol;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.05Un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1361505Un implements InterfaceC1361305Ul {
    public final /* synthetic */ InterfaceC665370Q7z LL;

    public C1361505Un(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }

    @Override // X.InterfaceC1361305Ul
    public final void W7(String str) {
        List listLIZIZ = C1554610qYd.LIZIZ(this.LL, TakoContentPreviewCellProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1361305Ul) it2.next()).W7(str);
            }
        }
    }

    @Override // X.InterfaceC1361305Ul
    public final C05UQ Y8(String str) {
        List listLIZIZ = C1554610qYd.LIZIZ(this.LL, TakoContentPreviewCellProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                C05UQ c05uqY8 = ((InterfaceC1361305Ul) it2.next()).Y8(str);
                if (c05uqY8 != null) {
                    return c05uqY8;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1361305Ul
    public final C1683130ttv aa(String str) {
        List listLIZIZ = C1554610qYd.LIZIZ(this.LL, TakoContentPreviewCellProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                C1683130ttv c1683130ttvAa = ((InterfaceC1361305Ul) it2.next()).aa(str);
                if (c1683130ttvAa != null) {
                    return c1683130ttvAa;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1361305Ul
    public final void Of(String str, boolean z) {
        List listLIZIZ = C1554610qYd.LIZIZ(this.LL, TakoContentPreviewCellProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1361305Ul) it2.next()).Of(str, z);
            }
        }
    }
}
