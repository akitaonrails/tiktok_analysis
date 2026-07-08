package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.widget.Widget;
import com.bytedance.widget.WidgetHost;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.195e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214820195e {
    public static final /* synthetic */ int LJII = 0;
    public final View LIZ;
    public final Lifecycle LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final CopyOnWriteArrayList<Widget> LJ = new CopyOnWriteArrayList<>();
    public final HashMap<Widget, ViewGroup> LJFF = new HashMap<>();
    public WidgetHost LJI;

    public final WidgetHost LIZIZ() {
        WidgetHost widgetHost = this.LJI;
        if (widgetHost != null) {
            return widgetHost;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LIZLLL(Widget widget) {
        if (this.LJ.contains(widget)) {
            return;
        }
        widget.LL = LIZIZ();
        this.LJ.add(widget);
        LIZIZ().MR(widget);
        this.LIZIZ.addObserver(widget);
    }

    public final void LJFF(Widget widget) {
        this.LIZIZ.removeObserver(widget);
        int i = C0JAK.LIZ[this.LIZIZ.getCurrentState().ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        widget.pause$widget_release();
                        widget.stop$widget_release();
                        widget.destroy$widget_release();
                    }
                } else {
                    widget.stop$widget_release();
                    widget.destroy$widget_release();
                }
            } else {
                widget.destroy$widget_release();
            }
        } else if (!widget.LLILLJJLI) {
            widget.destroy$widget_release();
        }
        widget.LL = null;
        this.LJ.remove(widget);
        if (this.LJFF.containsKey(widget)) {
            C786410Ut5.LJJJJI(this.LJFF.get(widget));
            this.LJFF.remove(widget);
        }
        Iterator it2 = ((ArrayList) LIZIZ().LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC214818195c) it2.next()).LIZIZ();
        }
    }

    public C214820195e(View view, Lifecycle lifecycle, WidgetHost widgetHost) {
        this.LIZ = view;
        this.LIZIZ = lifecycle;
        this.LIZJ = C452501pT.LIZIZ(new AwS576S0100000_32(widgetHost, 462));
        this.LIZLLL = C452501pT.LIZIZ(new AwS576S0100000_32(widgetHost, 463));
        this.LJI = widgetHost;
        widgetHost.LLILZIL.add(new AwS576S0100000_32(this, 461));
    }

    public final void LIZ(Widget widget, ViewGroup viewGroup, View view) {
        widget.LLILZ = view;
        viewGroup.addView(view);
        this.LJ.add(widget);
        LIZIZ().MR(widget);
        this.LIZIZ.addObserver(widget);
    }

    public final void LIZJ(int i, JediBaseWidget jediBaseWidget, InterfaceC1766140w3o interfaceC1766140w3o) {
        LJ(i, jediBaseWidget, new AwS235S0300000_26(this, jediBaseWidget, interfaceC1766140w3o, 14));
    }

    public final void LJ(int i, JediBaseWidget jediBaseWidget, Function1 function1) {
        if (jediBaseWidget.LIZLLL() <= 0) {
            LIZLLL(jediBaseWidget);
            return;
        }
        View view = this.LIZ;
        if (view != null) {
            jediBaseWidget.LL = LIZIZ();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(i);
            jediBaseWidget.LLILLL = viewGroup;
            this.LJFF.put(jediBaseWidget, viewGroup);
            function1.invoke(viewGroup);
            return;
        }
        "make sure this WidgetManager is created with rootView".toString();
        throw new IllegalArgumentException("make sure this WidgetManager is created with rootView");
    }
}
