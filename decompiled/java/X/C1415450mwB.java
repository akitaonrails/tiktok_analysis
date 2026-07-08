package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1415450mwB extends C2217421BqW implements Function2<Float, Float, Float> {
    public C1415450mwB(C2488709p7 c2488709p7) {
        super(2, c2488709p7, C2488709p7.class, "getImageRatio", "getImageRatio(FF)F", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Float invoke(Float f, Float f2) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        this.receiver.getClass();
        return Float.valueOf(C2488709p7.LIZLLL(fFloatValue, fFloatValue2));
    }
}
