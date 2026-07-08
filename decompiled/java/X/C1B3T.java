package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.1B3T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B3T {
    public String callerLocalEntry;
    public String callerPackage;
    public String callerVersion;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public abstract int getType();

    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    public String getCallerPackage() {
        return this.callerPackage;
    }

    public String getCallerVersion() {
        return this.callerVersion;
    }

    public void fromBundle(Bundle bundle) {
        this.callerPackage = bundle.getString("_bytedance_params_type_caller_package");
        this.callerVersion = bundle.getString("__bytedance_base_caller_version");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.callerLocalEntry = bundle.getString("_bytedance_params_from_entry");
    }

    public void toBundle(Bundle bundle) {
        C786410Ut5.LJJJI("_bytedance_params_type_caller_package", this.callerPackage, bundle);
        C786410Ut5.LJJJI("__bytedance_base_caller_version", this.callerVersion, bundle);
        bundle.putInt("_bytedance_params_type", getType());
        C786410Ut5.LJJIIZI(bundle, this.extras, "_bytedance_params_extra");
        C786410Ut5.LJJJI("_bytedance_params_from_entry", this.callerLocalEntry, bundle);
    }
}
