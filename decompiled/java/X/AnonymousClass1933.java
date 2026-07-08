package X;

import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS146S1100000_32;

/* JADX INFO: renamed from: X.1933, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1933 implements IAVPublishExtension.Callback {
    public final /* synthetic */ AnonymousClass1932 LIZ;

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final List<String> getValidHashTagList() {
        return this.LIZ.q3().LIZIZ == null ? C1428470nHB.LJIJI(this.LIZ.T2().getStructList()) : C1428470nHB.LJIJI(C857770Xkt.LIZ(this.LIZ.q3().LJII(false), new ArrayList()));
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final void onReplaceSoundClickFromAnchorPanel() {
        VideoPublishContainerScene videoPublishContainerScene;
        VideoPublishEditModel videoPublishEditModel;
        C19A3 c19a3 = this.LIZ.LL;
        if (!(c19a3 instanceof VideoPublishContainerScene) || (videoPublishContainerScene = (VideoPublishContainerScene) c19a3) == null || (videoPublishEditModel = videoPublishContainerScene.LLLLIILL) == null) {
            return;
        }
        C0M2U.LIZ.getClass();
        C0M2U.LIZ(videoPublishEditModel, "replace_sound", null);
        videoPublishContainerScene.H().lR2(videoPublishContainerScene.f(), videoPublishContainerScene.LLLLIILL.mIsFromDraft, false, false);
    }

    public AnonymousClass1933(AnonymousClass1932 anonymousClass1932) {
        this.LIZ = anonymousClass1932;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final void onGameBCToggleStateUpdate(String str) {
        if (C0A1J.LIZ()) {
            AnonymousClass1932 anonymousClass1932 = this.LIZ;
            C1DRG diContainer = anonymousClass1932.getDiContainer();
            if (C343070Dcf.LIZ()) {
                ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(C905240ZfG.class, new AwS146S1100000_32(anonymousClass1932, str, 4));
                return;
            } else {
                if (((C05YF) diContainer.LJIIL(null, C905240ZfG.class)) == null) {
                    return;
                }
                LIZJ(anonymousClass1932, str);
                return;
            }
        }
        LIZJ(this.LIZ, str);
    }

    public static final void LIZJ(AnonymousClass1932 anonymousClass1932, String str) {
        InterfaceC20507715Ml interfaceC20507715Ml;
        if (anonymousClass1932.Z1().Mm1() != null && (interfaceC20507715Ml = (InterfaceC20507715Ml) C1010170cOV.LIZIZ(InterfaceC20507715Ml.class)) != null) {
            interfaceC20507715Ml.oi1(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final void onECUpdateBO(boolean z, boolean z2) {
        if (C0A1J.LIZ()) {
            AnonymousClass1932 anonymousClass1932 = this.LIZ;
            C1DRG diContainer = anonymousClass1932.getDiContainer();
            if (C343070Dcf.LIZ()) {
                ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(C905240ZfG.class, new C193A(anonymousClass1932, z, z2));
                return;
            } else {
                if (((C05YF) diContainer.LJIIL(null, C905240ZfG.class)) == null) {
                    return;
                }
                LIZIZ(anonymousClass1932, z, z2);
                return;
            }
        }
        LIZIZ(this.LIZ, z, z2);
    }

    public static final void LIZIZ(AnonymousClass1932 anonymousClass1932, boolean z, boolean z2) {
        InterfaceC20507715Ml interfaceC20507715Ml;
        if (anonymousClass1932.Z1().Mm1() != null && (interfaceC20507715Ml = (InterfaceC20507715Ml) C1010170cOV.LIZIZ(InterfaceC20507715Ml.class)) != null) {
            interfaceC20507715Ml.c12(z, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final void onECUpdateBC(boolean z, boolean z2, int i) {
        if (C0A1J.LIZ()) {
            AnonymousClass1932 anonymousClass1932 = this.LIZ;
            C1DRG diContainer = anonymousClass1932.getDiContainer();
            if (C343070Dcf.LIZ()) {
                ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(C905240ZfG.class, new AnonymousClass1939(anonymousClass1932, z, z2, i));
                return;
            } else {
                if (((C05YF) diContainer.LJIIL(null, C905240ZfG.class)) == null) {
                    return;
                }
                LIZ(anonymousClass1932, z, z2, i);
                return;
            }
        }
        LIZ(this.LIZ, z, z2, i);
    }

    public static final void LIZ(AnonymousClass1932 anonymousClass1932, boolean z, boolean z2, int i) {
        InterfaceC20507715Ml interfaceC20507715Ml;
        if (anonymousClass1932.Z1().Mm1() != null && (interfaceC20507715Ml = (InterfaceC20507715Ml) C1010170cOV.LIZIZ(InterfaceC20507715Ml.class)) != null) {
            interfaceC20507715Ml.mg1(i, z, z2);
        }
    }
}
