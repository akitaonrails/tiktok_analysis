package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336630DHp extends C09AY implements Function1<Context, Unit> {
    public C336630DHp() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        boolean z;
        Context context2 = context;
        if (C299020Bno.LIZ() != 0) {
            Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, context2);
            boolean z2 = false;
            if (numLIZ != null && numLIZ.intValue() == -1) {
                z = true;
            } else {
                z = false;
            }
            Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, context2);
            if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                z2 = true;
            }
            if (z) {
                context2.getTheme().applyStyle(R.style.a9u, true);
            } else {
                context2.getTheme().applyStyle(R.style.a9t, true);
            }
            if (z2) {
                context2.getTheme().applyStyle(R.style.a9v, true);
            } else {
                context2.getTheme().applyStyle(R.style.a9s, true);
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            context2.getTheme().applyStyle(R.style.a9x, true);
        } else if (enumC335920DEwLIZ == EnumC335920DEw.V2) {
            context2.getTheme().applyStyle(R.style.a9y, true);
        }
        return Unit.LIZ;
    }
}
