package X;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: renamed from: X.10Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19231910Lt extends AbstractViewOnClickListenerC20665415tk implements WeakHandler.IHandler {
    public final RelationButton LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxSpinner LLILZLL;
    public User LLIZ;

    public C19231910Lt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.AbstractViewOnClickListenerC20665415tk
    public final void LIZLLL(InnerPushMessage innerPushMessage) {
        List<User> list;
        super.LIZLLL(innerPushMessage);
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (list = uiTemplate.fromUsers) != null && (!list.isEmpty())) {
            User user = (User) ListProtector.get(list, 0);
            this.LLIZ = user;
            LJI(innerPushMessage, user);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Object messageObj;
        BaseResponse baseResponse;
        User user = this.LLIZ;
        if (user != null) {
            if (message != null) {
                messageObj = HandlerHook.getMessageObj(message.obj);
            } else {
                messageObj = null;
            }
            if ((messageObj instanceof BaseResponse) && (baseResponse = (BaseResponse) messageObj) != null && ((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJLLI(baseResponse)) {
                user.setFollowerStatus(1);
                if (user.getFollowStatus() == 1) {
                    user.setFollowStatus(2);
                }
                LJI(null, user);
            }
        }
    }

    public final void setViewMaxWidth(int i) {
        this.LLILZ.setMaxWidth(i);
        this.LLILZIL.setMaxWidth(i);
    }

    @Override // X.AbstractViewOnClickListenerC20665415tk
    public final boolean LJ(int i, View view) {
        Integer numValueOf;
        String uid;
        if (view != null) {
            numValueOf = Integer.valueOf(view.getId());
        } else {
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() != R.id.idu) {
            return false;
        }
        C786410Ut5.LLZILL(this.LLILZLL, 0);
        C786410Ut5.t0(this.LLILZ, 8);
        C786410Ut5.LLLLZLL(this.LLILZIL, 8);
        User user = this.LLIZ;
        if (user != null && (uid = user.getUid()) != null) {
            ((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJJLIIIJ(uid, new WeakHandler(this));
        }
        InnerPushMessage curMsg = getCurMsg();
        if (curMsg != null) {
            C19331210k2.LIZ.getClass();
            C19331210k2.LJIILJJIL(i, curMsg, "follow_approve");
            return true;
        }
        return true;
    }

    public final void LJI(InnerPushMessage innerPushMessage, User user) {
        LifecycleOwner lifecycleOwnerLJFF;
        InnerPushMessage curMsg;
        if (user != null) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAccuratePrivateAccount() && (curMsg = getCurMsg()) != null && curMsg.getType() == 9 && user.getFollowerStatus() != 1) {
                C786410Ut5.LLLLZLL(this.LLILZIL, 0);
                C786410Ut5.t0(this.LLILZ, 8);
                C786410Ut5.LLZILL(this.LLILZLL, 8);
                C786410Ut5.h9(this.LLILZIL, this);
            } else {
                C786410Ut5.t0(this.LLILZ, 0);
                C786410Ut5.LLLLZLL(this.LLILZIL, 8);
                C786410Ut5.LLZILL(this.LLILZLL, 8);
                this.LLILZ.setPadding(0, 0, 0, 0);
                this.LLILZ.setTracker(new AwS572S0100000_28(innerPushMessage, 817));
                RelationButton relationButton = this.LLILZ;
                C1387050mCN c1387050mCN = new C1387050mCN(user);
                c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_ICE_BREAKING;
                c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_INNER_PUSH;
                AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(this);
                if (abstractC1387200mCcLIZ == null || (lifecycleOwnerLJFF = abstractC1387200mCcLIZ.LJFF()) == null) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null) {
                        lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF();
                    } else {
                        lifecycleOwnerLJFF = null;
                    }
                }
                c1387050mCN.LJIIJJI = lifecycleOwnerLJFF;
                relationButton.LLLLZIL(c1387050mCN.LIZ());
                this.LLILZ.setFollowClickListener(new AwS642S0100000_28(this, 81));
            }
            RelationButton relationButton2 = this.LLILZ;
            if (relationButton2 != null) {
                relationButton2.setFollowClickInterceptor(new C19232010Lu(this, user, innerPushMessage, user, null));
            }
        }
    }

    public C19231910Lt(Context context, AttributeSet attributeSet, int i) {
        View viewInflate;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (C20674015v8.LIZIZ() && C20673215v0.LIZ(R.layout.ct_, context) && activityLIZ != null) {
            viewInflate = C20673215v0.LIZLLL(R.layout.ct_, activityLIZ, this, true);
        } else if (C20674015v8.LIZJ() && activityLIZ != null) {
            viewInflate = C21146717pB.LIZIZ(activityLIZ, R.layout.ct_, this, true);
        } else {
            viewInflate = FrameLayout.inflate(context, R.layout.ct_, this);
        }
        this.LLILZ = (RelationButton) viewInflate.findViewById(R.id.iea);
        this.LLILZIL = (TuxTextView) viewInflate.findViewById(R.id.idu);
        this.LLILZLL = (TuxSpinner) viewInflate.findViewById(R.id.if0);
    }
}
