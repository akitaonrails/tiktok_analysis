package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lYJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362210lYJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ RecyclerView LL;
    public final /* synthetic */ C1363390laD LLILLJJLI;
    public final /* synthetic */ List<IMContact> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1362210lYJ(RecyclerView recyclerView, C1363390laD c1363390laD, List<? extends IMContact> list, int i) {
        super(0);
        this.LL = recyclerView;
        this.LLILLJJLI = c1363390laD;
        this.LLILLL = list;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            C423580GjE c423580GjE = new C423580GjE();
            c423580GjE.LLILLL = 80L;
            c423580GjE.LLILZIL = 80L;
            recyclerView.setItemAnimator(c423580GjE);
        }
        this.LLILLJJLI.getData().clear();
        this.LLILLJJLI.getData().addAll(this.LLILLL);
        this.LLILLJJLI.notifyItemInserted(this.LLILZ);
        return Unit.LIZ;
    }
}
