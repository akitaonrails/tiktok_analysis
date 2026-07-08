package X;

import Y.AObjectS360S0100000_17;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.CaptionStateEvent;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0e9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1077870e9h extends AbstractC1081700eFs<Object> {
    public final RecyclableWidgetManager LIZ;
    public final Room LIZIZ;
    public final DataChannel LIZJ;
    public final Fragment LIZLLL;
    public final Function1<Boolean, Unit> LJ;

    @Override // X.AbstractC1081700eFs
    public final Object LIZIZ() {
        Room room = this.LIZIZ;
        CaptionInfo captionInfo = room.captionInfo;
        if (captionInfo == null || !captionInfo.open || room.getOwner().getSecret() != 0 || (this.LIZLLL.getContext() != null && this.LIZLLL.getResources().getDisplayMetrics().widthPixels <= 360)) {
            CaptionInfo captionInfo2 = this.LIZIZ.captionInfo;
            if (captionInfo2 != null) {
                captionInfo2.open = false;
            }
            this.LJ.invoke(Boolean.TRUE);
            return null;
        }
        this.LIZ.load(R.id.ddh, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Ey0(this.LIZIZ.captionInfo));
        this.LIZ.load(R.id.dc9, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Cr1());
        this.LIZJ.BQ2(this.LIZLLL, CaptionStateEvent.class, new AwS596S0100000_17(this, 702));
        this.LJ.invoke(Boolean.valueOf(!InterfaceC1106030et7.r6.LIZIZ().booleanValue()));
        return null;
    }

    public C1077870e9h(RecyclableWidgetManager recyclableWidgetManager, Room room, DataChannel dataChannel, Fragment fragment, AObjectS360S0100000_17 aObjectS360S0100000_17) {
        this.LIZ = recyclableWidgetManager;
        this.LIZIZ = room;
        this.LIZJ = dataChannel;
        this.LIZLLL = fragment;
        this.LJ = aObjectS360S0100000_17;
    }
}
