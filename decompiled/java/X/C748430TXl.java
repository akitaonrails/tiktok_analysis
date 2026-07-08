package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748430TXl extends AbstractC748830TYz {
    public C16F5 LLJIJIL;

    @Override // X.AbstractC748830TYz
    public int getLayoutId$livebroadcast_api_release() {
        return R.layout.g0k;
    }

    @Override // X.AbstractC748830TYz
    public int getMaxLinesInFoldedStatus$livebroadcast_api_release() {
        return 5;
    }

    public final C16F5 getBlockWordTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c4b);
            this.LLJIJIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    @Override // X.AbstractC748830TYz
    public final View LJI() {
        View viewLJIILL = C500260Jjc.LJIILL(R.layout.gpq, getFlowLayoutFromXml(), false);
        ((TextView) viewLJIILL.findViewById(R.id.c41)).setTextColor(C20736316Cj.LIZJ(R.attr.fy3, viewLJIILL.findViewById(R.id.c41)));
        ((C16F5) viewLJIILL.findViewById(R.id.c41)).LJJJI(R.style.a9f);
        ((LiveIconView) viewLJIILL.findViewById(R.id.c43)).setIconTint(-16777216);
        return viewLJIILL;
    }

    @Override // X.AbstractC748830TYz
    public final void LJIIIZ() {
        HandlerHook.viewPostDelay(getBlockWordEditTextFromXml(), new ARunnableS112S0100000_12(this, 23), 200L);
        getBlockWordEditTextFromXml().setOnFocusChangeListener(new ViewOnFocusChangeListenerC786030UsT(this, 0));
    }

    @Override // X.AbstractC748830TYz
    public final void LJIIJJI() {
        getBlockWordTitleFromXml().setText(C497740JfY.LJIJJ(2131842769, Integer.valueOf(getFlowLayoutFromXml().getSize()), Long.valueOf(getMaxWordsCount$livebroadcast_api_release())));
    }

    public final void setBlockWordTitleFromXml(C16F5 c16f5) {
        this.LLJIJIL = c16f5;
    }

    public C748430TXl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
