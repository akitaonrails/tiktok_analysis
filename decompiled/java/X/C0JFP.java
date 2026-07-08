package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0JFP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JFP extends LinearLayout implements View.OnClickListener {
    public final int[] LL;
    public Function1<? super Integer, Unit> LLILLJJLI;
    public int LLILLL;
    public DataChannel LLILZ;
    public final C01GW LLILZIL;

    private final HashMap<Integer, String> getColorNameMap() {
        return (HashMap) this.LLILZIL.getValue();
    }

    public final String getCurrentSelectedColorString() {
        return getColorNameMap().containsKey(Integer.valueOf(this.LLILLL)) ? getColorNameMap().get(Integer.valueOf(this.LLILLL)) : "";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l;
        Long l2;
        if (view == null) {
            return;
        }
        if (R.id.fay != view.getId()) {
            for (int i : this.LL) {
                C416220GTs c416220GTs = (C416220GTs) findViewById(i);
                if (i == view.getId()) {
                    this.LLILLL = c416220GTs.getColor();
                    DataChannel dataChannel = this.LLILZ;
                    if (dataChannel != null && (l = (Long) dataChannel.gg0(DrawGuessSessionIdChannel.class)) != null) {
                        long jLongValue = l.longValue();
                        DataChannel dataChannel2 = this.LLILZ;
                        if (dataChannel2 != null && (l2 = (Long) dataChannel2.gg0(DrawGuessRoundIdChannel.class)) != null) {
                            long jLongValue2 = l2.longValue();
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_change_color");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "pictionary_session_id");
                            c474500IjALIZ.LJJII(Long.valueOf(jLongValue2), "pictionary_id");
                            c474500IjALIZ.LJJII(getCurrentSelectedColorString(), "color");
                            C0JFO.LIZ(c474500IjALIZ);
                            C0JFO.LJIIJJI(c474500IjALIZ, this.LLILZ);
                            c474500IjALIZ.LIZ();
                        }
                    }
                    if (!c416220GTs.LLILLJJLI) {
                        c416220GTs.LLILLJJLI = true;
                        c416220GTs.invalidate();
                    }
                } else if (c416220GTs.LLILLJJLI) {
                    c416220GTs.LLILLJJLI = false;
                    c416220GTs.invalidate();
                }
            }
        }
        Function1<? super Integer, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.LLILLL));
        }
    }

    public final void setOnClickListener(Function1<? super Integer, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JFP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        int[] iArr = {R.id.white_color, R.id.t15, R.id.c4j, R.id.j59, R.id.yellow_color, R.id.qhn};
        this.LL = iArr;
        this.LLILLL = -1;
        this.LLILZIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(383));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gd7, this, true);
        do {
            C786410Ut5.I7(this, findViewById(iArr[i]));
            i++;
        } while (i < 6);
    }
}
