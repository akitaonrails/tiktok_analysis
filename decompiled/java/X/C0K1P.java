package X;

import Y.ACListenerS74S0300000_7;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import mf.a;

/* JADX INFO: renamed from: X.0K1P, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1P extends FrameLayout {
    public final FrameLayout LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final List<ImageView> LLILZ;
    public C0K1Q LLILZIL;

    public C0K1P(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int LIZ(int i) {
        return C814420VxA.LIZIZ(i * getResources().getDisplayMetrics().density);
    }

    public final void LIZIZ(C0K1Q c0k1q, boolean z) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        this.LLILZIL = c0k1q;
        int iLIZ = LIZ(c0k1q.LIZLLL);
        setPadding(iLIZ, iLIZ, iLIZ, iLIZ);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(LIZ(c0k1q.LJ));
        gradientDrawable.setColor(ColorProtector.parseColor("#0F000000"));
        setBackground(gradientDrawable);
        this.LLILLJJLI.setTextSize(2, c0k1q.LIZJ);
        TextView textView = this.LLILLL;
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, textView);
        for (ImageView imageView : this.LLILZ) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                ImageView imageView2 = imageView;
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.width = LIZ(c0k1q.LIZ);
                    layoutParams.height = LIZ(c0k1q.LIZ);
                    layoutParams.setMarginStart(LIZ(i2 * c0k1q.LIZIZ));
                    C786410Ut5.c6(imageView2, layoutParams);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LIZJ(SpaceActivityIndicator spaceActivityIndicator, Function0<Unit> function0) {
        ImageModel avatarThumb;
        List<String> listLIZ;
        Object objLJJJLL;
        this.LLILLJJLI.setText(spaceActivityIndicator.notificationText);
        List<SpaceActivityInfo> list = spaceActivityIndicator.spaceActivityInfoList;
        ArrayList arrayList = new ArrayList();
        Iterator<SpaceActivityInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            User user = it2.next().activityFromUserInfo;
            if (user != null && (avatarThumb = user.getAvatarThumb()) != null && (listLIZ = C842240X2g.LIZ(avatarThumb)) != null && (objLJJJLL = C13LP.LJJJLL(listLIZ)) != null) {
                arrayList.add(objLJJJLL);
            }
        }
        List listLL = C13LP.LL(arrayList, 3);
        Iterator it3 = ((ArrayList) this.LLILZ).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 8;
            if (it3.hasNext()) {
                Object next = it3.next();
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    View view = (View) next;
                    String str = (String) C13LP.LJJJLZIJ(i2, listLL);
                    if (str != null && !a0.LJJJIL(str)) {
                        i3 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i3, view);
                    if (str != null && !a0.LJJJIL(str)) {
                        C511420K3w.LJIIJ.getClass();
                        C511420K3w c511420K3w = new C511420K3w();
                        c511420K3w.LIZIZ = Collections.singletonList(str);
                        c511420K3w.LJ = Boolean.TRUE;
                        c511420K3w.LIZ(view);
                    }
                    i2 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                FrameLayout frameLayout = this.LL;
                if (!(!listLL.isEmpty())) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, frameLayout);
                View.OnClickListener aCListenerS74S0300000_7 = new ACListenerS74S0300000_7(this, spaceActivityIndicator, function0, 4);
                if (C1848410yCV.LIZ) {
                    aCListenerS74S0300000_7 = new f(aCListenerS74S0300000_7);
                }
                a aVar = new a(aCListenerS74S0300000_7);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(this);
                }
                setOnClickListener(aVar);
                return;
            }
        }
    }

    public C0K1P(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZIL = C0K1T.LJFF;
        setClickable(true);
        setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(LIZ(6));
        C786410Ut5.a6(frameLayout, layoutParams);
        this.LL = frameLayout;
        TextView textView = new TextView(context);
        textView.setTextColor(ColorProtector.parseColor("#E6000000"));
        textView.setTextSize(2, 14.0f);
        textView.setMaxLines(1);
        this.LLILLJJLI = textView;
        TextView textView2 = new TextView(context);
        textView2.setText("›");
        textView2.setTextColor(ColorProtector.parseColor("#99000000"));
        textView2.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(LIZ(4));
        C786410Ut5.g6(textView2, layoutParams2);
        this.LLILLL = textView2;
        linearLayout.addView(frameLayout);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        addView(linearLayout);
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, 3);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            it2.nextInt();
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            arrayList.add(appCompatImageView);
        }
        this.LLILZ = arrayList;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                FrameLayout frameLayout2 = this.LL;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(LIZ(this.LLILZIL.LIZ), LIZ(this.LLILZIL.LIZ));
                layoutParams3.gravity = 8388627;
                layoutParams3.setMarginStart(LIZ(i2 * this.LLILZIL.LIZIZ));
                frameLayout2.addView((View) obj, layoutParams3);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LIZIZ(this.LLILZIL, false);
    }
}
