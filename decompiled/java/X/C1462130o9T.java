package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o9T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1462130o9T extends C2217421BqW implements Function1<Integer, Unit> {
    public C1462130o9T(AbstractC1453750nvx abstractC1453750nvx) {
        super(1, abstractC1453750nvx, C1455260nyO.class, "updateNeedRecognizeFromEdit", "updateNeedRecognizeFromEdit(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        Scene scene = (Scene) this.receiver;
        C1462320o9m c1462320o9m = (C1462320o9m) scene.getScope().LJ("needRecognize");
        if (c1462320o9m != null) {
            c1462320o9m.LIZ = iIntValue;
            scene.getScope().LJI("needRecognize", c1462320o9m);
        } else {
            scene.getScope().LJI("needRecognize", new C1462320o9m(iIntValue));
        }
        return Unit.LIZ;
    }
}
