package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004570cFT extends C09AY implements Function0<Keva> {
    public C1004570cFT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("quick_share_button_keva");
    }
}
