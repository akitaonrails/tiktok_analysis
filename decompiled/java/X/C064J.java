package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult;
import com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.064J, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C064J extends C09AY implements Function1<RequestCelebrationMaterialResult, Unit> {
    public final /* synthetic */ OpenCelebrationCreateAction LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064J(OpenCelebrationCreateAction openCelebrationCreateAction, Context context, int i, String str, String str2, String str3, String str4, String str5, String str6) {
        super(1);
        this.LL = openCelebrationCreateAction;
        this.LLILLJJLI = context;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RequestCelebrationMaterialResult requestCelebrationMaterialResult) {
        String str;
        RequestCelebrationMaterialResult requestCelebrationMaterialResult2 = requestCelebrationMaterialResult;
        int resultCode = requestCelebrationMaterialResult2.getResultCode();
        if (resultCode == -1) {
            this.LL.LIZJ(2131829440);
        } else if (resultCode == -7) {
            OpenCelebrationCreateAction openCelebrationCreateAction = this.LL;
            Context context = this.LLILLJJLI;
            Map<String, String> landingSchema = requestCelebrationMaterialResult2.getLandingSchema();
            if (landingSchema != null) {
                str = landingSchema.get(String.valueOf(this.LLILLL));
            } else {
                str = null;
            }
            openCelebrationCreateAction.getClass();
            if (str != null && str.length() != 0) {
                SmartRouter.buildRoute(context, str).open();
            } else {
                openCelebrationCreateAction.LIZJ(2131833833);
            }
        } else if (resultCode == -8) {
            this.LL.LIZJ(2131848937);
        } else if (!((ICelebrationCreateService) ServiceManager.get().getService(ICelebrationCreateService.class)).checkMaterialReady(this.LLILLL, true)) {
            this.LL.LIZJ(2131829440);
        } else {
            OpenCelebrationCreateAction openCelebrationCreateAction2 = this.LL;
            Context context2 = this.LLILLJJLI;
            int i = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            String str4 = this.LLILZLL;
            String str5 = this.LLIZ;
            String str6 = this.LLIZLLLIL;
            String str7 = this.LLJ;
            openCelebrationCreateAction2.getClass();
            OpenCelebrationCreateAction.LIZIZ(i, context2, str2, str3, str4, str5, str6, str7);
        }
        return Unit.LIZ;
    }
}
