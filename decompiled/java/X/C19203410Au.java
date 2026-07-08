package X;

import android.app.Dialog;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS23S1201000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.10Au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("privacy_notify_dialog")
public final class C19203410Au extends AbstractC20660015ss<Dialog> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final int LLILZIL = 135;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        return new C688120Qyw(this.LL, this.LLILLJJLI, null);
    }

    public static void LJIIL() {
        C191821102p.LIZIZ().getClass();
        Integer numLJIIIIZZ = C191880104w.LJIIIIZZ("guide_content_reuse_on_report", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (numLJIIIIZZ == null || numLJIIIIZZ.intValue() != 1) {
            return;
        }
        C191880104w.LJIILLIIL(C191821102p.LIZIZ(), "guide_content_reuse_on_report", 1).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.109m
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C191821102p.LIZIZ().getClass();
                C191880104w.LJIIZILJ("guide_content_reuse_on_report");
            }
        }).LJJLL(new C09JN() { // from class: X.10Av
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PrivacyNotifyPopupTask@76cb.notifyPopupAck$2");
                C1C7U.LIZIZ("PrivacyNotifyPopupTask@76cb.notifyPopupAck$2");
            }
        }, new C09JN() { // from class: X.10Aw
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PrivacyNotifyPopupTask@76cb.notifyPopupAck$3");
                C1C7U.LIZIZ("PrivacyNotifyPopupTask@76cb.notifyPopupAck$3");
            }
        });
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        Function0 awS429S0200000_28;
        int i;
        int i2;
        String str;
        int i3 = this.LLILLL;
        if (i3 != 1) {
            if (i3 != 2) {
                return null;
            }
            awS429S0200000_28 = new AwS547S0100000_3(c688120Qyw, 183);
            i = 2131845994;
            i2 = 2131845995;
            str = "review_reuse_history";
        } else {
            awS429S0200000_28 = new AwS429S0200000_28(c688120Qyw, this, 170);
            i = 2131845991;
            i2 = 2131845993;
            str = "update_permission";
        }
        C1397580mTM c1397580mTM = new C1397580mTM(c688120Qyw.LIZ);
        c1397580mTM.LJFF(2131845992);
        c1397580mTM.LIZ(i);
        C985403tE.LIZ(c1397580mTM, new AwS23S1201000_28(i2, (int) str, (String) awS429S0200000_28, (Function0<Unit>) this, (C19203410Au) 1));
        c1397580mTM.LJII = false;
        c1397580mTM.LJ(AFwS271S0000000_28.get$arr$(453));
        c1397580mTM.LIZJ(AFwS271S0000000_28.get$arr$(454));
        c1397580mTM.LIZLLL(AFwS271S0000000_28.get$arr$(455));
        return new C1397510mTF(c1397580mTM).LJ();
    }

    public C19203410Au(Context context, LifecycleOwner lifecycleOwner, int i, String str) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = i;
        this.LLILZ = str;
    }
}
