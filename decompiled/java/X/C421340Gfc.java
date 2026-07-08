package X;

import android.content.Context;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421340Gfc extends C09AY implements Function1<TuxIconView, Unit> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C421340Gfc(Context context) {
        super(1);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TuxIconView tuxIconView) {
        tuxIconView.setImageDrawable(C20736316Cj.LIZLLL(R.attr.e6s, this.LL));
        return Unit.LIZ;
    }
}
