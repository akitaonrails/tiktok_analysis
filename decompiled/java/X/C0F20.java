package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0F20, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0F20 extends C2217421BqW implements Function2<EnumC383510F1x, Float, Unit> {
    public C0F20(C383420F1o c383420F1o) {
        super(2, c383420F1o, C383420F1o.class, "onSliderChangeEnd", "onSliderChangeEnd(Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/logic/CutoutStrokeAdjustType;F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EnumC383510F1x enumC383510F1x, Float f) {
        float fFloatValue = f.floatValue();
        ((C383420F1o) this.receiver).T4(enumC383510F1x, fFloatValue);
        return Unit.LIZ;
    }
}
