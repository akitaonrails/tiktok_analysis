package X;

import Y.AObjectS246S0100000_25;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bef.effectsdk.view.BEFView$Builder;
import com.bef.effectsdk.view.BEFView$FitMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;
import nv7.c0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tJX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660570tJX extends AbstractC2255721DQs<InterfaceC1646750sxF> implements InterfaceC1646750sxF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public C1DDM LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final C19EG LLILZIL = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 648));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1660570tJX.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1660570tJX.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZLLLIL = 8;
    }

    public InterfaceC1646750sxF Z1() {
        return this;
    }

    private final void H2() {
        C1DDM c1ddm = this.LLILLJJLI;
        if (c1ddm != null) {
            c1ddm.onPause();
            C786410Ut5.LJJJZ(c1ddm, o2());
            c1ddm.onDestroy();
        }
        this.LLILLJJLI = null;
    }

    private final FrameLayout o2() {
        return (FrameLayout) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC1646750sxF
    public InterfaceC1650230t2r getCameraApi() {
        return (InterfaceC1650230t2r) this.LLILLL.getValue(this, LLIZ[0]);
    }

    @Override // X.InterfaceC1646750sxF
    public q getStickerApi() {
        return (q) this.LLILZ.getValue(this, LLIZ[1]);
    }

    public final void W2() {
        long jXV1 = getCameraApi().xV1();
        C1DDM c1ddm = this.LLILLJJLI;
        if (c1ddm != null) {
            c1ddm.attachEffect(jXV1);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getCameraApi().yj1().LIZ(this, new AObjectS246S0100000_25(this, 601));
        getStickerApi().C0().LJII().LJIJJLI().observe(this, new AObjectS246S0100000_25(this, 602));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C1DDM c1ddm = this.LLILLJJLI;
        if (c1ddm != null) {
            c1ddm.onPause();
            C786410Ut5.LJJJZ(c1ddm, o2());
            c1ddm.onDestroy();
        }
        this.LLILLJJLI = null;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C1DDM c1ddm = this.LLILLJJLI;
        if (c1ddm != null) {
            c1ddm.onPause();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C1DDM c1ddm = this.LLILLJJLI;
        if (c1ddm != null) {
            c1ddm.onResume();
        }
        W2();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1660570tJX(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void T2(Effect effect) {
        C1DDM c1ddm = this.LLILLJJLI;
        if (c1ddm != null) {
            c1ddm.setStickerPath("");
        }
        H2();
        if (effect == null) {
            return;
        }
        try {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
            if (jSONObjectLJIIIZ == null) {
                jSONObjectLJIIIZ = new JSONObject();
            }
            String strOptString = jSONObjectLJIIIZ.optString("befViewResRoot");
            if (!TextUtils.isEmpty(strOptString)) {
                W1(jSONObjectLJIIIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effect.getUnzipPath());
                sbLIZ.append(File.separator);
                sbLIZ.append(strOptString);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1DDM c1ddm2 = this.LLILLJJLI;
                if (c1ddm2 != null) {
                    c1ddm2.setStickerPath(strLIZIZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJ("fail to get sticker support resource path from sticker.sdkExtra");
        }
    }

    private final void W1(JSONObject jSONObject) {
        G2(this.LLILZIL, jSONObject);
        o2().addView(this.LLILLJJLI);
        c0.LIZ.q2(576, 1024, this.LLILLJJLI);
    }

    private final BEFView$FitMode X1(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return BEFView$FitMode.NO_CLIP;
                    }
                    return BEFView$FitMode.FIT_WIDTH_BOTTOM;
                }
                return BEFView$FitMode.FILL_SCREEN;
            }
            return BEFView$FitMode.FIT_HEIGHT;
        }
        return BEFView$FitMode.FIT_WIDTH;
    }

    public final void w2(Effect effect) {
        T2(effect);
    }

    private final void G2(Context context, JSONObject jSONObject) {
        double dOptDouble = jSONObject.optDouble("befViewRenderFPS");
        int iOptInt = jSONObject.optInt("befViewFitMode", -1);
        int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize();
        if (recordVideoSize == null) {
            recordVideoSize = null;
        }
        BEFView$Builder bEFView$BuilderObtain = BEFView$Builder.obtain();
        if (recordVideoSize != null && recordVideoSize.length >= 2) {
            bEFView$BuilderObtain.setRenderSize(recordVideoSize[0], recordVideoSize[1]);
        }
        if (!Double.isNaN(dOptDouble)) {
            bEFView$BuilderObtain.setFPS(dOptDouble);
        }
        if (X1(iOptInt) != null) {
            bEFView$BuilderObtain.setFitMode(X1(iOptInt));
        }
        C1DDM c1ddmBuild = bEFView$BuilderObtain.build(context);
        this.LLILLJJLI = c1ddmBuild;
        if (c1ddmBuild != null) {
            c1ddmBuild.setOpaque(false);
        }
        W2();
    }
}
