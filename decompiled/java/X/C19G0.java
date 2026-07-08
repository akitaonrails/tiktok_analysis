package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: renamed from: X.19G0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19G0 extends AbstractC21510019Fy {
    public final /* synthetic */ CompletionBlock<C19G2> LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19G0(Activity activity, CompletionBlock<C19G2> completionBlock) {
        super(activity);
        this.LIZJ = completionBlock;
    }

    public final void LIZIZ(int i, String str) {
        C2382909Vj.LIZ(this.LIZJ, i, str, null, 4);
    }
}
