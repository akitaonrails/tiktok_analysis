package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.150k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.debug.module.SimpleGameRestInferModule$startInference$1", f = "SimpleGameRestInferModule.kt", l = {77}, m = "invokeSuspend")
public final class C204504150k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass1512 LLILLJJLI;
    public final /* synthetic */ ByteBuffer LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ InterfaceC204502150i LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204504150k(AnonymousClass1512 anonymousClass1512, ByteBuffer byteBuffer, boolean z, String str, long j, InterfaceC204502150i interfaceC204502150i, InterfaceC1364105Vn<? super C204504150k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass1512;
        this.LLILLL = byteBuffer;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = j;
        this.LLIZ = interfaceC204502150i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204504150k(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        Integer numValueOf;
        EnumC19363810pI enumC19363810pI;
        C1C7U.LIZ("SimpleGameRestInferModule@e040.startInference$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass1512 anonymousClass1512 = this.LLILLJJLI;
            ByteBuffer byteBuffer = this.LLILLL;
            boolean z = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = 1;
            anonymousClass1512.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ILiveGameService iLiveGameService = (ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class);
            C151R c151r = new C151R() { // from class: X.150l
                @Override // X.C151R
                public final void LIZ(C204518150y c204518150y) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    InterfaceC1364105Vn<C204518150y> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(c204518150y);
                    interfaceC1364105Vn.resumeWith(c204518150y);
                }
            };
            C151B c151b = C151B.KEY_GAP;
            Room room = anonymousClass1512.LIZ;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            iLiveGameService.Zg2(byteBuffer, c151r, c151b, z, id, str);
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SimpleGameRestInferModule@e040.startInference$1");
                return objLJFF;
            }
        }
        C204518150y c204518150y = (C204518150y) obj;
        this.LLILLJJLI.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        ILiveGameService iLiveGameService2 = (ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class);
        Unit unit = null;
        if (c204518150y != null && (enumC19363810pI = c204518150y.LJI) != null) {
            numValueOf = Integer.valueOf(enumC19363810pI.getValue());
        } else {
            numValueOf = null;
        }
        iLiveGameService2.XL0(numValueOf, "g_broadcast_game_rest_status");
        this.LLILLJJLI.LIZIZ.set(false);
        InterfaceC204502150i interfaceC204502150i = this.LLIZ;
        if (interfaceC204502150i != null) {
            interfaceC204502150i.LIZ();
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("SimpleGameRestInferModule@e040.startInference$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
