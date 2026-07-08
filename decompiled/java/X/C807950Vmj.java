package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.frequency.repository.OutreachRecordDatabase;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: renamed from: X.0Vmj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807950Vmj extends C808140Vn2<String, OutreachFlowReportItem> {
    public final C822720WPe LJIIJ;
    public final List<C1864407Ry> LJIIJJI;

    public C807950Vmj(Context context, C822720WPe c822720WPe, C822770WPj c822770WPj, List list) {
        InterfaceC808060Vmu interfaceC808060VmuLIZ;
        InterfaceC808000Vmo interfaceC808000Vmo;
        if (context != null) {
            C0VKE c0vke = OutreachRecordDatabase.LL;
            OutreachRecordDatabase outreachRecordDatabase = OutreachRecordDatabase.LLILLJJLI;
            if (outreachRecordDatabase == null) {
                synchronized (c0vke) {
                    try {
                        C796500VMi c796500VMiLIZ = C0OGG.LIZ(C786410Ut5.N3(context), OutreachRecordDatabase.class, "outreach_record_db");
                        c796500VMiLIZ.LIZJ();
                        c796500VMiLIZ.LJIIIZ = true;
                        c796500VMiLIZ.LJIIJ = true;
                        AbstractC796510VMj[] abstractC796510VMjArr = (AbstractC796510VMj[]) OutreachRecordDatabase.LLILLL.toArray(new AbstractC796510VMj[0]);
                        c796500VMiLIZ.LIZ((AbstractC796510VMj[]) Arrays.copyOf(abstractC796510VMjArr, abstractC796510VMjArr.length));
                        outreachRecordDatabase = (OutreachRecordDatabase) c796500VMiLIZ.LIZIZ();
                        OutreachRecordDatabase.LLILLJJLI = outreachRecordDatabase;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            interfaceC808060VmuLIZ = outreachRecordDatabase.LIZ();
        } else {
            interfaceC808060VmuLIZ = null;
        }
        C808190Vn7 c808190Vn7 = new C808190Vn7(new C808030Vmr(interfaceC808060VmuLIZ));
        C808170Vn5 c808170Vn5 = new C808170Vn5(20, 100L, null, new AwS582S0100000_3(list, (List<C0O27>) 155), new C807980Vmm());
        final InterfaceC807990Vmn interfaceC807990Vmn = c822770WPj.LIZ;
        if (interfaceC807990Vmn != null) {
            interfaceC808000Vmo = new InterfaceC808000Vmo() { // from class: X.0Vmk
                @Override // X.InterfaceC808000Vmo
                public final void execute(Runnable runnable) {
                    interfaceC807990Vmn.execute(runnable);
                }
            };
        } else {
            interfaceC808000Vmo = null;
        }
        super(c808190Vn7, c808170Vn5, interfaceC808000Vmo);
        this.LJIIJ = c822720WPe;
        this.LJIIJJI = list;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((C1864407Ry) it2.next()).LIZ;
            if (str != null) {
                arrayList.add(str);
            }
        }
        C23250099c.LIZLLL(this.LIZLLL, null, null, new C808090Vmx(this, C13LP.LLIIJI(arrayList), new AwS592S0100000_13(this, 100), null), 3);
    }
}
