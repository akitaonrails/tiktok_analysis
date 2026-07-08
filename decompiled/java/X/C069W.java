package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.069W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C069W implements C06AS {
    public boolean LIZ;
    public C09AE LIZIZ;

    @Override // X.C06AS
    public final Unit LIZ() {
        this.LIZ = false;
        C09AE c09ae = this.LIZIZ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LIZIZ = null;
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final void clear() {
    }

    @Override // X.C06AS
    public final Unit LIZIZ() {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LIZLLL() {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit init() {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LIZJ(C885880Yp8 c885880Yp8) {
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Object LJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (!this.LIZ) {
            C09AE c09ae = this.LIZIZ;
            if (c09ae != null && c09ae.isActive()) {
                return Unit.LIZ;
            }
            this.LIZIZ = C885110Ynt.LIZ("SessionRefactor-EffectsPreloadTask-afterUserEnterInbox", new C069V(this, null));
        }
        return Unit.LIZ;
    }

    @Override // X.C06AS
    public final Unit LJFF(C1619080sEc c1619080sEc) {
        return Unit.LIZ;
    }
}
