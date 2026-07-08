package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0myu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417140myu extends C09AY implements Function1<C0233005v, Unit> {
    public final /* synthetic */ AutoCutThemeData LL;
    public final /* synthetic */ List<AutoCutMediaModel> LLILLJJLI;
    public final /* synthetic */ C1417330mzD LLILLL;
    public final /* synthetic */ C0MJ9 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ NLEModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417140myu(AutoCutThemeData autoCutThemeData, List<AutoCutMediaModel> list, C1417330mzD c1417330mzD, C0MJ9 c0mj9, int i, NLEModel nLEModel) {
        super(1);
        this.LL = autoCutThemeData;
        this.LLILLJJLI = list;
        this.LLILLL = c1417330mzD;
        this.LLILZ = c0mj9;
        this.LLILZIL = i;
        this.LLILZLL = nLEModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0233005v c0233005v) {
        boolean z;
        long j = c0233005v.LIZIZ;
        String str = this.LL.musicId;
        List<AutoCutMediaModel> list = this.LLILLJJLI;
        String str2 = this.LLILLL.Na().mShootWay;
        String creationId = this.LLILLL.Na().getCreationId();
        String strLJJIIJ = s.LJJIIJ(this.LLILLL.Na().creativeModel.autoCutModel, this.LLILZ, Integer.valueOf(this.LLILZIL));
        AutoCutThemeData autoCutThemeData = this.LL;
        int i = autoCutThemeData.templateType;
        String str3 = autoCutThemeData.templateData;
        if (str3 != null && str3.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C1417710mzp.LJIILL("ai_consume", j, str, null, list, "video_edit_page", str2, creationId, strLJJIIJ, i, z, C0FPT.LIZ(this.LLILZLL));
        return Unit.LIZ;
    }
}
