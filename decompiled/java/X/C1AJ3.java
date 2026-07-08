package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS224S0000000_33;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJ3 implements InterfaceC2177221AIu, InterfaceC1331910klR {
    public final String LL;
    public final String LLILLJJLI;
    public final C10LT LLILLL;
    public final InterfaceC1331910klR LLILZ;
    public final Function2<String, JSONObject, Unit> LLILZIL;
    public final C1AJ5 LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public EnumC325100Com LLJI;

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() throws JSONException {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("PerMonitor-Img", "loadBitmap img cancel");
        LIZIZ(2);
        InterfaceC1331910klR interfaceC1331910klR = this.LLILZ;
        if (interfaceC1331910klR != null) {
            interfaceC1331910klR.onCanceled();
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) throws JSONException {
        this.LLJ = true;
        LIZIZ(-1);
        InterfaceC1331910klR interfaceC1331910klR = this.LLILZ;
        if (interfaceC1331910klR != null) {
            interfaceC1331910klR.LIZ(bitmap);
        }
    }

    public final void LIZIZ(int i) throws JSONException {
        boolean z;
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        this.LLILZLL.stop();
        long jLIZIZ = C0XHY.LIZIZ(C0XHY.LIZ, this.LLILZLL.LIZ());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectPutOpt = jSONObject.put("enter_from", this.LL).put("ui_type", this.LLILLL.getTypeName()).put("load_type", EnumC19365110pV.LOAD_DATA.getTypeName()).put("tag", this.LLILLJJLI).put("load_time", jLIZIZ).put("is_succeed", C0XHY.LJFF(this.LLJ)).put("is_from_cache", C0XHY.LJFF(!((C1AJ4) this.LLIZLLLIL.getValue()).LL)).putOpt("hit_cdn_cache", ((C1AJ4) this.LLIZLLLIL.getValue()).LLILLJJLI);
        Long lValueOf = Long.valueOf(((C1AJ4) this.LLIZLLLIL.getValue()).LLILLL);
        if (lValueOf.longValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = null;
        if (!z) {
            lValueOf = null;
        }
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("file_size", lValueOf);
        Integer numValueOf2 = Integer.valueOf(i);
        if (numValueOf2.intValue() == -1) {
            numValueOf2 = null;
        }
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("fail_reason", numValueOf2);
        EnumC325100Com enumC325100Com = this.LLJI;
        if (enumC325100Com != null) {
            numValueOf = Integer.valueOf(C0XHY.LJ(enumC325100Com));
        }
        jSONObjectPutOpt3.putOpt("net_status", numValueOf);
        this.LLILZIL.invoke("relation_image_monitor", jSONObject);
    }

    public final void LIZJ(C1331670kl3 c1331670kl3) {
        if (this.LLIZ) {
            c1331670kl3.LJJII(this.LLILZ);
            return;
        }
        this.LLILZLL.start();
        this.LLJI = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        c1331670kl3.LJJJIL = (C1AJ4) this.LLIZLLLIL.getValue();
        c1331670kl3.LJJII(this);
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        this.LLJ = false;
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("PerMonitor-Img", "loadBitmap img fail", th);
        InterfaceC1331910klR interfaceC1331910klR = this.LLILZ;
        if (interfaceC1331910klR != null) {
            interfaceC1331910klR.onFailed(th);
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        InterfaceC1331910klR interfaceC1331910klR = this.LLILZ;
        if (interfaceC1331910klR != null) {
            interfaceC1331910klR.onProgress(f);
        }
    }

    public C1AJ3(String str, String str2, C10LT c10lt, InterfaceC1331910klR interfaceC1331910klR) {
        C20620815mY c20620815mY = new C20620815mY(C0XHY.LIZ);
        C1704320uS6 c1704320uS6 = new C1704320uS6(3);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c10lt;
        this.LLILZ = interfaceC1331910klR;
        this.LLILZIL = c20620815mY;
        this.LLILZLL = c1704320uS6;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(439));
    }
}
