package com.bytedance.android.live.toolbar;

import X.C1119920fFW;
import X.C1548820qPI;
import X.C16F5;
import X.C1871910yoP;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C262100zr;
import X.C389001fE;
import X.C497740JfY;
import X.C500980Jkm;
import X.C521550Kcr;
import X.C786410Ut5;
import X.EnumC1088870eRR;
import X.EnumC1088900eRU;
import X.EnumC1102750enp;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import Y.AUListenerS217S0200000_7;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class ToolbarButtonMoreDialogNew extends LiveDialogFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiPSA8JCHELIOSctO2EHJyogKy4hCjA4PSA9BSo+LAs6KSkjLgE2Pw==";
    public final List<EnumC1102750enp> LL;
    public final List<EnumC1102750enp> LLILLJJLI;
    public final DataChannel LLILLL;
    public ValueAnimator LLILZ;
    public C16F5 LLILZIL;
    public ViewGroup LLILZLL;
    public LinearLayout LLIZ;
    public LinearLayout LLIZLLLIL;
    public C16F5 LLJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g8t);
        c500980Jkm.LIZIZ = 2;
        c500980Jkm.LIZJ = R.style.ai0;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 50;
        return c500980Jkm;
    }

    public final void MR(C262100zr c262100zr) {
        float fLIZLLL;
        ValueAnimator duration;
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                fLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "height", 160);
            } else {
                fLIZLLL = 160.0f;
            }
            ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(layoutParams.height, (int) C497740JfY.LIZIZ(fLIZLLL));
            this.LLILZ = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.addUpdateListener(new AUListenerS217S0200000_7(layoutParams, viewGroup, 1));
            }
            ValueAnimator valueAnimator = this.LLILZ;
            if (valueAnimator != null && (duration = valueAnimator.setDuration(300L)) != null) {
                duration.start();
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
        Boolean boolValueOf;
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (Intrinsics.LJFF(c262100zr.LIZ, "anchor_center_request_room_info")) {
            MR(c262100zr);
            JSONObject jSONObject = new JSONObject();
            w.LIZ.getClass();
            jSONObject.put("room_id", String.valueOf(w.LJIJJ()));
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                boolValueOf = Boolean.valueOf(roomAuthStatus.isEnableGift());
            } else {
                boolValueOf = null;
            }
            jSONObject.put("gift_permission", boolValueOf);
            C389001fE.LIZ("anchor_center_response_room_info", jSONObject, System.currentTimeMillis(), false);
        }
        if (Intrinsics.LJFF(c262100zr.LIZ, "anchor_center_receive_flash_card")) {
            MR(c262100zr);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.LLILLL;
        dataChannel.BQ2(this, DismissToolbarPopEvent.class, new AwS586S0100000_7(this, 18));
        dataChannel.BQ2(this, CppSeeDetailsClickEvent.class, new AwS586S0100000_7(this, 19));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        EnumC1088870eRR.POPUP.release(this.dataChannel);
        C1548820qPI.LJIIIIZZ("anchor_center_request_room_info", this);
        C1548820qPI.LJIIIIZZ("anchor_center_receive_flash_card", this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZIL = (C16F5) view.findViewById(R.id.ols);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.sur);
        this.LLIZ = (LinearLayout) view.findViewById(R.id.y6w);
        this.LLIZLLLIL = (LinearLayout) view.findViewById(R.id.y6x);
        this.LLJ = (C16F5) view.findViewById(R.id.t92);
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIIL(2131755546, 2, 2));
        }
        EnumC1088870eRR enumC1088870eRR = EnumC1088870eRR.POPUP;
        DataChannel dataChannel = this.LLILLL;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout == null) {
            return;
        }
        List<EnumC1102750enp> list = this.LL;
        EnumC1088900eRU enumC1088900eRU = EnumC1088900eRU.ICON_TITLE_HORIZONTAL_ARROW;
        enumC1088870eRR.createHolder(dataChannel, linearLayout, list, enumC1088900eRU);
        DataChannel dataChannel2 = this.LLILLL;
        LinearLayout linearLayout2 = this.LLIZLLLIL;
        if (linearLayout2 == null) {
            return;
        }
        enumC1088870eRR.createHolder(dataChannel2, linearLayout2, this.LLILLJJLI, enumC1088900eRU);
        C16F5 c16f52 = this.LLJ;
        if (c16f52 != null) {
            String strLJIJI = C497740JfY.LJIJI(2131855396);
            String strLJIJI2 = C497740JfY.LJIJI(2131841499);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJI);
            sbLIZ.append(strLJIJI2);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C1119920fFW.LJ(getContext(), spannableString, 0, strLJIJI.length(), 17, 6, 400);
            C1119920fFW.LJ(getContext(), spannableString, strLJIJI.length(), spannableString.length(), 17, 6, 500);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex3, getContext())), 0, spannableString.length(), 17);
            C786410Ut5.p2(spannableString, new C521550Kcr(this, 12), strLJIJI.length(), spannableString.length(), 17);
            c16f52.setText(spannableString);
            c16f52.setLinksClickable(true);
            c16f52.setMovementMethod(LinkMovementMethod.getInstance());
            c16f52.setHighlightColor(0);
        }
        C1548820qPI.LIZLLL("anchor_center_request_room_info", this);
        C1548820qPI.LIZLLL("anchor_center_receive_flash_card", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarButtonMoreDialogNew(List<? extends EnumC1102750enp> list, List<? extends EnumC1102750enp> list2, DataChannel dataChannel) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = dataChannel;
    }
}
