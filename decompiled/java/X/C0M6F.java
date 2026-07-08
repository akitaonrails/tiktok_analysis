package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0M6F, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public interface C0M6F {
    InterfaceC557100Lt6 LIZ();

    InterfaceC545580LaW LIZIZ();

    InterfaceC570320MYk LIZJ();

    void LIZLLL(VideoPublishEditModel videoPublishEditModel);

    void LJ();

    void LJFF(VideoPublishEditModel videoPublishEditModel, String str);

    String LJI();

    Object LJII(VideoPublishEditModel videoPublishEditModel, AwemeDraft awemeDraft, String str, String str2, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn);

    void LJIIIIZZ(List<String> list);

    void LJIIIZ(ShortVideoContext shortVideoContext, String str);

    void LJIIJ(boolean z);

    boolean LJIIJJI();

    String LJIIL();

    boolean LJIILIIL();

    InterfaceC557110Lt7 LJIILJJIL();

    InterfaceC557090Lt5 LJIILL();

    void LJIILLIIL(String str);

    boolean LJIIZILJ();

    void LJIJ(boolean z);

    void LJIJI(C0M88 c0m88);

    C0M6G LJIJJ();

    boolean LJIJJLI();

    void LJIL(VideoPublishEditModel videoPublishEditModel, String str, String str2);

    void LJJ(Activity activity, AwemeDraft awemeDraft, int i, OnStartEditDraftListener onStartEditDraftListener);

    boolean enableAddDraftLossMonitor();

    List<String> genCreationIdsOfVisibleDraft();
}
