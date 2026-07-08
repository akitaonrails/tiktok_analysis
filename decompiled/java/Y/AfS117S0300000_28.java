package Y;

import X.C09JN;
import X.C0Z31;
import X.C0ZAG;
import X.C0ZBH;
import X.C10AH;
import X.C10AT;
import X.C10C1;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C1483410ohn;
import X.C1519370pdn;
import X.C15438062q;
import X.C1675380thQ;
import X.C1697810uHb;
import X.C1901110zZV;
import X.C1903780zdo;
import X.C1915330zwR;
import X.C19210910Dr;
import X.C19216110Fr;
import X.C19280110bn;
import X.C1C7U;
import X.C20431614x8;
import X.C2252321DDq;
import X.C259800zU;
import X.C473080Igs;
import X.C606810Nr5;
import X.C890330YwJ;
import X.EnumC1902760zcA;
import X.EnumC19280010bm;
import X.InterfaceC1664410tPj;
import X.InterfaceC1699660uKa;
import X.InterfaceC852200Xbu;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.lynx.spark.SinglePageMonitorObserver;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.subscription.network.models.SubscriptionPhotoPreviewSettingsResponse;
import com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AfS117S0300000_28 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS117S0300000_28 afS117S0300000_28, Object obj) {
        C1C7U.LIZ("PolicyNoticeServiceImpl@4917.universalPopupCallback$1$setupLifecycleListeners$2");
        if (((C606810Nr5) obj).LIZIZ) {
            ((C1915330zwR) afS117S0300000_28.l0).getClass();
            C1915330zwR.LJI();
        } else if (!((PolicyNoticeServiceImpl) afS117S0300000_28.l1).LIZ && ((PolicyNoticeServiceImpl) afS117S0300000_28.l1).LJIIJJI) {
            if (PolicyNoticeServiceImpl.LJIILJJIL.contains(((C1519370pdn) afS117S0300000_28.l2).LIZ) && !((PolicyNoticeServiceImpl) afS117S0300000_28.l1).LIZIZ) {
                ((C1915330zwR) afS117S0300000_28.l0).getClass();
                if (C1483410ohn.LJLJJI().isPaused()) {
                    C1483410ohn.LJLJJI().LJIILLIIL();
                }
            }
        }
        C1C7U.LIZIZ("PolicyNoticeServiceImpl@4917.universalPopupCallback$1$setupLifecycleListeners$2");
    }

    public static final void accept$1(AfS117S0300000_28 afS117S0300000_28, Object obj) {
        C1C7U.LIZ("SinglePageMonitorObserver@b322.disposable$1");
        ((C09JN) afS117S0300000_28.l0).accept(obj);
        ((Lifecycle) afS117S0300000_28.l1).removeObserver((SinglePageMonitorObserver) afS117S0300000_28.l2);
        ((SinglePageMonitorObserver) afS117S0300000_28.l2).LL.dispose();
        C1C7U.LIZIZ("SinglePageMonitorObserver@b322.disposable$1");
    }

    public static final void accept$2(AfS117S0300000_28 afS117S0300000_28, Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("MultiViewModel@a25.onRefresh$2$inboxEntranceRequest$1");
        InboxEntranceResponse inboxEntranceResponse = (InboxEntranceResponse) obj;
        IMChatListApi.LJJIII.getClass();
        C0Z31 c0z31LJIIZILJ = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ != null) {
            c0z31LJIIZILJ.LJIIL(String.valueOf(inboxEntranceResponse.status_code));
        }
        ((C1901110zZV) afS117S0300000_28.l0).LJII(inboxEntranceResponse);
        MultiViewModel multiViewModel = (MultiViewModel) afS117S0300000_28.l1;
        CopyOnWriteArrayList<InboxEntrancePod> copyOnWriteArrayList = multiViewModel.LLJL;
        EnumC1902760zcA enumC1902760zcA = (EnumC1902760zcA) afS117S0300000_28.l2;
        boolean z = multiViewModel.LLJLIL;
        if (copyOnWriteArrayList != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
            Iterator<InboxEntrancePod> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().entranceCell);
            }
        } else {
            arrayList = null;
        }
        C0ZBH.LIZ(inboxEntranceResponse, arrayList, enumC1902760zcA, z);
        C1903780zdo.LJII().LJJI(new NoticeList(null, inboxEntranceResponse.getNoticeCounts(), inboxEntranceResponse.getEntranceCount(), 0L, null, inboxEntranceResponse.getGroups(), null, null, null, null, 0L)).LJJLJ();
        C0ZAG c0zag = C0ZAG.LIZ;
        String str = inboxEntranceResponse.extra.logid;
        c0zag.getClass();
        C0ZAG.LJII = str;
        C1C7U.LIZIZ("MultiViewModel@a25.onRefresh$2$inboxEntranceRequest$1");
    }

    public static final void accept$3(AfS117S0300000_28 afS117S0300000_28, Object obj) {
        Object value;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C1C7U.LIZ("PhotoPreviewViewModel@2705.updateAwemePhotoPreviewSettings$1");
        Integer num = ((SubscriptionPhotoPreviewSettingsResponse) obj).statusCode;
        if (num != null && num.intValue() == 0) {
            PhotoPreviewViewModel photoPreviewViewModel = (PhotoPreviewViewModel) afS117S0300000_28.l0;
            Aweme aweme = ((C10C1) afS117S0300000_28.l1).LIZJ;
            InterfaceC1664410tPj interfaceC1664410tPj = (InterfaceC1664410tPj) afS117S0300000_28.l2;
            photoPreviewViewModel.getClass();
            if (aweme != null && (((photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) || (imageList = C13BV.INSTANCE) != null)) {
                int i = 0;
                for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        PhotoModeImageUrlModel photoModeImageUrlModel2 = photoModeImageUrlModel;
                        photoModeImageUrlModel2.setSubscriptionInfo(new SubscriptionInfo(Boolean.valueOf(interfaceC1664410tPj.contains(PhotoPreviewViewModel.wQ2(i, photoModeImageUrlModel2.thumbnail.getUri())))));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            C19210910Dr.LIZ(new C10AH((C10C1) afS117S0300000_28.l1));
        } else {
            C19210910Dr.LIZ(C10AT.LIZ);
        }
        C2252321DDq c2252321DDq = ((PhotoPreviewViewModel) afS117S0300000_28.l0).LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1675380thQ.LIZ((C1675380thQ) value, null, null, null, null, null, false, false, 31)));
        C1C7U.LIZIZ("PhotoPreviewViewModel@2705.updateAwemePhotoPreviewSettings$1");
    }

    public static final void accept$4(AfS117S0300000_28 afS117S0300000_28, Object obj) {
        Function1 function1;
        C1C7U.LIZ("GeoFencingRegionDataSource@d393.tryFetchIfAbsent$4");
        List<TranslatedRegion> listLJJJJLI = C13LP.LJJJJLI((Iterable) obj);
        C19216110Fr.LIZIZ = listLJJJJLI;
        if (listLJJJJLI.isEmpty()) {
            T t = ((C259800zU) afS117S0300000_28.l0).element;
            if (t != 0 && (function1 = (Function1) afS117S0300000_28.l2) != null) {
                function1.invoke(t);
            }
        } else {
            Function1 function12 = (Function1) afS117S0300000_28.l1;
            if (function12 != null) {
                function12.invoke(C473080Igs.LIZ(C19216110Fr.LIZIZ));
            }
        }
        C1C7U.LIZIZ("GeoFencingRegionDataSource@d393.tryFetchIfAbsent$4");
    }

    public static final void accept$5(AfS117S0300000_28 afS117S0300000_28, Object obj) {
        C1C7U.LIZ("CredentialManagerService@16d5.tryLoginWithCredentialManager$3");
        Throwable th = (Throwable) obj;
        C20431614x8 c20431614x8 = C20431614x8.LIZ;
        Activity activity = (Activity) afS117S0300000_28.l0;
        InterfaceC852200Xbu interfaceC852200Xbu = (InterfaceC852200Xbu) afS117S0300000_28.l1;
        c20431614x8.getClass();
        C20431614x8.LJFF(activity, th, false, false, null, interfaceC852200Xbu);
        ((Activity) afS117S0300000_28.l0).runOnUiThread(new ARunnableS95S0200000_26((InterfaceC1699660uKa) afS117S0300000_28.l2, th, 35));
        C1C7U.LIZIZ("CredentialManagerService@16d5.tryLoginWithCredentialManager$3");
    }

    public static final void accept$6(AfS117S0300000_28 afS117S0300000_28, Object obj) {
        C1C7U.LIZ("BatchManageClickTarget@fdff.requestAndToast$1");
        ((EnumC19280010bm) afS117S0300000_28.l0).uploadEvent("confirm_allow_success", new Pair<>("action", ((C19280110bn) afS117S0300000_28.l1).LJI));
        C1389890mGx c1389890mGx = new C1389890mGx((View) afS117S0300000_28.l2);
        c1389890mGx.LJIIIZ(((C19280110bn) afS117S0300000_28.l1).LIZJ);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("BatchManageClickTarget@fdff.requestAndToast$1");
    }

    public AfS117S0300000_28(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
