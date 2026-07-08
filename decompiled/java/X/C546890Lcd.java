package X;

import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService;
import com.ss.android.ugc.aweme.aikit.api.create.CreateState;
import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.mention.MentionCheckResult;
import com.ss.android.ugc.aweme.creative.model.mention.MentionResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Lcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546890Lcd {
    public static final C546890Lcd LIZ = new C546890Lcd();

    public static AICreateService LIZ() {
        return (AICreateService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(AICreateService.class, false, false, false, 14, null), "create", new AICreateService() { // from class: X.0Lcc
            @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
            public final String iw(C546750LcP c546750LcP) {
                return "";
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
            public final Object jw(String str, AIGCCreationModel aIGCCreationModel, C0LUH c0luh) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
            public final Object kw(String str, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
            public final Object lw(String str, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends CreateState>> interfaceC1364105Vn) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
            public final void mw(C539960LFq c539960LFq, AITheaterCreationModel aITheaterCreationModel) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
            public final void nw(String str, AIGCCreationModel aIGCCreationModel) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.AICreateService
            public final void z1(String str) {
            }
        });
    }

    public static AIQuotaService LIZIZ() {
        return (AIQuotaService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(AIQuotaService.class, false, false, false, 14, null), "quota", C547570Ldj.LIZ);
    }

    public static MentionService LIZJ() {
        return (MentionService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(MentionService.class, false, false, false, 14, null), "mention", new MentionService() { // from class: X.0LNo
            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final Object LIZ(List<MentionDataItem> list, InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn) {
                return list;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final boolean LIZIZ(String str) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final Object LIZJ(List<String> list, InterfaceC1364105Vn<? super MentionCheckResult> interfaceC1364105Vn) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final Object LJ(InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final Object LJII(List<String> list, List<Long> list2, Boolean bool, InterfaceC1364105Vn<? super List<MentionDataItem>> interfaceC1364105Vn) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final Object LJIIIIZZ(InterfaceC1364105Vn<? super MentionResponse> interfaceC1364105Vn) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final Object LJI(InterfaceC1364105Vn interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final Object LIZLLL(int i, int i2, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
                return new Pair(null, false);
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.create.MentionService
            public final Object LJFF(int i, String str, String str2, String str3, AbstractC23140094w abstractC23140094w, boolean z) {
                return new C443120HZe(null, false, "");
            }
        });
    }
}
