package X;

import kotlin.jvm.functions.Function1;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: X.0dLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1046630dLJ extends C2217421BqW implements Function1<Node, C1045330dJD> {
    public C1046630dLJ(Object obj) {
        super(1, obj, C1046600dLG.class, "parseVideoClick", "parseVideoClick(Lorg/w3c/dom/Node;)Lcom/bytedance/ies/ugc/aweme/rich/model/vast/model/VideoClick;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1045330dJD invoke(Node node) {
        return ((C1046600dLG) this.receiver).LJI(node);
    }
}
