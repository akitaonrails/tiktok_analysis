package Y;

import X.C098200Yq;
import X.C0QDS;
import X.C1324840ka2;
import X.C13BV;
import X.C15438062q;
import X.C1565080qpW;
import X.C1576580r84;
import X.C1590320rUE;
import X.C1590590rUf;
import X.C1611120s1m;
import X.C189200o6;
import X.C1C7U;
import X.C1ER1;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2179971ATj;
import X.C2238821Cjw;
import X.EnumC1605470rsf;
import X.ViewOnClickListenerC1605710rt3;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.feed.seriescenter.MiniDramaCenterOverViewBaseCell;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tiktok.preload.ActivityLaunchScene;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS28S1200000_24 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        JSONObject jSONObject = new JSONObject();
        C1590320rUE c1590320rUE = (C1590320rUE) this.l1;
        String str = this.s0;
        C1590320rUE c1590320rUE2 = (C1590320rUE) this.l2;
        try {
            jSONObject.put("tab_name", c1590320rUE.LIZ);
            jSONObject.put("tab_location", c1590320rUE.LIZIZ);
            if (str == null || str.length() == 0) {
                str = "unknown_page";
            }
            jSONObject.put("page_name", str);
            jSONObject.put("enter_from", c1590320rUE.LJ);
            jSONObject.put("enter_method", c1590320rUE.LIZJ);
            jSONObject.put("duration", System.currentTimeMillis() - c1590320rUE.LIZLLL);
            jSONObject.put("to_tab_name", c1590320rUE2.LIZ);
            C189200o6.m2constructorimpl(jSONObject.put("to_tab_location", c1590320rUE2.LIZIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C20684815ws.LJIJ("ttinfra_tab_exit", jSONObject);
    }

    public final void LIZ$1() {
        ActivityLaunchScene activityLaunchScene;
        List<C1576580r84<?>> listLIZ = C1565080qpW.LIZ(this.s0);
        if (listLIZ != null) {
            ArrayList arrayList = new ArrayList();
            for (C1576580r84<?> c1576580r84 : listLIZ) {
                if (c1576580r84 instanceof ActivityLaunchScene) {
                    arrayList.add(c1576580r84);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Function0 function0 = (Function0) this.l1;
            if (function0 != null) {
                function0.invoke();
            }
            Intent intent = (Intent) this.l2;
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj : arrayList) {
                C1576580r84 c1576580r842 = (C1576580r84) obj;
                if ((c1576580r842 instanceof ActivityLaunchScene) && (activityLaunchScene = (ActivityLaunchScene) c1576580r842) != null) {
                    activityLaunchScene.LIZIZ = intent == null ? new Intent() : intent;
                }
                Collection collectionLIZIZ = C1565080qpW.LIZIZ(c1576580r842.LIZJ());
                if (collectionLIZIZ == null) {
                    collectionLIZIZ = C13BV.INSTANCE;
                }
                linkedHashMap.put(obj, collectionLIZIZ);
            }
            C2238821Cjw.LIZ.LIZJ(linkedHashMap);
        }
    }

    public static final void run$0(ARunnableS28S1200000_24 aRunnableS28S1200000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TabStaytimeMobHelper@a44.enterTab$1$1");
        try {
            aRunnableS28S1200000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TabStaytimeMobHelper@a44.enterTab$1$1");
    }

    public static final void run$1(ARunnableS28S1200000_24 aRunnableS28S1200000_24) {
        C1590590rUf c1590590rUf = (C1590590rUf) aRunnableS28S1200000_24.l1;
        Aweme aweme = (Aweme) aRunnableS28S1200000_24.l2;
        String str = aRunnableS28S1200000_24.s0;
        c1590590rUf.getClass();
        C1C7U.LIZ("ScrollSwitchHelper@a185.toProfilePage$1L");
        c1590590rUf.LIZLLL(aweme, str);
        C1C7U.LIZIZ("ScrollSwitchHelper@a185.toProfilePage$1L");
    }

    public static final void run$2(ARunnableS28S1200000_24 aRunnableS28S1200000_24) {
        boolean zLIZ;
        C1C7U.LIZ("MiniDramaCenterOverViewBaseCell@20a9.onBindItemView$1$1");
        try {
            ((MiniDramaCenterOverViewBaseCell) aRunnableS28S1200000_24.l1).LLIZ = ((RemoteImageView) aRunnableS28S1200000_24.l2).getWidth();
            ((MiniDramaCenterOverViewBaseCell) aRunnableS28S1200000_24.l1).LLIZLLLIL = ((RemoteImageView) aRunnableS28S1200000_24.l2).getHeight();
            RemoteImageView remoteImageView = (RemoteImageView) aRunnableS28S1200000_24.l2;
            C1324840ka2.LJIIJ(remoteImageView, aRunnableS28S1200000_24.s0, remoteImageView.getWidth(), ((RemoteImageView) aRunnableS28S1200000_24.l2).getHeight());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniDramaCenterOverViewBaseCell@20a9.onBindItemView$1$1");
    }

    public static final void run$3(ARunnableS28S1200000_24 aRunnableS28S1200000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SearchIconGenerator@a3fd.preloadIntermediate$1");
        try {
            C1611120s1m c1611120s1m = (C1611120s1m) aRunnableS28S1200000_24.l1;
            String str = aRunnableS28S1200000_24.s0;
            Aweme aweme = (Aweme) aRunnableS28S1200000_24.l2;
            c1611120s1m.getClass();
            C1ER1 c1er1 = C1ER1.LIZIZ;
            C0QDS c0qdsLJII = c1611120s1m.LJII(aweme, str, c1er1.LLJLILLLLZIIL());
            c1611120s1m.LLJIJIL = c0qdsLJII;
            c1er1.LJLJJLL(c0qdsLJII);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchIconGenerator@a3fd.preloadIntermediate$1");
    }

    public static final void run$4(ARunnableS28S1200000_24 aRunnableS28S1200000_24) {
        boolean zLIZ;
        String uid;
        Function1<? super EnumC1605470rsf, Unit> function1;
        C1C7U.LIZ("SocialAvatarEntry@9232.computeAndSetAvatarMode$1");
        try {
            if (((ViewOnClickListenerC1605710rt3) aRunnableS28S1200000_24.l1).LLILLL.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                User user = ((ViewOnClickListenerC1605710rt3) aRunnableS28S1200000_24.l1).LLJILLL;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid, aRunnableS28S1200000_24.s0) && (function1 = ((ViewOnClickListenerC1605710rt3) aRunnableS28S1200000_24.l1).LLJ) != null) {
                    function1.invoke((EnumC1605470rsf) aRunnableS28S1200000_24.l2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialAvatarEntry@9232.computeAndSetAvatarMode$1");
    }

    public static final void run$5(ARunnableS28S1200000_24 aRunnableS28S1200000_24) {
        try {
            aRunnableS28S1200000_24.LIZ$1();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ARunnableS28S1200000_24(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
