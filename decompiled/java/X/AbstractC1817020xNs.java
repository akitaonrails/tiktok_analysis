package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.BoardItemLayout;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SourcePB;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1817020xNs extends FrameLayout implements InterfaceC395901gL {
    public static final String LLJJIJI = AbstractC1817020xNs.class.getSimpleName();
    public final Context LL;
    public long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public InterfaceC1817340xOO LLILZIL;
    public final C397301gZ LLILZLL;
    public BoardItem LLIZ;
    public C1814980xKa LLIZLLLIL;
    public final C1817140xO4 LLJ;
    public View LLJI;
    public Function1<? super AbstractC1817020xNs, Unit> LLJIJIL;
    public final boolean LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public Function0<Unit> LLJILLL;
    public Function2<? super Long, ? super C1814980xKa, Unit> LLJJ;
    public InterfaceC1631630sYr<? super Boolean, ? super Long, ? super BoardItemPosition, ? super C1814980xKa, Unit> LLJJI;
    public InterfaceC1631630sYr<? super Float, ? super Boolean, ? super Long, ? super C1814980xKa, Unit> LLJJIII;

    @Override // X.InterfaceC395901gL
    public final void LIZLLL() {
    }

    public abstract void LJIIIZ();

    public void LJIILIIL() {
    }

    public abstract void LJIILJJIL();

    public abstract /* synthetic */ C394501g7 getConfig();

    public abstract long getCurrentBoardIdentifier();

    public abstract /* synthetic */ int getLayoutId();

    @Override // X.InterfaceC395901gL
    public final boolean LJI() {
        return getConfig().LJFF;
    }

    public void LJFF() {
        C397101gX.LIZ(this);
    }

    public boolean getAutoNotifyViewUpdated() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC395901gL
    public long getBoardId() {
        return this.LLILLJJLI;
    }

    public final BoardItem getBoardItem() {
        return this.LLIZ;
    }

    public final C1814980xKa getBoardLogInfo() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC395901gL
    public C397301gZ getBoardSeiInfo() {
        return this.LLILZLL;
    }

    public final View getContentView() {
        return this.LLJI;
    }

    @Override // X.InterfaceC395901gL
    public long getGroupId() {
        return this.LLILLL;
    }

    public final long getHostRoomId() {
        return this.LLILZ;
    }

    public final InterfaceC1631630sYr<Boolean, Long, BoardItemPosition, C1814980xKa, Unit> getOnBoardItemMoved() {
        return this.LLJJI;
    }

    public final Function2<Long, C1814980xKa, Unit> getOnBoardItemRemoved() {
        return this.LLJJ;
    }

    public final Function0<Unit> getOnBoardItemRenderError() {
        return this.LLJILLL;
    }

    public final Function0<Unit> getOnClick() {
        return this.LLJILJILJ;
    }

    public final InterfaceC1631630sYr<Float, Boolean, Long, C1814980xKa, Unit> getOnScaleChanged() {
        return this.LLJJIII;
    }

    public final Function1<AbstractC1817020xNs, Unit> getOnViewUpdated() {
        return this.LLJIJIL;
    }

    public final InterfaceC1817340xOO getPositionState() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC395901gL
    public InterfaceC392301fl getStatusCallback() {
        return this.LLJ;
    }

    @Override // X.InterfaceC395901gL
    public View getView() {
        return this.LLJI;
    }

    public static void LJII(final AbstractC1817020xNs abstractC1817020xNs) {
        abstractC1817020xNs.getClass();
        HandlerHook.viewPostDelay(abstractC1817020xNs, new Runnable() { // from class: X.0xO2
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsDecorationBoardItem@901b.callbackOnUiUpdated$1");
                try {
                    final View view = this.LL.getView();
                    if (view != null) {
                        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            final AbstractC1817020xNs abstractC1817020xNs2 = this.LL;
                            C786410Ut5.x3(viewTreeObserver, new ViewTreeObserver.OnGlobalLayoutListener(view, abstractC1817020xNs2) { // from class: X.0xOM
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
                C1C7U.LIZIZ("AbsDecorationBoardItem@901b.callbackOnUiUpdated$1");
            }
        }, 10L);
    }

    @Override // X.InterfaceC395901gL
    public final void LIZ(boolean z) {
        this.LLJJI.invoke(Boolean.valueOf(z), Long.valueOf(getCurrentBoardIdentifier()), C488701vJ.LIZJ(getConfig().LJII, getConfig().LJIIIIZZ, getConfig().LJIIIZ, getConfig().LJIIJ), this.LLIZLLLIL);
    }

    @Override // X.InterfaceC395901gL
    public final void LIZIZ(boolean z) {
        this.LLJJIII.invoke(Float.valueOf(getConfig().LJJ), Boolean.valueOf(z), Long.valueOf(getCurrentBoardIdentifier()), this.LLIZLLLIL);
    }

    @Override // X.InterfaceC395901gL
    public final void LIZJ(float f) {
        C397101gX.LIZLLL(this, f);
    }

    public final void LJIIL(View view) {
        Long lValueOf;
        Long lValueOf2;
        Pair pair;
        Long lValueOf3;
        boolean z;
        InterfaceC1816580xNA interfaceC1816580xNA;
        Pair<Float, Float> pairLIZ;
        Pair<Float, Float> pair2;
        Long lValueOf4;
        boolean z2;
        BoardItemLayout boardItemLayoutLIZ;
        getConfig().LJIIIZ = view.getMeasuredWidth();
        getConfig().LJIIJ = view.getMeasuredHeight();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Producer-ViewDump] boardId=");
        BoardItem boardItem = this.LLIZ;
        Long lValueOf5 = null;
        if (boardItem != null) {
            lValueOf = Long.valueOf(boardItem.id);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" | ");
        sbLIZ.append(LJIIIIZZ(0, view));
        C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1817340xOO interfaceC1817340xOO = this.LLILZIL;
        if (interfaceC1817340xOO instanceof C1817350xOP) {
            BoardItem boardItem2 = this.LLIZ;
            if (boardItem2 != null && (boardItemLayoutLIZ = C488201vE.LIZ(boardItem2, C488601vI.LIZ())) != null) {
                z = !boardItemLayoutLIZ.isValid;
            } else {
                z = true;
            }
            if (z) {
                BoardItemPosition boardItemPosition = ((C1817350xOP) interfaceC1817340xOO).LIZ;
                pair = C488701vJ.LIZ(boardItemPosition, getConfig().LJIIIZ, getConfig().LJIIJ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[Producer-ServerPos] boardId=");
                BoardItem boardItem3 = this.LLIZ;
                if (boardItem3 != null) {
                    lValueOf5 = Long.valueOf(boardItem3.id);
                }
                sbLIZ2.append(lValueOf5);
                sbLIZ2.append(" | serverPos=(x=");
                sbLIZ2.append(boardItemPosition.x);
                sbLIZ2.append(", y=");
                sbLIZ2.append(boardItemPosition.y);
                sbLIZ2.append(", pctX=");
                sbLIZ2.append(boardItemPosition.percentageX);
                sbLIZ2.append(", pctY=");
                sbLIZ2.append(boardItemPosition.percentageY);
                sbLIZ2.append(") | viewSize=(");
                sbLIZ2.append(getConfig().LJIIIZ);
                sbLIZ2.append(", ");
                sbLIZ2.append(getConfig().LJIIJ);
                sbLIZ2.append(") | windowPos=");
                sbLIZ2.append(pair);
                C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                ViewParent parent = getParent();
                while (true) {
                    if (parent != null) {
                        if (parent instanceof InterfaceC1816580xNA) {
                            interfaceC1816580xNA = (InterfaceC1816580xNA) parent;
                            if (interfaceC1816580xNA != null) {
                                pairLIZ = interfaceC1816580xNA.LIZ(this, this.LLIZ);
                                if (pairLIZ != null) {
                                    pair2 = pairLIZ;
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
                pair2 = new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
                float fFloatValue = pair2.getFirst().floatValue();
                float fFloatValue2 = pair2.getSecond().floatValue();
                BoardItemPosition boardItemPositionLIZIZ = C488701vJ.LIZIZ(fFloatValue, fFloatValue2);
                BoardItemPosition boardItemPosition2 = ((C1817350xOP) interfaceC1817340xOO).LIZ;
                BoardItem boardItem4 = this.LLIZ;
                if (boardItem4 != null) {
                    boardItem4.canvasPosition = boardItemPositionLIZIZ;
                    boardItem4.canvasItemLayout = null;
                    boardItem4.boardItemLayout = null;
                }
                pair = C488701vJ.LIZ(boardItemPositionLIZIZ, getConfig().LJIIIZ, getConfig().LJIIJ);
                StringBuilder sb = new StringBuilder("[Producer-VirtualCanvas] boardId=");
                BoardItem boardItem5 = this.LLIZ;
                if (boardItem5 != null) {
                    lValueOf4 = Long.valueOf(boardItem5.id);
                } else {
                    lValueOf4 = null;
                }
                sb.append(lValueOf4);
                sb.append(" | hasVirtualMeasure=");
                if (interfaceC1816580xNA != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sb.append(z2);
                sb.append(" | virtualResult=");
                sb.append(pairLIZ);
                sb.append(" | center390=(");
                sb.append(fFloatValue);
                sb.append(", ");
                sb.append(fFloatValue2);
                sb.append(") | resolvedPos=(x=");
                sb.append(boardItemPositionLIZIZ.x);
                sb.append(", y=");
                sb.append(boardItemPositionLIZIZ.y);
                sb.append(") | discardedServerPos=(x=");
                sb.append(boardItemPosition2.x);
                sb.append(", y=");
                sb.append(boardItemPosition2.y);
                sb.append(", pctX=");
                sb.append(boardItemPosition2.percentageX);
                sb.append(", pctY=");
                sb.append(boardItemPosition2.percentageY);
                sb.append(") | viewSize=(");
                sb.append(getConfig().LJIIIZ);
                sb.append(", ");
                sb.append(getConfig().LJIIJ);
                sb.append(") | windowPos=");
                sb.append(pair);
                C1092200eWo.LIZ(sb.toString());
            }
        } else if (interfaceC1817340xOO instanceof C1817410xOV) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[Producer-AlreadySet] boardId=");
            BoardItem boardItem6 = this.LLIZ;
            if (boardItem6 != null) {
                lValueOf2 = Long.valueOf(boardItem6.id);
            } else {
                lValueOf2 = null;
            }
            sbLIZ3.append(lValueOf2);
            sbLIZ3.append(" | xWindow=");
            sbLIZ3.append(getConfig().LJII);
            sbLIZ3.append(", yWindow=");
            sbLIZ3.append(getConfig().LJIIIIZZ);
            C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            pair = new Pair(Float.valueOf(getConfig().LJII), Float.valueOf(getConfig().LJIIIIZZ));
        } else {
            throw new C1954807lC();
        }
        float fFloatValue3 = ((Number) pair.getFirst()).floatValue();
        float fFloatValue4 = ((Number) pair.getSecond()).floatValue();
        getConfig().LJII = fFloatValue3;
        getConfig().LJIIIIZZ = fFloatValue4;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[Producer-Final] boardId=");
        BoardItem boardItem7 = this.LLIZ;
        if (boardItem7 != null) {
            lValueOf3 = Long.valueOf(boardItem7.id);
        } else {
            lValueOf3 = null;
        }
        sbLIZ4.append(lValueOf3);
        sbLIZ4.append(" | config.xWindow=");
        sbLIZ4.append(fFloatValue3);
        sbLIZ4.append(", config.yWindow=");
        sbLIZ4.append(fFloatValue4);
        sbLIZ4.append(" | config.wWindow=");
        sbLIZ4.append(getConfig().LJIIIZ);
        sbLIZ4.append(", config.hWindow=");
        sbLIZ4.append(getConfig().LJIIJ);
        sbLIZ4.append(" | effectiveScale=");
        C394501g7 config = getConfig();
        sbLIZ4.append(config.LJJ * config.LJJIIZ);
        C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        String str = LLJJIJI;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("updateContentSize, w=");
        sbLIZ5.append(getConfig().LJIIIZ);
        sbLIZ5.append(" h=");
        sbLIZ5.append(getConfig().LJIIJ);
        C0TFO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ5));
        LJFF();
        LJIILIIL();
        this.LLILZIL = new InterfaceC1817340xOO() { // from class: X.0xOV
        };
        if (getAutoNotifyViewUpdated()) {
            this.LLJIJIL.invoke(this);
        }
    }

    public void setBoardId(long j) {
        this.LLILLJJLI = j;
    }

    public final void setBoardItem(BoardItem boardItem) {
        this.LLIZ = boardItem;
    }

    public final void setBoardLogInfo(C1814980xKa c1814980xKa) {
        this.LLIZLLLIL = c1814980xKa;
    }

    public final void setContentView(View view) {
        this.LLJI = view;
    }

    public void setGroupId(long j) {
        this.LLILLL = j;
    }

    public final void setHostRoomId(long j) {
        this.LLILZ = j;
    }

    public final void setOnBoardItemMoved(InterfaceC1631630sYr<? super Boolean, ? super Long, ? super BoardItemPosition, ? super C1814980xKa, Unit> interfaceC1631630sYr) {
        this.LLJJI = interfaceC1631630sYr;
    }

    public final void setOnBoardItemRemoved(Function2<? super Long, ? super C1814980xKa, Unit> function2) {
        this.LLJJ = function2;
    }

    public final void setOnBoardItemRenderError(Function0<Unit> function0) {
        this.LLJILLL = function0;
    }

    public final void setOnClick(Function0<Unit> function0) {
        this.LLJILJILJ = function0;
    }

    public final void setOnScaleChanged(InterfaceC1631630sYr<? super Float, ? super Boolean, ? super Long, ? super C1814980xKa, Unit> interfaceC1631630sYr) {
        this.LLJJIII = interfaceC1631630sYr;
    }

    public final void setOnViewUpdated(Function1<? super AbstractC1817020xNs, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setPositionState(InterfaceC1817340xOO interfaceC1817340xOO) {
        this.LLILZIL = interfaceC1817340xOO;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0xO4] */
    public AbstractC1817020xNs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = context;
        this.LLILLJJLI = AbstractC19994813Le.Default.nextLong();
        this.LLILZIL = new C1817350xOP(new BoardItemPosition());
        this.LLILZLL = new C397301gZ(null, null, null, String.valueOf(SystemClock.currentThreadTimeMillis()), "board", null, null, 32671);
        this.LLJ = new InterfaceC392301fl() { // from class: X.0xO4
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
                    AbstractC1817020xNs abstractC1817020xNs = this.LIZ;
                    abstractC1817020xNs.LLJJ.invoke(Long.valueOf(abstractC1817020xNs.getCurrentBoardIdentifier()), abstractC1817020xNs.LLIZLLLIL);
                }
            }
        };
        this.LLJIJIL = new C1817300xOK();
        this.LLJILJIL = true;
        this.LLJILJILJ = new C1817330xON();
        this.LLJJ = new C1817220xOC();
        this.LLJJI = new C1817180xO8();
        this.LLJJIII = new C1817130xO3();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(int r6, android.view.View r7) {
        /*
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            if (r0 == 0) goto L19
            int r1 = r0.width
            r0 = -2
            if (r1 == r0) goto Lb3
            r0 = -1
            if (r1 == r0) goto Laf
            java.lang.String r3 = java.lang.String.valueOf(r1)
            if (r3 != 0) goto L1b
        L19:
            java.lang.String r3 = "null"
        L1b:
            boolean r0 = r7 instanceof android.widget.TextView
            if (r0 == 0) goto Lac
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = " maxWidth="
            r1.append(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getMaxWidth()
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
        L36:
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            int r1 = r6 * 2
            java.lang.String r0 = " "
            java.lang.String r0 = kotlin.text.u.LJJ(r1, r0)
            r5.append(r0)
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r5)
            r4.append(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r0 = 40
            r1.append(r0)
            int r0 = r7.getMeasuredWidth()
            r1.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r1.append(r0)
            int r0 = r7.getMeasuredHeight()
            r1.append(r0)
            java.lang.String r0 = ", lpW="
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r4.append(r0)
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lb7
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r3 = r7.getChildCount()
            r2 = 0
        L95:
            if (r2 >= r3) goto Lb7
            java.lang.String r0 = " -> "
            r4.append(r0)
            android.view.View r1 = r7.getChildAt(r2)
            int r0 = r6 + 1
            java.lang.String r0 = LJIIIIZZ(r0, r1)
            r4.append(r0)
            int r2 = r2 + 1
            goto L95
        Lac:
            java.lang.String r2 = ""
            goto L36
        Laf:
            java.lang.String r3 = "MATCH_PARENT"
            goto L1b
        Lb3:
            java.lang.String r3 = "WRAP_CONTENT"
            goto L1b
        Lb7:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1817020xNs.LJIIIIZZ(int, android.view.View):java.lang.String");
    }

    public void LJIIJ(C1816930xNj c1816930xNj, DataChannel dataChannel) {
        boolean z;
        String str;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        Long lValueOf6;
        Long lValueOf7;
        Long lValueOf8;
        Long lValueOf9;
        Long lValueOf10;
        Long lValueOf11;
        Long lValueOf12;
        boolean z2;
        boolean z3;
        SourcePB sourcePB;
        String str2;
        BoardItem boardItem = c1816930xNj.LIZ;
        this.LLIZ = boardItem;
        setBoardId(boardItem.id);
        this.LLILZ = c1816930xNj.LJIIJJI;
        getConfig().LIZIZ = c1816930xNj.LIZ.boardItemType;
        C394501g7 config = getConfig();
        boolean z4 = false;
        if (c1816930xNj.LIZ.matting) {
            z = true;
        } else {
            z = false;
        }
        config.LJI = z;
        setGroupId(c1816930xNj.LJIIJ.LIZ);
        C1814980xKa c1814980xKa = c1816930xNj.LJIIJ;
        int i = c1816930xNj.LIZ.boardItemType;
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
        this.LLIZLLLIL = c1814980xKa;
        C397301gZ boardSeiInfo = getBoardSeiInfo();
        boardSeiInfo.LIZ = String.valueOf(c1816930xNj.LJIIJ.LIZ);
        C1814980xKa c1814980xKa2 = c1816930xNj.LJIIJ;
        boardSeiInfo.LJ = c1814980xKa2.LJFF;
        boardSeiInfo.LIZLLL = c1814980xKa2.LJ;
        if (dataChannel != null) {
            getBoardSeiInfo().LIZIZ = c1816930xNj.LJIIJ.LIZJ;
            getBoardSeiInfo().LIZJ = c1816930xNj.LJIIJ.LIZLLL;
        }
        C1814980xKa c1814980xKa3 = c1816930xNj.LJIIJ;
        String str3 = c1814980xKa3.LJIIIIZZ;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        boardSeiInfo.LJIIJ = str3;
        RecommendBoardInfo recommendBoardInfo = c1814980xKa3.LJI;
        if (recommendBoardInfo != null && (sourcePB = recommendBoardInfo.sourcePb) != null && (str2 = sourcePB.generateVersion) != null) {
            str4 = str2;
        }
        boardSeiInfo.LJIIJJI = str4;
        getConfig().LJJIIZ = C488601vI.LIZ().LIZ / C488301vF.LJ;
        this.LLJIJIL = c1816930xNj.LJ;
        this.LLJILJILJ = c1816930xNj.LJFF;
        this.LLJILLL = c1816930xNj.LJI;
        this.LLJJ = c1816930xNj.LJII;
        this.LLJJI = c1816930xNj.LJIIIIZZ;
        this.LLJJIII = c1816930xNj.LJIIIZ;
        this.LLJI = C786410Ut5.Td(C786410Ut5.ne(this.LL), getLayoutId(), this, false);
        BoardItemPosition boardItemPositionLIZJ = C488201vE.LIZJ(c1816930xNj.LIZ, C488601vI.LIZ());
        if (boardItemPositionLIZJ == null) {
            boardItemPositionLIZJ = new BoardItemPosition();
        }
        this.LLILZIL = new C1817350xOP(boardItemPositionLIZJ);
        BoardItem boardItem2 = c1816930xNj.LIZ;
        BoardItemPosition boardItemPosition = boardItem2.canvasPosition;
        BoardItemPosition boardItemPosition2 = boardItem2.position;
        BoardItemPosition boardItemPositionLIZJ2 = C488201vE.LIZJ(boardItem2, C488601vI.LIZ());
        StringBuilder sb = new StringBuilder("[Producer-Init] boardId=");
        sb.append(c1816930xNj.LIZ.id);
        sb.append(" | canvasPosition=(x=");
        if (boardItemPosition != null) {
            lValueOf = Long.valueOf(boardItemPosition.x);
        } else {
            lValueOf = null;
        }
        sb.append(lValueOf);
        sb.append(", y=");
        if (boardItemPosition != null) {
            lValueOf2 = Long.valueOf(boardItemPosition.y);
        } else {
            lValueOf2 = null;
        }
        sb.append(lValueOf2);
        sb.append(", pctX=");
        if (boardItemPosition != null) {
            lValueOf3 = Long.valueOf(boardItemPosition.percentageX);
        } else {
            lValueOf3 = null;
        }
        sb.append(lValueOf3);
        sb.append(", pctY=");
        if (boardItemPosition != null) {
            lValueOf4 = Long.valueOf(boardItemPosition.percentageY);
        } else {
            lValueOf4 = null;
        }
        sb.append(lValueOf4);
        sb.append(") | legacyPosition=(x=");
        if (boardItemPosition2 != null) {
            lValueOf5 = Long.valueOf(boardItemPosition2.x);
        } else {
            lValueOf5 = null;
        }
        sb.append(lValueOf5);
        sb.append(", y=");
        if (boardItemPosition2 != null) {
            lValueOf6 = Long.valueOf(boardItemPosition2.y);
        } else {
            lValueOf6 = null;
        }
        sb.append(lValueOf6);
        sb.append(", pctX=");
        if (boardItemPosition2 != null) {
            lValueOf7 = Long.valueOf(boardItemPosition2.percentageX);
        } else {
            lValueOf7 = null;
        }
        sb.append(lValueOf7);
        sb.append(", pctY=");
        if (boardItemPosition2 != null) {
            lValueOf8 = Long.valueOf(boardItemPosition2.percentageY);
        } else {
            lValueOf8 = null;
        }
        sb.append(lValueOf8);
        sb.append(") | unifiedPos=(x=");
        if (boardItemPositionLIZJ2 != null) {
            lValueOf9 = Long.valueOf(boardItemPositionLIZJ2.x);
        } else {
            lValueOf9 = null;
        }
        sb.append(lValueOf9);
        sb.append(", y=");
        if (boardItemPositionLIZJ2 != null) {
            lValueOf10 = Long.valueOf(boardItemPositionLIZJ2.y);
        } else {
            lValueOf10 = null;
        }
        sb.append(lValueOf10);
        sb.append(", pctX=");
        if (boardItemPositionLIZJ2 != null) {
            lValueOf11 = Long.valueOf(boardItemPositionLIZJ2.percentageX);
        } else {
            lValueOf11 = null;
        }
        sb.append(lValueOf11);
        sb.append(", pctY=");
        if (boardItemPositionLIZJ2 != null) {
            lValueOf12 = Long.valueOf(boardItemPositionLIZJ2.percentageY);
        } else {
            lValueOf12 = null;
        }
        sb.append(lValueOf12);
        sb.append(") | hasCanvasItemLayout=");
        if (c1816930xNj.LIZ.canvasItemLayout != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sb.append(z2);
        sb.append(" | hasBoardItemLayout=");
        if (c1816930xNj.LIZ.boardItemLayout != null) {
            z4 = true;
        }
        sb.append(z4);
        sb.append(" | unifiedLayoutValid=");
        BoardItemLayout boardItemLayoutLIZ = C488201vE.LIZ(c1816930xNj.LIZ, C488601vI.LIZ());
        if (boardItemLayoutLIZ == null) {
            z3 = true;
        } else {
            z3 = !boardItemLayoutLIZ.isValid;
        }
        sb.append(!z3);
        C1092200eWo.LIZ(sb.toString());
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        C0TFO.LIZ(LLJJIJI, "initial view");
        LJIIIZ();
        LJIILJJIL();
        addView(this.LLJI);
    }

    public final void LJIIJJI(long j, String str, Throwable th) {
        int i;
        String str2;
        String string;
        String str3;
        C1814980xKa c1814980xKa = this.LLIZLLLIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_image_load");
        c474500IjALIZ.LJJII(str, "image_kind");
        if (th == null) {
            i = 0;
        } else {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "result");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration_ms");
        String string2 = null;
        if (c1814980xKa != null) {
            string2 = Long.valueOf(c1814980xKa.LIZ).toString();
        }
        String str4 = "";
        if (string2 == null) {
            string2 = "";
        }
        c474500IjALIZ.LJJII(string2, "decoration_set_id");
        if (c1814980xKa == null || (str2 = c1814980xKa.LIZJ) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "anchor_id");
        if (c1814980xKa == null || (string = Long.valueOf(c1814980xKa.LIZIZ).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "item_id");
        if (c1814980xKa == null || (str3 = c1814980xKa.LJIIIZ) == null) {
            str3 = "";
        }
        c474500IjALIZ.LJJII(str3, Scene.SCENE_SERVICE);
        if (th != null) {
            c474500IjALIZ.LJJII(-1, "error_code");
            String message = th.getMessage();
            if (message != null) {
                str4 = message;
            }
            c474500IjALIZ.LJJII(str4, "error_msg");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC395901gL
    public final void LJ(float f, float f2, float f3, float f4) {
        C397101gX.LIZJ(this, f, f2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            String str = LLJJIJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSizeChanged w=");
            sbLIZ.append(i);
            sbLIZ.append(", h=");
            sbLIZ.append(i2);
            C0TFO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJI != null) {
                LJII(this);
            }
        }
    }
}
