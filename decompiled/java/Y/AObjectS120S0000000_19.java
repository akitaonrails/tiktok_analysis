package Y;

import X.C06W2;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS120S0000000_19 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public AObjectS120S0000000_19(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS120S0000000_19 aObjectS120S0000000_19, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        c06w2.Dw2(new AObjectS71S0000000_19(1));
        c06w2.Dw2(new AObjectS71S0000000_19(2));
        return null;
    }

    public static final Object invoke$1(AObjectS120S0000000_19 aObjectS120S0000000_19, Object obj) {
        boolean z;
        if (((BaseResponse) obj).data != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
