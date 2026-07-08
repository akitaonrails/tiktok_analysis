package X;

import android.app.Activity;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS132S0101000_26;

/* JADX INFO: renamed from: X.0w45, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766310w45 extends AbstractC1766340w48 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        boolean z;
        String name;
        List<InterfaceC1766320w46> actions = ((InterfaceC1766330w47) xBaseParamModel).getActions();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(actions, 10));
        int i = 0;
        for (InterfaceC1766320w46 interfaceC1766320w46 : actions) {
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC1766320w46 interfaceC1766320w462 = interfaceC1766320w46;
                C1247510iZJ c1247510iZJ = new C1247510iZJ();
                c1247510iZJ.LIZ = interfaceC1766320w462.getText();
                c1247510iZJ.LIZ(new AwS132S0101000_26(i, completionBlock, 0));
                Number variant = interfaceC1766320w462.getVariant();
                if (variant != null) {
                    c1247510iZJ.LIZJ = variant.intValue();
                }
                arrayList.add(c1247510iZJ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJI(arrayList);
        c1390850mIV.LIZ.LLILLJJLI = new DialogInterfaceOnDismissListenerC1775910wJZ(completionBlock, 0);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        Activity topActivity = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getTopActivity();
        if ((topActivity instanceof C19EG) && (c19eg = (C19EG) topActivity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            tuxActionSheetLIZJ.show(supportFragmentManager, "tag");
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
        }
    }
}
