package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageTitleBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819300xRY extends C09AY implements Function1<EnumC1815680xLi, Unit> {
    public final /* synthetic */ LiveBoardsPageTitleBarAssem LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819300xRY(LiveBoardsPageTitleBarAssem liveBoardsPageTitleBarAssem, Context context) {
        super(1);
        this.LL = liveBoardsPageTitleBarAssem;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC1815680xLi enumC1815680xLi) {
        int i = C1819290xRX.LIZ[enumC1815680xLi.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LL.Jo();
                this.LL.Ho().setState(new C1816110xMP());
            } else {
                throw new C1954807lC();
            }
        } else {
            this.LL.Ho().xQ2(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
