package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.1B3S, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3S extends C1B3T {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF = "opensdk";
    public int LJI = -1;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    @Override // X.C1B3T
    public final int getType() {
        return 1;
    }

    public C1B3S() {
    }

    public C1B3S(Bundle bundle) {
        fromBundle(bundle);
    }

    @Override // X.C1B3T
    public final void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.LIZ = bundle.getString("_bytedance_params_state");
        this.LIZJ = bundle.getString("_bytedance_params_client_key");
        this.LIZLLL = bundle.getString("_bytedance_params_client_secret");
        this.LIZIZ = bundle.getString("_bytedance_params_redirect_uri");
        this.LJ = bundle.getString("_bytedance_params_next_url");
        this.LJII = bundle.getString("_bytedance_params_scope");
        this.LJIIIIZZ = bundle.getString("_bytedance_params_optional_scope0");
        this.LJIIIZ = bundle.getString("_bytedance_params_optional_scope1");
        this.LJI = bundle.getInt("wap_requested_orientation", -1);
        this.LJFF = bundle.getString("wap_to_native_from_tag", "opensdk");
    }

    @Override // X.C1B3T
    public final void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        C786410Ut5.LJJJI("_bytedance_params_state", this.LIZ, bundle);
        C786410Ut5.LJJJI("_bytedance_params_client_key", this.LIZJ, bundle);
        C786410Ut5.LJJJI("_bytedance_params_client_secret", this.LIZLLL, bundle);
        C786410Ut5.LJJJI("_bytedance_params_redirect_uri", this.LIZIZ, bundle);
        C786410Ut5.LJJJI("_bytedance_params_next_url", this.LJ, bundle);
        C786410Ut5.LJJJI("_bytedance_params_scope", this.LJII, bundle);
        C786410Ut5.LJJJI("_bytedance_params_optional_scope0", this.LJIIIIZZ, bundle);
        C786410Ut5.LJJJI("_bytedance_params_optional_scope1", this.LJIIIZ, bundle);
        bundle.putInt("wap_requested_orientation", this.LJI);
        C786410Ut5.LJJJI("wap_to_native_from_tag", this.LJFF, bundle);
    }
}
