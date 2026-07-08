package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostAuxStreamMuteEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.CohostStreamConfig;
import tikcast.linkmic.common.CohostTypeSpotExtra;
import tikcast.linkmic.common.ContentPosition;

/* JADX INFO: renamed from: X.0bA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962760bA2 extends ConstraintLayout implements C1AXB, InterfaceC956450azr {
    public final String LL;
    public final DataChannel LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public C954460awe LLILZIL;
    public EnumC918810a19 LLILZLL;
    public boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    @Override // X.InterfaceC956450azr
    public final void Z(int i, boolean z) {
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return "";
    }

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC956450azr
    public final void o(int i) {
    }

    private final LiveIconView getViewAnchorAuxStreamSwitch() {
        return (LiveIconView) this.LLJILLL.getValue();
    }

    private final View getViewAnchorInfoContainer() {
        return (View) this.LLJILJILJ.getValue();
    }

    private final View getViewAnchorInfoLayout() {
        return (View) this.LLJILJIL.getValue();
    }

    private final View getViewContainerBg() {
        return (View) this.LLJ.getValue();
    }

    private final C16F5 getViewDisplayId() {
        return (C16F5) this.LLJIJIL.getValue();
    }

    private final C16FZ getViewLoading() {
        return (C16FZ) this.LLJI.getValue();
    }

    private final LiveIconView getViewMuteStatus() {
        return (LiveIconView) this.LLJJ.getValue();
    }

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return Boolean.valueOf(this.LLIZ);
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
        C954460awe c954460awe = this.LLILZIL;
        if (c954460awe != null) {
            return Long.valueOf(c954460awe.LJ);
        }
        return null;
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
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiCoHostAuxStreamMuteEvent.class, this, new AwS594S0100000_15(this, 674));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[PHI: r1
      0x0029: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String), (r1v13 java.lang.String) binds: [B:13:0x0027, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc A[PHI: r0 r1
      0x00fc: PHI (r0v14 tikcast.linkmic.common.CohostUserInfo) = (r0v12 tikcast.linkmic.common.CohostUserInfo), (r0v21 tikcast.linkmic.common.CohostUserInfo) binds: [B:61:0x00fa, B:59:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:61:0x00fa, B:59:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupAnchorInfo(int r9) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C962760bA2.setupAnchorInfo(int):void");
    }

    @Override // X.InterfaceC956450azr
    public final void LLL(EnumC918810a19 enumC918810a19) {
        if (enumC918810a19 == this.LLILZLL) {
            return;
        }
        this.LLILZLL = enumC918810a19;
        int i = C917200ZyY.LIZ[enumC918810a19.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LJLLLLLL(8, getViewContainerBg());
                    C786410Ut5.LLLIZZ(getViewLoading(), 8);
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(0, getViewContainerBg());
            C786410Ut5.LLLIZZ(getViewLoading(), 0);
            return;
        }
        C786410Ut5.LJLLLLLL(0, getViewContainerBg());
        C786410Ut5.LLLIZZ(getViewLoading(), 0);
    }

    public final void e0(String str) {
        float f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initAnchorInfoConstraint source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiHostAuxStreamWindowView", C2188811AlT.LIZIZ(sbLIZ));
        ConstraintLayout constraintLayout = (ConstraintLayout) getViewAnchorInfoLayout().getParent();
        if (this.LLILZ == EnumC954790axB.LIVE_STUDIO_STREAM_PORTRAIT.getType()) {
            int iLJIIZILJ = (int) (((double) C497740JfY.LJIIZILJ()) * 0.5d);
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJI(R.id.b06, 1);
            c19mb.LJI(R.id.b06, 2);
            c19mb.LJIIIZ(R.id.b06, 2, constraintLayout.getId(), 2, (int) C497740JfY.LIZIZ(6.0f));
            c19mb.LJIILL(R.id.b06, iLJIIZILJ - ((int) C497740JfY.LIZIZ(38.0f)));
            c19mb.LIZIZ(constraintLayout);
            C19MB c19mb2 = new C19MB();
            c19mb2.LJII((ConstraintLayout) getViewAnchorInfoLayout());
            c19mb2.LJI(R.id.dwt, 1);
            c19mb2.LJI(R.id.dwt, 2);
            c19mb2.LJI(R.id.lpf, 1);
            c19mb2.LJI(R.id.lpf, 2);
            c19mb2.LJIIIZ(R.id.dwt, 2, R.id.lpf, 1, (int) C497740JfY.LIZIZ(4.0f));
            c19mb2.LJIIIIZZ(R.id.lpf, 2, getViewAnchorInfoLayout().getId(), 2);
            if (h0("initAnchorInfoConstraint")) {
                f = 54.0f;
            } else {
                f = 42.0f;
            }
            c19mb2.LJIILL(R.id.dwt, iLJIIZILJ - ((int) C497740JfY.LIZIZ(f)));
            c19mb2.LIZIZ((ConstraintLayout) getViewAnchorInfoLayout());
            return;
        }
        if (this.LLILZ != EnumC954790axB.LIVE_STUDIO_STREAM_LANDSCAPE.getType()) {
            return;
        }
        int iLJIIZILJ2 = (int) (((double) C497740JfY.LJIIZILJ()) * 0.7d);
        C19MB c19mb3 = new C19MB();
        c19mb3.LJII(constraintLayout);
        c19mb3.LJI(R.id.b06, 1);
        c19mb3.LJI(R.id.b06, 2);
        c19mb3.LJIIIZ(R.id.b06, 1, constraintLayout.getId(), 1, (int) C497740JfY.LIZIZ(6.0f));
        c19mb3.LJIILL(R.id.b06, iLJIIZILJ2);
        c19mb3.LIZIZ(constraintLayout);
        C19MB c19mb4 = new C19MB();
        c19mb4.LJII((ConstraintLayout) getViewAnchorInfoLayout());
        c19mb4.LJI(R.id.dwt, 1);
        c19mb4.LJI(R.id.dwt, 2);
        c19mb4.LJI(R.id.lpf, 1);
        c19mb4.LJI(R.id.lpf, 2);
        c19mb4.LJIIIIZZ(R.id.dwt, 1, getViewAnchorInfoLayout().getId(), 1);
        c19mb4.LJIIIZ(R.id.lpf, 1, R.id.dwt, 2, (int) C497740JfY.LIZIZ(4.0f));
        c19mb4.LJIILIIL(R.id.dwt, iLJIIZILJ2 - ((int) C497740JfY.LIZIZ(16.0f)));
        c19mb4.LIZIZ((ConstraintLayout) getViewAnchorInfoLayout());
    }

    public final boolean h0(String str) {
        Long lValueOf;
        boolean zLJ;
        String str2;
        String str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isMute() source = ");
        sbLIZ.append(str);
        sbLIZ.append(" userId = ");
        C954460awe c954460awe = this.LLILZIL;
        String str4 = null;
        if (c954460awe != null) {
            lValueOf = Long.valueOf(c954460awe.LJ);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" linkmicId = ");
        C954460awe c954460awe2 = this.LLILZIL;
        if (c954460awe2 != null) {
            str4 = c954460awe2.LJIIJJI;
        }
        sbLIZ.append(str4);
        sbLIZ.append(" muteStatus = ");
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        String str5 = "";
        if (interfaceC954180awCLJIIIZ != null) {
            C954460awe c954460awe3 = this.LLILZIL;
            if (c954460awe3 == null || (str3 = c954460awe3.LJIIJJI) == null) {
                str3 = "";
            }
            zLJ = interfaceC954180awCLJIIIZ.LJ(str3);
        } else {
            zLJ = false;
        }
        sbLIZ.append(zLJ);
        C20441214yg.LIZIZ("MultiHostAuxStreamWindowView", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 == null) {
            return false;
        }
        C954460awe c954460awe4 = this.LLILZIL;
        if (c954460awe4 != null && (str2 = c954460awe4.LJIIJJI) != null) {
            str5 = str2;
        }
        return interfaceC954180awCLJIIIZ2.LJ(str5);
    }

    @Override // X.InterfaceC956450azr
    public final void LLD(int i, boolean z) {
        int i2;
        this.LLIZ = z;
        LiveIconView viewMuteStatus = getViewMuteStatus();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLJJIJIL(viewMuteStatus, i2);
    }

    @Override // X.InterfaceC956450azr
    public final void i(C954460awe c954460awe, int i, int i2) {
        String str;
        CohostStreamConfig cohostStreamConfig = c954460awe.LJJI;
        Integer numValueOf = null;
        String str2 = null;
        if (cohostStreamConfig != null) {
            str = cohostStreamConfig.screenShareStreamId;
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, this.LL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCoHostUser, return, user.streamId != linkMicId, new_linkMicId=");
            CohostStreamConfig cohostStreamConfig2 = c954460awe.LJJI;
            if (cohostStreamConfig2 != null) {
                str2 = cohostStreamConfig2.screenShareStreamId;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", old_linkMicId=");
            sbLIZ.append(this.LL);
            sbLIZ.append(", user = ");
            sbLIZ.append(c954460awe);
            C20441214yg.LJIIIZ("MultiHostAuxStreamWindowView", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateCoHostUser, streamId = ");
        sbLIZ2.append(this.LL);
        sbLIZ2.append(", linkedUserSize = ");
        sbLIZ2.append(i);
        sbLIZ2.append(", user = ");
        sbLIZ2.append(c954460awe);
        sbLIZ2.append(", position type = ");
        ContentPosition contentPosition = c954460awe.LJJIFFI;
        if (contentPosition != null) {
            numValueOf = Integer.valueOf(contentPosition.contentType);
        }
        sbLIZ2.append(numValueOf);
        C20441214yg.LJIIIZ("MultiHostAuxStreamWindowView", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILZIL = c954460awe;
        setupAnchorInfo(i2);
    }

    public C962760bA2(Context context, String str, DataChannel dataChannel, int i, int i2) {
        boolean zBooleanValue;
        String str2;
        Boolean bool;
        super(context);
        this.LL = str;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZLL = EnumC918810a19.StateInit;
        this.LLJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 614));
        this.LLJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 616));
        this.LLJIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 615));
        this.LLJILJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 613));
        this.LLJILJILJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 612));
        this.LLJILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 611));
        this.LLJJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 617));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h95, this, true);
        ((C1091250eVH) findViewById(R.id.i47)).setEnableSizeChange(true);
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLIZLLLIL = zBooleanValue;
        setTag(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init MultiHostAuxStreamWindowView, auxStreamId = ");
        sbLIZ.append(str);
        sbLIZ.append(" isAnchor = ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("MultiHostAuxStreamWindowView", C2188811AlT.LIZIZ(sbLIZ));
        e0("");
        if (zBooleanValue) {
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            ArrayList arrayList = new ArrayList();
            for (C954460awe c954460awe : listLLILZLL) {
                CohostStreamConfig cohostStreamConfig = c954460awe.LJJI;
                if (cohostStreamConfig != null) {
                    str2 = cohostStreamConfig.screenShareStreamId;
                } else {
                    str2 = null;
                }
                if (C1533950q1J.LJ(str2)) {
                    arrayList.add(c954460awe);
                }
            }
            if (arrayList.size() == 1) {
                C786410Ut5.LLJJIJIL(getViewAnchorAuxStreamSwitch(), 8);
            }
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 203), getViewAnchorInfoContainer());
            return;
        }
        C786410Ut5.LLJJIJIL(getViewAnchorAuxStreamSwitch(), 8);
        getViewAnchorInfoContainer().setBackground(null);
    }

    @Override // X.InterfaceC956450azr
    public final void LLFZ(int i, Rect rect, int i2, CohostTypeSpotExtra cohostTypeSpotExtra, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateWindowInfo, windowContentType = ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("MultiHostAuxStreamWindowView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZ != i2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("previous positionType = ");
            sbLIZ2.append(this.LLILZ);
            sbLIZ2.append(" new positionType = ");
            sbLIZ2.append(i2);
            C20441214yg.LIZIZ("MultiHostAuxStreamWindowView", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILZ = i2;
            e0("updateWindowInfo");
        }
        LLD(-1, h0("updateWindowInfo"));
    }
}
