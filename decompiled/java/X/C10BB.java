package X;

import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.ui.PaPromptFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10BB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C10BB extends C2217421BqW implements Function1<Throwable, Unit> {
    public C10BB(PaPromptFragment paPromptFragment) {
        super(1, paPromptFragment, PaPromptFragment.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        ((PaPromptFragment) this.receiver).dS(th);
        return Unit.LIZ;
    }
}
