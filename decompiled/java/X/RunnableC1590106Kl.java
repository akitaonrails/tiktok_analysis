package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import java.util.Collections;

/* JADX INFO: renamed from: X.06Kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1590106Kl implements Runnable {
    public final /* synthetic */ StreakPetWidgetAssem LL;

    public RunnableC1590106Kl(StreakPetWidgetAssem streakPetWidgetAssem) {
        this.LL = streakPetWidgetAssem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C06MJ c06mj;
        View rootView;
        C1C7U.LIZ("StreakPetWidgetAssem@8027.resetStreakPetContainerSystemGestureExclusionArea$1");
        try {
            C06MJ c06mj2 = this.LL.LLJJJIL;
            if (c06mj2 != null && c06mj2.getParent() != null) {
                Rect rect = new Rect();
                C06MJ c06mj3 = this.LL.LLJJJIL;
                if (c06mj3 != null) {
                    c06mj3.getGlobalVisibleRect(rect);
                }
                if (Build.VERSION.SDK_INT >= 29 && (c06mj = this.LL.LLJJJIL) != null && (rootView = c06mj.getRootView()) != null) {
                    rootView.setSystemGestureExclusionRects(Collections.singletonList(rect));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StreakPetWidgetAssem@8027.resetStreakPetContainerSystemGestureExclusionArea$1");
    }
}
