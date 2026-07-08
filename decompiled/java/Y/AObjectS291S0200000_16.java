package Y;

import X.C1017290cZz;
import X.C1055030dYr;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AObjectS291S0200000_16 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS291S0200000_16 aObjectS291S0200000_16) {
        MixActivityContainer mixActivityContainer = (MixActivityContainer) aObjectS291S0200000_16.l0;
        Runnable runnable = (Runnable) aObjectS291S0200000_16.l1;
        if (runnable != null) {
            mixActivityContainer.getClass();
            runnable.run();
            return null;
        }
        Runnable runnable2 = mixActivityContainer.LLIZLLLIL;
        if (runnable2 == null) {
            return null;
        }
        runnable2.run();
        return null;
    }

    public static final Object invoke$1(AObjectS291S0200000_16 aObjectS291S0200000_16) {
        JsAppDownloadMethod jsAppDownloadMethod = (JsAppDownloadMethod) aObjectS291S0200000_16.l0;
        Object obj = (Context) aObjectS291S0200000_16.l1;
        jsAppDownloadMethod.getClass();
        ((LifecycleOwner) obj).getLifecycle().addObserver(jsAppDownloadMethod);
        return null;
    }

    public static final Object invoke$2(AObjectS291S0200000_16 aObjectS291S0200000_16) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObjectS291S0200000_16.l0;
        Bundle bundle = (Bundle) aObjectS291S0200000_16.l1;
        if (profilePageFragment.LLJLILLLLZIIL != null) {
            if (bundle != null) {
                String string = bundle.getString("enter_from", "");
                if (!TextUtils.isEmpty(string)) {
                    profilePageFragment.LLJJJJ = string;
                    C1017290cZz.LIZIZ(string);
                    C1055030dYr c1055030dYr = profilePageFragment.LLJLILLLLZIIL;
                    String str = profilePageFragment.LLJJJJ;
                    c1055030dYr.LIZIZ = str;
                    C1017290cZz.LIZIZ(str);
                }
            }
            C1055030dYr c1055030dYr2 = profilePageFragment.LLJLILLLLZIIL;
            c1055030dYr2.LIZJ = true;
            c1055030dYr2.LJIIIIZZ = true;
            c1055030dYr2.LJIIIZ = bundle;
            c1055030dYr2.LIZLLL(true);
            return null;
        }
        return null;
    }

    public AObjectS291S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
