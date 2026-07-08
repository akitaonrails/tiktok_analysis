package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357260DzY extends C09AY implements Function0<Long> {
    public final /* synthetic */ Boolean LL;
    public final /* synthetic */ C0EPT LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ EffectModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357260DzY(Boolean bool, C0EPT c0ept, long j, EffectModel effectModel, boolean z) {
        super(0);
        this.LL = bool;
        this.LLILLJJLI = c0ept;
        this.LLILLL = j;
        this.LLILZ = effectModel;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        if (this.LL.booleanValue()) {
            return this.LLILLJJLI.T4(this.LLILLL, this.LLILZ, false, this.LLILZIL);
        }
        return null;
    }
}
