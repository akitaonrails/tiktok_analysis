package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0L6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537700L6y extends C09AY implements Function1<VideoPublishEditModel, Unit> {
    public final /* synthetic */ CreativeLoadingDialog LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537700L6y(CreativeDialogWrapper creativeDialogWrapper, int i, Context context, Function1 function1, long j) {
        super(1);
        this.LL = creativeDialogWrapper;
        this.LLILLJJLI = i;
        this.LLILLL = context;
        this.LLILZ = function1;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VideoPublishEditModel videoPublishEditModel) {
        CreativeLoadingDialog creativeLoadingDialog = this.LL;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        C537710L6z c537710L6z = C537710L6z.LIZ;
        int i = this.LLILLJJLI;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLL);
        c537710L6z.getClass();
        C537710L6z.LIZLLL(i, c19egLIZIZ);
        Function1<Boolean, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveDraftWithNewCreationId success，from=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", duration=");
        sbLIZ.append(System.currentTimeMillis() - this.LLILZIL);
        C201955140j.LJIIIIZZ(c0l76, "AILiveDraftHelper", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
