package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.AnchorVoiceChatMaskAssem;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.dataChannel.VoiceChatStartFailedEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatReconnectSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS112S0400000_15;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* JADX INFO: renamed from: X.0aEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927260aEm implements InterfaceC924270a9x {
    public final boolean LL;
    public Fragment LLILLJJLI;
    public VoiceChatMaskAbility LLILLL;
    public int LLILZ;

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LIZJ() {
        return null;
    }

    @Override // X.InterfaceC924270a9x
    public final void onPause() {
    }

    @Override // X.InterfaceC924270a9x
    public final void onResume() {
    }

    public final VoiceChatMaskAbility LIZIZ() {
        Fragment fragment;
        VoiceChatMaskAbility voiceChatMaskAbility = this.LLILLL;
        if (voiceChatMaskAbility == null) {
            Fragment fragment2 = this.LLILLJJLI;
            if (fragment2 == null || !fragment2.isAdded() || (fragment = this.LLILLJJLI) == null || (voiceChatMaskAbility = (VoiceChatMaskAbility) C1555540qa8.LIZIZ(C1558360qeg.LJFF(fragment, "linkMicScope"), VoiceChatMaskAbility.class, null)) == null) {
                return null;
            }
            this.LLILLL = voiceChatMaskAbility;
        }
        return voiceChatMaskAbility;
    }

    @Override // X.InterfaceC924270a9x
    public final void If() {
        VoiceChatMaskAbility voiceChatMaskAbilityLIZIZ = LIZIZ();
        if (voiceChatMaskAbilityLIZIZ != null) {
            voiceChatMaskAbilityLIZIZ.If();
        }
    }

    @Override // X.InterfaceC924270a9x
    public final void rc() {
        VoiceChatMaskAbility voiceChatMaskAbilityLIZIZ = LIZIZ();
        if (voiceChatMaskAbilityLIZIZ != null) {
            voiceChatMaskAbilityLIZIZ.rc();
        }
    }

    @Override // X.InterfaceC924420aAC
    public final Class<Object> LJIIIIZZ() {
        return InterfaceC924270a9x.class;
    }

    public C927260aEm(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC924270a9x
    public final void LJJIJLIJ(ViewGroup viewGroup) {
        Fragment fragment;
        Class cls;
        If();
        Fragment fragment2 = this.LLILLJJLI;
        if (fragment2 != null && fragment2.isAdded() && (fragment = this.LLILLJJLI) != null) {
            if (this.LL) {
                cls = AnchorVoiceChatMaskAssem.class;
            } else {
                cls = VoiceChatMaskAssem.class;
            }
            C723850SaN.LJIIIIZZ(fragment, C13LE.LIZ(cls));
        }
    }

    @Override // X.InterfaceC921470a5R
    public final void LIZ(final Room room, final Context context, final DataChannel dataChannel, final Function0<Unit> function0) {
        final String value = LivesdkLinkmicVoiceChatLayoutConfigV2Setting.INSTANCE.getValue();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
            bizChangeLayoutParams.displayId = 2;
            interfaceC954180awCLLJLL.LLFF(new C920450a3n(9, value, bizChangeLayoutParams), new InterfaceC920680a4A<ChangeMaxPositionResult>() { // from class: X.0aEn
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(ChangeMaxPositionResult changeMaxPositionResult) {
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(CurrentRealDisplayChannel.class, new Pair(value, 2));
                    }
                    HashMap map = new HashMap();
                    C01Z4.LIZ(null, map);
                    map.put("costTime", String.valueOf(C963140bAe.LIZIZ() - C927280aEo.LIZ));
                    C0KX4.LIZ("livesdk_audio_chat_init_succeed", map, null, true);
                    function0.invoke();
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    String str;
                    C501540Jlg.LIZJ(context, th);
                    C927260aEm c927260aEm = this;
                    Room room2 = room;
                    Context context2 = context;
                    DataChannel dataChannel2 = dataChannel;
                    String strValueOf = String.valueOf(linkCoreError.errorCode);
                    String str2 = linkCoreError.errorMsg;
                    if (th instanceof C477520Io2) {
                        str = ((C477520Io2) th).getxTtLogId();
                    } else {
                        str = "";
                    }
                    Function0<Unit> function02 = function0;
                    c927260aEm.getClass();
                    if (VoiceChatReconnectSettings.INSTANCE.getValue()) {
                        int i = c927260aEm.LLILZ + 1;
                        c927260aEm.LLILZ = i;
                        if (i >= 3) {
                            C766270U4b.LIZLLL(2131843596);
                            if (dataChannel2 != null) {
                                dataChannel2.FQ2(VoiceChatStartFailedEvent.class);
                            }
                            C927280aEo.LIZ("change_layout_error", strValueOf, str2, str);
                            return;
                        }
                        C766270U4b.LIZLLL(2131843595);
                        c927260aEm.LIZ(room2, context2, dataChannel2, function02);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC924270a9x
    public final void LJJIL(DataChannel dataChannel, ViewGroup viewGroup, InterfaceC921620a5g interfaceC921620a5g, LifecycleOwner lifecycleOwner) {
        Fragment fragmentLIZ = C946803n0.LIZ(viewGroup);
        if (fragmentLIZ != null) {
            this.LLILLJJLI = fragmentLIZ;
            C723850SaN.LIZ(fragmentLIZ, false, null, new AwS112S0400000_15(fragmentLIZ, dataChannel, this, viewGroup, 5), 3);
        }
    }
}
