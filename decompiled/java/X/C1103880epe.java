package X;

import Y.AfS186S0100000_17;
import android.content.Context;
import android.graphics.Outline;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.host_board.BoardCell;
import webcast.data.host_board.HostBoard;
import wh6.AbS698S0100000_17;

/* JADX INFO: renamed from: X.0epe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103880epe extends LinearLayout implements InterfaceC1085190eLV, InterfaceC1103990epp {
    public static final int LLJJIJI = C439101nJ.LIZ(117);
    public static final int LLJJIJIIJIL = C439101nJ.LIZ(193);
    public static final int LLJJIJIL = C439101nJ.LIZ(75);
    public static final int LLJJJ = C439101nJ.LIZ(129);
    public static final int LLJJJIL = C439101nJ.LIZ(115);
    public static final int LLJJJJ = C439101nJ.LIZ(8);
    public final C201700q7 LL;
    public final C1103890epf LLILLJJLI;
    public final C11NJ LLILLL;
    public final C20632315oP LLILZ;
    public final C434320H1i LLILZIL;
    public final FrameLayout LLILZLL;
    public final LiveIconView LLIZ;
    public final C1103940epk LLIZLLLIL;
    public InterfaceC1088180eQK LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;

    private final String getUserType() {
        C201700q7 c201700q7 = this.LL;
        return c201700q7.LIZJ == C011V.BROADCAST ? "anchor" : C01C5.LIZ(c201700q7.LJ) ? "admin" : "viewer";
    }

    @Override // X.InterfaceC1085190eLV
    public final void LIZ() {
        this.LLIZLLLIL.notifyDataSetChanged();
    }

    public final void LJI() {
        AbstractC1103960epm abstractC1103960epm;
        boolean z = (this.LLJI || this.LL.LIZJ == C011V.PREVIEW_CARD) ? false : true;
        this.LLILZ.setUserInputEnabled(z);
        this.LLILLJJLI.LIZ.setValue(Boolean.valueOf(z));
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((RecyclerView) this.LLILZ.getChildAt(0)).findViewHolderForAdapterPosition(this.LLILZ.getCurrentItem());
        if (!(viewHolderFindViewHolderForAdapterPosition instanceof AbstractC1103960epm) || (abstractC1103960epm = (AbstractC1103960epm) viewHolderFindViewHolderForAdapterPosition) == null) {
            return;
        }
        abstractC1103960epm.LJJJJLI();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILLL.LIZ(C784440Upu.LIZ().LJFF(this.LL.LIZLLL, C1103910eph.class).LIZJ(new AfS186S0100000_17(this, 200)));
        this.LLILLL.LIZ(C784440Upu.LIZ().LJFF(this.LL.LIZLLL, C201100q1.class).LIZJ(new C516201zk(this, 349)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILLL.LJ();
    }

    public final C201700q7 getConfig() {
        return this.LL;
    }

    public final C1103890epf getViewState() {
        return this.LLILLJJLI;
    }

    public static String LIZLLL(HostBoard hostBoard) {
        BoardCell next;
        int i;
        Iterator<BoardCell> it2 = hostBoard.cellList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.type, "title")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BoardCell boardCell = next;
        if (boardCell != null) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(62);
            textPaint.setTypeface(c444890HcV.getTypeface());
            if (boardCell.icon != null) {
                i = 82;
            } else {
                i = 101;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            String str = boardCell.text;
            if (StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, iLIZIZ).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).build().getLineCount() > 2) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "1";
        }
        return "-1";
    }

    @Override // X.InterfaceC1103990epp
    public final void LIZIZ(int i) {
        int iLIZIZ;
        int iLIZIZ2 = 0;
        if (C500260Jjc.LJJJJIZL(this.LLILZIL)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            iLIZIZ = 0;
        }
        if (C500260Jjc.LJJJJIZL(this.LLILZLL)) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        }
        if (!this.LLJILJILJ && !this.LLJI) {
            this.LLJILLL = i + iLIZIZ + iLIZIZ2;
        }
        if (!C500260Jjc.LJJJJIZL(this)) {
            C21460718yj c21460718yj = new C21460718yj();
            c21460718yj.LLILLL = 200L;
            C19748612Om.LIZ(this, c21460718yj);
            C500260Jjc.LLFFF(this);
        }
    }

    public final void LJFF(int i) {
        HostBoard hostBoard;
        C2757014x c2757014x = (C2757014x) C13LP.LJJJLZIJ(i, this.LLIZLLLIL.LLILLJJLI.LJFF);
        if (c2757014x != null && (hostBoard = c2757014x.LIZ) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_component_show");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(hostBoard.templateId, "template_id");
            c474500IjALIZ.LJJII(hostBoard.bizTemplateId, "business_template_id");
            c474500IjALIZ.LJJII(hostBoard.boardId, "board_id");
            c474500IjALIZ.LJJII(hostBoard.bizType, "biz_type");
            c474500IjALIZ.LJJII(hostBoard.subBizType, "sub_biz_type");
            c474500IjALIZ.LJJII(getUserType(), "user_type");
            c474500IjALIZ.LJJII(LIZLLL(hostBoard), "is_title_complete_show");
            c474500IjALIZ.LJJIIZI(this.LL.LJFF);
            DataChannel dataChannel = this.LL.LJ;
            if (dataChannel != null) {
                c474500IjALIZ.LJIJJLI(dataChannel);
            }
            c474500IjALIZ.LIZ();
            C784440Upu.LIZ().LIZIZ(new C201000q0(hostBoard));
            InterfaceC1103900epg interfaceC1103900epgXd1 = ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).xd1(hostBoard.bizType);
            if (interfaceC1103900epgXd1 != null) {
                interfaceC1103900epgXd1.LIZ(hostBoard, this.LL);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.00q7 r0 = r6.LL
            X.011V r1 = r0.LIZJ
            X.011V r0 = X.C011V.PREVIEW_CARD
            if (r1 != r0) goto Ld
            boolean r0 = super.onInterceptTouchEvent(r7)
            return r0
        Ld:
            int r0 = r7.getActionMasked()
            r5 = 3
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L26
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L1d:
            X.0eQK r2 = r6.LLJ
            if (r2 != 0) goto L3a
            boolean r0 = super.onInterceptTouchEvent(r7)
            return r0
        L26:
            int r0 = r7.getActionMasked()
            if (r0 == r3) goto L32
            int r0 = r7.getActionMasked()
            if (r0 != r5) goto L1d
        L32:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L1d
        L3a:
            r2.LIZIZ(r7)
            int r1 = r7.getActionMasked()
            if (r1 == 0) goto L5d
            if (r1 == r3) goto L56
            r0 = 2
            if (r1 == r0) goto L4f
            if (r1 == r5) goto L56
        L4a:
            boolean r0 = super.onInterceptTouchEvent(r7)
            return r0
        L4f:
            boolean r0 = r2.LIZJ()
            if (r0 == 0) goto L4a
            return r3
        L56:
            boolean r0 = r2.LIZJ()
            if (r0 == 0) goto L4a
            return r3
        L5d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1103880epe.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1088180eQK interfaceC1088180eQK = this.LLJ;
        if (interfaceC1088180eQK == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (interfaceC1088180eQK.LIZJ()) {
            interfaceC1088180eQK.onTouchEvent(motionEvent);
            return true;
        }
        return false;
    }

    public final void setDragTouchBridge(InterfaceC1088180eQK interfaceC1088180eQK) {
        this.LLJ = interfaceC1088180eQK;
    }

    @Override // X.InterfaceC1085190eLV
    public void setupData(C201600q6 c201600q6) {
        boolean z;
        int i;
        int i2;
        C201600q6 c201600q6LIZ = C201400q4.LIZ(c201600q6);
        List<C2757014x> list = c201600q6LIZ.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C2757014x> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ.boardId);
        }
        C19719612Di.LJJIIJ(c201600q6LIZ.LIZ, new C5183020f(this, 371), true);
        List<C2757014x> list2 = c201600q6LIZ.LIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C2757014x> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().LIZ.boardId);
        }
        if (c201600q6LIZ.LIZ.isEmpty()) {
            C500260Jjc.LJIILLIIL(this);
            return;
        }
        C011V c011v = this.LL.LIZJ;
        C011V c011v2 = C011V.PREVIEW_CARD;
        if (c011v == c011v2 && c201600q6LIZ.LIZ.size() > 1) {
            List<C2757014x> list3 = c201600q6LIZ.LIZ;
            list3.subList(1, list3.size()).clear();
        }
        C500260Jjc.LLFFF(this.LLILZLL);
        C500260Jjc.LLFFF(this.LLILZIL);
        if (this.LL.LIZJ == c011v2 || !c201600q6LIZ.LIZIZ()) {
            C500260Jjc.LJIILIIL(this.LLILZLL);
        }
        List<C2757014x> list4 = c201600q6LIZ.LIZ;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            z = false;
            i = LLJJIJI;
        } else {
            Iterator<C2757014x> it4 = list4.iterator();
            while (it4.hasNext()) {
                if (it4.next().LIZIZ != null) {
                    z = true;
                    i = LLJJJ;
                    break;
                }
            }
            z = false;
            i = LLJJIJI;
        }
        this.LLJJ = i;
        this.LLJJI = LLJJIJIIJIL;
        if (z) {
            i2 = LLJJJIL;
        } else {
            i2 = LLJJIJIL;
        }
        this.LLJJIII = i2;
        if (C500260Jjc.LJJJJIZL(this.LLILZLL)) {
            int i3 = this.LLJJI;
            int i4 = LLJJJJ;
            this.LLJJI = i3 + i4;
            this.LLJJIII += i4;
        }
        C1103940epk c1103940epk = this.LLIZLLLIL;
        List<C2757014x> list5 = c201600q6LIZ.LIZ;
        c1103940epk.getClass();
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list5, 10));
        Iterator<C2757014x> it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList3.add(it5.next().LIZ.boardId);
        }
        c1103940epk.LLILLJJLI.LIZIZ(list5, null);
        this.LLILZIL.setup(c201600q6LIZ.LIZ.size());
        C434320H1i c434320H1i = this.LLILZIL;
        int currentItem = this.LLILZ.getCurrentItem();
        c434320H1i.getClass();
        c434320H1i.LLILLL = Math.min(Math.max(0, currentItem), Math.max(0, c434320H1i.LLILLJJLI - 1));
        c434320H1i.LLILZ = 0.0f;
        c434320H1i.invalidate();
        if (this.LLJI) {
            C500260Jjc.LJIILIIL(this.LLILZIL);
        }
        LJI();
        InterfaceC1088180eQK interfaceC1088180eQK = this.LLJ;
        if (interfaceC1088180eQK != null) {
            c201600q6LIZ.LIZ();
            interfaceC1088180eQK.LIZ();
        }
        if ((!c201600q6LIZ.LIZ.isEmpty()) && this.LLILZ.getCurrentItem() != this.LLJIJIL) {
            this.LLJIJIL = this.LLILZ.getCurrentItem();
            LJFF(this.LLILZ.getCurrentItem());
        } else if (c201600q6LIZ.LIZ.isEmpty()) {
            this.LLJIJIL = -1;
        }
        this.LLJILJILJ = false;
        this.LLJILLL = 0;
    }

    public C1103880epe(Context context, C201700q7 c201700q7) {
        super(context, null);
        this.LL = c201700q7;
        this.LLILLJJLI = new C1103890epf();
        this.LLILLL = new C11NJ();
        C1103940epk c1103940epk = new C1103940epk(this);
        this.LLIZLLLIL = c1103940epk;
        this.LLJIJIL = -1;
        this.LLJJ = LLJJIJI;
        this.LLJJI = LLJJIJIIJIL;
        this.LLJJIII = LLJJIJIL;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fzx, this, true);
        setOrientation(1);
        setBackground(context.getDrawable(R.drawable.dm8));
        setOutlineProvider(new ViewOutlineProvider() { // from class: X.0eOT
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                int height;
                int width = 0;
                if (view != null) {
                    height = view.getHeight();
                    if (height > 0 && C500260Jjc.LJJJJIZL(this.LIZ.LLILZLL)) {
                        height -= C1103880epe.LLJJJJ;
                    }
                } else {
                    height = 0;
                }
                if (outline != null) {
                    if (view != null) {
                        width = view.getWidth();
                    }
                    outline.setRoundRect(0, 0, width, height, C418440Gaw.LIZIZ(8));
                }
            }
        });
        setClipToOutline(true);
        C20632315oP c20632315oP = (C20632315oP) findViewById(R.id.c0y);
        this.LLILZ = c20632315oP;
        this.LLILZIL = (C434320H1i) findViewById(R.id.c0x);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.f680c1b);
        this.LLILZLL = frameLayout;
        this.LLIZ = (LiveIconView) findViewById(R.id.c1c);
        c20632315oP.setOrientation(0);
        c20632315oP.setOffscreenPageLimit(2);
        c20632315oP.setAdapter(c1103940epk);
        c20632315oP.LIZIZ(new C1151520g4U(this, 4));
        C786410Ut5.I7(new AbS698S0100000_17(this, 22, 42), frameLayout);
        setupData(c201700q7.LIZIZ);
        C500260Jjc.LJIILLIIL(this);
    }

    public final void LJ(String str, HostBoard hostBoard) {
        if (hostBoard == null) {
            C2757014x c2757014x = (C2757014x) C13LP.LJJJLZIJ(this.LLILZ.getCurrentItem(), this.LLIZLLLIL.LLILLJJLI.LJFF);
            if (c2757014x == null || (hostBoard = c2757014x.LIZ) == null) {
                return;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_component_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(hostBoard.templateId, "template_id");
        c474500IjALIZ.LJJII(hostBoard.bizTemplateId, "business_template_id");
        c474500IjALIZ.LJJII(hostBoard.boardId, "board_id");
        c474500IjALIZ.LJJII(hostBoard.bizType, "biz_type");
        c474500IjALIZ.LJJII(hostBoard.subBizType, "sub_biz_type");
        c474500IjALIZ.LJJII(getUserType(), "user_type");
        c474500IjALIZ.LJJII(LIZLLL(hostBoard), "is_title_complete_show");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LJJIIZI(this.LL.LJFF);
        DataChannel dataChannel = this.LL.LJ;
        if (dataChannel != null) {
            c474500IjALIZ.LJIJJLI(dataChannel);
        }
        c474500IjALIZ.LIZ();
        C784440Upu.LIZ().LIZIZ(new C260600zc(str, hostBoard));
        InterfaceC1103900epg interfaceC1103900epgXd1 = ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).xd1(hostBoard.bizType);
        if (interfaceC1103900epgXd1 != null) {
            interfaceC1103900epgXd1.LIZIZ(str, hostBoard, this.LL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1103880epe.onMeasure(int, int):void");
    }

    public static String LIZJ(Object obj, String str, String str2) {
        String str3;
        if (a0.LJJIZ(str, '?', 0, false, 6) == -1) {
            str3 = "?";
        } else {
            str3 = "&";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str3);
        sbLIZ.append(str2);
        sbLIZ.append('=');
        sbLIZ.append(obj);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
