package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.08mS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.SimplifyPermissionFirstAuthorizationUIPanelSceneV2$loadContinueIconAnimation$1", f = "SimplifyPermissionFirstAuthorizationUIPanelSceneV2.kt", l = {}, m = "invokeSuspend")
public final class C2217408mS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1662830tNB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2217408mS(C1662830tNB c1662830tNB, InterfaceC1364105Vn<? super C2217408mS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1662830tNB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2217408mS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.loadContinueIconAnimation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context sceneContext = this.LL.getSceneContext();
        if (sceneContext != null) {
            try {
                InputStream inputStreamOpenRawResource = sceneContext.getResources().openRawResource(R.raw.tux_lottie_common_creation_camerapermission_btn);
                int iAvailable = inputStreamOpenRawResource.available();
                byte[] bArr = new byte[iAvailable];
                inputStreamOpenRawResource.read(bArr, 0, iAvailable);
                String str = new String(bArr, Charsets.UTF_8);
                if (str.length() != 0) {
                    InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL.LLLLZLLLI.getValue();
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C2230808oc(this.LL, str, null), 2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.loadContinueIconAnimation$1");
                    return unit;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SimplifyPermissionFirstAuthorizationUIPanelSceneV2@c0c9.loadContinueIconAnimation$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
