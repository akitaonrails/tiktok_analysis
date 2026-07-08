package X;

import kotlin.jvm.functions.Function1;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: X.0dLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1046640dLK extends C2217421BqW implements Function1<Node, C1045060dIm> {
    public C1046640dLK(Object obj) {
        super(1, obj, C1046590dLF.class, "parseVideoClick", "parseVideoClick(Lorg/w3c/dom/Node;)Lcom/bytedance/vast/model/VideoClick;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1045060dIm invoke(Node node) {
        return ((C1046590dLF) this.receiver).LJI(node);
    }
}
