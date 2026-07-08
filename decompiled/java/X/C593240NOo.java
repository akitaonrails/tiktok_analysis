package X;

import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository;
import com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl$updateDatabaseAndTryTriggerEffect$1", f = "AwemeManageServiceImpl.kt", l = {214}, m = "invokeSuspend")
public final class C593240NOo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NPC LLILLJJLI;
    public final /* synthetic */ AwemeManageServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593240NOo(C0NPC c0npc, AwemeManageServiceImpl awemeManageServiceImpl, InterfaceC1364105Vn<? super C593240NOo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0npc;
        this.LLILLL = awemeManageServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593240NOo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeManageServiceImpl@876f.updateDatabaseAndTryTriggerEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC593180NOi.LIZ.getClass();
                InterfaceC593180NOi interfaceC593180NOiLIZ = C611550Nyj.LIZ();
                if (interfaceC593180NOiLIZ != null) {
                    C0NPC c0npc = this.LLILLJJLI;
                    this.LL = 1;
                    if (interfaceC593180NOiLIZ.LJIIJ(c0npc, this) == objLJFF) {
                        C1C7U.LIZIZ("AwemeManageServiceImpl@876f.updateDatabaseAndTryTriggerEffect$1");
                        return objLJFF;
                    }
                }
            }
        } catch (SQLiteDiskIOException e) {
            TryCatchGuardChecker.doCheck(e);
            C0I0B.LJFF.LIZIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("exception_message", String.valueOf(e.getMessage()));
            C20684815ws.LJIILLIIL("ttsocial_insert_or_replace_exception", linkedHashMap);
        } catch (SQLiteFullException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C0I0B.LJFF.LIZIZ();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("exception_message", String.valueOf(e2.getMessage()));
            C20684815ws.LJIILLIIL("ttsocial_insert_or_replace_exception", linkedHashMap2);
        }
        IAwemeEffectRepository iAwemeEffectRepository = (IAwemeEffectRepository) this.LLILLL.LIZIZ.getValue();
        if (iAwemeEffectRepository != null) {
            iAwemeEffectRepository.LIZLLL(C0NPB.LIZ(this.LLILLJJLI));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeManageServiceImpl@876f.updateDatabaseAndTryTriggerEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
