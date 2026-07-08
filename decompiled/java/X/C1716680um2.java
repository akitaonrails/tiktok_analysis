package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.component.guide.InfoCollectGuideFragment;
import com.ss.android.ugc.aweme.component.guide.InfoCollectGuideModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0um2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.PipoAccountServiceImpl$openInfoCollectGuide$3", f = "PipoAccountServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1716680um2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ InfoCollectGuideModel LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1716680um2(Context context, InfoCollectGuideModel infoCollectGuideModel, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C1716680um2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = infoCollectGuideModel;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1716680um2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager supportFragmentManager;
        C1C7U.LIZ("PipoAccountServiceImpl@ded8.openInfoCollectGuide$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InfoCollectGuideFragment infoCollectGuideFragment = new InfoCollectGuideFragment();
        Bundle bundle = new Bundle();
        InfoCollectGuideModel infoCollectGuideModel = this.LLILLJJLI;
        C259800zU<String> c259800zU = this.LLILLL;
        C259800zU<String> c259800zU2 = this.LLILZ;
        C786410Ut5.LJJJI(Scene.SCENE_SERVICE, infoCollectGuideModel.scene, bundle);
        C786410Ut5.LJJJI("source", infoCollectGuideModel.source, bundle);
        C786410Ut5.LJJJI("merchant_id", infoCollectGuideModel.merchantId, bundle);
        C786410Ut5.LJJJI("merchant_user_id", infoCollectGuideModel.merchantUserId, bundle);
        C786410Ut5.LJJJI("token", infoCollectGuideModel.token, bundle);
        C786410Ut5.LJJJI("host", infoCollectGuideModel.host, bundle);
        C786410Ut5.LJJJI("theme", infoCollectGuideModel.theme, bundle);
        C786410Ut5.LJJIJL(bundle, "guide_content", infoCollectGuideModel);
        C786410Ut5.LJJJI("entrance_type", c259800zU.element, bundle);
        C786410Ut5.LJJJI("session_id", c259800zU2.element, bundle);
        infoCollectGuideFragment.setArguments(bundle);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = infoCollectGuideFragment;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLILLL = false;
            tuxSheet.LLJLLIL = false;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(0);
            DialogInterfaceOnDismissListenerC1716720um6 dialogInterfaceOnDismissListenerC1716720um6 = new DialogInterface.OnDismissListener() { // from class: X.0um6
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (C1716450ulf.LIZ() == 3) {
                        C1716030ukz.LIZ(false);
                    }
                }
            };
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC1716720um6;
            tuxSheet2.show(supportFragmentManager, "");
        } else {
            C1716030ukz.LIZ(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoAccountServiceImpl@ded8.openInfoCollectGuide$3");
        return unit;
    }
}
