package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookSelectionDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ai9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C945470ai9 extends C2217421BqW implements Function2<List<? extends C935810aSZ>, List<? extends C935770aSV>, Unit> {
    public C945470ai9(Object obj) {
        super(2, obj, PlaybookSelectionDialog.class, "updateUi", "updateUi(Ljava/util/List;Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends C935810aSZ> list, List<? extends C935770aSV> list2) {
        ((PlaybookSelectionDialog) this.receiver).ES(list, list2);
        return Unit.LIZ;
    }
}
