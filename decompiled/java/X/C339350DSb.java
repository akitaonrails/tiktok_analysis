package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0DSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339350DSb extends C09AY implements Function0<View> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C339350DSb(Context context, String str, String str2, AwS569S0100000_25 awS569S0100000_25) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = awS569S0100000_25;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        final Context context = this.LL;
        final String str = this.LLILLJJLI;
        final String str2 = this.LLILLL;
        final Function0<Unit> function0 = this.LLILZ;
        return new C0DSZ(context, str, str2, function0) { // from class: X.0DSa
            public final /* synthetic */ Context LIZLLL;
            public final /* synthetic */ String LJ;
            public final /* synthetic */ String LJFF;

            @Override // X.C0DSZ
            public final void LIZ(LinearLayout linearLayout) {
                C1361400lX0 c1361400lX0 = new C1361400lX0(this.LIZLLL, R.style.y0);
                TuxTextView tuxTextView = new TuxTextView(this.LIZLLL, null, 6, 0);
                tuxTextView.setText(this.LJ);
                tuxTextView.setGravity(17);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0);
                if (numLIZJ != null) {
                    tuxTextView.setTextColor(numLIZJ.intValue());
                }
                tuxTextView.setSingleLine(true);
                tuxTextView.setTextSize(16.0f);
                tuxTextView.setTypeface(null, 1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.gravity = 17;
                layoutParams.weight = 1.0f;
                C786410Ut5.R6(tuxTextView, layoutParams);
                TuxTextView tuxTextView2 = new TuxTextView(this.LIZLLL, null, 6, 0);
                String str3 = this.LJFF;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Created by: ");
                sbLIZ.append(str3);
                tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                tuxTextView2.setGravity(17);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, c1361400lX0);
                if (numLIZJ2 != null) {
                    tuxTextView2.setTextColor(numLIZJ2.intValue());
                }
                tuxTextView2.setSingleLine(true);
                tuxTextView2.setTextSize(11.0f);
                tuxTextView2.setTypeface(null, 1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                layoutParams2.gravity = 17;
                layoutParams2.weight = 1.0f;
                C786410Ut5.R6(tuxTextView2, layoutParams2);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.addView(tuxTextView);
                linearLayout.addView(tuxTextView2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, function0);
                this.LIZLLL = context;
                this.LJ = str;
                this.LJFF = str2;
            }
        }.LIZJ.getValue();
    }
}
