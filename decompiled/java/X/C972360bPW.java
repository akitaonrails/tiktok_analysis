package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.SheetStackOptions;
import com.bytedance.android.live.liveinteract.competition.takestage.view.TakeTheStageTimeOptionsFragment;

/* JADX INFO: renamed from: X.0bPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972360bPW {
    public static long LIZIZ;
    public static final C972360bPW LIZ = new C972360bPW();
    public static EnumC972350bPV LIZJ = EnumC972350bPV.LEAVE;

    public static void LIZ(FragmentManager fragmentManager) {
        if (LIZIZ == 0) {
            TakeTheStageTimeOptionsFragment takeTheStageTimeOptionsFragment = new TakeTheStageTimeOptionsFragment();
            SheetStackOptions sheetStackOptions = new SheetStackOptions();
            sheetStackOptions.dimBehindType = 1;
            LIZIZ = C19322110iZ.LJ(fragmentManager, takeTheStageTimeOptionsFragment, sheetStackOptions, "live_match_take_the_stage_time_options_sheet", new InterfaceC1090170eTX() { // from class: X.0bPb
                @Override // X.InterfaceC1090170eTX
                public final void LIZ(long j) {
                }
            }, 0, null);
        }
    }
}
