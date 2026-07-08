package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381290m35 implements InterfaceC1387770mDX {
    public static final C1381320m38 LIZIZ = new C1381320m38(AFwS259S0000000_21.get$arr$(471), AFwS259S0000000_21.get$arr$(472));
    public final InterfaceC1381130m2p LIZ;

    @Override // X.InterfaceC1387770mDX
    public final void LIZ(String str, Map<String, ? extends Object> map, View view, Activity activity) {
    }

    @Override // X.InterfaceC1387770mDX
    public final void LIZIZ(Lifecycle lifecycle) {
    }

    @Override // X.InterfaceC1387770mDX
    public final void LIZJ(Context context) {
    }

    public C1381290m35(InterfaceC1381130m2p interfaceC1381130m2p) {
        this.LIZ = interfaceC1381130m2p;
    }

    @Override // X.InterfaceC1387770mDX
    public final void LIZLLL(Activity activity) {
        if (Intrinsics.LJFF(this.LIZ.getCommonParams().get("enter_from"), "video_comment")) {
            C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ().getClass();
            if (C1616660sAi.LIZJ()) {
                activity.finish();
            }
        }
    }
}
