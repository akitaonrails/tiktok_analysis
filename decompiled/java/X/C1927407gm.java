package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.CommercialContentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927407gm extends C2217421BqW implements Function1<C07VI, Unit> {
    public C1927407gm(Object obj) {
        super(1, obj, CommercialContentVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/CommercialContentCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VI c07vi) {
        C07VI c07vi2 = c07vi;
        CommercialContentVM commercialContentVM = (CommercialContentVM) this.receiver;
        commercialContentVM.getClass();
        if (c07vi2 instanceof C07VH) {
            commercialContentVM.vQ2(((C07VH) c07vi2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
