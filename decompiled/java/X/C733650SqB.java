package X;

import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733650SqB {
    public static String LIZJ;
    public static final C733650SqB LIZ = new C733650SqB();
    public static String LIZIZ = "";
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(538));

    public static Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        String uid;
        EnumC1330205Im enumC1330205Im;
        C1723206ow c1723206ow;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        boolean zLIZJ = C1336205Ku.LIZJ().LIZJ();
        IMSharePanelApi.LIZ.getClass();
        List<C1723206ow> listLJJIJL = C1599690rjL.LIZ().getShareService().LJJIJL();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            LIZJ = null;
            C733490Spv c733490Spv = new C733490Spv(EnumC733580Sq4.EXTERNAL, null, null);
            C189200o6.m2constructorimpl(c733490Spv);
            c23260099m.resumeWith(c733490Spv);
        } else {
            boolean z = false;
            if (zLIZJ) {
                if (listLJJIJL != null && (c1723206ow = (C1723206ow) ListProtector.get(listLJJIJL, 0)) != null) {
                    enumC1330205Im = c1723206ow.LIZ;
                } else {
                    enumC1330205Im = null;
                }
                if (enumC1330205Im == EnumC1330205Im.EXTERNAL) {
                    LIZJ = null;
                    C733490Spv c733490Spv2 = new C733490Spv(EnumC733580Sq4.EXTERNAL, null, null);
                    C189200o6.m2constructorimpl(c733490Spv2);
                    c23260099m.resumeWith(c733490Spv2);
                } else {
                    LIZJ = null;
                    C733490Spv c733490Spv3 = new C733490Spv(EnumC733580Sq4.EXTERNAL, null, null);
                    C189200o6.m2constructorimpl(c733490Spv3);
                    c23260099m.resumeWith(c733490Spv3);
                }
            } else if (listLJJIJL != null && !listLJJIJL.isEmpty()) {
                if (((C1723206ow) ListProtector.get(listLJJIJL, 0)).LIZ == EnumC1330205Im.INTERNAL) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<C1723206ow> it2 = listLJJIJL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C1723206ow next = it2.next();
                        LIZ.getClass();
                        IMUser iMUserLIZLLL = ((InterfaceC1710106mp) LIZLLL.getValue()).LIZLLL(next.LIZIZ, null, "im_share");
                        if (iMUserLIZLLL != null) {
                            uid = iMUserLIZLLL.getUid();
                        } else {
                            uid = null;
                        }
                        if (uid != null && !iMUserLIZLLL.isBlock() && iMUserLIZLLL.getFollowStatus() == 2) {
                            LIZJ = iMUserLIZLLL.getUid();
                            UrlModel displayAvatar = iMUserLIZLLL.getDisplayAvatar();
                            if (displayAvatar != null) {
                                EnumC733580Sq4 enumC733580Sq4 = EnumC733580Sq4.CONTACT;
                                String uid2 = iMUserLIZLLL.getUid();
                                if (uid2 == null) {
                                    uid2 = "";
                                }
                                C733490Spv c733490Spv4 = new C733490Spv(enumC733580Sq4, displayAvatar, uid2);
                                C189200o6.m2constructorimpl(c733490Spv4);
                                c23260099m.resumeWith(c733490Spv4);
                                z = true;
                            }
                        } else {
                            arrayList.add(next.LIZIZ);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        IMSharePanelApi.LIZ.getClass();
                        C1599690rjL.LIZ().getShareService().LJJJJJL(arrayList);
                    }
                    if (arrayList.size() == listLJJIJL.size()) {
                        LIZJ = null;
                        if (!z) {
                            C733490Spv c733490Spv5 = new C733490Spv(EnumC733580Sq4.EXTERNAL, null, null);
                            C189200o6.m2constructorimpl(c733490Spv5);
                            c23260099m.resumeWith(c733490Spv5);
                        }
                    }
                } else {
                    LIZJ = null;
                    C733490Spv c733490Spv6 = new C733490Spv(EnumC733580Sq4.EXTERNAL, null, null);
                    C189200o6.m2constructorimpl(c733490Spv6);
                    c23260099m.resumeWith(c733490Spv6);
                }
            } else {
                try {
                    C1599690rjL.LIZ().LIZIZ().LIZLLL(10, new InterfaceC1368280li6() { // from class: X.0Sq5
                        @Override // X.InterfaceC1368280li6
                        public final void LIZIZ() {
                            C733650SqB.LIZ.getClass();
                            C733650SqB.LIZJ = null;
                            InterfaceC1364105Vn<C733490Spv> interfaceC1364105Vn2 = c23260099m;
                            C733490Spv c733490Spv7 = new C733490Spv(EnumC733580Sq4.EXTERNAL, null, null);
                            C189200o6.m2constructorimpl(c733490Spv7);
                            interfaceC1364105Vn2.resumeWith(c733490Spv7);
                        }

                        @Override // X.InterfaceC1368280li6
                        public final void LLJJIJIL(List<IMContact> list) {
                            ArrayList arrayList2 = (ArrayList) list;
                            Iterator it3 = arrayList2.iterator();
                            int i = 0;
                            boolean z2 = false;
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                int i2 = i + 1;
                                IMContact iMContact = (IMContact) it3.next();
                                if ((iMContact instanceof IMUser) && iMContact.getUid() != null) {
                                    IMUser iMUser = (IMUser) iMContact;
                                    if (iMUser.getFollowStatus() == 2 && iMUser.getDisplayAvatar() != null && !Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), iMContact.getUid())) {
                                        C733650SqB c733650SqB = C733650SqB.LIZ;
                                        String uid3 = iMContact.getUid();
                                        c733650SqB.getClass();
                                        C733650SqB.LIZJ = uid3;
                                        InterfaceC1364105Vn<C733490Spv> interfaceC1364105Vn2 = c23260099m;
                                        EnumC733580Sq4 enumC733580Sq42 = EnumC733580Sq4.CONTACT;
                                        UrlModel displayAvatar2 = iMUser.getDisplayAvatar();
                                        String uid4 = iMContact.getUid();
                                        if (uid4 == null) {
                                            uid4 = "";
                                        }
                                        C733490Spv c733490Spv7 = new C733490Spv(enumC733580Sq42, displayAvatar2, uid4);
                                        C189200o6.m2constructorimpl(c733490Spv7);
                                        interfaceC1364105Vn2.resumeWith(c733490Spv7);
                                        z2 = true;
                                    }
                                }
                                if (i == arrayList2.size() - 1) {
                                    C733650SqB.LIZ.getClass();
                                    C733650SqB.LIZJ = null;
                                    InterfaceC1364105Vn<C733490Spv> interfaceC1364105Vn3 = c23260099m;
                                    C733490Spv c733490Spv8 = new C733490Spv(EnumC733580Sq4.EXTERNAL, null, null);
                                    C189200o6.m2constructorimpl(c733490Spv8);
                                    interfaceC1364105Vn3.resumeWith(c733490Spv8);
                                    i = i2;
                                    z2 = true;
                                } else {
                                    i = i2;
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                C733650SqB.LIZ.getClass();
                                C733650SqB.LIZJ = null;
                                if (z2) {
                                    return;
                                }
                                InterfaceC1364105Vn<C733490Spv> interfaceC1364105Vn4 = c23260099m;
                                C733490Spv c733490Spv9 = new C733490Spv(EnumC733580Sq4.EXTERNAL, null, null);
                                C189200o6.m2constructorimpl(c733490Spv9);
                                interfaceC1364105Vn4.resumeWith(c733490Spv9);
                            }
                        }
                    }, null);
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2286608xc.LJ(Log.e("ShareButtonFlipHelper", "load default friend cancelled", e));
                }
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
