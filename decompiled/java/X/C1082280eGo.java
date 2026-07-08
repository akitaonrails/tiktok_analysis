package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveInteractiveBottomMinHeightSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082280eGo {
    public static final /* synthetic */ int LJIIL = 0;
    public final AbstractC1080560eE2 LIZ;
    public boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL = (int) C497740JfY.LIZIZ(36.0f);
    public final int LJ = (int) C497740JfY.LIZIZ(LiveInteractiveBottomMinHeightSetting.INSTANCE.getValue() * 1.0f);
    public int LJFF;
    public C956380azk LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    public C1082280eGo(AbstractC1080560eE2 abstractC1080560eE2) {
        this.LIZ = abstractC1080560eE2;
        this.LIZJ = abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.acs) + abstractC1080560eE2.LJFF;
    }

    public final void LIZJ(C0IMR c0imr) {
        int i;
        if (this.LIZIZ) {
            return;
        }
        if (c0imr.LIZ() && (i = c0imr.LIZIZ) > 0) {
            this.LJII = true;
            this.LJIIIIZZ = true;
            this.LJIIJ = i;
            this.LJIIIZ = i;
            this.LJIIJJI = i;
            return;
        }
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIJ = 0;
        this.LJIIJJI = 0;
    }

    public final boolean LIZ(C956380azk c956380azk, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        int i2;
        int iLJIILLIIL;
        int i3;
        int height;
        int i4;
        Long lValueOf;
        Long lValueOf2;
        View view;
        int i5;
        int height2;
        View view2;
        int iIntValue;
        Integer numValueOf;
        if (c956380azk != null && c956380azk.LIZ == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || (c956380azk != null && (c956380azk.LIZ == 2 || c956380azk.LIZ == 4 || c956380azk.LIZ == 5 || c956380azk.LIZ == 6))) {
            if (c956380azk.LIZ()) {
                this.LJI = c956380azk;
                this.LIZIZ = true;
                this.LJII = false;
                this.LJIIJJI = 0;
                this.LJIIJ = 0;
            } else {
                if (c956380azk.LIZ == 6 || (i2 = c956380azk.LIZJ) <= 0) {
                    return false;
                }
                C956380azk c956380azk2 = this.LJI;
                if (c956380azk2 != null && c956380azk2.LIZJ == i2 && c956380azk2.LJIIIIZZ == c956380azk.LJIIIIZZ && !z && i == this.LJFF) {
                    return false;
                }
                this.LJI = c956380azk;
                if (C500260Jjc.LJJII(C497740JfY.LIZ) && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                    iLJIILLIIL = ((C497740JfY.LJIILLIIL() * 2) / 3) - ((int) C497740JfY.LIZIZ(56.0f));
                } else {
                    iLJIILLIIL = c956380azk.LIZJ;
                }
                this.LJIIJJI = iLJIILLIIL;
                if (c956380azk.LJIIIIZZ && !z) {
                    if (z2) {
                        i5 = this.LIZJ;
                    } else {
                        i5 = 0;
                    }
                    iLJIILLIIL += i5;
                    if (!((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).Zx()) {
                        iLJIILLIIL += i;
                    }
                }
                this.LJFF = i;
                if (z3) {
                    i3 = this.LIZLLL;
                } else {
                    i3 = 0;
                }
                int i6 = iLJIILLIIL + i3 + c956380azk.LJII;
                Object parent = this.LIZ.getContainer().getParent();
                if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                    height = view.getHeight();
                } else {
                    height = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("topMargin = ");
                sbLIZ.append(i6);
                sbLIZ.append(" screenHeight = ");
                sbLIZ.append(height);
                C20441214yg.LIZIZ("PublicScreen", C2188811AlT.LIZIZ(sbLIZ));
                if (height > 0 && i6 > (i4 = height - this.LJ)) {
                    boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(this.LIZ.getDataChannel());
                    int i7 = height - i6;
                    Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ.getDataChannel());
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject2.put("is_anchor", zLJIIZILJ);
                        jSONObject3.put("value", i6);
                        jSONObject3.put("screen_height", height);
                        jSONObject3.put("screen_height_dp", Float.valueOf(C497740JfY.LJJI(height)));
                        jSONObject3.put("bottom_section_height", i7);
                        jSONObject3.put("bottom_section_height_dp", Float.valueOf(C497740JfY.LJJI(i7)));
                        if (roomLJJLIIIIJ != null) {
                            lValueOf = Long.valueOf(roomLJJLIIIIJ.getId());
                        } else {
                            lValueOf = null;
                        }
                        jSONObject.put("room_id", lValueOf);
                        if (roomLJJLIIIIJ != null) {
                            lValueOf2 = Long.valueOf(roomLJJLIIIIJ.getOwnerUserId());
                        } else {
                            lValueOf2 = null;
                        }
                        jSONObject.put("anchor_id", lValueOf2);
                        jSONObject.put("co_host_event", c956380azk.toString());
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1CC2.LJ("ttlive_interaction_bottom_height_invalidate", jSONObject2, jSONObject3, jSONObject);
                    i6 = i4;
                }
                this.LIZIZ = true;
                this.LJII = true;
                this.LJIIJ = i6;
            }
        } else {
            this.LJI = null;
            this.LIZIZ = false;
            boolean z5 = this.LJIIIIZZ;
            this.LJII = z5;
            if (z5) {
                C0IMR c0imr = (C0IMR) this.LIZ.getDataChannel().gg0(VideoOrientationChangeChannel.class);
                if (c0imr != null && (numValueOf = Integer.valueOf(c0imr.LIZIZ)) != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = this.LJIIIZ;
                }
                this.LJIIJJI = iIntValue;
                this.LJIIJ = iIntValue;
            } else {
                this.LJIIJJI = 0;
                this.LJIIJ = 0;
            }
        }
        StringBuilder sb = new StringBuilder("resolveLinkCrossRoomEvent, linkCrossRoomEvent=");
        sb.append(c956380azk);
        sb.append(", pkEnd=");
        sb.append(z);
        sb.append(", needAddMvpHeight=");
        sb.append(z2);
        sb.append(", needAddCoHostHeight=");
        sb.append(z3);
        sb.append(", bonusTaskHeight=");
        sb.append(i);
        sb.append(", isVideoHorizontal=");
        sb.append(this.LJII);
        sb.append(", overallTopSpacing = ");
        sb.append(this.LJIIJ);
        sb.append(", videoHorizontalBottomTopSpacing=");
        sb.append(this.LJIIJJI);
        sb.append(", screenHeight = ");
        Object parent2 = this.LIZ.getContainer().getParent();
        if ((parent2 instanceof ViewGroup) && (view2 = (View) parent2) != null) {
            height2 = view2.getHeight();
        } else {
            height2 = 0;
        }
        sb.append(height2);
        C20441214yg.LJ("HorizontalVideoResolver", sb.toString());
        return true;
    }
}
