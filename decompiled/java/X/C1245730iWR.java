package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.ur.school.service.SchoolFlowLauncher;

/* JADX INFO: renamed from: X.0iWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245730iWR {
    public static final C1245730iWR LIZ = new C1245730iWR();

    public static void LIZ(C19EG c19eg) {
        C1245740iWS.LIZ("add_college");
        SchoolFlowLauncher schoolFlowLauncher = (SchoolFlowLauncher) PluggableExtentionKt.pluggableSpi$default(SchoolFlowLauncher.class, false, false, false, 14, null);
        if (schoolFlowLauncher == null) {
            return;
        }
        schoolFlowLauncher.LIZ(c19eg, new C1245830iWb(EnumC338580DPc.EDIT_SCHOOL, new C1245860iWe(EnumC1231460i9Q.ADD_SCHOOL_SHEET_POP_UP, null, "popup_selected_people"), false, EnumC338600DPe.POST, null, null, true, 52));
    }
}
