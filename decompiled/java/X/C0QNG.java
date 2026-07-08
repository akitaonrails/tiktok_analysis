package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QNG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNG {
    public static final int LIZLLL() {
        return ((Number) C099300Zb.LIZ.getValue()).intValue() == 1 ? 16 : 17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC530790Krl LIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof InterfaceC530790Krl) {
            return (InterfaceC530790Krl) lifecycleOwner;
        }
        if (lifecycleOwner instanceof MutableContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) lifecycleOwner;
            if (contextWrapper.getBaseContext() instanceof InterfaceC530790Krl) {
                return (InterfaceC530790Krl) contextWrapper.getBaseContext();
            }
            return null;
        }
        return null;
    }

    public static final boolean LJ(SearchSugEntity searchSugEntity) {
        SugExtraInfo sugExtraInfo;
        if (searchSugEntity == null || (sugExtraInfo = searchSugEntity.sugExtraInfo) == null || !sugExtraInfo.isRichSug()) {
            return false;
        }
        return true;
    }

    public static final void LJII(SmartImageView smartImageView) {
        Resources resources;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        RectF rectF = new RectF(new Rect(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        paint.setColor(-16777216);
        paint.setAlpha(8);
        float f = iLIZIZ;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (smartImageView != null) {
            resources = smartImageView.getResources();
        } else {
            resources = null;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
        if (smartImageView != null) {
            smartImageView.setForeground(bitmapDrawable);
        }
    }

    public static final CharSequence LIZIZ(SearchSugEntity searchSugEntity, Context context) {
        boolean z;
        SpannableString spannableString;
        if (((Number) C276290AsF.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            String str2 = searchSugEntity.content;
            List<Position> list = searchSugEntity.highLightPositions;
            if (str2 != null) {
                str = str2;
            }
            if (context != null && !TextUtils.isEmpty(str) && list != null) {
                SpannableString spannableString2 = new SpannableString(str);
                int iLIZ = C960203pA.LIZ(R.attr.a04, context);
                int iLIZ2 = C960203pA.LIZ(R.attr.a1h, context);
                if (!(!list.isEmpty())) {
                    iLIZ = iLIZ2;
                }
                C786410Ut5.p2(spannableString2, new StyleSpan(1), 0, spannableString2.length(), 17);
                C786410Ut5.p2(spannableString2, new ForegroundColorSpan(iLIZ), 0, spannableString2.length(), 17);
                for (Position position : list) {
                    if (position != null) {
                        int begin = position.getBegin();
                        int end = position.getEnd() + 1;
                        int length = spannableString2.length();
                        if (end > length) {
                            end = length;
                        }
                        if (begin >= 0 && begin < end) {
                            C786410Ut5.p2(spannableString2, new ForegroundColorSpan(iLIZ2), begin, end, 17);
                        }
                    }
                }
                return spannableString2;
            }
            return new SpannableString(str);
        }
        if (!C294590Bgf.LIZ() && !C286100BJg.LIZ()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str3 = searchSugEntity.content;
            if (str3 != null) {
                str = str3;
            }
            List<Position> arrayList = searchSugEntity.highLightPositions;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (context != null && !TextUtils.isEmpty(str) && !C086I.LIZIZ(arrayList)) {
                spannableString = new SpannableString(str);
                for (Position position2 : arrayList) {
                    if (position2 != null) {
                        C344560Df4.LIZ(spannableString, position2.getBegin(), position2.getEnd() + 1);
                    }
                }
            } else {
                spannableString = new SpannableString(str);
            }
            spannableStringBuilder.append((CharSequence) spannableString);
            return spannableStringBuilder;
        }
        String str4 = searchSugEntity.content;
        List<Position> list2 = searchSugEntity.highLightPositions;
        if (str4 != null) {
            str = str4;
        }
        if (context != null && !TextUtils.isEmpty(str) && list2 != null) {
            SpannableString spannableString3 = new SpannableString(str);
            boolean z2 = !C286100BJg.LIZ();
            for (Position position3 : list2) {
                if (position3 != null) {
                    if (z2) {
                        C344560Df4.LIZ(spannableString3, position3.getBegin(), position3.getEnd() + 1);
                    }
                    int begin2 = position3.getBegin();
                    int end2 = position3.getEnd() + 1;
                    int iLIZ3 = C960203pA.LIZ(R.attr.a1h, context);
                    int iMax = Math.max(0, begin2);
                    if (!TextUtils.isEmpty(spannableString3) && iMax <= end2 && iMax < spannableString3.length() && end2 <= spannableString3.length()) {
                        C786410Ut5.p2(spannableString3, new ForegroundColorSpan(iLIZ3), iMax, end2, 17);
                    }
                }
            }
            return spannableString3;
        }
        return new SpannableString(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence LIZJ(com.ss.android.ugc.aweme.search.model.SearchSugEntity r6, android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QNG.LIZJ(com.ss.android.ugc.aweme.search.model.SearchSugEntity, android.view.View):java.lang.CharSequence");
    }

    public static final void LJI(C1610670s13 c1610670s13, int i) {
        C1331070kk5 hierarchy;
        if (c1610670s13.getAvatarImageView() != null && (hierarchy = c1610670s13.getAvatarImageView().getHierarchy()) != null) {
            hierarchy.LJJI(i, InterfaceC1320380kSq.LJI);
        }
    }

    public static final void LJFF(C1610670s13 c1610670s13, double d, double d2) {
        if (c1610670s13.getLiveTagView() != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C341940Daq.LIZ(d), C341940Daq.LIZ(d2));
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            C786410Ut5.R6(c1610670s13.getLiveTagView(), layoutParams);
        }
    }
}
