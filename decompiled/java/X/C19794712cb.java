package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.12cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19794712cb extends AbstractC19795912cn {
    public final InterfaceC19789012bg LLILLL;

    public C19794712cb(C19788912bf c19788912bf) {
        super("internal.logger");
        this.LLILLL = c19788912bf;
        final boolean z = false;
        final boolean z2 = true;
        ((HashMap) this.LLILLJJLI).put("log", new AbstractC19795912cn(z, z2) { // from class: X.12cZ
            public final boolean LLILLL;
            public final boolean LLILZ;

            @Override // X.AbstractC19795912cn
            public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                C19796312cr.LJIIIZ(1, "log", list);
                int size = list.size();
                C19796212cq c19796212cq = InterfaceC19797112cz.LJIILIIL;
                if (size == 1) {
                    ((C19788912bf) this.LLILZIL.LLILLL).LIZ(EnumC19789812bo.INFO, c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF(), Collections.emptyList(), this.LLILLL, this.LLILZ);
                    return c19796212cq;
                }
                EnumC19789812bo enumC19789812boZza = EnumC19789812bo.zza(C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()));
                String strLJFF = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJFF();
                if (list.size() == 2) {
                    ((C19788912bf) this.LLILZIL.LLILLL).LIZ(enumC19789812boZza, strLJFF, Collections.emptyList(), this.LLILLL, this.LLILZ);
                    return c19796212cq;
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 2; i < Math.min(list.size(), 5); i++) {
                    arrayList.add(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, i)).LJFF());
                }
                ((C19788912bf) this.LLILZIL.LLILLL).LIZ(enumC19789812boZza, strLJFF, arrayList, this.LLILLL, this.LLILZ);
                return c19796212cq;
            }

            {
                super("log");
                this.LLILLL = z;
                this.LLILZ = z2;
            }
        });
        ((HashMap) this.LLILLJJLI).put("silent", new AbstractC19795912cn() { // from class: X.12cd
            @Override // X.AbstractC19795912cn
            public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                return this;
            }
        });
        ((AbstractC19795912cn) ((HashMap) this.LLILLJJLI).get("silent")).LJIIJJI("log", new AbstractC19795912cn(z2, z2) { // from class: X.12cZ
            public final boolean LLILLL;
            public final boolean LLILZ;

            @Override // X.AbstractC19795912cn
            public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                C19796312cr.LJIIIZ(1, "log", list);
                int size = list.size();
                C19796212cq c19796212cq = InterfaceC19797112cz.LJIILIIL;
                if (size == 1) {
                    ((C19788912bf) this.LLILZIL.LLILLL).LIZ(EnumC19789812bo.INFO, c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF(), Collections.emptyList(), this.LLILLL, this.LLILZ);
                    return c19796212cq;
                }
                EnumC19789812bo enumC19789812boZza = EnumC19789812bo.zza(C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()));
                String strLJFF = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJFF();
                if (list.size() == 2) {
                    ((C19788912bf) this.LLILZIL.LLILLL).LIZ(enumC19789812boZza, strLJFF, Collections.emptyList(), this.LLILLL, this.LLILZ);
                    return c19796212cq;
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 2; i < Math.min(list.size(), 5); i++) {
                    arrayList.add(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, i)).LJFF());
                }
                ((C19788912bf) this.LLILZIL.LLILLL).LIZ(enumC19789812boZza, strLJFF, arrayList, this.LLILLL, this.LLILZ);
                return c19796212cq;
            }

            {
                super("log");
                this.LLILLL = z2;
                this.LLILZ = z2;
            }
        });
        ((HashMap) this.LLILLJJLI).put("unmonitored", new AbstractC19795912cn() { // from class: X.12ce
            @Override // X.AbstractC19795912cn
            public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                return this;
            }
        });
        ((AbstractC19795912cn) ((HashMap) this.LLILLJJLI).get("unmonitored")).LJIIJJI("log", new AbstractC19795912cn(z, z) { // from class: X.12cZ
            public final boolean LLILLL;
            public final boolean LLILZ;

            @Override // X.AbstractC19795912cn
            public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                C19796312cr.LJIIIZ(1, "log", list);
                int size = list.size();
                C19796212cq c19796212cq = InterfaceC19797112cz.LJIILIIL;
                if (size == 1) {
                    ((C19788912bf) this.LLILZIL.LLILLL).LIZ(EnumC19789812bo.INFO, c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF(), Collections.emptyList(), this.LLILLL, this.LLILZ);
                    return c19796212cq;
                }
                EnumC19789812bo enumC19789812boZza = EnumC19789812bo.zza(C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()));
                String strLJFF = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJFF();
                if (list.size() == 2) {
                    ((C19788912bf) this.LLILZIL.LLILLL).LIZ(enumC19789812boZza, strLJFF, Collections.emptyList(), this.LLILLL, this.LLILZ);
                    return c19796212cq;
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 2; i < Math.min(list.size(), 5); i++) {
                    arrayList.add(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, i)).LJFF());
                }
                ((C19788912bf) this.LLILZIL.LLILLL).LIZ(enumC19789812boZza, strLJFF, arrayList, this.LLILLL, this.LLILZ);
                return c19796212cq;
            }

            {
                super("log");
                this.LLILLL = z;
                this.LLILZ = z;
            }
        });
    }

    @Override // X.AbstractC19795912cn
    public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        return InterfaceC19797112cz.LJIILIIL;
    }
}
