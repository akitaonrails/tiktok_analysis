package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookUGCDecorationTestSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.text.a0;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20374514nv {
    public static final void LIZIZ(View view) {
        View viewFindFocus;
        InputMethodManager inputMethodManager;
        Object objH2 = null;
        if (view != null && (viewFindFocus = view.findFocus()) != null) {
            Context context = viewFindFocus.getContext();
            if (context != null) {
                objH2 = C786410Ut5.H2(context, "input_method");
            }
            if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                inputMethodManager.hideSoftInputFromWindow(viewFindFocus.getWindowToken(), 0);
            }
            viewFindFocus.clearFocus();
        }
    }

    public static final boolean LJ(BasePlaybookEditorViewModel basePlaybookEditorViewModel) {
        String str;
        Playbook playbook;
        PlaybookContent playbookContent;
        String str2;
        Playbook playbook2;
        PlaybookContent playbookContent2;
        C20379114of value = basePlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
        if (value != null && (playbook2 = value.LIZ) != null && (playbookContent2 = playbook2.content) != null) {
            str = playbookContent2.title;
        } else {
            str = null;
        }
        C20441214yg.LIZIZ("EditorUtils", String.valueOf(str));
        C20379114of value2 = basePlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
        if (value2 != null && (playbook = value2.LIZ) != null && (playbookContent = playbook.content) != null && (str2 = playbookContent.title) != null && (!a0.LJJJIL(str2))) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(C20359414lU c20359414lU) {
        String str = c20359414lU.LIZIZ;
        if (str != null && !a0.LJJJIL(str)) {
            return false;
        }
        String str2 = c20359414lU.LIZLLL;
        if ((str2 != null && !a0.LJJJIL(str2)) || !c20359414lU.LIZJ.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(PlayRule playRule) {
        if (C758560TpG.LIZ) {
            if (playRule.getConfig().LJIIIZ == 0 || playRule.getConfig().LJIIIZ == 1) {
                return true;
            }
            return false;
        }
        if (playRule.getConfig().LJIIIZ == 0) {
            return true;
        }
        return false;
    }

    public static final C20398214rk LIZLLL(C1117360fBO c1117360fBO, RecyclerView recyclerView) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        try {
            int iIntValue = ((Number) C500260Jjc.LJI(c1117360fBO.LL, AFwS276S0000000_31.get$arr$(322)).getSecond()).intValue();
            if (iIntValue > 0) {
                if (recyclerView == null) {
                    viewHolderFindViewHolderForAdapterPosition = null;
                } else {
                    viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iIntValue);
                }
                if (!(viewHolderFindViewHolderForAdapterPosition instanceof C20398214rk)) {
                    return null;
                }
                return (C20398214rk) viewHolderFindViewHolderForAdapterPosition;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("EditorUtils", String.valueOf(th.getMessage()));
        }
        return null;
    }

    public static final boolean LJFF(C20374614nw c20374614nw, BasePlaybookEditorViewModel basePlaybookEditorViewModel) {
        int i;
        if (c20374614nw == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stepCount=");
        sbLIZ.append(c20374614nw.LIZ);
        sbLIZ.append(", emptySteps=");
        sbLIZ.append(c20374614nw.LIZJ.size());
        C20441214yg.LIZIZ("EditorUtils", C2188811AlT.LIZIZ(sbLIZ));
        int size = c20374614nw.LIZ - c20374614nw.LIZJ.size();
        if (!C758560TpG.LIZ && !MultiGuestPlaybookUGCDecorationTestSetting.INSTANCE.enable()) {
            i = 2;
        } else {
            i = 1;
        }
        if (size < i || !LJ(basePlaybookEditorViewModel)) {
            return false;
        }
        return true;
    }

    public static final void LJIIJJI(C510160Jza c510160Jza, boolean z) {
        if (c510160Jza != null) {
            if (z) {
                if (c510160Jza.LIZLLL != null) {
                    C786410Ut5.j5(c510160Jza.LIZLLL, 1.0f);
                }
            } else {
                if (c510160Jza.LIZLLL == null) {
                    return;
                }
                C786410Ut5.j5(c510160Jza.LIZLLL, 0.5f);
            }
        }
    }

    public static final boolean LIZ(C20374614nw c20374614nw, BasePlaybookEditorViewModel basePlaybookEditorViewModel, Function1<? super Integer, Unit> function1) {
        Integer num;
        if (!LJFF(c20374614nw, basePlaybookEditorViewModel)) {
            if (!LJ(basePlaybookEditorViewModel)) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131854073));
                function1.invoke(0);
                return false;
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131854072));
            return false;
        }
        if (c20374614nw != null) {
            List<Integer> list = c20374614nw.LIZIZ;
            if (list != null && list.isEmpty()) {
                return true;
            }
            List<Integer> list2 = c20374614nw.LIZIZ;
            if (list2 != null && (num = (Integer) C13LP.LJJJLZIJ(0, list2)) != null) {
                function1.invoke(Integer.valueOf(num.intValue()));
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131854039));
            }
        }
        return false;
    }

    public static final boolean LIZJ(BasePlaybookEditorViewModel basePlaybookEditorViewModel, Context context, Function0<Unit> function0) {
        PlaybookContent playbookContent;
        String str;
        String str2;
        C20359414lU next;
        PlaybookContent playbookContent2;
        boolean z;
        String str3;
        String str4;
        List<C20359414lU> list;
        if (basePlaybookEditorViewModel.LLILLL.LIZIZ.getValue() == null) {
            return false;
        }
        C20379114of value = basePlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
        boolean z2 = true;
        Boolean boolValueOf = null;
        if (value != null) {
            C20360614lg c20360614lg = value.LIZIZ;
            if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
                Iterator<C20359414lU> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (!LJI(next)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
            } else {
                next = null;
            }
            PlaybookContent playbookContent3 = value.LIZ.content;
            if ((playbookContent3 == null || (str4 = playbookContent3.title) == null || a0.LJJJIL(str4)) && (((playbookContent2 = value.LIZ.content) == null || (str3 = playbookContent2.description) == null || a0.LJJJIL(str3)) && next == null)) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C20377814oS c20377814oS = basePlaybookEditorViewModel.LLILZ;
            c20377814oS.getClass();
            Pair pair = new Pair(c20377814oS.LJFF, Integer.valueOf(c20377814oS.LJI));
            PlaybookContent playbookContent4 = (PlaybookContent) pair.getFirst();
            if ((playbookContent4 != null && (str2 = playbookContent4.title) != null && !a0.LJJJIL(str2)) || (((playbookContent = (PlaybookContent) pair.getFirst()) != null && (str = playbookContent.description) != null && !a0.LJJJIL(str)) || ((Number) pair.getSecond()).intValue() > 0)) {
                z2 = false;
            }
            if (C500260Jjc.LJJIFFI(Boolean.valueOf(z2))) {
                C403501hZ.LIZ(AnonymousClass0206.get$arr$(419));
            }
            return false;
        }
        if (context == null) {
            return false;
        }
        LJIIL(context, C497740JfY.LJIJI(2131854109), C497740JfY.LJIJI(2131854057), C497740JfY.LJIJI(2131854056), C497740JfY.LJIJI(2131854055), true, new C020W(basePlaybookEditorViewModel, (BasePlaybookEditorViewModel) function0, (Function0<Unit>) 68));
        return true;
    }

    public static final void LJIIIZ(FragmentManager fragmentManager, LiveSheetFragment liveSheetFragment, String str) {
        if (fragmentManager != null) {
            try {
                C19322110iZ.LJFF(fragmentManager, liveSheetFragment, str, null, 0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJ("EditorUtils", th.getMessage());
            }
        }
    }

    public static final void LJIIJ(LiveSheetFragment liveSheetFragment, BasePlaybookSheetFragment basePlaybookSheetFragment, String str) {
        if (liveSheetFragment != null) {
            try {
                if (!liveSheetFragment.isStateSaved()) {
                    C19322110iZ.LJFF(liveSheetFragment.getChildFragmentManager(), basePlaybookSheetFragment, str, null, 0);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJ("EditorUtils", th.getMessage());
            }
        }
    }

    public static final void LJIIIIZZ(int i, String str, String str2, String str3, Throwable th) {
        String logId;
        String str4 = "";
        if (th != null) {
            if (!(th instanceof C501470JlZ)) {
                logId = "";
            } else {
                logId = ((C501470JlZ) th).getLogId();
                if (logId != null) {
                }
            }
            str4 = logId;
        }
        C01N8.LIZ(i, str, str2, 0L, "anchor", str3, str4);
    }

    public static final void LJIIL(Context context, String str, String str2, String str3, String str4, boolean z, Function1<? super Boolean, Unit> function1) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = str;
        c782110Um9.LJIIIZ(str2);
        c782110Um9.LJIILL = z;
        c782110Um9.LJIIJJI(str4, new C515201za(function1, 12));
        c782110Um9.LJIILJJIL(str3, new C515201za(function1, 13));
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
