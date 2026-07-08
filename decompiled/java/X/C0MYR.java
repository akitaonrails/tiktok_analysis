package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.music.IMusicBridgeService;
import com.ss.android.ugc.aweme.tools.draft.music.DraftOnlineMusicProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.DraftStreamMusicProcessor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MYR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYR {
    public static final C0MYR LIZ = new C0MYR();

    public static boolean LIZIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) {
            return true;
        }
        return false;
    }

    public static final InterfaceC561510M0n LIZ(C19EG c19eg, AwemeDraft awemeDraft, Function2 function2, Function0 function0) {
        IMusicBridgeService iMusicBridgeService = (IMusicBridgeService) PluggableExtentionKt.pluggableSpi$default(IMusicBridgeService.class, false, false, false, 14, null);
        if (iMusicBridgeService != null) {
            iMusicBridgeService.setEnableCloudContentUnderstandingABSwitch(true);
        }
        AVMusic aVMusic = awemeDraft.LJ;
        if (aVMusic == null) {
            return new InterfaceC561510M0n() { // from class: X.0MYS
                @Override // X.InterfaceC561510M0n
                public final void LIZ() {
                    C201955140j.LJ("ExceptionDraftMusicProcessor , musicModel is null");
                }
            };
        }
        new C578060Mlo(awemeDraft).LIZ();
        if (aVMusic.isLocalMusic()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("draft_music_process, to shoot local music processor path - ");
            sbLIZ.append(aVMusic.path);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return new C0MYT(awemeDraft, new C411001im(function0, function2));
        }
        if (C298210BmV.LIZ()) {
            C0MYR c0myr = LIZ;
            String str = aVMusic.path;
            c0myr.getClass();
            if (LIZIZ(str)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("draft_music_process, to shoot stream music processor path - ");
                sbLIZ2.append(aVMusic.path);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                DraftStreamMusicProcessor draftStreamMusicProcessor = new DraftStreamMusicProcessor(awemeDraft, new C411201io(function0, function2));
                if (c19eg == null) {
                    return draftStreamMusicProcessor;
                }
                C571760Mbe.LIZ(c19eg, draftStreamMusicProcessor);
                return draftStreamMusicProcessor;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("draft_music_process, to shoot online music processor path - ");
        sbLIZ3.append(aVMusic.path);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        DraftOnlineMusicProcessor draftOnlineMusicProcessor = new DraftOnlineMusicProcessor(awemeDraft, new C411101in(function0, function2));
        if (c19eg == null) {
            return draftOnlineMusicProcessor;
        }
        C571760Mbe.LIZ(c19eg, draftOnlineMusicProcessor);
        return draftOnlineMusicProcessor;
    }
}
