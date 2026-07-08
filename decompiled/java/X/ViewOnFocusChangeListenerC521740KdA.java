package X;

import android.view.View;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseInfoEditAssem;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCoursePinNoticeEditSheet;

/* JADX INFO: renamed from: X.0KdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ViewOnFocusChangeListenerC521740KdA implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
            case 4:
                onFocusChange$4(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC521740KdA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC521740KdA viewOnFocusChangeListenerC521740KdA, View view, boolean z) {
        if (z) {
            C489110JGb.LIZLLL(((PcsCourseInfoEditAssem) viewOnFocusChangeListenerC521740KdA.l0).ip(), ((PcsCourseInfoEditAssem) viewOnFocusChangeListenerC521740KdA.l0).hp(), "edit_title", "click");
        }
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC521740KdA viewOnFocusChangeListenerC521740KdA, View view, boolean z) {
        if (z) {
            C489110JGb.LIZLLL(((PcsCourseInfoEditAssem) viewOnFocusChangeListenerC521740KdA.l0).ip(), ((PcsCourseInfoEditAssem) viewOnFocusChangeListenerC521740KdA.l0).hp(), "edit_description", "click");
        }
    }

    public static final void onFocusChange$2(ViewOnFocusChangeListenerC521740KdA viewOnFocusChangeListenerC521740KdA, View view, boolean z) {
        if (z) {
            C489110JGb.LJFF(((PcsCoursePinNoticeEditSheet) viewOnFocusChangeListenerC521740KdA.l0).MR().zQ2(), "submit", "click");
        }
    }

    public static final void onFocusChange$3(ViewOnFocusChangeListenerC521740KdA viewOnFocusChangeListenerC521740KdA, View view, boolean z) {
        if (z) {
            C0K26 c0k26 = C0K26.LIZ;
            String str = ((C0K4F) viewOnFocusChangeListenerC521740KdA.l0).LLILLJJLI;
            c0k26.getClass();
            C0K26.LIZJ("edit", "poll", str);
        }
    }

    public static final void onFocusChange$4(ViewOnFocusChangeListenerC521740KdA viewOnFocusChangeListenerC521740KdA, View view, boolean z) {
        if (z) {
            C0K26 c0k26 = C0K26.LIZ;
            String str = ((C0K4F) viewOnFocusChangeListenerC521740KdA.l0).LLILLJJLI;
            c0k26.getClass();
            C0K26.LIZJ("edit", "poll", str);
        }
    }
}
