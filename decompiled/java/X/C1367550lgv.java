package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.service.IIMContactManager;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.controller.helper.ShareStateHelper;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367550lgv {
    public final /* synthetic */ ViewOnTouchListenerC1367610lh1 LIZ;

    public C1367550lgv(ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1) {
        this.LIZ = viewOnTouchListenerC1367610lh1;
    }

    public final void LIZ(int i, View view) {
        int i2;
        boolean z;
        C310720CFy c310720CFyLIZIZ;
        if (!C06W7.LIZIZ(view.getContext())) {
            return;
        }
        final IMContact iMContact = (IMContact) view.getTag(83886080);
        Integer num = (Integer) view.getTag(50331648);
        if (num != null && iMContact != null) {
            if (num.intValue() != 50331648 && num.intValue() != 50331649) {
                if (num.intValue() != 100663296 || C1336205Ku.LIZJ().LIZJ()) {
                    return;
                }
                IIMContactManager iIMContactManager = (IIMContactManager) this.LIZ.LLJJIJIIJIL.getValue();
                ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1 = this.LIZ;
                iIMContactManager.LIZ(viewOnTouchListenerC1367610lh1.LL, iMContact, new AwS422S0200000_21(iMContact, viewOnTouchListenerC1367610lh1, 88));
                return;
            }
            ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh12 = this.LIZ;
            AbstractC1368060lhk abstractC1368060lhk = viewOnTouchListenerC1367610lh12.LLJILJILJ;
            boolean z2 = true;
            boolean z3 = false;
            if (abstractC1368060lhk != null && abstractC1368060lhk.LLILZ) {
                int size = abstractC1368060lhk.LLILZLL.size();
                if (((IAwemeImManager) this.LIZ.LLJJIJIL.getValue()).getProxy() != null && (c310720CFyLIZIZ = C1606620ruW.LIZIZ()) != null) {
                    i2 = c310720CFyLIZIZ.LIZ;
                } else {
                    i2 = 10;
                }
                AbstractC1368060lhk abstractC1368060lhk2 = this.LIZ.LLJILJILJ;
                if (abstractC1368060lhk2 != null && !abstractC1368060lhk2.LLILZLL.contains(iMContact)) {
                    z = true;
                } else {
                    z = false;
                }
                if (size >= i2 && z) {
                    String quantityString = this.LIZ.LL.getResources().getQuantityString(2131755276, i2, Integer.valueOf(i2));
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ.LL);
                    c1389890mGx.LJIIJ(quantityString);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                if (!this.LIZ.LIZ(iMContact)) {
                    return;
                }
                AbstractC1368060lhk abstractC1368060lhk3 = this.LIZ.LLJILJILJ;
                if (abstractC1368060lhk3 != null) {
                    if (abstractC1368060lhk3.LLILZLL.contains(iMContact)) {
                        abstractC1368060lhk3.LLILZLL.remove(iMContact);
                        z2 = false;
                    } else {
                        abstractC1368060lhk3.LLILZLL.add(iMContact);
                    }
                    z3 = z2;
                }
                AbstractC1368060lhk abstractC1368060lhk4 = this.LIZ.LLJILJILJ;
                if (abstractC1368060lhk4 != null) {
                    abstractC1368060lhk4.LLLII(i);
                }
                if (z3) {
                    this.LIZ.LJ(iMContact);
                }
                this.LIZ.LJIIL();
                return;
            }
            if (viewOnTouchListenerC1367610lh12.LLILLL == null) {
                if (C1336205Ku.LIZJ().LIZJ()) {
                    return;
                }
                IIMContactManager iIMContactManager2 = (IIMContactManager) this.LIZ.LLJJIJIIJIL.getValue();
                ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh13 = this.LIZ;
                iIMContactManager2.LIZ(viewOnTouchListenerC1367610lh13.LL, iMContact, new AwS422S0200000_21(iMContact, viewOnTouchListenerC1367610lh13, 87));
                return;
            }
            if (!viewOnTouchListenerC1367610lh12.LIZ(iMContact)) {
                return;
            }
            this.LIZ.LJ(iMContact);
            IInternalShareApi.LIZ.getClass();
            InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
            final ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh14 = this.LIZ;
            interfaceC1364710lcLLIZIZ.LJIJJ(viewOnTouchListenerC1367610lh14.LL, viewOnTouchListenerC1367610lh14.LLILLL, new IMContact[]{iMContact}, viewOnTouchListenerC1367610lh14.LLJJI, new InterfaceC1367420lgi() { // from class: X.0lgm
                @Override // X.InterfaceC1367420lgi
                public final void LIZ(String str) {
                    String str2;
                    String string;
                    Bundle bundle;
                    Bundle bundle2;
                    List<? extends IMContact> listSingletonList = Collections.singletonList(iMContact);
                    viewOnTouchListenerC1367610lh14.LJIIJ(str, listSingletonList);
                    ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh15 = viewOnTouchListenerC1367610lh14;
                    IMContact iMContact2 = iMContact;
                    SharePackage sharePackage = viewOnTouchListenerC1367610lh15.LLILLL;
                    String string2 = null;
                    if (sharePackage != null) {
                        str2 = sharePackage.itemType;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF("aweme", str2)) {
                        SharePackage sharePackage2 = viewOnTouchListenerC1367610lh15.LLILLL;
                        String str3 = viewOnTouchListenerC1367610lh15.LLJJIII;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C0I0B.LJFF.LIZIZ();
                        if (sharePackage2 != null && (bundle2 = sharePackage2.extras) != null) {
                            string = bundle2.getString("author_id");
                        } else {
                            string = null;
                        }
                        if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
                            string2 = bundle.getString("enter_from");
                        }
                        C830490Whz c830490Whz = new C830490Whz();
                        c830490Whz.put("platform", "chat");
                        c830490Whz.put("group_id", str3);
                        if (string == null) {
                            string = "";
                        }
                        c830490Whz.put("author_id", string);
                        if (string2 == null) {
                            string2 = "";
                        }
                        c830490Whz.put("enter_from", string2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("share_video_success");
                        sbLIZ.append(jCurrentTimeMillis);
                        String strLIZ = C2084808Es.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        c830490Whz.put("bind_id", strLIZ);
                        C20684815ws.LJIILLIIL("share_video_success", c830490Whz);
                        C830490Whz c830490Whz2 = new C830490Whz();
                        if (iMContact2 instanceof IMUser) {
                            c830490Whz2.put("to_user_id", iMContact2.getUid());
                        }
                        c830490Whz2.put("bind_id", strLIZ);
                        C20684815ws.LJIILLIIL("share_video_success_info", c830490Whz2);
                    }
                    IInternalShareApi.LIZ.getClass();
                    C1370970lmR.LIZ().LIZJ().LJIILLIIL(viewOnTouchListenerC1367610lh14.LLILLL, "", listSingletonList, System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
                    ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh16 = viewOnTouchListenerC1367610lh14;
                    SharePackage sharePackage3 = viewOnTouchListenerC1367610lh16.LLILLL;
                    if (sharePackage3 != null) {
                        ShareStateHelper.LIZJ(sharePackage3, ((IIMAnalyticsUtil) viewOnTouchListenerC1367610lh16.LLJJJ.getValue()).getProcessId(), listSingletonList);
                    }
                }
            }, new InterfaceC1367420lgi() { // from class: X.0lgx
                @Override // X.InterfaceC1367420lgi
                public final void LIZ(String str) {
                }
            });
        }
    }
}
