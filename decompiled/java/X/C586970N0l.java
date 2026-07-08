package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IPrepareVideoCaptionUtil;
import com.ss.android.ugc.aweme.ITranslatedVideoUtil;
import com.ss.android.ugc.aweme.feed.controller.BaseController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C586970N0l {
    public Aweme LIZ;
    public Aweme LIZIZ;
    public final C1482640ogY LIZJ;
    public final OnUIPlayListener LIZLLL;
    public C0N0Y LJI;
    public HashMap<String, Object> LJII;
    public InterfaceC1483670oiD LJIIIIZZ;
    public String LJIIJJI;
    public String LJIIL;
    public int LJFF = -1;
    public Boolean LJIIIZ = Boolean.FALSE;
    public EnumC2281141EQm LJIIJ = EnumC2281141EQm.Undefine;
    public boolean LJIILIIL = false;
    public final BaseController LJ = null;

    public final VideoUrlModel LIZ() {
        VideoUrlModel properPlayAddr;
        ITranslatedVideoUtil iTranslatedVideoUtil = (ITranslatedVideoUtil) PluggableExtentionKt.pluggableSpi(ITranslatedVideoUtil.class);
        if (iTranslatedVideoUtil != null) {
            iTranslatedVideoUtil.LIZ(this.LIZ);
        }
        Video videoLJ = LJ(this.LIZ);
        if (videoLJ == null || (properPlayAddr = videoLJ.getProperPlayAddr()) == null) {
            return null;
        }
        Aweme aweme = this.LIZIZ;
        if (aweme == null) {
            aweme = this.LIZ;
        }
        videoLJ.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    public final boolean LIZIZ() {
        Aweme aweme;
        BaseController baseController;
        if (!this.LIZJ.Da() || ((aweme = this.LIZ) != null && AwemeExtKt.getStatusSafety(aweme) != null && AwemeExtKt.getStatusSafety(this.LIZ).isDelete())) {
            return false;
        }
        if (!TextUtils.isEmpty(null) || (baseController = this.LJ) == null) {
            return true;
        }
        baseController.getEventType();
        return true;
    }

    public final void LIZJ() {
        C0N0Y c0n0y = this.LJI;
        if (c0n0y == null || !c0n0y.LJLJI(this.LIZLLL)) {
            return;
        }
        this.LJI.LJJIJ(null);
    }

    public final long LIZLLL() {
        C0N0Y c0n0y = this.LJI;
        if (c0n0y != null) {
            return c0n0y.getCurrentPosition();
        }
        return 0L;
    }

    public final void LJFF() {
        C0N0Y c0n0y = this.LJI;
        if (c0n0y != null) {
            c0n0y.LJFF();
        }
    }

    public final void LJIIIIZZ() {
        C0N0Y c0n0y;
        C581750Mrl c581750MrlLIZIZ;
        C1479890oc7 c1479890oc7LIZ;
        if (LIZIZ()) {
            this.LJFF = 0;
            if (LIZ() == null || (c0n0y = this.LJI) == null) {
                return;
            }
            c0n0y.LJJIJ(this.LIZLLL);
            this.LJI.setSurface(this.LIZJ.getSurface());
            IPrepareVideoCaptionUtil iPrepareVideoCaptionUtil = (IPrepareVideoCaptionUtil) PluggableExtentionKt.pluggableSpi(IPrepareVideoCaptionUtil.class);
            if (iPrepareVideoCaptionUtil != null) {
                c581750MrlLIZIZ = iPrepareVideoCaptionUtil.LIZIZ(this.LIZ);
                c1479890oc7LIZ = iPrepareVideoCaptionUtil.LIZ(this.LIZ);
            } else {
                c581750MrlLIZIZ = null;
                c1479890oc7LIZ = null;
            }
            if (!C07EA.LIZ()) {
                C0N0Y c0n0y2 = this.LJI;
                Video videoLJ = LJ(this.LIZ);
                boolean zLIZIZ = C582980Mtk.LIZIZ(this.LIZ);
                OnUIPlayListener onUIPlayListener = this.LIZLLL;
                HashMap<String, Object> map = this.LJII;
                c0n0y2.LJJJJIZL(videoLJ, zLIZIZ, onUIPlayListener, 0, map != null, map, c581750MrlLIZIZ, c1479890oc7LIZ, this.LJIIJ, this.LJIIJJI);
                return;
            }
            C0N0Y c0n0y3 = this.LJI;
            Video videoLJ2 = LJ(this.LIZ);
            boolean zLIZIZ2 = C582980Mtk.LIZIZ(this.LIZ);
            boolean zLIZLLL = C721220SQu.LIZLLL(this.LIZ);
            HashMap<String, Object> map2 = this.LJII;
            C581360Mr8 c581360Mr8LIZ = C582060MsG.LIZ();
            c581360Mr8LIZ.LJII = this.LJIIJJI;
            HashMap map3 = new HashMap();
            String str = this.LJIIL;
            if (str == null) {
                map3.put("gec", "");
            } else {
                map3.put("gec", str);
            }
            c581360Mr8LIZ.LJIIIZ = map3;
            if (C07CU.LIZ() && AwemeExtKt.isPhotoMode(this.LIZ) && !C721220SQu.LIZLLL(this.LIZ) && (C07CU.LIZJ(null) || C07CU.LIZIZ())) {
                c581360Mr8LIZ.LJIIL = AnonymousClass0758.LIZ();
            }
            C584150Mvd c584150Mvd = new C584150Mvd(videoLJ2, null, EnumC2281131EQl.SuperHigh, 0, c581360Mr8LIZ, c581750MrlLIZIZ, c1479890oc7LIZ, false, zLIZIZ2, zLIZLLL, false, false, 0, false, false, false, 0, null, false);
            c584150Mvd.LJIJJLI = map2;
            c584150Mvd.LJIJJ = true;
            c584150Mvd.LJJII = this.LJIILIIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPlayDataWrapper, forceUseSoftwareDecode: ");
            sbLIZ.append(this.LJIILIIL);
            C2188811AlT.LIZIZ(sbLIZ);
            c0n0y3.LJJIFFI(c584150Mvd, this.LIZLLL);
        }
    }

    public final void LJII() {
        C0N0Y c0n0y;
        C581750Mrl c581750MrlLIZIZ;
        if (LIZIZ()) {
            this.LJFF = 0;
            try {
                if (LIZ() == null || (c0n0y = this.LJI) == null) {
                    return;
                }
                c0n0y.LJJIJ(this.LIZLLL);
                this.LJI.setSurface(this.LIZJ.getSurface());
                IPrepareVideoCaptionUtil iPrepareVideoCaptionUtil = (IPrepareVideoCaptionUtil) PluggableExtentionKt.pluggableSpi(IPrepareVideoCaptionUtil.class);
                C1479890oc7 c1479890oc7LIZ = null;
                if (iPrepareVideoCaptionUtil != null) {
                    c581750MrlLIZIZ = iPrepareVideoCaptionUtil.LIZIZ(this.LIZ);
                    c1479890oc7LIZ = iPrepareVideoCaptionUtil.LIZ(this.LIZ);
                } else {
                    c581750MrlLIZIZ = null;
                }
                C0N0Y c0n0y2 = this.LJI;
                Video videoLJ = LJ(this.LIZ);
                boolean zLIZIZ = C582980Mtk.LIZIZ(this.LIZ);
                OnUIPlayListener onUIPlayListener = this.LIZLLL;
                HashMap<String, Object> map = this.LJII;
                c0n0y2.LJJJJJL(videoLJ, zLIZIZ, onUIPlayListener, 0, c581750MrlLIZIZ, c1479890oc7LIZ, true, map != null, map, this.LJIIJ, this.LJIIJJI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJIIJJI() {
        C0N0Y c0n0y;
        if (LIZIZ()) {
            this.LJFF = 2;
            if (LIZ() == null || (c0n0y = this.LJI) == null) {
                return;
            }
            c0n0y.LJJIJ(this.LIZLLL);
            this.LJI.setSurface(this.LIZJ.getSurface());
            C0N0Y c0n0y2 = this.LJI;
            Video videoLJ = LJ(this.LIZ);
            boolean zLIZIZ = C582980Mtk.LIZIZ(this.LIZ);
            HashMap<String, Object> map = this.LJII;
            c0n0y2.LJJZ(videoLJ, zLIZIZ, 0, map != null, map);
        }
    }

    public static Video LJ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return aweme.getVideo();
    }

    public final void LJI(int i) {
        C0N0Y c0n0y;
        C1479890oc7 c1479890oc7LIZ;
        if (i <= 0) {
            LJIIIIZZ();
            return;
        }
        if (!LIZIZ()) {
            return;
        }
        boolean z = false;
        this.LJFF = 0;
        if (LIZ() == null || (c0n0y = this.LJI) == null) {
            return;
        }
        c0n0y.LJJIJ(this.LIZLLL);
        this.LJI.setSurface(this.LIZJ.getSurface());
        IPrepareVideoCaptionUtil iPrepareVideoCaptionUtil = (IPrepareVideoCaptionUtil) PluggableExtentionKt.pluggableSpi(IPrepareVideoCaptionUtil.class);
        C581750Mrl c581750MrlLIZIZ = null;
        if (iPrepareVideoCaptionUtil != null) {
            c581750MrlLIZIZ = iPrepareVideoCaptionUtil.LIZIZ(this.LIZ);
            c1479890oc7LIZ = iPrepareVideoCaptionUtil.LIZ(this.LIZ);
        } else {
            c1479890oc7LIZ = null;
        }
        C0N0Y c0n0y2 = this.LJI;
        Video videoLJ = LJ(this.LIZ);
        boolean zLIZIZ = C582980Mtk.LIZIZ(this.LIZ);
        OnUIPlayListener onUIPlayListener = this.LIZLLL;
        HashMap<String, Object> map = this.LJII;
        if (map != null) {
            z = true;
        }
        c0n0y2.LJJJJIZL(videoLJ, zLIZIZ, onUIPlayListener, i, z, map, c581750MrlLIZIZ, c1479890oc7LIZ, this.LJIIJ, this.LJIIJJI);
    }

    public final void LJIIIZ(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        if (aweme.getAwemeType() == 13) {
            this.LIZIZ = aweme;
            this.LIZ = aweme.getForwardItem();
        } else {
            this.LIZIZ = null;
            this.LIZ = aweme;
        }
    }

    public final void LJIIJ(C0N0Y c0n0y) {
        this.LJI = c0n0y;
        if (c0n0y != null && this.LJII != null) {
            InterfaceC1483670oiD interfaceC1483670oiDLJIILL = c0n0y.LJIILL();
            this.LJIIIIZZ = interfaceC1483670oiDLJIILL;
            if (interfaceC1483670oiDLJIILL != null) {
                interfaceC1483670oiDLJIILL.LJIILIIL().LIZ(new InterfaceC585470Mxl() { // from class: X.0N0m
                    @Override // X.InterfaceC585470Mxl
                    public final boolean LIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LIZIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LIZJ() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ HashMap LJ(String str) {
                        return null;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ HashMap LJFF(String str) {
                        return null;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LJI() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LJII() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LJIIIIZZ() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LJIIIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ HashMap LJIIJ(String str, boolean z) {
                        return null;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ HashMap LJIIL(String str, JSONObject jSONObject) {
                        return null;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LJIILIIL() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LJIILJJIL() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ HashMap LJIILL(String str) {
                        return null;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final /* synthetic */ boolean LJIILLIIL() {
                        return false;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final EnumC585580Mxw LIZLLL() {
                        return EnumC585580Mxw.DEFAULT;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final EnumC1987207qQ LJIIJJI() {
                        return EnumC1987207qQ.VIDEO;
                    }

                    @Override // X.InterfaceC585470Mxl
                    public final HashMap<String, Object> LJIIZILJ(String str, boolean z) {
                        HashMap<String, Object> map = new HashMap<>();
                        if (this.LIZ.LJIIIZ.booleanValue()) {
                            map.put("is_prepare", 1);
                            this.LIZ.LJIIIZ = Boolean.FALSE;
                        }
                        map.put("search_session_info", C0QO8.LIZ.getSessionInfo().LIZ());
                        return map;
                    }
                });
                this.LJIIIIZZ.LJIILIIL().LIZIZ(new C1481200oeE());
            }
        }
    }

    public final void LJIIL(int i) {
        C0N0Y c0n0y;
        boolean z;
        if (!LIZIZ()) {
            return;
        }
        this.LJFF = 2;
        if (LIZ() != null && (c0n0y = this.LJI) != null) {
            c0n0y.LJJIJ(this.LIZLLL);
            this.LJI.setSurface(this.LIZJ.getSurface());
            C0N0Y c0n0y2 = this.LJI;
            Video videoLJ = LJ(this.LIZ);
            boolean zLIZIZ = C582980Mtk.LIZIZ(this.LIZ);
            HashMap<String, Object> map = this.LJII;
            if (map != null) {
                z = true;
            } else {
                z = false;
            }
            c0n0y2.LJJZ(videoLJ, zLIZIZ, i, z, map);
        }
    }

    public C586970N0l(C1473870oSP c1473870oSP, OnUIPlayListener onUIPlayListener) {
        this.LIZJ = C1482640ogY.LJIIIIZZ(c1473870oSP);
        this.LIZLLL = onUIPlayListener;
    }
}
