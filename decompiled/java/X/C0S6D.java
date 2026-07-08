package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S6D, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S6D extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ VideoDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S6D(VideoDescAssem videoDescAssem) {
        super(1);
        this.LL = videoDescAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.KQ2(this.LL, new C0S6Q());
        return Unit.LIZ;
    }
}
