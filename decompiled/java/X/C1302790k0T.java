package X;

import android.media.AudioManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302790k0T extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AudioManager LL;
    public final /* synthetic */ C1302770k0R LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302790k0T(AudioManager audioManager, C1302770k0R c1302770k0R, int i) {
        super(0);
        this.LL = audioManager;
        this.LLILLJJLI = c1302770k0R;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.unregisterAudioDeviceCallback(this.LLILLJJLI);
        C1302440jzu c1302440jzu = C1302440jzu.LIZ;
        int i = this.LLILLL;
        c1302440jzu.getClass();
        C1302440jzu.LIZ(i);
        return Unit.LIZ;
    }
}
