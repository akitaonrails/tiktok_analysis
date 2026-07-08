package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ds2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269321Ds2 extends C09AY implements Function0<C20504615Lg> {
    public C2269321Ds2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15Lg] */
    @Override // kotlin.jvm.functions.Function0
    public final C20504615Lg invoke() {
        return new C0LH7() { // from class: X.15Lg
            @Override // X.C0LH7
            public final void LIZ() {
            }

            @Override // X.C0LH7
            public final void LIZLLL(Context context) {
                C0W79.LIZLLL(context);
            }

            @Override // X.C0LH7
            public final int LJ(Context context) {
                return C838410Wul.LIZ(context, "android.permission.RECORD_AUDIO");
            }

            @Override // X.C0LH7
            public final int LJFF(Context context) {
                return C14W2.LIZ(context);
            }

            @Override // X.C0LH7
            public final boolean LIZIZ(Activity activity, String str) {
                return C0VE9.LJIIJ(activity, str);
            }

            @Override // X.C0LH7
            public final int LIZJ(Context context, String str) {
                return C838410Wul.LIZ(context, str);
            }
        };
    }
}
