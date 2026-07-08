package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem$triggerSAStatusRefreshIfNeeded$1", f = "QuickEmojiPanelAssem.kt", l = {717}, m = "invokeSuspend")
public final class C1350605Qi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1350605Qi(InterfaceC1364105Vn<? super C1350605Qi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1350605Qi(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickEmojiPanelAssem@177a.triggerSAStatusRefreshIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarCreationStatusService.class, false, false, false, 14, null);
            if (iSocialAvatarCreationStatusService != null) {
                String strLIZIZ = C461720I8s.LIZIZ();
                this.LL = 1;
                if (iSocialAvatarCreationStatusService.LIZIZ(strLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("QuickEmojiPanelAssem@177a.triggerSAStatusRefreshIfNeeded$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickEmojiPanelAssem@177a.triggerSAStatusRefreshIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1350605Qi(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
