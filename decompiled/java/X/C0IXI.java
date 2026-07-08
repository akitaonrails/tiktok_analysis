package X;

import android.content.Context;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSdkAudienceSeiMissedTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveStaticLogOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IXI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IXI implements InterfaceC925030aBB {
    public final Room LIZ;
    public C945320ahu LIZIZ;
    public C11JF LIZLLL;
    public long LJ;
    public boolean LJFF;
    public InterfaceC420801kM LJI;
    public long LIZJ = -1;
    public final C0IXH LJII = new InterfaceC19562711gH() { // from class: X.0IXH
        @Override // X.InterfaceC19562711gH
        public final void LLF(Context context) {
            C0IXI c0ixi = this.LL;
            c0ixi.LJFF = false;
            c0ixi.LJ = System.currentTimeMillis();
        }

        @Override // X.InterfaceC19562711gH
        public final void LLLLIILLL(Context context) {
            this.LL.LJFF = true;
        }
    };

    @Override // X.InterfaceC925030aBB
    public final void LIZIZ() {
        C20441214yg.LIZIZ("SeiMissedIdentifyHelper", "try2Dispose");
        LIZ(null);
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
        InterfaceC420801kM interfaceC420801kM = this.LJI;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LJI = null;
        this.LIZJ = System.currentTimeMillis();
    }

    public final void LIZJ() {
        if (this.LIZLLL != null) {
            C20441214yg.LJIIIZ("SeiMissedIdentifyHelper", "try2StartMonitor has started");
            return;
        }
        this.LJ = System.currentTimeMillis();
        final int value = MultiGuestSdkAudienceSeiMissedTimeSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start, interval = ");
        sbLIZ.append(value);
        C20441214yg.LIZIZ("SeiMissedIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ));
        long j = value;
        this.LIZLLL = (C11JF) C11NZ.LJJJJJL(j, j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new C09JN() { // from class: X.0IXG
            @Override // X.C09JN
            public final void accept(Object obj) {
                Boolean boolValueOf;
                String str;
                String strOptString;
                String strOptString2;
                String strLJIL;
                String strLJIL2;
                C1C7U.LIZ("SeiMissedIdentifyHelper@9471.try2StartMonitor$2");
                InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LL.LJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("interval run, playing:");
                JSONObject jSONObjectLJI = null;
                if (interfaceC480510Isr != null) {
                    boolValueOf = Boolean.valueOf(interfaceC480510Isr.isPlaying());
                } else {
                    boolValueOf = null;
                }
                sbLIZ2.append(boolValueOf);
                sbLIZ2.append(" seiInterval:");
                sbLIZ2.append(jCurrentTimeMillis);
                sbLIZ2.append(" isBackground:");
                sbLIZ2.append(this.LL.LJFF);
                C20441214yg.LIZIZ("SeiMissedIdentifyHelper", C2188811AlT.LIZIZ(sbLIZ2));
                if (interfaceC480510Isr != null && interfaceC480510Isr.isPlaying() && jCurrentTimeMillis >= value) {
                    C0IXI c0ixi = this.LL;
                    if (!c0ixi.LJFF) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_linkmic_sei_missed");
                        c474500IjALIZ.LJJII(String.valueOf(c0ixi.LIZ.getId()), "room_id");
                        c474500IjALIZ.LJJII(String.valueOf(c0ixi.LIZ.getOwnerUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(String.valueOf(c0ixi.LIZ.liveRoomMode), "live_room_mode");
                        String strBuildPullUrl = c0ixi.LIZ.buildPullUrl();
                        String str2 = "";
                        if (strBuildPullUrl == null) {
                            strBuildPullUrl = "";
                        }
                        c474500IjALIZ.LJJII(strBuildPullUrl, "stream_url");
                        C945320ahu c945320ahu = c0ixi.LIZIZ;
                        if (c945320ahu != null) {
                            str = c945320ahu.LIZIZ;
                        } else {
                            str = null;
                        }
                        c474500IjALIZ.LJJII(str, "last_sei");
                        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - c0ixi.LJ), "not_receive_duration");
                        if (LiveStaticLogOptSetting.enable()) {
                            InterfaceC480510Isr interfaceC480510Isr2 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
                            if (interfaceC480510Isr2 == null || (strLJIL = interfaceC480510Isr2.LJIL(309)) == null) {
                                strLJIL = "";
                            }
                            c474500IjALIZ.LJJII(strLJIL, "cdn_ip");
                            if (interfaceC480510Isr2 != null && (strLJIL2 = interfaceC480510Isr2.LJIL(310)) != null) {
                                str2 = strLJIL2;
                            }
                            c474500IjALIZ.LJJII(str2, "resolution_type");
                            c474500IjALIZ.LIZ();
                        } else {
                            InterfaceC480510Isr interfaceC480510Isr3 = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
                            if (interfaceC480510Isr3 == null || (jSONObjectLJI = interfaceC480510Isr3.LJI()) == null || (strOptString = jSONObjectLJI.optString("cdn_ip:", "")) == null) {
                                strOptString = "";
                            }
                            c474500IjALIZ.LJJII(strOptString, "cdn_ip");
                            if (jSONObjectLJI != null && (strOptString2 = jSONObjectLJI.optString("resolution:", "")) != null) {
                                str2 = strOptString2;
                            }
                            c474500IjALIZ.LJJII(str2, "resolution_type");
                            c474500IjALIZ.LIZ();
                        }
                    }
                }
                C1C7U.LIZIZ("SeiMissedIdentifyHelper@9471.try2StartMonitor$2");
            }
        }).LJJLJ();
        this.LJI = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(this.LJII);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0IXH] */
    public C0IXI(Room room) {
        this.LIZ = room;
    }

    @Override // X.InterfaceC925030aBB
    public final void LIZ(C945320ahu c945320ahu) {
        this.LIZIZ = c945320ahu;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJ = jCurrentTimeMillis;
        if (this.LIZLLL == null) {
            long j = this.LIZJ;
            if (j > 0 && jCurrentTimeMillis - j > MultiGuestSdkAudienceSeiMissedTimeSetting.INSTANCE.getValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC1303240k1C.LINKER.getValue());
                sbLIZ.append("_SeiMissedIdentifyHelper_");
                sbLIZ.append(38);
                C1AZW.LJIIJ(12, C2188811AlT.LIZIZ(sbLIZ), "receive sei, restart", null, null);
                C500260Jjc.LJJLIIIJILLIZJL(new C0IXJ(this));
            }
        }
    }
}
