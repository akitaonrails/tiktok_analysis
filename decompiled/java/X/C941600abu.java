package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.model.FanTicketModel;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.0abu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941600abu implements InterfaceC938250aWV {
    public static final /* synthetic */ int LIZIZ = 0;
    public final FanTicketModel LIZ;

    @Override // X.InterfaceC938250aWV
    public final Map<Long, Long> LIZIZ() {
        return this.LIZ.LIZJ.LIZ;
    }

    @Override // X.InterfaceC938250aWV
    public final Map<Long, UserPlayInfo> LJIIJ() {
        return this.LIZ.LIZJ.LIZJ;
    }

    public final void LJIIJJI() {
        FanTicketModel fanTicketModel = this.LIZ;
        fanTicketModel.getClass();
        if (C320901Mh.LIZIZ()) {
            fanTicketModel.LIZLLL.LIZLLL(false);
        }
    }

    @Override // X.InterfaceC938250aWV
    public final long getVersion() {
        return this.LIZ.LIZJ.LJII;
    }

    @Override // X.InterfaceC938250aWV
    public final int LIZJ() {
        return C320901Mh.LIZJ() ? this.LIZ.LIZJ.LJFF : this.LIZ.LIZJ.LJI;
    }

    @Override // X.InterfaceC938250aWV
    public final int LIZ(long j) {
        C941850acJ c941850acJ = this.LIZ.LIZJ.LJ.get(Long.valueOf(j));
        if (c941850acJ != null) {
            return c941850acJ.LIZJ;
        }
        return 0;
    }

    @Override // X.InterfaceC938250aWV
    public final long LIZLLL(long j) {
        long jLongValue;
        Long l = this.LIZ.LIZJ.LIZ.get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (LIZJ() == 2) {
            UserPlayInfo userPlayInfo = this.LIZ.LIZJ.LIZJ.get(Long.valueOf(j));
            if (userPlayInfo == null) {
                return 0L;
            }
            return userPlayInfo.score;
        }
        return jLongValue;
    }

    @Override // X.InterfaceC938250aWV
    public final String LJ(long j) {
        C941850acJ c941850acJ = this.LIZ.LIZJ.LJ.get(Long.valueOf(j));
        if (c941850acJ != null) {
            return c941850acJ.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC938250aWV
    public final String LJFF(long j) {
        C941850acJ c941850acJ = this.LIZ.LIZJ.LJ.get(Long.valueOf(j));
        if (c941850acJ != null) {
            return c941850acJ.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC938250aWV
    public final void LJI(InterfaceC941650abz interfaceC941650abz) {
        this.LIZ.LIZIZ.add(interfaceC941650abz);
    }

    @Override // X.InterfaceC938250aWV
    public final void LJII(InterfaceC941650abz interfaceC941650abz) {
        this.LIZ.LIZIZ.remove(interfaceC941650abz);
    }

    @Override // X.InterfaceC938250aWV
    public final int LJIIIIZZ(long j) {
        Integer num = this.LIZ.LIZJ.LIZIZ.get(Long.valueOf(j));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC938250aWV
    public final String LJIIIZ(long j) {
        String str = this.LIZ.LIZJ.LIZLLL.get(Long.valueOf(j));
        if (str != null) {
            this.LIZ.LIZJ.LIZLLL.remove(Long.valueOf(j));
            return str;
        }
        return null;
    }

    public C941600abu(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LIZ = new FanTicketModel(lifecycleOwner, dataChannel);
    }
}
