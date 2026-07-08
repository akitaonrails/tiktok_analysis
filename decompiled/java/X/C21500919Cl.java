package X;

import com.bytedance.ies.foundation.activity.BaseActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21500919Cl extends C09AY implements Function0<Integer> {
    public final /* synthetic */ BaseActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21500919Cl(BaseActivity baseActivity) {
        super(0);
        this.LL = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.LL.getIntent().getIntExtra("activity_translation_type", -1));
    }
}
