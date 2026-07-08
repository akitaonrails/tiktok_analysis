package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Gen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420830Gen extends C09AY implements Function0<View> {
    public final /* synthetic */ C428890Grn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C420830Gen(C428890Grn c428890Grn) {
        super(0);
        this.LL = c428890Grn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        View viewFindViewById = this.LL.findViewById(R.id.kmc);
        viewFindViewById.setBackground(((Number) C0BWS.LIZ.getValue()).intValue() == 2 ? this.LL.getGreyBarBG() : this.LL.getWhiteBarBG());
        return viewFindViewById;
    }
}
