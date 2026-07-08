package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.042e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10330042e extends FrameLayout implements InterfaceC10331042f, InterfaceC7903036v {
    public C10332042g LL;
    public TuxTextView LLILLJJLI;
    public C951203ni LLILLL;
    public SmartImageView LLILZ;
    public final C951203ni LLILZIL;
    public final C10332042g LLILZLL;
    public final TuxTextView LLIZ;
    public final SmartImageView LLIZLLLIL;
    public BannerComponent LLJ;

    public final C951203ni getCountdownViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f15);
            this.LLILLL = (C951203ni) callbackFindViewById;
        }
        return (C951203ni) callbackFindViewById;
    }

    public final C10332042g getPriceTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rtn);
            this.LL = (C10332042g) callbackFindViewById;
        }
        return (C10332042g) callbackFindViewById;
    }

    public final TuxTextView getPriceTextNewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rto);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getRemindBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t5c);
            this.LLILZ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public C10330042e(Context context) {
        super(context, null, 0);
        C954703oH.LIZ(context, R.layout.au6, this, true);
        this.LLILZLL = getPriceTextFromXml();
        this.LLIZ = getPriceTextNewFromXml();
        this.LLILZIL = getCountdownViewFromXml();
        this.LLIZLLLIL = getRemindBtnFromXml();
    }

    @Override // X.InterfaceC10331042f
    public final void V2(long j) {
        this.LLILZIL.V2(j);
    }

    public final void setCountdownViewFromXml(C951203ni c951203ni) {
        this.LLILLL = c951203ni;
    }

    public final void setPriceTextFromXml(C10332042g c10332042g) {
        this.LL = c10332042g;
    }

    public final void setPriceTextNewFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setRemindBtnFromXml(SmartImageView smartImageView) {
        this.LLILZ = smartImageView;
    }

    @Override // X.InterfaceC7903036v
    public void setRemindButtonClick(Function1<? super BannerComponent, Unit> function1) {
        C786410Ut5.I7(new AjS40S0200000_1(function1, this, 63), this.LLIZLLLIL);
    }
}
