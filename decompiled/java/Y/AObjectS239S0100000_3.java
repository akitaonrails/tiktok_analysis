package Y;

import X.C094D;
import X.C09FY;
import X.C0CHQ;
import X.C113E;
import X.C11Y7;
import X.C12WG;
import X.C13BV;
import X.C13LP;
import X.C1441190nbh;
import X.C23250099c;
import X.C2381609Uw;
import X.InterfaceC1441305kZ;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.model.EffectMessageModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.gamora.recorder.control.h;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS239S0100000_3 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
        }
    }

    public AObjectS239S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS239S0100000_3 aObjectS239S0100000_3, Object obj) {
        ((C094D) aObjectS239S0100000_3.l0).LJIIIIZZ(obj);
    }

    public static final void onChanged$1(AObjectS239S0100000_3 aObjectS239S0100000_3, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C11Y7) aObjectS239S0100000_3.l0).P8();
        }
    }

    public static final void onChanged$2(AObjectS239S0100000_3 aObjectS239S0100000_3, Object obj) {
        if (C0CHQ.LIZ().LJJIIZI().LJJJI(true)) {
            C12WG.LIZJ((h) aObjectS239S0100000_3.l0, new Runnable() { // from class: X.092z
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FullHorizontalCarrouselRecordDockBarScene@605b.unlockCommerceStickerEvent$1$1");
                    try {
                        C0CHQ.LIZ().LJJIIZI().LJIIIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.unlockCommerceStickerEvent$1$1");
                }
            });
        }
    }

    public static final void onChanged$3(AObjectS239S0100000_3 aObjectS239S0100000_3, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((C113E) aObjectS239S0100000_3.l0).LLIZLLLIL), null, null, new C2381609Uw((C113E) aObjectS239S0100000_3.l0, null), 3);
    }

    public static final void onChanged$4(AObjectS239S0100000_3 aObjectS239S0100000_3, Object obj) {
        EffectMessageModel effectMessageModel = ((C09FY) aObjectS239S0100000_3.l0).LLILLJJLI.creativeModel.recordEffectModel.effectMessageModel;
        effectMessageModel.setEffectMessages(C13LP.LJJJJJ(1, effectMessageModel.getEffectMessages()));
    }

    public static final void onChanged$5(AObjectS239S0100000_3 aObjectS239S0100000_3, Object obj) {
        ((C09FY) aObjectS239S0100000_3.l0).LLILLJJLI.creativeModel.recordEffectModel.effectMessageModel.setEffectMessages(C13BV.INSTANCE);
    }

    public static final void onChanged$6(AObjectS239S0100000_3 aObjectS239S0100000_3, Object obj) {
        TimeSpeedModelExtension timeSpeedModelExtension;
        C09FY c09fy = (C09FY) aObjectS239S0100000_3.l0;
        String str = c09fy.LLIZLLLIL;
        c09fy.LLIZ.clear();
        if (str != null) {
            C1441190nbh c1441190nbhLIZIZ = ((C09FY) aObjectS239S0100000_3.l0).LLILLJJLI.cameraComponentModel.LIZIZ();
            if (!c1441190nbhLIZIZ.isEmpty() && (timeSpeedModelExtension = c1441190nbhLIZIZ.get(c1441190nbhLIZIZ.size() - 1)) != null) {
                timeSpeedModelExtension.effectMessage = str;
            }
        }
        ((C09FY) aObjectS239S0100000_3.l0).LLIZLLLIL = null;
    }
}
