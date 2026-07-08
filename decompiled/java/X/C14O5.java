package X;

import android.content.Context;
import com.lynx.starlight.nodes.StarlightNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14O5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14O5 extends C2217421BqW implements Function1<Float, Unit> {
    public C14O5(Object obj) {
        super(1, obj, C14P7.class, "setHeightPercent", "setHeightPercent(Lcom/ss/android/ugc/aweme/nimblecard/tako/element/INimbleViewManager;Ljava/lang/Float;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        Float f2 = f;
        C14NX c14nx = (C14NX) this.receiver;
        Context context = C14P7.LIZ;
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            StarlightNode starlightNode = c14nx.LJFF().LIZ;
            starlightNode.nativeSetHeightPercent(starlightNode.LIZ, fFloatValue);
        }
        return Unit.LIZ;
    }
}
