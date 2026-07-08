package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.dataChannel.GlobalLikeContinueTarget;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.increase.IncreaseSDKTriggerEvent;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.level.GuidanceConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0g4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151670g4j implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            case 2:
                return handleMessage$2(this, message);
            case 3:
                return handleMessage$3(this, message);
            case 4:
                return handleMessage$4(this, message);
            case 5:
                return handleMessage$5(this, message);
            case 6:
                return handleMessage$6(this, message);
            case 7:
                return handleMessage$7(this, message);
            case 8:
                return handleMessage$8(this, message);
            case BdTuring.TYPE_ECAF /* 9 */:
                return handleMessage$9(this, message);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return handleMessage$10(this, message);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return handleMessage$11(this, message);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return handleMessage$12(this, message);
            default:
                return false;
        }
    }

    public C1151670g4j(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(C1151670g4j c1151670g4j, Message message) {
        if (message.what != 0) {
            return false;
        }
        I18nUpdateManager i18nUpdateManager = (I18nUpdateManager) c1151670g4j.l0;
        i18nUpdateManager.LIZJ(i18nUpdateManager.LJII, i18nUpdateManager.LJIIIIZZ);
        return true;
    }

    public static final boolean handleMessage$1(C1151670g4j c1151670g4j, Message message) {
        int i = message.what;
        if (i == 1) {
            ((StarCommentViewModel) c1151670g4j.l0).vQ2();
        } else if (i == 2) {
            ((StarCommentViewModel) c1151670g4j.l0).LLILLJJLI.getValue();
            ((StarCommentViewModel) c1151670g4j.l0).reset();
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$10(C1151670g4j c1151670g4j, Message message) {
        int i = message.what;
        ((C1079220eBs) c1151670g4j.l0).getClass();
        if (i == 0 && (HandlerHook.getMessageObj(message.obj) instanceof ConstraintProperty)) {
            ConstraintProperty constraintProperty = (ConstraintProperty) HandlerHook.getMessageObj(message.obj);
            constraintProperty.connect(7, R.id.h4p, 6, (int) C497740JfY.LIZIZ(30.0f));
            constraintProperty.apply();
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$11(C1151670g4j c1151670g4j, Message message) {
        EnumC1102740eno enumC1102740eno;
        if (message.what == 0) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if ((messageObj instanceof EnumC1102740eno) && (enumC1102740eno = (EnumC1102740eno) messageObj) != null) {
                C1102720enm c1102720enm = (C1102720enm) c1151670g4j.l0;
                InterfaceC1102810env interfaceC1102810env = c1102720enm.LJ.get(enumC1102740eno);
                if (interfaceC1102810env != null) {
                    c1102720enm.LIZ(enumC1102740eno, interfaceC1102810env);
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$12(C1151670g4j c1151670g4j, Message message) {
        C1116230f9Z c1116230f9Z;
        int i;
        MutableLiveData<C1116210f9X> mutableLiveData;
        Room roomLJI;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch;
        int i2;
        if (message.what == 1 && (i = (c1116230f9Z = (C1116230f9Z) c1151670g4j.l0).LLJJIII) != 0) {
            if (i == 1 || i == 2 || ((roomLJI = c1116230f9Z.LJI()) != null && (roomAuthStatus = roomLJI.getRoomAuthStatus()) != null && (starCommentPermissionSwitch = roomAuthStatus.starCommentPermissionSwitch) != null && starCommentPermissionSwitch.status == 2 && ((i2 = c1116230f9Z.LLJJIII) == 1 || i2 == 2))) {
                C1116230f9Z c1116230f9Z2 = (C1116230f9Z) c1151670g4j.l0;
                if (c1116230f9Z2.LLJJ > 0) {
                    StarCommentViewModel starCommentViewModel = c1116230f9Z2.LLILLL;
                    if (starCommentViewModel != null && (mutableLiveData = starCommentViewModel.LLILLJJLI) != null && mutableLiveData.getValue() != null) {
                        ((C1116230f9Z) c1151670g4j.l0).LLJJ = 5;
                    } else {
                        C1116230f9Z c1116230f9Z3 = (C1116230f9Z) c1151670g4j.l0;
                        c1116230f9Z3.LLJJ--;
                    }
                    ((C1116230f9Z) c1151670g4j.l0).LJIIJ();
                }
            } else {
                ((C1116230f9Z) c1151670g4j.l0).LJIIJ();
                return true;
            }
        }
        return true;
    }

    public static final boolean handleMessage$2(C1151670g4j c1151670g4j, Message message) {
        if (message.what == 1) {
            ((StarCommentPaymentDialog) c1151670g4j.l0).SR(false);
        }
        return true;
    }

    public static final boolean handleMessage$3(C1151670g4j c1151670g4j, Message message) {
        int i = message.what;
        if (i == 1) {
            LikeHelper likeHelper = (LikeHelper) c1151670g4j.l0;
            likeHelper.LLJILLL = false;
            int i2 = likeHelper.LLIZ;
            int i3 = likeHelper.LLIZLLLIL;
            for (View view : (ArrayList) likeHelper.LLLIZZ) {
                if (view != null) {
                    int visibility = view.getVisibility();
                    view.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, view);
                }
            }
            DataChannel dataChannel = likeHelper.LLJLILLLLZIIL;
            if (dataChannel != null) {
                dataChannel.LC0(IncreaseSDKTriggerEvent.class, new C484660IzY(-1, "gbl_click_like"));
            }
            ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).bg(C0J0Q.ROOM, "like_end_count", Integer.valueOf(i2), EnumC467180ITs.EPI.getGroupName(), false);
            DataChannel dataChannel2 = likeHelper.LLJLILLLLZIIL;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C781120UkY.class, Boolean.FALSE);
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Boolean bool = (Boolean) dataChannelGlobal.gg0(GlobalLikeContinueTarget.class);
            if (bool == null || bool.booleanValue()) {
                dataChannelGlobal.HQ2(GlobalLikeContinueTarget.class, Boolean.FALSE);
            }
            Iterator it2 = ((ArrayList) likeHelper.LLILZLL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1087920ePu) it2.next()).Py(likeHelper, i3);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        LikeHelper likeHelper2 = (LikeHelper) c1151670g4j.l0;
        likeHelper2.LLJJ = false;
        likeHelper2.LJJIJIL(likeHelper2.LLJI, 2);
        return true;
    }

    public static final boolean handleMessage$4(C1151670g4j c1151670g4j, Message message) {
        if (message.what == 1) {
            ((JoinDialogViewModel) c1151670g4j.l0).wQ2();
        }
        return true;
    }

    public static final boolean handleMessage$5(C1151670g4j c1151670g4j, Message message) {
        Gift gift;
        String str;
        if (message.what == 2 && (gift = ((C1078890eBL) c1151670g4j.l0).LIZ) != null && (str = C1078890eBL.LIZ().key) != null && C500260Jjc.LJJIIZ(str)) {
            C784440Upu.LIZ().LIZIZ(new C1118150fCf(Long.valueOf(gift.id), gift.image, C1078890eBL.LIZ(), 1));
        }
        return true;
    }

    public static final boolean handleMessage$6(C1151670g4j c1151670g4j, Message message) {
        if (message.what == 7 && ((C1078900eBM) c1151670g4j.l0).LJ()) {
            ((C1078900eBM) c1151670g4j.l0).LJFF();
            C1078900eBM c1078900eBM = (C1078900eBM) c1151670g4j.l0;
            if (c1078900eBM.LIZIZ != null && !c1078900eBM.LIZJ(c1078900eBM.LJI())) {
                String strLJI = c1078900eBM.LJI();
                if (!TextUtils.isEmpty(strLJI)) {
                    c1078900eBM.LJII(strLJI);
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[PHI: r1
      0x0094: PHI (r1v8 java.lang.String) = (r1v3 java.lang.String), (r1v9 java.lang.String) binds: [B:36:0x0092, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean handleMessage$7(X.C1151670g4j r8, android.os.Message r9) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1151670g4j.handleMessage$7(X.0g4j, android.os.Message):boolean");
    }

    public static final boolean handleMessage$8(C1151670g4j c1151670g4j, Message message) {
        AbstractC1113070f4T abstractC1113070f4T = (AbstractC1113070f4T) c1151670g4j.l0;
        abstractC1113070f4T.getClass();
        if (message.what == 1) {
            abstractC1113070f4T.LJJJJJL(true);
            C786410Ut5.LJLJJI(1, abstractC1113070f4T.LJJLIIJ, abstractC1113070f4T.LIZIZ);
            return true;
        }
        return false;
    }

    public static final boolean handleMessage$9(C1151670g4j c1151670g4j, Message message) {
        GuidanceConfig guidanceConfig;
        if (message.what == 11) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if ((messageObj instanceof GuidanceConfig) && (guidanceConfig = (GuidanceConfig) messageObj) != null) {
                ((C1092510eXJ) c1151670g4j.l0).LIZ(guidanceConfig);
                return true;
            }
            return true;
        }
        return true;
    }
}
