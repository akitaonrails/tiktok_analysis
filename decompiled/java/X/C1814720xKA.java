package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xKA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814720xKA extends C09AY implements Function1<AbstractC1812590xGj, Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814720xKA(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(1);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1812590xGj abstractC1812590xGj) {
        AbstractC1812590xGj abstractC1812590xGj2 = abstractC1812590xGj;
        List<ITEM> listListGetAll = this.LL.NR().listGetAll();
        if (listListGetAll != 0 && !listListGetAll.isEmpty()) {
            List<ITEM> listListGetAll2 = this.LL.NR().listGetAll();
            if (listListGetAll2 != 0) {
                Iterator it2 = listListGetAll2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof AbstractC1812590xGj) {
                        if (next == null) {
                            break;
                        }
                    }
                }
                this.LL.NR().LLJIJIL = abstractC1812590xGj2;
            }
            this.LL.NR().listAddItemAt(0, abstractC1812590xGj2);
        } else {
            this.LL.NR().LLJIJIL = abstractC1812590xGj2;
        }
        return Unit.LIZ;
    }
}
