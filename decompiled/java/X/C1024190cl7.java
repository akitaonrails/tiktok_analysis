package X;

import android.media.AudioManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024190cl7 extends C09AY implements Function0<Integer> {
    public C1024190cl7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        AudioManager audioManager = C1024180cl6.LIZJ;
        return Integer.valueOf(audioManager != null ? C786410Ut5.Z3(audioManager, 3) : -1);
    }
}
