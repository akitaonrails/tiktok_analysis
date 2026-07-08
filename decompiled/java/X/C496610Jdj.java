package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.EcomLiveUserStats;
import com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Jdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496610Jdj extends AbstractC495800JcQ<GetUserInteractionSummaryResponse.ResponseData> {
    public C16F5 LLILZIL;
    public final EnumC495780JcO LLILZLL;
    public final boolean LLIZ;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLIZLLLIL;
    public final boolean LLJ;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.f910g86;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view = this.LLILLL;
        this.LLILZIL = view != null ? (C16F5) view.findViewById(R.id.wp7) : null;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        C500260Jjc.LJIILIIL(this.LLILLL);
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLIZ;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJII() {
        return this.LLJ;
    }

    public C496610Jdj(C495920Jcc c495920Jcc) {
        boolean z;
        super(c495920Jcc);
        this.LLILZLL = EnumC495780JcO.INTERACT;
        C495950Jcf c495950Jcf = c495920Jcc.LIZJ;
        if (c495950Jcf.LJI && !c495950Jcf.LJIIIIZZ && !c495920Jcc.LJIIIIZZ.coHostEnable) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = z;
        this.LLIZLLLIL = new Pair<>(Boolean.TRUE, C13BV.INSTANCE);
        this.LLJ = true;
    }

    public static String LJIIZILJ(GetUserInteractionSummaryResponse.ResponseData responseData) {
        long j;
        boolean z;
        boolean z2;
        EcomLiveUserStats ecomLiveUserStats = responseData.ecomLiveUserStats;
        if (ecomLiveUserStats != null) {
            j = ecomLiveUserStats.purchasedProductsCount;
        } else {
            j = 0;
        }
        boolean z3 = true;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (ecomLiveUserStats != null && ecomLiveUserStats.viewedProductsCount > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ecomLiveUserStats == null || ecomLiveUserStats.productsAddedToCartCount <= 0) {
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("purchased");
        }
        if (z2) {
            arrayList.add("prod_view");
        }
        if (z3) {
            arrayList.add("add_to_cart");
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJIIIZ(User user, Object obj) {
        GetUserInteractionSummaryResponse.ResponseData responseData = (GetUserInteractionSummaryResponse.ResponseData) obj;
        if (responseData == null || responseData.summary.length() == 0 || LJIIIIZZ(user)) {
            return false;
        }
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            c16f5.setText(responseData.summary);
            c16f5.requestLayout();
        }
        View view = this.LLILLL;
        if (view != null) {
            C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
            ACListenerS111S0200000_7 aCListenerS111S0200000_7 = new ACListenerS111S0200000_7(this, responseData, 40);
            C495980Jci c495980Jci = this.LL;
            EnumC495860JcW enumC495860JcW = EnumC495860JcW.EXPAND;
            c495870JcX.getClass();
            C495870JcX.LIZIZ(view, aCListenerS111S0200000_7, false, c495980Jci, enumC495860JcW, "interaction_entrance", null);
        }
        C500260Jjc.LLFFF(this.LLILLL);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_interaction_entrance_show");
        c474500IjALIZ.LJIJJLI(((C495920Jcc) this.LL).LJIIJJI);
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII(this.LL.LJIIIIZZ.clickModule, "click_module");
        c474500IjALIZ.LJJII(this.LL.LIZJ.LIZ(), "card_click_view");
        c474500IjALIZ.LJJII(Long.valueOf(this.LL.LJFF.getId()), "actual_room_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LL.LJFF.getOwnerUserId()), "actual_anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LL.LJII), "to_user_id");
        c474500IjALIZ.LJJII(LJIIZILJ(responseData), "user_ec_badge");
        c474500IjALIZ.LJJII(C496630Jdl.LIZIZ(responseData), "interact_type");
        c474500IjALIZ.LJJII(C496630Jdl.LIZ(responseData), "interact_amount");
        c474500IjALIZ.LIZ();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse.ResponseData r9, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse.ResponseData> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C496600Jdi
            if (r0 == 0) goto L20
            r6 = r10
            X.0Jdi r6 = (X.C496600Jdi) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L61
        L20:
            X.0Jdi r6 = new X.0Jdi
            r6.<init>(r8, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L69
            java.lang.Class<com.bytedance.android.live.profile.api.InteractionApi> r0 = com.bytedance.android.live.profile.api.InteractionApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L69
            com.bytedance.android.live.profile.api.InteractionApi r4 = (com.bytedance.android.live.profile.api.InteractionApi) r4     // Catch: java.lang.Throwable -> L69
            X.0Jci r0 = r8.LL     // Catch: java.lang.Throwable -> L69
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJFF     // Catch: java.lang.Throwable -> L69
            long r2 = r0.getId()     // Catch: java.lang.Throwable -> L69
            X.0Jci r0 = r8.LL     // Catch: java.lang.Throwable -> L69
            long r0 = r0.LJII     // Catch: java.lang.Throwable -> L69
            X.11NZ r1 = r4.getUserInteractionSummary(r2, r0)     // Catch: java.lang.Throwable -> L69
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Throwable -> L69
            X.11Hw r0 = r1.LJL(r0)     // Catch: java.lang.Throwable -> L69
            r6.LLILLL = r5     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = X.C500260Jjc.LJJJJL(r0, r6)     // Catch: java.lang.Throwable -> L69
            if (r1 != r7) goto L64
            return r7
        L61:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L69
        L64:
            com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse r1 = (com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse) r1     // Catch: java.lang.Throwable -> L69
            com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse$ResponseData r0 = r1.data     // Catch: java.lang.Throwable -> L69
            return r0
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496610Jdj.LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse$ResponseData, X.05Vn):java.lang.Object");
    }
}
