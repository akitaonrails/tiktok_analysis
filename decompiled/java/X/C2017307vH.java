package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AudienceControlVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2017307vH extends C2217421BqW implements Function1<C07VA, Unit> {
    public C2017307vH(Object obj) {
        super(1, obj, AudienceControlVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/AudienceControlCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VA c07va) {
        C07VA c07va2 = c07va;
        this.receiver.getClass();
        if (c07va2 instanceof C07V9) {
            Context context = ((C07V9) c07va2).LIZ;
            if (context != null) {
                ComplianceServiceProvider.LJI().LJJIZ(context);
            }
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
