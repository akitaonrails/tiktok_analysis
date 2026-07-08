package X;

import com.ss.android.ugc.aweme.ecommerce.image.EcomImageXConfigModel;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceImageModel;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0kdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326870kdJ extends C09AY implements InterfaceC1631630sYr<String, Boolean, String, C1326860kdI, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EcomResourceImageModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326870kdJ(String str, String str2, EcomResourceImageModel ecomResourceImageModel, int i, List<String> list, Boolean bool) {
        super(4);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = ecomResourceImageModel;
        this.LLILZ = i;
        this.LLILZIL = list;
        this.LLILZLL = bool;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, Boolean bool, String str2, C1326860kdI c1326860kdI) {
        String str3;
        EcomImageXConfigModel ecomImageXConfigModel;
        String str4 = str;
        boolean zBooleanValue = bool.booleanValue();
        String str5 = str2;
        C1326860kdI c1326860kdI2 = c1326860kdI;
        EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
        String str6 = this.LL;
        String str7 = this.LLILLJJLI;
        String str8 = this.LLILLL.path;
        String value = EnumC1988107qZ.IMAGE.getValue();
        Integer numValueOf = Integer.valueOf(this.LLILZ);
        Integer numValueOf2 = Integer.valueOf(this.LLILZIL.size());
        Boolean bool2 = this.LLILZLL;
        String str9 = null;
        if (c1326860kdI2 != null) {
            str3 = c1326860kdI2.LIZ;
        } else {
            str3 = null;
        }
        if (c1326860kdI2 != null && (ecomImageXConfigModel = c1326860kdI2.LIZIZ) != null) {
            str9 = ecomImageXConfigModel.width;
        }
        ecomResourceBystander.getClass();
        EcomResourceBystander.LJIJJ(str6, zBooleanValue, str7, str5, str8, value, numValueOf, numValueOf2, str4, bool2, str3, str9);
        return Unit.LIZ;
    }
}
