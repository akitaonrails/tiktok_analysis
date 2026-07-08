package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0drA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.AiImagineAnchorMaker$videoPlayWithAnchor$1", f = "AiImagineAnchorMaker.kt", l = {93}, m = "invokeSuspend")
public final class C1066380drA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1397440mT8 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1066380drA(C1397440mT8 c1397440mT8, InterfaceC1364105Vn<? super C1066380drA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1397440mT8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1066380drA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String extra;
        C1C7U.LIZ("AiImagineAnchorMaker@7276.videoPlayWithAnchor$1");
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
            this.LLILLJJLI.getClass();
            InterfaceC1397450mT9 interfaceC1397450mT9LJJIJIIJI = C1397440mT8.LJJIJIIJI();
            if (interfaceC1397450mT9LJJIJIIJI != null) {
                String aid = this.LLILLJJLI.LJIIZILJ().getAid();
                AnchorCommonStruct anchorCommonStruct = this.LLILLJJLI.LLIZ;
                if (anchorCommonStruct != null) {
                    extra = anchorCommonStruct.getExtra();
                } else {
                    extra = null;
                }
                this.LL = 1;
                if (interfaceC1397450mT9LJJIJIIJI.LJIIIZ(aid, extra, this) == objLJFF) {
                    C1C7U.LIZIZ("AiImagineAnchorMaker@7276.videoPlayWithAnchor$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiImagineAnchorMaker@7276.videoPlayWithAnchor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
