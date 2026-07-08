package X;

import com.ss.android.ugc.tools.chat.extract.cell.AiChatMultiImagesCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0lOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.extract.cell.AiChatMultiImagesCell$loadImage$1$onComplete$1", f = "AiChatMultiImagesCell.kt", l = {118}, m = "invokeSuspend")
public final class C1356240lOg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AiChatMultiImagesCell LLILLJJLI;
    public final /* synthetic */ C1158270gFN LLILLL;
    public final /* synthetic */ C428600GrK LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356240lOg(AiChatMultiImagesCell aiChatMultiImagesCell, C1158270gFN c1158270gFN, C428600GrK c428600GrK, InterfaceC1364105Vn<? super C1356240lOg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aiChatMultiImagesCell;
        this.LLILLL = c1158270gFN;
        this.LLILZ = c428600GrK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1356240lOg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C1C7U.LIZ("AiChatMultiImagesCell@8a7b.loadImage$1$onComplete$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1354700lMC interfaceC1354700lMC = (InterfaceC1354700lMC) this.LLILLJJLI.LL.getValue();
            if (interfaceC1354700lMC == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AiChatMultiImagesCell@8a7b.loadImage$1$onComplete$1");
                return unit;
            }
            String str = this.LLILLL.LLILLJJLI;
            if (str == null || str.length() == 0) {
                String strLIZ = interfaceC1354700lMC.LIZ(this.LLILLL.LL, ".png");
                String parent = new C0VSJ(strLIZ).getParent();
                if (parent != null && u.LJJIIJZLJL(this.LLILLL.LL, parent, false)) {
                    C1158270gFN c1158270gFN = this.LLILLL;
                    c1158270gFN.LLILLJJLI = c1158270gFN.LL;
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("AiChatMultiImagesCell@8a7b.loadImage$1$onComplete$1");
                    return unit2;
                }
                C428600GrK c428600GrK = this.LLILZ;
                if (c428600GrK != null) {
                    i = c428600GrK.LIZ;
                    i2 = c428600GrK.LIZIZ;
                } else {
                    i = 0;
                    i2 = 0;
                }
                C558560LvS c558560LvS = new C558560LvS(this.LLILLL.LL, strLIZ, i, i2);
                this.LL = 1;
                obj = interfaceC1354700lMC.LIZLLL(c558560LvS, "vp_choose_frame", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AiChatMultiImagesCell@8a7b.loadImage$1$onComplete$1");
                    return objLJFF;
                }
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("AiChatMultiImagesCell@8a7b.loadImage$1$onComplete$1");
            return unit3;
        }
        String str2 = ((C07YI) obj).LIZ;
        if (str2.length() > 0) {
            this.LLILLL.LLILLJJLI = str2;
        }
        Unit unit32 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatMultiImagesCell@8a7b.loadImage$1$onComplete$1");
        return unit32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
