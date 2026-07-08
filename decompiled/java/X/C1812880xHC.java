package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.IntelligentDecorationBoardUpsertEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryBigImageStylePanelDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryFaqPanelDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryTextStylePanelDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAISummaryBoardSetting;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.Paragraph;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0xHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812880xHC {
    public static final String LIZ(Board board) {
        String str;
        BoardItem boardItem;
        RichTextContent richTextContent;
        List<Paragraph> list;
        Paragraph paragraph;
        List<Paragraph.TextSpan> list2;
        Paragraph.TextSpan textSpan;
        BoardItem boardItem2 = (BoardItem) C13LP.LJJJLL(board.boardItemList);
        Object obj = "";
        if (boardItem2 == null || (str = boardItem2.fullyCustomizedContent) == null) {
            str = "";
        }
        if (str.length() == 0 && ((boardItem = (BoardItem) C13LP.LJJJLL(board.boardItemList)) == null || (richTextContent = boardItem.richTextContent) == null || (list = richTextContent.paragraphs) == null || (paragraph = (Paragraph) C13LP.LJJJLL(list)) == null || (list2 = paragraph.spans) == null || (textSpan = (Paragraph.TextSpan) C13LP.LJJJLL(list2)) == null || (str = textSpan.text) == null)) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        Object objLJJJLL = C13LP.LJJJLL(board.previewImageList);
        if (objLJJJLL != null) {
            obj = objLJJJLL;
        }
        sbLIZ.append(obj);
        return String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(com.bytedance.android.livesdk.model.Board r6) {
        /*
            java.util.List<com.bytedance.android.livesdk.model.BoardItem> r0 = r6.boardItemList
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.android.livesdk.model.BoardItem r0 = (com.bytedance.android.livesdk.model.BoardItem) r0
            java.lang.String r4 = ""
            if (r0 == 0) goto L10
            java.lang.String r5 = r0.fullyCustomizedContent
            if (r5 != 0) goto L11
        L10:
            r5 = r4
        L11:
            java.util.List<com.bytedance.android.livesdk.model.BoardItem> r0 = r6.boardItemList
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.android.livesdk.model.BoardItem r0 = (com.bytedance.android.livesdk.model.BoardItem) r0
            r6 = 0
            if (r0 == 0) goto L84
            com.bytedance.android.livesdk.model.RichTextContent r1 = r0.richTextContent
        L1e:
            int r0 = r5.length()
            if (r0 != 0) goto L81
            if (r1 == 0) goto L52
            java.util.List<com.bytedance.android.livesdk.model.Paragraph> r0 = r1.paragraphs
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.android.livesdk.model.Paragraph r0 = (com.bytedance.android.livesdk.model.Paragraph) r0
            if (r0 == 0) goto L40
            java.util.List<com.bytedance.android.livesdk.model.Paragraph$TextSpan> r0 = r0.spans
            if (r0 == 0) goto L40
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.android.livesdk.model.Paragraph$TextSpan r0 = (com.bytedance.android.livesdk.model.Paragraph.TextSpan) r0
            if (r0 == 0) goto L40
            java.lang.String r5 = r0.text
            if (r5 != 0) goto L41
        L40:
            r5 = r4
        L41:
            java.lang.String r0 = r1.itemStyleRef
            if (r0 == 0) goto L46
            r4 = r0
        L46:
            java.util.List<com.bytedance.android.livesdk.model.RichTextStyle> r0 = r1.styles
            if (r0 == 0) goto L52
            int r0 = r0.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L52:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            if (r1 == 0) goto L86
            java.util.List<com.bytedance.android.livesdk.model.RichTextStyle> r0 = r1.styles
            if (r0 == 0) goto L86
            java.util.Iterator r2 = r0.iterator()
        L61:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r1 = r2.next()
            com.bytedance.android.livesdk.model.RichTextStyle r1 = (com.bytedance.android.livesdk.model.RichTextStyle) r1
            java.lang.String r0 = r1.color
            r3.add(r0)
            java.lang.String r0 = r1.fontFamily
            r3.add(r0)
            int r0 = r1.fontSize
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.add(r0)
            goto L61
        L81:
            if (r1 == 0) goto L52
            goto L41
        L84:
            r1 = r6
            goto L1e
        L86:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r5)
            r0.append(r4)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1812880xHC.LIZIZ(com.bytedance.android.livesdk.model.Board):java.lang.String");
    }

    public static final void LIZJ(AbstractC1812820xH6 abstractC1812820xH6, InterfaceC1813000xHO interfaceC1813000xHO, Context context, DataChannel dataChannel) {
        Board boardLIZ;
        InterfaceC1814530xJr boardsDisplayStateManager;
        String str;
        interfaceC1813000xHO.close(999);
        int i = 0;
        if (abstractC1812820xH6 instanceof C1812780xH2) {
            C1812780xH2 c1812780xH2 = (C1812780xH2) abstractC1812820xH6;
            Board board = c1812780xH2.LIZ.LIZLLL;
            if (board != null) {
                int i2 = board.version;
                if (i2 <= 1) {
                    board.version = i2 + 1;
                }
                if (c1812780xH2.LIZJ) {
                    i = 3;
                } else if (C497700JfU.LIZ.LIZ().isBroadcast()) {
                    i = 2;
                }
                dataChannel.LC0(IntelligentDecorationBoardUpsertEvent.class, new C443120HZe(board, c1812780xH2.LIZIZ, Integer.valueOf(i)));
                return;
            }
            return;
        }
        if (abstractC1812820xH6 instanceof C1812790xH3) {
            C1812790xH3 c1812790xH3 = (C1812790xH3) abstractC1812820xH6;
            C1812850xH9 c1812850xH9 = c1812790xH3.LIZ;
            String entrance = interfaceC1813000xHO.getEntrance();
            int i3 = c1812790xH3.LIZIZ;
            FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            AiSummaryBigImageStylePanelDialog aiSummaryBigImageStylePanelDialog = new AiSummaryBigImageStylePanelDialog();
            aiSummaryBigImageStylePanelDialog.LLJZIJLIL = c1812850xH9;
            aiSummaryBigImageStylePanelDialog.LLLF = entrance;
            aiSummaryBigImageStylePanelDialog.LLLFF = i3;
            C19322110iZ.LJFF(fragmentManager, aiSummaryBigImageStylePanelDialog, "live_ai_summary_big_image_style", null, 0);
            return;
        }
        if (abstractC1812820xH6 instanceof C1812770xH1) {
            Board board2 = ((C1812770xH1) abstractC1812820xH6).LIZ.LIZLLL;
            if (board2 == null || (boardLIZ = C125800ds.LIZ(board2)) == null) {
                return;
            }
            int i4 = boardLIZ.version;
            if (i4 <= 1) {
                boardLIZ.version = i4 + 1;
            }
            InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
            if (effectBoardService != null) {
                effectBoardService.LJ();
            }
            IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
            if (iEffectService == null || (boardsDisplayStateManager = iEffectService.getBoardsDisplayStateManager()) == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("decoration_entrance", "ai_summary");
            if (C125800ds.LIZIZ(boardLIZ)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_empty", str);
            map.put("previous_page", "decoration_template_edit");
            if (LiveAISummaryBoardSetting.INSTANCE.aiSummaryUsageOpt() && boardLIZ.boardItemList.size() == 1) {
                boardsDisplayStateManager.LJII(context, boardLIZ, map);
                return;
            } else {
                boardsDisplayStateManager.LJI(boardLIZ, map);
                return;
            }
        }
        if (abstractC1812820xH6 instanceof C1812810xH5) {
            int i5 = ((C1812810xH5) abstractC1812820xH6).LIZ;
            FragmentManager fragmentManager2 = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            AiSummaryTextStylePanelDialog.LLLII.getClass();
            AiSummaryTextStylePanelDialog aiSummaryTextStylePanelDialog = new AiSummaryTextStylePanelDialog();
            aiSummaryTextStylePanelDialog.LLLFZ = i5;
            C19322110iZ.LJFF(fragmentManager2, aiSummaryTextStylePanelDialog, "live_ai_summary_text_style", null, 0);
            return;
        }
        if (abstractC1812820xH6 instanceof C1812800xH4) {
            FragmentManager fragmentManager3 = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            String str2 = AiSummaryFaqPanelDialog._pnsPageId;
            AbstractC1812590xGj abstractC1812590xGj = ((C1812800xH4) abstractC1812820xH6).LIZ;
            String entrance2 = interfaceC1813000xHO.getEntrance();
            AiSummaryFaqPanelDialog aiSummaryFaqPanelDialog = new AiSummaryFaqPanelDialog();
            aiSummaryFaqPanelDialog.LLLF = abstractC1812590xGj;
            aiSummaryFaqPanelDialog.LLLFF = entrance2;
            C19322110iZ.LJFF(fragmentManager3, aiSummaryFaqPanelDialog, "live_ai_summary_faq_style", null, 0);
            return;
        }
        throw new C1954807lC();
    }
}
