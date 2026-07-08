package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141310fo1 extends FrameLayout {
    public final InterfaceC2247071CxF LL;
    public long LLILLJJLI;
    public long LLILLL;
    public boolean LLILZ;
    public C1141100fng LLILZIL;
    public final C1141300fo0 LLILZLL;
    public final C1141410foB LLIZ;
    public final C01GW LLIZLLLIL;

    private final InterfaceC1141350fo5 getGiftPlayerLifecycleController() {
        return (InterfaceC1141350fo5) this.LLIZLLLIL.getValue();
    }

    private final float getFps() {
        return getGiftPlayerLifecycleController().getFps();
    }

    private final float getSourceFps() {
        return getGiftPlayerLifecycleController().LIZIZ();
    }

    public final void LIZJ() {
        if (getGiftPlayerLifecycleController() != null) {
            getGiftPlayerLifecycleController().stop();
            getGiftPlayerLifecycleController().release();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getGiftPlayerLifecycleController().release();
        C1141100fng c1141100fng = this.LLILZIL;
        InterfaceC1140870fnJ interfaceC1140870fnJ = c1141100fng != null ? c1141100fng.LIZIZ : null;
        this.LLILZIL = null;
        if (interfaceC1140870fnJ != null) {
            interfaceC1140870fnJ.LJI(EnumC1138990fkH.ALPHA_PLAYER, new C1141050fnb(-27, "page destroy", null));
        }
    }

    public final C1138610fjf LIZ(C1141460foG c1141460foG) throws JSONException {
        JSONObject jSONObjectPut;
        boolean z;
        boolean z2;
        C1138610fjf c1138610fjf = new C1138610fjf();
        Math.max(0L, C1141290fnz.LIZJ().currentTimeMillis() - this.LLILLJJLI);
        c1138610fjf.LIZJ = Math.max(0L, this.LLILLJJLI - this.LLILLL);
        c1138610fjf.LIZ = getFps();
        c1138610fjf.LIZLLL = getGiftPlayerLifecycleController().getPlayerType();
        c1138610fjf.LIZIZ = getSourceFps();
        if (c1141460foG != null) {
            jSONObjectPut = c1141460foG.LIZ;
        } else {
            jSONObjectPut = null;
        }
        int i = 0;
        if (jSONObjectPut == null) {
            jSONObjectPut = new JSONObject().put("is_super_resolution_enable", 0);
        }
        c1138610fjf.LJ = jSONObjectPut;
        if (c1141460foG != null) {
            z = c1141460foG.LIZIZ;
        } else {
            z = false;
        }
        c1138610fjf.LJFF = z;
        if (c1141460foG != null) {
            z2 = c1141460foG.LIZJ;
        } else {
            z2 = false;
        }
        c1138610fjf.LJI = z2;
        if (c1141460foG != null) {
            i = c1141460foG.LIZLLL;
        }
        c1138610fjf.LJII = i;
        return c1138610fjf;
    }

    public final void LIZIZ(Object obj) {
        C1141100fng c1141100fng = (C1141100fng) obj;
        InterfaceC1140870fnJ interfaceC1140870fnJ = c1141100fng.LIZIZ;
        EnumC1138990fkH enumC1138990fkH = EnumC1138990fkH.ALPHA_PLAYER;
        interfaceC1140870fnJ.LJII(enumC1138990fkH);
        this.LLILLL = C1141290fnz.LIZJ().currentTimeMillis();
        this.LLILZIL = c1141100fng;
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        this.LLILZ = false;
        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnable()) {
            getGiftPlayerLifecycleController().LIZ(c1141100fng, new AwS596S0100000_17(c1141100fng, 639));
            return;
        }
        C1141050fnb c1141050fnbLIZJ = getGiftPlayerLifecycleController().LIZJ(c1141100fng);
        if (c1141050fnbLIZJ == null) {
            return;
        }
        c1141100fng.LIZIZ.LJI(enumC1138990fkH, c1141050fnbLIZJ);
    }

    public C1141310fo1(Context context, InterfaceC2247071CxF interfaceC2247071CxF) {
        super(context);
        this.LL = interfaceC2247071CxF;
        this.LLILZLL = new C1141300fo0(this);
        this.LLIZ = C1141410foB.LIZ;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS418S0200000_17(context, this, 105));
        setLayoutDirection(0);
    }
}
