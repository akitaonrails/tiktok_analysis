package X;

import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.api.GameSexualReportApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1514, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.GameSexualInferModule$startInference$1", f = "GameSexualInferModule.kt", l = {133}, m = "invokeSuspend")
public final class AnonymousClass1514 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass1515 LLILLJJLI;
    public final /* synthetic */ ByteBuffer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ByteBuffer LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ AnonymousClass1517 LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ InterfaceC204502150i LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1514(AnonymousClass1515 anonymousClass1515, ByteBuffer byteBuffer, String str, boolean z, ByteBuffer byteBuffer2, int i, int i2, AnonymousClass1517 anonymousClass1517, long j, InterfaceC204502150i interfaceC204502150i, InterfaceC1364105Vn<? super AnonymousClass1514> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass1515;
        this.LLILLL = byteBuffer;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = byteBuffer2;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = anonymousClass1517;
        this.LLJI = j;
        this.LLJIJIL = interfaceC204502150i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1514(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        float f;
        boolean z;
        long j;
        Unit unit;
        long id2;
        float f2;
        Object objLIZ = obj;
        C1C7U.LIZ("GameSexualInferModule@2ef1.startInference$1");
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
            AnonymousClass1515 anonymousClass1515 = this.LLILLJJLI;
            ByteBuffer byteBuffer = this.LLILLL;
            String str = this.LLILZ;
            boolean z2 = this.LLILZIL;
            this.LL = 1;
            anonymousClass1515.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ILiveGameService iLiveGameService = (ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class);
            C151R c151r = new C151R() { // from class: X.1518
                @Override // X.C151R
                public final void LIZ(C204518150y c204518150y) {
                    InterfaceC1364105Vn<C204518150y> interfaceC1364105Vn = c23260099m;
                    c204518150y.LJ = AnonymousClass1515.LJI;
                    Map<String, Object> map = C1338270kvh.LIZ;
                    C189200o6.m2constructorimpl(c204518150y);
                    interfaceC1364105Vn.resumeWith(c204518150y);
                }
            };
            C151B c151b = C151B.SEXUAL;
            Room room = anonymousClass1515.LIZ;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            iLiveGameService.Zg2(byteBuffer, c151r, c151b, z2, id, str);
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("GameSexualInferModule@2ef1.startInference$1");
                return objLJFF;
            }
        }
        final C204518150y c204518150y = (C204518150y) objLIZ;
        final AnonymousClass1515 anonymousClass15152 = this.LLILLJJLI;
        ByteBuffer byteBuffer2 = this.LLILZLL;
        int i2 = this.LLIZ;
        int i3 = this.LLIZLLLIL;
        ByteBuffer byteBuffer3 = this.LLILLL;
        final AnonymousClass1517 anonymousClass1517 = this.LLJ;
        long j2 = this.LLJI;
        final String str2 = this.LLILZ;
        anonymousClass15152.getClass();
        anonymousClass1517.LIZIZ();
        if (c204518150y != null) {
            f = c204518150y.LIZ;
        } else {
            f = 0.0f;
        }
        float f3 = AnonymousClass1515.LJI;
        if (f >= f3) {
            z = true;
        } else {
            z = false;
        }
        if (f <= 0.0f) {
            j = AnonymousClass1515.LJIIIIZZ;
        } else if (f >= f3) {
            j = AnonymousClass1515.LJII;
        } else {
            j = AnonymousClass1515.LJII + ((long) ((AnonymousClass1515.LJIIIIZZ - r3) * (1 - (f / f3))));
        }
        anonymousClass15152.LIZIZ = j;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            EnumC771350UNp enumC771350UNp = EnumC771350UNp.GAME_SEXUAL_DETECT;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sexual_");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(".jpg");
            final C0VSJ c0vsjLJIILJJIL = C151K.LJIILJJIL(byteBuffer2, i2, i3, enumC771350UNp, C2188811AlT.LIZIZ(sbLIZ));
            Room room2 = anonymousClass15152.LIZ;
            String strYh2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.SEXUAL);
            if (c0vsjLJIILJJIL != null) {
                final long jHashCode = ((long) c0vsjLJIILJJIL.hashCode()) + System.currentTimeMillis();
                if (room2 != null) {
                    id2 = room2.getId();
                } else {
                    id2 = 0;
                }
                HashMap map2 = new HashMap();
                if (c204518150y != null) {
                    f2 = c204518150y.LIZ;
                } else {
                    f2 = 0.0f;
                }
                map2.put("room_id", Long.valueOf(id2));
                map2.put("timestamp", Long.valueOf(j2));
                map2.put("model_name", strYh2);
                map2.put("model_score", Float.valueOf(f2));
                map2.put("model_threshold", Float.valueOf(f3));
                map2.put("data_type", 1);
                MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", c0vsjLJIILJJIL));
                C480460Ism.LIZ().getClass();
                AbstractC19484711Kz<C470590Icr<Object>> abstractC19484711KzUploadSexualSignal = ((GameSexualReportApi) C480460Ism.LIZLLL(GameSexualReportApi.class)).uploadSexualSignal(map2, multipartTypedOutput);
                if (abstractC19484711KzUploadSexualSignal != null) {
                    abstractC19484711KzUploadSexualSignal.LIZ(new InterfaceC19474811He<C470590Icr<Object>>() { // from class: X.1516
                        @Override // X.InterfaceC19474811He
                        public final void onError(Throwable th) {
                            C20441214yg.LJ("GameSexualInferModuleTag", "report error.");
                            ((ConcurrentHashMap) anonymousClass15152.LJ).remove(Long.valueOf(jHashCode));
                            C151K.LIZ(c0vsjLJIILJJIL);
                            AnonymousClass1517 anonymousClass15172 = anonymousClass1517;
                            anonymousClass15172.getClass();
                            anonymousClass15172.LJFF = System.currentTimeMillis() - anonymousClass15172.LIZJ;
                            C151F c151f = anonymousClass15152.LIZJ;
                            if (c151f != null) {
                                c151f.LIZLLL(anonymousClass1517, c204518150y, "virtual_sexual_game", str2, false);
                            }
                        }

                        @Override // X.InterfaceC19474811He
                        public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                            ((ConcurrentHashMap) anonymousClass15152.LJ).put(Long.valueOf(jHashCode), interfaceC420801kM);
                        }

                        @Override // X.InterfaceC19474811He
                        public final void onSuccess(C470590Icr<Object> c470590Icr) {
                            Map<String, Object> map3 = C1338270kvh.LIZ;
                            C151K.LIZ(c0vsjLJIILJJIL);
                            ((ConcurrentHashMap) anonymousClass15152.LJ).remove(Long.valueOf(jHashCode));
                            AnonymousClass1517 anonymousClass15172 = anonymousClass1517;
                            anonymousClass15172.getClass();
                            anonymousClass15172.LJFF = System.currentTimeMillis() - anonymousClass15172.LIZJ;
                            C151F c151f = anonymousClass15152.LIZJ;
                            if (c151f != null) {
                                c151f.LIZLLL(anonymousClass1517, c204518150y, "virtual_sexual_game", str2, false);
                            }
                        }
                    });
                }
            }
        } else {
            C151F c151f = anonymousClass15152.LIZJ;
            if (c151f != null) {
                c151f.LIZLLL(anonymousClass1517, c204518150y, "virtual_sexual_game", str2, false);
            }
        }
        byteBuffer3.clear();
        byteBuffer2.clear();
        this.LLILLJJLI.LIZLLL.set(false);
        InterfaceC204502150i interfaceC204502150i = this.LLJIJIL;
        if (interfaceC204502150i != null) {
            interfaceC204502150i.LIZ();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("GameSexualInferModule@2ef1.startInference$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
