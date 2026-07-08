package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0dcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057430dcj extends LinearLayout {
    public static final /* synthetic */ int LLILZIL = 0;
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public final SimpleDateFormat LLILZ;

    public final SmartImageView getIvIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lkw);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getTvPromotionExtraFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_promotion_extra);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTvPromotionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_promotion);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C1057430dcj(Context context) {
        super(context, null, 0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.LLILZ = simpleDateFormat;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setOrientation(0);
        setGravity(16);
        C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(context, R.style.z4)), R.layout.bti, this, true);
    }

    public final void setIvIconFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setTvPromotionExtraFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTvPromotionFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void LIZ(String str, List list) {
        if (list != null && !list.isEmpty()) {
            C786410Ut5.LLFF(0, getIvIconFromXml());
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
            c1331670kl3LJIIJ.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LJIIJ.LIZLLL("ec_ug_vsa");
            c1331670kl3LJIIJ.LJJ(getIvIconFromXml());
            C786410Ut5.h3(c1331670kl3LJIIJ);
        } else {
            C786410Ut5.LLFF(8, getIvIconFromXml());
        }
        getTvPromotionFromXml().setText(str);
    }
}
