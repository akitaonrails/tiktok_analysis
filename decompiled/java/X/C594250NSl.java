package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.anchor.manager.ECShortVideoPermissionManager;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPublishPermission;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPublishPermissionResponse;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.manager.ECShortVideoPermissionManager$fetchAnchorPublishPermission$1", f = "ECShortVideoPermissionManager.kt", l = {118}, m = "invokeSuspend")
public final class C594250NSl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C594250NSl(InterfaceC1364105Vn<? super C594250NSl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C594250NSl c594250NSl = new C594250NSl(interfaceC1364105Vn);
        c594250NSl.LLILLJJLI = obj;
        return c594250NSl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECShortVideoPermissionManager@ff2d.fetchAnchorPublishPermission$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C594260NSm c594260NSm = new C594260NSm(null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c594260NSm);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ECShortVideoPermissionManager@ff2d.fetchAnchorPublishPermission$1");
                    return objLJFF;
                }
            }
            AnchorPublishPermissionResponse anchorPublishPermissionResponse = (AnchorPublishPermissionResponse) obj;
            if (anchorPublishPermissionResponse.status_code == 0) {
                ECShortVideoPermissionManager eCShortVideoPermissionManager = ECShortVideoPermissionManager.LIZ;
                ECShortVideoPermissionManager.LJFF = anchorPublishPermissionResponse.photoModeAnchorPermission;
                ECShortVideoPermissionManager.LJI = anchorPublishPermissionResponse.videoAnchorPermission;
                ECShortVideoPermissionManager.LIZ.getClass();
                String strLJ = ECShortVideoPermissionManager.LJ();
                if (strLJ != null) {
                    AnchorPublishPermission anchorPublishPermission = ECShortVideoPermissionManager.LJFF;
                    if (anchorPublishPermission == null) {
                        anchorPublishPermission = ECShortVideoPermissionManager.LIZLLL;
                    }
                    AnchorPublishPermission anchorPublishPermission2 = ECShortVideoPermissionManager.LJI;
                    if (anchorPublishPermission2 == null) {
                        anchorPublishPermission2 = ECShortVideoPermissionManager.LJ;
                    }
                    ((Keva) ECShortVideoPermissionManager.LIZIZ.getValue()).storeString(strLJ, GsonProtectorUtils.toJson((Gson) ECShortVideoPermissionManager.LIZJ.getValue(), new ECShortVideoPermissionManager.PermissionCacheWrapper(anchorPublishPermission, anchorPublishPermission2)));
                }
                IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                if (iEventCenter != null) {
                    iEventCenter.LIZ("ec_anchor_settings_updated", "{}");
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECShortVideoPermissionManager@ff2d.fetchAnchorPublishPermission$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
