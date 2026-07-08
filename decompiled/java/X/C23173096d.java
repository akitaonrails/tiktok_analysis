package X;

import android.content.Context;
import com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.096d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.TemplateMediaServiceImpl$compressMedias$compressJob$1$compressImgTask$1", f = "TemplateMediaServiceImpl.kt", l = {81}, m = "invokeSuspend")
public final class C23173096d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ TemplateMediaServiceImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ List<C23179096j> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23173096d(TemplateMediaServiceImpl templateMediaServiceImpl, Context context, List<C23179096j> list, InterfaceC1364105Vn<? super C23173096d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = templateMediaServiceImpl;
        this.LLILLL = context;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23173096d(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("TemplateMediaServiceImpl@c2fb.compressMedias$compressJob$1$compressImgTask$1");
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
            TemplateMediaServiceImpl templateMediaServiceImpl = this.LLILLJJLI;
            Context context = this.LLILLL;
            List<C23179096j> list = this.LLILZ;
            this.LL = 1;
            templateMediaServiceImpl.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateMediaService#compressImages: imgList = ");
            sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS231S0000000_3.get$arr$(162), 31));
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            for (C23179096j c23179096j : list) {
                if (!C23181096l.LIZ() || !Intrinsics.LJFF(c23179096j.LIZ, c23179096j.LIZIZ)) {
                    templateMediaServiceImpl.LIZIZ(context, c23179096j.LIZ, c23179096j.LIZIZ, C096Y.IMAGE, new C096W(0));
                }
            }
            Pair pair = new Pair(true, C2286608xc.LJFF(System.currentTimeMillis() - jCurrentTimeMillis));
            C189200o6.m2constructorimpl(pair);
            c23260099m.resumeWith(pair);
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("TemplateMediaServiceImpl@c2fb.compressMedias$compressJob$1$compressImgTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TemplateMediaServiceImpl@c2fb.compressMedias$compressJob$1$compressImgTask$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
