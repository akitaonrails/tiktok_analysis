package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14YY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14YY extends C09AY implements Function1<Aweme, Boolean> {
    public C14YY() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        boolean z;
        Aweme aweme2 = aweme;
        C20291314aV.LIZ.getClass();
        if (C20291314aV.LJIIIIZZ(aweme2) && !C20291314aV.LJIIIIZZ.contains(aweme2.getAid())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
