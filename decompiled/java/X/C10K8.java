package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.main.assems.DialogAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10K8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10K8 extends C09AY implements Function0<DataCenter> {
    public final /* synthetic */ DialogAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10K8(DialogAssem dialogAssem) {
        super(0);
        this.LL = dialogAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DataCenter invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null) {
            return null;
        }
        return DataCenter.vQ2(ViewModelProviders.of(c19egLIZ), this.LL);
    }
}
