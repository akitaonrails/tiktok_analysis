package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815620xLc extends C09AY implements Function2<UIAssem, EnumC1815680xLi, Unit> {
    public final /* synthetic */ LiveBoardsPageContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815620xLc(LiveBoardsPageContentAssem liveBoardsPageContentAssem) {
        super(2);
        this.LL = liveBoardsPageContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC1815680xLi enumC1815680xLi) {
        int i = C1815670xLh.LIZ[enumC1815680xLi.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C439101nJ.LJI(this.LL.Go());
            } else {
                throw new C1954807lC();
            }
        } else {
            C12ES.LJIILL(0, this.LL.Go());
        }
        return Unit.LIZ;
    }
}
