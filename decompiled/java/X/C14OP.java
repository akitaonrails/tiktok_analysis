package X;

import android.content.Context;
import com.lynx.starlight.nodes.StarlightNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14OP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14OP extends C2217421BqW implements Function0<Unit> {
    public C14OP(Object obj) {
        super(0, obj, C14P7.class, "setFlexBasisAuto", "setFlexBasisAuto(Lcom/ss/android/ugc/aweme/nimblecard/tako/element/INimbleViewManager;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C14NX c14nx = (C14NX) this.receiver;
        Context context = C14P7.LIZ;
        StarlightNode starlightNode = c14nx.LJFF().LIZ;
        starlightNode.nativeSetFlexBasisAuto(starlightNode.LIZ);
        return Unit.LIZ;
    }
}
