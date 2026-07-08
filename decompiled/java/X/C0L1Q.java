package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0L1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMediaChosenHandler$resolveMedia$2$4", f = "TemplateMediaChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C0L1Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C536210L1f LL;
    public final /* synthetic */ List<MediaModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0L1Q(C536210L1f c536210L1f, List<? extends MediaModel> list, InterfaceC1364105Vn<? super C0L1Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c536210L1f;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L1Q(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        CreativeDialogWrapper creativeDialogWrapper;
        C1C7U.LIZ("TemplateMediaChosenHandler@d239.resolveMedia$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C536210L1f c536210L1f = this.LL;
        List<MediaModel> list = this.LLILLJJLI;
        c536210L1f.getClass();
        if (list.isEmpty()) {
            i = c536210L1f.LJIIIIZZ;
        } else if (list.size() == 1) {
            i = 1003;
        } else if (!list.isEmpty()) {
            Iterator<MediaModel> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJIIJ()) {
                    i = 1005;
                    break;
                }
            }
            i = 1004;
        } else {
            i = 1004;
        }
        c536210L1f.LJIIIIZZ = i;
        C536210L1f c536210L1f2 = this.LL;
        Activity activity = c536210L1f2.LJFF.get();
        if (activity != null && !activity.isFinishing() && ((creativeDialogWrapper = c536210L1f2.LJI) == null || !creativeDialogWrapper.isShowing())) {
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            int i2 = c536210L1f2.LJIIIIZZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(true);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
            creativeLoadingDialogBuilder.loadingMessage(activity.getString(R.string.txr));
            creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(c536210L1f2, 112));
            CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, i2, creativeLoadingDialogBuilder);
            c536210L1f2.LJI = creativeDialogWrapper2;
            creativeDialogWrapper2.show();
            c536210L1f2.LJJII(0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateMediaChosenHandler@d239.resolveMedia$2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
