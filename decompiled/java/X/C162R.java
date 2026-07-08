package X;

import X.C164B;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;

/* JADX INFO: renamed from: X.162R, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C162R<T extends C164B> extends C163A<Aweme, T, AbstractC1361480lX8<T>> {
    @Override // X.C163A
    public final InterfaceC1389740mGi LJIIJ(boolean z, Aweme aweme, String str, String str2, EnumC207100162g enumC207100162g) {
        Aweme aweme2 = aweme;
        if (!z || enumC207100162g == EnumC207100162g.OFFLINE_CAPTIONS) {
            return null;
        }
        ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
        C20703515zt.LIZ.getClass();
        return iCLAPerfETServiceLIZ.LJIIIZ(C20703515zt.LIZIZ.LJJIJIIJIL(null, aweme2, str), LJ(aweme2), str2, enumC207100162g.getEtName());
    }
}
