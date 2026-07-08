package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SizeChartTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.SizeChartTemplateEditViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0v9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731520v9y extends C09AY implements Function1<C1731550vA1, C1731550vA1> {
    public final /* synthetic */ SizeChartTemplateItem LL;
    public final /* synthetic */ SizeChartTemplateEditViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1731520v9y(SizeChartTemplateItem sizeChartTemplateItem, SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(1);
        this.LL = sizeChartTemplateItem;
        this.LLILLJJLI = sizeChartTemplateEditViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = str8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1731550vA1 invoke(C1731550vA1 c1731550vA1) {
        String str;
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateField templateField = (TemplateField) C13LP.LJJJLZIJ(0, this.LL.fieldList);
        if (templateField == null || (templateFieldData = templateField.fieldData) == null || (templateFieldText = templateFieldData.fieldText) == null || (str = templateFieldText.content) == null) {
            str = "";
        }
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        sizeChartTemplateEditViewModel.getClass();
        boolean zVQ2 = SizeChartTemplateEditViewModel.vQ2(str2, str3);
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel2 = this.LLILLJJLI;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        sizeChartTemplateEditViewModel2.getClass();
        boolean zVQ22 = SizeChartTemplateEditViewModel.vQ2(str4, str5);
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel3 = this.LLILLJJLI;
        String str6 = this.LLIZ;
        String str7 = this.LLIZLLLIL;
        sizeChartTemplateEditViewModel3.getClass();
        boolean zVQ23 = SizeChartTemplateEditViewModel.vQ2(str6, str7);
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel4 = this.LLILLJJLI;
        String str8 = this.LLJ;
        String str9 = this.LLJI;
        sizeChartTemplateEditViewModel4.getClass();
        boolean zVQ24 = SizeChartTemplateEditViewModel.vQ2(str8, str9);
        String str10 = this.LLILLL;
        String str11 = this.LLILZ;
        String str12 = this.LLILZIL;
        String str13 = this.LLILZLL;
        String str14 = this.LLIZ;
        String str15 = this.LLIZLLLIL;
        String str16 = this.LLJ;
        String str17 = this.LLJI;
        c1731550vA1.getClass();
        return C1731550vA1.LIZ(str, str10, str11, str12, str13, str14, str15, str16, str17, zVQ2, zVQ22, zVQ23, zVQ24);
    }
}
