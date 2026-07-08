package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0xNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817040xNu extends AbstractC1817030xNt {
    public boolean LLJJIJIL;
    public C1817080xNy LLJJJ;
    public List<C1836370xt5> LLJJJIL;
    public List<C1836370xt5> LLJJJJ;

    @Override // X.AbstractC1817030xNt, X.InterfaceC395901gL
    public int getLayoutId() {
        return R.layout.g21;
    }

    @Override // X.AbstractC1817030xNt
    public final boolean LJIIJJI() {
        return !this.LLJJIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116  */
    @Override // X.AbstractC1817030xNt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1817040xNu.LJIIIIZZ():void");
    }

    @Override // X.AbstractC1817030xNt
    public final void LJIIJ() {
        super.LJIIJ();
        C1817080xNy c1817080xNy = this.LLJJJ;
        if (c1817080xNy != null) {
            getOnBoardItemRemoved().invoke(Integer.valueOf(c1817080xNy.LIZIZ), getBoardLogInfo());
        }
    }

    @Override // X.AbstractC1817030xNt
    public final void LJIILIIL() {
        if (getViewModel().LIZLLL.length() <= 0) {
            LJIILLIIL(this.LLJJJIL, getViewModel());
            C1817080xNy c1817080xNy = this.LLJJJ;
            if (c1817080xNy != null) {
                LJIILLIIL(this.LLJJJJ, c1817080xNy);
            }
            LJIILJJIL(this.LLJJJIL, getViewModel());
            C1817080xNy c1817080xNy2 = this.LLJJJ;
            if (c1817080xNy2 != null) {
                LJIILJJIL(this.LLJJJJ, c1817080xNy2);
                return;
            }
            return;
        }
        List<C1836370xt5> list = this.LLJJJIL;
        C1817080xNy viewModel = getViewModel();
        String str = viewModel.LIZLLL;
        int i = 0;
        for (C1836370xt5 c1836370xt5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C1836370xt5 c1836370xt52 = c1836370xt5;
            if (c1836370xt52 != null) {
                if (i == 0) {
                    C500260Jjc.LLFFF(c1836370xt52);
                    c1836370xt52.setText(str);
                    LJIILL(c1836370xt52, viewModel, 0);
                    c1836370xt52.setGravity(8388627);
                    c1836370xt52.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)));
                    c1836370xt52.setPadding(c1836370xt52.getPaddingLeft(), c1836370xt52.getPaddingTop(), c1836370xt52.getPaddingRight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                } else {
                    C500260Jjc.LJIILIIL(c1836370xt52);
                }
            }
            i = i2;
        }
        if (this.LLJJIJIL) {
            return;
        }
        LJIILJJIL(this.LLJJJIL, getViewModel());
    }

    @Override // X.AbstractC1817030xNt
    public int getBoardItemType() {
        return getViewModel().LIZIZ;
    }

    public C1817040xNu(Context context) {
        super(context, null);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJJIL = c13bv;
        this.LLJJJJ = c13bv;
    }

    public final void setDescriptionDecorationBoard(boolean z) {
        this.LLJJIJIL = z;
    }

    @Override // X.AbstractC1817030xNt
    public final void LJIIIZ(C1817100xO0 c1817100xO0, DataChannel dataChannel) {
        this.LLJJJ = null;
        super.LJIIIZ(c1817100xO0, dataChannel);
    }

    public final void LJIILJJIL(List<C1836370xt5> list, C1817080xNy c1817080xNy) {
        List<String> list2 = c1817080xNy.LJ.fonts;
        int i = 0;
        for (String str : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                InterfaceC971680bOQ interfaceC971680bOQ = getViewModel().LIZ;
                if (interfaceC971680bOQ != null) {
                    interfaceC971680bOQ.LIZJ(getFontSelectView(), str2, new C1817070xNx(list, i, list2, this, c1817080xNy));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(java.util.List<X.C1836370xt5> r11, X.C1817080xNy r12) {
        /*
            r10 = this;
            java.util.List<kotlin.Pair<com.bytedance.android.livesdk.model.BoardItemTemplate, com.bytedance.android.livesdk.model.BoardItemContent>> r0 = r12.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            java.util.Iterator r9 = r11.iterator()
            r8 = 0
            r6 = 0
        Le:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r1 = r9.next()
            int r7 = r6 + 1
            r0 = 0
            if (r6 < 0) goto Lad
            X.0xt5 r1 = (X.C1836370xt5) r1
            java.util.List<kotlin.Pair<com.bytedance.android.livesdk.model.BoardItemTemplate, com.bytedance.android.livesdk.model.BoardItemContent>> r0 = r12.LIZJ
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r6, r0)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L84
            if (r1 == 0) goto L39
            X.C500260Jjc.LLFFF(r1)
            java.lang.Object r0 = r0.getSecond()
            com.bytedance.android.livesdk.model.BoardItemContent r0 = (com.bytedance.android.livesdk.model.BoardItemContent) r0
            java.lang.String r0 = r0.content
            r1.setText(r0)
        L39:
            r10.LJIILL(r1, r12, r6)
            X.0xNy r0 = r10.LLJJJ
            r3 = 1
            if (r0 != 0) goto L8d
            if (r2 != r3) goto L8d
            if (r1 == 0) goto L89
            r0 = 17
            r1.setGravity(r0)
            r0 = 54
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r1.setMinHeight(r0)
        L5b:
            int r5 = r1.getPaddingLeft()
            int r4 = r1.getPaddingTop()
            int r3 = r1.getPaddingRight()
            java.util.List<kotlin.Pair<com.bytedance.android.livesdk.model.BoardItemTemplate, com.bytedance.android.livesdk.model.BoardItemContent>> r0 = r12.LIZJ
            int r0 = X.C1697810uHb.LJIIJ(r0)
            if (r6 != r0) goto L8b
            r0 = 10
        L71:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r1.setPadding(r5, r4, r3, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L89
        L84:
            if (r1 == 0) goto L89
            X.C500260Jjc.LJIILIIL(r1)
        L89:
            r6 = r7
            goto Le
        L8b:
            r0 = 4
            goto L71
        L8d:
            if (r1 == 0) goto L89
            r0 = 51
            r1.setGravity(r0)
            if (r2 != r3) goto La8
            r0 = 44
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L9c:
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r1.setMinHeight(r0)
            goto L5b
        La8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L9c
        Lad:
            X.C1697810uHb.LJIJI()
            throw r0
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1817040xNu.LJIILLIIL(java.util.List, X.0xNy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.C1836370xt5 r5, X.C1817080xNy r6, int r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L24
            r6.getClass()
            com.bytedance.android.livesdk.model.BoardItemStyle r0 = r6.LJ
            java.lang.String r0 = r0.colorTheme
            java.lang.Integer r0 = X.C202500qF.LJFF(r0)
            if (r0 == 0) goto L27
            int r3 = r0.intValue()
        L13:
            X.0xcy r2 = X.EnumC1826380xcy.PREVIEW_DISPLAY
            if (r7 != 0) goto L25
            android.view.View r1 = r4.getContentView()
            boolean r0 = r1 instanceof androidx.cardview.widget.CardView
            if (r0 == 0) goto L25
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
        L21:
            r5.LJIIIZ(r3, r2, r1)
        L24:
            return
        L25:
            r1 = 0
            goto L21
        L27:
            r3 = -1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1817040xNu.LJIILL(X.0xt5, X.0xNy, int):void");
    }
}
