package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0RA2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RA2 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ AssemReusedContainer<VideoBaseCell, VideoItemParams> LL;
    public final /* synthetic */ C690430R6j LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RA2(AssemReusedContainer<VideoBaseCell, VideoItemParams> assemReusedContainer, C690430R6j c690430R6j) {
        super(1);
        this.LL = assemReusedContainer;
        this.LLILLJJLI = c690430R6j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        if (C294990BhJ.LIZ()) {
            assembler2.GQ2(this.LL, new AwS590S0100000_11(this.LLILLJJLI, 473));
        } else {
            C0RTY c0rtyZQ2 = assembler2.zQ2(this.LL);
            if (c0rtyZQ2 != null) {
                c0rtyZQ2.LIZLLL(this.LLILLJJLI, null, null);
            }
        }
        return Unit.LIZ;
    }
}
