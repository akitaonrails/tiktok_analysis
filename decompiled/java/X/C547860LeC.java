package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.common.AIABService;
import com.ss.android.ugc.aweme.aikit.api.common.AIAlertService;
import com.ss.android.ugc.aweme.aikit.api.common.AIConfigService;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCPost;
import com.ss.android.ugc.aweme.aikit.api.common.AIResourceService;
import com.ss.android.ugc.aweme.aikit.api.common.AITaskService;
import com.ss.android.ugc.aweme.aikit.api.common.FeedService;
import com.ss.android.ugc.aweme.aikit.api.common.FileService;
import com.ss.android.ugc.aweme.aikit.api.common.NavigateService;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetDraftDetailResponse;
import com.ss.android.ugc.aweme.aikit.api.common.task.GetTaskInfoResponse;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LeC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547860LeC {
    public static final C547860LeC LIZ = new C547860LeC();

    public static AIABService LIZ() {
        return (AIABService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(AIABService.class, false, false, false, 14, null), "ab", new AIABService() { // from class: X.0LeH
            @Override // com.ss.android.ugc.aweme.aikit.api.common.AIABService
            public final boolean LIZ() {
                return false;
            }
        });
    }

    public static AIConfigService LIZIZ() {
        return (AIConfigService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(AIConfigService.class, false, false, false, 14, null), "config", C547340LdM.LIZ);
    }

    public static AIAlertService LIZJ() {
        return (AIAlertService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(AIAlertService.class, false, false, false, 14, null), "alert", new AIAlertService() { // from class: X.0LeB
            @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
            public final void LIZ(String str) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
            public final void LIZIZ(int i, String str, boolean z) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
            public final void LIZJ(int i, int i2) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
            public final void LIZLLL(AIGCCreationModel aIGCCreationModel) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
            public final void LJ(boolean z) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
            public final void LJFF(Source source, String str, Integer num, String str2, Function0<String> function0) {
            }
        });
    }

    public static FeedService LIZLLL() {
        return (FeedService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(FeedService.class, false, false, false, 14, null), "feed", new FeedService() { // from class: X.0LeD
            @Override // com.ss.android.ugc.aweme.aikit.api.common.FeedService
            public final boolean LIZ(Aweme aweme) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.FeedService
            public final boolean LIZIZ(Aweme aweme) {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.FeedService
            public final boolean LIZJ(Aweme aweme) {
                return true;
            }
        });
    }

    public static FileService LJ() {
        return (FileService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(FileService.class, false, false, false, 14, null), "file", new FileService() { // from class: X.0LN5
            @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
            public final String LIZIZ(C0LN8 c0ln8) {
                return "";
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
            public final File LIZLLL(Source source, CreativeInfo creativeInfo, String str, boolean z) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
            public final String LJ(Source source, CreativeInfo creativeInfo, String str) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
            public final MediaModel LJFF(C0LN8 c0ln8, MediaModel mediaModel, int i) {
                return mediaModel;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
            public final String LJI(Source source, CreativeInfo creativeInfo) {
                return "";
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
            public final C0VSJ LIZJ(C0LN8 c0ln8, String str, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(".aikit_file_service_stub_");
                sbLIZ.append(c0ln8.getTag().hashCode());
                sbLIZ.append('_');
                sbLIZ.append(str2.hashCode());
                sbLIZ.append(".mp4");
                return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.FileService
            public final C05YD LIZ(int i, C0LN8 c0ln8, String str, String str2, String str3) {
                return C1BNE.LIZ(new C0LN3(null, 3, 0));
            }
        });
    }

    public static NavigateService LJFF() {
        return (NavigateService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(NavigateService.class, false, false, false, 14, null), "navigate", new NavigateService() { // from class: X.0LOY
            @Override // com.ss.android.ugc.aweme.aikit.api.common.NavigateService
            public final void LIZ(Context context, AIGCDraft aIGCDraft) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.NavigateService
            public final void LIZIZ(Context context, AIGCPost aIGCPost) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.NavigateService
            public final void LIZJ(Context context, AIGCDraft aIGCDraft) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.NavigateService
            public final void LIZLLL(Context context, AIGCDraft aIGCDraft) {
            }
        });
    }

    public static AIResourceService LJI() {
        return (AIResourceService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(AIResourceService.class, false, false, false, 14, null), "resource", C547370LdP.LIZ);
    }

    public static AITaskService LJII() {
        return (AITaskService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(AITaskService.class, false, false, false, 14, null), "task", new AITaskService() { // from class: X.0LO0
            @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
            public final Object LJFF(String str) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
            public final Object LIZ(String str, InterfaceC1364105Vn<? super GetDraftDetailResponse> interfaceC1364105Vn) {
                return new GetDraftDetailResponse(null, null, null);
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
            public final Object LIZIZ(String str, String str2, InterfaceC1364105Vn<? super GetTaskInfoResponse> interfaceC1364105Vn) {
                return new GetTaskInfoResponse(null, null, null);
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
            public final Object LIZJ(CreativeModel creativeModel, boolean z, InterfaceC1364105Vn<? super C542120LNy> interfaceC1364105Vn) {
                return C542070LNt.LIZ(C547650Ldr.LIZ, -1, "mock");
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
            public final Object LIZLLL(InterfaceC546090LbL interfaceC546090LbL, String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.common.AITaskService
            public final Object LJ(String str, InterfaceC546090LbL interfaceC546090LbL, boolean z, InterfaceC1364105Vn<? super C542120LNy> interfaceC1364105Vn) {
                return C542070LNt.LIZ(interfaceC546090LbL, -1, "mock");
            }
        });
    }
}
