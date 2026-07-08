package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.MediaPreProcessManager$processBeforeOnChosenResult$1", f = "MediaPreProcessManager.kt", l = {111, 114}, m = "invokeSuspend")
public final class C345140Dg0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C345210Dg7 LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ C1DRG LLILZLL;
    public final /* synthetic */ Intent LLIZ;
    public final /* synthetic */ CreativeLoadingDialog LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345140Dg0(C345210Dg7 c345210Dg7, C013C c013c, C1DRG c1drg, Intent intent, CreativeLoadingDialog creativeLoadingDialog, Function0<Unit> function0, InterfaceC1364105Vn<? super C345140Dg0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c345210Dg7;
        this.LLILZIL = c013c;
        this.LLILZLL = c1drg;
        this.LLIZ = intent;
        this.LLIZLLLIL = creativeLoadingDialog;
        this.LLJ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C345140Dg0 c345140Dg0 = new C345140Dg0(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c345140Dg0.LLILLL = obj;
        return c345140Dg0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C1C7U.LIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            jCurrentTimeMillis = System.currentTimeMillis();
            C345210Dg7 c345210Dg7 = this.LLILZ;
            StringBuilder sb = new StringBuilder("processBeforeOnChosenResult: begin to process, taskList: ");
            List<InterfaceC345200Dg6> list = this.LLILZ.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC345200Dg6) it2.next()).getName());
            }
            sb.append(arrayList);
            String string = sb.toString();
            c345210Dg7.getClass();
            C345210Dg7.LIZIZ(string);
            C345210Dg7 c345210Dg72 = this.LLILZ;
            List<InterfaceC345200Dg6> list2 = c345210Dg72.LIZIZ;
            C013C c013c = this.LLILZIL;
            C1DRG c1drg = this.LLILZLL;
            Intent intent = this.LLIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it3 = ((ArrayList) list2).iterator();
            while (it3.hasNext()) {
                C013C c013c2 = c013c;
                C345210Dg7 c345210Dg73 = c345210Dg72;
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C345150Dg1(c013c2, (InterfaceC345200Dg6) it3.next(), c1drg, intent, c345210Dg73, jCurrentTimeMillis, null), 3));
                c013c = c013c2;
                c345210Dg72 = c345210Dg73;
            }
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            if (C1D9F.LIZ(arrayList2, this) == objLJFF) {
                C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1");
                return objLJFF;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C345210Dg7 c345210Dg74 = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processBeforeOnChosenResult: finished: cost time: ");
        sbLIZ.append(jCurrentTimeMillis2);
        sbLIZ.append("ms");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c345210Dg74.getClass();
        C345210Dg7.LIZIZ(strLIZIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C345130Dfz c345130Dfz = new C345130Dfz(this.LLIZLLLIL, this.LLILZIL, this.LLJ, null);
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c345130Dfz) == objLJFF) {
            C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaPreProcessManager@9e45.processBeforeOnChosenResult$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
