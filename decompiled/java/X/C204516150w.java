package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.api.GameLiveHighlightApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.game.ReportMLBBHeroRequest;
import webcast.api.game.ReportMLBBHeroResponse;

/* JADX INFO: renamed from: X.150w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.GameMLBBHeroInferModule$startInference$1", f = "GameMLBBHeroInferModule.kt", l = {128}, m = "invokeSuspend")
public final class C204516150w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C204515150v LLILLJJLI;
    public final /* synthetic */ ByteBuffer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC204502150i LLILZLL;
    public final /* synthetic */ ByteBuffer LLIZ;
    public final /* synthetic */ AnonymousClass1517 LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ AbstractC1273900jFs LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204516150w(C204515150v c204515150v, ByteBuffer byteBuffer, String str, boolean z, InterfaceC204502150i interfaceC204502150i, ByteBuffer byteBuffer2, AnonymousClass1517 anonymousClass1517, long j, AbstractC1273900jFs abstractC1273900jFs, InterfaceC1364105Vn<? super C204516150w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c204515150v;
        this.LLILLL = byteBuffer;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC204502150i;
        this.LLIZ = byteBuffer2;
        this.LLIZLLLIL = anonymousClass1517;
        this.LLJ = j;
        this.LLJI = abstractC1273900jFs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204516150w(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        int iIntValue;
        String string;
        Object objLIZ = obj;
        C1C7U.LIZ("GameMLBBHeroInferModule@7906.startInference$1");
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
            C204515150v c204515150v = this.LLILLJJLI;
            ByteBuffer byteBuffer = this.LLILLL;
            String str = this.LLILZ;
            boolean z = this.LLILZIL;
            this.LL = 1;
            c204515150v.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ILiveGameService iLiveGameService = (ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class);
            C151R c151r = new C151R() { // from class: X.150x
                @Override // X.C151R
                public final void LIZ(C204518150y c204518150y) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    c204518150y.LJ = C204515150v.LJIILL;
                    InterfaceC1364105Vn<C204518150y> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(c204518150y);
                    interfaceC1364105Vn.resumeWith(c204518150y);
                }
            };
            C151B c151b = C151B.MLBB_HERO;
            Room room = c204515150v.LIZ;
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
                C1C7U.LIZIZ("GameMLBBHeroInferModule@7906.startInference$1");
                return objLJFF;
            }
        }
        C204518150y c204518150y = (C204518150y) objLIZ;
        if (c204518150y != null) {
            C204515150v c204515150v2 = this.LLILLJJLI;
            ByteBuffer byteBuffer2 = this.LLIZ;
            ByteBuffer byteBuffer3 = this.LLILLL;
            AnonymousClass1517 anonymousClass1517 = this.LLIZLLLIL;
            String str2 = this.LLILZ;
            c204515150v2.getClass();
            float[] fArr = c204518150y.LIZIZ;
            Map<String, Object> map = C1338270kvh.LIZ;
            anonymousClass1517.LIZIZ();
            if (c204518150y.LIZJ && fArr.length == C204515150v.LJIILJJIL) {
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
                String str3 = c204515150v2.LIZIZ.get(pair.getFirst());
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                int iIntValue2 = ((Number) pair.getFirst()).intValue();
                float fFloatValue = ((Number) pair.getSecond()).floatValue();
                C204519150z c204519150z = anonymousClass1517.LJIIJ;
                c204519150z.LIZ = iIntValue2;
                c204519150z.LIZIZ = str3;
                if (fFloatValue < 0.001d) {
                    fFloatValue = 0.0f;
                }
                c204519150z.LIZJ = fFloatValue;
                float f3 = C204515150v.LJIILL;
                C204515150v.LJIIIZ(anonymousClass1517, f3, true, ((Number) pair.getFirst()).intValue(), str3, ((Number) pair.getSecond()).floatValue());
                Map<String, Object> map2 = C1338270kvh.LIZ;
                if (((Number) pair.getSecond()).floatValue() >= f3) {
                    iIntValue = ((Number) pair.getFirst()).intValue();
                } else {
                    iIntValue = 0;
                }
                String str5 = c204515150v2.LIZIZ.get(Integer.valueOf(iIntValue));
                if (str5 == null) {
                    str5 = "";
                }
                ReportMLBBHeroRequest reportMLBBHeroRequest = new ReportMLBBHeroRequest();
                Room room2 = c204515150v2.LIZ;
                if (room2 != null && (string = Long.valueOf(room2.getId()).toString()) != null) {
                    str4 = string;
                }
                reportMLBBHeroRequest.roomId = str4;
                reportMLBBHeroRequest.heroId = iIntValue;
                reportMLBBHeroRequest.heroName = str5;
                C480460Ism.LIZ().getClass();
                ((GameLiveHighlightApi) C480460Ism.LIZLLL(GameLiveHighlightApi.class)).reportMLBBHeroInfoClientAI(reportMLBBHeroRequest).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0THp
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        Integer numValueOf;
                        C1C7U.LIZ("GameMLBBHeroInferModule@7906.reportMLBBHeroInfoToServer$disposable$1");
                        BaseResponse baseResponse = (BaseResponse) obj2;
                        ReportMLBBHeroResponse.ResponseData responseData = ((ReportMLBBHeroResponse) baseResponse.data).data;
                        String str6 = null;
                        if (responseData != null) {
                            numValueOf = Integer.valueOf(responseData.code);
                        } else {
                            numValueOf = null;
                        }
                        ReportMLBBHeroResponse.ResponseData responseData2 = ((ReportMLBBHeroResponse) baseResponse.data).data;
                        if (responseData2 != null) {
                            str6 = responseData2.message;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reportMLBBHeroInfoToServer. succeeded, code: ");
                        sbLIZ.append(numValueOf);
                        sbLIZ.append(", msg: ");
                        sbLIZ.append(str6);
                        C20441214yg.LJIIIZ("GameMLBBHeroInferModule", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("GameMLBBHeroInferModule@7906.reportMLBBHeroInfoToServer$disposable$1");
                    }
                }, new C09JN() { // from class: X.00Jr
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("GameMLBBHeroInferModule@7906.reportMLBBHeroInfoToServer$disposable$2");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reportMLBBHeroInfoToServer throwable, message=");
                        sbLIZ.append(((Throwable) obj2).getMessage());
                        C20441214yg.LJ("GameMLBBHeroInferModule", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("GameMLBBHeroInferModule@7906.reportMLBBHeroInfoToServer$disposable$2");
                    }
                });
                C151F c151f = c204515150v2.LJ;
                if (c151f != null) {
                    c151f.LIZLLL(anonymousClass1517, c204518150y, C204515150v.LJFF, str2, true);
                }
                byteBuffer3.clear();
                byteBuffer2.clear();
            } else {
                C204515150v.LJIIIZ(anonymousClass1517, C204515150v.LJIILL, false, 0, "", 0.0f);
                C151F c151f2 = c204515150v2.LJ;
                if (c151f2 != null) {
                    c151f2.LIZLLL(anonymousClass1517, c204518150y, C204515150v.LJFF, str2, true);
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
        if (C204515150v.LJI) {
            this.LLILLJJLI.LJI();
        }
        this.LLILLJJLI.LIZLLL = System.currentTimeMillis();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameMLBBHeroInferModule@7906.startInference$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
