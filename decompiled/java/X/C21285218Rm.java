package X;

import com.ss.android.ugc.aweme.topic.ITopicAnchorFactory;
import com.ss.android.ugc.aweme.topic.TopicAnchorFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.18Rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21285218Rm<T> extends C09AY implements Function0<T> {
    public final /* synthetic */ C21284618Rg<T, S> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21285218Rm(C21284618Rg<T, S> c21284618Rg) {
        super(0);
        this.LL = c21284618Rg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ITopicAnchorFactory iTopicAnchorFactory;
        Object objLIZ = C04TD.LIZ(ITopicAnchorFactory.class, false);
        if (objLIZ != null) {
            iTopicAnchorFactory = (ITopicAnchorFactory) objLIZ;
        } else {
            if (C04TD.K5 == null) {
                synchronized (ITopicAnchorFactory.class) {
                    if (C04TD.K5 == null) {
                        C04TD.K5 = new TopicAnchorFactory();
                    }
                }
            }
            iTopicAnchorFactory = C04TD.K5;
        }
        return iTopicAnchorFactory.LIZ(this.LL.type());
    }
}
