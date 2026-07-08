package X;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.1AMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC2178181AMm extends FrameLayout {
    public InterfaceC2178171AMl LL;
    public InterfaceC2178211AMp LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2178171AMl interfaceC2178171AMl = this.LL;
        if (interfaceC2178171AMl != null) {
            interfaceC2178171AMl.LIZ();
        }
        InterfaceC2178211AMp interfaceC2178211AMp = this.LLILLJJLI;
        if (interfaceC2178211AMp != null) {
            interfaceC2178211AMp.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2178171AMl interfaceC2178171AMl = this.LL;
        if (interfaceC2178171AMl != null) {
            interfaceC2178171AMl.LJI();
        }
        InterfaceC2178211AMp interfaceC2178211AMp = this.LLILLJJLI;
        if (interfaceC2178211AMp != null) {
            interfaceC2178211AMp.onDetachedFromWindow();
        }
    }

    public final InterfaceC2178211AMp getLifecycle() {
        return this.LLILLJJLI;
    }

    public final InterfaceC2178171AMl getPlayer() {
        return this.LL;
    }

    public AbstractC2178181AMm(Context context) {
        new LinkedHashMap();
        super(context, null, 0);
    }

    public final void setLifecycle(InterfaceC2178211AMp interfaceC2178211AMp) {
        this.LLILLJJLI = interfaceC2178211AMp;
    }

    public final void setPlayer(InterfaceC2178171AMl interfaceC2178171AMl) {
        this.LL = interfaceC2178171AMl;
    }
}
