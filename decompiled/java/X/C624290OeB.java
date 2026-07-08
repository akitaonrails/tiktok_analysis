package X;

import Y.ARunnableS1S2100000_1;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.text.a0;
import kotlin.text.u;
import wh6.AbS500S0200000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: renamed from: X.0OeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624290OeB extends RecyclerView.ViewHolder implements InterfaceC1508640pMU {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public C624310OeD LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "BulletinBoardGuideViewHolder";
    }

    public final void L5() {
        C0OP4.LIZ.getClass();
        C0OP4.LIZJ(false);
        C0OPQ.LIZ.getClass();
        C0OPQ.LJIIL("did_show", null);
        C624310OeD c624310OeD = this.LL;
        C0OPQ.LJIILL(1, null, c624310OeD != null ? c624310OeD.LLIZ : null);
        C0OPX.LJII("create bb guide banner, didshow: 1");
    }

    public C624290OeB(View view) {
        super(view);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(view, 1851));
        this.LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(view, 1850));
        this.LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(view, 1849));
        this.LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(view, 1845));
        this.LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(view, 1847));
        this.LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(view, 1848));
    }

    public final void I5(InterfaceC1891350zJl interfaceC1891350zJl, Function0<Unit> function0) {
        C624310OeD c624310OeD;
        UrlModel urlModel;
        List<String> urlList;
        Object objLJJJLL;
        String str;
        String str2;
        if (interfaceC1891350zJl instanceof C624310OeD) {
            c624310OeD = (C624310OeD) interfaceC1891350zJl;
        } else {
            c624310OeD = null;
        }
        this.LL = c624310OeD;
        if (c624310OeD != null && (str2 = c624310OeD.LLILLL) != null) {
            String nickname = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname();
            String strLJJIFFI = u.LJJIFFI(str2, "{s_creatorName}", nickname, false);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_inbox_banner_middle_truncate_opt", true, true) && (!a0.LJJJIL(nickname)) && (!a0.LJJJIL(str2)) && a0.LJJJ(strLJJIFFI, nickname, 0, false, 6) != -1) {
                TuxTextView tuxTextView = (TuxTextView) this.LLILLJJLI.getValue();
                tuxTextView.setText(strLJJIFFI);
                HandlerHook.viewPost(tuxTextView, new ARunnableS1S2100000_1(tuxTextView, strLJJIFFI, nickname, 3));
            } else {
                ((TextView) this.LLILLJJLI.getValue()).setText(strLJJIFFI);
                ((TextView) this.LLILLJJLI.getValue()).setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
        }
        C624310OeD c624310OeD2 = this.LL;
        if (c624310OeD2 != null && (str = c624310OeD2.LLILZ) != null) {
            ((TextView) this.LLILLL.getValue()).setText(str);
        }
        C624310OeD c624310OeD3 = this.LL;
        if (c624310OeD3 != null && (urlModel = c624310OeD3.LLILZLL) != null && (urlList = urlModel.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
            C12ES.LJIILL(0, (View) this.LLILZIL.getValue());
            C0DTR.LIZIZ((View) this.LLILZ.getValue());
            C427660Gpo.LJIIJJI((C427660Gpo) this.LLILZIL.getValue(), objLJJJLL, false, null, null, false, false, null, null, false, null, 1022);
        } else {
            C0DTR.LIZIZ((View) this.LLILZIL.getValue());
            C12ES.LJIILL(0, (View) this.LLILZ.getValue());
        }
        C786410Ut5.I7(new AbS500S0200000_9(new AwS553S0100000_9(function0, (Function0<Unit>) 1846), this, 6), (View) this.LLILZLL.getValue());
        C786410Ut5.I7(new AbS691S0100000_9(this, 67, 42), (View) this.LLIZ.getValue());
    }
}
