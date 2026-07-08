package X;

import Y.ARunnableS6S1300000_5;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Dz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357010Dz9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0EPT LL;
    public final /* synthetic */ EffectModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357010Dz9(C0EPT c0ept, EffectModel effectModel, String str, int i, long j) {
        super(0);
        this.LL = c0ept;
        this.LLILLJJLI = effectModel;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C356830Dyr c356830DyrU5 = this.LL.U5();
        NLEModel model = this.LL.J6().getModel();
        c356830DyrU5.getClass();
        List listLJIILJJIL = C356830Dyr.LJIILJJIL(model);
        C0EPT c0ept = this.LL;
        EffectModel effectModel = this.LLILLJJLI;
        String str = this.LLILLL;
        if (!listLJIILJJIL.isEmpty()) {
            NLEFilter nLEFilter = (NLEFilter) C13LP.LJJJLL(((NLETrackSlot) ListProtector.get(listLJIILJJIL, 0)).getFilters());
            if (nLEFilter == null || nLEFilter.getSegment() == null) {
                c0ept.Qh();
            }
            c0ept.i3(new AwS584S0100000_5(listLJIILJJIL, (List<Pair<Long, Float>>) 81));
            C786410Ut5.LJLIIL(500L, new BPEAHandler(), new ARunnableS6S1300000_5(c0ept, listLJIILJJIL, effectModel, str, 0));
        }
        C1428470nHB.LLILZIL(this.LL.getEditModel());
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel editModel = this.LL.getEditModel();
        String str2 = this.LLILLJJLI.key;
        String str3 = this.LLILLL;
        int i = this.LLILZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
        Integer numValueOf = Integer.valueOf(this.LLILLJJLI.source);
        String str4 = this.LLILLJJLI.designerId;
        c1413450msx.getClass();
        C1413450msx.LJII(editModel, str2, str3, i, "success", jCurrentTimeMillis, numValueOf, str4);
        return Unit.LIZ;
    }
}
