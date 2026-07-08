package X;

import android.text.SpannableString;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import com.bytedance.android.livesdk.model.message.QuestionSwitchMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0eya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109420eya implements InterfaceC1109090ey3 {
    @Override // X.InterfaceC1109090ey3
    public final void LIZ() {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZJ(C1109030exx c1109030exx) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJ(AbstractC1111600f26 abstractC1111600f26) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJI(InterfaceC1109350eyT interfaceC1109350eyT) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJII(AbstractC1109730ez5 abstractC1109730ez5) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZIZ(C1109430eyb c1109430eyb) {
        ((HashMap) c1109430eyb.LIZ).put(QuestionMessage.class, new InterfaceC1111800f2Q<QuestionMessage>() { // from class: X.00ji
            @Override // X.InterfaceC1111800f2Q
            public final boolean LIZ(IMessage iMessage, C1109770ez9 c1109770ez9) {
                return !C162100jj.LIZIZ(c1109770ez9.LJIIIZ);
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZLLL(InterfaceC1109320eyQ interfaceC1109320eyQ) {
        interfaceC1109320eyQ.LIZIZ(QuestionMessage.class, new InterfaceC1109180eyC<QuestionMessage>() { // from class: X.00iN
            @Override // X.InterfaceC1109180eyC
            public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                return new AbstractC1110800f0o<QuestionMessage>((QuestionMessage) abstractC1136060ffY) { // from class: X.00iA
                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return new SpannableString(((QuestionMessage) this.LJIL).question.content);
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return ((QuestionMessage) this.LJIL).question.user;
                    }
                };
            }
        });
        interfaceC1109320eyQ.LIZIZ(QuestionSwitchMessage.class, new InterfaceC1109180eyC<QuestionSwitchMessage>() { // from class: X.00iI
            @Override // X.InterfaceC1109180eyC
            public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                return new AbstractC1110800f0o<QuestionSwitchMessage>((QuestionSwitchMessage) abstractC1136060ffY) { // from class: X.00hz
                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return C497740JfY.LJIJI(((QuestionSwitchMessage) this.LJIL).LIZ().booleanValue() ? 2131844611 : 2131844449);
                    }
                };
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJFF(InterfaceC1109340eyS interfaceC1109340eyS) {
        interfaceC1109340eyS.LIZLLL(C001A.QUESTION.getIntType());
        interfaceC1109340eyS.LIZLLL(C001A.QUESTION_SWITCH_MESSAGE.getIntType());
    }
}
