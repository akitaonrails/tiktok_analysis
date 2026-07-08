package Y;

import X.AbstractC848400XPy;
import X.C08JS;
import X.C09N1;
import X.C09NT;
import X.C0VSV;
import X.C0XQ7;
import X.C118300cf;
import X.C1308910kAL;
import X.C1637890six;
import X.C19EG;
import X.C1C7U;
import X.C204674156y;
import X.C20669087v;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2439109h7;
import X.C259800zU;
import X.C543670LTx;
import X.C574790MgX;
import X.C805380Via;
import X.C844470XAv;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.ttf.network.task.NetworkInitTask;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS237S0200000_3 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS237S0200000_3 aCallableS237S0200000_3) {
        double dDoubleValue;
        C1C7U.LIZ("UpvotePublishCache@8acd.handleFailed3TimesItems$1");
        C20669087v.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C20669087v.LIZJ());
        List list = (List) aCallableS237S0200000_3.l0;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove(it2.next());
            }
        }
        C20669087v c20669087v = C20669087v.LIZ;
        List<String> list2 = (List) aCallableS237S0200000_3.l1;
        c20669087v.getClass();
        if (list2 != null && !list2.isEmpty()) {
            for (String str : list2) {
                Double d = (Double) linkedHashMap.get(str);
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                double d2 = dDoubleValue + 1.0d;
                if (d2 < 3.0d) {
                    linkedHashMap.put(str, Double.valueOf(d2));
                } else {
                    linkedHashMap.remove(str);
                    C20669087v.LIZ.getClass();
                    C20669087v.LIZ(str);
                }
            }
        }
        Keva repo = Keva.getRepo("upvote_publish_cache");
        C20669087v.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upvote_publish_failed_3_times_");
        sbLIZ.append(curUserId);
        repo.storeString(C2188811AlT.LIZIZ(sbLIZ), C08JS.LIZLLL(linkedHashMap));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UpvotePublishCache@8acd.handleFailed3TimesItems$1");
        return unit;
    }

    public static final Object call$1(ACallableS237S0200000_3 aCallableS237S0200000_3) throws JSONException {
        C1C7U.LIZ("LocalVideoLegalChecker@3c01.getVideoFileInfo$1");
        int[] iArr = new int[10];
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iLIZIZ = C574790MgX.LIZIZ(((MediaModel) aCallableS237S0200000_3.l0).LJFF(), iArr);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (int) (jCurrentTimeMillis2 - jCurrentTimeMillis));
        C1637890six.LIZJ("ve_get_video_info_consume_monitor", jSONObject, new C543670LTx().LJ());
        if (iLIZIZ == 0) {
            MediaModel mediaModel = (MediaModel) aCallableS237S0200000_3.l0;
            mediaModel.width = iArr[0];
            mediaModel.height = iArr[1];
            ((C118300cf) aCallableS237S0200000_3.l1).element = iArr[8];
        }
        Integer numValueOf = Integer.valueOf(iLIZIZ);
        C1C7U.LIZIZ("LocalVideoLegalChecker@3c01.getVideoFileInfo$1");
        return numValueOf;
    }

    public static final Object call$10(ACallableS237S0200000_3 aCallableS237S0200000_3) {
        C1C7U.LIZ("NetworkInitTask@8afe.setDefaultRxErrorHandler$2");
        NetworkInitTask networkInitTask = (NetworkInitTask) aCallableS237S0200000_3.l0;
        Throwable th = (Throwable) aCallableS237S0200000_3.l1;
        networkInitTask.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RxJavaPlugins.setErrorHandler failed!");
        sbLIZ.append(' ');
        sbLIZ.append(th.getMessage());
        C805380Via.LIZJ(th, C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetworkInitTask@8afe.setDefaultRxErrorHandler$2");
        return unit;
    }

    public static final Object call$2(ACallableS237S0200000_3 aCallableS237S0200000_3) {
        C1C7U.LIZ("AwemeDraftExtension@e329.loadVideoCover$1$1");
        ((IEffectService.OnVideoCoverCallback) aCallableS237S0200000_3.l0).onGetVideoCoverSuccess((Bitmap) aCallableS237S0200000_3.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeDraftExtension@e329.loadVideoCover$1$1");
        return unit;
    }

    public static final Object call$3(ACallableS237S0200000_3 aCallableS237S0200000_3) {
        boolean z;
        int iIntValue;
        Integer numLIZIZ;
        C1C7U.LIZ("ChooseMusicSelectView@c554.updateBackgroundColor$1");
        C19EG c19eg = null;
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7((Bitmap) aCallableS237S0200000_3.l0, null));
        C19EG c19eg2 = ((ChooseMusicSelectView) aCallableS237S0200000_3.l1).LLJILJILJ;
        if (c19eg2 != null) {
            c19eg = c19eg2;
        }
        Integer numLIZ = C1308910kAL.LIZ(R.attr.g0d, c19eg);
        if (numLIZ != null && numLIZ.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            c204674156yLIZ.LJFF(10.0f);
            c204674156yLIZ.LJI(10.0f);
            c204674156yLIZ.LJ(0.001f, 0.018f, 0.93f, 0.95f, 0.0f);
        } else {
            c204674156yLIZ.LJFF(0.0f);
            c204674156yLIZ.LJI(10.0f);
            c204674156yLIZ.LJ(0.001f, 0.035f, 0.36f, 0.38f, 0.0f);
        }
        if (c204674156yLIZ.LIZLLL >= 0 && (numLIZIZ = c204674156yLIZ.LIZIZ()) != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = R.attr.e4;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        C1C7U.LIZIZ("ChooseMusicSelectView@c554.updateBackgroundColor$1");
        return numValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$4(ACallableS237S0200000_3 aCallableS237S0200000_3) throws Throwable {
        Unit unit;
        C1C7U.LIZ("DownloadFileMethod@acf9.copyImageToGallery$1");
        try {
            C844470XAv.LIZ.getClass();
            ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(C844470XAv.LIZ().getContentResolver(), (Uri) ((C259800zU) aCallableS237S0200000_3.l0).element, "w");
            if (parcelFileDescriptorLIZLLL != null) {
                C09N1.LIZJ((File) aCallableS237S0200000_3.l1, new C0VSV(parcelFileDescriptorLIZLLL.getFileDescriptor()));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("DownloadFileMethod@acf9.copyImageToGallery$1");
        return unit;
    }

    public static final Object call$5(ACallableS237S0200000_3 aCallableS237S0200000_3) {
        C1C7U.LIZ("RheaTraceUploadTask@8a30.uploadATrace$1");
        try {
            RheaTraceUploadTask rheaTraceUploadTask = (RheaTraceUploadTask) aCallableS237S0200000_3.l0;
            File file = (File) aCallableS237S0200000_3.l1;
            rheaTraceUploadTask.getClass();
            RheaTraceUploadTask.LJ(file, "_atrace");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RheaTraceUploadTask@8a30.uploadATrace$1");
        return unit;
    }

    public static final Object call$6(ACallableS237S0200000_3 aCallableS237S0200000_3) {
        C1C7U.LIZ("RheaTraceUploadTask@8a30.uploadFakeTrace$1");
        try {
            RheaTraceUploadTask rheaTraceUploadTask = (RheaTraceUploadTask) aCallableS237S0200000_3.l0;
            File file = (File) aCallableS237S0200000_3.l1;
            rheaTraceUploadTask.getClass();
            RheaTraceUploadTask.LJ(file, "_fake_trace");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RheaTraceUploadTask@8a30.uploadFakeTrace$1");
        return unit;
    }

    public static final Object call$7(ACallableS237S0200000_3 aCallableS237S0200000_3) {
        C1C7U.LIZ("PumbaaTask@7275.initCustomBPEA$4$onError$1");
        C805380Via.LIZLLL((Throwable) aCallableS237S0200000_3.l1, "BPEA_carrier_cache_error", C2097908Jt.LIZJ(new Pair("key", String.valueOf(aCallableS237S0200000_3.l0))));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PumbaaTask@7275.initCustomBPEA$4$onError$1");
        return unit;
    }

    public static final Object call$8(ACallableS237S0200000_3 aCallableS237S0200000_3) {
        C1C7U.LIZ("NetworkInitTask@431c.setDefaultRxErrorHandler$2");
        ((com.ss.android.ugc.aweme.net.NetworkInitTask) aCallableS237S0200000_3.l0).LIZ("RxJavaPlugins.setErrorHandler failed!", (Throwable) aCallableS237S0200000_3.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetworkInitTask@431c.setDefaultRxErrorHandler$2");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$9(ACallableS237S0200000_3 aCallableS237S0200000_3) throws Throwable {
        Unit unit;
        C1C7U.LIZ("ImageSaveAction@86a6.copyImageToGallery$1");
        try {
            C844470XAv.LIZ.getClass();
            ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(C844470XAv.LIZ().getContentResolver(), (Uri) ((C259800zU) aCallableS237S0200000_3.l0).element, "w");
            if (parcelFileDescriptorLIZLLL != null) {
                C09N1.LIZJ((File) aCallableS237S0200000_3.l1, new C0VSV(parcelFileDescriptorLIZLLL.getFileDescriptor()));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("ImageSaveAction@86a6.copyImageToGallery$1");
        return unit;
    }

    public ACallableS237S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
