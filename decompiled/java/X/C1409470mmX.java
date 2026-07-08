package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS601S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0mmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.inspiration.data.ImageInspirationDataManager$fetchInspirationData$2$generateDataDeferred$1", f = "ImageInspirationDataManager.kt", l = {67}, m = "invokeSuspend")
public final class C1409470mmX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RecommendDescResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1409480mmY LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409470mmX(C1409480mmY c1409480mmY, VideoPublishEditModel videoPublishEditModel, String str, String str2, InterfaceC1364105Vn<? super C1409470mmX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1409480mmY;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409470mmX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$generateDataDeferred$1");
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
            C1411690mq7 c1411690mq7 = (C1411690mq7) this.LLILLJJLI.LIZIZ.getValue();
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            c1411690mq7.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{\"prompt_type\":");
            sbLIZ.append(4);
            sbLIZ.append('}');
            c1411690mq7.LJFF(videoPublishEditModel, str, str2, C2188811AlT.LIZIZ(sbLIZ), EnumC1411760mqE.EDIT, new AwS601S0100000_22(c2252611DEt, 30), new AwS601S0100000_22(c2252611DEt, 31));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$generateDataDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$generateDataDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RecommendDescResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
