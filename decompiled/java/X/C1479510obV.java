package X;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0obV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479510obV {
    public static C1479510obV LLJLIL;
    public static final C1480010ocJ LLJLILLLLZIIL = new InterfaceC1479910oc9() { // from class: X.0ocJ
        @Override // X.InterfaceC1479910oc9
        public final String getFirstFrameKey() {
            return null;
        }

        @Override // X.InterfaceC1479910oc9
        public final String getPrepareKey() {
            return null;
        }

        @Override // X.InterfaceC1479910oc9
        public final boolean isLoop() {
            return true;
        }

        @Override // X.InterfaceC1479910oc9
        public final boolean isPlayLoop() {
            return true;
        }
    };
    public InterfaceC1480060ocO LIZ;
    public OnPreRenderListener LIZIZ;
    public OnPlayerPreparedListener LIZJ;
    public InterfaceC1479880oc6<C1477160oXi> LIZLLL;
    public List<InterfaceC1479880oc6<C1471970oPL>> LJ;
    public List<InterfaceC1479880oc6<C1477880oYs>> LJFF;
    public InterfaceC1479880oc6<Boolean> LJI;
    public C1478430oZl LJII;
    public Context LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public InterfaceC1479910oc9 LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public C1473210oRL LJIJJLI;
    public String LJIL;
    public float LJJ;
    public boolean LJJI;
    public Surface LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public InterfaceC1479880oc6<Integer> LJJIIJ;
    public final String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public C1477160oXi LJJIJIIJIL;
    public List<C1471970oPL> LJJIJIL;
    public List<C1477880oYs> LJJIJL;
    public boolean LJJIJLIJ;
    public int LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public Bundle LJJJJLI;
    public boolean LJJJJLL;
    public long LJJJJZ;
    public boolean LJJJJZI;
    public boolean LJJJLIIL;
    public boolean LJJJLL;
    public C1472990oQz LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public Map<String, String> LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public final boolean LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public float LJJLIIIJL;
    public boolean LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public int LJJLIL;
    public Float LJJLJ;
    public Float LJJLJLI;
    public Float LJJLL;
    public Future<Float> LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public boolean LJL;
    public boolean LJLI;
    public boolean LJLIIIL;
    public Long LJLIIL;
    public C1ET9 LJLIL;
    public InterfaceC1487080oni LJLILLLLZI;
    public InterfaceC1499700p84 LJLJI;
    public List<Surface> LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public String LJLLLL;
    public JSONObject LJLLLLLL;
    public C1479890oc7 LJLZ;
    public final int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public String LLD;
    public int LLF;
    public long LLFF;
    public String LLFFF;
    public String LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public boolean LLIIL;
    public String LLIILII;
    public Long LLIILZL;
    public String LLIIZ;
    public String LLIL;
    public boolean LLILII;
    public String LLILIL;
    public SimVideoUrlModel LLILL;
    public boolean LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC1479840oc2 LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C1473010oR1 LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C0NBK LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public InterfaceC1480080ocQ<Long, Long> LLJL;

    public final void LIZIZ() {
        C1479510obV c1479510obV = LLJLIL;
        if (c1479510obV == null) {
            return;
        }
        this.LJIJ = c1479510obV.LJIJ;
        this.LJJIII = c1479510obV.LJJIII;
        this.LJIJI = c1479510obV.LJIJI;
        this.LLJJLIIIJLLLLLLLZ = c1479510obV.LLJJLIIIJLLLLLLLZ;
        this.LJJJJZI = c1479510obV.LJJJJZI;
        this.LJJLJ = c1479510obV.LJJLJ;
        this.LJLJLLL = c1479510obV.LJLJLLL;
        this.LLIFFJFJJ = c1479510obV.LLIFFJFJJ;
        this.LLII = c1479510obV.LLII;
        this.LJJJJ = c1479510obV.LJJJJ;
    }

    public final List<C1471970oPL> LIZJ() {
        if (this.LJJIJIL == null && this.LJ != null) {
            this.LJJIJIL = new ArrayList();
            Iterator it2 = ((ArrayList) this.LJ).iterator();
            while (it2.hasNext()) {
                this.LJJIJIL.add((C1471970oPL) ((InterfaceC1479880oc6) it2.next()).get());
            }
        }
        return this.LJJIJIL;
    }

    public final List<C1477880oYs> LIZLLL() {
        if (this.LJJIJL == null && this.LJFF != null) {
            this.LJJIJL = new ArrayList();
            Iterator it2 = ((ArrayList) this.LJFF).iterator();
            while (it2.hasNext()) {
                this.LJJIJL.add((C1477880oYs) ((InterfaceC1479880oc6) it2.next()).get());
            }
        }
        return this.LJJIJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1477160oXi LJ() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1479510obV.LJ():X.0oXi");
    }

    public final boolean LJFF() {
        if (this.LJI == null) {
            return false;
        }
        if (((Boolean) C1474810oTv.LJJLIIIJJI.getValue()).booleanValue()) {
            C1477160oXi c1477160oXiLJ = LJ();
            if (c1477160oXiLJ == null) {
                return false;
            }
            Object obj = c1477160oXiLJ.LIZ;
            if ((obj instanceof String) && ((String) obj).startsWith("/")) {
                return true;
            }
        }
        return this.LJI.get().booleanValue();
    }

    public C1479510obV() {
        this.LJIIJJI = LLJLILLLLZIIL;
        this.LJIJJ = -1;
        Float fValueOf = Float.valueOf(Float.MIN_VALUE);
        this.LJJ = Float.MIN_VALUE;
        this.LJJII = -1;
        this.LJJIII = 1;
        this.LJJJLL = true;
        this.LJJLIIIJILLIZJL = Integer.MIN_VALUE;
        this.LJJLIIIJJI = true;
        this.LJJLIIIJL = 1.0f;
        this.LJJLJ = Float.valueOf(0.0f);
        this.LJJLJLI = fValueOf;
        this.LJJLL = fValueOf;
        this.LJJZ = null;
        this.LJJZZI = 0;
        this.LJJZZIII = -1;
        this.LJL = false;
        this.LJLI = false;
        this.LJLIIL = 0L;
        this.LJLJJI = null;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        this.LJLJL = false;
        this.LJLJLJ = -1;
        this.LJLJLLL = false;
        this.LJLL = 15;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LJLLL = 0;
        this.LJLLLL = null;
        this.LJLLLLLL = null;
        this.LJLZ = null;
        this.LJZ = -1;
        this.LJZL = -1;
        this.LL = -1;
        this.LLD = null;
        this.LLF = 0;
        this.LLFF = 0L;
        this.LLFFF = null;
        this.LLFII = null;
        this.LLFZ = false;
        this.LLI = false;
        this.LLIFFJFJJ = 0;
        this.LLII = 0;
        this.LLIIII = 0;
        this.LLIIIILZ = true;
        this.LLIIIJ = true;
        this.LLIIIL = false;
        this.LLIIIZ = false;
        this.LLIIJI = -1;
        this.LLIIJLIL = -1;
        this.LLIIL = false;
        this.LLIILII = "";
        this.LLIILZL = -1L;
        this.LLIIZ = "";
        this.LLILIL = "";
        this.LLJILLL = 0;
        this.LLJJ = -1.0f;
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = 0.0f;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
        this.LLJJJIL = false;
        this.LLJJJJ = true;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = new C1480070ocP();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrepareData{urlSupplier=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cacheSupplier=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", resolutionSupplier=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", id='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", isRenderReady=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", vr=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", renderType=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", decoderType=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", enableAlog=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", prepareOnly=");
        sbLIZ.append(this.LJJI);
        sbLIZ.append(", surface=");
        sbLIZ.append(this.LJJIFFI);
        sbLIZ.append(", framesWait=");
        sbLIZ.append(this.LJJIII);
        sbLIZ.append(", prepareQualitySupplier=");
        sbLIZ.append(this.LJJIIJ);
        sbLIZ.append(", uri='");
        sbLIZ.append(this.LJJIIJZLJL);
        sbLIZ.append('\'');
        sbLIZ.append(", cacheKey='");
        sbLIZ.append(this.LJJIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", checksum='");
        sbLIZ.append(this.LJJIIZI);
        sbLIZ.append('\'');
        sbLIZ.append(", isCurPlayer=");
        sbLIZ.append(this.LJJIJ);
        sbLIZ.append(", isPrepareCallback=");
        sbLIZ.append(this.LJJIJIIJI);
        sbLIZ.append(", processUrlData=");
        sbLIZ.append(this.LJJIJIIJIL);
        sbLIZ.append(", isAsyncInit=");
        sbLIZ.append(this.LJJIJLIJ);
        sbLIZ.append(", initialStartTimeMs=");
        sbLIZ.append(this.LJJIL);
        sbLIZ.append(", isUseTextureRenderer=");
        sbLIZ.append(this.LJJJI);
        sbLIZ.append(", needSetCookieToken=");
        sbLIZ.append(this.LJJJIL);
        sbLIZ.append(", dashHijackRetry=");
        sbLIZ.append(this.LJJJJ);
        sbLIZ.append(", forceNotReuseEngine=");
        sbLIZ.append(this.LJJJJJL);
        sbLIZ.append(", fixPrepareSeqTmp=");
        sbLIZ.append(this.LJJJJZI);
        sbLIZ.append(", preloadSocketReuse=");
        sbLIZ.append(this.LJJJLIIL);
        sbLIZ.append(", dashPlayInfo=");
        sbLIZ.append(this.LJJJLZIJ);
        sbLIZ.append(", tag='");
        sbLIZ.append(this.LJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", subTag='");
        sbLIZ.append(this.LJJLIIIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", networkSpeed=");
        sbLIZ.append(this.LJJLIIIJILLIZJL);
        sbLIZ.append(", isLoop=");
        sbLIZ.append(this.LJJLIIIJJI);
        sbLIZ.append(", dk='");
        sbLIZ.append(this.LJJLIIIJJIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", speed=");
        sbLIZ.append(this.LJJLIIIJL);
        sbLIZ.append(", isEnableBufferThresholdControl=");
        sbLIZ.append(this.LJJLIIIJLJLI);
        sbLIZ.append(", bufferThresholdControlDangerThreshold=");
        sbLIZ.append(this.LJJLIIIJLLLLLLLZ);
        sbLIZ.append(", bufferThresholdControlSecureThreshold=");
        sbLIZ.append(this.LJJLIIJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJJLIL);
        sbLIZ.append(", volumeLoudnessTarget=");
        sbLIZ.append(this.LJJLJ);
        sbLIZ.append(", videoVolumeSrcLoudness=");
        sbLIZ.append(this.LJJLJLI);
        sbLIZ.append(", videoVolumeSrcPeak=");
        sbLIZ.append(this.LJJLL);
        sbLIZ.append(", disableRenderAudio=");
        sbLIZ.append(this.LJLIIIL);
        sbLIZ.append(", processAudioAddr=");
        sbLIZ.append(this.LJLIIL);
        sbLIZ.append(", extraSurface=");
        sbLIZ.append(this.LJLJJI);
        sbLIZ.append(", subtitlesEnable=");
        sbLIZ.append(this.LJLLILLLL);
        sbLIZ.append(", subtitlesLazyLoading=");
        sbLIZ.append(this.LJLLI);
        sbLIZ.append(", subtitleId=");
        sbLIZ.append(this.LJLLL);
        sbLIZ.append(", subtitleIsRealtimeTranslated=");
        sbLIZ.append(this.LJLLJ);
        sbLIZ.append(", subtitleDesInfoModel=");
        sbLIZ.append(this.LJLLLL);
        sbLIZ.append(", subtitleDesInfoModelJSONObject=");
        sbLIZ.append(this.LJLLLLLL);
        sbLIZ.append(", callCurrentPlaybackTime=");
        sbLIZ.append(this.LLIIIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(C1479510obV c1479510obV) {
        this.LIZLLL = c1479510obV.LIZLLL;
        this.LJI = c1479510obV.LJI;
        this.LJJIIJ = c1479510obV.LJJIIJ;
        this.LJJIIZ = c1479510obV.LJJIIZ;
        this.LJJLI = c1479510obV.LJJLI;
        this.LJJLIIIIJ = c1479510obV.LJJLIIIIJ;
        this.LJIIIIZZ = c1479510obV.LJIIIIZZ;
        this.LJIIIZ = c1479510obV.LJIIIZ;
        this.LJIIJJI = c1479510obV.LJIIJJI;
        this.LJIIL = c1479510obV.LJIIL;
        this.LJIILIIL = c1479510obV.LJIILIIL;
        this.LJIIZILJ = c1479510obV.LJIIZILJ;
        this.LJJIJLIJ = c1479510obV.LJJIJLIJ;
        this.LLIZ = c1479510obV.LLIZ;
        this.LJJLIIIJ = c1479510obV.LJJLIIIJ;
        this.LJJLIIIJILLIZJL = c1479510obV.LJJLIIIJILLIZJL;
        this.LJJLJLI = c1479510obV.LJJLJLI;
        this.LJJLL = c1479510obV.LJJLL;
        this.LLJJ = c1479510obV.LLJJ;
        this.LJJJI = c1479510obV.LJJJI;
        this.LJJJIL = c1479510obV.LJJJIL;
        this.LJJJJJL = c1479510obV.LJJJJJL;
        this.LJJIL = c1479510obV.LJJIL;
        this.LJJJLIIL = c1479510obV.LJJJLIIL;
        this.LJJLIIIJLJLI = c1479510obV.LJJLIIIJLJLI;
        this.LJJLIIIJLLLLLLLZ = c1479510obV.LJJLIIIJLLLLLLLZ;
        this.LJJLIIJ = c1479510obV.LJJLIIJ;
        this.LJJLIL = c1479510obV.LJJLIL;
        this.LJJZZIII = c1479510obV.LJJZZIII;
        this.LLIIL = c1479510obV.LLIIL;
        this.LLIILII = c1479510obV.LLIILII;
        this.LJJJJL = c1479510obV.LJJJJL;
        this.LJJJJLI = c1479510obV.LJJJJLI;
        this.LJLL = c1479510obV.LJLL;
        this.LLI = c1479510obV.LLI;
        this.LJJJJZ = c1479510obV.LJJJJZ;
        this.LJJJLL = c1479510obV.LJJJLL;
        this.LLFF = c1479510obV.LLFF;
        this.LLFZ = c1479510obV.LLFZ;
        this.LJJJLZIJ = c1479510obV.LJJJLZIJ;
        this.LLJILJILJ = c1479510obV.LLJILJILJ;
    }

    public C1479510obV(InterfaceC1479880oc6 interfaceC1479880oc6, InterfaceC1479880oc6 interfaceC1479880oc62, Context context, String str, boolean z, InterfaceC1479910oc9 interfaceC1479910oc9, boolean z2, int i, int i2, InterfaceC1479880oc6 interfaceC1479880oc63, String str2, boolean z3, boolean z4, int i3) {
        this.LJIIJJI = LLJLILLLLZIIL;
        this.LJIJJ = -1;
        Float fValueOf = Float.valueOf(Float.MIN_VALUE);
        this.LJJ = Float.MIN_VALUE;
        this.LJJII = -1;
        this.LJJIII = 1;
        this.LJJJLL = true;
        this.LJJLIIIJILLIZJL = Integer.MIN_VALUE;
        this.LJJLIIIJJI = true;
        this.LJJLIIIJL = 1.0f;
        this.LJJLJ = Float.valueOf(0.0f);
        this.LJJLJLI = fValueOf;
        this.LJJLL = fValueOf;
        this.LJJZ = null;
        this.LJJZZI = 0;
        this.LJJZZIII = -1;
        this.LJL = false;
        this.LJLI = false;
        this.LJLIIL = 0L;
        this.LJLJJI = null;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        this.LJLJL = false;
        this.LJLJLJ = -1;
        this.LJLJLLL = false;
        this.LJLL = 15;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LJLLL = 0;
        this.LJLLLL = null;
        this.LJLLLLLL = null;
        this.LJLZ = null;
        this.LJZ = -1;
        this.LJZL = -1;
        this.LL = -1;
        this.LLD = null;
        this.LLF = 0;
        this.LLFF = 0L;
        this.LLFFF = null;
        this.LLFII = null;
        this.LLFZ = false;
        this.LLI = false;
        this.LLIFFJFJJ = 0;
        this.LLII = 0;
        this.LLIIII = 0;
        this.LLIIIILZ = true;
        this.LLIIIJ = true;
        this.LLIIIL = false;
        this.LLIIIZ = false;
        this.LLIIJI = -1;
        this.LLIIJLIL = -1;
        this.LLIIL = false;
        this.LLIILII = "";
        this.LLIILZL = -1L;
        this.LLIIZ = "";
        this.LLILIL = "";
        this.LLJILLL = 0;
        this.LLJJ = -1.0f;
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = 0.0f;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
        this.LLJJJIL = false;
        this.LLJJJJ = true;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = new C1480070ocP();
        this.LIZLLL = interfaceC1479880oc6;
        this.LJI = interfaceC1479880oc62;
        this.LJIIIIZZ = context;
        this.LJIIIZ = str;
        this.LJIIJ = z;
        this.LJIIJJI = interfaceC1479910oc9;
        this.LJIIL = z2;
        this.LJIILIIL = i;
        this.LJIIZILJ = i2;
        this.LJJIIJ = interfaceC1479880oc63;
        this.LJJIIJZLJL = str2;
        this.LJJIJ = true;
        this.LJJIJIIJI = z3;
        this.LJJIJLIJ = z4;
        this.LJIJ = i3;
    }
}
