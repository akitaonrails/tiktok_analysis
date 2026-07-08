package X;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import oc.a;

/* JADX INFO: renamed from: X.0oqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488650oqF {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1488670oqH());

    public static void LIZ(boolean z) {
        C1488660oqG.LIZ = z;
        if (!z) {
            return;
        }
        C1488660oqG.LIZIZ = new InterfaceC1848680yCw() { // from class: X.0ViX
            public boolean LIZ;
            public boolean LIZIZ;

            /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
            @Override // X.InterfaceC1848680yCw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 269
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C805350ViX.LIZ():void");
            }

            @Override // X.InterfaceC1848680yCw
            public final void LIZIZ(boolean z2) {
                if (!this.LIZ) {
                    if (z2) {
                        C0X35.LJIIJJI("cold_boot_feed_fragment_onresume_to_layout", true);
                        C0X35.LIZ("cold_boot_main_layout_duration", true);
                        return;
                    }
                    if (C052X.LIZIZ()) {
                        C312230CLt.LIZ(C0CME.FIRST_UI_FRAME);
                    }
                    C0X35.LJIIJJI("cold_boot_main_layout_duration", true);
                    C0X35.LIZ("cold_boot_main_layout_to_draw", true);
                    C1150504el.LIZ().LIZLLL("cold_boot_main_layout_to_measure", false);
                    C1150504el.LIZ().LIZLLL("cold_boot_main_layout_to_focus", false);
                    C1150504el.LIZ().LIZLLL("cold_boot_main_layout_to_feed", false);
                    this.LIZ = true;
                }
            }

            @Override // X.InterfaceC1848680yCw
            public final void LIZJ(boolean z2) {
                if (!this.LIZIZ) {
                    if (z2) {
                        C0X35.LJIIJJI("cold_boot_main_layout_to_draw", true);
                        C0X35.LIZ("cold_boot_main_draw_duration", true);
                        return;
                    }
                    C0X35.LJIIJJI("cold_boot_main_draw_duration", true);
                    C0X35.LIZ("cold_boot_main_draw_tail", true);
                    C0X35.LIZJ("cold_boot_main_resume_to_focus", "main_resume_draw_tail");
                    C1150504el.LIZ().LIZLLL("cold_boot_main_draw_to_focus", false);
                    this.LIZIZ = true;
                }
            }
        };
        boolean zBooleanValue = ((Boolean) C07AF.LIZ.getValue()).booleanValue();
        C2211501Bgy.LLILLJJLI = zBooleanValue;
        if (!zBooleanValue && !C1488680oqI.LIZ) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (C1488660oqG.LIZ) {
                try {
                    ((Application) C786410Ut5.N3(contextLIZ)).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0oqE
                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPaused(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityResumed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStarted(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStopped(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                            System.currentTimeMillis();
                            if (C1488660oqG.LIZ) {
                                ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content);
                                if (a.LL) {
                                    for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                                        if (viewGroup2.getChildAt(i) instanceof a) {
                                            return;
                                        }
                                    }
                                } else {
                                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                                        if (viewGroup.getChildAt(i2) instanceof a) {
                                            return;
                                        }
                                    }
                                }
                                a aVar = new a(activity);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(aVar);
                                aVar.setLayoutParams(layoutParams);
                                if (a.LL) {
                                    while (viewGroup2.getChildCount() > 0) {
                                        View childAt = viewGroup2.getChildAt(0);
                                        C786410Ut5.LJJJLZIJ(childAt, viewGroup2);
                                        aVar.addView(childAt);
                                    }
                                    viewGroup2.addView(aVar, 0);
                                    return;
                                }
                                while (viewGroup.getChildCount() > 0) {
                                    View childAt2 = viewGroup.getChildAt(0);
                                    C786410Ut5.LJJJLZIJ(childAt2, viewGroup);
                                    aVar.addView(childAt2);
                                }
                                viewGroup.addView(aVar, 0);
                            }
                        }
                    });
                    C1488680oqI.LIZ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }
}
