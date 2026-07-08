package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817630W5p extends AbstractC813200VvC {
    public static final C817630W5p LL = new C817630W5p();
    public static final Set<String> LLILLJJLI = new LinkedHashSet();
    public static final Map<Fragment, String> LLILLL = new LinkedHashMap();
    public static final Map<String, Aweme> LLILZ = new LinkedHashMap();
    public static Function0<? extends Aweme> LLILZIL;
    public static Function0<Boolean> LLILZLL;
    public static boolean LLIZ;
    public static boolean LLIZLLLIL;

    public final void LIZ(C19EG c19eg) {
        FragmentManager supportFragmentManager;
        if (LLIZLLLIL && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            supportFragmentManager.LLIILZL(this);
            LLILLJJLI.clear();
            ((LinkedHashMap) LLILLL).clear();
            ((LinkedHashMap) LLILZ).clear();
            LLILZIL = null;
            LLILZLL = null;
            LLIZ = false;
            LLIZLLLIL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[unregister] activity=");
            sbLIZ.append(c19eg.getClass().getSimpleName());
            C1022620cia.LIZ("ClickBackTime", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        LLIZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    @Override // X.AbstractC813200VvC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFragmentViewDestroyed(androidx.fragment.app.FragmentManager r11, androidx.fragment.app.Fragment r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C817630W5p.onFragmentViewDestroyed(androidx.fragment.app.FragmentManager, androidx.fragment.app.Fragment):void");
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
        C786410Ut5.LJJJI("click_back_time_frame_id", (String) ((LinkedHashMap) LLILLL).get(fragment), bundle);
        LLIZ = true;
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        Aweme awemeInvoke;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onFragmentViewCreated] frameCount=");
        Set<String> set = LLILLJJLI;
        sbLIZ.append(set.size());
        C1022620cia.LIZ("ClickBackTime", C2188811AlT.LIZIZ(sbLIZ));
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        String aid = null;
        if (bundle != null) {
            String string = bundle.getString("click_back_time_frame_id");
            if (string != null && string.length() != 0) {
                LLILLL.put(fragment, string);
            }
            if (bundle != null) {
                C786410Ut5.LJJJI("click_back_time_frame_id", "", bundle);
            }
        }
        if (fragment instanceof DialogFragment) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LLILLL;
            Object string2 = linkedHashMap.get(fragment);
            if (string2 == null) {
                string2 = UUID.randomUUID().toString();
                linkedHashMap.put(fragment, string2);
            }
            String str = (String) string2;
            set.add(str);
            Function0<? extends Aweme> function0 = LLILZIL;
            if (function0 != null && (awemeInvoke = function0.invoke()) != null) {
                LLILZ.put(str, awemeInvoke);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[onFragmentViewCreated] non-feed fragment=");
            sbLIZ2.append(fragment.getClass().getSimpleName());
            sbLIZ2.append(", frameId=");
            sbLIZ2.append(str);
            sbLIZ2.append(", frameCount=");
            sbLIZ2.append(set.size());
            sbLIZ2.append(", aweme=");
            Aweme aweme = (Aweme) ((LinkedHashMap) LLILZ).get(str);
            if (aweme != null) {
                aid = aweme.getAid();
            }
            sbLIZ2.append(aid);
            C1022620cia.LIZ("ClickBackTime", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
