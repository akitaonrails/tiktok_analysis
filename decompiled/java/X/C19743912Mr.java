package X;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS553S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.12Mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment$dismiss$1", f = "LongPressAwemeFragment.kt", l = {924}, m = "invokeSuspend")
public final class C19743912Mr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LongPressAwemeFragment LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19743912Mr(LongPressAwemeFragment longPressAwemeFragment, Intent intent, InterfaceC1364105Vn<? super C19743912Mr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = longPressAwemeFragment;
        this.LLILLL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19743912Mr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_longpress_LongPressAwemeFragment$dismiss$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float fWidth;
        float fHeight;
        int i;
        int width;
        float fWidth2;
        float fExactCenterX;
        float fExactCenterY;
        float fHeight2;
        float f;
        char c;
        float f2;
        char c2;
        ViewGroup.LayoutParams layoutParams;
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_longpress_LongPressAwemeFragment$dismiss$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        C1C7U.LIZ("LongPressAwemeFragment@a3a.dismiss$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LongPressAwemeFragment longPressAwemeFragment = this.LLILLJJLI;
            if (longPressAwemeFragment.LLIZLLLIL != null) {
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                Rect rect = longPressAwemeFragment.LLJLILLLLZIIL;
                if (rect != null) {
                    fWidth = rect.width();
                } else {
                    fWidth = 0.0f;
                }
                Rect rect2 = longPressAwemeFragment.LLJLILLLLZIIL;
                if (rect2 != null) {
                    fHeight = rect2.height();
                } else {
                    fHeight = 0.0f;
                }
                LinearLayout linearLayout = longPressAwemeFragment.LLIZLLLIL;
                if (linearLayout != null) {
                    linearLayout.setPivotX(fWidth / 2.0f);
                }
                LinearLayout linearLayout2 = longPressAwemeFragment.LLIZLLLIL;
                if (linearLayout2 != null) {
                    linearLayout2.setPivotY(fHeight / 2.0f);
                }
                ViewGroup viewGroup = longPressAwemeFragment.LLJILLL;
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                    i = layoutParams.width;
                } else {
                    i = 0;
                }
                Integer numLJ = C2286608xc.LJ(i);
                if (numLJ.intValue() > 0) {
                    width = numLJ.intValue();
                } else {
                    ViewGroup viewGroup2 = longPressAwemeFragment.LLJILLL;
                    if (viewGroup2 != null) {
                        width = viewGroup2.getWidth();
                    } else {
                        width = 0;
                    }
                }
                ViewGroup viewGroup3 = longPressAwemeFragment.LLJILLL;
                if (viewGroup3 != null) {
                    viewGroup3.setPivotX(width / 2.0f);
                }
                ViewGroup viewGroup4 = longPressAwemeFragment.LLJILLL;
                if (viewGroup4 != null) {
                    viewGroup4.setPivotY(0.0f);
                }
                C19745412Ng.LIZ.getClass();
                C1776900wLA c1776900wLALIZ = C19745412Ng.LIZ(0.45f, 0.0f, 0.55f, 250L);
                C1776900wLA c1776900wLALIZ2 = C19745412Ng.LIZ(0.45f, 0.0f, 0.55f, 100L);
                ViewGroup viewGroup5 = longPressAwemeFragment.LLIZ;
                if (viewGroup5 != null) {
                    Integer numVR = LongPressAwemeFragment.VR(0.95f, viewGroup5.getContext());
                    Integer numVR2 = LongPressAwemeFragment.VR(0.0f, viewGroup5.getContext());
                    if (numVR != null && numVR2 != null) {
                        C19745412Ng.LJIIIZ(viewGroup5, c1776900wLALIZ, C19745412Ng.LIZJ(numVR.intValue(), numVR2.intValue(), viewGroup5));
                    }
                }
                if (longPressAwemeFragment.LLJLILLLLZIIL != null) {
                    fWidth2 = longPressAwemeFragment.LLJJIJIIJIL.width() / r1.width();
                } else {
                    fWidth2 = 0.0f;
                }
                float fCenterX = longPressAwemeFragment.LLJJIJIIJIL.centerX();
                Rect rect3 = longPressAwemeFragment.LLJLILLLLZIIL;
                if (rect3 != null) {
                    fExactCenterX = rect3.exactCenterX();
                } else {
                    fExactCenterX = 0.0f;
                }
                float f3 = fCenterX - fExactCenterX;
                float fCenterY = longPressAwemeFragment.LLJJIJIIJIL.centerY();
                Rect rect4 = longPressAwemeFragment.LLJLILLLLZIIL;
                if (rect4 != null) {
                    fExactCenterY = rect4.exactCenterY();
                } else {
                    fExactCenterY = 0.0f;
                }
                float f4 = fCenterY - fExactCenterY;
                Rect rect5 = longPressAwemeFragment.LLJLILLLLZIIL;
                if (rect5 != null) {
                    fHeight2 = rect5.height();
                } else {
                    fHeight2 = 0.0f;
                }
                float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(36)));
                float fCenterY2 = longPressAwemeFragment.LLJJIJIIJIL.centerY() + (((fHeight2 / 2.0f) + fLIZIZ) * fWidth2);
                Rect rect6 = longPressAwemeFragment.LLJLILLLLZIIL;
                if (rect6 != null) {
                    f = rect6.top;
                } else {
                    f = 0.0f;
                }
                float f5 = fCenterY2 - ((f + fHeight2) + fLIZIZ);
                LinearLayout linearLayout3 = longPressAwemeFragment.LLIZLLLIL;
                if (linearLayout3 != null) {
                    c = 4;
                    f2 = 1.0f;
                    C19745412Ng.LJIIIIZZ(linearLayout3, c1776900wLALIZ, 0L, AFwS218S0000000_29.get$arr$(386), new AwS553S0100000_9(c2252611DEt, 1750), C19745412Ng.LJFF(0.0f, f3), C19745412Ng.LJI(0.0f, f4), C19745412Ng.LIZLLL(1.0f, fWidth2), C19745412Ng.LJ(1.0f, fWidth2));
                    C786410Ut5.W4(linearLayout3, 1.0f);
                } else {
                    c = 4;
                    f2 = 1.0f;
                }
                FrameLayout frameLayout = longPressAwemeFragment.LLJILJIL;
                if (frameLayout != null) {
                    c2 = 0;
                    C19745412Ng.LJIIIZ(frameLayout, c1776900wLALIZ, C19745412Ng.LIZIZ(f2, 0.0f));
                } else {
                    c2 = 0;
                }
                ViewGroup viewGroup6 = longPressAwemeFragment.LLJILLL;
                if (viewGroup6 != null) {
                    C19746412Nq[] c19746412NqArr = new C19746412Nq[5];
                    c19746412NqArr[c2] = C19745412Ng.LIZIZ(f2, 0.0f);
                    c19746412NqArr[1] = C19745412Ng.LJFF(0.0f, f3);
                    c19746412NqArr[2] = C19745412Ng.LJI(0.0f, f5);
                    c19746412NqArr[3] = C19745412Ng.LIZLLL(f2, fWidth2);
                    c19746412NqArr[c] = C19745412Ng.LJ(f2, fWidth2);
                    C19745412Ng.LJIIIZ(viewGroup6, c1776900wLALIZ, c19746412NqArr);
                }
                ImageView imageView = longPressAwemeFragment.LLJJI;
                if (imageView != null) {
                    C786410Ut5.V4(imageView, 0.0f);
                }
                FrameLayout frameLayout2 = longPressAwemeFragment.LLJ;
                if (frameLayout2 != null) {
                    C19746412Nq[] c19746412NqArr2 = new C19746412Nq[1];
                    c19746412NqArr2[c2] = C19745412Ng.LIZIZ(f2, 0.0f);
                    C19745412Ng.LJIIIIZZ(frameLayout2, c1776900wLALIZ2, 150L, AFwS218S0000000_29.get$arr$(335), AFwS218S0000000_29.get$arr$(336), (C19746412Nq[]) Arrays.copyOf(c19746412NqArr2, 1));
                }
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ != C099R.LJFF()) {
                    objLJIJ = Unit.LIZ;
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("LongPressAwemeFragment@a3a.dismiss$1");
                    return objLJFF;
                }
            }
        }
        Intent intent = this.LLILLL;
        if (intent != null && (bundleINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_longpress_LongPressAwemeFragment$dismiss$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_longpress_LongPressAwemeFragment$dismiss$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent)) != null) {
            FragmentManager parentFragmentManager = this.LLILLJJLI.getParentFragmentManager();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIIJZLJL(bundle, bundleINVOKEVIRTUAL_com_ss_android_ugc_profile_business_ur_longpress_LongPressAwemeFragment$dismiss$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
            parentFragmentManager.LLIIIILZ(bundle, "LongPressAweme_requestKey");
        }
        if (this.LLILLJJLI.isAdded() && !this.LLILLJJLI.isDetached()) {
            C19EH c19ehLJIIJ = this.LLILLJJLI.getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(this.LLILLJJLI);
            c19ehLJIIJ.LJIIJ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LongPressAwemeFragment@a3a.dismiss$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LongPressAwemeFragment@a3a.dismiss$1");
        return unit2;
    }
}
