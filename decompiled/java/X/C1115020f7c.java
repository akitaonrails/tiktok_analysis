package X;

import Y.AObjectS313S0200000_17;
import android.text.Editable;
import android.view.KeyEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.0f7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115020f7c implements InterfaceC1114340f6W {
    public final /* synthetic */ LiveEmojiInputDialogFragment LIZ;

    @Override // X.InterfaceC1114320f6U
    public final void LIZJ() {
        this.LIZ.ZR(1);
    }

    @Override // X.InterfaceC1114320f6U
    public final void LJ(AbstractC1115080f7i abstractC1115080f7i) {
    }

    @Override // X.InterfaceC1114330f6V
    public final void LIZIZ() {
        this.LIZ.LLJLILLLLZIIL.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.InterfaceC1114320f6U
    public final void LIZ() {
        boolean zLJI = MethodIDManager.LJI(72081);
        this.LIZ.MR();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C1115020f7c(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment) {
        this.LIZ = liveEmojiInputDialogFragment;
    }

    @Override // X.InterfaceC1114330f6V
    public final void LIZLLL(C1115500f8O c1115500f8O) throws Throwable {
        String string;
        C20586115gx c20586115gx = this.LIZ.LLJLILLLLZIIL;
        if (c20586115gx == null) {
            return;
        }
        Editable editableLLLIIII = C2204961BRm.LLLIIII(c20586115gx, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null));
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LIZ;
        if (editableLLLIIII == null) {
            string = "";
        } else {
            string = editableLLLIIII.toString();
        }
        liveEmojiInputDialogFragment.LLJJIJI = string;
        EmoteModel emoteModel = (EmoteModel) c1115500f8O;
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        C1110390f09.LIZJ(emoteModel, EnumC1110450f0F.INPUT_PANNEL, this.LIZ, new AObjectS313S0200000_17(this, emoteModel, 0));
    }
}
