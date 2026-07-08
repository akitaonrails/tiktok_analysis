package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18RX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class C18RX extends C2217421BqW implements InterfaceC1631620sYq<List<? extends AIPlaygroundChipsModel>, Integer, List<? extends AIPlaygroundChipsModel>, Unit> {
    public C18RX(C18S2 c18s2) {
        super(3, c18s2, C18S2.class, "updateTotalChipsCache", "updateTotalChipsCache(Ljava/util/List;ILjava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(List<? extends AIPlaygroundChipsModel> list, Integer num, List<? extends AIPlaygroundChipsModel> list2) {
        ((C18S2) this.receiver).R5(list, num.intValue(), list2);
        return Unit.LIZ;
    }
}
