package X;

import Y.ACListenerS161S0100000_27;
import Y.ACListenerS59S0400000_27;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786030wZt extends ConstraintLayout {
    public final TuxTextView LL;
    public final ImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final C197039127h LLIZ;

    public final void h0(List<String> list) {
        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(list);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
        c1324610kZfLIZJ.LJJI(this.LLILLJJLI);
    }

    public C1786030wZt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1786030wZt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.hrd, this);
        this.LL = (TuxTextView) findViewById(R.id.tv_ranking_num);
        this.LLILLJJLI = (ImageView) findViewById(R.id.l9h);
        this.LLILLL = (TuxTextView) findViewById(R.id.zgk);
        this.LLILZ = (TuxTextView) findViewById(R.id.zgj);
        this.LLILZIL = (TuxTextView) findViewById(R.id.tv_prompt);
        this.LLILZLL = (TuxTextView) findViewById(R.id.tv_ranking_score);
        this.LLIZ = (C197039127h) findViewById(R.id.d6g);
        C786410Ut5.LJLLLLLL(8, this);
    }

    public final void e0(InterfaceC1781190wS5 interfaceC1781190wS5, C1777410wLz c1777410wLz, C1786010wZr c1786010wZr, C1785790wZV c1785790wZV) {
        int i;
        int i2;
        C1781180wS4 c1781180wS4;
        C1557540qdM c1557540qdM;
        Integer numValueOf;
        RankTypeV2 rankTypeV2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind enter model=");
        sbLIZ.append(interfaceC1781190wS5.getClass().getSimpleName());
        C20441214yg.LIZIZ("CreatorRankingBottomBarView", C2188811AlT.LIZIZ(sbLIZ));
        c1786010wZr.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onBottomBarRender model=");
        sbLIZ2.append(interfaceC1781190wS5.getClass().getSimpleName());
        C20441214yg.LIZIZ("CreatorRankingPageReporter", C2188811AlT.LIZIZ(sbLIZ2));
        boolean z = interfaceC1781190wS5 instanceof C1781180wS4;
        if (z && (c1781180wS4 = (C1781180wS4) interfaceC1781190wS5) != null && (c1557540qdM = c1781180wS4.LJFF) != null && c1777410wLz != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            RankTypeV2 rankTypeV22 = c1777410wLz.LIZJ;
            if (rankTypeV22 != null) {
                numValueOf = Integer.valueOf(rankTypeV22.type);
            } else {
                numValueOf = null;
            }
            sbLIZ3.append(numValueOf);
            sbLIZ3.append('|');
            sbLIZ3.append(c1777410wLz.LIZIZ);
            sbLIZ3.append('|');
            sbLIZ3.append(c1777410wLz.LIZ);
            sbLIZ3.append('|');
            sbLIZ3.append(c1557540qdM.LIZ);
            sbLIZ3.append('|');
            sbLIZ3.append(c1777410wLz.LIZLLL);
            sbLIZ3.append('|');
            sbLIZ3.append(c1777410wLz.LJ);
            sbLIZ3.append('|');
            sbLIZ3.append(c1786010wZr.LIZ.Mi());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            if (!Intrinsics.LJFF(c1786010wZr.LIZIZ, strLIZIZ)) {
                if (Intrinsics.LJFF(c1777410wLz.LIZ, EnumC1808150x9Z.SEND_GIFT_BTN.getButtonType()) && (rankTypeV2 = c1777410wLz.LIZJ) != null) {
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    boolean z2 = c1777410wLz.LIZLLL;
                    DataChannel dataChannel = c1786010wZr.LIZ.getDataChannel();
                    boolean z3 = c1777410wLz.LJ;
                    c1810690xDf.getClass();
                    C1810690xDf.LJJ(rankTypeV2, z2, dataChannel, z3);
                }
                C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
                DataChannel dataChannel2 = c1786010wZr.LIZ.getDataChannel();
                String str = c1777410wLz.LIZ;
                String str2 = c1777410wLz.LIZIZ;
                c1810690xDf2.getClass();
                C1810690xDf.LJIIJ(dataChannel2, str, str2, "show", "", null);
                c1786010wZr.LIZIZ = strLIZIZ;
            }
        } else {
            c1786010wZr.LIZIZ = null;
        }
        if (Intrinsics.LJFF(interfaceC1781190wS5, C1781200wS6.LIZ)) {
            C786410Ut5.LJLLLLLL(8, this);
            C786410Ut5.w8(this, null);
            C786410Ut5.U8(this.LLIZ, null);
            return;
        }
        if (interfaceC1781190wS5 instanceof C1781170wS3) {
            C1781170wS3 c1781170wS3 = (C1781170wS3) interfaceC1781190wS5;
            C786410Ut5.LJLLLLLL(0, this);
            this.LL.setText(c1781170wS3.LIZ);
            h0(c1781170wS3.LIZIZ);
            C786410Ut5.LJLLLLLL(0, this.LLILZIL);
            this.LLILZIL.setText(c1781170wS3.LIZJ);
            C786410Ut5.LJLLLLLL(8, this.LLILLL);
            C786410Ut5.LJLLLLLL(8, this.LLILZ);
            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
            C786410Ut5.LJLLLLLL(8, this.LLIZ);
            C786410Ut5.U8(this.LLIZ, null);
            C786410Ut5.w8(this, new ACListenerS161S0100000_27(c1785790wZV, 25));
            return;
        }
        if (z) {
            C1781180wS4 c1781180wS42 = (C1781180wS4) interfaceC1781190wS5;
            C786410Ut5.LJLLLLLL(0, this);
            this.LL.setText(c1781180wS42.LIZ);
            h0(c1781180wS42.LIZIZ);
            C786410Ut5.LJLLLLLL(8, this.LLILZIL);
            C786410Ut5.LJLLLLLL(0, this.LLILLL);
            this.LLILLL.setText(c1781180wS42.LIZJ);
            TuxTextView tuxTextView = this.LLILZ;
            if (!a0.LJJJIL(c1781180wS42.LIZLLL)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView);
            this.LLILZ.setText(c1781180wS42.LIZLLL);
            TuxTextView tuxTextView2 = this.LLILZLL;
            if (!a0.LJJJIL(c1781180wS42.LJ)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxTextView2);
            this.LLILZLL.setText(c1781180wS42.LJ);
            C1557540qdM c1557540qdM2 = c1781180wS42.LJFF;
            if (c1557540qdM2 != null) {
                C786410Ut5.LJLLLLLL(0, this.LLIZ);
                this.LLIZ.setText(c1557540qdM2.LIZ);
                this.LLIZ.setEnabled(c1557540qdM2.LIZIZ);
                C786410Ut5.U8(this.LLIZ, new ACListenerS59S0400000_27(c1557540qdM2, c1786010wZr, c1777410wLz, c1785790wZV, 0));
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
                C786410Ut5.U8(this.LLIZ, null);
            }
            C786410Ut5.w8(this, new ACListenerS161S0100000_27(c1785790wZV, 24));
            return;
        }
        throw new C1954807lC();
    }
}
