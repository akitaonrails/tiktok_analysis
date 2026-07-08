package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ESp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364970ESp extends AbstractC2255721DQs<C0ER1> implements C0ER1, InterfaceC379610EuV {
    public static final int LLILLL = 8;
    public final C1DRG LL;
    public final Function2<VideoPublishEditModel, Boolean, AbstractC2217051Bpv> LLILLJJLI;

    public C0ER1 W1() {
        return this;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C364970ESp(C1DRG c1drg, Function2<? super VideoPublishEditModel, ? super Boolean, ? extends AbstractC2217051Bpv> function2) {
        this.LL = c1drg;
        this.LLILLJJLI = function2;
    }

    @Override // X.C0ER1
    public AbstractC2217051Bpv LLLFFI(VideoPublishEditModel videoPublishEditModel, boolean z) {
        return this.LLILLJJLI.invoke(videoPublishEditModel, Boolean.valueOf(!z));
    }
}
