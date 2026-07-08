package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b6g.o;
import wh6.AbS703S0100000_24;

/* JADX INFO: renamed from: X.0rDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1579820rDI<BLOCK_INFO extends o> extends FrameLayout {
    public InterfaceC1579970rDX LL;
    public BLOCK_INFO LLILLJJLI;

    public void LIZ(BLOCK_INFO block_info) {
    }

    public View getAndroidView() {
        return this;
    }

    public final BLOCK_INFO getBlockInfo() {
        return this.LLILLJJLI;
    }

    public InterfaceC1579970rDX getCallback() {
        return this.LL;
    }

    public final void setBlockInfo(BLOCK_INFO block_info) {
        this.LLILLJJLI = block_info;
    }

    public void setCallback(InterfaceC1579970rDX interfaceC1579970rDX) {
        this.LL = interfaceC1579970rDX;
    }

    public AbstractC1579820rDI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.I7(new AbS703S0100000_24(this, 1), this);
    }
}
