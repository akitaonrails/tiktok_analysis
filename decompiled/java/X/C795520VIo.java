package X;

import Y.ACallableS20S2100000_13;
import Y.ACallableS245S0200000_13;
import Y.ACallableS65S1100000_13;
import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795520VIo implements InterfaceC796410VLz {
    public final AbstractC796540VMm LIZ;
    public final C580780MqC LIZIZ;
    public final C854550Xfh LIZJ;
    public final C854550Xfh LIZLLL;
    public final C854550Xfh LJ;
    public final C854550Xfh LJFF;
    public final C854550Xfh LJI;
    public final C854550Xfh LJII;
    public final C854550Xfh LJIIIIZZ;

    public C795520VIo(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new C580780MqC(abstractC796540VMm, 1);
        this.LIZJ = new C854550Xfh(abstractC796540VMm, 22);
        this.LIZLLL = new C854550Xfh(abstractC796540VMm, 23);
        this.LJ = new C854550Xfh(abstractC796540VMm, 24);
        this.LJFF = new C854550Xfh(abstractC796540VMm, 25);
        new C854550Xfh(abstractC796540VMm, 26);
        this.LJI = new C854550Xfh(abstractC796540VMm, 27);
        this.LJII = new C854550Xfh(abstractC796540VMm, 28);
        this.LJIIIIZZ = new C854550Xfh(abstractC796540VMm, 29);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LIZIZ(String str, C806380VkC c806380VkC) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT old_framework_data FROM aigc_workflow WHERE id = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 18), c806380VkC);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LIZLLL(String str, C806370VkB c806370VkB) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT grade_down_count FROM aigc_workflow WHERE id = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 19), c806370VkB);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJ(String str, C806360VkA c806360VkA) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS65S1100000_13(this, str, 1), c806360VkA);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJFF(String str, C806420VkG c806420VkG) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM aigc_workflow WHERE source_read_only = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 15), c806420VkG);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJII(C555820Lr2 c555820Lr2, C806340Vk8 c806340Vk8) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, c555820Lr2, 12), c806340Vk8);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJIIIZ(List list, C806430VkH c806430VkH) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM aigc_workflow WHERE creation_id_read_only IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(")");
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(size, sb.toString());
        Iterator it2 = list.iterator();
        int i = 1;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                c0vn5LIZLLL.LLD(i);
            } else {
                c0vn5LIZLLL.LJIILIIL(i, str);
            }
            i++;
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 14), c806430VkH);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJIIJ(String str, C806400VkE c806400VkE) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM aigc_workflow WHERE id = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 13), c806400VkE);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJIIJJI(String str, C806410VkF c806410VkF) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM aigc_workflow WHERE server_task_id = ? LIMIT 1");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 16), c806410VkF);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJIILIIL(String str, C806440VkI c806440VkI) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS65S1100000_13(this, str, 2), c806440VkI);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJIILJJIL(String str, C806390VkD c806390VkD) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT server_task_id FROM aigc_workflow WHERE id = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 17), c806390VkD);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LIZ(String str, String str2, C806460VkK c806460VkK) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS20S2100000_13(this, str2, str, 1), c806460VkK);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LIZJ(String str, String str2, C806330Vk7 c806330Vk7) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS20S2100000_13(this, str2, str, 3), c806330Vk7);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJI(String str, String str2, C806330Vk7 c806330Vk7) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS20S2100000_13(this, str2, str, 0), c806330Vk7);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJIIIIZZ(String str, String str2, C806350Vk9 c806350Vk9) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS20S2100000_13(this, str2, str, 2), c806350Vk9);
    }

    @Override // X.InterfaceC796410VLz
    public final Object LJIIL(String str, String str2, C806450VkJ c806450VkJ) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS20S2100000_13(this, str2, str, 4), c806450VkJ);
    }
}
