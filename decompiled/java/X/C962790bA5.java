package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bA5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962790bA5 extends ConstraintLayout implements C1AXB {
    public final String LL;
    public final DataChannel LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C958950b3t LLJILJIL;
    public EnumC918810a19 LLJILJILJ;
    public Rect LLJILLL;
    public boolean LLJJ;

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return false;
    }

    private final ConstraintLayout getProfileContainer() {
        return (ConstraintLayout) this.LLIZLLLIL.getValue();
    }

    private final View getViewAnchorInfoLayout() {
        return (View) this.LLIZ.getValue();
    }

    private final View getViewContainerBg() {
        return (View) this.LLILZIL.getValue();
    }

    private final ConstraintLayout getViewContainerRoot() {
        return (ConstraintLayout) this.LLILZ.getValue();
    }

    private final C16F5 getViewDisplayId() {
        return (C16F5) this.LLJI.getValue();
    }

    private final AppCompatImageView getViewFollowStatus() {
        return (AppCompatImageView) this.LLJIJIL.getValue();
    }

    private final C16FZ getViewLoading() {
        return (C16FZ) this.LLILZLL.getValue();
    }

    private final AppCompatImageView getViewMuteAudienceStatus() {
        return (AppCompatImageView) this.LLJ.getValue();
    }

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return Boolean.valueOf(this.LLJJ);
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        return Integer.valueOf(this.LLILLL);
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        return Integer.valueOf(this.LLILLL);
    }

    @Override // X.C1AXB
    public Long getUid() {
        C958950b3t c958950b3t = this.LLJILJIL;
        if (c958950b3t != null) {
            return Long.valueOf(c958950b3t.LIZIZ);
        }
        return null;
    }

    public final boolean h0() {
        C958950b3t c958950b3t = this.LLJILJIL;
        return c958950b3t != null && Intrinsics.LJFF(c958950b3t.LIZ, c958950b3t.LJ);
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.C1AXB
    public int getX() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getLeft();
    }

    @Override // android.view.View, X.C1AXB
    public int getY() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow, linkMicId = ");
        sbLIZ.append(getLinkMicId());
        sbLIZ.append(", user = ");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", ---------");
        C20441214yg.LJIIIZ("MultiHostFeedWindowView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detach from window, linkMicId=");
        sbLIZ.append(getLinkMicId());
        C20441214yg.LJIIIZ("MultiHostFeedWindowView", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return this.LL;
    }

    public final Rect getLocation() {
        return this.LLJILLL;
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r1
      0x002f: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:15:0x002d, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupAnchorInfo(int r8) {
        /*
            r7 = this;
            X.0b3t r0 = r7.LLJILJIL
            r5 = 0
            if (r0 == 0) goto L62
            boolean r0 = r0.LJIIIZ
        L7:
            r7.j0(r0)
            r0 = 307(0x133, float:4.3E-43)
            kotlin.jvm.internal.AFwS203S0000000_15 r6 = kotlin.jvm.internal.AFwS203S0000000_15.get$arr$(r0)
            boolean r0 = r7.h0()
            r4 = 1
            if (r0 == 0) goto L5a
            X.16F5 r0 = r7.getViewDisplayId()
            X.C500260Jjc.LJLJLJ(r0, r5)
        L1e:
            X.0b3t r3 = r7.LLJILJIL
            java.lang.String r2 = ""
            if (r3 == 0) goto L2c
            X.0Tip r0 = r3.LJI
            if (r0 == 0) goto L2c
            java.lang.String r1 = r0.LIZ
            if (r1 != 0) goto L2f
        L2c:
            r1 = r2
            if (r3 == 0) goto L38
        L2f:
            X.0Tip r0 = r3.LJI
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L38
            r2 = r0
        L38:
            java.lang.String r1 = X.C0KVU.LIZIZ(r1, r2)
            int r0 = r1.length()
            if (r0 <= 0) goto L4c
            X.16F5 r0 = r7.getViewDisplayId()
            r0.setText(r1)
            r6.invoke()
        L4c:
            boolean r0 = r7.h0()
            if (r0 == 0) goto L64
            android.view.View r0 = r7.getViewAnchorInfoLayout()
            X.C500260Jjc.LJLJLJ(r0, r5)
            return
        L5a:
            X.16F5 r0 = r7.getViewDisplayId()
            X.C500260Jjc.LJLJLJ(r0, r4)
            goto L1e
        L62:
            r0 = 0
            goto L7
        L64:
            android.view.View r0 = r7.getViewAnchorInfoLayout()
            X.C500260Jjc.LJLJLJ(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C962790bA5.setupAnchorInfo(int):void");
    }

    public final void LLL(EnumC918810a19 enumC918810a19) {
        if (enumC918810a19 == this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = enumC918810a19;
        int i = C917170ZyV.LIZ[enumC918810a19.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LJLLLLLL(8, getViewContainerBg());
                    C786410Ut5.LLLIZZ(getViewLoading(), 8);
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(8, getViewContainerBg());
            C786410Ut5.LLLIZZ(getViewLoading(), 8);
            return;
        }
        C786410Ut5.LJLLLLLL(0, getViewContainerBg());
        C786410Ut5.LLLIZZ(getViewLoading(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[PHI: r1
      0x0024: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v6 java.lang.String) binds: [B:9:0x0022, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(float r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.getViewAnchorInfoLayout()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.19ME r1 = (X.C19ME) r1
            r1.matchConstraintPercentWidth = r5
            android.view.View r0 = r4.getViewAnchorInfoLayout()
            X.C786410Ut5.W5(r0, r1)
            X.0b3t r3 = r4.LLJILJIL
            java.lang.String r2 = ""
            if (r3 == 0) goto L21
            X.0Tip r0 = r3.LJI
            if (r0 == 0) goto L21
            java.lang.String r1 = r0.LIZ
            if (r1 != 0) goto L24
        L21:
            r1 = r2
            if (r3 == 0) goto L2d
        L24:
            X.0Tip r0 = r3.LJI
            if (r0 == 0) goto L2d
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L2d
            r2 = r0
        L2d:
            java.lang.String r1 = X.C0KVU.LIZIZ(r1, r2)
            if (r1 == 0) goto L40
            int r0 = r1.length()
            if (r0 <= 0) goto L40
            X.16F5 r0 = r4.getViewDisplayId()
            r0.setText(r1)
        L40:
            android.view.View r0 = r4.getViewAnchorInfoLayout()
            r0.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C962790bA5.e0(float):void");
    }

    public final void j0(boolean z) {
        this.LLJJ = z;
        boolean z2 = false;
        if (h0()) {
            setAudienceMuteState(false);
        } else {
            setAudienceMuteState(z);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMuteIcon, muteStatus=");
        sbLIZ.append(z);
        sbLIZ.append(", viewMuteAudienceStatus.isVisible=");
        if (getViewMuteAudienceStatus().getVisibility() == 0) {
            z2 = true;
        }
        sbLIZ.append(z2);
        C20441214yg.LJIIIZ("MultiHostFeedWindowView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setAudienceMuteState(boolean z) {
        if (h0()) {
            return;
        }
        if (z) {
            e0(0.5f);
            C500260Jjc.LJLJLJ(getViewMuteAudienceStatus(), true);
        } else {
            if (getViewMuteAudienceStatus().getVisibility() != 0) {
                return;
            }
            C500260Jjc.LJLJLJ(getViewMuteAudienceStatus(), false);
            e0(0.43f);
        }
    }

    public final void setLocation(Rect rect) {
        this.LLJILLL = rect;
    }

    public final void i0(C958950b3t c958950b3t, int i) {
        if (!TextUtils.equals(c958950b3t.LIZ, getLinkMicId())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCoHostUser, return, user.linkMicId != linkMicId, new_linkMicId=");
            sbLIZ.append(c958950b3t.LIZ);
            sbLIZ.append(", old_linkMicId=");
            sbLIZ.append(getLinkMicId());
            sbLIZ.append(", user = ");
            sbLIZ.append(c958950b3t);
            C20441214yg.LJIIIZ("MultiHostFeedWindowView", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateCoHostUser, linkMicId = ");
        sbLIZ2.append(getLinkMicId());
        sbLIZ2.append(", linkedUserSize = ");
        sbLIZ2.append(i);
        sbLIZ2.append(", user = ");
        sbLIZ2.append(c958950b3t);
        C20441214yg.LJIIIZ("MultiHostFeedWindowView", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLJILJIL = c958950b3t;
        setupAnchorInfo(0);
    }

    public C962790bA5(Context context, String str, DataChannel dataChannel, int i) {
        float f;
        super(context);
        this.LL = str;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = i;
        this.LLILZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 812));
        this.LLILZIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 811));
        this.LLILZLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 815));
        this.LLIZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 810));
        this.LLIZLLLIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 809));
        this.LLJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 816));
        this.LLJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 813));
        this.LLJIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 814));
        this.LLJILJILJ = EnumC918810a19.StateInit;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h97, this, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, linkMicId = ");
        sbLIZ.append(getLinkMicId());
        C20441214yg.LJIIIZ("MultiHostFeedWindowView", C2188811AlT.LIZIZ(sbLIZ));
        setTag(getLinkMicId());
        ((C1091250eVH) findViewById(R.id.i47)).setEnableSizeChange(true);
        C19MB c19mb = new C19MB();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dvs);
        c19mb.LJII(constraintLayout);
        c19mb.LJJIIJZLJL(R.id.i2t, 7, (int) C497740JfY.LIZIZ(12.0f));
        c19mb.LIZIZ(constraintLayout);
        if (getViewMuteAudienceStatus().getVisibility() == 0) {
            f = 0.5f;
        } else {
            f = 0.43f;
        }
        e0(f);
    }
}
