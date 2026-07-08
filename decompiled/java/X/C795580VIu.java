package X;

import Y.ACallableS245S0200000_13;
import android.os.CancellationSignal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795580VIu implements InterfaceC808060Vmu {
    public final AbstractC796540VMm LIZ;
    public final C795620VIy LIZIZ;
    public final C795590VIv LIZJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VIy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0VIv] */
    public C795580VIu(final AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new AbstractC796330VLr<C795630VIz>(abstractC796540VMm) { // from class: X.0VIy
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `outreach_records` (`unique_key`,`outreach_key`,`outreach_type`,`trigger_scene`,`trigger_session`,`show_report_info`,`click_report_info_list`,`outreach_info`,`create_time`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC796330VLr
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C795630VIz c795630VIz) {
                C795630VIz c795630VIz2 = c795630VIz;
                String str = c795630VIz2.LIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(1);
                } else {
                    interfaceC796340VLs.LJIILIIL(1, str);
                }
                String str2 = c795630VIz2.LIZIZ;
                if (str2 == null) {
                    interfaceC796340VLs.LLD(2);
                } else {
                    interfaceC796340VLs.LJIILIIL(2, str2);
                }
                String str3 = c795630VIz2.LIZJ;
                if (str3 == null) {
                    interfaceC796340VLs.LLD(3);
                } else {
                    interfaceC796340VLs.LJIILIIL(3, str3);
                }
                String str4 = c795630VIz2.LIZLLL;
                if (str4 == null) {
                    interfaceC796340VLs.LLD(4);
                } else {
                    interfaceC796340VLs.LJIILIIL(4, str4);
                }
                String str5 = c795630VIz2.LJ;
                if (str5 == null) {
                    interfaceC796340VLs.LLD(5);
                } else {
                    interfaceC796340VLs.LJIILIIL(5, str5);
                }
                String str6 = c795630VIz2.LJFF;
                if (str6 == null) {
                    interfaceC796340VLs.LLD(6);
                } else {
                    interfaceC796340VLs.LJIILIIL(6, str6);
                }
                String str7 = c795630VIz2.LJI;
                if (str7 == null) {
                    interfaceC796340VLs.LLD(7);
                } else {
                    interfaceC796340VLs.LJIILIIL(7, str7);
                }
                String str8 = c795630VIz2.LJII;
                if (str8 == null) {
                    interfaceC796340VLs.LLD(8);
                } else {
                    interfaceC796340VLs.LJIILIIL(8, str8);
                }
                interfaceC796340VLs.LJIJ(9, c795630VIz2.LJIIIIZZ);
            }
        };
        new AbstractC796320VLq<C795630VIz>(abstractC796540VMm) { // from class: X.0VIx
            @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
            public final String createQuery() {
                return "DELETE FROM `outreach_records` WHERE `unique_key` = ?";
            }

            @Override // X.AbstractC796320VLq
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C795630VIz c795630VIz) {
                String str = c795630VIz.LIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(1);
                } else {
                    interfaceC796340VLs.LJIILIIL(1, str);
                }
            }
        };
        this.LIZJ = new AbstractC795470VIj(abstractC796540VMm) { // from class: X.0VIv
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "DELETE FROM outreach_records WHERE unique_key IN (SELECT unique_key FROM outreach_records WHERE outreach_type = ? ORDER BY create_time ASC LIMIT ?)";
            }
        };
        new AbstractC795470VIj(abstractC796540VMm) { // from class: X.0VIw
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "DELETE FROM outreach_records";
            }
        };
    }

    @Override // X.InterfaceC808060Vmu
    public final Object LIZLLL(C808040Vms c808040Vms) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM outreach_records ORDER BY create_time DESC");
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 44), c808040Vms);
    }

    @Override // X.InterfaceC808060Vmu
    public final Object LIZ(List list, C808150Vn3 c808150Vn3) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, list, 47), c808150Vn3);
    }

    @Override // X.InterfaceC808060Vmu
    public final Object LIZJ(List list, C808040Vms c808040Vms) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM outreach_records WHERE outreach_type IN (");
        int size = list.size();
        C0VIY.LIZ(sb, size);
        sb.append(") ORDER BY create_time DESC");
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
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 45), c808040Vms);
    }

    @Override // X.InterfaceC808060Vmu
    public final Object LJ(String str, C808050Vmt c808050Vmt) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT COUNT(*) FROM outreach_records WHERE outreach_type = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 46), c808050Vmt);
    }

    @Override // X.InterfaceC808060Vmu
    public final Object LIZIZ(final int i, final String str, C808150Vn3 c808150Vn3) {
        return C824670WWr.LIZJ(this.LIZ, new Callable<Unit>() { // from class: X.0VIn
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                C1C7U.LIZ("OutreachRecordDao_Impl@9b4d.deleteOldestByOutreachType$1");
                InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
                String str2 = str;
                if (str2 == null) {
                    interfaceC796340VLsAcquire.LLD(1);
                } else {
                    interfaceC796340VLsAcquire.LJIILIIL(1, str2);
                }
                interfaceC796340VLsAcquire.LJIJ(2, i);
                this.LLILLL.LIZ.beginTransaction();
                try {
                    interfaceC796340VLsAcquire.LJIIL();
                    this.LLILLL.LIZ.setTransactionSuccessful();
                    Unit unit = Unit.LIZ;
                    this.LLILLL.LIZ.endTransaction();
                    release(interfaceC796340VLsAcquire);
                    C1C7U.LIZIZ("OutreachRecordDao_Impl@9b4d.deleteOldestByOutreachType$1");
                    return unit;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILLL.LIZ.endTransaction();
                    release(interfaceC796340VLsAcquire);
                    throw th;
                }
            }
        }, c808150Vn3);
    }
}
