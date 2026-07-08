package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0qaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ViewOnAttachStateChangeListenerC1555570qaB implements InterfaceC665370Q7z, View.OnAttachStateChangeListener {
    public static final C951920asY LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final View LL;
    public final String LLILLJJLI = "link_mic_scope";
    public final C1555580qaC LLILLL = new C1555580qaC(new AwS568S0100000_24(this, 1648));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1647));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0asY] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(ViewOnAttachStateChangeListenerC1555570qaB.class, "viewWeak", "getViewWeak()Landroid/view/View;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217371BqR};
        LLILZIL = new Object() { // from class: X.0asY
        };
        LLIZ = R.id.u1v;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // X.InterfaceC665370Q7z
    public final Object getHost() {
        C1555580qaC c1555580qaC = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return c1555580qaC.LIZ.get();
    }

    @Override // X.InterfaceC665370Q7z
    public final C1554890qZ5 getTree() {
        return (C1554890qZ5) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC665370Q7z
    public String getKey() {
        return this.LLILLJJLI;
    }

    public ViewOnAttachStateChangeListenerC1555570qaB(View view) {
        this.LL = view;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS568S0100000_24(this, 1646));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.setTag(LLIZ, null);
        getTree().LJFF();
    }
}
