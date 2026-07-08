package X;

import android.os.SystemClock;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03oA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C954003oA {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC954103oB interfaceC954103oB, Function0<Unit> function0) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        IAccountDependencyService iAccountDependencyService = (IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (!iAccountDependencyService.isLogin()) {
            AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) interfaceC954103oB;
            abstractC738140SxQ.getClass();
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                iAccountDependencyService.showLoginAndRegisterView(c19egLIZ, null, new AwS580S0100000_1(function0, (Function0<Unit>) 1122), null);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(InterfaceC954103oB interfaceC954103oB, TuxTextView tuxTextView, LinkRichText linkRichText) {
        if (linkRichText != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView);
            SkuPanelBaseAssem skuPanelBaseAssem = (SkuPanelBaseAssem) interfaceC954103oB;
            tuxTextView.setText(RichTextUtil.LJ(RichTextUtil.LIZ, skuPanelBaseAssem.hp(), linkRichText, null, 0, false, null, null, null, null, false, false, null, null, null, 16380));
            tuxTextView.setTextColor(linkRichText.LIZIZ(skuPanelBaseAssem.hp()));
            return;
        }
        C786410Ut5.LJLLLLLL(8, tuxTextView);
    }
}
