package X;

import com.ss.android.ugc.aweme.templateselect.TemplateSelectionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1206060hUS extends C2217421BqW implements Function1<String, Unit> {
    public C1206060hUS(TemplateSelectionViewModel templateSelectionViewModel) {
        super(1, templateSelectionViewModel, TemplateSelectionViewModel.class, "onTemplateSelect", "onTemplateSelect$im_aigroupshot_release(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C2252321DDq c2252321DDq = ((TemplateSelectionViewModel) this.receiver).LLILZIL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), str)) {
        }
        return Unit.LIZ;
    }
}
