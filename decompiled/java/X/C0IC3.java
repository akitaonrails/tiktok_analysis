package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptViewModel;

/* JADX INFO: renamed from: X.0IC3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IC3 implements ViewModelProvider.Factory {
    public final ChatroomEventAbility LIZ;
    public final MessagePowerListAbility LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        return new IMVoiceTranscriptViewModel(this.LIZ, this.LIZIZ);
    }

    public C0IC3(ChatroomEventAbility chatroomEventAbility, MessagePowerListAbility messagePowerListAbility) {
        this.LIZ = chatroomEventAbility;
        this.LIZIZ = messagePowerListAbility;
    }
}
