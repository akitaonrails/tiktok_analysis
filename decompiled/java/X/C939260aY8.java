package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceMultiGuestShareBgChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0aY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939260aY8 extends AbstractC939360aYI {
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final DataChannel LLILZLL;
    public final InterfaceC923120a86 LLIZ;
    public C1324720kZq LLIZLLLIL;
    public SurfaceHolderCallbackC971730bOV LLJ;
    public C1295960jpS LLJI;
    public IThemeAbility LLJIJIL;
    public ISharedBgAbility LLJILJIL;
    public final List<Runnable> LLJILJILJ;
    public final C917000ZyE LLJILLL;
    public EnumC934000aPe LLJJ;

    public final void LJJI() {
        C1324720kZq c1324720kZq = this.LLIZLLLIL;
        if (c1324720kZq != null) {
            C439101nJ.LJI(c1324720kZq);
        }
        SurfaceHolderCallbackC971730bOV surfaceHolderCallbackC971730bOV = this.LLJ;
        if (surfaceHolderCallbackC971730bOV != null) {
            C439101nJ.LJI(surfaceHolderCallbackC971730bOV);
        }
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void onDetach() {
        super.onDetach();
        C786410Ut5.LJJJLZIJ(this.LLIZLLLIL, this.LLILZIL);
        this.LLIZ.LJJ(this.LLJILLL);
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
        View view;
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModelGo2;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        Context context;
        super.LJIJ(interfaceC940060aZQ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attach layout:");
        sbLIZ.append(interfaceC940060aZQ);
        C20441214yg.LIZIZ("MultiGuestShareBgPlugin", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLILZLL.gg0(C956790b0P.class);
        if (interfaceC665370Q7z != null) {
            this.LLJIJIL = (IThemeAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IThemeAbility.class, null);
            this.LLJILJIL = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
        }
        if (!MultiGuestSocialGameLetsDanceSetting.config().participantLetsDanceEnabled && !MultiGuestSocialGameLetsDanceSetting.config().sharedBgSurfaceViewEnabled) {
            ViewGroup viewGroup = this.LLILZIL;
            if (viewGroup != null) {
                context = viewGroup.getContext();
            } else {
                context = null;
            }
            C1324720kZq c1324720kZq = new C1324720kZq(context);
            this.LLIZLLLIL = c1324720kZq;
            view = c1324720kZq;
        } else {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL.getContext()), R.layout.hu7, null, false);
            this.LLIZLLLIL = (C1324720kZq) viewTd.findViewById(R.id.luy);
            if (MultiGuestSocialGameLetsDanceSetting.config().sharedBgSurfaceViewEnabled) {
                this.LLJ = (SurfaceHolderCallbackC971730bOV) viewTd.findViewById(R.id.v3d);
            }
            this.LLJI = (C1295960jpS) viewTd.findViewById(R.id.lmg);
            view = viewTd;
        }
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            C1324720kZq c1324720kZq2 = this.LLIZLLLIL;
            if (c1324720kZq2 != null) {
                c1324720kZq2.setId(R.id.op0);
            }
            if (interfaceC940060aZQ != null) {
                interfaceC940060aZQ.LJJI(true);
                FrameLayout frameLayoutLJJIFFI = interfaceC940060aZQ.LJJIFFI();
                if (frameLayoutLJJIFFI != null) {
                    frameLayoutLJJIFFI.addView(view, 0, new FrameLayout.LayoutParams(-1, -1, 3));
                }
            }
        } else {
            if (interfaceC940060aZQ != null) {
                interfaceC940060aZQ.LJJI(false);
            }
            this.LLILZIL.addView(view, 0, new FrameLayout.LayoutParams(-1, -1, 3));
        }
        IThemeAbility iThemeAbility = this.LLJIJIL;
        if (iThemeAbility != null && (multiGuestThemeViewModelMG0 = iThemeAbility.MG0()) != null) {
            multiGuestThemeViewModelMG0.vQ2(new C2217371BqR() { // from class: X.0aXM
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C938810aXP) obj).LLILLL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C938810aXP) obj).LLILLL = (String) obj2;
                }
            }, null, this, new AwS594S0100000_15(this, 944));
        }
        this.LLILZLL.EQ2(this, MultiGuestLayoutRenderV2.RoleChannel.class, new AwS594S0100000_15(this, 945));
        if (C937310aUz.LIZIZ(this.LLILZLL) == EnumC934000aPe.AUDIENCE) {
            this.LLILZLL.EQ2(this, AudienceVideoViewParams.class, new AwS594S0100000_15(this, 946));
            ISharedBgAbility iSharedBgAbility = this.LLJILJIL;
            if (iSharedBgAbility != null && (multiGuestSharedBgGuestViewModelGo2 = iSharedBgAbility.Go2()) != null) {
                multiGuestSharedBgGuestViewModelGo2.EQ2(new C2217371BqR() { // from class: X.0aYC
                    @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C935650aSJ) obj).LLILZ;
                    }

                    @Override // X.C2217371BqR, X.AbstractC2217331BqN
                    public final void set(Object obj, Object obj2) {
                        ((C935650aSJ) obj).LLILZ = (String) obj2;
                    }
                }, null, this, new AwS594S0100000_15(this, 947));
            }
        }
        this.LLIZ.LJIIZILJ(this.LLJILLL);
    }

    public final void LJJ(String str) {
        EnumC952680atm enumC952680atmLJJJLIIL;
        int iHashCode;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (!TextUtils.isEmpty(str)) {
            InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
            if (interfaceC954180awCUU1 == null || (enumC952680atmLJJJLIIL = interfaceC954180awCUU1.LJJJLIIL()) == null) {
                enumC952680atmLJJJLIIL = EnumC952680atm.DEFAULT;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiGuestShareBgPlugin");
            sbLIZ.append(" applySharedBgForAnchorAndGuest, shareBgIv=");
            C1324720kZq c1324720kZq = this.LLIZLLLIL;
            if (c1324720kZq != null) {
                iHashCode = c1324720kZq.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(" renderViewMode=");
            sbLIZ.append(enumC952680atmLJJJLIIL);
            LJJIFFI(C2188811AlT.LIZIZ(sbLIZ));
            if (str != null) {
                if (enumC952680atmLJJJLIIL == EnumC952680atm.SINGLE_VIEWMODE_V2 && this.LLJ != null) {
                    C1AZW c1azw = C1AZW.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MultiGuestShareBgPlugin");
                    sbLIZ2.append(" applySharedBgForAnchorAndGuest, use SharedBgSurfaceView in SingleView RenderMode");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c1azw.getClass();
                    C1AZW.LIZ("MultiGuestShareBgPlugin", strLIZIZ, null, null);
                    C1324720kZq c1324720kZq2 = this.LLIZLLLIL;
                    if (c1324720kZq2 != null) {
                        C439101nJ.LJI(c1324720kZq2);
                    }
                    SurfaceHolderCallbackC971730bOV surfaceHolderCallbackC971730bOV = this.LLJ;
                    if (surfaceHolderCallbackC971730bOV != null) {
                        C12ES.LJIILL(0, surfaceHolderCallbackC971730bOV);
                        C915980Zwa.LJIIIIZZ();
                        Rect rectLJFF = C921180a4y.LJFF();
                        if (rectLJFF != null) {
                            ViewGroup.LayoutParams layoutParams3 = surfaceHolderCallbackC971730bOV.getLayoutParams();
                            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                                layoutParams2.leftMargin = rectLJFF.left;
                                layoutParams2.topMargin = rectLJFF.top;
                                layoutParams2.width = rectLJFF.width();
                                layoutParams2.height = rectLJFF.height();
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(surfaceHolderCallbackC971730bOV);
                                surfaceHolderCallbackC971730bOV.setLayoutParams(layoutParams2);
                                surfaceHolderCallbackC971730bOV.setImagePath(str);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                SurfaceHolderCallbackC971730bOV surfaceHolderCallbackC971730bOV2 = this.LLJ;
                if (surfaceHolderCallbackC971730bOV2 != null) {
                    C439101nJ.LJI(surfaceHolderCallbackC971730bOV2);
                }
                C1324720kZq c1324720kZq3 = this.LLIZLLLIL;
                if (c1324720kZq3 == null) {
                    return;
                }
                C12ES.LJIILL(0, c1324720kZq3);
                C915980Zwa.LJIIIIZZ();
                Rect rectLJFF2 = C921180a4y.LJFF();
                if (rectLJFF2 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams4 = c1324720kZq3.getLayoutParams();
                if (!(layoutParams4 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams4) == null) {
                    return;
                }
                layoutParams.leftMargin = rectLJFF2.left;
                layoutParams.topMargin = rectLJFF2.top;
                layoutParams.width = rectLJFF2.width();
                layoutParams.height = rectLJFF2.height();
                int iWidth = rectLJFF2.width();
                int iHeight = rectLJFF2.height();
                C786410Ut5.u6(c1324720kZq3, layoutParams);
                C1324610kZf c1324610kZfLJIIJ = C1819620xS4.LIZ().LJIIJ(new C0VSJ(str));
                c1324610kZfLJIIJ.LJ = iWidth;
                c1324610kZfLJIIJ.LJFF = iHeight;
                c1324610kZfLJIIJ.LJJI(c1324720kZq3);
                return;
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("MultiGuestShareBgPlugin");
        sbLIZ3.append(" applySharedBgForAnchorAndGuest, clear shared bg in multi view for guest");
        LJJIFFI(C2188811AlT.LIZIZ(sbLIZ3));
        LJJI();
    }

    public final void LJJIFFI(String str) {
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestShareBgPlugin");
        sbLIZ.append(" room_id = ");
        sbLIZ.append(C500260Jjc.LJJLIIIJ(this.LLILZLL));
        sbLIZ.append(" msg = ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("MultiGuestShareBgPlugin", strLIZIZ, null, null);
    }

    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
    public final void LIZ(String str, boolean z) {
        String str2;
        MultiGuestThemeViewModel multiGuestThemeViewModelMG0;
        C938810aXP state;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestShareBgPlugin");
        sbLIZ.append(" onSingleViewModeChange, isSingleView=");
        sbLIZ.append(z);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
        IThemeAbility iThemeAbility = this.LLJIJIL;
        if (iThemeAbility != null && (multiGuestThemeViewModelMG0 = iThemeAbility.MG0()) != null && (state = multiGuestThemeViewModelMG0.getState()) != null) {
            str2 = state.LLILLL;
        } else {
            str2 = null;
        }
        LJJ(str2);
    }

    public final void LJJII(String str, C0IEU c0ieu) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestShareBgPlugin");
        sbLIZ.append(" updateShareBgForAudience imageFilePath:");
        sbLIZ.append(str);
        sbLIZ.append(" params:");
        sbLIZ.append(c0ieu);
        LJJIFFI(C2188811AlT.LIZIZ(sbLIZ));
        if (C937310aUz.LIZIZ(this.LLILZLL) != EnumC934000aPe.AUDIENCE) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MultiGuestShareBgPlugin");
            sbLIZ2.append(" updateShareBgForAudience return as guest");
            C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        DataChannel dataChannel = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        dataChannel.zW(AudienceMultiGuestShareBgChannel.class, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ZyE] */
    public C939260aY8(ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC923120a86 interfaceC923120a86, DataChannel dataChannel) {
        super(interfaceC923120a86);
        this.LLILZ = viewGroup;
        this.LLILZIL = viewGroup2;
        this.LLILZLL = dataChannel;
        this.LLIZ = interfaceC923120a86;
        this.LLJILJILJ = new ArrayList();
        this.LLJILLL = new InterfaceC940760aaY() { // from class: X.0ZyE
            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                Iterator it2 = ((ArrayList) this.LIZ.LLJILJILJ).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((ArrayList) this.LIZ.LLJILJILJ).clear();
            }
        };
    }
}
