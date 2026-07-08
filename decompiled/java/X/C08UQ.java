package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.08UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08UQ extends C08UT<C08UM> {
    @Override // X.C08UT
    public final Object LIZ() {
        C08UM c08um = new C08UM(C08UO.LIZ, C08UO.LIZIZ, 30L, TimeUnit.SECONDS, C08UO.LIZJ, C08UO.LIZLLL, C08UO.LJ);
        c08um.allowCoreThreadTimeOut(true);
        return c08um;
    }
}
