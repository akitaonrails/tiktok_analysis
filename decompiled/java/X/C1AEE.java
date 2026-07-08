package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.1AEE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1AEE extends FrameLayout {
    public C1ACD LL;
    public InterfaceC2175541ACi LLILLJJLI;
    public volatile Long LLILLL;
    public volatile Long LLILZ;
    public volatile EnumC2176021AEe LLILZIL;
    public volatile String LLILZLL;
    public volatile Integer LLIZ;
    public volatile Long LLIZLLLIL;
    public C1AEV LLJ;
    public C1699360uK6 LLJI;

    public C1AEE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
        LIZJ(this, "onDetachedFromWindow", null, "unregistered", null, null, 26);
        C1AEV c1aev = this.LLJ;
        if (c1aev != null) {
            c1aev.onDetachedFromWindow();
        }
    }

    public final boolean LIZIZ() {
        C1120704Zx c1120704Zx = C1120704Zx.LIZ;
        InterfaceC2175541ACi interfaceC2175541ACi = this.LLILLJJLI;
        c1120704Zx.getClass();
        if (interfaceC2175541ACi == null) {
            return false;
        }
        return Intrinsics.LJFF(C1120704Zx.LIZJ, interfaceC2175541ACi);
    }

    public final void LJI() {
        EnumC2176021AEe enumC2176021AEe = EnumC2176021AEe.RELEASE;
        C1ACD c1acd = this.LL;
        if (c1acd == null) {
            LIZJ(this, "releaseByScene", enumC2176021AEe, "skip_no_helper", null, null, 24);
            return;
        }
        LIZJ(this, "releaseByScene", enumC2176021AEe, "start", c1acd, null, 16);
        if (LJIIIIZZ(enumC2176021AEe)) {
            LIZJ(this, "releaseByScene", enumC2176021AEe, "protect_inner_flow", c1acd, null, 16);
        } else {
            LIZ(enumC2176021AEe);
        }
    }

    public final void LJIIIZ() {
        EnumC2176021AEe enumC2176021AEe = EnumC2176021AEe.EXPLICIT_STOP;
        C1ACD c1acd = this.LL;
        if (c1acd == null) {
            LIZJ(this, "stopByScene", enumC2176021AEe, "skip_no_helper", null, null, 24);
            return;
        }
        LIZJ(this, "stopByScene", enumC2176021AEe, "start", c1acd, null, 16);
        if (LJIIIIZZ(enumC2176021AEe)) {
            LIZJ(this, "stopByScene", enumC2176021AEe, "protect_inner_flow", c1acd, null, 16);
            return;
        }
        if (C1AEJ.LIZIZ().LIZIZ && LJII(enumC2176021AEe)) {
            LIZJ(this, "stopByScene", enumC2176021AEe, "destroy", c1acd, null, 16);
            LIZ(enumC2176021AEe);
        } else {
            c1acd.LIZIZ();
            LIZJ(this, "stopByScene", enumC2176021AEe, "stopWithStreamData", c1acd, null, 16);
        }
    }

    public String getCurrentResolution() {
        C1ACD c1acd = this.LL;
        if (c1acd != null) {
            return c1acd.getCurrentResolution();
        }
        return null;
    }

    public InterfaceC464060IHs getTextureView() {
        C2175491ACd c2175491ACdLJJJJLI;
        C1ACD c1acd = this.LL;
        if (c1acd == null || (c2175491ACdLJJJJLI = c1acd.LJJJJLI()) == null) {
            return null;
        }
        return c2175491ACdLJJJJLI.LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        EventBus.LIZLLL().LJIJJ(this);
        super.onAttachedToWindow();
        LIZJ(this, "onAttachedToWindow", null, "registered", null, null, 26);
        C1AEV c1aev = this.LLJ;
        if (c1aev != null) {
            c1aev.onAttachedToWindow();
        }
    }

    public final C1ACD getLivePlayHelper() {
        return this.LL;
    }

    public final void LIZ(EnumC2176021AEe enumC2176021AEe) {
        C1ACD c1acd = this.LL;
        if (c1acd == null) {
            LIZJ(this, "destroyByScene", enumC2176021AEe, "skip_no_helper", null, null, 24);
            return;
        }
        LIZJ(this, "destroyByScene", enumC2176021AEe, "start", c1acd, null, 16);
        c1acd.LIZIZ();
        c1acd.LJJIJIL(enumC2176021AEe.name().toLowerCase(Locale.ROOT), true);
        C1120704Zx.LIZ.getClass();
        if (Intrinsics.LJFF(C1120704Zx.LIZIZ, c1acd)) {
            C1120704Zx.LIZIZ = null;
        }
        this.LL = null;
        this.LLILZIL = enumC2176021AEe;
        this.LLILZLL = "destroyByScene";
        this.LLIZ = Integer.valueOf(c1acd.hashCode());
        this.LLIZLLLIL = Long.valueOf(SystemClock.elapsedRealtime());
        LIZJ(this, "destroyByScene", enumC2176021AEe, "done", c1acd, null, 16);
    }

    public final void LIZLLL(EnumC2176021AEe enumC2176021AEe) {
        C1ACD c1acd = this.LL;
        if (c1acd == null) {
            LIZJ(this, "pauseByScene", enumC2176021AEe, "skip_no_helper", null, null, 24);
            return;
        }
        LIZJ(this, "pauseByScene", enumC2176021AEe, "start", c1acd, null, 16);
        if (LJIIIIZZ(enumC2176021AEe)) {
            LIZJ(this, "pauseByScene", enumC2176021AEe, "protect_inner_flow", c1acd, null, 16);
            return;
        }
        if (!C1AEJ.LIZIZ().LIZIZ) {
            c1acd.LJJJJIZL();
            c1acd.LJJIJIL(null, true);
            this.LL = null;
            this.LLILZIL = enumC2176021AEe;
            this.LLILZLL = "legacy_pause_destroy";
            this.LLIZ = Integer.valueOf(c1acd.hashCode());
            this.LLIZLLLIL = Long.valueOf(SystemClock.elapsedRealtime());
            LIZJ(this, "pauseByScene", enumC2176021AEe, "legacy_pause_destroy", c1acd, null, 16);
            return;
        }
        if (LJII(enumC2176021AEe)) {
            LIZJ(this, "pauseByScene", enumC2176021AEe, "destroy", c1acd, null, 16);
            LIZ(enumC2176021AEe);
        } else {
            c1acd.LJJJJIZL();
            LIZJ(this, "pauseByScene", enumC2176021AEe, "pauseWithStreamData", c1acd, null, 16);
        }
    }

    public final void LJ(C1749730vdL c1749730vdL) {
        C1ACD c1acd;
        Long l;
        C1ACD c1acd2 = this.LL;
        long j = c1749730vdL.LIZIZ.id;
        if (c1acd2 != null && (l = this.LLILLL) != null && l.longValue() == j) {
            boolean zLJJII = c1acd2.LJJII();
            Boolean boolValueOf = Boolean.valueOf(zLJJII);
            boolean zLJFF = true;
            if (C1AEJ.LIZIZ().LJII != C1AEI.LL) {
                if (C1AEJ.LIZIZ().LJII != C1AEI.LLILLL) {
                    zLJFF = Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
                }
            } else {
                zLJFF = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("targetRoom=");
            sbLIZ.append(j);
            sbLIZ.append(",isPlaying=");
            sbLIZ.append(zLJJII);
            sbLIZ.append(",skipDuplicatePlay=");
            sbLIZ.append(zLJFF);
            LIZJ(this, "play", null, "reuse_helper", c1acd2, C2188811AlT.LIZIZ(sbLIZ), 2);
            if (zLJFF) {
                C1699360uK6 c1699360uK6 = this.LLJI;
                if (c1699360uK6 != null) {
                    c1acd2.LJIILIIL(c1699360uK6);
                }
                c1acd2.LJIILJJIL(c1749730vdL.LIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("targetRoom=");
                sbLIZ2.append(j);
                sbLIZ2.append(",mute=");
                sbLIZ2.append(c1749730vdL.LIZ);
                sbLIZ2.append(",isPlaying=");
                sbLIZ2.append(zLJJII);
                LIZJ(this, "play", null, "skip_playWithStreamData_duplicate", c1acd2, C2188811AlT.LIZIZ(sbLIZ2), 2);
                return;
            }
        } else {
            this.LLILLL = Long.valueOf(j);
            C1120704Zx.LIZ.getClass();
            this.LL = C1120704Zx.LIZ();
            Integer numValueOf = null;
            this.LLILZIL = null;
            this.LLILZLL = null;
            this.LLIZ = null;
            this.LLIZLLLIL = null;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("targetRoom=");
            sbLIZ3.append(j);
            sbLIZ3.append(",oldHelper=");
            if (c1acd2 != null) {
                numValueOf = Integer.valueOf(c1acd2.hashCode());
            }
            sbLIZ3.append(numValueOf);
            LIZJ(this, "play", null, "new_helper", null, C2188811AlT.LIZIZ(sbLIZ3), 10);
        }
        C1699360uK6 c1699360uK62 = this.LLJI;
        if (c1699360uK62 != null && (c1acd = this.LL) != null) {
            c1acd.LJIILIIL(c1699360uK62);
        }
        C1ACD c1acd3 = this.LL;
        if (c1acd3 != null) {
            c1acd3.LJJIIJZLJL(c1749730vdL.LIZ, c1749730vdL.LIZIZ, c1749730vdL.LIZJ, false, null, "", false, null);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("targetRoom=");
        sbLIZ4.append(j);
        sbLIZ4.append(",mute=");
        sbLIZ4.append(c1749730vdL.LIZ);
        LIZJ(this, "play", null, "playWithStreamData", null, C2188811AlT.LIZIZ(sbLIZ4), 10);
    }

    public final void LJFF(InterfaceC2175541ACi interfaceC2175541ACi) {
        C1ACD c1acd = this.LL;
        if (c1acd == null) {
            C1120704Zx.LIZ.getClass();
            if (Intrinsics.LJFF(C1120704Zx.LIZJ, interfaceC2175541ACi)) {
                C1120704Zx.LIZJ = null;
            }
            if (Intrinsics.LJFF(C1120704Zx.LIZIZ, null)) {
                C1120704Zx.LIZIZ = null;
            }
            LIZJ(this, "releaseLiveCallback", EnumC2176021AEe.RELEASE, "unregister_clear_no_helper", null, null, 24);
            return;
        }
        EnumC2176021AEe enumC2176021AEe = EnumC2176021AEe.RELEASE;
        LIZJ(this, "releaseLiveCallback", enumC2176021AEe, "start", c1acd, null, 16);
        if (!LJIIIIZZ(enumC2176021AEe)) {
            c1acd.LIZIZ();
            LIZJ(this, "releaseLiveCallback", enumC2176021AEe, "stopWithStreamData", c1acd, null, 16);
        } else {
            LIZJ(this, "releaseLiveCallback", enumC2176021AEe, "protect_inner_flow", c1acd, null, 16);
        }
        C1120704Zx.LIZ.getClass();
        if (Intrinsics.LJFF(C1120704Zx.LIZJ, interfaceC2175541ACi)) {
            C1120704Zx.LIZJ = null;
        }
        if (Intrinsics.LJFF(C1120704Zx.LIZIZ, c1acd)) {
            C1120704Zx.LIZIZ = null;
        }
        LIZJ(this, "releaseLiveCallback", enumC2176021AEe, "unregister_clear", c1acd, null, 16);
    }

    public final boolean LJII(EnumC2176021AEe enumC2176021AEe) {
        boolean z;
        String str;
        switch (C2176011AEd.LIZ[enumC2176021AEe.ordinal()]) {
            case 1:
            case 2:
                z = C1AEJ.LIZIZ().LIZJ;
                break;
            case 3:
            case 4:
            case 5:
                z = C1AEJ.LIZIZ().LIZLLL;
                break;
            case 6:
                z = C1AEJ.LIZIZ().LJ;
                break;
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                z = true;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                z = C1AEJ.LIZIZ().LJFF;
                break;
            default:
                throw new C1954807lC();
        }
        if (z) {
            str = "destroy";
        } else {
            str = "pause";
        }
        LIZJ(this, "shouldDestroyByScene", enumC2176021AEe, str, null, null, 24);
        return z;
    }

    public final boolean LJIIIIZZ(EnumC2176021AEe enumC2176021AEe) {
        String str;
        boolean z = false;
        if (this.LLILLL == null || !Intrinsics.LJFF(this.LLILLL, this.LLILZ)) {
            return false;
        }
        EnumC2176021AEe enumC2176021AEe2 = EnumC2176021AEe.ENTER_INNER_LIVE;
        if (enumC2176021AEe == enumC2176021AEe2 && C1AEJ.LIZIZ().LJ) {
            LIZJ(this, "shouldProtectInnerFlowHandoff", enumC2176021AEe, "allow_destroy_enter_inner", null, null, 24);
            return false;
        }
        if (enumC2176021AEe != enumC2176021AEe2) {
            z = true;
        }
        if (z) {
            str = "protect";
        } else {
            str = "allow_enter_inner_scene";
        }
        LIZJ(this, "shouldProtectInnerFlowHandoff", enumC2176021AEe, str, null, null, 24);
        return z;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void liveCardJump(C1164340gPA c1164340gPA) {
        this.LLILZ = c1164340gPA.LIZ;
        EnumC2176021AEe enumC2176021AEe = c1164340gPA.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventRoom=");
        sbLIZ.append(c1164340gPA.LIZ);
        sbLIZ.append(",destroyOuter=");
        sbLIZ.append(c1164340gPA.LIZJ);
        LIZJ(this, "liveCardJump", enumC2176021AEe, "event", null, C2188811AlT.LIZIZ(sbLIZ), 8);
        if (c1164340gPA.LIZJ && this.LLILLL != null && Intrinsics.LJFF(this.LLILLL, this.LLILZ)) {
            LIZJ(this, "liveCardJump", c1164340gPA.LIZIZ, "destroy_outer_player", null, null, 24);
            LIZ(c1164340gPA.LIZIZ);
        } else {
            LIZJ(this, "liveCardJump", c1164340gPA.LIZIZ, "no_action", null, null, 24);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("visibility=");
            sbLIZ.append(i);
            LIZJ(this, "onWindowVisibilityChanged", null, "clear_jump_room", null, C2188811AlT.LIZIZ(sbLIZ), 10);
            this.LLILZ = null;
        }
    }

    public final void setAttachCallback(C1AEV c1aev) {
        this.LLJ = c1aev;
    }

    public final void setLivePlayerEntranceParam(C1699360uK6 c1699360uK6) {
        this.LLJI = c1699360uK6;
    }

    public void setMute(boolean z) {
        C1ACD c1acd = this.LL;
        if (c1acd != null) {
            c1acd.LJIILJJIL(z);
        }
    }

    public final void LJIIJ(String str, InterfaceC1699420uKC interfaceC1699420uKC) {
        C1ACD c1acd;
        if (str != null && !a0.LJJJIL(str) && (c1acd = this.LL) != null) {
            c1acd.switchResolution(str, interfaceC1699420uKC);
        }
    }

    public C1AEE(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bv_, this, true);
    }

    public static void LIZJ(C1AEE c1aee, String str, EnumC2176021AEe enumC2176021AEe, String str2, C1ACD c1acd, String str3, int i) {
        C1ACD c1acd2 = c1acd;
        EnumC2176021AEe enumC2176021AEe2 = enumC2176021AEe;
        String str4 = null;
        if ((i & 2) != 0) {
            enumC2176021AEe2 = null;
        }
        if ((i & 8) != 0) {
            c1acd2 = c1aee.LL;
        }
        if ((i & 16) == 0) {
            str4 = str3;
        }
        c1aee.getClass();
        new C1AEF(str, enumC2176021AEe2, str2, c1aee, c1acd2, str4);
        C034X.LIZ();
    }
}
