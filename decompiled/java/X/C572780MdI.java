package X;

import com.ss.android.ugc.aweme.texttoimage.TemplateEleConfig;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator$fetchEffect$1$2$1", f = "Text2ImageGenerator.kt", l = {699}, m = "invokeSuspend")
public final class C572780MdI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Text2ImageGenerator LLILLJJLI;
    public final /* synthetic */ TemplateEleConfig LLILLL;
    public final /* synthetic */ Text2ImageInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C572780MdI(Text2ImageGenerator text2ImageGenerator, TemplateEleConfig templateEleConfig, Text2ImageInfo text2ImageInfo, InterfaceC1364105Vn<? super C572780MdI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = text2ImageGenerator;
        this.LLILLL = templateEleConfig;
        this.LLILZ = text2ImageInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C572780MdI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("Text2ImageGenerator@4a7d.fetchEffect$1$2$1");
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
            String str = this.LLILLL.url;
            if (str == null) {
                str = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZ.templateIds);
            sbLIZ.append("image_sticker");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LL = 1;
            obj = Text2ImageGenerator.LJ(text2ImageGenerator, str, strLIZIZ, this, 12);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Text2ImageGenerator@4a7d.fetchEffect$1$2$1");
                return objLJFF;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            TemplateEleConfig templateEleConfig = this.LLILLL;
            templateEleConfig.LIZ = str2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("image list: ");
            sbLIZ2.append(templateEleConfig.url);
            sbLIZ2.append(' ');
            sbLIZ2.append(templateEleConfig.url);
            C201955140j.LIZIZ("zhangwanglalaha", C2188811AlT.LIZIZ(sbLIZ2));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("Text2ImageGenerator@4a7d.fetchEffect$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
