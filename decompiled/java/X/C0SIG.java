package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIG extends C09AY implements Function1<C0SIR, C0SIR> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SIG(Aweme aweme, int i, Context context, float f, String str, Integer num) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = i;
        this.LLILLL = context;
        this.LLILZ = f;
        this.LLILZIL = str;
        this.LLILZLL = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SIR invoke(C0SIR c0sir) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        String aid;
        C0SIR c0sir2 = c0sir;
        if (c0sir2.LIZJ == C0SIK.HASHTAG) {
            List<Object> list = c0sir2.LIZIZ;
            int i = this.LLILLJJLI;
            for (Object obj : list) {
                if (obj instanceof C0HD1) {
                    ((C0HD1) obj).LL = i;
                }
            }
            Object obj2 = c0sir2.LIZLLL;
            if (obj2 instanceof TextExtraStruct) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) obj2;
                String str = c0sir2.LIZ;
                if (str.length() != 0 && ((textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && str.charAt(0) == '@')) || C11VF.LIZIZ.LJ(textExtraStruct))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    List<Object> list2 = c0sir2.LIZIZ;
                    Context context = this.LLILLL;
                    float f = this.LLILZ;
                    String str2 = this.LLILZIL;
                    Aweme aweme = this.LL;
                    Integer num = this.LLILZLL;
                    list2.clear();
                    list2.add(new C0HD1(0.0f, 0, textExtraStruct));
                    ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
                    if (iCommercePromoteService != null) {
                        iCommercePromoteService.LJJI(aweme);
                    }
                    list2.add(C0SIM.LIZJ(context, f, textExtraStruct, str2, num));
                }
                if (textExtraStruct.getType() == 1 && textExtraStruct.getSubtype() == 15) {
                    List<Object> list3 = c0sir2.LIZIZ;
                    Context context2 = this.LLILLL;
                    Integer num2 = this.LLILZLL;
                    list3.clear();
                    list3.add(new C0HD1(0.0f, 0, textExtraStruct));
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = R.attr.eh;
                    }
                    Integer numLIZJ = C1308910kAL.LIZJ(iIntValue, context2);
                    if (numLIZJ != null) {
                        iIntValue2 = numLIZJ.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    list3.add(new ForegroundColorSpan(iIntValue2));
                    C0SIZ c0siz = C0SIZ.LIZ;
                    Aweme aweme2 = this.LL;
                    if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                        aid = "";
                    }
                    c0siz.getClass();
                    C0SIZ.LIZ(textExtraStruct, aid);
                }
            }
        }
        return c0sir2;
    }
}
