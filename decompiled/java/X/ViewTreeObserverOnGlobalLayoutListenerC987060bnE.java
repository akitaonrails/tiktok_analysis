package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.privilege.voicewave.MultiGuestVoiceWaveSettingSheet;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.NoticeboardBizLayoutChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0bnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC987060bnE implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC987060bnE viewTreeObserverOnGlobalLayoutListenerC987060bnE) {
        Integer numValueOf;
        C20632315oP c20632315oP;
        ViewTreeObserver viewTreeObserver;
        C1324720kZq c1324720kZq = ((MultiGuestVoiceWaveSettingSheet) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).LLLF;
        if (c1324720kZq != null && (c1324720kZq.getWidth() <= 0 || c1324720kZq.getHeight() <= 0)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("userAvatar=");
        C1324720kZq c1324720kZq2 = ((MultiGuestVoiceWaveSettingSheet) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).LLLF;
        Integer numValueOf2 = null;
        if (c1324720kZq2 != null) {
            numValueOf = Integer.valueOf(c1324720kZq2.getWidth());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", userAvatar=");
        C1324720kZq c1324720kZq3 = ((MultiGuestVoiceWaveSettingSheet) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).LLLF;
        if (c1324720kZq3 != null) {
            numValueOf2 = Integer.valueOf(c1324720kZq3.getHeight());
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LIZIZ("MultiGuestVoiceWaveSettingSheet", C2188811AlT.LIZIZ(sbLIZ));
        C1324720kZq c1324720kZq4 = ((MultiGuestVoiceWaveSettingSheet) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).LLLF;
        if (c1324720kZq4 != null && (viewTreeObserver = c1324720kZq4.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC987060bnE);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC987060bnE, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C1324720kZq c1324720kZq5 = ((MultiGuestVoiceWaveSettingSheet) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).LLLF;
        if (c1324720kZq5 != null && (c20632315oP = (C20632315oP) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l1) != null) {
            ViewGroup.LayoutParams layoutParams = c20632315oP.getLayoutParams();
            if (layoutParams != null) {
                float height = c1324720kZq5.getHeight();
                String str = MultiGuestVoiceWaveSettingSheet._pnsPageId;
                layoutParams.height = (int) (height * MultiGuestVoiceWaveSettingSheet.LLLILZJ);
            }
            c20632315oP.requestLayout();
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC987060bnE viewTreeObserverOnGlobalLayoutListenerC987060bnE) {
        int height;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0;
        if (view != null) {
            height = view.getHeight();
        } else {
            height = 0;
        }
        C948750anR c948750anR = (C948750anR) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l1;
        int i = c948750anR.LIZIZ;
        if (i != height && i != 0) {
            InterfaceC948760anS interfaceC948760anS = c948750anR.LIZJ;
            if (interfaceC948760anS != null) {
                if (i - height > 200) {
                    interfaceC948760anS.LIZJ();
                } else if (i > height) {
                    interfaceC948760anS.LIZIZ();
                } else if (height - i > 200) {
                    interfaceC948760anS.LIZ();
                } else if (i < height) {
                    interfaceC948760anS.LIZIZ();
                }
            }
            ((C948750anR) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l1).LIZIZ = height;
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC987060bnE viewTreeObserverOnGlobalLayoutListenerC987060bnE) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).getHeight() < C439101nJ.LIZ(60)) {
            C939800aZ0 c939800aZ0 = (C939800aZ0) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l1;
            ViewGroup viewGroup = (ViewGroup) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0;
            c939800aZ0.getClass();
            if (viewGroup.getHeight() > 0 && c939800aZ0.LLIZLLLIL == EnumC940090aZT.SEARCH) {
                float height = viewGroup.getHeight() / C439101nJ.LIZ(84);
                int iLIZ = (int) (C439101nJ.LIZ(24) * height);
                int iLIZ2 = (int) (C439101nJ.LIZ(48) * height);
                ImageView imageView = c939800aZ0.LLJIJIL;
                if (imageView != null) {
                    C500260Jjc.LJLL(iLIZ, iLIZ, imageView);
                }
                C16F5 c16f5 = c939800aZ0.LLJILJIL;
                if (c16f5 != null) {
                    c16f5.setTextSize(13 * height);
                }
                View view = c939800aZ0.LLJI;
                if (view != null) {
                    C500260Jjc.LJLL(iLIZ2, iLIZ2, view);
                }
            }
        } else if (((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).getWidth() > 0 && ((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).getWidth() <= C439101nJ.LIZ(45)) {
            ImageView imageView2 = ((C939800aZ0) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l1).LLJIJIL;
            if (imageView2 != null && (layoutParams2 = imageView2.getLayoutParams()) != null) {
                layoutParams2.width = C439101nJ.LIZ(16);
            }
            ImageView imageView3 = ((C939800aZ0) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l1).LLJIJIL;
            if (imageView3 != null && (layoutParams = imageView3.getLayoutParams()) != null) {
                layoutParams.height = C439101nJ.LIZ(16);
            }
            C16F5 c16f52 = ((C939800aZ0) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l1).LLJILJIL;
            if (c16f52 != null) {
                c16f52.setTextSize(8.0f);
            }
        }
        C786410Ut5.C3(((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC987060bnE);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC987060bnE viewTreeObserverOnGlobalLayoutListenerC987060bnE) {
        Boolean boolValueOf;
        String str;
        C932910aNt viewModel = ((C934280aQ6) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0).getViewModel();
        C934280aQ6 c934280aQ6 = (C934280aQ6) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l0;
        C957020b0m c957020b0m = (C957020b0m) viewTreeObserverOnGlobalLayoutListenerC987060bnE.l1;
        viewModel.getClass();
        if (C930540aK4.LIZJ()) {
            InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
            String str2 = null;
            if (interfaceC945610aiNLIZ != null) {
                boolValueOf = Boolean.valueOf(interfaceC945610aiNLIZ.LJII());
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                C945620aiO c945620aiO = (C945620aiO) viewModel.LIZ.gg0(NoticeboardBizLayoutChannel.class);
                if (c945620aiO != null && c945620aiO.LIZ()) {
                    float fLJI = C953620avI.LJI(c945620aiO.LIZIZ / c945620aiO.LIZJ);
                    C953610avH.LJJI.getClass();
                    if (fLJI == C953610avH.LJJIIZI) {
                        PosIdentity posIdentity = c957020b0m.getPosIdentity();
                        if (posIdentity != null && posIdentity.type == 2) {
                            str2 = posIdentity.value;
                        }
                        float width = c934280aQ6.getWidth();
                        float height = c934280aQ6.getHeight();
                        if (Intrinsics.LJFF(str2, c945620aiO.LIZ) && width == c945620aiO.LIZIZ && height == c945620aiO.LIZJ) {
                            return;
                        }
                    }
                }
                DataChannel dataChannel = viewModel.LIZ;
                PosIdentity posIdentity2 = c957020b0m.getPosIdentity();
                if (posIdentity2 == null || posIdentity2.type != 2 || (str = posIdentity2.value) == null) {
                    str = "";
                }
                dataChannel.zW(NoticeboardBizLayoutChannel.class, new C945620aiO(str, c934280aQ6.getWidth(), c934280aQ6.getHeight()));
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC987060bnE(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
