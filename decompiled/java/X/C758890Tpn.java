package X;

import Y.AcS186S0300000_12;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758890Tpn implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 204;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        int i;
        Object objGg0;
        C758940Tps c758940Tps;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c759360TqY));
        C758920Tpq c758920Tpq = (C758920Tpq) DataChannelGlobal.LLILZ.gg0(ECBcToggleChannel.class);
        if (c758920Tpq != null && (c758940Tps = c758920Tpq.LIZ) != null) {
            i = c758940Tps.LIZ;
        } else {
            i = -1;
        }
        DataChannel dataChannel = c500840JkY.LIZIZ;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(LiveModeChannel.class);
        } else {
            objGg0 = null;
        }
        if (C13LP.LJJJJ(objGg0, C1697810uHb.LJIIJJI(LiveMode.VIDEO, LiveMode.THIRD_PARTY)) && !C758060ToS.LIZ() && c758920Tpq != null && i == 1) {
            Context context = c500840JkY.LIZ;
            C758060ToS.LIZIZ(c500840JkY.LIZIZ, "show");
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJFF(R.drawable.eaz);
            c782110Um9.LJIIZILJ(2131841481);
            c782110Um9.LJII(2131841480);
            c782110Um9.LJIILIIL(2131841478, new AcS186S0300000_12(c23260099m, c758920Tpq, c500840JkY, 1));
            c782110Um9.LJIIJ(2131841479, new AcS186S0300000_12(c23260099m, c758920Tpq, c500840JkY, 2));
            c782110Um9.LJIILLIIL = false;
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            C1391850mK7.LIZIZ(liveDialogLIZ, "549");
            C786410Ut5.E4(liveDialogLIZ);
            C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.f145u4;
            Boolean bool = Boolean.TRUE;
            c20337914i1.LJFF(bool);
            InterfaceC772390URp.LLZZLLIL.LJFF(bool);
            c758920Tpq.LJII.invoke(EnumC758830Tph.DIALOG_SHOW);
        } else {
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c759360TqY);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
