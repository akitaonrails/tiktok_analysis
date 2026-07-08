package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356890Dyx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C356830Dyr LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C356890Dyx(C356830Dyr c356830Dyr, String str, Function1<? super String, Unit> function1, String str2, int i) {
        super(0);
        this.LL = c356830Dyr;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
        this.LLILZ = str2;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        DialogC1390150mHN dialogC1390150mHNLJIIJ = this.LL.LJIIJ();
        if (dialogC1390150mHNLJIIJ != null) {
            dialogC1390150mHNLJIIJ.dismiss();
            C785410UrT.LIZ(dialogC1390150mHNLJIIJ);
        }
        String str = this.LLILLJJLI;
        if (str != null) {
            int i = this.LLILZIL;
            C356830Dyr c356830Dyr = this.LL;
            if (i == -10005) {
                C19EG c19eg = c356830Dyr.LIZLLL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(str);
                creativeToastBuilder.isTuxToast(true);
                C1390380mHk.LIZ(c19eg, 5012, creativeToastBuilder);
            } else {
                C19EG c19eg2 = c356830Dyr.LIZLLL;
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131833305);
                creativeToastBuilder2.isTuxToast(true);
                C1390380mHk.LIZ(c19eg2, 5012, creativeToastBuilder2);
            }
        }
        Function1<String, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(this.LLILZ);
        }
        return Unit.LIZ;
    }
}
