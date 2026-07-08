package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.TPText;

/* JADX INFO: renamed from: X.0fbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133700fbk extends FrameLayout implements C0T8B {
    public final TextView LL;
    public final ImageView LLILLJJLI;
    public final C418350Gan LLILLL;
    public long LLILZ;
    public final C1133800fbu LLILZIL;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1133800fbu c1133800fbu = this.LLILZIL;
        CountDownTimer countDownTimer = c1133800fbu.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c1133800fbu.LIZIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(webcast.data.TPText r14) {
        /*
            r13 = this;
            r7 = 8
            if (r14 != 0) goto La
            X.0Gan r0 = r13.LLILLL
            X.C786410Ut5.LLJJ(r0, r7)
            return
        La:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r0 = " {{tp_count_down}} "
            r1.append(r0)
            X.0Gan r0 = r13.LLILLL
            r0.setText(r1)
            java.util.List<webcast.data.TPTextPiece> r0 = r14.pieces
            r2 = 0
            r9 = 0
            if (r0 == 0) goto L4e
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r1 = r3.next()
            r0 = r1
            webcast.data.TPTextPiece r0 = (webcast.data.TPTextPiece) r0
            webcast.data.TPCountDownConfig r0 = r0.countdownConfig
            if (r0 == 0) goto L23
        L34:
            webcast.data.TPTextPiece r1 = (webcast.data.TPTextPiece) r1
            if (r1 == 0) goto L4f
            webcast.data.TPCountDownConfig r0 = r1.countdownConfig
            if (r0 == 0) goto L54
            long r3 = r0.endTime
            long r5 = X.C158B.LIZJ()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L54
            X.0Gan r0 = r13.LLILLL
            X.C786410Ut5.LLJJ(r0, r7)
            return
        L4c:
            r1 = r9
            goto L34
        L4e:
            r1 = r9
        L4f:
            long r6 = X.C158B.LIZJ()
            goto L5a
        L54:
            webcast.data.TPCountDownConfig r0 = r1.countdownConfig
            if (r0 == 0) goto L4f
            long r6 = r0.endTime
        L5a:
            if (r1 == 0) goto Lab
            webcast.data.TPFormat r0 = r1.format
            if (r0 == 0) goto Lab
            int r0 = r0.fontSize
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L66:
            webcast.data.TPFormat r0 = r1.format
            if (r0 == 0) goto L76
            java.lang.String r0 = r0.color
            if (r0 == 0) goto L76
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L76:
            if (r1 == 0) goto La4
            webcast.data.TPCountDownConfig r0 = r1.countdownConfig
            if (r0 == 0) goto La4
            webcast.data.TouchPointColor r0 = r0.backgroundColor
            if (r0 == 0) goto La4
            java.lang.String r0 = r0.light
            if (r0 == 0) goto La4
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
        L88:
            X.0fbt r3 = new X.0fbt
            r4 = 1
            java.lang.String r5 = "{{tp_count_down}}"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r12 = 8
            r11 = r4
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12)
            X.0fbu r1 = r13.LLILZIL
            X.0Gan r0 = r13.LLILLL
            r1.LIZ(r0, r3)
            X.0Gan r0 = r13.LLILLL
            X.C786410Ut5.LLJJ(r0, r2)
            return
        La4:
            java.lang.String r0 = "#0CFFFFFF"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            goto L88
        Lab:
            r8 = r9
            if (r1 == 0) goto L76
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133700fbk.LIZ(webcast.data.TPText):void");
    }

    public C1133700fbk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = new C1133800fbu();
        FrameLayout.inflate(context, R.layout.hzj, this);
        this.LL = (TextView) findViewById(R.id.izb);
        this.LLILLJJLI = (ImageView) findViewById(R.id.iz_);
        this.LLILLL = (C418350Gan) findViewById(R.id.iz9);
    }

    public final void LIZIZ(long j, String str) {
        int i;
        this.LLILZ = j;
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        if (c1094360eaIHP != null) {
            i = c1094360eaIHP.LIZ;
        } else {
            i = 0;
        }
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        boolean zLJIIJJI = C1133940fc8.LJIIJJI();
        if (Intrinsics.LJFF(str, "show")) {
            C1123800fLm.LIZLLL(j, Boolean.valueOf(zLJIIJJI), Integer.valueOf(i), "touch_point_gift");
        } else {
            if (!Intrinsics.LJFF(str, "click")) {
                return;
            }
            C1123800fLm.LIZJ(j, Boolean.valueOf(zLJIIJJI), Integer.valueOf(i), "touch_point_gift");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[PHI: r2
      0x0022: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v2 java.lang.String) binds: [B:22:0x004b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.live.base.model.ImageModel r7, com.bytedance.android.livesdk.model.message.common.Text r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L5
            if (r7 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = r6.LL
            r4 = 0
            r3 = 0
            if (r8 == 0) goto L4d
            java.lang.String r1 = r8.key
            if (r1 == 0) goto L49
            X.0fNV r0 = X.C1124870fNV.LIZJ()
            r0.getClass()
            java.lang.String r2 = X.C1124870fNV.LIZIZ(r1)
            if (r2 == 0) goto L49
            int r0 = r2.length()
            if (r0 <= 0) goto L49
        L22:
            java.lang.String r1 = "{s_creatorName}"
            java.lang.String r0 = "{0:string}"
            java.lang.String r1 = kotlin.text.u.LJJIFFI(r2, r1, r0, r4)
            int r0 = r1.length()
            if (r0 <= 0) goto L4d
            android.text.Spannable r0 = X.C1133830fbx.LJIILJJIL(r1, r8, r3)
        L34:
            r5.setText(r0)
            if (r7 == 0) goto L3e
            android.widget.ImageView r0 = r6.LLILLJJLI
            X.C0JSS.LIZLLL(r0, r7)
        L3e:
            Y.ACListenerS152S0100000_17 r1 = new Y.ACListenerS152S0100000_17
            r0 = 77
            r1.<init>(r6, r0)
            X.C786410Ut5.C8(r6, r1)
            return
        L49:
            java.lang.String r2 = r8.defaultPattern
            if (r2 != 0) goto L22
        L4d:
            java.lang.String r0 = ""
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133700fbk.LIZJ(com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.livesdk.model.message.common.Text):void");
    }

    public final void LIZLLL(TPText tPText, ImageModel imageModel) {
        if (tPText == null) {
            if (imageModel == null) {
                return;
            }
        } else {
            SpannableStringBuilder spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText);
            if (spannableStringBuilderLIZLLL != null && spannableStringBuilderLIZLLL.length() != 0) {
                this.LL.setText(spannableStringBuilderLIZLLL);
            }
            if (imageModel != null) {
            }
            C786410Ut5.C8(this, new ACListenerS152S0100000_17(this, 45));
        }
        C0JSS.LIZLLL(this.LLILLJJLI, imageModel);
        C786410Ut5.C8(this, new ACListenerS152S0100000_17(this, 45));
    }
}
