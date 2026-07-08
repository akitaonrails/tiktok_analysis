package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RA4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RA4 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ReusedUIAssem<?> LL;
    public final /* synthetic */ VideoBaseCell LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RA4(ReusedUIAssem<?> reusedUIAssem, VideoBaseCell videoBaseCell, View view) {
        super(1);
        this.LL = reusedUIAssem;
        this.LLILLJJLI = videoBaseCell;
        this.LLILLL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.LQ2(this.LL, new C0RB1(this.LLILLJJLI, this.LLILLL));
        assembler2.LQ2(this.LL, new C0RB0(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
