package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.experiment.ChatListRevampConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309140C9w extends C09AY implements Function0<ChatListRevampConfig> {
    public C309140C9w() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final ChatListRevampConfig invoke() {
        ChatListRevampConfig chatListRevampConfig;
        try {
            ChatListRevampConfig chatListRevampConfig2 = (ChatListRevampConfig) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_chat_list_revamp_config", ChatListRevampConfig.class, C309150C9x.LIZ);
            C189200o6.m2constructorimpl(chatListRevampConfig2);
            chatListRevampConfig = chatListRevampConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            chatListRevampConfig = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(chatListRevampConfig) || chatListRevampConfig == 0) ? C309150C9x.LIZ : chatListRevampConfig;
    }
}
