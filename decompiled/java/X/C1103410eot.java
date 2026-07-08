package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsSmbStateServiceEnableSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceServicePlusIconVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceServicePlusIconVisibleGlobalChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103410eot extends C09AY implements Function1<Pair<? extends Long, ? extends Boolean>, Unit> {
    public final /* synthetic */ C1103320eok LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1103410eot(C1103320eok c1103320eok) {
        super(1);
        this.LL = c1103320eok;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Long, ? extends Boolean> pair) {
        Long lValueOf;
        String secUid;
        String string;
        C1822300xWO c1822300xWO;
        User owner;
        boolean z;
        String secUid2;
        String string2;
        C1822300xWO c1822300xWO2;
        User owner2;
        Pair<? extends Long, ? extends Boolean> pair2 = pair;
        if (C473420IhQ.LIZIZ(pair2, "PcsToolbarAudienceServicePlusBehavior", "resolveConflictsWithOtherIcon", this.LL.LL)) {
            Room room = this.LL.LL;
            Long lValueOf2 = null;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            boolean zBooleanValue = pair2.getSecond().booleanValue();
            InterfaceC1103440eow interfaceC1103440eowLJFF = this.LL.LJFF();
            if (interfaceC1103440eowLJFF != null) {
                interfaceC1103440eowLJFF.LIZIZ(zBooleanValue);
            }
            if (!LivePcsSmbStateServiceEnableSetting.INSTANCE.getValue()) {
                C1103320eok c1103320eok = this.LL;
                c1103320eok.getClass();
                if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
                    C1103520ep4 c1103520ep4 = C1103520ep4.LIZ;
                    Room room2 = c1103320eok.LL;
                    if (room2 != null && (owner2 = room2.getOwner()) != null) {
                        secUid2 = owner2.getSecUid();
                    } else {
                        secUid2 = null;
                    }
                    Room room3 = c1103320eok.LL;
                    if (room3 != null) {
                        string2 = Long.valueOf(room3.getId()).toString();
                    } else {
                        string2 = null;
                    }
                    C1822320xWQ c1822320xWQLIZJ = C1103520ep4.LIZJ(secUid2, string2);
                    if (c1822320xWQLIZJ != null && (c1822300xWO2 = (C1822300xWO) c1822320xWQLIZJ.LIZIZ.getValue()) != null) {
                        lValueOf2 = Long.valueOf(c1822300xWO2.LJII);
                    }
                } else {
                    C518520KVe c518520KVe = C518520KVe.LIZIZ;
                    Room room4 = c1103320eok.LL;
                    if (room4 != null && (owner = room4.getOwner()) != null) {
                        secUid = owner.getSecUid();
                    } else {
                        secUid = null;
                    }
                    Room room5 = c1103320eok.LL;
                    if (room5 != null) {
                        string = Long.valueOf(room5.getId()).toString();
                    } else {
                        string = null;
                    }
                    C1784870wY1 c1784870wY1LIZIZ = c518520KVe.LIZIZ(secUid, string);
                    if (c1784870wY1LIZIZ != null && (c1822300xWO = c1784870wY1LIZIZ.LIZIZ) != null) {
                        lValueOf2 = Long.valueOf(c1822300xWO.LJII);
                    }
                }
                if (lValueOf2 != null && lValueOf2.longValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (zBooleanValue) {
                    this.LL.LJII("shopping_bag_show");
                } else if (z) {
                    this.LL.LJII("preload_zero_sku");
                } else {
                    this.LL.LJIIJ();
                }
                InterfaceC785120Ur0 interfaceC785120Ur0 = this.LL.LLJI;
                if (interfaceC785120Ur0 != null && interfaceC785120Ur0.getVisibility() == 0 && !this.LL.LLJILJILJ) {
                    C20441214yg.LIZIZ("ServiceIconConflictsResolution", "PcsToolbarAudienceServicePlusBehavior.resolveConflictsWithOtherIcon -> logServicePlusIconShow first visible only");
                    this.LL.LJIIIZ();
                    C1103320eok c1103320eok2 = this.LL;
                    c1103320eok2.LLJILJILJ = true;
                    C1107120eus c1107120eus = c1103320eok2.LLJJ;
                    if (c1107120eus != null) {
                        c1107120eus.LIZ();
                    }
                }
            }
            DataChannel dataChannel = this.LL.LLIZLLLIL;
            if (dataChannel != null) {
                dataChannel.zW(PcsAudienceServicePlusIconVisibleChannel.class, new Pair(lValueOf, Boolean.valueOf(!zBooleanValue)));
            }
            DataChannelGlobal.LLILZ.HQ2(PcsAudienceServicePlusIconVisibleGlobalChannel.class, new Pair(lValueOf, Boolean.valueOf(!zBooleanValue)));
        }
        return Unit.LIZ;
    }
}
