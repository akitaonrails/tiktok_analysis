package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceMultiGuestShareBgChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0aY7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939250aY7 implements LifecycleOwner {
    public final DataChannel LL;
    public final ViewGroup LLILLJJLI;
    public final ViewGroup LLILLL;
    public final InterfaceC923120a86 LLILZ;
    public final LifecycleRegistry LLILZIL;
    public C1324720kZq LLILZLL;
    public SurfaceHolderCallbackC971730bOV LLIZ;
    public C1295960jpS LLIZLLLIL;
    public View LLJ;
    public IThemeAbility LLJI;
    public ISharedBgAbility LLJIJIL;
    public final List<Runnable> LLJILJIL;
    public final C917010ZyF LLJILJILJ;
    public EnumC934000aPe LLJILLL;

    public final void LIZIZ() {
        C1324720kZq c1324720kZq = this.LLILZLL;
        if (c1324720kZq != null) {
            C439101nJ.LJI(c1324720kZq);
        }
        SurfaceHolderCallbackC971730bOV surfaceHolderCallbackC971730bOV = this.LLIZ;
        if (surfaceHolderCallbackC971730bOV != null) {
            C439101nJ.LJI(surfaceHolderCallbackC971730bOV);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public final void LIZ(String str) {
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
            sbLIZ.append("MultiGuestShareBgHelper applySharedBgForAnchorAndGuest, shareBgIv=");
            C1324720kZq c1324720kZq = this.LLILZLL;
            if (c1324720kZq != null) {
                iHashCode = c1324720kZq.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(" renderViewMode=");
            sbLIZ.append(enumC952680atmLJJJLIIL);
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            if (str != null) {
                if (enumC952680atmLJJJLIIL == EnumC952680atm.SINGLE_VIEWMODE_V2 && this.LLIZ != null) {
                    C1AZW.LIZ.getClass();
                    C1AZW.LIZ("shared_bg", "MultiGuestShareBgHelper applySharedBgForAnchorAndGuest, use SharedBgSurfaceView in SingleView RenderMode", null, null);
                    C1324720kZq c1324720kZq2 = this.LLILZLL;
                    if (c1324720kZq2 != null) {
                        C439101nJ.LJI(c1324720kZq2);
                    }
                    SurfaceHolderCallbackC971730bOV surfaceHolderCallbackC971730bOV = this.LLIZ;
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
                SurfaceHolderCallbackC971730bOV surfaceHolderCallbackC971730bOV2 = this.LLIZ;
                if (surfaceHolderCallbackC971730bOV2 != null) {
                    C439101nJ.LJI(surfaceHolderCallbackC971730bOV2);
                }
                C1324720kZq c1324720kZq3 = this.LLILZLL;
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
        LIZJ("MultiGuestShareBgHelper applySharedBgForAnchorAndGuest, clear shared bg in multi view for guest");
        LIZIZ();
    }

    public final void LIZJ(String str) {
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestShareBgHelper room_id = ");
        sbLIZ.append(C500260Jjc.LJJLIIIJ(this.LL));
        sbLIZ.append(" msg = ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("shared_bg", strLIZIZ, null, null);
    }

    public final void LIZLLL(String str, C0IEU c0ieu) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestShareBgHelper updateShareBgForAudience imageFilePath:");
        sbLIZ.append(str);
        sbLIZ.append(" params:");
        sbLIZ.append(c0ieu);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C937310aUz.LIZIZ(this.LL) != EnumC934000aPe.AUDIENCE) {
            C20441214yg.LIZIZ("shared_bg", "MultiGuestShareBgHelper updateShareBgForAudience return as guest");
            return;
        }
        DataChannel dataChannel = this.LL;
        if (str == null) {
            str = "";
        }
        dataChannel.zW(AudienceMultiGuestShareBgChannel.class, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ZyF] */
    public C939250aY7(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        this.LL = dataChannel;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = viewGroup2;
        this.LLILZ = interfaceC923120a86LIZ;
        this.LLILZIL = new LifecycleRegistry(this);
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new InterfaceC940760aaY() { // from class: X.0ZyF
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
                Iterator it2 = ((ArrayList) this.LIZ.LLJILJIL).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((ArrayList) this.LIZ.LLJILJIL).clear();
            }
        };
    }
}
