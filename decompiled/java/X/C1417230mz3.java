package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417230mz3 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1417330mzD LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417230mz3(C1417330mzD c1417330mzD, String str, boolean z) {
        super(0);
        this.LL = c1417330mzD;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        s sVar = s.LIZ;
        AutoCutModel autoCutModel = this.LL.Na().creativeModel.autoCutModel;
        List<AutoCutThemeData> list = this.LL.d;
        sVar.getClass();
        this.LL.Td(s.LJIILLIIL(autoCutModel, list), this.LLILLJJLI);
        if (this.LLILLL) {
            C19EG activity = this.LL.getActivity();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829809);
            C1390380mHk.LIZ(activity, 1030, creativeToastBuilder);
        }
        return Unit.LIZ;
    }
}
