package X;

import Y.ACListenerS106S0200000_2;
import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.constants.audiencecontrol.IComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06nW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1714406nW extends LinearLayout implements C06OA {
    public final /* synthetic */ C06ME LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    private final InterfaceC1493105sv getOnEventV3() {
        return (InterfaceC1493105sv) this.LLILLL.getValue();
    }

    public final void LIZ() {
        C786410Ut5.LJLLLLLL(8, this);
        getPrivacySettings().LJJII("dm_setting_friends");
        LLZLI();
    }

    public final PrivacySettingsFeature getPrivacySettings() {
        return (PrivacySettingsFeature) this.LLILLJJLI.getValue();
    }

    public final void LIZJ() {
        getOnEventV3().sendEvent("dm_permission_settings_updated", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "message_chat"), new Pair("updated_permission", "friends"), new Pair("updated_result", "1")));
    }

    public final void LIZLLL() {
        ((TextView) findViewById(R.id.y3j)).setText(getContext().getString(2131830774));
        ((TextView) findViewById(R.id.wh3)).setText(getContext().getString(2131830772));
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.uuo);
        C786410Ut5.LJLLLLLL(0, tuxTextView);
        C786410Ut5.h9(tuxTextView, new ACListenerS106S0200000_2(tuxTextView, this, 3));
    }

    public final void LJ() {
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.y3j);
        if (tuxTextView != null) {
            tuxTextView.setText(tuxTextView.getContext().getString(2131839133));
            tuxTextView.setTuxFont(23);
            C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 21);
        }
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.wh3);
        if (tuxTextView2 != null) {
            tuxTextView2.setText(tuxTextView2.getContext().getString(2131839130));
            tuxTextView2.setTuxFont(41);
            C426750GoL.LJIIIZ(tuxTextView2, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27))), false, 23);
        }
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.uuo);
        if (tuxTextView3 != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView3);
            tuxTextView3.setText(tuxTextView3.getContext().getString(2131839131));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35));
            C426750GoL.LJIIIZ(tuxTextView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(iLIZIZ), false, 18);
            tuxTextView3.setTextColorRes(R.attr.a1n);
            C786410Ut5.h9(tuxTextView3, new ACListenerS137S0100000_2(tuxTextView3, 35));
        }
    }

    public final void LIZIZ(String str) {
        String str2;
        InterfaceC1493105sv onEventV3 = getOnEventV3();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", "message_chat");
        IComplianceServiceProvider.LIZ.getClass();
        IComplianceServiceProvider value = C1714606nY.LIZIZ.getValue();
        if (value != null && value.LIZ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_paused", str2);
        onEventV3.sendEvent(str, C2097608Jq.LJIIIIZZ(pairArr));
    }

    public C1714406nW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C06ME();
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(930));
        this.LLILLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(929));
    }
}
