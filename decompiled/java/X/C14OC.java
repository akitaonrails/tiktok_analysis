package X;

import android.content.Context;
import com.lynx.starlight.nodes.StarlightNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14OC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14OC extends C2217421BqW implements Function1<Float, Unit> {
    public C14OC(Object obj) {
        super(1, obj, C14P7.class, "setMaxWidthPercent", "setMaxWidthPercent(Lcom/ss/android/ugc/aweme/nimblecard/tako/element/INimbleViewManager;F)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        C14NX c14nx = (C14NX) this.receiver;
        Context context = C14P7.LIZ;
        StarlightNode starlightNode = c14nx.LJFF().LIZ;
        starlightNode.nativeSetMaxWidthPercent(starlightNode.LIZ, fFloatValue);
        return Unit.LIZ;
    }
}
