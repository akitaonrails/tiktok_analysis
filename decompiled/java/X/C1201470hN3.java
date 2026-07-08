package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201470hN3 {
    public static final C1201470hN3 LIZ = new C1201470hN3();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(166));

    public static BitmapDrawable LIZIZ(Context context) {
        try {
            View viewLJ = LJ(context, EnumC1201570hND.INTRO);
            viewLJ.measure(View.MeasureSpec.makeMeasureSpec(Resources.getSystem().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(LIZIZ, Integer.MIN_VALUE));
            viewLJ.layout(viewLJ.getLeft(), viewLJ.getTop(), viewLJ.getRight(), viewLJ.getBottom());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewLJ.getMeasuredWidth(), viewLJ.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), viewLJ);
            return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "intro_top_image", null, e);
            return null;
        }
    }

    public static SpannableString LIZ(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        try {
            int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 33);
            return spannableString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return spannableString;
        }
    }

    public static View LJ(Context context, EnumC1201570hND enumC1201570hND) {
        int i;
        int i2;
        int i3;
        if (enumC1201570hND == EnumC1201570hND.POPUP) {
            i = R.layout.dk4;
        } else {
            i = R.layout.dk5;
        }
        View viewSd = C786410Ut5.Sd(i, C786410Ut5.ne(context), null);
        if ((viewSd instanceof ConstraintLayout) && viewSd != null) {
            ImageView imageView = (ImageView) viewSd.findViewById(R.id.lny);
            View viewFindViewById = viewSd.findViewById(R.id.lnw);
            View viewFindViewById2 = viewSd.findViewById(R.id.lnx);
            ImageView imageView2 = (ImageView) viewSd.findViewById(R.id.nok);
            int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
            float f = -1.0f;
            if (layoutDirection == 1) {
                C786410Ut5.Qb(imageView, -1.0f);
                viewSd.setLayoutDirection(1);
            } else if (layoutDirection != 1) {
                f = 1.0f;
            }
            C786410Ut5.Qb(imageView, f);
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                if (enumC1201570hND == EnumC1201570hND.INTRO) {
                    i3 = R.drawable.cl9;
                } else {
                    i3 = R.drawable.cl5;
                }
                C339190DRl.LIZLLL(viewFindViewById2);
                C339190DRl.LIZIZ(viewFindViewById);
                i2 = R.drawable.cl8;
            } else {
                C339190DRl.LIZLLL(viewFindViewById);
                C339190DRl.LIZIZ(viewFindViewById2);
                i2 = R.drawable.cl7;
                i3 = R.drawable.cl4;
            }
            imageView.setImageResource(i2);
            imageView2.setImageResource(i3);
            return viewSd;
        }
        return new View(context);
    }

    public static void LJFF(final Context context, Function0 function0, Function0 function02) {
        try {
            C1201440hN0 c1201440hN0 = new C1201440hN0();
            c1201440hN0.LIZ = C1201430hMz.LIZJ(context, C1201430hMz.LIZIZ().starlingKey.prePopupTitleStarlingKey);
            c1201440hN0.LIZIZ = C1201430hMz.LIZJ(context, C1201430hMz.LIZIZ().starlingKey.prePopupContentStarlingKey);
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJIIIZ = new AbstractC1391830mK5(context) { // from class: X.0DVP
                public final /* synthetic */ Context LJ;

                @Override // X.AbstractC1397490mTD
                public final View LIZIZ() {
                    FrameLayout frameLayout = new FrameLayout(this.LJ);
                    Context context2 = this.LJ;
                    C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
                    frameLayout.setBackground(new ColorDrawable(this.LIZLLL));
                    ImageView imageView = new ImageView(context2);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168)));
                    layoutParams.gravity = 17;
                    C786410Ut5.c6(imageView, layoutParams);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setAdjustViewBounds(true);
                    C786410Ut5.Qb(imageView, context2.getResources().getConfiguration().getLayoutDirection() == 1 ? -1.0f : 1.0f);
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.uw;
                    imageView.setImageDrawable(c0hti.LIZ(context2));
                    frameLayout.addView(imageView);
                    return frameLayout;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context, 0);
                    this.LJ = context;
                }
            };
            c1397580mTM.LJI(c1201440hN0.LIZ);
            c1397580mTM.LIZIZ(c1201440hN0.LIZIZ);
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS227S0300000_18(context, (Context) function0, (Function0<Unit>) function02, (Function0<Unit>) 71));
            new C1397510mTF(c1397580mTM).LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "pre_popup", null, e);
            function02.invoke();
        }
    }

    public static TuxSheet LIZJ(Context context, Function0 function0, Function0 function02, Function0 function03) {
        try {
            C1201440hN0 c1201440hN0LIZ = C1201430hMz.LIZ(context);
            SpannableString spannableStringLIZ = LIZ(c1201440hN0LIZ.LIZIZ, c1201440hN0LIZ.LIZJ);
            C770750ULh c770750ULh = new C770750ULh();
            LIZ.getClass();
            BitmapDrawable bitmapDrawableLIZIZ = LIZIZ(context);
            if (bitmapDrawableLIZIZ != null) {
                c770750ULh.LIZ = bitmapDrawableLIZIZ;
                c770750ULh.LIZLLL = 0;
            }
            c770750ULh.LJ = c1201440hN0LIZ.LIZ;
            c770750ULh.LIZJ(spannableStringLIZ);
            c770750ULh.LJI(context.getResources().getString(2131826361), new AwS597S0100000_18(function0, (Function0<Unit>) 1017));
            c770750ULh.LJII(context.getResources().getString(2131836200), new AwS597S0100000_18(function02, (Function0<Unit>) 1018));
            TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
            tuxSheet.LLILLL = false;
            tuxSheet.LLJLLIL = false;
            tuxSheet.LL = new DialogInterfaceOnCancelListenerC1208790hYr(function02, 2);
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1208810hYt(function03, 7);
            return tuxSheet;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "open_settings_intro", null, e);
            return null;
        }
    }

    public static C1397510mTF LIZLLL(final Context context, Function0 function0, Function0 function02, Function0 function03) {
        try {
            C1201440hN0 c1201440hN0LIZ = C1201430hMz.LIZ(context);
            SpannableString spannableStringLIZ = LIZ(c1201440hN0LIZ.LIZIZ, c1201440hN0LIZ.LIZJ);
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJIIIZ = new AbstractC1391830mK5(context) { // from class: X.0hN4
                public final /* synthetic */ Context LJ;

                @Override // X.AbstractC1397490mTD
                public final View LIZIZ() {
                    C1201470hN3 c1201470hN3 = C1201470hN3.LIZ;
                    Context context2 = this.LJ;
                    EnumC1201570hND enumC1201570hND = EnumC1201570hND.POPUP;
                    c1201470hN3.getClass();
                    return C1201470hN3.LJ(context2, enumC1201570hND);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context, 0);
                    this.LJ = context;
                }
            };
            c1397580mTM.LJI(c1201440hN0LIZ.LIZ);
            c1397580mTM.LIZIZ(spannableStringLIZ);
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS227S0300000_18(context, (Context) function0, (Function0<Unit>) function02, (Function0<Unit>) 70));
            c1397580mTM.LIZLLL(new AwS597S0100000_18(function03, (Function0<Unit>) 1019));
            return new C1397510mTF(c1397580mTM);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "open_settings_popup", null, e);
            return null;
        }
    }
}
