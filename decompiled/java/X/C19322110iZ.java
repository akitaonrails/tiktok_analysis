package X;

import Y.ARunnableS76S0200000_7;
import Y.ARunnableS97S0200000_28;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.view.sheet.SheetStackOptions;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.10iZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19322110iZ {
    public static void LIZ(long j) {
        C20484615Do c20484615Do = C464790IKn.LIZ.LIZ.get(j);
        if (c20484615Do != null) {
            c20484615Do.LIZ(1);
        }
    }

    public static C20484615Do LIZJ(View view) {
        C20484615Do c20484615Do;
        while (view != null) {
            Object tag = view.getTag(R.id.v4d);
            if ((tag instanceof C20484615Do) && (c20484615Do = (C20484615Do) tag) != null) {
                return c20484615Do;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static void LJII(InterfaceC20484915Dr interfaceC20484915Dr) {
        C20484715Dp c20484715Dp = C464790IKn.LIZ;
        if (interfaceC20484915Dr != null) {
            ((CopyOnWriteArraySet) c20484715Dp.LIZJ).remove(interfaceC20484915Dr);
        } else {
            c20484715Dp.getClass();
        }
    }

    public static void LIZIZ(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C011Z.LIZ.LJIILIIL() != null) {
                HashMap map = new HashMap();
                map.put("sheet_tag", str);
                C1CC2.LIZIZ("SheetCommitException", e, map);
            }
            C011Z.LIZ.getClass();
        }
    }

    public static void LJI(FragmentManager fragmentManager, InterfaceC20484815Dq interfaceC20484815Dq, String str, InterfaceC1090170eTX interfaceC1090170eTX) {
        LJFF(fragmentManager, interfaceC20484815Dq, str, interfaceC1090170eTX, 0);
    }

    public static long LIZLLL(FragmentManager fragmentManager, Class<? extends LiveSheetFragment> cls, String str, SheetOptions sheetOptions, Bundle bundle) {
        if (fragmentManager != null && cls != null) {
            long jNanoTime = System.nanoTime();
            LiveSheetHostFragment liveSheetHostFragment = new LiveSheetHostFragment();
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("com.bytedance.android.live.design.view.sheet.FRAGMENT_CLASS", cls.getCanonicalName(), bundle2);
            C786410Ut5.LJJJI("com.bytedance.android.live.design.view.sheet.FRAGMENT_TAG", str, bundle2);
            bundle2.putLong("com.bytedance.android.live.design.view.sheet.SHEET_TOKEN", jNanoTime);
            C786410Ut5.LJJIJL(bundle2, "com.bytedance.android.live.design.view.sheet.SHEET_OPTIONS", sheetOptions);
            C786410Ut5.LJJIIZI(bundle2, bundle, "com.bytedance.android.live.design.view.sheet.SHEET_START_ARGS");
            bundle2.putInt("com.bytedance.android.live.design.view.sheet.SHEET_PAD_ADAPTER_TYPE", 0);
            liveSheetHostFragment.setArguments(bundle2);
            LIZIZ(new ARunnableS76S0200000_7(fragmentManager, liveSheetHostFragment, 73), str);
            return jNanoTime;
        }
        return 0L;
    }

    public static long LJFF(FragmentManager fragmentManager, InterfaceC20484815Dq interfaceC20484815Dq, String str, InterfaceC1090170eTX interfaceC1090170eTX, int i) {
        return LJ(fragmentManager, interfaceC20484815Dq, null, str, interfaceC1090170eTX, i, null);
    }

    public static long LJ(FragmentManager fragmentManager, InterfaceC20484815Dq interfaceC20484815Dq, SheetStackOptions sheetStackOptions, String str, InterfaceC1090170eTX interfaceC1090170eTX, int i, Bundle bundle) {
        if (fragmentManager != null && interfaceC20484815Dq != null) {
            long jNanoTime = System.nanoTime();
            if (interfaceC1090170eTX != null) {
                interfaceC1090170eTX.LIZ(jNanoTime);
            }
            LiveSheetHostFragment liveSheetHostFragment = new LiveSheetHostFragment();
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("com.bytedance.android.live.design.view.sheet.FRAGMENT_TAG", str, bundle2);
            bundle2.putLong("com.bytedance.android.live.design.view.sheet.SHEET_TOKEN", jNanoTime);
            bundle2.putInt("com.bytedance.android.live.design.view.sheet.SHEET_PAD_ADAPTER_TYPE", i);
            C786410Ut5.LJJIIZI(bundle2, bundle, "com.bytedance.android.live.design.view.sheet.SHEET_START_ARGS");
            C786410Ut5.LJJIJL(bundle2, "com.bytedance.android.live.design.view.sheet.SHEET_STACK_OPTIONS", sheetStackOptions);
            liveSheetHostFragment.LLILZIL = interfaceC20484815Dq;
            liveSheetHostFragment.setArguments(bundle2);
            if (sheetStackOptions != null && sheetStackOptions.vshotExposeDetectEnabled) {
                C2211631BhB.LJIIJ(liveSheetHostFragment);
            }
            LIZIZ(new ARunnableS97S0200000_28(fragmentManager, liveSheetHostFragment, 36), str);
            return jNanoTime;
        }
        return 0L;
    }
}
