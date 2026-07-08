package X;

import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418080GaM extends C09AY implements Function0<TuxIconView> {
    public final /* synthetic */ C428890Grn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C418080GaM(C428890Grn c428890Grn) {
        super(0);
        this.LL = c428890Grn;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.bytedance.tux.icon.TuxIconView] */
    @Override // kotlin.jvm.functions.Function0
    public final TuxIconView invoke() {
        return this.LL.findViewById(R.id.ls_);
    }
}
