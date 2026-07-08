package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1810510xDN extends C2217421BqW implements Function0<Unit> {
    public C1810510xDN(Object obj) {
        super(0, obj, RankListDialog.class, "dismiss", "dismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((DialogFragment) this.receiver).dismiss();
        return Unit.LIZ;
    }
}
