package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AdsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07sQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1999607sQ extends C2217421BqW implements Function1<C07V6, Unit> {
    public C1999607sQ(Object obj) {
        super(1, obj, AdsVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/AdsCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07V6 c07v6) {
        C07V6 c07v62 = c07v6;
        this.receiver.getClass();
        if (c07v62 instanceof C07V5) {
            ComplianceServiceProvider.LJIILIIL().LJJIL(((C07V5) c07v62).LIZ, "settings");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
