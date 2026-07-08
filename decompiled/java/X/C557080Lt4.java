package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.IAVDraftFeedbackService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.KidsDraftVideoFeedFragment;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS194S0000000_8;
import lth.o;

/* JADX INFO: renamed from: X.0Lt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557080Lt4 implements IAVDraftService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(437));

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final ExecutorService draftEntranceShowAndUpdateExecutor() {
        return ((Boolean) C0AT3.LIZ.getValue()).booleanValue() ? (ExecutorService) C741040T5a.LIZIZ.getValue() : C741040T5a.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final boolean enableDraftEntranceShowOpt() {
        return ((Boolean) C0AT3.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final ExecutorService executor() {
        ExecutorService executorService = C741040T5a.LIZ;
        return C741040T5a.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final IAVDraftFeedbackService getFeedbackService() {
        return (IAVDraftFeedbackService) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final boolean enableAddDraftLossMonitor() {
        return C0CHQ.LIZ().LJI().enableAddDraftLossMonitor();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<String> genCreationIdsOfVisibleDraft() {
        return C0CHQ.LIZ().LJI().genCreationIdsOfVisibleDraft();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void deletePostedDraft(AwemeDraft awemeDraft) {
        C0CHQ.LIZ().LJI().LIZIZ().LJ(new C570330MYl(awemeDraft, new C560950LzJ(null, "deleteUnusedPostedDraft", 1), false, null, null, 124), null);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final Fragment genKidDraftDetailFragment(AwemeDraft awemeDraft) {
        o.LJFF(C2216131BoR.LIZ());
        new KidsDraftVideoFeedFragment();
        KidsDraftVideoFeedFragment.LLJJIJI = awemeDraft;
        return new KidsDraftVideoFeedFragment();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final String getSaveDate(AwemeDraft awemeDraft) {
        return C0CHQ.LIZ().LJI().LJIILJJIL().getSaveDate(awemeDraft);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<String> queryAllDraftsCreationIdFromDB(C0M4M c0m4m) {
        return C0CHQ.LIZ().LJI().LJIILJJIL().LIZIZ(c0m4m);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final int queryDraftCount(C0M4M c0m4m) {
        return C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftCount(c0m4m);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<AwemeDraft> queryDraftList(C0M4J c0m4j) {
        return C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(c0m4j);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<C561420M0e> queryDraftMetaList(C0M4J c0m4j) {
        return C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftMetaList(c0m4j);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final C553680Lna queryDraftsInfo(C0M4M c0m4m) {
        return C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftsInfo(c0m4m);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void registerListener(IDraftListener iDraftListener) {
        C0CHQ.LIZ().LJI().LIZ().registerListener(iDraftListener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void reportDraftLostException(List<String> list) {
        C0CHQ.LIZ().LJI().LJIIIIZZ(list);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void saveDraft(IAVDraftService.SaveDraftByPathParam saveDraftByPathParam) {
        C0CHQ.LIZ().LJI().LIZIZ().LIZ(saveDraftByPathParam);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void unregisterListener(IDraftListener iDraftListener) {
        C0CHQ.LIZ().LJI().LIZ().unregisterListener(iDraftListener);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void editPostedDraft(Context context, AwemeDraft awemeDraft) {
        C054G c054gLIZIZ = C2296808zG.LIZIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c054gLIZIZ, C2107308Nj.LIZ.LLIILII(), null, new C535620KzY(this, awemeDraft, context, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void openDraftActivity(Context context, Bundle bundle) {
        if (C0MZJ.LIZIZ().LIZJ && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_draft_disable_enter_when_deleting", true) == 1) {
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DeletingState", "drafts are deleting, ignore openDraftActivity");
        } else {
            C0CHQ.LIZ().LJI().LJIILL().openDraftActivity(context, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final List<AwemeDraft> queryDraftsInfoWithLimited(C0M4M c0m4m, int i) {
        return C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftsInfoWithLimited(c0m4m, i);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final Object queryPostedDraftByAwemeId(String str, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C535080Kyg(str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r10, com.ss.android.ugc.aweme.draft.model.AwemeDraft r11, X.InterfaceC1364105Vn r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.C535630KzZ
            if (r0 == 0) goto L71
            r7 = r12
            X.0KzZ r7 = (X.C535630KzZ) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r6 = 1
            if (r0 == 0) goto L33
            if (r0 != r6) goto L77
            X.0mGW r5 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            java.lang.Boolean.valueOf(r0)
        L2d:
            X.C786410Ut5.LJIIJ(r5)
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.draft.model.AVDraftExtras r0 = r11.LJJJJIZL
            boolean r0 = r0.isUpdateInfoStickers
            if (r0 != 0) goto L3f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3f:
            java.util.List r4 = X.C09XS.LIZ(r11)
            if (r4 != 0) goto L48
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L48:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L30
            X.0mGW r5 = new X.0mGW
            r5.<init>(r10)
            X.C786410Ut5.J4(r5)
            X.19EG r3 = X.C1388190mED.LIZIZ(r10)
            if (r3 == 0) goto L2d
            X.1DFB r2 = X.C0PEM.LIZJ
            X.09XO r1 = new X.09XO
            r0 = 0
            r1.<init>(r3, r4, r0)
            r7.LL = r5
            r7.LLILZ = r6
            java.lang.Object r1 = X.C23250099c.LJI(r7, r2, r1)
            if (r1 != r8) goto L24
            return r8
        L71:
            X.0KzZ r7 = new X.0KzZ
            r7.<init>(r9, r12)
            goto L12
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557080Lt4.LIZ(android.content.Context, com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVDraftService
    public final void loadThumbCover(AwemeDraft awemeDraft, VideoCoverConfig videoCoverConfig, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        C0MZ9.LJIIIIZZ(awemeDraft, videoCoverConfig, onVideoCoverCallback);
    }
}
