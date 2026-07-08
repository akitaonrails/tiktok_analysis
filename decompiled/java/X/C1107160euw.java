package X;

import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.setting.PCSDeeplinkAllowList;
import com.bytedance.android.livesdk.dataChannel.PcsAnchorServicePlusIconVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.PcsAnchorShoppingIconVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceServicePlusIconVisibleGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.PcsAudienceShoppingIconVisibleChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePcsFixBusinessIconConflictSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0euw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107160euw implements InterfaceC1012330cRz {
    public final ConcurrentHashMap<String, InterfaceC1107230ev3> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1012330cRz
    public final String[] LJI() {
        return PCSDeeplinkAllowList.INSTANCE.getAllowList();
    }

    @Override // X.InterfaceC1012330cRz
    public final void LIZJ(int i) {
        boolean z;
        if (LivePcsFixBusinessIconConflictSetting.INSTANCE.getValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            dataChannelGlobal.HQ2(PcsAnchorShoppingIconVisibleChannel.class, Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1012330cRz
    public final boolean LJFF(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_params");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || !a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "route_smb", false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1012330cRz
    public final void LIZ(long j, InterfaceC1107240ev4 interfaceC1107240ev4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(System.identityHashCode(interfaceC1107240ev4));
        InterfaceC1107230ev3 interfaceC1107230ev3Remove = this.LIZ.remove(C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1107230ev3Remove == null) {
            return;
        }
        C1107150euv.LIZLLL(interfaceC1107230ev3Remove);
    }

    @Override // X.InterfaceC1012330cRz
    public final void LIZLLL(final long j, InterfaceC1107240ev4 interfaceC1107240ev4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(System.identityHashCode(interfaceC1107240ev4));
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZ(j, interfaceC1107240ev4);
        final WeakReference weakReference = new WeakReference(interfaceC1107240ev4);
        InterfaceC1107230ev3 interfaceC1107230ev3 = new InterfaceC1107230ev3() { // from class: X.0euy
            @Override // X.InterfaceC1107230ev3
            public final void LIZ(long j2) {
                if (j2 != j) {
                    return;
                }
                InterfaceC1107240ev4 interfaceC1107240ev42 = weakReference.get();
                if (interfaceC1107240ev42 == null) {
                    if (this.LIZ.get(strLIZIZ) == this) {
                        this.LIZ.remove(strLIZIZ);
                    }
                    C1107150euv.LIZLLL(this);
                    return;
                }
                interfaceC1107240ev42.LIZIZ();
            }
        };
        this.LIZ.put(strLIZIZ, interfaceC1107230ev3);
        C1107150euv.LIZLLL(interfaceC1107230ev3);
        C1107150euv.LIZJ.add(new WeakReference<>(interfaceC1107230ev3));
    }

    @Override // X.InterfaceC1012330cRz
    public final void LJ(Long l, boolean z) {
        if (LivePcsFixBusinessIconConflictSetting.INSTANCE.getValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveSdkPcsOuterService.setEcommerceAudienceIconVisible roomId=");
            sbLIZ.append(l);
            sbLIZ.append(" visible=");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("ServiceIconConflictsResolution", C2188811AlT.LIZIZ(sbLIZ));
            DataChannelGlobal.LLILZ.HQ2(PcsAudienceShoppingIconVisibleChannel.class, new Pair(l, Boolean.valueOf(z)));
        }
    }

    @Override // X.InterfaceC1012330cRz
    public final void LJII(LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel) {
        if (lifecycleOwner != null) {
            DataChannelGlobal.LLILZ.BQ2(this, lifecycleOwner, PcsAnchorServicePlusIconVisibleChannel.class, new C1107190euz(lifecycleOwner, slotViewModel));
        }
    }

    @Override // X.InterfaceC1012330cRz
    public final void LIZIZ(LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel, Long l) {
        if (lifecycleOwner != null) {
            DataChannelGlobal.LLILZ.BQ2(this, lifecycleOwner, PcsAudienceServicePlusIconVisibleGlobalChannel.class, new C752500TfU(lifecycleOwner, slotViewModel, l));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0ev1, X.0evE] */
    @Override // X.InterfaceC1012330cRz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1107270ev7 LJIIIIZZ(android.view.ViewGroup r11, java.lang.String r12, final X.EnumC1012360cS2 r13, final androidx.fragment.app.Fragment r14, final java.util.Map r15, final X.InterfaceC1107240ev4 r16) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1107160euw.LJIIIIZZ(android.view.ViewGroup, java.lang.String, X.0cS2, androidx.fragment.app.Fragment, java.util.Map, X.0ev4):X.0ev7");
    }
}
