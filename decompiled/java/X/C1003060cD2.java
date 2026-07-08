package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import java.util.Arrays;
import kotlin.jvm.internal.AwS31S0000100_16;

/* JADX INFO: renamed from: X.0cD2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003060cD2 extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1003060cD2(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }

    public final void LJJIIZ(AnoleComponentModel anoleComponentModel, long j) {
        C1003050cD1 c1003050cD1 = C1003050cD1.LIZ;
        String tag = anoleComponentModel.getTag();
        String refer = anoleComponentModel.getRefer();
        c1003050cD1.getClass();
        if (tag == null) {
            tag = "draw_ad";
        }
        if (refer == null) {
            refer = "bubble";
        }
        C1003070cD3.LIZ.getClass();
        logAd(C1023500ck0.LIZJ(tag, "bubble_duration", refer, new InterfaceC1023650ckF[]{c1003050cD1.LJI(C1003070cD3.LIZIZ)}), new AwS31S0000100_16(j, 26));
    }
}
