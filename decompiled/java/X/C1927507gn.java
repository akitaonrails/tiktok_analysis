package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.FavoriteCellVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927507gn extends C2217421BqW implements Function1<C07VW, Unit> {
    public C1927507gn(Object obj) {
        super(1, obj, FavoriteCellVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/FavoriteCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07VW c07vw) {
        C07VW c07vw2 = c07vw;
        FavoriteCellVM favoriteCellVM = (FavoriteCellVM) this.receiver;
        favoriteCellVM.getClass();
        if (c07vw2 instanceof C07VV) {
            favoriteCellVM.vQ2(((C07VV) c07vw2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
