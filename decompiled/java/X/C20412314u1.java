package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.SimpleUser;

/* JADX INFO: renamed from: X.14u1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20412314u1 extends AbstractC960470b6L<C20412414u2> {
    public final boolean LL;
    public final InterfaceC20413014u8 LLILLJJLI;
    public final DataChannel LLILLL;
    public final String LLILZ;
    public C1324720kZq LLILZIL;
    public C376990EqH LLILZLL;
    public LiveIconView LLIZ;
    public TextView LLIZLLLIL;
    public C1324720kZq LLJ;
    public LiveIconView LLJI;
    public LiveIconView LLJIJIL;
    public View LLJILJIL;
    public TextView LLJILJILJ;
    public LiveIconView LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public C20743516Fd LLJJIJIIJIL;
    public C20743516Fd LLJJIJIL;
    public LinearLayout LLJJJ;
    public C1324720kZq LLJJJIL;
    public C16F5 LLJJJJ;
    public final boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final C01GW LLJJL;

    /* JADX WARN: Removed duplicated region for block: B:169:0x0465  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(X.C20412414u2 r13) {
        /*
            Method dump skipped, instruction units count: 1417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20412314u1.L5(X.14u2):void");
    }

    public final void N5(C20412414u2 c20412414u2) {
        UserProfileEvent userProfileEvent;
        String str;
        if (c20412414u2.LJIILL) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            String str2 = this.LLILZ;
            Long lValueOf = Long.valueOf(c20412414u2.LIZ);
            if (Intrinsics.LJFF(this.LLILZ, "create_preview")) {
                str = "create";
            } else {
                str = "edit";
            }
            C978360bZC.LJIJ(str2, "author", lValueOf, str, c20412414u2.LJIIL, null, null);
        }
        if (!C500260Jjc.LJJIJLIJ() && !C500260Jjc.LJIJJLI(this.LLILLL) && this.LLJJJJJIL) {
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            SimpleUser simpleUser = c20412414u2.LIZJ;
            if (simpleUser != null) {
                userProfileEvent = new UserProfileEvent(simpleUser.userId);
                userProfileEvent.coHostEnable = false;
                userProfileEvent.linkInRoomEnable = true;
                userProfileEvent.mSource = "guest_connection";
                userProfileEvent.mClickUserPosition = "connection_list";
                userProfileEvent.clickModule = "playbook_detail_page";
            } else {
                userProfileEvent = null;
            }
            c784440UpuLIZ.LIZIZ(userProfileEvent);
            return;
        }
        SimpleUser simpleUser2 = c20412414u2.LIZJ;
        if (simpleUser2 == null) {
            return;
        }
        long j = simpleUser2.userId;
        HashMap map = new HashMap();
        map.put("uid", String.valueOf(j));
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openUserProfilePage(j, map);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C20412414u2) obj);
    }

    public C20412314u1(View view, boolean z, InterfaceC20413014u8 interfaceC20413014u8, DataChannel dataChannel, String str) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Boolean bool;
        Boolean bool2;
        super(view);
        this.LL = z;
        this.LLILLJJLI = interfaceC20413014u8;
        this.LLILLL = dataChannel;
        this.LLILZ = str;
        if (dataChannel != null && (bool2 = (Boolean) dataChannel.gg0(C956690b0F.class)) != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLJJJJJIL = zBooleanValue;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C1083530eIp.class)) != null) {
            zBooleanValue2 = bool.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        this.LLJJJJLIIL = zBooleanValue2;
        this.LLJJL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(337));
    }
}
