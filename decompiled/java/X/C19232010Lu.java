package X;

import android.content.Context;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.10Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.innerpush.ui.InnerPushFollowContainer$initButton$1$3", f = "InnerPushFollowContainer.kt", l = {}, m = "invokeSuspend")
public final class C19232010Lu extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C19231910Lt LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ InnerPushMessage LLILLL;
    public final /* synthetic */ User LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19232010Lu(C19231910Lt c19231910Lt, User user, InnerPushMessage innerPushMessage, User user2, InterfaceC1364105Vn<? super C19232010Lu> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c19231910Lt;
        this.LLILLJJLI = user;
        this.LLILLL = innerPushMessage;
        this.LLILZ = user2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19232010Lu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InnerPushMessage msg;
        InnerPushMessage innerPushMessage;
        C1C7U.LIZ("InnerPushFollowContainer@c3a6.initButton$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zLIZJ = C1336205Ku.LIZJ().LIZJ();
        InnerPushMessage curMsg = this.LL.getCurMsg();
        if (curMsg != null) {
            C19331210k2.LIZ.getClass();
            C19331210k2.LJIILJJIL(3, curMsg, "enter_chat");
        }
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        Context context = this.LL.getContext();
        User user = this.LLILLJJLI;
        C19331210k2.LIZ.getClass();
        boolean z = true;
        int iLJIJJ = c19212010Ec.LJIJJ(context, user, C19331210k2.LIZLLL(), C19331210k2.LJI(this.LLILLL), !zLIZJ);
        if (iLJIJJ != 1) {
            if (iLJIJJ != 2) {
                if (iLJIJJ == -1) {
                    z = false;
                }
            } else {
                InterfaceC20663615tS popupWindowRef = this.LL.getPopupWindowRef();
                if (popupWindowRef != null) {
                    popupWindowRef.dismiss();
                }
            }
        } else {
            InnerPushMessage innerPushMessage2 = this.LLILLL;
            InterfaceC20663615tS popupWindowRef2 = this.LL.getPopupWindowRef();
            if (popupWindowRef2 != null) {
                msg = popupWindowRef2.getMsg();
            } else {
                msg = null;
            }
            if (Intrinsics.LJFF(innerPushMessage2, msg) && (innerPushMessage = this.LLILLL) != null) {
                InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                if (uiTemplate != null) {
                    C844470XAv.LIZ.getClass();
                    uiTemplate.setContent(C844470XAv.LIZ().getString(2131831923));
                }
                InterfaceC20663615tS popupWindowRef3 = this.LL.getPopupWindowRef();
                if (popupWindowRef3 != null) {
                    popupWindowRef3.LIZJ(this.LLILLL, new int[]{2}, true, false);
                }
                RelationButton relationButton = this.LL.LLILZ;
                C1387050mCN c1387050mCN = new C1387050mCN(this.LLILZ);
                c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
                c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_INNER_PUSH;
                relationButton.LLLLZIL(c1387050mCN.LIZ());
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("InnerPushFollowContainer@c3a6.initButton$1$3");
        return boolValueOf;
    }
}
