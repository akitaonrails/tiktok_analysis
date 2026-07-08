package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.150r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.debug.module.SimpleGameMLBBHeroInferModule$startInference$1", f = "SimpleGameMLBBHeroInferModule.kt", l = {106}, m = "invokeSuspend")
public final class C204511150r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C204514150u LLILLJJLI;
    public final /* synthetic */ ByteBuffer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC204502150i LLILZLL;
    public final /* synthetic */ ByteBuffer LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ AbstractC1273900jFs LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204511150r(C204514150u c204514150u, ByteBuffer byteBuffer, String str, boolean z, InterfaceC204502150i interfaceC204502150i, ByteBuffer byteBuffer2, long j, AbstractC1273900jFs abstractC1273900jFs, InterfaceC1364105Vn<? super C204511150r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c204514150u;
        this.LLILLL = byteBuffer;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC204502150i;
        this.LLIZ = byteBuffer2;
        this.LLIZLLLIL = j;
        this.LLJ = abstractC1273900jFs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204511150r(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        Object objLIZ = obj;
        C1C7U.LIZ("SimpleGameMLBBHeroInferModule@ebb8.startInference$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C204514150u c204514150u = this.LLILLJJLI;
            ByteBuffer byteBuffer = this.LLILLL;
            String str = this.LLILZ;
            boolean z = this.LLILZIL;
            this.LL = 1;
            c204514150u.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ILiveGameService iLiveGameService = (ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class);
            C151R c151r = new C151R() { // from class: X.150s
                @Override // X.C151R
                public final void LIZ(C204518150y c204518150y) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    c204518150y.LJ = C204514150u.LJIILIIL;
                    InterfaceC1364105Vn<C204518150y> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(c204518150y);
                    interfaceC1364105Vn.resumeWith(c204518150y);
                }
            };
            C151B c151b = C151B.MLBB_HERO;
            Room room = c204514150u.LIZ;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            iLiveGameService.Zg2(byteBuffer, c151r, c151b, z, id, str);
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("SimpleGameMLBBHeroInferModule@ebb8.startInference$1");
                return objLJFF;
            }
        }
        C204518150y c204518150y = (C204518150y) objLIZ;
        if (c204518150y != null) {
            C204514150u c204514150u2 = this.LLILLJJLI;
            ByteBuffer byteBuffer2 = this.LLIZ;
            ByteBuffer byteBuffer3 = this.LLILLL;
            c204514150u2.getClass();
            float[] fArr = c204518150y.LIZIZ;
            Map<String, Object> map = C1338270kvh.LIZ;
            if (fArr.length == C204514150u.LJIIL) {
                if (fArr.length == 0) {
                    "Input FloatArray must not be empty".toString();
                    throw new IllegalArgumentException("Input FloatArray must not be empty");
                }
                float f = fArr[0];
                int length = fArr.length;
                int i2 = 0;
                for (int i3 = 1; i3 < length; i3++) {
                    float f2 = fArr[i3];
                    if (f2 > f) {
                        i2 = i3;
                        f = f2;
                    }
                }
                Pair pair = new Pair(Integer.valueOf(i2), Float.valueOf(f));
                c204514150u2.LIZIZ.get(pair.getFirst());
                Map<String, Object> map2 = C1338270kvh.LIZ;
                if (((Number) pair.getSecond()).floatValue() < C204514150u.LJIILIIL) {
                    c204514150u2.LIZIZ.get(0);
                } else {
                    c204514150u2.LIZIZ.get(Integer.valueOf(((Number) pair.getFirst()).intValue()));
                }
                byteBuffer3.clear();
                byteBuffer2.clear();
            }
        }
        this.LLILLJJLI.LIZJ.set(false);
        InterfaceC204502150i interfaceC204502150i = this.LLILZLL;
        if (interfaceC204502150i != null) {
            interfaceC204502150i.LIZ();
        }
        this.LLILLJJLI.LIZLLL = System.currentTimeMillis();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SimpleGameMLBBHeroInferModule@ebb8.startInference$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
