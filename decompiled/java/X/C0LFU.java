package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LFU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0LFU extends C2217421BqW implements Function2<List<? extends C539860LFg>, NLEModel, Unit> {
    public C0LFU(C0LFO c0lfo) {
        super(2, c0lfo, C0LFO.class, "confirm", "confirm(Ljava/util/List;Lcom/bytedance/ies/nle/editor_jni/NLEModel;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends C539860LFg> list, NLEModel nLEModel) {
        ((C0LFO) this.receiver).F4(list, nLEModel);
        return Unit.LIZ;
    }
}
