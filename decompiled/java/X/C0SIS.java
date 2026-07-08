package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIS extends C09AY implements Function1<C0SJL<C719000SIg>, Iterable<? extends C0SJL<C719000SIg>>> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SIS(C21415018rM c21415018rM, String str) {
        super(1);
        this.LL = c21415018rM;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterable<? extends C0SJL<C719000SIg>> invoke(C0SJL<C719000SIg> c0sjl) {
        ICommerceChallengeService iCommerceChallengeService;
        UrlModel urlModelLJIIL;
        C0SJL<C719000SIg> c0sjl2 = c0sjl;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c0sjl2);
        C719000SIg c719000SIg = c0sjl2.LLIZ;
        if (c719000SIg != null && c719000SIg.LIZ()) {
            TextExtraStruct textExtraStruct = c719000SIg.LIZ;
            if (textExtraStruct.getType() == 1 && (urlModelLJIIL = (iCommerceChallengeService = (ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIL(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false)) != null) {
                View view = this.LL;
                String str = this.LLILLJJLI;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
                ColorDrawable colorDrawable = new ColorDrawable(0);
                colorDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
                C0HD2 c0hd2 = new C0HD2(colorDrawable, iLIZIZ, urlModelLJIIL, view);
                C0SJM c0sjm = new C0SJM(0, 0, "[emoji]");
                c0sjm.LLIZLLLIL.add(c0hd2);
                listLJIILJJIL.add(c0sjm);
                iCommerceChallengeService.LJIIIZ(str, textExtraStruct.getHashTagName());
            }
        }
        return listLJIILJJIL;
    }
}
