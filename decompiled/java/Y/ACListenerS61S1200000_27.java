package Y;

import X.C0I7D;
import X.C0JT6;
import X.C0WZX;
import X.C1834350xpp;
import X.C1835440xra;
import X.C1851150yGv;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.LiveReplayListV2Fragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.NotificationBarVM;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;
import tikcast.api.anchor.replay.NotificationBarInfo;

/* JADX INFO: loaded from: classes28.dex */
public class ACListenerS61S1200000_27 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS61S1200000_27 aCListenerS61S1200000_27, View view) throws Throwable {
        Object objF2;
        InputMethodManager inputMethodManager;
        Activity activity = ((C1851150yGv) aCListenerS61S1200000_27.l1).mActivity;
        String string = null;
        if (activity != null) {
            objF2 = C786410Ut5.F2(activity, "input_method");
        } else {
            objF2 = null;
        }
        if ((objF2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objF2) != null) {
            inputMethodManager.hideSoftInputFromWindow(((C0I7D) aCListenerS61S1200000_27.l2).getWindowToken(), 0);
        }
        ((C0I7D) aCListenerS61S1200000_27.l2).clearFocus();
        C1851150yGv c1851150yGv = (C1851150yGv) aCListenerS61S1200000_27.l1;
        Editable editableLLLLJI = C2204961BRm.LLLLJI((C0I7D) aCListenerS61S1200000_27.l2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saovBziKsBFdVZkztIx5UqFpEkOTkssU9fXYdw0CwDI+yJsUf", null));
        if (editableLLLLJI != null) {
            string = editableLLLLJI.toString();
        }
        c1851150yGv.getClass();
        String strLLLIIIIL = C1851150yGv.LLLIIIIL(string);
        C1851150yGv c1851150yGv2 = (C1851150yGv) aCListenerS61S1200000_27.l1;
        c1851150yGv2.LLJILLL = strLLLIIIIL;
        if (strLLLIIIIL == null) {
            strLLLIIIIL = aCListenerS61S1200000_27.s0;
        }
        c1851150yGv2.LLLII(strLLLIIIIL);
    }

    public static final void onClick$1(ACListenerS61S1200000_27 aCListenerS61S1200000_27, View view) {
        C1835440xra c1835440xra = C1835440xra.LIZ;
        String str = aCListenerS61S1200000_27.s0;
        c1835440xra.getClass();
        C1835440xra.LIZLLL(str, "close");
        NotificationBarVM notificationBarVMVR = ((LiveReplayListV2Fragment) aCListenerS61S1200000_27.l1).VR();
        int i = ((NotificationBarInfo) aCListenerS61S1200000_27.l2).notificationType;
        C1834350xpp.LIZ.getClass();
        C0JT6<Map<Integer, Integer>> c0jt6 = C1834350xpp.LJIJJLI;
        Map<Integer, Integer> mapLIZ = c0jt6.LIZ();
        if (mapLIZ == null) {
            mapLIZ = new LinkedHashMap<>();
        }
        mapLIZ.put(Integer.valueOf(i), 1);
        c0jt6.LIZJ(mapLIZ);
        notificationBarVMVR.setState(AFwS269S0000000_27.get$arr$(371));
    }

    public static final void onClick$2(ACListenerS61S1200000_27 aCListenerS61S1200000_27, View view) {
        C1835440xra c1835440xra = C1835440xra.LIZ;
        String str = aCListenerS61S1200000_27.s0;
        c1835440xra.getClass();
        C1835440xra.LIZLLL(str, "click_notice_bar");
        ((Function1) aCListenerS61S1200000_27.l1).invoke(((NotificationBarInfo) aCListenerS61S1200000_27.l2).clickContentSchema);
    }

    public static final void onClick$3(ACListenerS61S1200000_27 aCListenerS61S1200000_27, View view) {
        C1835440xra c1835440xra = C1835440xra.LIZ;
        String str = aCListenerS61S1200000_27.s0;
        c1835440xra.getClass();
        C1835440xra.LIZLLL(str, "turn_on");
        ((Function1) aCListenerS61S1200000_27.l1).invoke(((NotificationBarInfo) aCListenerS61S1200000_27.l2).clickButtonSchema);
    }

    public ACListenerS61S1200000_27(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
