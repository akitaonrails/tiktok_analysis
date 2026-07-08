package X;

import android.content.Context;
import android.view.View;
import com.tiktok.ttf.applog.init.IAppLogDebugService;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211941Bhg implements IAppLogDebugService {
    public static final C2211941Bhg LIZ = new C2211941Bhg();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(314));

    public static IAppLogDebugService LJI() {
        return (IAppLogDebugService) LIZIZ.getValue();
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final boolean LIZ() {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            return iAppLogDebugServiceLJI.LIZ();
        }
        return false;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void LIZIZ() {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            iAppLogDebugServiceLJI.LIZIZ();
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final boolean LIZJ() {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            return iAppLogDebugServiceLJI.LIZJ();
        }
        return false;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final boolean LIZLLL() {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            return iAppLogDebugServiceLJI.LIZLLL();
        }
        return false;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final String getMockChannel() {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            return iAppLogDebugServiceLJI.getMockChannel();
        }
        return null;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final String getPPELane() {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            return iAppLogDebugServiceLJI.getPPELane();
        }
        return null;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void LJFF(Context context) {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            iAppLogDebugServiceLJI.LJFF(context);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void addDebugInfo(Map<String, String> map) {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            iAppLogDebugServiceLJI.addDebugInfo(map);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void injectViewListener(View view) {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            iAppLogDebugServiceLJI.injectViewListener(view);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void addDebugInfo(JSONObject jSONObject) {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            iAppLogDebugServiceLJI.addDebugInfo(jSONObject);
        }
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogDebugService
    public final void LJ(String str, String str2, String str3) {
        IAppLogDebugService iAppLogDebugServiceLJI = LJI();
        if (iAppLogDebugServiceLJI != null) {
            iAppLogDebugServiceLJI.LJ(str, str2, str3);
        }
    }
}
