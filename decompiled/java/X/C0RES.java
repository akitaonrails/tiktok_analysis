package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0RES, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RES extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RES(View view, VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, C13IQ c13iq) {
        super(1);
        this.LL = videoAuthorInfoRelationAssem;
        this.LLILLJJLI = view;
        this.LLILLL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        C0RJE.LIZJ(assembler, this.LL, new AwS377S0200000_11(this.LLILLJJLI, (View) this.LLILLL, (C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>>) 33));
        return Unit.LIZ;
    }
}
