package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class C21284218Rc extends C2217421BqW implements Function1<List<? extends AIPlaygroundChipsModel>, Unit> {
    public C21284218Rc(C18S2 c18s2) {
        super(1, c18s2, C18S2.class, "onTextRefresh", "onTextRefresh(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends AIPlaygroundChipsModel> list) {
        ((C18S2) this.receiver).n5(list);
        return Unit.LIZ;
    }
}
