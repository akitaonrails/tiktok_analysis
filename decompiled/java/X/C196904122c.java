package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import kotlin.Pair;

/* JADX INFO: renamed from: X.122c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196904122c implements C124A {
    public final /* synthetic */ C196902122a LIZ;

    @Override // X.C124A
    public final void dismiss() {
        this.LIZ.LIZJ().u2().LJIIJ(new Pair<>(Boolean.TRUE, Boolean.FALSE));
        this.LIZ.LIZJ().ab1();
        C196902122a c196902122a = this.LIZ;
        C860670XpZ c860670XpZ = c196902122a.LLJJJJ;
        VideoPublishEditModelKt videoPublishEditModelKt = (VideoPublishEditModelKt) c196902122a.LLJILLL.getValue(c196902122a, C196902122a.LLJZ[0]);
        c860670XpZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModelKt.getCreationId());
        c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
        if (videoPublishEditModelKt.getDraftId() != 0) {
            c0lab.LIZ(videoPublishEditModelKt.getDraftId(), "draft_id");
        }
        C20684815ws.LJIILLIIL("text_complete", c0lab.LIZ);
    }

    @Override // X.C124A
    public final void show() {
        C560530Lyd<Pair<Boolean, Boolean>> c560530LydU2 = this.LIZ.LIZJ().u2();
        Boolean bool = Boolean.FALSE;
        c560530LydU2.LJIIJ(new Pair<>(bool, bool));
        this.LIZ.getClass();
        C196902122a c196902122a = this.LIZ;
        C860670XpZ c860670XpZ = c196902122a.LLJJJJ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c196902122a.LLJILLL.getValue(c196902122a, C196902122a.LLJZ[0]);
        c860670XpZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0lab);
        if (videoPublishEditModel.getDraftId() != 0) {
            c0lab.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        C20684815ws.LJIILLIIL("click_text_entrance", c0lab.LIZ);
    }

    public C196904122c(C196902122a c196902122a) {
        this.LIZ = c196902122a;
    }
}
