package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0fN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124630fN7 extends ConstraintLayout implements C0T8B {
    public boolean LL;
    public final ImageView LLILLJJLI;
    public final ImageView LLILLL;
    public final C16F5 LLILZ;

    @Override // X.C0T8B
    public final boolean h() {
        return (this.LL || this.LLILLL.getVisibility() == 0) ? false : true;
    }

    public final void h0() {
        this.LLILLJJLI.setImageResource(R.drawable.evu);
        ImageView imageView = this.LLILLJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.height = C439101nJ.LIZ(24);
        marginLayoutParams.width = C439101nJ.LIZ(24);
        marginLayoutParams.setMarginStart(0);
        C786410Ut5.c6(imageView, marginLayoutParams);
        this.LLILZ.setText(C497740JfY.LJIJI(2131840948));
        this.LLILZ.setHorizontalFadingEdgeEnabled(true);
        this.LLILZ.setWillNotDraw(false);
        C1118060fCW.LIZ(this.LLILZ);
        this.LLILZ.setTextSize(1, 12.0f);
        C786410Ut5.LJZI(0, this.LLILLL);
        if (h()) {
            C1117830fC9.LIZ(0, this.LLILZ);
        } else {
            C1117830fC9.LIZ(C439101nJ.LIZ(16), this.LLILZ);
        }
    }

    public final void e0(GiftPanelBanner giftPanelBanner) {
        int i;
        int i2;
        float fIntValue;
        TextFormat textFormat;
        Integer num;
        String str;
        Drawable drawableLIZ;
        List<String> list;
        ImageView imageView = this.LLILLJJLI;
        C1117830fC9.LIZLLL(imageView, giftPanelBanner.leftIcon, imageView.getLayoutParams().width, imageView.getLayoutParams().height);
        ImageView imageView2 = this.LLILLJJLI;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
        ImageModel imageModel = giftPanelBanner.leftIcon;
        if (imageModel != null) {
            i = imageModel.height;
        } else {
            i = 48;
        }
        marginLayoutParams.height = C439101nJ.LIZ(i);
        ImageModel imageModel2 = giftPanelBanner.leftIcon;
        if (imageModel2 != null) {
            i2 = imageModel2.width;
        } else {
            i2 = 48;
        }
        marginLayoutParams.width = C439101nJ.LIZ(i2);
        int iLIZ = marginLayoutParams.height;
        if (iLIZ == 0) {
            iLIZ = C439101nJ.LIZ(48);
        }
        marginLayoutParams.height = iLIZ;
        int iLIZ2 = marginLayoutParams.width;
        if (iLIZ2 == 0) {
            iLIZ2 = C439101nJ.LIZ(48);
        }
        marginLayoutParams.width = iLIZ2;
        marginLayoutParams.setMarginStart(0);
        C786410Ut5.c6(imageView2, marginLayoutParams);
        if (!CollectionUtil.isListEmpty(giftPanelBanner.bgColors)) {
            List<String> list2 = giftPanelBanner.bgColors;
            String str2 = null;
            if (list2 != null) {
                str = (String) ListProtector.get(list2, 0);
            } else {
                str = null;
            }
            List<String> list3 = giftPanelBanner.bgColors;
            if (list3 != null && list3.size() > 1 && (list = giftPanelBanner.bgColors) != null) {
                str2 = (String) ListProtector.get(list, 1);
            }
            if (str != null && C434800H3e.LIZIZ(str) && (drawableLIZ = C434800H3e.LIZ(str, str2)) != null) {
                setBackground(drawableLIZ);
            }
            this.LL = true;
        } else {
            setBackgroundResource(R.drawable.dtf);
            this.LL = false;
        }
        C16F5 c16f5 = this.LLILZ;
        C244400x0 c244400x0 = C244400x0.LIZ;
        Text text = giftPanelBanner.displayText;
        c244400x0.getClass();
        c16f5.setText(C244400x0.LIZ(text));
        C16F5 c16f52 = this.LLILZ;
        Text text2 = giftPanelBanner.displayText;
        if (text2 != null && (textFormat = text2.defaultFormat) != null && (num = textFormat.fontSize) != null) {
            fIntValue = num.intValue();
        } else {
            fIntValue = 12.0f;
        }
        c16f52.setTextSize(1, fIntValue);
        this.LLILZ.setHorizontalFadingEdgeEnabled(true);
        this.LLILZ.setWillNotDraw(false);
        C1118060fCW.LIZ(this.LLILZ);
        if (h()) {
            C1117830fC9.LIZ(0, this.LLILZ);
        } else {
            C1117830fC9.LIZ(C439101nJ.LIZ(16), this.LLILZ);
        }
    }

    public final void setBannerClickListener(Function0<Unit> function0) {
        View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(function0, 53);
        if (C1848410yCV.LIZ) {
            aCListenerS152S0100000_17 = new f(aCListenerS152S0100000_17);
        }
        a aVar = new a(aCListenerS152S0100000_17);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C786410Ut5.LJZI(0, this.LLILLL);
    }

    public C1124630fN7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1124630fN7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.hzx, this);
        this.LLILLJJLI = (ImageView) findViewById(R.id.mk3);
        this.LLILLL = (ImageView) findViewById(R.id.wit);
        this.LLILZ = (C16F5) findViewById(R.id.iwr);
    }
}
