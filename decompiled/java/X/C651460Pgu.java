package X;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.config.SearchLynxHorizontalLoadmoreV2;
import defpackage.j;
import java.util.Iterator;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Pgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651460Pgu {
    public static final C651460Pgu LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public volatile C09U0 LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C651460Pgu.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZIZ = new C651460Pgu();
    }

    public final C09U0 LIZIZ() {
        C09U0 c09u0 = this.LIZ;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LIZ;
                if (c09u0 == null) {
                    C09U0 c09u02 = (C09U0) C1807670x8n.p();
                    this.LIZ = c09u02;
                    return c09u02;
                }
            }
        }
        return c09u0;
    }

    public static boolean LIZJ(String str) {
        if (((Number) C07C7.LIZ.getValue()).intValue() != 1 || str.length() == 0) {
            return false;
        }
        Iterator<String> it2 = ((SearchLynxHorizontalLoadmoreV2.LoadmoreWhiteList) SearchLynxHorizontalLoadmoreV2.LIZIZ.getValue()).loadmoreWhiteList.iterator();
        while (it2.hasNext()) {
            if (u.LJIJI(it2.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(InterfaceC634840OvC interfaceC634840OvC, j.d dVar, CompletionBlock<j.c> completionBlock, InterfaceC651280Pgc interfaceC651280Pgc) {
        View view;
        Activity activityLIZLLL;
        C19EG c19eg;
        LifecycleCoroutineScope lifecycleScope;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            view = null;
            activityLIZLLL = null;
        }
        if (activityLIZLLL instanceof C19EG) {
            c19eg = (C19EG) activityLIZLLL;
        } else {
            c19eg = null;
        }
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(view, c19eg);
        if (lifecycleOwnerLJIJI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJIJI)) != null) {
            C23250099c.LIZLLL(lifecycleScope, LIZIZ().LIZ, null, new C651440Pgs(dVar, interfaceC651280Pgc, completionBlock, interfaceC634840OvC, null), 2);
        }
    }
}
