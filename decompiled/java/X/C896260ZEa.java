package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C896260ZEa extends C2217421BqW implements Function0<Unit> {
    public C896260ZEa(BotSharePostPickerAssem botSharePostPickerAssem) {
        super(0, botSharePostPickerAssem, BotSharePostPickerAssem.class, "retryAfterError", "retryAfterError()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BotSharePostPickerAssem botSharePostPickerAssem = (BotSharePostPickerAssem) this.receiver;
        if (botSharePostPickerAssem.Lo().getState().LL instanceof C0ZER) {
            botSharePostPickerAssem.Lo().refresh();
        }
        return Unit.LIZ;
    }
}
