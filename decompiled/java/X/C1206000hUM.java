package X;

import Y.ALAdapterS0S0500000_2;
import Y.AUListenerS1S0400001_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.StoreMixAddCartEvent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206000hUM {
    public static Object LIZJ(View view, StoreMixAddCartEvent storeMixAddCartEvent, int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        float fFloatValue7;
        float fFloatValue8;
        float fFloatValue9;
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(757);
        if (storeMixAddCartEvent.startPoint == null) {
            return Unit.LIZ;
        }
        if (storeMixAddCartEvent.endPoint == null) {
            return Unit.LIZ;
        }
        if (storeMixAddCartEvent.coverImage == null) {
            return Unit.LIZ;
        }
        final SmartImageView smartImageView = new SmartImageView(view.getContext());
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        String str = storeMixAddCartEvent.coverImage;
        EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.SHOP_ADD_TO_MINI_CART;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LJFF = C1326790kdB.LJFF(str, enumC1769850w9n);
        C1331750klB c1331750klB = new C1331750klB();
        C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
        Integer numLJ = C2286608xc.LJ(100);
        c1546210qL5.getClass();
        c1331750klB.LJ = C1546210qL5.LIZ(numLJ);
        c1331670kl3LJFF.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJFF.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJFF);
        Float f = storeMixAddCartEvent.width;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        int iLIZ = ((int) C0H9H.LIZ(fFloatValue)) / 2;
        Float f2 = storeMixAddCartEvent.width;
        if (f2 != null) {
            fFloatValue2 = f2.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        int iLIZ2 = (int) C0H9H.LIZ(fFloatValue2);
        Float f3 = storeMixAddCartEvent.height;
        if (f3 != null) {
            fFloatValue3 = f3.floatValue();
        } else {
            fFloatValue3 = 0.0f;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZ2, (int) C0H9H.LIZ(fFloatValue3));
        Float f4 = storeMixAddCartEvent.top;
        if (f4 != null) {
            fFloatValue4 = f4.floatValue();
        } else {
            fFloatValue4 = 0.0f;
        }
        layoutParams.topMargin = ((int) C0H9H.LIZ(fFloatValue4)) + i;
        Float f5 = storeMixAddCartEvent.left;
        if (f5 != null) {
            fFloatValue5 = f5.floatValue();
        } else {
            fFloatValue5 = 0.0f;
        }
        layoutParams.leftMargin = (int) C0H9H.LIZ(fFloatValue5);
        ((ViewGroup) view).addView(smartImageView, layoutParams);
        Float f6 = storeMixAddCartEvent.endPoint.x;
        if (f6 != null) {
            fFloatValue6 = f6.floatValue();
        } else {
            fFloatValue6 = 0.0f;
        }
        float fLIZ = C0H9H.LIZ(fFloatValue6);
        Float f7 = storeMixAddCartEvent.left;
        if (f7 != null) {
            fFloatValue7 = f7.floatValue();
        } else {
            fFloatValue7 = 0.0f;
        }
        float f8 = iLIZ;
        float fLIZ2 = fLIZ - (C0H9H.LIZ(fFloatValue7) + f8);
        Float f9 = storeMixAddCartEvent.endPoint.y;
        if (f9 != null) {
            fFloatValue8 = f9.floatValue();
        } else {
            fFloatValue8 = 0.0f;
        }
        float fLIZ3 = C0H9H.LIZ(fFloatValue8);
        Float f10 = storeMixAddCartEvent.top;
        if (f10 != null) {
            fFloatValue9 = f10.floatValue();
        } else {
            fFloatValue9 = 0.0f;
        }
        float fLIZ4 = fLIZ3 - ((C0H9H.LIZ(fFloatValue9) + i) + f8);
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(0.0f, fLIZ4 / 2, fLIZ2, fLIZ4);
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.6f, 0.2f));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smartImageView, "scaleX", 1.0f, 0.5f);
        objectAnimatorOfFloat.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(smartImageView, "scaleY", 1.0f, 0.5f);
        objectAnimatorOfFloat2.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(smartImageView, "scaleX", 0.5f, 0.05f);
        objectAnimatorOfFloat3.setDuration(800L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(smartImageView, "scaleY", 0.5f, 0.05f);
        objectAnimatorOfFloat4.setDuration(800L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(valueAnimatorOfFloat).after(objectAnimatorOfFloat);
        animatorSet.start();
        final CoroutineContext context = interfaceC1364105Vn.getContext();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0HKs
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (!C23118094a.LJIIIIZZ(context)) {
                    valueAnimatorOfFloat.cancel();
                    return;
                }
                float[] fArr = new float[2];
                pathMeasure.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr, null);
                C786410Ut5.Tc(smartImageView, fArr[0]);
                C786410Ut5.td(smartImageView, fArr[1]);
            }
        });
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ALAdapterS0S0500000_2 aLAdapterS0S0500000_2 = new ALAdapterS0S0500000_2(context, c2252611DEt, view, smartImageView, aFwS206S0000000_18, 2);
        valueAnimatorOfFloat.addListener(aLAdapterS0S0500000_2);
        c2252611DEt.LJJII(new AwS227S0300000_18(animatorSet, valueAnimatorOfFloat, aLAdapterS0S0500000_2, 66));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public static final String LIZ(RouteIntent routeIntent, Object obj, String str, Uri uri, EnumC1740810vOx enumC1740810vOx) {
        String strValueOf;
        Set<String> queryParameterNames;
        String strLJIIIIZZ;
        if (routeIntent == null) {
            return "";
        }
        if (uri == null) {
            strValueOf = routeIntent.getUrl();
        } else {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            Uri uri2 = routeIntent.getUri();
            if (uri2 != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri2)) != null) {
                for (String str2 : queryParameterNames) {
                    if (Intrinsics.LJFF(str2, "sellerId")) {
                        C1976807ok.LJFF(builderBuildUpon, "seller_id", C0WWO.LIZLLL(routeIntent, str2));
                    } else if (!Intrinsics.LJFF(str2, "trackParams")) {
                        C1976807ok.LJFF(builderBuildUpon, str2, C0WWO.LIZLLL(routeIntent, str2));
                    }
                }
            }
            strValueOf = String.valueOf(builderBuildUpon);
        }
        Uri uri3 = UriProtector.parse(strValueOf);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("is_host_profile", CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("preload_container", "1");
        pairArr[2] = new Pair("store_session_id", str);
        String pageCode = null;
        if (obj != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj);
        } else {
            strLJIIIIZZ = null;
        }
        pairArr[3] = new Pair("trackParams", strLJIIIIZZ);
        if (enumC1740810vOx != null) {
            pageCode = enumC1740810vOx.getPageCode();
        }
        pairArr[4] = new Pair("btm_page_code", pageCode);
        return C1976807ok.LJ(uri3, pairArr).toString();
    }

    public static Object LIZIZ(View view, float f, float f2, float f3, float f4, InterfaceC1364105Vn interfaceC1364105Vn) {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(756);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setImageResource(R.drawable.b93);
        ((ViewGroup) view).addView(imageView, new ViewGroup.LayoutParams(C0H9H.LIZIZ(64), C0H9H.LIZIZ(64)));
        float fLIZIZ = C0H9H.LIZIZ(32);
        float f5 = f - fLIZIZ;
        float f6 = f2 - fLIZIZ;
        float f7 = f3 - fLIZIZ;
        float f8 = f4 - fLIZIZ;
        Path path = new Path();
        path.moveTo(f5, f6);
        path.quadTo(f5, f8, f7, f8);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, length);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.26f, 0.0f, 0.6f, 0.2f));
        CoroutineContext context = interfaceC1364105Vn.getContext();
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS1S0400001_6(context, valueAnimatorOfFloat, imageView, length, pathMeasure, 1));
        valueAnimatorOfFloat.start();
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ALAdapterS0S0500000_2 aLAdapterS0S0500000_2 = new ALAdapterS0S0500000_2(context, c2252611DEt, view, imageView, aFwS206S0000000_18, 1);
        valueAnimatorOfFloat.addListener(aLAdapterS0S0500000_2);
        c2252611DEt.LJJII(new AwS384S0200000_18(valueAnimatorOfFloat, aLAdapterS0S0500000_2, 257));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJIJ;
    }
}
