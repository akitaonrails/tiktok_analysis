package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicEnableFovOptimizeSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972990bQX extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C1276910jKj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C972990bQX(C1276910jKj c1276910jKj) {
        super(0);
        this.LL = c1276910jKj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1276910jKj c1276910jKj = this.LL;
        int i = c1276910jKj.LLILLL;
        return Boolean.valueOf((i == 4 || i == 0) ? LivesdkLinkmicEnableFovOptimizeSetting.INSTANCE.isEnable(c1276910jKj.LLILLJJLI) : false);
    }
}
