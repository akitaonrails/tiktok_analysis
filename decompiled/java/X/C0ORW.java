package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.core.convert.model.SimpleBulletinBoardInfo;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0ORW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORW implements IBulletinBoardDataService {
    public static boolean LJIILLIIL(BulletinAccountInfoResponse bulletinAccountInfoResponse) {
        BulletinSubscriptionInfo bulletinSubscriptionInfo;
        int i;
        BulletinSubscriptionInfo bulletinSubscriptionInfo2;
        if (bulletinAccountInfoResponse != null) {
            bulletinSubscriptionInfo = bulletinAccountInfoResponse.subscriptionInfo;
        } else {
            bulletinSubscriptionInfo = null;
        }
        if (bulletinSubscriptionInfo == null || bulletinAccountInfoResponse == null || (bulletinSubscriptionInfo2 = bulletinAccountInfoResponse.subscriptionInfo) == null || bulletinSubscriptionInfo2.subscribeStatus != 1) {
            C617050OId c617050OId = EnumC617060OIe.Companion;
            if (bulletinAccountInfoResponse != null) {
                i = bulletinAccountInfoResponse.identity;
            } else {
                i = -1;
            }
            if (!c617050OId.LIZIZ(i)) {
                return false;
            }
        }
        return true;
    }

    public static Unit LJIIZILJ(List list) {
        List listLJJII;
        if (list != null && (listLJJII = C09RB.LJJII(C09RB.LJIJI(new C08QP(C09RB.LJIIIZ(new C1939607ik(list), AFwS240S0000000_9.get$arr$(992)), AFwS240S0000000_9.get$arr$(993)), AFwS240S0000000_9.get$arr$(994)))) != null) {
            C622040OaY c622040OaYLIZLLL = C622190Oan.LJFF().LIZLLL();
            c622040OaYLIZLLL.getClass();
            Iterator it2 = listLJJII.iterator();
            while (it2.hasNext()) {
                c622040OaYLIZLLL.LIZ((C619390ORd) it2.next());
            }
            return Unit.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJ(BulletinAccountInfoResponse bulletinAccountInfoResponse) {
        if (!LJIILLIIL(bulletinAccountInfoResponse)) {
            C0OPX.LJII("saveBulletinBoardAccountInfo: not need save, by not Subscribe");
        } else {
            C622190Oan.LJII().LIZJ(new C618090OMd(bulletinAccountInfoResponse, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJFF(SimpleBulletinBoardInfo simpleBulletinBoardInfo) {
        BulletinSubscriptionInfo bulletinSubscriptionInfo = simpleBulletinBoardInfo.subscriptionInfo;
        if ((bulletinSubscriptionInfo != null && bulletinSubscriptionInfo.subscribeStatus == 1) || EnumC617060OIe.Companion.LIZIZ(simpleBulletinBoardInfo.identity)) {
            C622190Oan.LJII().LIZJ(new C618100OMe(simpleBulletinBoardInfo, null));
        } else {
            C0OPX.LJII("saveSimpleBulletinBoardAccountInfo: not need save, by not Subscribe");
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteBulletinBoardAsync: bbid:");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C622190Oan.LJII().LIZJ(new C621990OaT(str, null));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIIJ(List<BulletinStyleStruct> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBulletinBoardStyleStructList: bulletinStyleStructList:");
        sbLIZ.append(list);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C622190Oan.LJII().LIZJ(new C0ORU(list, null));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIIL(BulletinStyleStruct bulletinStyleStruct) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBulletinBoardStyleStruct: bulletinStyleStruct:");
        sbLIZ.append(bulletinStyleStruct);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C622190Oan.LJII().LIZJ(new C0ORV(bulletinStyleStruct, null));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LIZIZ(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBulletinBoardPublishQuota: bbid:");
        sbLIZ.append(str);
        sbLIZ.append(", publishQuota:");
        sbLIZ.append(j);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C622190Oan.LJII().LIZJ(new C622030OaX(j, str, null));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LIZJ(String str, InterfaceC1364105Vn<? super BulletinAccountInfoResponse> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBulletinBoardAccountInfo: bbid:");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        return C622190Oan.LJII().LIZ(interfaceC1364105Vn, new C621950OaP(str, null), false);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LIZLLL(String str, C616950OHt c616950OHt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBulletinBoardChannelVersion: bbid:");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        return C622190Oan.LJII().LIZ(c616950OHt, new C622000OaU(str, null), false);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIIIIZZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBulletinBoardChannelStatus: bbid:");
        sbLIZ.append(str);
        sbLIZ.append(", status:");
        sbLIZ.append(i);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C622190Oan.LJII().LIZJ(new C622020OaW(i, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe A[Catch: Exception -> 0x020b, TryCatch #1 {Exception -> 0x020b, blocks: (B:65:0x015d, B:66:0x0160, B:68:0x0164, B:69:0x0168, B:70:0x0171, B:72:0x0177, B:74:0x0181, B:77:0x0187, B:79:0x018d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b8, B:88:0x01c1, B:95:0x01eb, B:98:0x01f4, B:94:0x01d0, B:99:0x01f8, B:101:0x01fe, B:102:0x0202, B:38:0x00df, B:39:0x00e2, B:41:0x00e6, B:47:0x00fc, B:48:0x0102, B:52:0x0109, B:53:0x010b, B:54:0x0114, B:56:0x011a, B:58:0x0124, B:61:0x012a, B:62:0x012e, B:43:0x00ee, B:28:0x00a4, B:29:0x00a7, B:31:0x00ab, B:34:0x00c3, B:35:0x00c7, B:22:0x007e, B:24:0x008c, B:92:0x01c8), top: B:109:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: Exception -> 0x020b, TryCatch #1 {Exception -> 0x020b, blocks: (B:65:0x015d, B:66:0x0160, B:68:0x0164, B:69:0x0168, B:70:0x0171, B:72:0x0177, B:74:0x0181, B:77:0x0187, B:79:0x018d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b8, B:88:0x01c1, B:95:0x01eb, B:98:0x01f4, B:94:0x01d0, B:99:0x01f8, B:101:0x01fe, B:102:0x0202, B:38:0x00df, B:39:0x00e2, B:41:0x00e6, B:47:0x00fc, B:48:0x0102, B:52:0x0109, B:53:0x010b, B:54:0x0114, B:56:0x011a, B:58:0x0124, B:61:0x012a, B:62:0x012e, B:43:0x00ee, B:28:0x00a4, B:29:0x00a7, B:31:0x00ab, B:34:0x00c3, B:35:0x00c7, B:22:0x007e, B:24:0x008c, B:92:0x01c8), top: B:109:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee A[Catch: Exception -> 0x020b, TryCatch #1 {Exception -> 0x020b, blocks: (B:65:0x015d, B:66:0x0160, B:68:0x0164, B:69:0x0168, B:70:0x0171, B:72:0x0177, B:74:0x0181, B:77:0x0187, B:79:0x018d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b8, B:88:0x01c1, B:95:0x01eb, B:98:0x01f4, B:94:0x01d0, B:99:0x01f8, B:101:0x01fe, B:102:0x0202, B:38:0x00df, B:39:0x00e2, B:41:0x00e6, B:47:0x00fc, B:48:0x0102, B:52:0x0109, B:53:0x010b, B:54:0x0114, B:56:0x011a, B:58:0x0124, B:61:0x012a, B:62:0x012e, B:43:0x00ee, B:28:0x00a4, B:29:0x00a7, B:31:0x00ab, B:34:0x00c3, B:35:0x00c7, B:22:0x007e, B:24:0x008c, B:92:0x01c8), top: B:109:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109 A[Catch: Exception -> 0x020b, TryCatch #1 {Exception -> 0x020b, blocks: (B:65:0x015d, B:66:0x0160, B:68:0x0164, B:69:0x0168, B:70:0x0171, B:72:0x0177, B:74:0x0181, B:77:0x0187, B:79:0x018d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b8, B:88:0x01c1, B:95:0x01eb, B:98:0x01f4, B:94:0x01d0, B:99:0x01f8, B:101:0x01fe, B:102:0x0202, B:38:0x00df, B:39:0x00e2, B:41:0x00e6, B:47:0x00fc, B:48:0x0102, B:52:0x0109, B:53:0x010b, B:54:0x0114, B:56:0x011a, B:58:0x0124, B:61:0x012a, B:62:0x012e, B:43:0x00ee, B:28:0x00a4, B:29:0x00a7, B:31:0x00ab, B:34:0x00c3, B:35:0x00c7, B:22:0x007e, B:24:0x008c, B:92:0x01c8), top: B:109:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a A[Catch: Exception -> 0x020b, TryCatch #1 {Exception -> 0x020b, blocks: (B:65:0x015d, B:66:0x0160, B:68:0x0164, B:69:0x0168, B:70:0x0171, B:72:0x0177, B:74:0x0181, B:77:0x0187, B:79:0x018d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b8, B:88:0x01c1, B:95:0x01eb, B:98:0x01f4, B:94:0x01d0, B:99:0x01f8, B:101:0x01fe, B:102:0x0202, B:38:0x00df, B:39:0x00e2, B:41:0x00e6, B:47:0x00fc, B:48:0x0102, B:52:0x0109, B:53:0x010b, B:54:0x0114, B:56:0x011a, B:58:0x0124, B:61:0x012a, B:62:0x012e, B:43:0x00ee, B:28:0x00a4, B:29:0x00a7, B:31:0x00ab, B:34:0x00c3, B:35:0x00c7, B:22:0x007e, B:24:0x008c, B:92:0x01c8), top: B:109:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164 A[Catch: Exception -> 0x020b, TryCatch #1 {Exception -> 0x020b, blocks: (B:65:0x015d, B:66:0x0160, B:68:0x0164, B:69:0x0168, B:70:0x0171, B:72:0x0177, B:74:0x0181, B:77:0x0187, B:79:0x018d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b8, B:88:0x01c1, B:95:0x01eb, B:98:0x01f4, B:94:0x01d0, B:99:0x01f8, B:101:0x01fe, B:102:0x0202, B:38:0x00df, B:39:0x00e2, B:41:0x00e6, B:47:0x00fc, B:48:0x0102, B:52:0x0109, B:53:0x010b, B:54:0x0114, B:56:0x011a, B:58:0x0124, B:61:0x012a, B:62:0x012e, B:43:0x00ee, B:28:0x00a4, B:29:0x00a7, B:31:0x00ab, B:34:0x00c3, B:35:0x00c7, B:22:0x007e, B:24:0x008c, B:92:0x01c8), top: B:109:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177 A[Catch: Exception -> 0x020b, TryCatch #1 {Exception -> 0x020b, blocks: (B:65:0x015d, B:66:0x0160, B:68:0x0164, B:69:0x0168, B:70:0x0171, B:72:0x0177, B:74:0x0181, B:77:0x0187, B:79:0x018d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b8, B:88:0x01c1, B:95:0x01eb, B:98:0x01f4, B:94:0x01d0, B:99:0x01f8, B:101:0x01fe, B:102:0x0202, B:38:0x00df, B:39:0x00e2, B:41:0x00e6, B:47:0x00fc, B:48:0x0102, B:52:0x0109, B:53:0x010b, B:54:0x0114, B:56:0x011a, B:58:0x0124, B:61:0x012a, B:62:0x012e, B:43:0x00ee, B:28:0x00a4, B:29:0x00a7, B:31:0x00ab, B:34:0x00c3, B:35:0x00c7, B:22:0x007e, B:24:0x008c, B:92:0x01c8), top: B:109:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae A[Catch: Exception -> 0x020b, TryCatch #1 {Exception -> 0x020b, blocks: (B:65:0x015d, B:66:0x0160, B:68:0x0164, B:69:0x0168, B:70:0x0171, B:72:0x0177, B:74:0x0181, B:77:0x0187, B:79:0x018d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b8, B:88:0x01c1, B:95:0x01eb, B:98:0x01f4, B:94:0x01d0, B:99:0x01f8, B:101:0x01fe, B:102:0x0202, B:38:0x00df, B:39:0x00e2, B:41:0x00e6, B:47:0x00fc, B:48:0x0102, B:52:0x0109, B:53:0x010b, B:54:0x0114, B:56:0x011a, B:58:0x0124, B:61:0x012a, B:62:0x012e, B:43:0x00ee, B:28:0x00a4, B:29:0x00a7, B:31:0x00ab, B:34:0x00c3, B:35:0x00c7, B:22:0x007e, B:24:0x008c, B:92:0x01c8), top: B:109:0x0023, inners: #0 }] */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ORW.LJIIIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LJIIJJI(BulletinAccountInfoResponse bulletinAccountInfoResponse, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveBulletinBoardAccountInfo: response:");
        sbLIZ.append(bulletinAccountInfoResponse);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (!LJIILLIIL(bulletinAccountInfoResponse)) {
            C0OPX.LJII("saveBulletinBoardAccountInfo: not need save, by not Subscribe");
            return Unit.LIZ;
        }
        Object objLIZIZ = C622190Oan.LJII().LIZIZ(interfaceC1364105Vn, new C618080OMc(bulletinAccountInfoResponse, null));
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LIZ(BulletinItem bulletinItem, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveBulletinBoardItemAsync: bbid:");
        sbLIZ.append(str);
        sbLIZ.append(", item:");
        sbLIZ.append(bulletinItem);
        sbLIZ.append(", needSaveHasRead:");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C622190Oan.LJII().LIZJ(new C0ORY(bulletinItem, str, z, null));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIILIIL(BulletinListResponse bulletinListResponse, String str, boolean z) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveBulletinBoardItemListAsync: bbid:");
        sbLIZ.append(str);
        sbLIZ.append(", itemSize:");
        List<BulletinItem> list = bulletinListResponse.bulletinItems;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(", needSaveHasRead:");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C622190Oan.LJII().LIZJ(new C619360ORa(bulletinListResponse, str, z, this, null));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final void LJIILL(String str, boolean z, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveBulletinBoardItemListAsync: bbid:");
        sbLIZ.append(str);
        sbLIZ.append(", itemSize:");
        sbLIZ.append(list.size());
        sbLIZ.append(", needSaveHasRead:");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        try {
            C622190Oan.LJII().LIZJ(new C0ORX(list, str, this, null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveBulletinBoardItemListAsync error: ");
            sbLIZ2.append(e.getMessage());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LJIILJJIL(BulletinListResponse bulletinListResponse, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveBulletinBoardItemList: bbid:");
        sbLIZ.append(str);
        sbLIZ.append(", itemSize:");
        List<BulletinItem> list = bulletinListResponse.bulletinItems;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(", needSaveHasRead:");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        return C622190Oan.LJII().LIZIZ(interfaceC1364105Vn, new C0ORZ(bulletinListResponse, str, z, this, null));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService
    public final Object LJII(String str, BulletinListResponse bulletinListResponse, Long l, Long l2, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("replaceBulletinBoardItemList: bbid:");
        sbLIZ.append(str);
        sbLIZ.append(", itemSize:");
        List<BulletinItem> list = bulletinListResponse.bulletinItems;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(", beginTime:");
        sbLIZ.append(l);
        sbLIZ.append(", endTime:");
        sbLIZ.append(l2);
        sbLIZ.append(", needSaveHasRead:");
        sbLIZ.append(z);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        return C622190Oan.LJII().LIZIZ(interfaceC1364105Vn, new C621960OaQ(bulletinListResponse, str, z, this, l, l2, null));
    }
}
