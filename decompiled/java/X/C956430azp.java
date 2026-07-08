package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0azp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956430azp extends FrameLayout {
    public static final int LLJILJILJ = C439101nJ.LIZ(133);
    public static final int LLJILLL = C439101nJ.LIZ(80);
    public static final int LLJJ = C439101nJ.LIZ(8);
    public static final int LLJJI = C439101nJ.LIZ(86);
    public static final int LLJJIII = C439101nJ.LIZ(52);
    public static final int LLJJIJI = C439101nJ.LIZ(4);
    public static final int LLJJIJIIJIL = C439101nJ.LIZ(56);
    public static final int LLJJIJIL = C439101nJ.LIZ(34);
    public static final int LLJJJ = C439101nJ.LIZ(2);
    public EnumC956410azn LL;
    public String LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C954460awe LLILZLL;
    public int LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;

    public static /* synthetic */ void getOnlineUserState$annotations() {
    }

    private final C1126540fQC getViewPauseAnim() {
        return (C1126540fQC) this.LLJ.getValue();
    }

    private final C16F5 getViewPauseDescTv() {
        return (C16F5) this.LLJIJIL.getValue();
    }

    private final ViewGroup getViewPauseLayout() {
        return (ViewGroup) this.LLIZLLLIL.getValue();
    }

    private final C16F5 getViewPauseStatusTv() {
        return (C16F5) this.LLJI.getValue();
    }

    public final boolean LIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf = room != null ? Long.valueOf(room.getOwnerUserId()) : null;
        C954460awe c954460awe = this.LLILZLL;
        return c954460awe != null && c954460awe.LJIIIZ(lValueOf);
    }

    public final void LIZIZ() {
        ViewGroup.LayoutParams layoutParams = getViewPauseAnim().getLayoutParams();
        layoutParams.width = LLJILJILJ;
        layoutParams.height = LLJILLL;
        C786410Ut5.t6(getViewPauseAnim(), layoutParams);
        C500260Jjc.LJLJL(LLJJ, getViewPauseStatusTv());
        getViewPauseStatusTv().setAutoSizeTextTypeUniformWithConfiguration(10, 15, 1, 1);
        getViewPauseDescTv().setTextSize(2, 12.0f);
        C16F5 viewPauseStatusTv = getViewPauseStatusTv();
        if (viewPauseStatusTv != null) {
            C786410Ut5.LLJJJJ(viewPauseStatusTv, 0);
        }
        C16F5 viewPauseDescTv = getViewPauseDescTv();
        if (viewPauseDescTv != null) {
            C786410Ut5.LLJJJJ(viewPauseDescTv, 0);
        }
    }

    public final void LIZLLL() {
        ViewGroup.LayoutParams layoutParams = getViewPauseAnim().getLayoutParams();
        layoutParams.width = LLJJIJIIJIL;
        layoutParams.height = LLJJIJIL;
        C786410Ut5.t6(getViewPauseAnim(), layoutParams);
        C500260Jjc.LJLJL(LLJJJ, getViewPauseStatusTv());
        getViewPauseStatusTv().setTextSize(1, 10.0f);
        getViewPauseDescTv().setTextSize(1, 8.0f);
        C16F5 viewPauseStatusTv = getViewPauseStatusTv();
        if (viewPauseStatusTv != null) {
            C786410Ut5.LLJJJJ(viewPauseStatusTv, 0);
        }
        C16F5 viewPauseDescTv = getViewPauseDescTv();
        if (viewPauseDescTv != null) {
            C786410Ut5.LLJJJJ(viewPauseDescTv, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupResumeUI(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C956430azp.setupResumeUI(java.lang.String):void");
    }

    public C956430azp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = EnumC956410azn.NORMAL;
        this.LLILLJJLI = "";
        this.LLIZLLLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 950));
        this.LLJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 948));
        this.LLJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 951));
        this.LLJIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 949));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h9f, this, true);
    }

    public final void LIZJ(boolean z, boolean z2) {
        ViewGroup.LayoutParams layoutParams = getViewPauseAnim().getLayoutParams();
        layoutParams.width = LLJJI;
        layoutParams.height = LLJJIII;
        C786410Ut5.t6(getViewPauseAnim(), layoutParams);
        C500260Jjc.LJLJL(LLJJIJI, getViewPauseStatusTv());
        if (z2) {
            getViewPauseStatusTv().setAutoSizeTextTypeUniformWithConfiguration(10, 13, 1, 1);
        } else {
            getViewPauseStatusTv().setTextSize(1, 13.0f);
        }
        getViewPauseDescTv().setTextSize(1, 10.0f);
        C16F5 viewPauseStatusTv = getViewPauseStatusTv();
        int i = 0;
        if (viewPauseStatusTv != null) {
            C786410Ut5.LLJJJJ(viewPauseStatusTv, 0);
        }
        C16F5 viewPauseDescTv = getViewPauseDescTv();
        if (viewPauseDescTv != null) {
            if (!z) {
                i = 8;
            }
            C786410Ut5.LLJJJJ(viewPauseDescTv, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r7 == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C954240awI r6, boolean r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8) {
        /*
            r5 = this;
            X.0azn r1 = r5.LL
            X.0azn r0 = r6.LIZ
            if (r1 != r0) goto L7
            return
        L7:
            r5.LL = r0
            java.lang.String r0 = r6.LIZIZ
            r5.LLILLJJLI = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onStreamStatusUpdate, streamstatus = "
            r1.append(r0)
            X.0azn r0 = r5.LL
            r1.append(r0)
            java.lang.String r0 = ", linkMicId = "
            r1.append(r0)
            java.lang.String r0 = r5.LLILLJJLI
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MultiCoHostResumeLayout"
            X.C20441214yg.LJIIIZ(r0, r1)
            X.0azn r0 = r6.LIZ
            int[] r1 = X.C956420azo.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto Lbc
            r0 = 2
            if (r1 == r0) goto L63
            r0 = 3
            if (r1 == r0) goto Lad
            r0 = 4
            if (r1 == r0) goto L4d
            r0 = 5
            if (r1 == r0) goto L4d
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L4d:
            android.view.ViewGroup r1 = r5.getViewPauseLayout()
            r0 = 8
            X.C786410Ut5.LJLZ(r0, r1)
            X.0fQC r0 = r5.getViewPauseAnim()
            r0.clearAnimation()
            if (r7 == 0) goto Lbc
            X.C954230awH.LIZ(r6)
            goto Lbc
        L63:
            X.0azn r1 = r5.LL
            X.0azn r0 = X.EnumC956410azn.RECONNECTING
            if (r1 != r0) goto L6c
            if (r7 != 0) goto L6e
            goto Lbc
        L6c:
            if (r7 == 0) goto La0
        L6e:
            X.C954230awH.LIZ(r6)
            X.0bT2 r4 = X.C974540bT2.LIZ
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r1 = X.C915980Zwa.LJII()
            java.lang.String r0 = r6.LIZIZ
            X.0awe r0 = r1.LLLILZLLLI(r0)
            if (r0 == 0) goto Lab
            long r0 = r0.LJ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L85:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            long r0 = java.lang.System.currentTimeMillis()
            X.C974540bT2.LJJ = r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "stream_failure_anchor_id"
            X.C0K04.LJFF(r0, r3, r2)
            java.lang.String r1 = "stream_pull_failure"
            r0 = 12
            X.C974540bT2.LLIIIILZ(r4, r1, r2, r0)
        La0:
            r0 = 2131843053(0x7f1157ed, float:1.931946E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r5.setupResumeUI(r0)
            goto Lbc
        Lab:
            r0 = 0
            goto L85
        Lad:
            if (r7 == 0) goto Lb2
            X.C954230awH.LIZ(r6)
        Lb2:
            r0 = 2131843052(0x7f1157ec, float:1.9319458E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            r5.setupResumeUI(r0)
        Lbc:
            if (r8 == 0) goto Lc1
            r8.invoke()
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C956430azp.LJFF(X.0awI, boolean, kotlin.jvm.functions.Function0):void");
    }

    public final void LJ(int i, String str, Function0 function0, boolean z, boolean z2) {
        if (this.LLIZ == i) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOnlineUserStateUpdate, state=");
        sbLIZ.append(i);
        sbLIZ.append(", prevState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiCoHostResumeLayout", C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZ = i;
        this.LLILLJJLI = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        if (i != 1) {
            if (i == 2) {
                setupResumeUI(C497740JfY.LJIJI(2131843053));
            }
        } else {
            C786410Ut5.LJLZ(8, getViewPauseLayout());
            getViewPauseAnim().clearAnimation();
        }
        function0.invoke();
    }
}
