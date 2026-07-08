package X;

import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$getAllFeatureExtraction$3$2$1", f = "MixEditingFeatureExtractionService.kt", l = {290}, m = "invokeSuspend")
public final class C2261408tY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends FeatureExtraction, ? extends Integer>>, Object> {
    public int LL;
    public final /* synthetic */ MixEditingFeatureExtractionService LLILLJJLI;
    public final /* synthetic */ C2262608tk LLILLL;
    public final /* synthetic */ Set<String> LLILZ;
    public final /* synthetic */ C2263508tt LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261408tY(MixEditingFeatureExtractionService mixEditingFeatureExtractionService, C2262608tk c2262608tk, Set<String> set, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2261408tY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixEditingFeatureExtractionService;
        this.LLILLL = c2262608tk;
        this.LLILZ = set;
        this.LLILZIL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2261408tY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("MixEditingFeatureExtractionService@fa48.getAllFeatureExtraction$3$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            MixEditingFeatureExtractionService mixEditingFeatureExtractionService = this.LLILLJJLI;
            C2262608tk c2262608tk = this.LLILLL;
            C2277408w8 c2277408w8LJIIZILJ = mixEditingFeatureExtractionService.LJIIZILJ(c2262608tk.LIZ, c2262608tk.LJ);
            if (c2277408w8LJIIZILJ == null) {
                c2277408w8LJIIZILJ = new C2277408w8(this.LLILLL);
                C2262608tk c2262608tk2 = this.LLILLL;
                MixEditingFeatureExtractionService mixEditingFeatureExtractionService2 = this.LLILLJJLI;
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("new task ");
                sbLIZ.append(c2262608tk2);
                C201955140j.LIZLLL(c1398350mUb, "msg-log", C2188811AlT.LIZIZ(sbLIZ));
                mixEditingFeatureExtractionService2.LIZ.put(c2262608tk2.LIZ, c2277408w8LJIIZILJ);
            }
            C2262608tk c2262608tk3 = c2277408w8LJIIZILJ.LIZ;
            C2262608tk c2262608tk4 = this.LLILLL;
            c2262608tk3.LJFF = c2262608tk4.LJFF;
            String str = c2262608tk4.LIZ;
            Set<String> set = this.LLILZ;
            InterfaceC1337805Lk interfaceC1337805Lk = (InterfaceC1337805Lk) this.LLILLJJLI.LJ.getValue();
            InterfaceC1337805Lk interfaceC1337805Lk2 = (InterfaceC1337805Lk) this.LLILLJJLI.LJFF.getValue();
            C2263508tt c2263508tt = this.LLILZIL;
            this.LL = 1;
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start feature extraction,path: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", algorithms: ");
            sbLIZ2.append(set);
            C201955140j.LIZLLL(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ2));
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C2262008te(set, c2277408w8LJIIZILJ, c2263508tt, interfaceC1337805Lk, interfaceC1337805Lk2, new C118300cf(), str, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.getAllFeatureExtraction$3$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.getAllFeatureExtraction$3$2$1");
        return objLJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends FeatureExtraction, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
