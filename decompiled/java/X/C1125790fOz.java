package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import wh6.AbS507S0200000_17;

/* JADX INFO: renamed from: X.0fOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125790fOz extends FrameLayout implements InterfaceC1125550fOb {
    public long LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public DataChannel LLILZ;
    public Integer LLILZIL;

    public final void LIZ(String str) {
        Boolean bool;
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIJIIJIL(bool)) {
            C1AI2 c1ai2 = new C1AI2(null, null, null, null, null, null, null, 0L, 0L, str, "user", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -1537, 2097151);
            C1AI1.LIZ(c1ai2, this.LLILZ, false);
            C1AI0.LJIILJJIL(c1ai2);
        }
    }

    public C1125790fOz(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, 0);
        this.LL = -1L;
        FrameLayout.inflate(context, R.layout.gns, this);
        TextView textView = (TextView) findViewById(R.id.tv_progress);
        textView.setTypeface(C1119920fFW.LIZJ(textView.getTextSize(), 500, context));
        Integer numLIZ = C1135270feH.LIZ(R.attr.ezq, context);
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -592138;
        }
        textView.setTextColor(iIntValue);
        View viewFindViewById = findViewById(R.id.viewer_picks_bubble_container);
        Integer numLIZ2 = C1135270feH.LIZ(R.attr.ezl, context);
        if (numLIZ2 != null) {
            iIntValue2 = numLIZ2.intValue();
        } else {
            iIntValue2 = -13816531;
        }
        viewFindViewById.setBackgroundColor(iIntValue2);
        C786410Ut5.I7(new AbS507S0200000_17(this, context, 4), this);
    }
}
