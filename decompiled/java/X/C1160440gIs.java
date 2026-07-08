package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160440gIs extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ RecyclerView.LayoutManager LLILLL;
    public final /* synthetic */ C18Z8 LLILZ;
    public final /* synthetic */ RavenFragment<CONTEXT> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1160440gIs(String str, String str2, RecyclerView.LayoutManager layoutManager, C18Z8 c18z8, RavenFragment<CONTEXT> ravenFragment) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = layoutManager;
        this.LLILZ = c18z8;
        this.LLILZIL = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert supplement request relayout source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" reason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" layoutManager=");
        RecyclerView.LayoutManager layoutManager = this.LLILLL;
        sbLIZ.append(layoutManager != null ? layoutManager.getClass().getSimpleName() : null);
        sbLIZ.append(" adapterCount=");
        AbstractC21673619ry adapter = this.LLILZ.getAdapter();
        sbLIZ.append(adapter != null ? Integer.valueOf(adapter.getItemCount()) : null);
        sbLIZ.append(" childCount=");
        sbLIZ.append(this.LLILZ.getChildCount());
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZIL.fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
