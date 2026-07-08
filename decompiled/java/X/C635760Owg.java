package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubmitSubscribeResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeCategoryLabels;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeGuide;
import com.ss.android.ugc.aweme.notification.SubscribePanelFragment;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Owg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.utils.SubscribeHelper$buildSubscribePanel$f$1$1$1", f = "SubscribeHelper.kt", l = {262}, m = "invokeSuspend")
public final class C635760Owg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ FragmentManager LLILZIL;
    public final /* synthetic */ SubscribePanelFragment LLILZLL;
    public final /* synthetic */ List<SubscribeCategoryLabels> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C635760Owg(C118300cf c118300cf, int i, C19EG c19eg, FragmentManager fragmentManager, SubscribePanelFragment subscribePanelFragment, List<SubscribeCategoryLabels> list, InterfaceC1364105Vn<? super C635760Owg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c118300cf;
        this.LLILLL = i;
        this.LLILZ = c19eg;
        this.LLILZIL = fragmentManager;
        this.LLILZLL = subscribePanelFragment;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C635760Owg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        TuxImageModel tuxImageModel;
        int iIntValue;
        Object objLJI = obj;
        C1C7U.LIZ("SubscribeHelper@2963.buildSubscribePanel$f$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C635750Owf c635750Owf = new C635750Owf(this.LLILLL, this.LLIZ, this.LLILZLL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c635750Owf);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("SubscribeHelper@2963.buildSubscribePanel$f$1$1$1");
                return objLJFF;
            }
        }
        SubmitSubscribeResponse submitSubscribeResponse = (SubmitSubscribeResponse) objLJI;
        if (submitSubscribeResponse != null) {
            this.LLILLJJLI.element = 1;
            C635700Owa c635700Owa = C635700Owa.LIZ;
            int i2 = this.LLILLL;
            c635700Owa.getClass();
            C635700Owa.LIZJ(i2);
            int i3 = ((Keva) C635700Owa.LIZIZ.getValue()).getInt("show_times", 0);
            if (i3 < 1 && submitSubscribeResponse.getSubscribeGuide() != null) {
                C19EG c19eg = this.LLILZ;
                SubscribeGuide subscribeGuide = submitSubscribeResponse.getSubscribeGuide();
                if (subscribeGuide != null) {
                    tuxImageModel = subscribeGuide.tuxImageUrl;
                } else {
                    tuxImageModel = null;
                }
                C1391960mKI c1391960mKI = new C1391960mKI();
                c1391960mKI.LJII = c19eg.getString(2131849508);
                View viewSd = C786410Ut5.Sd(R.layout.a_k, C786410Ut5.ne(c19eg), null);
                View viewFindViewById = viewSd.findViewById(R.id.b7n);
                TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.wi6);
                if (tuxImageModel != null && tuxIconView != null) {
                    C0OSB.LJFF(tuxIconView, tuxImageModel, null);
                }
                if (viewFindViewById != null) {
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    int[] iArr = new int[2];
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1c, c19eg);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    iArr[0] = iIntValue;
                    iArr[1] = 0;
                    GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
                    gradientDrawable.setGradientType(0);
                    viewFindViewById.setBackground(gradientDrawable);
                }
                View viewFindViewById2 = viewSd.findViewById(R.id.b7p);
                try {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1f);
                    c384050F3z.LIZJ = Float.valueOf(c19eg.getResources().getDimensionPixelOffset(R.dimen.sb));
                    Drawable drawableLIZ = c384050F3z.LIZ(c19eg);
                    C19659111vp c19659111vp = new C19659111vp();
                    c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
                    c19659111vp.LIZLLL = C418440Gaw.LIZIZ(8);
                    c19659111vp.LJ = Integer.valueOf(R.attr.ox);
                    c19659111vp.LIZ = c19eg.getResources().getDimensionPixelOffset(R.dimen.sb);
                    viewFindViewById2.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(c19eg)));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c1391960mKI.LJFF = viewSd;
                c1391960mKI.LJI = 2;
                c1391960mKI.LJIIIIZZ = c19eg.getString(2131849507);
                c1391960mKI.LIZIZ(c19eg.getString(2131849506), null);
                c1391960mKI.LIZ().LIZ.show(this.LLILZIL, "SubscribeGuidePanel");
                C635700Owa.LIZ.getClass();
                ((Keva) C635700Owa.LIZIZ.getValue()).storeInt("show_times", i3 + 1);
            }
        } else {
            this.LLILLJJLI.element = 10003;
        }
        C438590HHt.LIZ(this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscribeHelper@2963.buildSubscribePanel$f$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
