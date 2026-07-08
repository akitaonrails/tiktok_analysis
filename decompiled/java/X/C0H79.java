package X;

import Y.ARunnableS39S0300000_6;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS13S0401000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H79, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H79 {
    public static final C948100amO LIZ() {
        return (C948100amO) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_PREVIEW_LIVE_DATA_HOLDER");
    }

    public static final void LIZIZ(View view, int i, final int i2, Function2<? super Integer, ? super Integer, Unit> function2, final String str) {
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        View viewSd = C786410Ut5.Sd(R.layout.haj, C786410Ut5.ne(context), null);
        RecyclerView recyclerView = (RecyclerView) viewSd.findViewById(R.id.ri7);
        C942210act.LIZ.getClass();
        List listLLIIII = C13LP.LLIIII(C942210act.LJI(i));
        PopupWindow popupWindow = new PopupWindow(viewSd, -2, -2, true);
        popupWindow.setBackgroundDrawable(C800330VaR.LIZIZ(context, R.drawable.f4m));
        popupWindow.setElevation((int) C497740JfY.LIZIZ(2.0f));
        final C013C c013c = new C013C();
        C339610DTb c339610DTb = new C339610DTb(null, listLLIIII, i2, AFwS236S0000000_6.get$arr$(533), AFwS236S0000000_6.get$arr$(534), new AwS13S0401000_6(c013c, (C013C) view, (View) popupWindow, (PopupWindow) function2, (Function2<? super Integer, ? super Integer, Unit>) i, 1), new AwS550S0100000_6(popupWindow, 1529));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0H7A
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                if (c013c.element) {
                    return;
                }
                int i3 = i2;
                C942270acz.LIZIZ(i3, i3, "click", "cancel", str);
            }
        });
        recyclerView.setAdapter(c339610DTb);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        int iIndexOf = listLLIIII.indexOf(Integer.valueOf(i2));
        if (iIndexOf != -1) {
            recyclerView.scrollToPosition(iIndexOf);
        }
        HandlerHook.viewPost(view, new ARunnableS39S0300000_6(view, viewSd, popupWindow, 28));
        C942270acz.LIZIZ(i2, i2, "drop_down", "", str);
    }
}
