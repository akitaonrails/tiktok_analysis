package X;

import android.app.Activity;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS106S0400000_8;

/* JADX INFO: renamed from: X.0L6N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L6N {
    public final void LIZ(Activity activity, TokenCert tokenCert, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final boolean z, final Function2<? super Boolean, ? super C0L9U, Unit> function2) {
        if (activity != null && (activity instanceof C19EG)) {
            C0LGY c0lgy = C0LGY.LIZ;
            C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
            final C19EG c19eg = (C19EG) activity;
            InterfaceC540100LGe interfaceC540100LGe = new InterfaceC540100LGe() { // from class: X.0L6O
                @Override // X.InterfaceC540100LGe
                public final void LIZ(int[] iArr, String[] strArr) {
                    C0L6N c0l6n = this.LIZ;
                    C19EG c19eg2 = c19eg;
                    Function0<Unit> function04 = function02;
                    Function0<Unit> function05 = function03;
                    boolean z2 = z;
                    Function2<Boolean, C0L9U, Unit> function22 = function2;
                    c0l6n.getClass();
                    C1397580mTM c1397580mTM = new C1397580mTM(c19eg2);
                    c1397580mTM.LJI(c19eg2.getString(2131849191));
                    c1397580mTM.LIZIZ(c19eg2.getString(2131849190));
                    c1397580mTM.LJII = z2;
                    C985403tE.LIZ(c1397580mTM, new AwS106S0400000_8(c19eg2, (C19EG) function04, function05, (Function0<Unit>) function22, (Function2<? super Boolean, ? super C0L9U, Unit>) 5));
                    new AutoDismissPermissionDialog(c19eg2, c1397580mTM).LIZ();
                    Function0<Unit> function06 = function0;
                    if (function06 != null) {
                        function06.invoke();
                    }
                }
            };
            C0LGZ c0lgz = new C0LGZ() { // from class: X.0L6M
                @Override // X.C0LGZ
                public final void LIZ(C0L9U c0l9u, String[] strArr, int[] iArr) {
                    Function2<Boolean, C0L9U, Unit> function22 = function2;
                    if (function22 != null) {
                        function22.invoke(Boolean.TRUE, c0l9u);
                    }
                }
            };
            c0lgy.getClass();
            C0LGY.LJIIJ(activity, tokenCert, c0l91, interfaceC540100LGe, c0lgz);
            return;
        }
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, null);
        }
    }
}
