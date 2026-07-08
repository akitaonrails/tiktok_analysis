package X;

import android.view.TextureView;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import qo2.w;

/* JADX INFO: renamed from: X.0aZ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939820aZ2 {
    public InterfaceC470090Ic3 LIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public InterfaceC940660aaO LJI;
    public String LIZIZ = "";
    public final C939830aZ3 LJII = new InterfaceC588410N5z() { // from class: X.0aZ3
        @Override // X.InterfaceC588410N5z
        public final void LL(String str) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onBufferedPercent(String str, long j, int i) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onBuffering(boolean z) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onPausePlay(String str) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onPlayProgressChange(float f) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onPreparePlay(String str) {
        }

        @Override // X.InterfaceC588410N5z
        public final void LJII() {
            C20441214yg.LJIIIZ("MultiGuestAdPlayer", "multiGuest ad onRenderFirstFrame");
            this.LL.LJFF = System.currentTimeMillis();
            C939820aZ2 c939820aZ2 = this.LL;
            if (c939820aZ2.LIZJ) {
                String str = c939820aZ2.LIZIZ;
                HashMap map = new HashMap();
                C924180a9o.LIZ(map);
                map.put("ad_id", str);
                map.put("is_guest_connection", C924810aAp.LJ().LJJII == 0 ? CardStruct.IStatusCode.DEFAULT : "1");
                C924180a9o.LIZLLL("livesdk_anchor_ops_material_start", map);
                return;
            }
            String str2 = c939820aZ2.LIZIZ;
            C924180a9o.LIZIZ = System.currentTimeMillis();
            HashMap map2 = new HashMap();
            w.LIZ.getClass();
            map2.put("enter_method", w.LJIIL());
            map2.put("enter_from_merge", w.LJIIIZ());
            map2.put("action_type", w.LIZLLL());
            C924180a9o.LIZ(map2);
            map2.put("ad_id", str2);
            map2.put("is_guest_connection", C924810aAp.LJ().LJJII == 0 ? CardStruct.IStatusCode.DEFAULT : "1");
            C924180a9o.LIZLLL("livesdk_ops_material_view_start", map2);
        }

        @Override // X.InterfaceC588410N5z
        public final void LJLLI(String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayFailed error:");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("MultiGuestAdPlayer", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC940660aaO interfaceC940660aaO = this.LL.LJI;
            if (interfaceC940660aaO != null) {
                interfaceC940660aaO.LJLLI(str);
            }
        }

        @Override // X.InterfaceC588410N5z
        public final void onPlayCompleted(String str) {
            InterfaceC940660aaO interfaceC940660aaO;
            this.LL.LJ++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPlayCompleted sourceId:");
            sbLIZ.append(str);
            sbLIZ.append(", currentPlayTimes:");
            sbLIZ.append(this.LL.LJ);
            sbLIZ.append(", playTimes:");
            sbLIZ.append(this.LL.LIZLLL);
            C20441214yg.LJIIIZ("MultiGuestAdPlayer", C2188811AlT.LIZIZ(sbLIZ));
            C939820aZ2 c939820aZ2 = this.LL;
            if (c939820aZ2.LJ >= c939820aZ2.LIZLLL && (interfaceC940660aaO = c939820aZ2.LJI) != null) {
                interfaceC940660aaO.LJLLILLLL();
            }
        }

        @Override // X.InterfaceC588410N5z
        public final void onResumePlay(String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onResumePlay sourceId:");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("MultiGuestAdPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    public final void LIZ() {
        C20441214yg.LJIIIZ("MultiGuestAdPlayer", "release");
        if (this.LJFF > 0) {
            int i = this.LJ;
            int i2 = this.LIZLLL;
            if (i < i2) {
                i2 = i + 1;
            }
            if (this.LIZJ) {
                String str = this.LIZIZ;
                String strValueOf = String.valueOf(i2);
                String strValueOf2 = String.valueOf(System.currentTimeMillis() - this.LJFF);
                HashMap map = new HashMap();
                C924180a9o.LIZ(map);
                map.put("ad_id", str);
                map.put("is_guest_connection", C924810aAp.LJ().LJJII == 0 ? CardStruct.IStatusCode.DEFAULT : "1");
                map.put("play_cnt", strValueOf);
                map.put("duration", strValueOf2);
                C924180a9o.LIZLLL("livesdk_anchor_ops_material_duration", map);
            } else {
                String str2 = this.LIZIZ;
                String strValueOf3 = String.valueOf(i2);
                HashMap map2 = new HashMap();
                w.LIZ.getClass();
                map2.put("enter_method", w.LJIIL());
                map2.put("enter_from_merge", w.LJIIIZ());
                map2.put("action_type", w.LIZLLL());
                C924180a9o.LIZ(map2);
                map2.put("ad_id", str2);
                map2.put("is_guest_connection", C924810aAp.LJ().LJJII == 0 ? CardStruct.IStatusCode.DEFAULT : "1");
                map2.put("play_cnt", strValueOf3);
                map2.put("duration", C924180a9o.LIZJ ? String.valueOf(C924180a9o.LIZ) : String.valueOf((System.currentTimeMillis() - C924180a9o.LIZIZ) + C924180a9o.LIZ));
                C924180a9o.LIZ = 0L;
                C924180a9o.LIZIZ = 0L;
                C924180a9o.LIZLLL("livesdk_ops_material_view_duration", map2);
            }
        }
        this.LJ = 0;
        InterfaceC470090Ic3 interfaceC470090Ic3 = this.LIZ;
        if (interfaceC470090Ic3 != null) {
            interfaceC470090Ic3.release();
        }
        this.LIZ = null;
        this.LJFF = 0L;
    }

    public final void LIZIZ(TextureView textureView, String str, boolean z, String str2, int i, int i2, float f, InterfaceC940660aaO interfaceC940660aaO) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start play ad, adId:");
        sbLIZ.append(str);
        sbLIZ.append(", duration:");
        sbLIZ.append(i);
        sbLIZ.append(", playTimes:");
        sbLIZ.append(i2);
        sbLIZ.append(", seekProgress:");
        sbLIZ.append(f);
        sbLIZ.append(", url:");
        sbLIZ.append(str2);
        C20441214yg.LJIIIZ("MultiGuestAdPlayer", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = i2;
        this.LJI = interfaceC940660aaO;
        InterfaceC470090Ic3 interfaceC470090Ic3 = this.LIZ;
        if (interfaceC470090Ic3 != null) {
            interfaceC470090Ic3.pause();
        }
        if (this.LIZ == null) {
            this.LIZ = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getVideoCleanPlayerController(textureView, str2, i, null, "multi_guest_ad", this.LJII);
        }
        InterfaceC470090Ic3 interfaceC470090Ic32 = this.LIZ;
        if (interfaceC470090Ic32 != null) {
            interfaceC470090Ic32.start();
        }
        InterfaceC470090Ic3 interfaceC470090Ic33 = this.LIZ;
        if (interfaceC470090Ic33 != null) {
            interfaceC470090Ic33.LJIILL(f);
        }
    }
}
