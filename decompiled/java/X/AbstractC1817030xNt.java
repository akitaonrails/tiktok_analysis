package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemLayout;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.android.livesdk.model.BoardItemStyle;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SourcePB;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1817030xNt extends FrameLayout implements InterfaceC395901gL {
    public static final String LLJJIJIIJIL = AbstractC1817030xNt.class.getSimpleName();
    public final Context LL;
    public long LLILLJJLI;
    public long LLILLL;
    public Board LLILZ;
    public final C394501g7 LLILZIL;
    public final C397301gZ LLILZLL;
    public C1814980xKa LLIZ;
    public final C1817240xOE LLIZLLLIL;
    public BoardItem LLJ;
    public final C01GW LLJI;
    public BoardItemPosition LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public Function1<? super AbstractC1817030xNt, Unit> LLJILLL;
    public Function1<? super Integer, Unit> LLJJ;
    public Function0<Unit> LLJJI;
    public Function2<? super Integer, ? super C1814980xKa, Unit> LLJJIII;
    public InterfaceC1631630sYr<? super Boolean, ? super Integer, ? super BoardItemPosition, ? super C1814980xKa, Unit> LLJJIJI;

    @Override // X.InterfaceC395901gL
    public final void LIZIZ(boolean z) {
    }

    @Override // X.InterfaceC395901gL
    public final void LIZLLL() {
    }

    public abstract void LJIIIIZZ();

    public boolean LJIIJJI() {
        return true;
    }

    public abstract void LJIILIIL();

    public abstract int getBoardItemType();

    @Override // X.InterfaceC395901gL
    public abstract /* synthetic */ int getLayoutId();

    public void LJIIJ() {
        this.LLJJIII.invoke(Integer.valueOf(getBoardItemType()), this.LLIZ);
    }

    public final C1817080xNy getViewModel() {
        return (C1817080xNy) this.LLJI.getValue();
    }

    @Override // X.InterfaceC395901gL
    public final boolean LJI() {
        return getConfig().LJFF;
    }

    @Override // X.InterfaceC395901gL
    public final void LJFF() {
        C397101gX.LIZ(this);
    }

    public final Board getBoard() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC395901gL
    public long getBoardId() {
        return this.LLILLJJLI;
    }

    public final BoardItem getBoardItem() {
        return this.LLJ;
    }

    public final C1814980xKa getBoardLogInfo() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC395901gL
    public C397301gZ getBoardSeiInfo() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC395901gL
    public C394501g7 getConfig() {
        return this.LLILZIL;
    }

    public final View getContentView() {
        return this.LLJILJIL;
    }

    public final View getFontSelectView() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC395901gL
    public long getGroupId() {
        return this.LLILLL;
    }

    public final InterfaceC1631630sYr<Boolean, Integer, BoardItemPosition, C1814980xKa, Unit> getOnBoardItemMoved() {
        return this.LLJJIJI;
    }

    public final Function2<Integer, C1814980xKa, Unit> getOnBoardItemRemoved() {
        return this.LLJJIII;
    }

    public final Function0<Unit> getOnBoardItemRenderError() {
        return this.LLJJI;
    }

    public final Function1<Integer, Unit> getOnClick() {
        return this.LLJJ;
    }

    public final Function1<AbstractC1817030xNt, Unit> getOnViewUpdated() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC395901gL
    public InterfaceC392301fl getStatusCallback() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC395901gL
    public View getView() {
        return this.LLJILJIL;
    }

    public static void LJII(final AbstractC1817030xNt abstractC1817030xNt) {
        abstractC1817030xNt.getClass();
        HandlerHook.viewPostDelay(abstractC1817030xNt, new Runnable() { // from class: X.0xO1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsBoardItemPreviewBase@fb19.callbackOnUiUpdated$1");
                try {
                    final View view = this.LL.getView();
                    if (view != null) {
                        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            final AbstractC1817030xNt abstractC1817030xNt2 = this.LL;
                            C786410Ut5.x3(viewTreeObserver, new ViewTreeObserver.OnGlobalLayoutListener(view, abstractC1817030xNt2) { // from class: X.0xOL
                                public final /* synthetic */ View LL;

                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public final void onGlobalLayout() {
                                }
                            });
                        } else {
                            this.LL.LJIIL(view);
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsBoardItemPreviewBase@fb19.callbackOnUiUpdated$1");
            }
        }, 10L);
    }

    @Override // X.InterfaceC395901gL
    public final void LIZ(boolean z) {
        this.LLJJIJI.invoke(Boolean.valueOf(z), Integer.valueOf(getBoardItemType()), C488701vJ.LIZJ(getConfig().LJII, getConfig().LJIIIIZZ, getConfig().LJIIIZ, getConfig().LJIIJ), this.LLIZ);
    }

    @Override // X.InterfaceC395901gL
    public final void LIZJ(float f) {
        C397101gX.LIZLLL(this, f);
    }

    public final void LJIIL(View view) {
        boolean z;
        InterfaceC1816580xNA interfaceC1816580xNA;
        Pair<Float, Float> pairLIZ;
        Pair<Float, Float> pair;
        float x;
        float y;
        getConfig().LJIIIZ = view.getMeasuredWidth();
        getConfig().LJIIJ = view.getMeasuredHeight();
        BoardItemLayout boardItemLayout = getConfig().LJJII;
        boolean z2 = true;
        if (boardItemLayout == null) {
            z = true;
        } else {
            z = !boardItemLayout.isValid;
        }
        Float fValueOf = Float.valueOf(0.0f);
        Pair pairLIZ2 = null;
        if (z) {
            BoardItemPosition boardItemPosition = this.LLJIJIL;
            if (boardItemPosition != null) {
                pairLIZ2 = C488701vJ.LIZ(boardItemPosition, getConfig().LJIIIZ, getConfig().LJIIJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[ProducerPreview-ServerPos] boardId=");
                sbLIZ.append(getBoardId());
                sbLIZ.append(" | serverPos=(x=");
                sbLIZ.append(boardItemPosition.x);
                sbLIZ.append(", y=");
                sbLIZ.append(boardItemPosition.y);
                sbLIZ.append(", pctX=");
                sbLIZ.append(boardItemPosition.percentageX);
                sbLIZ.append(", pctY=");
                sbLIZ.append(boardItemPosition.percentageY);
                sbLIZ.append(") | viewSize=(");
                sbLIZ.append(getConfig().LJIIIZ);
                sbLIZ.append(", ");
                sbLIZ.append(getConfig().LJIIJ);
                sbLIZ.append(") | windowPos=");
                sbLIZ.append(pairLIZ2);
                C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            ViewParent parent = getParent();
            while (true) {
                if (parent != null) {
                    if (parent instanceof InterfaceC1816580xNA) {
                        interfaceC1816580xNA = (InterfaceC1816580xNA) parent;
                        if (interfaceC1816580xNA != null) {
                            pairLIZ = interfaceC1816580xNA.LIZ(this, this.LLJ);
                            if (pairLIZ != null) {
                                pair = pairLIZ;
                            }
                        }
                    } else {
                        parent = parent.getParent();
                    }
                } else {
                    interfaceC1816580xNA = null;
                    break;
                }
            }
            pairLIZ = null;
            pair = new Pair<>(fValueOf, fValueOf);
            float fFloatValue = pair.getFirst().floatValue();
            float fFloatValue2 = pair.getSecond().floatValue();
            BoardItemPosition boardItemPositionLIZIZ = C488701vJ.LIZIZ(fFloatValue, fFloatValue2);
            BoardItem boardItem = this.LLJ;
            if (boardItem != null) {
                boardItem.canvasPosition = boardItemPositionLIZIZ;
                boardItem.canvasItemLayout = null;
                boardItem.boardItemLayout = null;
            }
            pairLIZ2 = C488701vJ.LIZ(boardItemPositionLIZIZ, getConfig().LJIIIZ, getConfig().LJIIJ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[ProducerPreview-VirtualCanvas] boardId=");
            sbLIZ2.append(getBoardId());
            sbLIZ2.append(" | hasVirtualMeasure=");
            if (interfaceC1816580xNA == null) {
                z2 = false;
            }
            sbLIZ2.append(z2);
            sbLIZ2.append(" | virtualResult=");
            sbLIZ2.append(pairLIZ);
            sbLIZ2.append(" | center390=(");
            sbLIZ2.append(fFloatValue);
            sbLIZ2.append(", ");
            sbLIZ2.append(fFloatValue2);
            sbLIZ2.append(") | viewSize=(");
            sbLIZ2.append(getConfig().LJIIIZ);
            sbLIZ2.append(", ");
            sbLIZ2.append(getConfig().LJIIJ);
            sbLIZ2.append(") | windowPos=");
            sbLIZ2.append(pairLIZ2);
            C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C394501g7 config = getConfig();
        if (pairLIZ2 != null) {
            x = ((Number) pairLIZ2.getFirst()).floatValue();
        } else {
            x = getX();
        }
        config.LJII = x;
        if (getConfig().LJII < 0.0f && getX() > 0.0f) {
            getConfig().LJII = getX();
        }
        C394501g7 config2 = getConfig();
        if (pairLIZ2 != null) {
            y = ((Number) pairLIZ2.getSecond()).floatValue();
        } else {
            y = getY();
        }
        config2.LJIIIIZZ = y;
        C1092200eWo.LIZ("[ProducerPreview-Final] boardId=" + getBoardId() + " | currentPosition=null | convertedPos=" + pairLIZ2 + " | config.xWindow=" + getConfig().LJII + ", config.yWindow=" + getConfig().LJIIIIZZ);
        String str = LLJJIJIIJIL;
        StringBuilder sb = new StringBuilder("updateContentSize, w=");
        sb.append(getConfig().LJIIIZ);
        sb.append(" h=");
        sb.append(getConfig().LJIIJ);
        C0TFO.LIZ(str, sb.toString());
        C397101gX.LIZ(this);
        this.LLJILLL.invoke(this);
    }

    public final void setBoard(Board board) {
        this.LLILZ = board;
    }

    public void setBoardId(long j) {
        this.LLILLJJLI = j;
    }

    public final void setBoardItem(BoardItem boardItem) {
        this.LLJ = boardItem;
    }

    public final void setBoardLogInfo(C1814980xKa c1814980xKa) {
        this.LLIZ = c1814980xKa;
    }

    public final void setContentView(View view) {
        this.LLJILJIL = view;
    }

    public final void setFontSelectView(View view) {
        this.LLJILJILJ = view;
    }

    public void setGroupId(long j) {
        this.LLILLL = j;
    }

    public final void setOnBoardItemMoved(InterfaceC1631630sYr<? super Boolean, ? super Integer, ? super BoardItemPosition, ? super C1814980xKa, Unit> interfaceC1631630sYr) {
        this.LLJJIJI = interfaceC1631630sYr;
    }

    public final void setOnBoardItemRemoved(Function2<? super Integer, ? super C1814980xKa, Unit> function2) {
        this.LLJJIII = function2;
    }

    public final void setOnBoardItemRenderError(Function0<Unit> function0) {
        this.LLJJI = function0;
    }

    public final void setOnClick(Function1<? super Integer, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setOnViewUpdated(Function1<? super AbstractC1817030xNt, Unit> function1) {
        this.LLJILLL = function1;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0xOE] */
    public AbstractC1817030xNt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = context;
        this.LLILLJJLI = AbstractC19994813Le.Default.nextLong();
        this.LLILZIL = new C394501g7(EnumC389301fH.WIDGET, true, true, true, C418440Gaw.LIZIZ(285), 1073708954);
        this.LLILZLL = new C397301gZ(null, null, null, String.valueOf(SystemClock.currentThreadTimeMillis()), "board", null, null, 32671);
        this.LLIZLLLIL = new InterfaceC392301fl() { // from class: X.0xOE
            @Override // X.InterfaceC392301fl
            public final void LIZJ() {
            }

            @Override // X.InterfaceC392301fl
            public final void LIZIZ() {
                Function0<Unit> onBoardItemRenderError = this.LIZ.getOnBoardItemRenderError();
                if (onBoardItemRenderError != null) {
                    onBoardItemRenderError.invoke();
                }
            }

            @Override // X.InterfaceC392301fl
            public final void LIZ(boolean z) {
                if (z) {
                    this.LIZ.LJIIJ();
                }
            }
        };
        this.LLJI = C452501pT.LIZIZ(new C1817270xOH());
        this.LLJILLL = new C1817290xOJ();
        this.LLJJ = new C1817260xOG();
        this.LLJJIII = new C1817210xOB();
        this.LLJJIJI = new C1817170xO7();
    }

    public void LJIIIZ(C1817100xO0 c1817100xO0, DataChannel dataChannel) {
        String str;
        String str2;
        C196990125k c196990125kLJII;
        SourcePB sourcePB;
        setBoardId(c1817100xO0.LIZ.id);
        setGroupId(c1817100xO0.LJI.LIZ);
        this.LLJ = c1817100xO0.LIZ;
        getConfig().LIZIZ = c1817100xO0.LIZ.boardItemType;
        getConfig().LJJII = C488201vE.LIZ(c1817100xO0.LIZ, C488601vI.LIZ());
        C1814980xKa c1814980xKa = c1817100xO0.LJI;
        int i = c1817100xO0.LIZ.boardItemType;
        if (i != 5) {
            if (i != 6) {
                str = "board";
            } else {
                str = "scenery";
            }
        } else {
            str = "text";
        }
        c1814980xKa.LJII = str;
        this.LLIZ = c1814980xKa;
        C397301gZ boardSeiInfo = getBoardSeiInfo();
        boardSeiInfo.LIZ = String.valueOf(c1817100xO0.LJI.LIZ);
        C1814980xKa c1814980xKa2 = c1817100xO0.LJI;
        boardSeiInfo.LJ = c1814980xKa2.LJFF;
        boardSeiInfo.LIZLLL = c1814980xKa2.LJ;
        if (dataChannel != null) {
            getBoardSeiInfo().LIZIZ = c1817100xO0.LJI.LIZJ;
            getBoardSeiInfo().LIZJ = c1817100xO0.LJI.LIZLLL;
        }
        if (Intrinsics.LJFF(boardSeiInfo.LJ, "2")) {
            boardSeiInfo.LJIIIZ = c1817100xO0.LIZ.fullyCustomizedContent;
        }
        C1814980xKa c1814980xKa3 = c1817100xO0.LJI;
        String str3 = c1814980xKa3.LJIIIIZZ;
        if (str3 == null) {
            str3 = "";
        }
        boardSeiInfo.LJIIJ = str3;
        RecommendBoardInfo recommendBoardInfo = c1814980xKa3.LJI;
        if (recommendBoardInfo == null || (sourcePB = recommendBoardInfo.sourcePb) == null || (str2 = sourcePB.generateVersion) == null) {
            str2 = "";
        }
        boardSeiInfo.LJIIJJI = str2;
        this.LLJIJIL = C488201vE.LIZJ(c1817100xO0.LIZ, C488601vI.LIZ());
        this.LLJILLL = c1817100xO0.LIZIZ;
        this.LLJJ = c1817100xO0.LIZJ;
        this.LLJJI = c1817100xO0.LIZLLL;
        this.LLJJIII = c1817100xO0.LJ;
        this.LLJJIJI = c1817100xO0.LJFF;
        C1817080xNy viewModel = getViewModel();
        BoardItem boardItem = c1817100xO0.LIZ;
        InterfaceC971680bOQ interfaceC971680bOQ = viewModel.LIZ;
        if (interfaceC971680bOQ != null) {
            interfaceC971680bOQ.LJFF();
        }
        ((ArrayList) viewModel.LIZJ).clear();
        viewModel.LIZLLL = "";
        viewModel.LIZIZ = boardItem.boardItemType;
        BoardItemStyle boardItemStyle = boardItem.style;
        if (boardItemStyle == null) {
            boardItemStyle = new BoardItemStyle();
        }
        viewModel.LJ = boardItemStyle.LIZ();
        if (boardItem.fullyCustomizedContent.length() > 0) {
            viewModel.LIZLLL = boardItem.fullyCustomizedContent;
            if (C13LP.LJJLIIIJL(viewModel.LJ.fonts) == null) {
                viewModel.LIZ(0);
            }
        } else {
            int size = boardItem.boardItemTemplateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(i2, boardItem.boardItemContentList);
                if (objLJJJLZIJ != null) {
                    ((ArrayList) viewModel.LIZJ).add(new Pair(ListProtector.get(boardItem.boardItemTemplateList, i2), objLJJJLZIJ));
                    if (C13LP.LJJJLZIJ(i2, viewModel.LJ.fonts) == null) {
                        viewModel.LIZ(i2);
                    }
                }
            }
        }
        this.LLJILJIL = C786410Ut5.Td(C786410Ut5.ne(this.LL), getLayoutId(), this, false);
        LJIIIIZZ();
        if (LJIIJJI()) {
            InterfaceC971680bOQ interfaceC971680bOQ2 = getViewModel().LIZ;
            if (interfaceC971680bOQ2 != null) {
                c196990125kLJII = interfaceC971680bOQ2.LJII(this.LL, new C1817250xOF(this), new C1817280xOI());
            } else {
                c196990125kLJII = null;
            }
            this.LLJILJILJ = c196990125kLJII;
        } else {
            LJIILIIL();
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        addView(this.LLJILJIL);
    }

    @Override // X.InterfaceC395901gL
    public final void LJ(float f, float f2, float f3, float f4) {
        C397101gX.LIZJ(this, f, f2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            String str = LLJJIJIIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSizeChanged w=");
            sbLIZ.append(i);
            sbLIZ.append(", h=");
            sbLIZ.append(i2);
            C0TFO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJILJIL != null) {
                LJII(this);
            }
        }
    }
}
