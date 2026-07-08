package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574870r5J extends AbstractC1584410rKh {
    public C19EG LL;
    public View LLILLJJLI;

    @Override // X.AbstractC1584410rKh
    public final void LJI() {
    }

    @Override // X.AbstractC1584410rKh
    public final void onResume() {
    }

    @Override // X.AbstractC1584410rKh
    public final void LIZIZ(View view, Fragment fragment) {
        EnumC1571190qzN enumC1571190qzN;
        MainActivityScope mainActivityScopeLIZ = C0S4U.LIZ(view);
        if (mainActivityScopeLIZ != null) {
            HomeTabAbility homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZ);
            if (homeTabAbilityLIZ != null) {
                homeTabAbilityLIZ.ao(new InterfaceC1585190rLx() { // from class: X.0hT0
                    @Override // X.InterfaceC1585190rLx
                    public final void p1(String str, String str2) {
                        C19EG c19eg;
                        C1205180hT2 c1205180hT2LIZLLL;
                        C1205170hT1 c1205170hT1 = C1205170hT1.LIZ;
                        boolean zLJFF = Intrinsics.LJFF(str2, "Nearby");
                        c1205170hT1.getClass();
                        C1205170hT1.LIZIZ = zLJFF;
                        if (!C1205170hT1.LIZJ()) {
                            return;
                        }
                        if (Intrinsics.LJFF(str2, "Nearby")) {
                            C19EG c19eg2 = this.LL.LL;
                            if (c19eg2 != null) {
                                c1205170hT1.getClass();
                                if (C1205170hT1.LIZIZ && C1205170hT1.LIZ() && (c1205180hT2LIZLLL = C1205170hT1.LIZLLL(c19eg2)) != null) {
                                    if (c1205180hT2LIZLLL.LLILZ) {
                                        c1205180hT2LIZLLL.LLILLL = true;
                                        c1205180hT2LIZLLL.LLIZ.setCompoundDrawablesRelative(null, null, (Drawable) c1205180hT2LIZLLL.LLILZIL.getValue(), null);
                                        c1205180hT2LIZLLL.LLILZ = true;
                                    } else {
                                        c1205180hT2LIZLLL.LLILLL = true;
                                        c1205180hT2LIZLLL.LLIZ.setCompoundDrawablesRelative(null, null, (Drawable) c1205180hT2LIZLLL.LLILZLL.getValue(), null);
                                        c1205180hT2LIZLLL.LLILZ = false;
                                    }
                                }
                            }
                            C1203730hQh.LIZ.getClass();
                            RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
                            if (roamingLocationInfoLIZ != null && roamingLocationInfoLIZ.isManual()) {
                                C1203740hQi.LIZ.getClass();
                                C1203740hQi.LIZIZ.storeLong(C1203740hQi.LIZ("nearby_manually_selected_region_time"), System.currentTimeMillis());
                            }
                        }
                        if (!Intrinsics.LJFF(str, "Nearby") || (c19eg = this.LL.LL) == null) {
                            return;
                        }
                        c1205170hT1.getClass();
                        C1205180hT2 c1205180hT2LIZLLL2 = C1205170hT1.LIZLLL(c19eg);
                        if (c1205180hT2LIZLLL2 != null && c1205180hT2LIZLLL2.LLILLL) {
                            c1205170hT1.getClass();
                            C1205180hT2 c1205180hT2LIZLLL3 = C1205170hT1.LIZLLL(c19eg);
                            if (c1205180hT2LIZLLL3 != null) {
                                c1205180hT2LIZLLL3.LIZJ();
                            }
                        }
                        C1205100hSu.LIZ = null;
                        C1205100hSu.LIZIZ = null;
                    }
                });
            }
            C1205170hT1.LIZ.getClass();
            if (C1205170hT1.LIZIZ()) {
                Context context = view.getContext();
                if (context != null && C960203pA.LIZIZ(context)) {
                    enumC1571190qzN = EnumC1571190qzN.DARK;
                } else {
                    enumC1571190qzN = EnumC1571190qzN.LIGHT;
                }
                TopTabAbility topTabAbilityLIZ = C0S4T.LIZ(mainActivityScopeLIZ);
                if (topTabAbilityLIZ != null) {
                    topTabAbilityLIZ.Tr0("Nearby", enumC1571190qzN, enumC1571190qzN);
                }
            }
        }
    }

    @Override // X.AbstractC1584410rKh
    public final void LJII(View view, C1584440rKk c1584440rKk) {
        C19EG c19egLIZIZ;
        this.LLILLJJLI = view;
        Context context = view.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        this.LL = c19egLIZIZ;
    }
}
