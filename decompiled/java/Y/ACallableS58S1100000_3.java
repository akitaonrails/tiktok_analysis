package Y;

import X.C0VSJ;
import X.C1018150cbN;
import X.C1445960njO;
import X.C1C7U;
import X.C20684815ws;
import X.C2112608Pk;
import X.C214848196g;
import X.C2188811AlT;
import X.C2400409as;
import X.C2471909mP;
import X.C786410Ut5;
import X.InterfaceC2401609b4;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS58S1100000_3 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS58S1100000_3 aCallableS58S1100000_3) {
        C1018150cbN c1018150cbN = (C1018150cbN) aCallableS58S1100000_3.l1;
        String str = aCallableS58S1100000_3.s0;
        c1018150cbN.getClass();
        C1C7U.LIZ("TopViewPreloadManager@b174.getMapInBackground$1L");
        C1018150cbN.LIZJ.LIZLLL(str);
        C1C7U.LIZIZ("TopViewPreloadManager@b174.getMapInBackground$1L");
        return null;
    }

    public static final Object call$1(ACallableS58S1100000_3 aCallableS58S1100000_3) {
        EffectTextModel effectTextModel;
        Bitmap bitmapMergeCoverText;
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$3");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(aCallableS58S1100000_3.s0);
        CoverPublishModel coverPublishModel = ((C214848196g) aCallableS58S1100000_3.l1).LIZ.getCoverPublishModel();
        if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapDecodeFile)) != null) {
            bitmapDecodeFile = bitmapMergeCoverText;
        }
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverAfterBackFromAlbum$3");
        return bitmapDecodeFile;
    }

    public static final Object call$2(ACallableS58S1100000_3 aCallableS58S1100000_3) {
        C1C7U.LIZ("MentionEventTrackingExtKt@bd7d.sendEventTrackingAsyncWithSocialInfo$4");
        C20684815ws.LJIJ(aCallableS58S1100000_3.s0, (JSONObject) aCallableS58S1100000_3.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionEventTrackingExtKt@bd7d.sendEventTrackingAsyncWithSocialInfo$4");
        return unit;
    }

    public static final Object call$3(ACallableS58S1100000_3 aCallableS58S1100000_3) {
        C1445960njO c1445960njO = (C1445960njO) aCallableS58S1100000_3.l1;
        String str = aCallableS58S1100000_3.s0;
        c1445960njO.getClass();
        C1C7U.LIZ("AwemePublishCallback@8484.addLocalVideoCache$1L");
        if (C2112608Pk.LJ(str) && new C0VSJ(str).length() > 0) {
            Boolean boolValueOf = Boolean.valueOf(((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().checkIfCache(str));
            C1C7U.LIZIZ("AwemePublishCallback@8484.addLocalVideoCache$1L");
            return boolValueOf;
        }
        Boolean bool = Boolean.FALSE;
        C1C7U.LIZIZ("AwemePublishCallback@8484.addLocalVideoCache$1L");
        return bool;
    }

    public static final Object call$4(ACallableS58S1100000_3 aCallableS58S1100000_3) {
        C1C7U.LIZ("EventTrackingExtKt@9b4f.sendEventTrackingAsync$3$1");
        C20684815ws.LJIJ(aCallableS58S1100000_3.s0, (JSONObject) aCallableS58S1100000_3.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EventTrackingExtKt@9b4f.sendEventTrackingAsync$3$1");
        return unit;
    }

    public static final Object call$5(ACallableS58S1100000_3 aCallableS58S1100000_3) {
        boolean zLJIIIZ;
        C1C7U.LIZ("FileAdapterUtils@6392.isMediaUriExist$3");
        try {
            zLJIIIZ = C2400409as.LJIIIZ(C2471909mP.LIZ.LJII(), (Uri) aCallableS58S1100000_3.l1);
            C2471909mP.LJIIJ.put(aCallableS58S1100000_3.s0, Boolean.valueOf(zLJIIIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2471909mP.LIZ.getClass();
            InterfaceC2401609b4 interfaceC2401609b4 = C2471909mP.LIZLLL;
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path:");
                sbLIZ.append(aCallableS58S1100000_3.s0);
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(e));
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC2401609b4.LIZIZ();
            }
            InterfaceC2401609b4 interfaceC2401609b42 = C2471909mP.LIZLLL;
            if (interfaceC2401609b42 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("path:");
                sbLIZ2.append(aCallableS58S1100000_3.s0);
                sbLIZ2.append(", ");
                sbLIZ2.append(Log.getStackTraceString(e));
                interfaceC2401609b42.LIZ(9, C2188811AlT.LIZIZ(sbLIZ2));
            }
            zLJIIIZ = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zLJIIIZ);
        C1C7U.LIZIZ("FileAdapterUtils@6392.isMediaUriExist$3");
        return boolValueOf;
    }

    public static final Object call$6(ACallableS58S1100000_3 aCallableS58S1100000_3) {
        C1C7U.LIZ("DMTJsBridge@4b83.setup$4$onRejected$2");
        C786410Ut5.re(Toast.makeText(((WebView) aCallableS58S1100000_3.l1).getContext(), aCallableS58S1100000_3.s0, 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMTJsBridge@4b83.setup$4$onRejected$2");
        return unit;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACallableS58S1100000_3(org.json.JSONObject r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            int r4 = 2 - r4
            if (r4 == 0) goto L11
            r1 = r2
            java.lang.String r0 = "stay_time"
            r1.s0 = r0
            r1.l1 = r3
        Ld:
            r1.<init>()
            return
        L11:
            r1 = r2
            java.lang.String r0 = "add_video_at"
            r1.s0 = r0
            r1.l1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS58S1100000_3.<init>(org.json.JSONObject, int):void");
    }

    public ACallableS58S1100000_3(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
