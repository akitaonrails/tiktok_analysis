package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.saas.api.activestatus.IActiveStatusObserverProducer;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0m4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382450m4x {
    public final C1231704rr LIZ;
    public final C1382470m4z LIZIZ;
    public final InterfaceC1725106pF LIZJ;
    public final String LIZLLL;
    public final PrivacySettingsFeature LJ;
    public final Object LJFF;
    public final List<IMContact> LJI;
    public final List<IMContact> LJII;

    public final void LIZ() {
        List<AbstractC595720NYc> listLIZLLL;
        InterfaceC897330ZId interfaceC897330ZId;
        IMConversation iMConversationLJII;
        List<C0Y8T> listLJII = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJII();
        ArrayList arrayList = new ArrayList();
        for (C0Y8T c0y8t : listLJII) {
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && (iMConversationLJII = iIMContactUtilServiceLIZ.LJII(c0y8t)) != null) {
                arrayList.add(iMConversationLJII);
            }
        }
        C0IBF[] c0ibfArr = C891610YyN.LIZ;
        List<? extends BaseContact> listLIZ = C891610YyN.LIZ(arrayList);
        C1382470m4z c1382470m4z = this.LIZIZ;
        c1382470m4z.getClass();
        IActiveStatusObserverProducer.LIZ.getClass();
        IActiveStatusObserverProducer iActiveStatusObserverProducerLIZ = C1362550lYr.LIZ();
        if (iActiveStatusObserverProducerLIZ != null && (listLIZLLL = iActiveStatusObserverProducerLIZ.LIZLLL(listLIZ)) != null && (interfaceC897330ZId = c1382470m4z.LIZIZ) != null) {
            interfaceC897330ZId.LJFF(listLIZLLL);
        }
        synchronized (this.LJFF) {
            try {
                ((ArrayList) this.LJI).addAll(listLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        if (!this.LJ.LJIJ()) {
            this.LIZ.LIZIZ();
            return;
        }
        List<IMUser> listLJIJJLI = this.LIZJ.LJIJJLI();
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : listLJIJJLI) {
            if (iMUser.getShareStatus() != 2) {
                arrayList.add(iMUser);
            }
        }
        C0IBF[] c0ibfArr = C891610YyN.LIZ;
        List listLIZIZ = C891610YyN.LIZIZ(arrayList, false, this.LIZ);
        C1231704rr c1231704rr = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("raw maf list size ");
        sbLIZ.append(listLJIJJLI.size());
        sbLIZ.append(", after filter share status size ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(", after filter camera permission size ");
        sbLIZ.append(((ArrayList) listLIZIZ).size());
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        synchronized (this.LJFF) {
            try {
                ((ArrayList) this.LJI).addAll(listLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1382450m4x(C1231704rr c1231704rr, C1382470m4z c1382470m4z) {
        IMContactApi.LIZ.getClass();
        InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        curUserId = curUserId == null ? "" : curUserId;
        PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
        this.LIZ = c1231704rr;
        this.LIZIZ = c1382470m4z;
        this.LIZJ = interfaceC1725106pFLIZ;
        this.LIZLLL = curUserId;
        this.LJ = imPrivacySettings;
        this.LJFF = new Object();
        this.LJI = new ArrayList();
        this.LJII = new ArrayList();
    }
}
