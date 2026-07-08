package X;

import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19DZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BaseActivity LL;
    public final /* synthetic */ Bundle LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19DZ(BaseActivity baseActivity, Bundle bundle) {
        super(0);
        this.LL = baseActivity;
        this.LLILLJJLI = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.activityRef = new WeakReference<>(this.LL);
        BaseActivityViewModel baseViewModel = this.LL.getBaseViewModel();
        if (!baseViewModel.LLILLL) {
            this.LL.buildCommonIntent();
            baseViewModel.init();
        }
        C21504119Dr c21504119Dr = BaseActivity.callback;
        BaseActivity baseActivity = this.LL;
        Bundle bundle = this.LLILLJJLI;
        c21504119Dr.getClass();
        C21504119Dr.LIZ(c21504119Dr, baseActivity, true, null, new C21502419Da(bundle), 4);
        super/*X.19Dn*/.onCreate(this.LLILLJJLI);
        C21504119Dr.LIZ(c21504119Dr, this.LL, false, null, new C21502519Db(this.LLILLJJLI), 6);
        return Unit.LIZ;
    }
}
