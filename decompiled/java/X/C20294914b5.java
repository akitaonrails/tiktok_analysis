package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.creativepage.CreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS82S1000000_32;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.14b5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService$checkECommerceToggleResult$1$1", f = "ECommerceVideoService.kt", l = {}, m = "invokeSuspend")
public final class C20294914b5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20294914b5(Fragment fragment, InterfaceC1364105Vn<? super C20294914b5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20294914b5(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECommerceVideoService@f5c5.checkECommerceToggleResult$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String string = this.LL.getResources().getString(2131832713);
        String string2 = this.LL.getResources().getString(2131849946);
        String string3 = this.LL.getResources().getString(2131849946, string);
        int iLJJJJI = a0.LJJJJI(string2, "%s", 0, 6);
        int length = string.length() + iLJJJJI;
        SpannableString spannableString = new SpannableString(string3);
        if (iLJJJJI >= 0) {
            final Fragment fragment = this.LL;
            ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.141t
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    AnonymousClass0317 anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin;
                    String name;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        boolean z = false;
                        anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin = CreativePageDependencyService.createICreativePageDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        }
                        String name2 = ICreativePageDependencyService.class.getName();
                        if (anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICreativePageDependencyService.class);
                    }
                    ((ICreativePageDependencyService) anonymousClass0317CreateICreativePageDependencyServicebyMonsterPlugin).openBrandedContentPage(fragment.requireContext());
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    Integer numLIZJ;
                    Context context = fragment.getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                        textPaint.setColor(numLIZJ.intValue());
                    }
                    textPaint.setUnderlineText(false);
                }
            };
            StyleSpan styleSpan = new StyleSpan(1);
            C786410Ut5.p2(spannableString, clickableSpan, iLJJJJI, length, 33);
            C786410Ut5.p2(spannableString, styleSpan, iLJJJJI, length, 33);
        }
        C013C c013c = new C013C();
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL.requireContext());
        c1397580mTM.LJI(this.LL.getResources().getString(2131832714));
        c1397580mTM.LIZIZ(spannableString);
        C985403tE.LIZ(c1397580mTM, new AwS396S0200000_30(this.LL, c013c, 57));
        c1397580mTM.LIZLLL(new AwS609S0100000_30(c013c, 273));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C21271918Mj.LIZ.getClass();
        C1018703yb.LIZLLL("tiktokec_popup_show", new AwS82S1000000_32("video_brand_content_toggle", 11));
        C20295114b7.LIZ().storeBoolean("key_ec_video_bc_tip_show", true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceVideoService@f5c5.checkECommerceToggleResult$1$1");
        return unit;
    }
}
