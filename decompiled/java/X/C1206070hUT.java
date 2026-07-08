package X;

import com.ss.android.ugc.aweme.templateselect.TemplateSelectionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1206070hUT extends C2217421BqW implements Function0<Unit> {
    public C1206070hUT(TemplateSelectionViewModel templateSelectionViewModel) {
        super(0, templateSelectionViewModel, TemplateSelectionViewModel.class, "consumeScrollToTemplateId", "consumeScrollToTemplateId()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2252321DDq c2252321DDq = ((TemplateSelectionViewModel) this.receiver).LL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), null)) {
        }
        return Unit.LIZ;
    }
}
