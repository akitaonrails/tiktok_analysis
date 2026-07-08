package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0M3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562360M3u extends LinearLayout {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final View LLILZIL;
    public CharSequence LLILZLL;
    public CharSequence LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public C562370M3v LLJ;
    public boolean LLJI;
    public InterfaceC1631620sYq<? super Boolean, ? super String, ? super Boolean, Unit> LLJIJIL;
    public Map<String, String> LLJILJIL;
    public int LLJILJILJ;

    public final void LIZ() {
        InterfaceC539120LCk interfaceC539120LCk;
        InnerPushMessage innerPushMessage;
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        C562370M3v c562370M3v = this.LLJ;
        if (c562370M3v != null && (innerPushMessage = c562370M3v.LLILLJJLI) != null) {
            C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", 0);
        }
        Function0<Unit> function0 = this.LLIZLLLIL;
        if (function0 != null) {
            function0.invoke();
        }
        C562370M3v c562370M3v2 = this.LLJ;
        if (c562370M3v2 == null || (interfaceC539120LCk = c562370M3v2.LL) == null) {
            return;
        }
        interfaceC539120LCk.LIZIZ("cta_clicked", null, false);
    }

    public final int getDurationSeconds() {
        return this.LLJILJILJ;
    }

    public C562360M3u(Context context) {
        super(context, null, 0);
        this.LLILZLL = "";
        this.LLIZ = "";
        this.LLJILJILJ = 5;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d3p, this, true);
        this.LL = findViewById(R.id.g7c);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.g7b);
        this.LLILLJJLI = smartImageView;
        this.LLILLL = (TuxTextView) findViewById(R.id.g7f);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.g7d);
        this.LLILZ = tuxTextView;
        View viewFindViewById = findViewById(R.id.g7a);
        this.LLILZIL = viewFindViewById;
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(4.0f));
        smartImageView.setClipToOutline(true);
        smartImageView.setOutlineProvider(new C0IDA(fLIZIZ, 13));
        C786410Ut5.h9(tuxTextView, new ACListenerS143S0100000_8(this, 141));
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 142), viewFindViewById);
        View.OnClickListener aCListenerS143S0100000_8 = new ACListenerS143S0100000_8(this, 143);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS143S0100000_8) : aCListenerS143S0100000_8);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void setCtaText(CharSequence charSequence) {
        this.LLIZ = charSequence;
        this.LLILLL.setText(this.LLILZLL);
        this.LLILZ.setText(this.LLIZ);
    }

    public final void setDismissListener(InterfaceC1631620sYq<? super Boolean, ? super String, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJIJIL = interfaceC1631620sYq;
    }

    public final void setDurationSeconds(int i) {
        this.LLJILJILJ = i;
    }

    public final void setMobEventMap(Map<String, String> map) {
        this.LLJILJIL = map;
    }

    public final void setOnCtaClickListener(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setTitle(CharSequence charSequence) {
        this.LLILZLL = charSequence;
        this.LLILLL.setText(charSequence);
        this.LLILZ.setText(this.LLIZ);
    }
}
