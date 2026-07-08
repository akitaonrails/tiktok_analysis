package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC746830TRh implements IRouteAction {
    public static final C746840TRi Companion = new Object() { // from class: X.0TRi
    };
    public Bundle bundle;
    public final C01GW uri$delegate = C452501pT.LIZIZ(new AwS556S0100000_12(this, 16));
    public String url;

    public abstract boolean doAction(Context context, String str, Bundle bundle);

    private final Uri getUri() {
        return (Uri) this.uri$delegate.getValue();
    }

    private final boolean checkParamsValidity() {
        Iterator<String> it2 = getParamsList().iterator();
        while (it2.hasNext()) {
            String param = getParam(it2.next());
            if (param == null || param.length() == 0) {
                return false;
            }
        }
        return true;
    }

    public List<String> getParamsList() {
        return C13BV.INSTANCE;
    }

    public final String getParam(String str) {
        String string;
        Bundle bundle = this.bundle;
        if (bundle == null || (string = bundle.getString(str)) == null || string.length() == 0) {
            Uri uri = getUri();
            if (uri == null) {
                return null;
            }
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        }
        return string;
    }

    public final Serializable getParamSerializable(String str) {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getSerializable(str);
        }
        return null;
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        if (str != null && str.length() != 0) {
            this.url = str;
            this.bundle = bundle;
            if (!checkParamsValidity()) {
                return Boolean.FALSE;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            return Boolean.valueOf(doAction(context, str, bundle));
        }
        return Boolean.FALSE;
    }
}
