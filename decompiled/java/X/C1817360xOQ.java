package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.api.anchor.UpsertBoardItemReq;

/* JADX INFO: renamed from: X.0xOQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817360xOQ extends C09AY implements Function1<C1159360gH8, Unit> {
    public final /* synthetic */ CustomizedBoardTitleDoneViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817360xOQ(CustomizedBoardTitleDoneViewModel customizedBoardTitleDoneViewModel) {
        super(1);
        this.LL = customizedBoardTitleDoneViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1159360gH8 c1159360gH8) {
        if (c1159360gH8.LL) {
            C1790630whJ c1790630whJ = C1790620whI.LIZIZ;
            if (c1790630whJ != null) {
                c1790630whJ.LJI = System.currentTimeMillis();
            }
            C1790630whJ c1790630whJ2 = C1790620whI.LIZIZ;
            if (c1790630whJ2 != null) {
                c1790630whJ2.LJIIIZ++;
            }
            final CustomizedBoardTitleDoneViewModel customizedBoardTitleDoneViewModel = this.LL;
            final BoardItem boardItem = customizedBoardTitleDoneViewModel.vQ2().LL;
            customizedBoardTitleDoneViewModel.setState(new C1159390gHB(true));
            C480460Ism.LIZ().getClass();
            LiveBoardApi liveBoardApi = (LiveBoardApi) C480460Ism.LIZLLL(LiveBoardApi.class);
            UpsertBoardItemReq upsertBoardItemReq = new UpsertBoardItemReq();
            BoardItem boardItem2 = new BoardItem();
            boardItem2.id = boardItem.id;
            boardItem2.boardItemType = customizedBoardTitleDoneViewModel.vQ2().LLILLL;
            boardItem2.fullyCustomizedContent = boardItem.fullyCustomizedContent;
            boardItem2.style = boardItem.style;
            boardItem2.richTextContent = boardItem.richTextContent;
            boardItem2.draggable = true;
            upsertBoardItemReq.boardItem = boardItem2;
            liveBoardApi.upsertBoardItem(upsertBoardItemReq).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0xOR
                /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r14) {
                    /*
                        Method dump skipped, instruction units count: 434
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1817370xOR.accept(java.lang.Object):void");
                }
            }, new C09JN() { // from class: X.0xOS
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CustomizedBoardTitleDoneViewModel@c780.saveCurrentBoardItem$1$3");
                    C1790620whI.LJII();
                    C1790620whI.LJI("upsert_item");
                    CustomizedBoardTitleDoneViewModel customizedBoardTitleDoneViewModel2 = customizedBoardTitleDoneViewModel;
                    customizedBoardTitleDoneViewModel2.getClass();
                    customizedBoardTitleDoneViewModel2.setState(new C1159390gHB(false));
                    CustomizedBoardTitleDoneViewModel customizedBoardTitleDoneViewModel3 = customizedBoardTitleDoneViewModel;
                    customizedBoardTitleDoneViewModel3.getClass();
                    customizedBoardTitleDoneViewModel3.setState(new C1817390xOT());
                    C1C7U.LIZIZ("CustomizedBoardTitleDoneViewModel@c780.saveCurrentBoardItem$1$3");
                }
            });
        } else {
            CustomizedBoardTitleDoneViewModel customizedBoardTitleDoneViewModel2 = this.LL;
            customizedBoardTitleDoneViewModel2.getClass();
            customizedBoardTitleDoneViewModel2.setState(new C1817400xOU());
        }
        return Unit.LIZ;
    }
}
