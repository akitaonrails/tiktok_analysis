package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E20, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.stickpoint.EditorProStickPointNLEHandler$startDefaultStickPointNew$1", f = "EditorProStickPointNLEHandler.kt", l = {619, 626}, m = "invokeSuspend")
public final class C0E20 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C357990E1t LLILLJJLI;
    public final /* synthetic */ InterfaceC358010E1v LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E20(C357990E1t c357990E1t, InterfaceC358010E1v interfaceC358010E1v, String str, int i, InterfaceC1364105Vn<? super C0E20> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c357990E1t;
        this.LLILLL = interfaceC358010E1v;
        this.LLILZ = str;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E20(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        Object objLJI = obj;
        C1C7U.LIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC358010E1v interfaceC358010E1v = this.LLILLL;
            if (interfaceC358010E1v != null) {
                interfaceC358010E1v.onFailed();
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1");
                return unit;
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            this.LLILLJJLI.getClass();
            VideoPublishEditModel videoPublishEditModelLIZ = C357990E1t.LIZ();
            if (videoPublishEditModelLIZ != null && (creativeModel = videoPublishEditModelLIZ.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
                musicBuzModel.stickPointStrategy = false;
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C20249514Ld c20249514Ld = new C20249514Ld(this.LLILLJJLI, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c20249514Ld);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLJI;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        List list = (List) pair.getSecond();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C358050E1z c358050E1z = new C358050E1z(iIntValue, this.LLILLL, this.LLILZ, this.LLILLJJLI, this.LLILZIL, list, null);
        this.LL = 2;
        objLJI = C23250099c.LJI(this, abstractC2238408pq, c358050E1z);
        if (objLJI == objLJFF) {
            C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
