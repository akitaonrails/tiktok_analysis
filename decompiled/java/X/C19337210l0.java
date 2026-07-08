package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10l0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19337210l0 {
    public boolean LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public boolean LJ;
    public NewFaceStickerBean LJFF;
    public final C01GW LJI;
    public final C01GW LJII;

    public C19337210l0() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJI = C452501pT.LIZ(enumC452301pR, AFwS218S0000000_29.get$arr$(400));
        this.LJII = C452501pT.LIZ(enumC452301pR, AFwS218S0000000_29.get$arr$(401));
    }

    public static int LIZ(C19337210l0 c19337210l0, Context context, int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }
}
