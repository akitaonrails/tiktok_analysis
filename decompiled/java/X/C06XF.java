package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06XF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C06XF extends C2217421BqW implements Function2<int[], Boolean, Unit> {
    public C06XF(o oVar) {
        super(2, oVar, o.class, "buildPropShowEffectMobFromArray", "buildPropShowEffectMobFromArray([IZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(int[] iArr, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((o) this.receiver).N5(iArr, zBooleanValue);
        return Unit.LIZ;
    }
}
