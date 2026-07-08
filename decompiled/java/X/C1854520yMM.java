package X;

import com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.router.model.TakoTemplateInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854520yMM extends C09AY implements Function1<C1854530yMN, C1854530yMN> {
    public final /* synthetic */ TakoInputSkillLabelViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TakoTemplateInfo LLILLL;
    public final /* synthetic */ EnumC1854550yMP LLILZ;
    public final /* synthetic */ C1854540yMO LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1854520yMM(TakoInputSkillLabelViewModel takoInputSkillLabelViewModel, String str, TakoTemplateInfo takoTemplateInfo, EnumC1854550yMP enumC1854550yMP, C1854540yMO c1854540yMO, Integer num, String str2) {
        super(1);
        this.LL = takoInputSkillLabelViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = takoTemplateInfo;
        this.LLILZ = enumC1854550yMP;
        this.LLILZIL = c1854540yMO;
        this.LLILZLL = num;
        this.LLIZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1854530yMN invoke(C1854530yMN c1854530yMN) {
        ConvertStyleItem convertStyleItem;
        TakoStandardRatio next;
        EnumC1854550yMP enumC1854550yMP = c1854530yMN.LL.LIZ;
        EnumC1854550yMP enumC1854550yMP2 = EnumC1854550yMP.NONE;
        long jCurrentTimeMillis = 0;
        if (enumC1854550yMP != enumC1854550yMP2) {
            TakoInputSkillLabelViewModel takoInputSkillLabelViewModel = this.LL;
            if (takoInputSkillLabelViewModel.LLILZ > 0) {
                takoInputSkillLabelViewModel.GQ2();
            }
        }
        TakoInputSkillLabelViewModel takoInputSkillLabelViewModel2 = this.LL;
        takoInputSkillLabelViewModel2.LLILLL = this.LLILLJJLI;
        takoInputSkillLabelViewModel2.LLILZIL = this.LLILLL;
        if (this.LLILZ != enumC1854550yMP2) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        takoInputSkillLabelViewModel2.LLILZ = jCurrentTimeMillis;
        C1854540yMO c1854540yMO = this.LLILZIL;
        List<TakoStandardRatio> list = c1854540yMO.LJI;
        Integer num = this.LLILZLL;
        Iterator<TakoStandardRatio> it2 = list.iterator();
        while (true) {
            convertStyleItem = null;
            if (it2.hasNext()) {
                next = it2.next();
                int i = next.stdSize;
                if (num != null && i == num.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TakoStandardRatio takoStandardRatio = next;
        List<ConvertStyleItem> list2 = this.LLILZIL.LJFF;
        String str = this.LLIZ;
        Iterator<ConvertStyleItem> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ConvertStyleItem next2 = it3.next();
            if (Intrinsics.LJFF(next2.nameStarling, str)) {
                convertStyleItem = next2;
                break;
            }
        }
        return new C1854530yMN(c1854540yMO, takoStandardRatio, convertStyleItem);
    }
}
