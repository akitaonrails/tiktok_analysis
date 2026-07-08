package X;

import com.bytedance.android.livesdk.model.message.ChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753040TgM extends C750630TcT {
    public final C753030TgL LLILZIL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 789);
    }

    public C753040TgM(C753030TgL c753030TgL) {
        super(c753030TgL);
        this.LLILZIL = c753030TgL;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        AbstractC1136060ffY abstractC1136060ffY = this.LLILZ.LJFF;
        if ((abstractC1136060ffY instanceof ChatMessage) && ((ChatMessage) abstractC1136060ffY).LIZ()) {
            return true;
        }
        return false;
    }
}
