package X;

import Y.ACListenerS72S0110000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748440TXm extends AbstractC748830TYz {
    public RelativeLayout LLJIJIL;
    public C16F5 LLJILJIL;
    public ImageView LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.AbstractC748830TYz
    public int getLayoutId$livebroadcast_api_release() {
        return R.layout.g0j;
    }

    public final ImageView getBlockWordAddFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c3z);
            this.LLJILJILJ = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final RelativeLayout getBlockWordInputAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c48);
            this.LLJIJIL = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final C16F5 getBlockWordTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c4b);
            this.LLJILJIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    @Override // X.AbstractC748830TYz
    public final View LJI() {
        return C500260Jjc.LJIILL(R.layout.gpq, getFlowLayoutFromXml(), false);
    }

    @Override // X.AbstractC748830TYz
    public final void LJIIIZ() {
        HandlerHook.viewPostDelay(getBlockWordEditTextFromXml(), new ARunnableS112S0100000_12(this, 22), 100L);
    }

    @Override // X.AbstractC748830TYz
    public final void LJIIJJI() {
        int size = getFlowLayoutFromXml().getSize();
        getBlockWordTitleFromXml().setText(C497740JfY.LJIJJ(2131842769, Integer.valueOf(size), Long.valueOf(getMaxWordsCount$livebroadcast_api_release())));
        boolean z = ((long) size) >= getMaxWordsCount$livebroadcast_api_release();
        getBlockWordAddFromXml().setImageResource(z ? R.drawable.etd : R.drawable.etc);
        C786410Ut5.Q7(getBlockWordAddFromXml(), new ACListenerS72S0110000_12(this, z, 1));
    }

    public final void setBlockWordAddFromXml(ImageView imageView) {
        this.LLJILJILJ = imageView;
    }

    public final void setBlockWordInputAreaFromXml(RelativeLayout relativeLayout) {
        this.LLJIJIL = relativeLayout;
    }

    public final void setBlockWordTitleFromXml(C16F5 c16f5) {
        this.LLJILJIL = c16f5;
    }

    public C748440TXm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
