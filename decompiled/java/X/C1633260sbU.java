package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.ApiState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0sbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.HorizontalPanelRequestManagerImpl$request$1", f = "HorizontalPanelRequestManager.kt", l = {311}, m = "invokeSuspend")
public final class C1633260sbU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1633200sbO LL;
    public C1633220sbQ LLILLJJLI;
    public Object LLILLL;
    public C1DEV LLILZ;
    public C1633280sbW LLILZIL;
    public Object LLILZLL;
    public C1633750scH LLIZ;
    public InterfaceC1633390sbh LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ C1633280sbW LLJI;
    public final /* synthetic */ C1633200sbO LLJIJIL;
    public final /* synthetic */ Function0<Map<String, String>> LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ C1633750scH LLJILLL;
    public final /* synthetic */ InterfaceC1633390sbh LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1633260sbU(C1633280sbW c1633280sbW, C1633200sbO c1633200sbO, Function0<? extends Map<String, String>> function0, String str, C1633750scH c1633750scH, InterfaceC1633390sbh interfaceC1633390sbh, InterfaceC1364105Vn<? super C1633260sbU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = c1633280sbW;
        this.LLJIJIL = c1633200sbO;
        this.LLJILJIL = function0;
        this.LLJILJILJ = str;
        this.LLJILLL = c1633750scH;
        this.LLJJ = interfaceC1633390sbh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1633260sbU(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1633200sbO c1633200sbOLIZ;
        C1633220sbQ c1633220sbQLIZIZ;
        boolean z;
        Map mapLJIIL;
        C1633280sbW c1633280sbW;
        C1DEV c1dev;
        Object obj2;
        C1633750scH c1633750scH;
        InterfaceC1633390sbh interfaceC1633390sbh;
        Object objInvoke;
        C1C7U.LIZ("HorizontalPanelRequestManagerImpl@e132.request$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLJ;
        boolean z2 = false;
        if (i != 0) {
            if (i == 1) {
                interfaceC1633390sbh = this.LLIZLLLIL;
                c1633750scH = this.LLIZ;
                obj2 = this.LLILZLL;
                c1633280sbW = this.LLILZIL;
                c1dev = this.LLILZ;
                mapLJIIL = (Map) this.LLILLL;
                c1633220sbQLIZIZ = this.LLILLJJLI;
                c1633200sbOLIZ = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1633280sbW c1633280sbW2 = this.LLJI;
            C1633200sbO c1633200sbO = this.LLJIJIL;
            c1633280sbW2.getClass();
            c1633200sbOLIZ = C1633200sbO.LIZ(c1633200sbO, C13LP.LLIIII(c1633200sbO.LIZ), 0, 6);
            this.LLJI.getClass();
            c1633220sbQLIZIZ = C1633280sbW.LIZIZ(c1633200sbOLIZ);
            Map<String, String> mapInvoke = this.LLJILJIL.invoke();
            AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(481);
            C13DA c13da = new C13DA();
            int i2 = c1633200sbOLIZ.LIZIZ;
            if (i2 != 0 && (objInvoke = aFwS266S0000000_25.invoke(Integer.valueOf(i2))) != null) {
                c13da.put("allow_list", objInvoke);
            }
            List<String> list = c1633200sbOLIZ.LIZ;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                List<String> list2 = c1633200sbOLIZ.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (String str : list2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('\"');
                    sbLIZ.append(str);
                    sbLIZ.append('\"');
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
                c13da.put("insert_effect_ids", arrayList.toString());
            }
            String str2 = c1633200sbOLIZ.LIZJ;
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str2 = null;
            }
            if (str2 != null) {
                c13da.put("sticker_id", c1633200sbOLIZ.LIZJ);
            }
            mapLJIIL = C2097608Jq.LJIIL(mapInvoke, c13da.build());
            c1633280sbW = this.LLJI;
            c1dev = c1633280sbW.LIZLLL;
            obj2 = this.LLJILJILJ;
            c1633750scH = this.LLJILLL;
            interfaceC1633390sbh = this.LLJJ;
            this.LL = c1633200sbOLIZ;
            this.LLILLJJLI = c1633220sbQLIZIZ;
            this.LLILLL = mapLJIIL;
            this.LLILZ = c1dev;
            this.LLILZIL = c1633280sbW;
            this.LLILZLL = obj2;
            this.LLIZ = c1633750scH;
            this.LLIZLLLIL = interfaceC1633390sbh;
            this.LLJ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("HorizontalPanelRequestManagerImpl@e132.request$1");
                return objLJFF;
            }
        }
        try {
            C09AE c09ae = (C09AE) ((LinkedHashMap) c1633280sbW.LJ).get(c1633220sbQLIZIZ);
            if (c09ae == null || c09ae.isCompleted()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("not in flight, current inflights = ");
                sbLIZ2.append(((LinkedHashMap) c1633280sbW.LJ).keySet());
                C2188811AlT.LIZIZ(sbLIZ2);
                if (Intrinsics.LJFF(obj2, c1633280sbW.LJIIIZ.getValue()) && Intrinsics.LJFF(c1633200sbOLIZ, c1633280sbW.LJII.getValue()) && (c1633280sbW.LIZIZ.LIZ.getValue() instanceof ApiState.Success) && (c1633280sbW.LIZIZ.LIZIZ.getValue().getSecond() instanceof ApiState.Success)) {
                    z2 = true;
                }
                c1633280sbW.LJII.setValue(c1633200sbOLIZ);
                if (!z2) {
                    c1633280sbW.LJIIIIZZ.setValue(mapLJIIL);
                    c1633280sbW.LJIIIZ.setValue(obj2);
                    c1633280sbW.LJFF = c1633750scH;
                    c1633280sbW.LJI = interfaceC1633390sbh;
                    c1633280sbW.LIZJ.cancel();
                    c1633280sbW.LJ.put(c1633220sbQLIZIZ, c1633280sbW.LIZ(c1633220sbQLIZIZ, c1633200sbOLIZ, mapLJIIL, c1633750scH, interfaceC1633390sbh));
                }
            }
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("HorizontalPanelRequestManagerImpl@e132.request$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
