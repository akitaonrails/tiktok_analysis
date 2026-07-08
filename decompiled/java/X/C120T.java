package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.120T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C120T {
    public static InterfaceC1635410sex LIZLLL;
    public final String LIZ = "voiceconversion";
    public CategoryPageModel LIZIZ;
    public static final C01GW<C120T> LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(356));
    public static final C01GW<C194557119v> LJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(355));

    public final void LIZ(final C120V c120v) {
        CategoryPageModel categoryPageModel = this.LIZIZ;
        if (categoryPageModel != null && !C086I.LIZIZ(categoryPageModel.getUrl_prefix())) {
            c120v.LIZ(this.LIZIZ);
            return;
        }
        c120v.LIZJ();
        if (LIZLLL == null) {
            InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
            C0CHQ.LIZ().initDownloadableModel();
            LIZLLL = interfaceC1635410sexLIZ;
        }
        InterfaceC1635410sex interfaceC1635410sex = LIZLLL;
        if (interfaceC1635410sex != null) {
            interfaceC1635410sex.tg(0, new IFetchCategoryEffectListener() { // from class: X.120U
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    int errorCode;
                    String msg;
                    C120V c120v2 = c120v;
                    if (c120v2 != null) {
                        if (exceptionResult != null) {
                            errorCode = exceptionResult.getErrorCode();
                            msg = exceptionResult.getMsg();
                            if (msg == null) {
                            }
                            c120v2.LIZIZ(errorCode, msg);
                        }
                        errorCode = 0;
                        msg = "";
                        c120v2.LIZIZ(errorCode, msg);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel2) {
                    CategoryPageModel categoryPageModel3 = categoryPageModel2;
                    this.LIZ.LIZIZ = categoryPageModel3;
                    C120V c120v2 = c120v;
                    if (c120v2 != null) {
                        c120v2.LIZ(categoryPageModel3);
                    }
                }
            }, this.LIZ, "all", false);
        }
    }
}
