package Y;

import X.C0OLV;
import X.C0OM2;
import X.C0OPQ;
import X.C1389890mGx;
import X.C2188811AlT;
import X.C617100OIi;
import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBarEntrance;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class ACListenerS47S0400000_9 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS47S0400000_9 aCListenerS47S0400000_9, View view) {
        String str;
        SmartRouter.buildRoute(((C0OM2) aCListenerS47S0400000_9.l0).getContext(), ((BulletinBarEntrance) aCListenerS47S0400000_9.l1).schemaUrl).open();
        C0OPQ c0opq = C0OPQ.LIZ;
        C0OLV c0olv = (C0OLV) aCListenerS47S0400000_9.l2;
        if (c0olv == null || (str = c0olv.LLILLJJLI) == null) {
            str = "";
        }
        boolean zTo = ((BulletinProfileViewModel) aCListenerS47S0400000_9.l3).To();
        boolean zNl = ((BulletinProfileViewModel) aCListenerS47S0400000_9.l3).Nl();
        String strValueOf = String.valueOf(((BulletinProfileViewModel) aCListenerS47S0400000_9.l3).LLILLJJLI);
        boolean zQ11 = ((BulletinProfileViewModel) aCListenerS47S0400000_9.l3).q11();
        Map<String, String> trackingMap = ((BulletinBarEntrance) aCListenerS47S0400000_9.l1).getTrackingMap();
        c0opq.getClass();
        C0OPQ.LJJIFFI(str, zTo, zNl, strValueOf, zQ11, "click", trackingMap);
    }

    public static final void onClick$1(ACListenerS47S0400000_9 aCListenerS47S0400000_9, View view) {
        long jLongValue;
        String str;
        String str2;
        if (((BulletinProfileViewModel) aCListenerS47S0400000_9.l0).To()) {
            C1389890mGx c1389890mGx = new C1389890mGx((C0OM2) aCListenerS47S0400000_9.l1);
            c1389890mGx.LJIIIZ(2131851466);
            c1389890mGx.LJIIJJI();
        } else {
            C0OM2 c0om2 = (C0OM2) aCListenerS47S0400000_9.l1;
            Long lLJFF = C617100OIi.LJFF(((BulletinBarEntrance) aCListenerS47S0400000_9.l2).objectId);
            if (lLJFF != null) {
                jLongValue = lLJFF.longValue();
            } else {
                jLongValue = 0;
            }
            C0OLV c0olv = (C0OLV) aCListenerS47S0400000_9.l3;
            BulletinProfileViewModel bulletinProfileViewModel = (BulletinProfileViewModel) aCListenerS47S0400000_9.l0;
            c0om2.getClass();
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.roomId = jLongValue;
            String str3 = null;
            if (c0olv != null) {
                str = c0olv.LLILLJJLI;
            } else {
                str = null;
            }
            String str4 = "others_homepage";
            if (!Intrinsics.LJFF(str, "others_homepage")) {
                str4 = "message";
            }
            roomsData.enterFromMerge = str4;
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (c0olv != null) {
                str3 = c0olv.LLILLJJLI;
            }
            sbLIZ.append(str3);
            sbLIZ.append("_bb_bar");
            roomsData2.enterMethod = C2188811AlT.LIZIZ(sbLIZ);
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            roomsData3.userId = bulletinProfileViewModel.LLILZIL;
            roomsData3.actionType = "click";
            roomsData3.followStatus = String.valueOf(bulletinProfileViewModel.LLIZ);
            enterRoomConfig.mLogData.requestId = bulletinProfileViewModel.LLILZLL;
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().watchLive(c0om2.getContext(), enterRoomConfig);
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        C0OLV c0olv2 = (C0OLV) aCListenerS47S0400000_9.l3;
        if (c0olv2 == null || (str2 = c0olv2.LLILLJJLI) == null) {
            str2 = "";
        }
        boolean zTo = ((BulletinProfileViewModel) aCListenerS47S0400000_9.l0).To();
        boolean zNl = ((BulletinProfileViewModel) aCListenerS47S0400000_9.l0).Nl();
        String strValueOf = String.valueOf(((BulletinProfileViewModel) aCListenerS47S0400000_9.l0).LLILLJJLI);
        boolean zQ11 = ((BulletinProfileViewModel) aCListenerS47S0400000_9.l0).q11();
        Map<String, String> trackingMap = ((BulletinBarEntrance) aCListenerS47S0400000_9.l2).getTrackingMap();
        c0opq.getClass();
        C0OPQ.LJJIFFI(str2, zTo, zNl, strValueOf, zQ11, "click", trackingMap);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS47S0400000_9(X.C0OLV r2, X.C0OM2 r3, com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r4, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBarEntrance r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r5
            r0.l3 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r5
            r0.l2 = r2
            r0.l3 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS47S0400000_9.<init>(X.0OLV, X.0OM2, com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBarEntrance, int):void");
    }
}
