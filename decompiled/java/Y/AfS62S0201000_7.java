package Y;

import X.C09JN;
import X.C0JT6;
import X.C0K3G;
import X.C0K3J;
import X.C0K3S;
import X.C1834350xpp;
import X.C1C7U;
import X.C464330IIt;
import X.C469620IbI;
import X.C511230K3d;
import X.InterfaceC469640IbK;
import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AfS62S0201000_7 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void accept$0(AfS62S0201000_7 afS62S0201000_7, Object obj) {
        boolean z;
        C1C7U.LIZ("SubSpaceDetailVM@57b0.postActionComment$1");
        SpaceCommentItem spaceCommentItem = ((C0K3J) afS62S0201000_7.l0).LIZ;
        if (afS62S0201000_7.i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        spaceCommentItem.userLiked = z;
        if (((SubSpaceDetailVM) afS62S0201000_7.l1).BQ2()) {
            SpaceCommentItem spaceCommentItem2 = ((C0K3J) afS62S0201000_7.l0).LIZ;
            spaceCommentItem2.anchorLiked = spaceCommentItem2.userLiked;
        }
        C0K3G c0k3g = ((SubSpaceDetailVM) afS62S0201000_7.l1).LLILLL;
        if (c0k3g != null) {
            c0k3g.LJFF((C0K3J) afS62S0201000_7.l0);
        }
        C1C7U.LIZIZ("SubSpaceDetailVM@57b0.postActionComment$1");
    }

    public static final void accept$1(AfS62S0201000_7 afS62S0201000_7, Object obj) {
        Context context;
        boolean z;
        C1C7U.LIZ("SubSpaceDetailVM@57b0.postActionComment$2");
        Throwable th = (Throwable) obj;
        C0K3S c0k3sXQ2 = ((SubSpaceDetailVM) afS62S0201000_7.l0).xQ2();
        if (c0k3sXQ2 != null) {
            context = c0k3sXQ2.LL;
        } else {
            context = null;
        }
        C511230K3d.LIZ(context, th, 2131839337);
        SubSpaceDetailVM subSpaceDetailVM = (SubSpaceDetailVM) afS62S0201000_7.l0;
        C0K3J c0k3j = (C0K3J) afS62S0201000_7.l1;
        int i = afS62S0201000_7.i2;
        subSpaceDetailVM.getClass();
        SpaceCommentItem spaceCommentItem = c0k3j.LIZ;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        spaceCommentItem.userLiked = z;
        if (z) {
            spaceCommentItem.likeCount++;
        } else {
            spaceCommentItem.likeCount--;
        }
        if (subSpaceDetailVM.BQ2()) {
            SpaceCommentItem spaceCommentItem2 = c0k3j.LIZ;
            spaceCommentItem2.anchorLiked = spaceCommentItem2.userLiked;
        }
        C0K3G c0k3g = ((SubSpaceDetailVM) afS62S0201000_7.l0).LLILLL;
        if (c0k3g != null) {
            c0k3g.LJFF((C0K3J) afS62S0201000_7.l1);
        }
        C1C7U.LIZIZ("SubSpaceDetailVM@57b0.postActionComment$2");
    }

    public static final void accept$2(AfS62S0201000_7 afS62S0201000_7, Object obj) {
        T t;
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = (MultiPlusFeedRoomListProvider) afS62S0201000_7.l0;
        int i = afS62S0201000_7.i2;
        long[] jArr = (long[]) afS62S0201000_7.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        multiPlusFeedRoomListProvider.getClass();
        C1C7U.LIZ("MultiPlusFeedRoomListProvider@8180.requestRoomData$1L");
        if (baseResponse != null && (t = baseResponse.data) != 0) {
            Map map = (Map) t;
            EnterRoomConfig.LogData logData = multiPlusFeedRoomListProvider.LLJI.mLogData;
            String str = logData.requestId;
            String str2 = logData.logPb;
            for (int i2 = i; i2 < jArr.length + i; i2++) {
                long j = multiPlusFeedRoomListProvider.LLJJJJLIIL[i2];
                if (map.containsKey(Long.toString(j))) {
                    multiPlusFeedRoomListProvider.LLJJJJJIL.add(Long.valueOf(j));
                    Room room = (Room) map.get(Long.toString(j));
                    room.setLog_pb(str2);
                    room.setRequestId(str);
                    ListProtector.set(multiPlusFeedRoomListProvider.LLIZLLLIL, i2, room);
                    ListProtector.set(multiPlusFeedRoomListProvider.LLJ, i2, C464330IIt.LIZJ(true, room));
                } else {
                    ListProtector.set(multiPlusFeedRoomListProvider.LLIZLLLIL, i2, null);
                }
            }
            multiPlusFeedRoomListProvider.LLJILJIL = false;
        }
        C1C7U.LIZIZ("MultiPlusFeedRoomListProvider@8180.requestRoomData$1L");
    }

    public static final void accept$3(AfS62S0201000_7 afS62S0201000_7, Object obj) {
        C1C7U.LIZ("RecordCommentsAndGiftsSwitch@b065.updateRecord$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.data != 0) {
            int i = afS62S0201000_7.i2;
            Function0 function0 = (Function0) afS62S0201000_7.l1;
            C1834350xpp.LIZ.getClass();
            C0JT6<Integer> c0jt6 = C1834350xpp.LJII;
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
            }
            c0jt6.LIZJ(Integer.valueOf(i2));
            function0.invoke();
        } else {
            ((Function0) afS62S0201000_7.l0).invoke();
        }
        C1C7U.LIZIZ("RecordCommentsAndGiftsSwitch@b065.updateRecord$1");
    }

    public static final void accept$4(AfS62S0201000_7 afS62S0201000_7, Object obj) {
        C1C7U.LIZ("StrategySDKManager@738d.queryScenes$1$2");
        C469620IbI c469620IbI = C469620IbI.LIZ;
        C469620IbI.LJI((Throwable) obj, afS62S0201000_7.i2, (List) afS62S0201000_7.l0, (InterfaceC469640IbK) afS62S0201000_7.l1);
        C1C7U.LIZIZ("StrategySDKManager@738d.queryScenes$1$2");
    }

    public static final void accept$5(AfS62S0201000_7 afS62S0201000_7, Object obj) {
        C1C7U.LIZ("StrategySDKManager@738d.queryScenes$3");
        C469620IbI c469620IbI = C469620IbI.LIZ;
        C469620IbI.LJI((Throwable) obj, afS62S0201000_7.i2, (List) afS62S0201000_7.l0, (InterfaceC469640IbK) afS62S0201000_7.l1);
        C1C7U.LIZIZ("StrategySDKManager@738d.queryScenes$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS62S0201000_7(int r2, com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM r3, X.C0K3J r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.i2 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.i2 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS62S0201000_7.<init>(int, com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM, X.0K3J, int):void");
    }

    public AfS62S0201000_7(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
