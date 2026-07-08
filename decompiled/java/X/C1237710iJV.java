package X;

import android.os.Build;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailBindSheetFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iJV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237710iJV extends C09AY implements Function0<IForceBindingAccountService.PromptDetail> {
    public final /* synthetic */ EmailBindSheetFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1237710iJV(EmailBindSheetFragment emailBindSheetFragment) {
        super(0);
        this.LL = emailBindSheetFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.IForceBindingAccountService$PromptDetail, java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function0
    public final IForceBindingAccountService.PromptDetail invoke() {
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = this.LL.getArguments();
            if (arguments != null) {
                return arguments.getSerializable("prompt_details", IForceBindingAccountService.PromptDetail.class);
            }
            return null;
        }
        Bundle arguments2 = this.LL.getArguments();
        IForceBindingAccountService.PromptDetail serializable = arguments2 != null ? arguments2.getSerializable("prompt_details") : 0;
        if (serializable instanceof IForceBindingAccountService.PromptDetail) {
            return serializable;
        }
        return null;
    }
}
