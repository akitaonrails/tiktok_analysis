package Y;

import X.C1446130njf;
import X.C1AF0;
import X.C1C7U;
import X.C7740030o;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEStickerHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS5S1101000_22 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.i2 == 41) {
            IBEStickerHandler iBEStickerHandler = (IBEStickerHandler) this.l1;
            String str = this.s0;
            iBEStickerHandler.getClass();
            if (str == null || str.length() == 0) {
                return;
            }
            C1446130njf c1446130njf = C1446130njf.LIZ;
            Effect effect = iBEStickerHandler.LLILZ;
            c1446130njf.getClass();
            String strLJFF = C1446130njf.LJFF(effect, "ibe_info");
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = null;
            if (strLJFF == null || strLJFF.length() == 0) {
                ShortVideoContext shortVideoContext = iBEStickerHandler.LLILLJJLI;
                if (shortVideoContext != null) {
                    shortVideoContext.creativeModel.commerceModel.getIbeContext().setMetadata(null);
                    return;
                }
                return;
            }
            InteractiveBrandedEffectInfo interactiveBrandedEffectInfo2 = (InteractiveBrandedEffectInfo) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strLJFF, InteractiveBrandedEffectInfo.class);
            ShortVideoContext shortVideoContext2 = iBEStickerHandler.LLILLJJLI;
            if (shortVideoContext2 != null) {
                IBEContext ibeContext = shortVideoContext2.creativeModel.commerceModel.getIbeContext();
                if (interactiveBrandedEffectInfo2 != null) {
                    Effect effect2 = iBEStickerHandler.LLILZ;
                    interactiveBrandedEffectInfo2.setStickerId(effect2 != null ? effect2.getEffectId() : null);
                    interactiveBrandedEffectInfo2.setPropData(new JSONObject(str).optString("data", null));
                    interactiveBrandedEffectInfo2.setBrandExtra(strLJFF);
                    interactiveBrandedEffectInfo = interactiveBrandedEffectInfo2;
                } else {
                    C1AF0.LIZIZ();
                }
                ibeContext.setMetadata(interactiveBrandedEffectInfo);
            }
        }
    }

    public static final void run$0(ARunnableS5S1101000_22 aRunnableS5S1101000_22) {
        boolean zLIZ;
        C1C7U.LIZ("IBEStickerHandler@28c9.onMessageReceived$1");
        try {
            aRunnableS5S1101000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IBEStickerHandler@28c9.onMessageReceived$1");
    }

    public static final void run$1(ARunnableS5S1101000_22 aRunnableS5S1101000_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchResource$taskId$singleCallback$1$onFailure$1");
        try {
            NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aRunnableS5S1101000_22.l1;
            if (nLEResourceCallback != null) {
                nLEResourceCallback.onError(aRunnableS5S1101000_22.i2, aRunnableS5S1101000_22.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchResource$taskId$singleCallback$1$onFailure$1");
    }

    public static final void run$2(ARunnableS5S1101000_22 aRunnableS5S1101000_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$1$onFail$1");
        try {
            NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aRunnableS5S1101000_22.l1;
            if (nLEResourceCallback != null) {
                nLEResourceCallback.onError(aRunnableS5S1101000_22.i2, aRunnableS5S1101000_22.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$1$onFail$1");
    }

    public static final void run$3(ARunnableS5S1101000_22 aRunnableS5S1101000_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$2$onFailure$1");
        try {
            NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aRunnableS5S1101000_22.l1;
            if (nLEResourceCallback != null) {
                nLEResourceCallback.onError(aRunnableS5S1101000_22.i2, aRunnableS5S1101000_22.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$2$onFailure$1");
    }

    public static final void run$4(ARunnableS5S1101000_22 aRunnableS5S1101000_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$3$onFailure$1");
        try {
            NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aRunnableS5S1101000_22.l1;
            if (nLEResourceCallback != null) {
                nLEResourceCallback.onError(aRunnableS5S1101000_22.i2, aRunnableS5S1101000_22.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$3$onFailure$1");
    }

    public ARunnableS5S1101000_22(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
