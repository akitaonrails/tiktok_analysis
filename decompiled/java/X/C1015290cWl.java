package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0cWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015290cWl extends AbstractC1023470cjx {
    public final C1022410ciF LIZ;
    public final C1023630ckD<?>[] LIZIZ;

    @Override // X.AbstractC1023360cjm
    public final AbstractC1023090cjL getAdBizScene() {
        return this.LIZ;
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZIZ;
    }

    public C1015290cWl(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = C1022410ciF.LIZIZ;
        this.LIZIZ = new C1023630ckD[0];
    }

    public static final String LJJIIZ(AnoleComponentModel anoleComponentModel) {
        String renderStrategy = anoleComponentModel.getRenderStrategy();
        if (renderStrategy == null) {
            return "prerender";
        }
        return renderStrategy;
    }
}
