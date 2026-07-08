package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContentPreferenceVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07h4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1929207h4 extends C2217421BqW implements Function1<C07VQ, Unit> {
    public C1929207h4(Object obj) {
        super(1, obj, ContentPreferenceVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/ContentPreferenceCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VQ c07vq) {
        C07VQ c07vq2 = c07vq;
        ContentPreferenceVM contentPreferenceVM = (ContentPreferenceVM) this.receiver;
        contentPreferenceVM.getClass();
        if (c07vq2 instanceof C07VP) {
            contentPreferenceVM.wQ2(((C07VP) c07vq2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
