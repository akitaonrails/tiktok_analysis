package X;

import android.content.Context;
import com.lynx.starlight.nodes.StarlightNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14Nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C20256714Nx extends C2217421BqW implements Function1<Float, Unit> {
    public C20256714Nx(Object obj) {
        super(1, obj, C14P7.class, "setFlexBasis", "setFlexBasis(Lcom/ss/android/ugc/aweme/nimblecard/tako/element/INimbleViewManager;Ljava/lang/Float;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        Float f2 = f;
        C14NX c14nx = (C14NX) this.receiver;
        Context context = C14P7.LIZ;
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            C14O8 c14o8LJFF = c14nx.LJFF();
            Float fValueOf = Float.valueOf(fFloatValue);
            c14o8LJFF.getClass();
            if (fValueOf != null) {
                float fFloatValue2 = fValueOf.floatValue();
                StarlightNode starlightNode = c14o8LJFF.LIZ;
                starlightNode.nativeSetFlexBasis(starlightNode.LIZ, fFloatValue2);
            }
        }
        return Unit.LIZ;
    }
}
