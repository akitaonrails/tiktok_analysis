package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15sK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20656615sK {
    public volatile EnumC20657015sO LIZ;
    public final List<Function2<EnumC20657015sO, EnumC20657015sO, Unit>> LIZIZ = new ArrayList();

    public final void LIZ() {
        LIZLLL(EnumC20657015sO.DISMISSED);
    }

    public final void LIZIZ() {
        LIZLLL(EnumC20657015sO.FAILED);
    }

    public final void LIZJ() {
        LIZLLL(EnumC20657015sO.SHOWED);
    }

    public C20656615sK(EnumC20657015sO enumC20657015sO) {
        this.LIZ = enumC20657015sO;
    }

    public final synchronized void LIZLLL(EnumC20657015sO enumC20657015sO) {
        EnumC20657015sO enumC20657015sO2 = this.LIZ;
        if (enumC20657015sO2 != enumC20657015sO) {
            this.LIZ = enumC20657015sO;
            if (enumC20657015sO != EnumC20657015sO.PENDING) {
                Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((Function2) it2.next()).invoke(enumC20657015sO2, enumC20657015sO);
                }
            }
            if (enumC20657015sO == EnumC20657015sO.DISMISSED || enumC20657015sO == EnumC20657015sO.FAILED || enumC20657015sO == EnumC20657015sO.IGNORED) {
                ((ArrayList) this.LIZIZ).clear();
            }
        }
    }
}
