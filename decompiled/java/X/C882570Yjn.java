package X;

import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Yjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882570Yjn implements C0Z0H {
    public final TarsConfig.TaskConfig LIZ;
    public final String LIZIZ;

    @Override // X.C0Z03
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C0Z03
    public final boolean LJ() {
        return true;
    }

    @Override // X.C0Z03
    public final void releaseResource() {
    }

    @Override // X.InterfaceC892680Z0g, X.C0Z03
    public final TarsConfig.TaskConfig LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC892680Z0g
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.C0Z03
    public final Object LIZ(C0Z01 c0z01) {
        return C882580Yjo.LIZIZ(this, c0z01);
    }

    public C882570Yjn(String str, TarsConfig.TaskConfig taskConfig) {
        this.LIZ = taskConfig;
        this.LIZIZ = str;
    }

    @Override // X.C0Z03
    public final Object LIZIZ(InterfaceC882520Yji interfaceC882520Yji, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C882580Yjo.LIZ(interfaceC882520Yji);
    }

    @Override // X.C0Z0H
    public final Object LJFF(InterfaceC882480Yje interfaceC882480Yje, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        for (C882890YkJ c882890YkJLIZ = interfaceC882480Yje.LIZ(); c882890YkJLIZ != null; c882890YkJLIZ = c882890YkJLIZ.LJI) {
            c882890YkJLIZ.LIZIZ(c882890YkJLIZ.LIZIZ);
        }
        return Unit.LIZ;
    }

    @Override // X.C0Z03
    public final Object LJI(C0Z08 c0z08, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C882580Yjo.LIZJ(c0z08);
    }
}
