package X;

import android.view.View;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564150qo1 extends C09AY implements Function0<View> {
    public final /* synthetic */ MFToolBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564150qo1(MFToolBarAssem mFToolBarAssem) {
        super(0);
        this.LL = mFToolBarAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.LJJIJL().findViewById(R.id.y0b);
    }
}
