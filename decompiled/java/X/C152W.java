package X;

import android.text.Spannable;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.message.LivePreviewGameMomentSetting;
import com.bytedance.android.livesdk.model.message.PreviewGameMomentData;
import com.bytedance.android.livesdk.model.message.PreviewGameMomentMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.152W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C152W implements InterfaceC204546152a {
    public final C152Y LIZ;
    public PreviewGameMomentData LIZJ;
    public PreviewGameMomentData LIZLLL;
    public String LJ;
    public long LJFF;
    public Boolean LJI;
    public long LJIIIIZZ;
    public final C204547152b LIZIZ = new C204547152b(this);
    public final AtomicBoolean LJII = new AtomicBoolean(false);

    public final void LJIIJ() {
        this.LIZJ = null;
        this.LIZLLL = null;
        if (!LivePreviewGameMomentSetting.INSTANCE.enableShowGameName()) {
            this.LIZ.clearData();
            this.LIZ.k(false);
            return;
        }
        if (C504670Jqj.LIZIZ(this.LJ)) {
            this.LIZ.clearData();
            this.LIZ.k(false);
            return;
        }
        String str = this.LJ;
        if (str == null) {
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(2131852517);
        if (Intrinsics.LJFF(str, this.LIZ.LLIIIZ()) && Intrinsics.LJFF(strLJIJI, this.LIZ.LLLIILIL()) && this.LIZ.LLLLZIL()) {
            return;
        }
        this.LIZ.w1(str, strLJIJI);
        this.LIZ.x(1);
    }

    @Override // X.InterfaceC204546152a
    public final String LIZ() {
        Integer numValueOf;
        PreviewGameMomentData previewGameMomentData = this.LIZLLL;
        if (previewGameMomentData != null) {
            numValueOf = Integer.valueOf(previewGameMomentData.gameMomentMessageType);
            if (numValueOf != null && numValueOf.intValue() == 1) {
                return "creator_won";
            }
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? (numValueOf.intValue() == 4 || numValueOf.intValue() == 5) ? "real_time" : "" : "";
    }

    @Override // X.InterfaceC204546152a
    public final String LIZLLL() {
        Integer numValueOf;
        PreviewGameMomentData previewGameMomentData = this.LIZLLL;
        return (previewGameMomentData == null || (numValueOf = Integer.valueOf(previewGameMomentData.gameMomentMessageType)) == null) ? "no_highlight" : numValueOf.intValue() == 1 ? "won_times" : numValueOf.intValue() == 4 ? "achieve_kills" : numValueOf.intValue() == 5 ? "players_remaining" : "no_highlight";
    }

    public C152W(C152Y c152y) {
        this.LIZ = c152y;
    }

    public static Spannable LJIIIZ(Text text) {
        if (text == null) {
            return null;
        }
        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
        String str = text.key;
        c1124870fNVLIZJ.getClass();
        String strLIZIZ = C1124870fNV.LIZIZ(str);
        if (strLIZIZ == null) {
            strLIZIZ = text.defaultPattern;
        }
        return C1133830fbx.LJIILJJIL(strLIZIZ, text, null);
    }

    @Override // X.InterfaceC204546152a
    public final void LIZIZ(long j) {
        String string;
        Spannable spannableLJIIIZ;
        String string2;
        this.LJFF = j;
        long j2 = j / 1000;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("collectSeiTimeFeature, time: ");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("PreviewGameMomentAIStrategy", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC204548152c interfaceC204548152cVI1 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).VI1();
        if (interfaceC204548152cVI1 != null && interfaceC204548152cVI1.LIZLLL()) {
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Long.valueOf(j2), "g_preview_game_moment_sei_time");
        }
        PreviewGameMomentData previewGameMomentData = this.LIZJ;
        if (previewGameMomentData == null) {
            LJIIJ();
            return;
        }
        if (j < previewGameMomentData.eventTime * 1000) {
            if (LJIIIIZZ(j)) {
                LJIIJ();
                return;
            }
            return;
        }
        if (j <= previewGameMomentData.maxTime * 1000) {
            Spannable spannableLJIIIZ2 = LJIIIZ(previewGameMomentData.gameTagName);
            Integer num = null;
            if (spannableLJIIIZ2 != null) {
                string = spannableLJIIIZ2.toString();
            } else {
                string = null;
            }
            if (string != null && Intrinsics.LJFF(string, this.LIZ.LLIIIZ()) && (spannableLJIIIZ = LJIIIZ(previewGameMomentData.content)) != null && (string2 = spannableLJIIIZ.toString()) != null && Intrinsics.LJFF(string2, this.LIZ.LLLIILIL())) {
                this.LIZLLL = previewGameMomentData;
                return;
            }
            CharSequence charSequenceLJIIIZ = LJIIIZ(previewGameMomentData.gameTagName);
            CharSequence charSequence = "";
            if (charSequenceLJIIIZ == null) {
                charSequenceLJIIIZ = "";
            }
            Spannable spannableLJIIIZ3 = LJIIIZ(previewGameMomentData.content);
            if (spannableLJIIIZ3 != null) {
                charSequence = spannableLJIIIZ3;
            }
            if (C504670Jqj.LIZIZ(charSequenceLJIIIZ.toString())) {
                if (LJIIIIZZ(this.LJFF)) {
                    LJIIJ();
                }
                try {
                    this.LIZ.LLLLLZIL("game_name_incorrect", C7740030o.LIZ().getGson().LJIILL(previewGameMomentData.gameTagName), "", "", "");
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            if (C504670Jqj.LIZIZ(charSequence.toString())) {
                if (LJIIIIZZ(this.LJFF)) {
                    LJIIJ();
                }
                try {
                    this.LIZ.LLLLLZIL("content_incorrect", C7740030o.LIZ().getGson().LJIILL(previewGameMomentData.content), "", "", "");
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return;
                }
            }
            this.LIZLLL = previewGameMomentData;
            this.LIZ.w1(charSequenceLJIIIZ, charSequence);
            C152Y c152y = this.LIZ;
            int i = previewGameMomentData.gameMomentMessageType;
            if (i != 1) {
                if (i == 4 || i == 5) {
                    num = 3;
                }
            } else {
                num = 2;
            }
            c152y.x(num);
            return;
        }
        LJIIJ();
    }

    @Override // X.InterfaceC204546152a
    public final void LIZJ(PreviewGameMomentMessage previewGameMomentMessage) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C152V(this, previewGameMomentMessage, null), 3);
    }

    @Override // X.InterfaceC204546152a
    public final void LJI(long j) {
        C20441214yg.LIZIZ("PreviewGameMomentAIStrategy", "onRealShow");
        InterfaceC204548152c interfaceC204548152cVI1 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).VI1();
        if (interfaceC204548152cVI1 == null) {
            return;
        }
        interfaceC204548152cVI1.LIZ(j);
    }

    public final boolean LJIIIIZZ(long j) {
        PreviewGameMomentData previewGameMomentData = this.LIZLLL;
        if (previewGameMomentData == null || j < previewGameMomentData.eventTime * 1000 || j > previewGameMomentData.maxTime * 1000) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC204546152a
    public final void LJ(boolean z, IMessageManager iMessageManager) {
        if (z && (!LivePreviewGameMomentSetting.INSTANCE.supportGameMomentType().isEmpty())) {
            this.LIZIZ.getClass();
            iMessageManager.needMessage();
            if (!this.LIZ.LLLLZIL()) {
                LJIIJ();
                return;
            } else {
                this.LIZ.x(null);
                return;
            }
        }
        LJIIJ();
    }

    @Override // X.InterfaceC204546152a
    public final void LJFF(boolean z, IMessageManager iMessageManager, MutableLiveData<String> mutableLiveData) {
        if (z && (!LivePreviewGameMomentSetting.INSTANCE.supportGameMomentType().isEmpty())) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LIZIZ.LIZIZ);
            C204547152b c204547152b = this.LIZIZ;
            this.LIZ.getLifecycleOwner();
            mutableLiveData.removeObserver(c204547152b.LIZJ);
        }
        InterfaceC204548152c interfaceC204548152cVI1 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).VI1();
        if (interfaceC204548152cVI1 != null && interfaceC204548152cVI1.LIZLLL()) {
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(null, "g_preview_fusion_tag_id");
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(null, "g_preview_fusion_tag_name");
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(null, "g_preview_game_moment_type");
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(null, "g_preview_game_moment_event_time");
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(null, "g_preview_game_moment_event_max");
            ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(null, "g_preview_game_moment_sei_time");
        }
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJFF = 0L;
        this.LJI = null;
        this.LJ = this.LJ;
        this.LJIIIIZZ = this.LJIIIIZZ;
    }

    @Override // X.InterfaceC204546152a
    public final void LJII(boolean z, IMessageManager iMessageManager, MutableLiveData<String> mutableLiveData, String str, long j) {
        if (z && (!LivePreviewGameMomentSetting.INSTANCE.supportGameMomentType().isEmpty())) {
            C204547152b c204547152b = this.LIZIZ;
            c204547152b.getClass();
            iMessageManager.addMessageListener(C001A.PREVIEW_GAME_MOMENT_MESSAGE.getIntType(), (OnIMMessageListener) c204547152b.LIZIZ);
            mutableLiveData.observe(this.LIZ.getLifecycleOwner(), this.LIZIZ.LIZJ);
        }
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJFF = 0L;
        this.LJI = null;
        this.LJ = str;
        this.LJIIIIZZ = j;
    }
}
