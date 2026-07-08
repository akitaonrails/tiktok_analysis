package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.NearbyTag;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03D5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03D5 extends LinearLayout implements C03D6 {
    public TuxTextView LL;
    public Aweme LLILLJJLI;

    public void setData(Aweme aweme) {
        String str;
        NearbyTag nearbyTag;
        this.LLILLJJLI = aweme;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct != null && (nearbyTag = poiDataStruct.nearbyTag) != null) {
                str = nearbyTag.text;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
    }

    public C03D5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setGravity(16);
        setOrientation(0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.f527avg);
        setBackground(c384050F3z.LIZ(getContext()));
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        C786410Ut5.M6(tuxIconView, layoutParams);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
        tuxIconView.setTuxIcon(c419910GdJ);
        addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, tuxTextView.getContext());
        tuxTextView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        tuxTextView.setTuxFont(62);
        this.LL = tuxTextView;
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.R6(tuxTextView2, layoutParams2);
        }
        addView(this.LL);
        HandlerHook.viewPost(this, new RunnableC514801zW(this, 148));
    }
}
