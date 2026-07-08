package X;

import Y.ARunnableS132S0100000_32;
import android.os.Looper;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostMockAlwaysShowPreferenceHintSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveQuickCohostPreferenceMatchTimingSettings;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.195u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214836195u implements InterfaceC214832195q {
    public final C214831195p LIZ;
    public View LIZIZ;
    public ImageView LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public EnumC214828195m LIZLLL = EnumC214828195m.LARGE;
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS132S0100000_32 LJII = new ARunnableS132S0100000_32(this, 105);

    public C214836195u(C214831195p c214831195p) {
        this.LIZ = c214831195p;
    }

    @Override // X.InterfaceC214832195q
    public void onEvent(AbstractC214838195w abstractC214838195w) {
        String str;
        long jLongValue = 0;
        boolean z = true;
        if (Intrinsics.LJFF(abstractC214838195w, C214840195y.LIZ)) {
            if (!C1152520g66.LIZIZ()) {
                C20441214yg.LJIIIZ("PreferenceEntranceHintComponent", "OnHintTimeReached → rollback flag off; cap NOT consumed");
                return;
            }
            boolean value = LiveCohostMockAlwaysShowPreferenceHintSetting.INSTANCE.getValue();
            if (!value) {
                Long lLIZ = InterfaceC1104970erP.V2.LIZ();
                if (lLIZ != null) {
                    jLongValue = lLIZ.longValue();
                }
                if (!(!DateUtils.isToday(jLongValue))) {
                    return;
                }
            }
            if (this.LIZLLL != EnumC214828195m.LARGE) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OnHintTimeReached → suppressed in ");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(" tile; cap NOT consumed");
                C20441214yg.LJIIIZ("PreferenceEntranceHintComponent", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (!C915980Zwa.LJI().LIZ().LJIJI()) {
                C20441214yg.LJIIIZ("PreferenceEntranceHintComponent", "OnHintTimeReached → suppressed for non-music-qualified host; cap NOT consumed");
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("OnHintTimeReached lastCategory=LARGE music-qualified → show hint");
            if (value) {
                str = " (mock-always-show ON → cap NOT consumed)";
            } else {
                str = " + mark cap";
            }
            sbLIZ2.append(str);
            C20441214yg.LJIIIZ("PreferenceEntranceHintComponent", C2188811AlT.LIZIZ(sbLIZ2));
            this.LJ = true;
            LIZ(true, false);
            if (!value) {
                InterfaceC1104970erP.V2.LIZJ(Long.valueOf(System.currentTimeMillis()));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C214841195z.LIZ)) {
            this.LJI.removeCallbacks(this.LJII);
            long setPreferenceEntryDelayMs = LiveQuickCohostPreferenceMatchTimingSettings.INSTANCE.getSetPreferenceEntryDelayMs();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("scheduleHintTimer delayMs=");
            sbLIZ3.append(setPreferenceEntryDelayMs);
            sbLIZ3.append(" (anchor=OnOverlayShown)");
            C20441214yg.LJIIIZ("PreferenceEntranceHintComponent", C2188811AlT.LIZIZ(sbLIZ3));
            if (setPreferenceEntryDelayMs <= 0) {
                this.LJII.run();
                return;
            } else {
                C786410Ut5.LJLIIL(setPreferenceEntryDelayMs, this.LJI, this.LJII);
                return;
            }
        }
        if (abstractC214838195w instanceof C20689215xa) {
            this.LJI.removeCallbacks(this.LJII);
            this.LJ = false;
            LIZ(false, true);
            return;
        }
        if (!Intrinsics.LJFF(abstractC214838195w, C960250b5z.LIZ) && !(abstractC214838195w instanceof C960220b5w)) {
            if (abstractC214838195w instanceof C1158080gF4) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("OnTileSizeChanged category=");
                C1158080gF4 c1158080gF4 = (C1158080gF4) abstractC214838195w;
                sbLIZ4.append(c1158080gF4.LIZ);
                sbLIZ4.append(" (was=");
                sbLIZ4.append(this.LIZLLL);
                sbLIZ4.append(") hintRequested=");
                sbLIZ4.append(this.LJ);
                sbLIZ4.append(" → re-evaluate visibility (cap NOT touched)");
                C20441214yg.LJIIIZ("PreferenceEntranceHintComponent", C2188811AlT.LIZIZ(sbLIZ4));
                EnumC214828195m enumC214828195m = c1158080gF4.LIZ;
                this.LIZLLL = enumC214828195m;
                if (!this.LJ || enumC214828195m != EnumC214828195m.LARGE || !C1152520g66.LIZIZ() || !C915980Zwa.LJI().LIZ().LJIJI()) {
                    z = false;
                }
                LIZ(z, false);
                return;
            }
            if (!(abstractC214838195w instanceof C1158070gF3)) {
                if (abstractC214838195w instanceof C960230b5x) {
                    this.LJI.removeCallbacks(this.LJII);
                    this.LJ = false;
                    this.LJFF = false;
                    LIZ(false, false);
                    return;
                }
                if (!Intrinsics.LJFF(abstractC214838195w, C960240b5y.LIZ) && !Intrinsics.LJFF(abstractC214838195w, C214839195x.LIZ) && !(abstractC214838195w instanceof C1158060gF2)) {
                    throw new C1954807lC();
                }
                return;
            }
            return;
        }
        this.LJI.removeCallbacks(this.LJII);
        this.LJ = false;
        LIZ(false, false);
    }

    public final void LIZ(boolean z, boolean z2) {
        int i;
        View view = this.LIZIZ;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        } else if (z2 && view.getVisibility() != 8) {
            i = 4;
        } else {
            i = 8;
        }
        if (view.getVisibility() == i) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, view);
        view.setClickable(z);
        view.setFocusable(z);
        if (z && !this.LJFF) {
            Map mapLJJJ = C955400ayA.LJJJ("cohost_window");
            if (mapLJJJ != null) {
                C955400ayA.LLIILII("livesdk_connection_preference_entrace_show", mapLJJJ);
            }
            this.LJFF = true;
        }
        C214831195p c214831195p = this.LIZ;
        c214831195p.getClass();
        c214831195p.LIZ(new C1158070gF3(z));
    }
}
