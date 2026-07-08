package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.render.AudienceDecorationRenderAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145240fuM extends C09AY implements Function1<C1165504hB, Unit> {
    public final /* synthetic */ AudienceDecorationRenderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145240fuM(AudienceDecorationRenderAssem audienceDecorationRenderAssem) {
        super(1);
        this.LL = audienceDecorationRenderAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1165504hB c1165504hB) {
        C1145410fud.LIZIZ(this.LL.Go().LL, c1165504hB.LIZ);
        return Unit.LIZ;
    }
}
