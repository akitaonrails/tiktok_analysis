package X;

import Y.ARunnableS34S0110000_15;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.LetsDancePreviewFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceClosePreviewFragmentEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0akh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C947050akh extends C933210aON {
    public final C01GW LIZJ;
    public InterfaceC940910aan LIZLLL;
    public InterfaceC940910aan LJ;
    public InterfaceC940910aan LJFF;
    public EnumC947440alK LJI;
    public Long LJII;
    public final MutableLiveData<C947420alI> LJIIIIZZ;
    public final MutableLiveData<EnumC947440alK> LJIIIZ;
    public final MutableLiveData<C947590alZ> LJIIJ;
    public final MutableLiveData<String> LJIIJJI;
    public final C13BV LJIIL;

    @InterfaceC947260al2(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    public void LJI() {
    }

    public void LJIILIIL(EnumC947440alK enumC947440alK, EnumC947440alK enumC947440alK2, Object obj) {
    }

    public void LJIILJJIL() {
    }

    public void LJIILLIIL(String str) {
    }

    public static boolean LJIIJ() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).zt() == 1;
    }

    public final InterfaceC946970akZ LJII() {
        return (InterfaceC946970akZ) this.LIZJ.getValue();
    }

    public final void LJFF() {
        InterfaceC946970akZ interfaceC946970akZLJII;
        if (!(!LJIIIIZZ().isEmpty()) || (interfaceC946970akZLJII = LJII()) == null) {
            return;
        }
        interfaceC946970akZLJII.LJIIJJI(LJIIIIZZ());
    }

    public void LJIIIZ() {
        InterfaceC946970akZ interfaceC946970akZLJII = LJII();
        this.LIZLLL = interfaceC946970akZLJII != null ? interfaceC946970akZLJII.LJ(new AwS664S0100000_15(this, 1)) : null;
        InterfaceC946970akZ interfaceC946970akZLJII2 = LJII();
        this.LJ = interfaceC946970akZLJII2 != null ? interfaceC946970akZLJII2.LIZ(new AwS664S0100000_15(this, 0)) : null;
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeToPlayerStatus linkMicId:");
        sbLIZ.append(strLJIIJ);
        C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (strLJIIJ.length() != 0) {
            InterfaceC946970akZ interfaceC946970akZLJII3 = LJII();
            this.LJFF = interfaceC946970akZLJII3 != null ? interfaceC946970akZLJII3.LJIIJ(strLJIIJ, new AwS664S0100000_15(this, 2)) : null;
        }
        this.LIZ.BQ2(this.LIZIZ, MultiLetsDanceClosePreviewFragmentEvent.class, new AwS594S0100000_15(this, 23));
    }

    public final boolean LJIIJJI() {
        for (EnumC947020ake enumC947020ake : LJIIIIZZ()) {
            InterfaceC946970akZ interfaceC946970akZLJII = LJII();
            if (interfaceC946970akZLJII == null || !interfaceC946970akZLJII.LJFF(enumC947020ake)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isResourceReady ");
                sbLIZ.append(enumC947020ake);
                sbLIZ.append(": false");
                C20441214yg.LJ("BaseLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        }
        return true;
    }

    public List<EnumC947020ake> LJIIIIZZ() {
        return this.LJIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(String str) {
        boolean z;
        EnumC942260acy enumC942260acy;
        String str2;
        if (C498310JgT.LIZ()) {
            C766270U4b.LIZLLL(2131854441);
            return;
        }
        if (C494680Jac.LJI(this.LIZ)) {
            if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.LIZ)) {
                C930480aJy.LJJIJIIJI(2131856620, "ttlive_superFanLIVE_preview_toast_general", "");
                return;
            } else {
                C930480aJy.LJJIJIIJI(2131844448, "pm_sublive_preview_toast_general", "");
                return;
            }
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        boolean z2 = true;
        if (num != null && 2 == num.intValue()) {
            z = true;
        } else {
            z = false;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder == null || !multiGuestDataHolder.LJIIJ) {
            z2 = false;
        }
        C947590alZ value = this.LJIIJ.getValue();
        if (value != null) {
            enumC942260acy = value.LIZJ;
        } else {
            enumC942260acy = null;
        }
        if (z && enumC942260acy != EnumC942260acy.READY) {
            if (str == null) {
                str2 = "join";
            } else {
                str2 = "join_from_fe";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("action_type", str2);
            C946950akX.LJIIIIZZ("click_join", linkedHashMap);
        }
        if (!z2 && z && enumC942260acy != EnumC942260acy.READY) {
            C945680aiU c945680aiU = C945680aiU.LIZ;
            DataChannel dataChannel = this.LIZ;
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 51);
            c945680aiU.getClass();
            C945680aiU.LIZJ(dataChannel, 15, "click_join", str, awS559S0100000_15);
            return;
        }
        LJIILLIIL(str);
    }

    public final void LJIIZILJ(boolean z) {
        C947280al4 c947280al4;
        C16FS mainButton;
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        if ((lifecycleOwner instanceof C947280al4) && (mainButton = (c947280al4 = (C947280al4) lifecycleOwner).getMainButton()) != null) {
            HandlerHook.viewPost(mainButton, new ARunnableS34S0110000_15(c947280al4, z, 2));
        }
    }

    public C947050akh(Context context, C947280al4 c947280al4, DataChannel dataChannel) throws IllegalAccessException {
        super(c947280al4, dataChannel);
        this.LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(17));
        this.LJIIIIZZ = new MutableLiveData<>();
        this.LJIIIZ = new MutableLiveData<>();
        this.LJIIJ = new MutableLiveData<>();
        this.LJIIJJI = new MutableLiveData<>();
        this.LJIIL = C13BV.INSTANCE;
        C948450amx.LIZIZ.LIZLLL(this);
    }

    public void LJIILL(C947590alZ c947590alZ, C947590alZ c947590alZ2, Object obj) {
        EnumC942260acy enumC942260acy;
        EnumC942260acy enumC942260acy2;
        Long l;
        EnumC942260acy enumC942260acy3 = null;
        if (c947590alZ2 != null) {
            enumC942260acy = c947590alZ2.LIZJ;
        } else {
            enumC942260acy = null;
        }
        if (enumC942260acy == EnumC942260acy.JOINED) {
            boolean zLJFF = C924790aAn.LIZLLL().LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" onPlayerStatusChanged PlayerStatus.JOINED, lastGamePhase = ");
            sbLIZ.append(this.LJI);
            sbLIZ.append(", currentGamePhase = ");
            sbLIZ.append(this.LJIIIZ.getValue());
            sbLIZ.append(",isOnline=");
            sbLIZ.append(zLJFF);
            C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LJI == EnumC947440alK.FINISH && this.LJIIIZ.getValue() == EnumC947440alK.PREPARING && zLJFF) {
                LJIIL(null);
                return;
            }
            Long l2 = this.LJII;
            C947420alI value = this.LJIIIIZZ.getValue();
            if (value != null) {
                l = value.LJI;
            } else {
                l = null;
            }
            if (Intrinsics.LJFF(l2, l) || this.LJIIIZ.getValue() != EnumC947440alK.PREPARING || !zLJFF) {
                return;
            }
            LJIIL(null);
            return;
        }
        if (c947590alZ2 != null) {
            enumC942260acy2 = c947590alZ2.LIZJ;
        } else {
            enumC942260acy2 = null;
        }
        if (enumC942260acy2 == EnumC942260acy.READY) {
            C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", " onPlayerStatusChanged PlayerStatus.READY");
            if ((!LJIIJ() || this.LJIIIZ.getValue() == EnumC947440alK.PLAYING) && (!C930540aK4.LIZJ() || this.LJIIIZ.getValue() != EnumC947440alK.PREPARING)) {
                return;
            }
            C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Nc;
            if (c20337914i1.LIZIZ().booleanValue()) {
                return;
            }
            c20337914i1.LJFF(Boolean.TRUE);
            C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", " Guest shows preview dialog");
            C945680aiU c945680aiU = C945680aiU.LIZ;
            DataChannel dataChannel = this.LIZ;
            c945680aiU.getClass();
            if (!MultiGuestSocialGameLetsDanceSetting.config().showPreviewPanel) {
                return;
            }
            LetsDancePreviewFragment letsDancePreviewFragment = new LetsDancePreviewFragment();
            letsDancePreviewFragment.LL = dataChannel;
            FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            if (fragmentManager == null) {
                C20441214yg.LJ("LetsDanceDialogHelper", "show: FragmentManagerData null");
                return;
            }
            C439850HMp c439850HMp = new C439850HMp();
            TuxPanel tuxPanel = c439850HMp.LIZ;
            tuxPanel.LLILLJJLI = letsDancePreviewFragment;
            tuxPanel.LLIZLLLIL = true;
            tuxPanel.LLJ = false;
            tuxPanel.LLJILJIL = false;
            tuxPanel.LLJI = true;
            tuxPanel.LLJIJIL = true;
            tuxPanel.LLILZLL = new DialogInterface.OnCancelListener() { // from class: X.0akt
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                }
            };
            tuxPanel.LLILZIL = new DialogInterface.OnDismissListener() { // from class: X.0aku
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            };
            Integer numValueOf = Integer.valueOf(R.style.z4);
            TuxPanel tuxPanel2 = c439850HMp.LIZ;
            tuxPanel2.LL = numValueOf;
            tuxPanel2.show(fragmentManager, "lets_dance_preview_panel");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" onPlayerStatusChanged ");
        if (c947590alZ2 != null) {
            enumC942260acy3 = c947590alZ2.LIZJ;
        }
        sbLIZ2.append(enumC942260acy3);
        C20441214yg.LIZIZ("BaseLetsDanceBizViewModel", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
