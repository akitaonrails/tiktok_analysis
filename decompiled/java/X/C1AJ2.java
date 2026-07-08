package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJ2 implements InterfaceC2177221AIu, InterfaceC427850Gq7 {
    public static final ConcurrentHashMap<Integer, C1AJ2> LLJILJIL = new ConcurrentHashMap<>();
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final C10LT LLILZ;
    public final Function2<String, JSONObject, Unit> LLILZIL;
    public final C1AJ5 LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public EnumC325100Com LLJIJIL;

    public C1AJ2() {
        throw null;
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
    }

    public final void LIZ(int i) throws JSONException {
        boolean z;
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        this.LLILZLL.stop();
        long jLIZIZ = C0XHY.LIZIZ(C0XHY.LIZ, this.LLILZLL.LIZ());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectPut = jSONObject.put("enter_from", this.LL).put("ui_type", this.LLILZ.getTypeName()).put("load_type", EnumC19365110pV.DISPLAY.getTypeName()).put("tag", this.LLILLJJLI).put("load_time", jLIZIZ).put("is_succeed", C0XHY.LJFF(this.LLJ)).put("is_from_cache", C0XHY.LJFF(!((C1AJ4) this.LLIZLLLIL.getValue()).LL)).putOpt("hit_cdn_cache", ((C1AJ4) this.LLIZLLLIL.getValue()).LLILLJJLI).put("is_ready", C0XHY.LJFF(!this.LLJI));
        Integer numValueOf = Integer.valueOf(this.LLILLL);
        if (numValueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf2 = null;
        if (!z) {
            numValueOf = null;
        }
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("position", numValueOf);
        Long lValueOf = Long.valueOf(((C1AJ4) this.LLIZLLLIL.getValue()).LLILLL);
        if (lValueOf.longValue() == -1) {
            lValueOf = null;
        }
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("file_size", lValueOf);
        Integer numValueOf3 = Integer.valueOf(i);
        if (numValueOf3.intValue() == -1) {
            numValueOf3 = null;
        }
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("fail_reason", numValueOf3);
        EnumC325100Com enumC325100Com = this.LLJIJIL;
        if (enumC325100Com != null) {
            numValueOf2 = Integer.valueOf(C0XHY.LJ(enumC325100Com));
        }
        jSONObjectPutOpt3.putOpt("net_status", numValueOf2);
        this.LLILZIL.invoke("relation_image_monitor", jSONObject);
    }

    public final void LIZIZ(C1331670kl3 c1331670kl3) {
        if (this.LLIZ) {
            if (Intrinsics.LJFF(this.LL, "notification_page")) {
                C1600630rkr.LIZIZ(c1331670kl3, null, "RelationImgDisplayMonImpl");
                return;
            } else {
                C1074490e4F.LIZ(c1331670kl3, null, this.LL);
                return;
            }
        }
        this.LLILZLL.start();
        this.LLJIJIL = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        InterfaceC658750Psf interfaceC658750Psf = (C1AJ4) this.LLIZLLLIL.getValue();
        if (C1890720zIk.LIZ().enable) {
            if (interfaceC658750Psf == null) {
                interfaceC658750Psf = c1331670kl3.LJJJIL;
            }
            c1331670kl3.LJJJIL = new C1890810zIt(interfaceC658750Psf);
        }
        if (Intrinsics.LJFF(this.LL, "notification_page")) {
            C1600630rkr.LIZIZ(c1331670kl3, this, "RelationImgDisplayMonImpl");
        } else {
            C1074490e4F.LIZ(c1331670kl3, this, this.LL);
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) throws JSONException {
        if (view != null) {
            int iHashCode = view.hashCode();
            ConcurrentHashMap<Integer, C1AJ2> concurrentHashMap = LLJILJIL;
            C1AJ2 c1aj2Remove = concurrentHashMap.remove(Integer.valueOf(iHashCode));
            if (c1aj2Remove != null) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("view(");
                sbLIZ.append(view.hashCode());
                sbLIZ.append(" recycler");
                C1720106oR.LJI("PerMonitor-Img", C2188811AlT.LIZIZ(sbLIZ));
                c1aj2Remove.LIZ(1);
            }
            concurrentHashMap.put(Integer.valueOf(iHashCode), this);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2189571Amh(this, 3));
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) throws JSONException {
        int iHashCode;
        this.LLJ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("view(");
        if (view != null) {
            iHashCode = view.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append(") load img fail");
        C1720106oR.LIZIZ("PerMonitor-Img", C2188811AlT.LIZIZ(sbLIZ), th);
        if (view != null) {
            LLJILJIL.remove(Integer.valueOf(view.hashCode()));
        }
        LIZ(0);
    }

    public C1AJ2(String str, String str2, int i, C10LT c10lt) {
        C20620715mX c20620715mX = new C20620715mX(C0XHY.LIZ);
        C1704320uS6 c1704320uS6 = new C1704320uS6(3);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = c10lt;
        this.LLILZIL = c20620715mX;
        this.LLILZLL = c1704320uS6;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(438));
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) throws JSONException {
        int iHashCode;
        this.LLJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("view(");
        if (view != null) {
            iHashCode = view.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append("), load success!");
        C2188811AlT.LIZIZ(sbLIZ);
        if (view != null) {
            LLJILJIL.remove(Integer.valueOf(view.hashCode()));
        }
        LIZ(-1);
    }
}
