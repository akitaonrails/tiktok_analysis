package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655640Pne {
    public static final /* synthetic */ int LJ = 0;
    public Aweme LIZ;
    public boolean LIZIZ;
    public WeakReference<InterfaceC655620Pnc> LIZJ;
    public InterfaceC655620Pnc LIZLLL;

    public final void LIZ(Aweme aweme, C658950Psz c658950Psz, boolean z, EnumC651030PgD enumC651030PgD) {
        InterfaceC655620Pnc interfaceC655620Pnc;
        InterfaceC655620Pnc interfaceC655620Pnc2;
        WeakReference<InterfaceC655620Pnc> weakReference = null;
        if (!Intrinsics.LJFF(this.LIZ, aweme)) {
            int i = C651040PgE.LIZ[enumC651030PgD.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (((Boolean) C271340AkG.LIZ.getValue()).booleanValue()) {
                        WeakReference<InterfaceC655620Pnc> weakReference2 = this.LIZJ;
                        if (weakReference2 != null) {
                            interfaceC655620Pnc2 = weakReference2.get();
                        }
                    } else {
                        interfaceC655620Pnc2 = this.LIZLLL;
                    }
                    if (interfaceC655620Pnc2 != null) {
                        interfaceC655620Pnc2.LLJJJ();
                    }
                }
            } else {
                if (((Boolean) C271340AkG.LIZ.getValue()).booleanValue()) {
                    WeakReference<InterfaceC655620Pnc> weakReference3 = this.LIZJ;
                    if (weakReference3 != null) {
                        interfaceC655620Pnc = weakReference3.get();
                    }
                } else {
                    interfaceC655620Pnc = this.LIZLLL;
                }
                if (interfaceC655620Pnc != null) {
                    interfaceC655620Pnc.LJJJJ();
                }
            }
        }
        if (aweme != null) {
            new WeakReference(aweme);
        } else {
            aweme = null;
        }
        this.LIZ = aweme;
        if (((Boolean) C271340AkG.LIZ.getValue()).booleanValue()) {
            if (c658950Psz != null) {
                weakReference = new WeakReference<>(c658950Psz);
            }
            this.LIZJ = weakReference;
        } else {
            this.LIZLLL = c658950Psz;
        }
        this.LIZIZ = z;
    }
}
