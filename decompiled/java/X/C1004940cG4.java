package X;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cG4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004940cG4 extends ViewOutlineProvider {
    public int LIZ;
    public final /* synthetic */ ProfileNavbarSettingProtocol LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Boolean boolValueOf;
        Context context = this.LIZIZ.getContext();
        if (context != null) {
            boolValueOf = Boolean.valueOf(C426750GoL.LIZLLL(context));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            int i = this.LIZJ;
            outline.setRoundRect(0, 0, C13LZ.LJ(i - this.LIZ, 0, i), this.LIZLLL, C418440Gaw.LIZIZ(40));
        } else {
            outline.setRoundRect(C13LZ.LJ(this.LIZ, 0, this.LIZJ), 0, this.LIZJ, this.LIZLLL, C418440Gaw.LIZIZ(40));
        }
    }

    public C1004940cG4(ProfileNavbarSettingProtocol profileNavbarSettingProtocol, int i, int i2, int i3) {
        this.LIZIZ = profileNavbarSettingProtocol;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LIZ = i3;
    }
}
