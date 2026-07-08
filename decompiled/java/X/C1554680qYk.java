package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.shop.ShopEntranceMigrationWidgetInjector;
import com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2Injector;
import com.ss.android.ugc.aweme.inbox.v2.container.TopBannerWidgetContainerInjector;
import com.ss.android.ugc.aweme.inbox.v2.container.UserCardWidgetContainerInjector;
import com.ss.android.ugc.aweme.inbox.widget.multi.ArchiveEntranceWidgetInjector;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntranceWidgetContainerInjector;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarWidgetInjector;
import com.ss.android.ugc.aweme.inbox.widget.multi.NoticeWidgetInjector;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;
import com.ss.android.ugc.aweme.notification.banner.InboxBannerWidgetInjector;
import com.ss.android.ugc.aweme.notification.banner.InboxLegacyTopBannerWidgetInjector;
import com.ss.android.ugc.aweme.notification.view.guidepush.BulletBoardGuideWidgetInjector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554680qYk {
    public static final C1554680qYk LIZ = new C1554680qYk();
    public static String LIZIZ = C0XQ7.LJFF().getCurUserId();
    public static volatile List<? extends InboxFragmentWidgetInjectProtocol> LIZJ = C13BV.INSTANCE;

    public final synchronized List<InboxFragmentWidgetInjectProtocol> LIZ() {
        boolean z;
        if (Intrinsics.LJFF(LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            z = false;
        } else {
            LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            z = true;
        }
        if (z) {
            LIZJ = C13BV.INSTANCE;
        }
        if (LIZJ.isEmpty()) {
            LIZJ = LIZIZ();
        }
        return LIZJ;
    }

    public static List LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InboxEntranceWidgetContainerInjector());
        arrayList.add(new UserCardWidgetContainerInjector());
        C296840BkI.LIZ.getClass();
        if (C296840BkI.LIZ()) {
            arrayList.add(new InboxLegacyTopBannerWidgetInjector());
            arrayList.add(new InboxBannerWidgetInjector());
            IMChatListApi.LJJIII.getClass();
            List<Object> listLJJIIZI = C890330YwJ.LIZ().LJJIIZI();
            if ((listLJJIIZI instanceof List) && listLJJIIZI != null) {
                arrayList.addAll(listLJJIIZI);
            }
        } else {
            arrayList.add(new TopBannerWidgetContainerInjector());
            arrayList.add(new BulletBoardGuideWidgetInjector());
            IMChatListApi.LJJIII.getClass();
            List<Object> listLJIILLIIL = C890330YwJ.LIZ().LJIILLIIL();
            if ((listLJIILLIIL instanceof List) && listLJIILLIIL != null) {
                arrayList.addAll(listLJIILLIIL);
            }
            arrayList.add(new ShopEntranceMigrationWidgetInjector());
        }
        if (!C0IVP.LIZ()) {
            arrayList.add(new InboxSkylightWidgetV2Injector());
        }
        arrayList.add(new NoticeWidgetInjector());
        arrayList.add(new InboxFilterBarWidgetInjector());
        if (C19212010Ec.LIZJ.LJIIZILJ()) {
            arrayList.add(new ArchiveEntranceWidgetInjector());
        }
        arrayList.addAll(C1608090rwt.LIZIZ.LIZIZ());
        return arrayList;
    }
}
