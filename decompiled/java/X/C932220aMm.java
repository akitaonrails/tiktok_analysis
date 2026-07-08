package X;

import Y.ACListenerS118S0200000_15;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932220aMm extends LinearLayout {
    public final C16F5 LL;
    public final C1118590fDN LLILLJJLI;
    public DataChannel LLILLL;
    public LinkPlayerInfo LLILZ;
    public InterfaceC931760aM2 LLILZIL;
    public final C01GW LLILZLL;

    private final C932230aMn getGuestFollowAbility() {
        return (C932230aMn) this.LLILZLL.getValue();
    }

    public final Long getUserId() {
        User user;
        LinkPlayerInfo linkPlayerInfo = this.LLILZ;
        if (linkPlayerInfo == null || (user = linkPlayerInfo.mUser) == null) {
            return null;
        }
        return Long.valueOf(user.getId());
    }

    public final InterfaceC931760aM2 getFollowClickListener() {
        return this.LLILZIL;
    }

    public C932220aMm(Context context) {
        super(context, null, 0);
        this.LLILZLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 63));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.heu, this, true);
        findViewById(R.id.q1t);
        this.LLILLJJLI = (C1118590fDN) findViewById(R.id.lms);
        this.LL = (C16F5) findViewById(R.id.tv_user_name);
    }

    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        AbstractC1387200mCc abstractC1387200mCcLJJIIJ;
        View viewLJI;
        Context context = getContext();
        if (context != null && (abstractC1387200mCcLJJIIJ = C520010KaN.LJJIIJ(context)) != null && (viewLJI = abstractC1387200mCcLJJIIJ.LJI()) != null) {
            new C932420aN6(getContext(), getGuestFollowAbility(), linkPlayerInfo.mUser, linkPlayerInfo.mInteractIdStr, this.LLILLL, "guest_quick_manage_panel", (C932100aMa) null, 192).LJJLIIIJILLIZJL(viewLJI);
        }
    }

    public final void setFollowClickListener(InterfaceC931760aM2 interfaceC931760aM2) {
        this.LLILZIL = interfaceC931760aM2;
    }

    public final void LIZIZ(LinkPlayerInfo linkPlayerInfo, boolean z) {
        if (z) {
            this.LLILLJJLI.LIZIZ();
        } else {
            this.LLILLJJLI.LJFF();
            this.LLILLJJLI.setFollowOnClickListener(new ACListenerS118S0200000_15(this, linkPlayerInfo, 5));
        }
    }
}
