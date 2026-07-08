package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.160e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207046160e extends C09AY implements Function2<CLACaptionAssemV2, C207047160f, Unit> {
    public C207046160e() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CLACaptionAssemV2 cLACaptionAssemV2, C207047160f c207047160f) throws JSONException {
        C207047160f c207047160f2 = c207047160f;
        C207044160c c207044160cVQ2 = cLACaptionAssemV2.Bp().vQ2();
        if (!Intrinsics.LJFF(c207047160f2, c207044160cVQ2.LLILZLL)) {
            if (((Boolean) C0BJ7.LIZ.getValue()).booleanValue() && c207044160cVQ2.LLILZIL && c207047160f2 != null && c207047160f2.LIZLLL && C123100dR.LIZ(c207047160f2.LJ) && !Intrinsics.LJFF(c207044160cVQ2.LLJILJIL, c207047160f2)) {
                c207044160cVQ2.LLILZIL = false;
                c207044160cVQ2.LLJILJIL = null;
            }
            c207044160cVQ2.LLILZLL = c207047160f2;
            c207044160cVQ2.LIZJ();
        }
        return Unit.LIZ;
    }
}
