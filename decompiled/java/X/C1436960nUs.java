package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;
import lth.o;

/* JADX INFO: renamed from: X.0nUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436960nUs implements InterfaceC540360LHe {
    public final /* synthetic */ Function1<DraftSaveResult, Unit> LIZ;
    public final /* synthetic */ Function1<AwemeDraft, Unit> LIZIZ;
    public final /* synthetic */ VideoPublishEditModel LIZJ;

    @Override // X.InterfaceC540360LHe
    public final Function1<AwemeDraft, Unit> LIZ() {
        if (C280460Ayy.LIZ()) {
            return new AwS601S0100000_22(this, 635);
        }
        return null;
    }

    @Override // X.InterfaceC540360LHe
    public final void LIZIZ(C540340LHc c540340LHc) {
        if (!C280460Ayy.LIZ()) {
            this.LIZ.invoke(c540340LHc.LIZ);
        }
    }

    @Override // X.InterfaceC540360LHe
    public final void LIZJ(C540340LHc c540340LHc) {
        if (!C280460Ayy.LIZ()) {
            LIZLLL(c540340LHc.LIZIZ);
        }
    }

    public final void LIZLLL(AwemeDraft awemeDraft) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        o.LJJ.LJIIIIZZ().LIZ().LJFF(awemeDraft);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            new C1439160nYQ(c19egLIZIZ, new C1421880n6Y(c19egLIZIZ, this.LIZJ)).LIZ(awemeDraft);
        }
        this.LIZIZ.invoke(awemeDraft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1436960nUs(Function1<? super DraftSaveResult, Unit> function1, Function1<? super AwemeDraft, Unit> function12, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = videoPublishEditModel;
    }
}
