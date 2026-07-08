package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ge5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420390Ge5 extends C09AY implements Function0<View> {
    public final /* synthetic */ AbstractC420810Gel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C420390Ge5(AbstractC420810Gel abstractC420810Gel) {
        super(0);
        this.LL = abstractC420810Gel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.findViewById(R.id.v_touch_area);
    }
}
