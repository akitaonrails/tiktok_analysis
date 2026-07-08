package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZB extends C09AY implements Function1<Aweme, Boolean> {
    public C14ZB() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        boolean z;
        Aweme aweme2 = aweme;
        C20291514aX.LIZ.getClass();
        if (C20291514aX.LIZIZ(aweme2) && C20291514aX.LIZJ(aweme2, C14Z4.LIZIZ(aweme2))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
