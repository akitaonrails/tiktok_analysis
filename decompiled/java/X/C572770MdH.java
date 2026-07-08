package X;

import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator$fetchEffect$1$1", f = "Text2ImageGenerator.kt", l = {688}, m = "invokeSuspend")
public final class C572770MdH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Text2ImageGenerator LLILLJJLI;
    public final /* synthetic */ Text2ImageInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C572770MdH(Text2ImageGenerator text2ImageGenerator, Text2ImageInfo text2ImageInfo, InterfaceC1364105Vn<? super C572770MdH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = text2ImageGenerator;
        this.LLILLL = text2ImageInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C572770MdH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("Text2ImageGenerator@4a7d.fetchEffect$1$1");
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
            Text2ImageGenerator text2ImageGenerator = this.LLILLJJLI;
            Text2ImageInfo text2ImageInfo = this.LLILLL;
            String str = text2ImageInfo.url;
            if (str == null) {
                str = "";
            }
            String strValueOf = String.valueOf(text2ImageInfo.templateIds);
            this.LL = 1;
            obj = Text2ImageGenerator.LJ(text2ImageGenerator, str, strValueOf, this, 12);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Text2ImageGenerator@4a7d.fetchEffect$1$1");
                return objLJFF;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            Text2ImageInfo text2ImageInfo2 = this.LLILLL;
            text2ImageInfo2.LIZ = str2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("image list: ");
            sbLIZ.append(text2ImageInfo2.url);
            sbLIZ.append(' ');
            sbLIZ.append(text2ImageInfo2.LIZ);
            C201955140j.LIZIZ("zhangwanglalaha", C2188811AlT.LIZIZ(sbLIZ));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("Text2ImageGenerator@4a7d.fetchEffect$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
