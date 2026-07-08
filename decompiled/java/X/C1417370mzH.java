package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417370mzH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1417330mzD LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417370mzH(C1417330mzD c1417330mzD, String str, String str2, String str3, int i) {
        super(0);
        this.LL = c1417330mzD;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.T6();
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_auto_cut_panel_loading_optimize", true, false)) {
            C1417330mzD c1417330mzD = this.LL;
            s sVar = s.LIZ;
            AutoCutModel autoCutModel = c1417330mzD.Na().creativeModel.autoCutModel;
            List<AutoCutThemeData> list = this.LL.d;
            sVar.getClass();
            c1417330mzD.Td(s.LJIILLIIL(autoCutModel, list), this.LLILLJJLI);
        }
        String str = this.LLILLJJLI;
        if (str != null) {
            this.LL.ed(str, this.LLILLL);
        }
        if (this.LLILZ != null) {
            C19EG activity = this.LL.getActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(this.LLILZ);
            C1390380mHk.LIZ(activity, 1030, creativeToastBuilder);
        } else if (this.LLILZIL == 1015) {
            C19EG activity2 = this.LL.getActivity();
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131825365);
            C1390380mHk.LIZ(activity2, 1030, creativeToastBuilder2);
        } else {
            C19EG activity3 = this.LL.getActivity();
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            creativeToastBuilder3.messageRes(2131829809);
            C1390380mHk.LIZ(activity3, 1030, creativeToastBuilder3);
        }
        C1417360mzG c1417360mzG = this.LL.b;
        if (c1417360mzG != null) {
            c1417360mzG.LIZIZ();
        }
        return Unit.LIZ;
    }
}
