package X;

import android.os.Build;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19313010h6 extends C09AY implements Function0<C19306510g3> {
    public final /* synthetic */ SignupViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19313010h6(SignupViewModel signupViewModel) {
        super(0);
        this.LL = signupViewModel;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.10g3, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.10g3, java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function0
    public final C19306510g3 invoke() {
        Bundle bundleCQ2 = this.LL.CQ2();
        if (Build.VERSION.SDK_INT >= 33) {
            return bundleCQ2.getSerializable("login_panel_sotl_config_override", C19306510g3.class);
        }
        ?? serializable = bundleCQ2.getSerializable("login_panel_sotl_config_override");
        if (serializable instanceof C19306510g3) {
            return serializable;
        }
        return null;
    }
}
