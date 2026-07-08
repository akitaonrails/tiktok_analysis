package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0F22, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0F22 extends C2217421BqW implements InterfaceC1631620sYq<EnumC383510F1x, Float, Boolean, Unit> {
    public C0F22(C383420F1o c383420F1o) {
        super(3, c383420F1o, C383420F1o.class, "onSliderChange", "onSliderChange(Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/logic/CutoutStrokeAdjustType;FZ)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(EnumC383510F1x enumC383510F1x, Float f, Boolean bool) {
        float fFloatValue = f.floatValue();
        boolean zBooleanValue = bool.booleanValue();
        ((C383420F1o) this.receiver).P4(enumC383510F1x, fFloatValue, zBooleanValue);
        return Unit.LIZ;
    }
}
