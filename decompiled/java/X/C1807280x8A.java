package X;

import Y.ACListenerS161S0100000_27;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.text.a0;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807280x8A extends AbstractC1805780x5k {
    public final ViewGroup LL;
    public final C1807300x8C LLILLJJLI;

    public C1807280x8A(ViewGroup viewGroup) {
        super(viewGroup);
        this.LL = viewGroup;
        this.LLILLJJLI = new C1807300x8C(viewGroup.getContext());
    }

    @Override // X.AbstractC1805780x5k
    public final void I5(IapListResult.ActivityDetail activityDetail) {
        C1807330x8F c1807330x8F;
        C1807300x8C c1807300x8C = this.LLILLJJLI;
        c1807300x8C.LIZIZ = activityDetail;
        BDDateFormat bDDateFormat = new BDDateFormat("ll");
        long j = activityDetail.startTime;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        String strLIZIZ = bDDateFormat.LIZIZ(j * j2, Locale.getDefault());
        String strLIZIZ2 = new BDDateFormat("ll").LIZIZ(activityDetail.endTime * j2, Locale.getDefault());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(" - ");
        sbLIZ.append(strLIZIZ2);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
        String strLJIJI = C497740JfY.LJIJI(2131842387);
        String strLJIJI2 = C497740JfY.LJIJI(2131842388);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJI2);
        C1150160g2I c1150160g2I = new C1150160g2I();
        c1150160g2I.LIZIZ = 0;
        c1150160g2I.LIZJ = strLJIJI2.length();
        TypedArray typedArrayObtainStyledAttributes = c1807300x8C.LIZ.getTheme().obtainStyledAttributes(new int[]{R.attr.a1r});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1150160g2I.LIZ(new ForegroundColorSpan(color));
        c1150160g2I.LIZLLL = 18;
        c1150160g2I.LIZIZ(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strLJIJI);
        int iLJJJ = a0.LJJJ(spannableStringBuilder2, "{rewards}", 0, false, 6);
        if (iLJJJ >= 0) {
            spannableStringBuilder2.replace(iLJJJ, iLJJJ + 9, (CharSequence) spannableStringBuilder);
        }
        if (C497740JfY.LJJ()) {
            c1807330x8F = C1807320x8E.LIZIZ;
        } else {
            c1807330x8F = C1807320x8E.LIZ;
        }
        c1807300x8C.LIZJ = new C1807290x8B(strLIZIZ3, spannableStringBuilder2, c1807330x8F);
        C1807290x8B c1807290x8B = this.LLILLJJLI.LIZJ;
        if (c1807290x8B != null) {
            C12ES.LJIILL(0, this.itemView);
            TextView textView = (TextView) this.itemView.findViewById(R.id.tv_time);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.zf0);
            View viewFindViewById = this.itemView.findViewById(R.id.l_v);
            textView.setText(c1807290x8B.LIZ);
            textView2.setText(c1807290x8B.LIZIZ);
            C1807310x8D c1807310x8D = c1807290x8B.LIZJ;
            C1143680frq.LIZLLL(viewFindViewById, c1807310x8D.LIZ, c1807310x8D.LIZ());
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 131), this.itemView);
            return;
        }
        C439101nJ.LJI(this.itemView);
    }
}
