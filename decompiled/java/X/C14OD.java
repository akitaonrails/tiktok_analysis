package X;

import android.content.Context;
import com.lynx.starlight.nodes.StarlightNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14OD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14OD extends C2217421BqW implements Function1<Float, Unit> {
    public C14OD(Object obj) {
        super(1, obj, C14P7.class, "setMaxWidth", "setMaxWidth(Lcom/ss/android/ugc/aweme/nimblecard/tako/element/INimbleViewManager;F)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        C14NX c14nx = (C14NX) this.receiver;
        Context context = C14P7.LIZ;
        StarlightNode starlightNode = c14nx.LJFF().LIZ;
        starlightNode.nativeSetMaxWidth(starlightNode.LIZ, fFloatValue);
        return Unit.LIZ;
    }
}
