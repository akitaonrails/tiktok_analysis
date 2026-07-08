package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.1B3W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B3W {
    public int errorCode;
    public String errorMsg;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public abstract int getType();

    public boolean isCancel() {
        return this.errorCode == -2;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }

    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_bytedance_params_error_code");
        this.errorMsg = bundle.getString("_bytedance_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("_bytedance_params_error_code", this.errorCode);
        C786410Ut5.LJJJI("_bytedance_params_error_msg", this.errorMsg, bundle);
        bundle.putInt("_bytedance_params_type", getType());
        C786410Ut5.LJJIIZI(bundle, this.extras, "_bytedance_params_extra");
    }
}
