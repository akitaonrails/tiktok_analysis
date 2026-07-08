package X;

import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tikcast.linkmic.common.CohostUserInfo;

/* JADX INFO: renamed from: X.0JGG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGG extends AbstractC497830Jfh implements InterfaceC944340agK {
    public C945320ahu LJIIIZ;
    public C945320ahu LJIIJ;
    public final ConcurrentHashMap<Long, EnumC470470Icf> LJIIJJI;
    public long LJIIL;
    public Map<Long, ? extends Map<Long, CohostUserInfo>> LJIILIIL;
    public final Map<Long, Boolean> LJIILJJIL;

    @Override // X.InterfaceC944340agK
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC944340agK
    public final boolean LLFZ() {
        long j = this.LIZ;
        return j > 0 && this.LJIIJJI.get(Long.valueOf(j)) == EnumC470470Icf.ROOM_ENTER;
    }

    public C0JGG() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initialChannelId=");
        sbLIZ.append(0L);
        C20441214yg.LJIIIZ("MultiHostDataHolderAudienceImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJJI = new ConcurrentHashMap<>();
        this.LJIILIIL = C2097608Jq.LJ();
        this.LJIILJJIL = new LinkedHashMap();
    }

    @Override // X.InterfaceC944340agK
    public final long LJJIJ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC944340agK
    public final C945320ahu LJJIJIIJIL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC944340agK
    public final C945320ahu LLF() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC944340agK
    public final Map<Long, Boolean> LLJL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC944340agK
    public final Map<Long, Map<Long, CohostUserInfo>> LLJZ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC944340agK
    public final void LJII(long j) {
        this.LIZ = j;
        if (j > 0) {
            LLLI(true);
            C959220b4K.LIZIZ = j;
        }
    }

    @Override // X.InterfaceC944340agK
    public final void LJJJJIZL(Map<Long, ? extends Map<Long, CohostUserInfo>> map) {
        this.LJIILIIL = map;
    }

    @Override // X.InterfaceC944340agK
    public final void LJLILLLLZI(C945320ahu c945320ahu) {
        this.LJIIJ = null;
    }

    @Override // X.InterfaceC944340agK
    public final void LLJILJIL(long j) {
        this.LJIIL = j;
    }

    @Override // X.AbstractC497830Jfh, X.InterfaceC955780aym
    public final void LLLI(boolean z) {
        DataChannel dataChannel;
        super.LLLI(z);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        if (C500260Jjc.LJIJI(C464550IJp.LIZIZ().LIZIZ) && (dataChannel = C464550IJp.LIZIZ().LIZIZ) != null) {
            dataChannel.FQ2(LinkConnectionTypeChangedEvent.class);
        }
    }

    @Override // X.InterfaceC944340agK
    public final void LLLII(C945320ahu c945320ahu) {
        Boolean boolValueOf;
        this.LJIIIZ = c945320ahu;
        if (c945320ahu != null) {
            boolValueOf = Boolean.valueOf(c945320ahu.LIZ());
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            this.LJIIJ = c945320ahu;
        }
    }

    @Override // X.AbstractC497830Jfh
    public final void LLLIIIIL(String str) {
        super.LLLIIIIL(str);
        this.LJIIIZ = null;
        this.LJIIJJI.clear();
    }

    @Override // X.InterfaceC944340agK
    public final Boolean Tn(long j) {
        return (Boolean) ((LinkedHashMap) this.LJIILJJIL).get(Long.valueOf(j));
    }

    @Override // X.InterfaceC944340agK
    public final void LJLLLL(long j, EnumC470470Icf enumC470470Icf) {
        if (j <= 0) {
            return;
        }
        if (this.LJIIJJI.get(Long.valueOf(j)) == null) {
            this.LJIIJJI.put(Long.valueOf(j), enumC470470Icf);
        } else {
            this.LJIIJJI.put(Long.valueOf(j), EnumC470470Icf.SUCCESS);
        }
    }
}
