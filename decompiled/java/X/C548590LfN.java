package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AICrtInfo;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS306S0000000_22;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0LfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548590LfN {
    public static final C548590LfN LIZ = new C548590LfN();

    public static DraftService LIZ() {
        return (DraftService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(DraftService.class, false, false, false, 14, null), "draft", new DraftService<Object, Object>() { // from class: X.0Lbs
            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final void LIZ(Context context, VideoPublishEditModel videoPublishEditModel) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final boolean LIZLLL(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final boolean LJFF(Object obj) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final boolean LJI(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final Object LJII(InterfaceC546090LbL interfaceC546090LbL, String str, C0LOJ c0loj, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final boolean LJIIIIZZ(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final void LJIIIZ(CreativeModel creativeModel) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final boolean LJIIJ(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final boolean LJIILIIL(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final void LJIILJJIL(CreativeModel creativeModel, Map<String, String> map) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final Object LIZIZ(CreativeModel creativeModel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final Object LIZJ(AwemeDraft awemeDraft, InterfaceC1364105Vn interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final Object LJ(C09JC c09jc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final Object LJIIL(C546410Lbr c546410Lbr, AbstractC23140094w abstractC23140094w) {
                return Unit.LIZ;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService
            public final InterfaceC546480Lby LJIIJJI(C0LOK c0lok, AwS409S0200000_8 awS409S0200000_8, AwS409S0200000_8 awS409S0200000_82, AwS587S0100000_8 awS587S0100000_8, AwS622S0100000_8 awS622S0100000_8, AwS622S0100000_8 awS622S0100000_82, AwS587S0100000_8 awS587S0100000_82, C546560Lc6 c546560Lc6) {
                return new InterfaceC546480Lby<Object>() { // from class: X.0Lbz
                    @Override // X.InterfaceC546480Lby
                    public final Object LIZ(Object obj, AbstractC23140094w abstractC23140094w) {
                        return Unit.LIZ;
                    }
                };
            }
        });
    }

    public static EditService LIZIZ() {
        return (EditService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(EditService.class, false, false, false, 14, null), "edit", new EditService<Object, Object, Object>() { // from class: X.0LfM
            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final void LIZ(AwemeDraft awemeDraft, NLEEditor nLEEditor, List list) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final boolean LIZLLL(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final boolean LJ(CreativeModel creativeModel) {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final void LJFF(CreativeModel creativeModel, int i, String str) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final boolean LJI(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final boolean LJII(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final boolean LJIIIIZZ(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final boolean LJIIIZ(CreativeModel creativeModel) {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final boolean LJIIJ(CreativeModel creativeModel) {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final Integer LIZIZ(CreativeModel creativeModel) {
                return 2;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService
            public final Map<String, String> LIZJ(CreativeModel creativeModel) {
                return C2097608Jq.LJ();
            }
        });
    }

    public static MobService LIZJ() {
        return (MobService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(MobService.class, false, false, false, 14, null), "mob", new MobService() { // from class: X.0LfO
            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LIZ(CreativeModel creativeModel, C0LAB c0lab) {
                return c0lab;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final String LIZIZ(CreativeModel creativeModel) {
                return "";
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LIZJ(CreativeModel creativeModel, C1403560md0 c1403560md0) {
                return c1403560md0;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LIZLLL(CreativeModel creativeModel, C1403560md0 c1403560md0) {
                return c1403560md0;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LJ(CreativeModel creativeModel, C1403560md0 c1403560md0) {
                return c1403560md0;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LJI(CreativeModel creativeModel, C0LAB c0lab) {
                return c0lab;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final void LJII(C2344009Gk c2344009Gk, Aweme aweme) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LJIIIIZZ(CreativeModel creativeModel, C1403560md0 c1403560md0) {
                return c1403560md0;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LJIIIZ(CreativeModel creativeModel, C0LAB c0lab) {
                return c0lab;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final void LJIIJ(CreativeModel creativeModel, C0LAB c0lab) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LJIIJJI(CreativeModel creativeModel, C0LAB c0lab) {
                return c0lab;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LJIIL(CreativeModel creativeModel, C0LAB c0lab) {
                return c0lab;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final C0LAB LJIILIIL(CreativeModel creativeModel, C0LAB c0lab) {
                return c0lab;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService
            public final List<String> LJFF(CreativeModel creativeModel) {
                return C13BV.INSTANCE;
            }
        });
    }

    public static PublishService LIZLLL() {
        return (PublishService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(PublishService.class, false, false, false, 14, null), "publish", new PublishService() { // from class: X.0LeN
            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final boolean LIZ(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final void LIZJ(CreativeModel creativeModel) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final void LIZLLL(CreativeModel creativeModel, int i) {
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final boolean LJ(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final List<AICrtInfo> LJI(CreativeModel creativeModel) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final boolean LJII(Aweme aweme) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final List<InputBlock> LJIIL(CreativeModel creativeModel) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final boolean LJIILIIL(CreativeModel creativeModel) {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final boolean LJIILJJIL(CreativeModel creativeModel) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final List<C547950LeL> LIZIZ(List<String> list) {
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final List<String> LJFF(CreativeModel creativeModel) {
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final List<String> LJIIIZ(CreativeModel creativeModel) {
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final List<String> LJIIJ(Aweme aweme) {
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final Map<String, String> LJIIJJI(CreativeModel creativeModel) {
                return C2097608Jq.LJ();
            }

            @Override // com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService
            public final List LJIIIIZZ(CreativeModel creativeModel, AFwS306S0000000_22 aFwS306S0000000_22) {
                return C13BV.INSTANCE;
            }
        });
    }
}
