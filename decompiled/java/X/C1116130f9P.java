package X;

import Y.AObserverS221S0100000_17;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.revenue.StarCommentPinnedAvoidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f9P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116130f9P {
    public final StarCommentViewModel LIZ;
    public final LifecycleOwner LIZIZ;
    public final DataChannel LIZJ;
    public C1116210f9X LIZLLL;
    public EnumC1116160f9S LJ = EnumC1116160f9S.UNKNOWN;
    public C1109600eys<? extends InterfaceC1112060f2q> LJFF;
    public C1116150f9R LJI;
    public final long LJII;
    public long LJIIIIZZ;
    public final AwS596S0100000_17 LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final AObserverS221S0100000_17 LJIILIIL;
    public final AObserverS221S0100000_17 LJIILJJIL;
    public final AObserverS221S0100000_17 LJIILL;

    public final void LIZIZ(boolean z) {
        if (this.LJIIL != z) {
            this.LJIIL = z;
            this.LIZJ.zW(StarCommentPinnedAvoidEvent.class, Boolean.valueOf(z));
        }
    }

    public C1116130f9P(StarCommentViewModel starCommentViewModel, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        long id;
        this.LIZ = starCommentViewModel;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = dataChannel;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LJII = id;
        this.LJIIIZ = new AwS596S0100000_17(this, 332);
        this.LJIILIIL = new AObserverS221S0100000_17(this, 33);
        this.LJIILJJIL = new AObserverS221S0100000_17(this, 32);
        this.LJIILL = new AObserverS221S0100000_17(this, 34);
    }

    public final C1109560eyo LIZ(C1116150f9R c1116150f9R, boolean z, boolean z2) {
        String str;
        AwS596S0100000_17 awS596S0100000_17;
        List listSingletonList = null;
        if (c1116150f9R == null) {
            return null;
        }
        EnumC1116180f9U enumC1116180f9U = c1116150f9R.LIZJ;
        EnumC1116180f9U enumC1116180f9U2 = EnumC1116180f9U.DELETED;
        if (enumC1116180f9U == enumC1116180f9U2) {
            str = "#80FF3B5C";
        } else {
            str = "#66000000";
        }
        Integer numValueOf = Integer.valueOf(ColorProtector.parseColor(str));
        ImageModel imageModel = c1116150f9R.LIZ;
        CharSequence charSequence = c1116150f9R.LIZIZ;
        if (c1116150f9R.LIZJ != enumC1116180f9U2) {
            awS596S0100000_17 = this.LJIIIZ;
        } else {
            awS596S0100000_17 = null;
        }
        if (z) {
            listSingletonList = Collections.singletonList(1);
        }
        return new C1109560eyo(numValueOf, imageModel, charSequence, awS596S0100000_17, listSingletonList, z2);
    }
}
