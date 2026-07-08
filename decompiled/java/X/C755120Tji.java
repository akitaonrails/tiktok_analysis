package X;

import Y.AObjectS288S0200000_12;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.commonactionpanel.LiveCommentSheetPanel;
import com.bytedance.android.livesdk.commonactionpanel.LiveLoadActionPanel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Tji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755120Tji implements InterfaceC755160Tjm {
    public final Function0<Unit> LL;
    public final EnumC755280Tjy LLILLJJLI;
    public String LLILLL;
    public FragmentManager LLILZ;
    public InterfaceC1090170eTX LLILZIL;
    public List<Pair<AbstractC755190Tjp, AbstractC752950TgD>> LLILZLL;
    public LiveLoadActionPanel LLIZ;
    public LiveCommentSheetPanel LLIZLLLIL;

    @Override // X.InterfaceC755160Tjm
    public final void LLJJIJI() {
        LiveLoadActionPanel liveLoadActionPanel = this.LLIZ;
        if (liveLoadActionPanel != null) {
            C16F5 c16f5 = liveLoadActionPanel.LLJLLL;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
            C16FZ c16fz = liveLoadActionPanel.LLJZ;
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 8);
            }
        }
    }

    public C755120Tji(AObjectS288S0200000_12 aObjectS288S0200000_12) {
        boolean zBooleanValue;
        Boolean bool;
        this.LL = aObjectS288S0200000_12;
        EnumC755280Tjy enumC755280Tjy = EnumC755280Tjy.VIEWER;
        this.LLILLJJLI = enumC755280Tjy;
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        DataChannel dataChannelLJIIIZ = C782710Un7.LJIIIZ(c782710Un7);
        if (dataChannelLJIIIZ != null && (bool = (Boolean) dataChannelLJIIIZ.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        DataChannel dataChannelLJIIIZ2 = C782710Un7.LJIIIZ(c782710Un7);
        boolean zLIZ = dataChannelLJIIIZ2 != null ? C01C5.LIZ(dataChannelLJIIIZ2) : false;
        if (zBooleanValue) {
            enumC755280Tjy = EnumC755280Tjy.ANCHOR;
        } else if (zLIZ) {
            enumC755280Tjy = EnumC755280Tjy.ADMIN;
        }
        this.LLILLJJLI = enumC755280Tjy;
    }

    @Override // X.InterfaceC755160Tjm
    public final void a(InterfaceC2262081DgM interfaceC2262081DgM) {
        User userFrom;
        LiveLoadActionPanel liveLoadActionPanel = this.LLIZ;
        if (liveLoadActionPanel != null) {
            liveLoadActionPanel.close(1);
        }
        List<Pair<AbstractC755190Tjp, AbstractC752950TgD>> list = this.LLILZLL;
        if (list != null) {
            Iterator<Pair<AbstractC755190Tjp, AbstractC752950TgD>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object obj = (AbstractC752950TgD) it2.next().getSecond();
                if ((obj instanceof InterfaceC750590TcP) && interfaceC2262081DgM != null && interfaceC2262081DgM.getId() > 0 && (userFrom = User.from(interfaceC2262081DgM)) != null) {
                    ((InterfaceC750590TcP) obj).LIZ(userFrom);
                }
            }
        }
        LIZ(this.LLILZ, this.LLILZIL, this.LLILLL, this.LLILZLL);
    }

    public final void LIZ(FragmentManager fragmentManager, InterfaceC1090170eTX interfaceC1090170eTX, String str, List list) {
        Boolean boolValueOf;
        if (this.LLIZLLLIL == null) {
            LiveCommentSheetPanel liveCommentSheetPanel = new LiveCommentSheetPanel();
            this.LLIZLLLIL = liveCommentSheetPanel;
            liveCommentSheetPanel.LLJZ = list;
        }
        LiveCommentSheetPanel liveCommentSheetPanel2 = this.LLIZLLLIL;
        if (liveCommentSheetPanel2 != null) {
            liveCommentSheetPanel2.LLJZIJLIL = new AwS591S0100000_12(this, 1163);
        }
        LiveCommentSheetPanel liveCommentSheetPanel3 = this.LLIZLLLIL;
        if (liveCommentSheetPanel3 != null) {
            List<Pair<AbstractC755190Tjp, AbstractC752950TgD>> list2 = liveCommentSheetPanel3.LLJZ;
            boolean z = false;
            if (list2 != null) {
                Iterator<Pair<AbstractC755190Tjp, AbstractC752950TgD>> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getSecond().LJ(liveCommentSheetPanel3.LLJLLL)) {
                        z = true;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf) && str != null) {
            C19322110iZ.LJFF(fragmentManager, this.LLIZLLLIL, str, interfaceC1090170eTX, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
        }
    }
}
