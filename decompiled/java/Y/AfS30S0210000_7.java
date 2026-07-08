package Y;

import X.AbstractC511160K2w;
import X.C09JN;
import X.C0K2U;
import X.C0K30;
import X.C0K31;
import X.C0K51;
import X.C1C7U;
import X.C510940K2a;
import X.C511170K2x;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.spacemember.vm.SubSpaceMemberVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.pgc_sub.PGCSpaceMemberInfo;
import webcast.api.pgc_sub.PGCSpaceMembersResponse;

/* JADX INFO: loaded from: classes8.dex */
public class AfS30S0210000_7 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS30S0210000_7 r11, java.lang.Object r12) {
        /*
            java.lang.String r10 = "LivePreviewPlayerVM@d8f0.checkSubscribeInfo$1$1"
            X.C1C7U.LIZ(r10)
            com.bytedance.android.live.network.response.BaseResponse r12 = (com.bytedance.android.live.network.response.BaseResponse) r12
            if (r12 == 0) goto L50
            T r9 = r12.data
            com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse r9 = (com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse) r9
            if (r9 == 0) goto L50
            java.lang.Object r8 = r11.l0
            com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM r8 = (com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM) r8
            boolean r7 = r11.z2
            java.lang.Object r6 = r11.l1
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            com.bytedance.android.livesdk.comp.api.subscription.api.Subscribing r0 = r9.subscribing
            com.bytedance.android.livesdk.chatroom.api.SubInfo r0 = r0.subInfo
            java.lang.Boolean r1 = r0.isSubscribing
            com.bytedance.android.livesdk.subscribe.model.SubOnlyLiveInfo r0 = r9.subOnlyLiveInfo
            boolean r5 = r0.hasPermission
            boolean r0 = r0.isSolEligible
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L56
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L56
            r2 = 1
        L30:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r8.getDataChannel()
            if (r1 == 0) goto L3b
            java.lang.Class<X.1E7v> r0 = X.C2276291E7v.class
            r1.SX0(r0, r9)
        L3b:
            if (r2 != 0) goto L54
            if (r5 != 0) goto L54
            if (r7 != 0) goto L4b
        L41:
            androidx.lifecycle.MutableLiveData<X.0K9R> r1 = r8.LLILZLL
            X.0K9R r0 = new X.0K9R
            r0.<init>(r4, r3)
            r1.setValue(r0)
        L4b:
            if (r6 == 0) goto L50
            r6.invoke()
        L50:
            X.C1C7U.LIZIZ(r10)
            return
        L54:
            r4 = 1
            goto L41
        L56:
            r2 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS30S0210000_7.accept$0(Y.AfS30S0210000_7, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS30S0210000_7 afS30S0210000_7, Object obj) {
        C511170K2x c511170K2x;
        C511170K2x c511170K2x2;
        C1C7U.LIZ("SubSpaceMemberVM@4a83.fetchMembers$1");
        ((Function0) afS30S0210000_7.l0).invoke();
        PGCSpaceMembersResponse.ResponseData responseData = (PGCSpaceMembersResponse.ResponseData) ((DataResponse) obj).data;
        if (responseData != null) {
            SubSpaceMemberVM subSpaceMemberVM = (SubSpaceMemberVM) afS30S0210000_7.l1;
            boolean z = afS30S0210000_7.z2;
            Function0 function0 = (Function0) afS30S0210000_7.l0;
            C0K30 c0k30WQ2 = subSpaceMemberVM.wQ2();
            if (c0k30WQ2 != null && (c511170K2x2 = c0k30WQ2.LL) != null) {
                c511170K2x2.LIZIZ = Boolean.valueOf(responseData.hasMore);
            }
            C0K30 c0k30WQ22 = subSpaceMemberVM.wQ2();
            if (c0k30WQ22 != null && (c511170K2x = c0k30WQ22.LL) != null) {
                c511170K2x.LIZ = Long.valueOf(responseData.offset);
            }
            C510940K2a c510940K2a = subSpaceMemberVM.LLILZ;
            if (c510940K2a != null) {
                ArrayList<AbstractC511160K2w> arrayList = c510940K2a.LL;
                if (z) {
                    arrayList.clear();
                } else {
                    ((C0K31) subSpaceMemberVM.LLILLL.getValue()).LIZIZ();
                }
                int size = arrayList.size();
                Iterator<PGCSpaceMemberInfo> it2 = responseData.membersList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C0K2U(it2.next()));
                }
                if (C0K51.LJI(Boolean.valueOf(responseData.hasMore))) {
                    arrayList.add(((C0K31) subSpaceMemberVM.LLILLL.getValue()).LIZ);
                }
                int size2 = arrayList.size() - size;
                if (size2 > 0) {
                    c510940K2a.notifyItemRangeInserted(size, size2);
                }
            }
            function0.invoke();
        }
        C1C7U.LIZIZ("SubSpaceMemberVM@4a83.fetchMembers$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS30S0210000_7(Object obj, LivePreviewPlayerVM livePreviewPlayerVM, boolean z, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.z2 = livePreviewPlayerVM;
        this.l1 = z;
    }
}
