package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.io.File;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS40S0100100_2;
import njp.a;

/* JADX INFO: renamed from: X.09pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoModeTemplateChosenResultImpl$startUseTemplate$1$decodeTask$1", f = "PhotoModeTemplateChosenResultImpl.kt", l = {151}, m = "invokeSuspend")
public final class C2489609pG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends ArrayList<MediaModel>, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ C0L1E LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;
    public final /* synthetic */ ArrayList<MediaModel> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2489609pG(C0L1E c0l1e, ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, InterfaceC1364105Vn<? super C2489609pG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l1e;
        this.LLILLL = shortVideoContext;
        this.LLILZ = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2489609pG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$decodeTask$1");
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
            C0L1E c0l1e = this.LLILLJJLI;
            ShortVideoContext shortVideoContext = this.LLILLL;
            ArrayList<MediaModel> arrayList = this.LLILZ;
            this.LL = 1;
            c0l1e.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C2488709p7 c2488709p7 = C2488709p7.LIZ;
            File fileLIZJ = C2489809pI.LIZJ(shortVideoContext.creativeInfo);
            C2489809pI.LIZ(shortVideoContext.creativeInfo);
            AwS40S0100100_2 awS40S0100100_2 = new AwS40S0100100_2(c23260099m, jCurrentTimeMillis, 1);
            c2488709p7.getClass();
            C2488709p7.LJIIIZ(fileLIZJ, null, arrayList, awS40S0100100_2);
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$decodeTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$decodeTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends ArrayList<MediaModel>, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
