package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.replyquote.TakoReplyQuoteAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.replyquote.TakoReplyQuoteAssem$onBind$1", f = "TakoReplyQuoteAssem.kt", l = {46}, m = "invokeSuspend")
public final class C1857300yQq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Message LLILLJJLI;
    public final /* synthetic */ TakoReplyQuoteAssem LLILLL;
    public final /* synthetic */ InterfaceC1857320yQs LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857300yQq(Message message, TakoReplyQuoteAssem takoReplyQuoteAssem, InterfaceC1857320yQs interfaceC1857320yQs, InterfaceC1364105Vn<? super C1857300yQq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = message;
        this.LLILLL = takoReplyQuoteAssem;
        this.LLILZ = interfaceC1857320yQs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1857300yQq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String string;
        Context context;
        TakoMixFeed takoMixFeedLJIIIZ;
        C1C7U.LIZ("TakoReplyQuoteAssem@ec37.onBind$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Message message = this.LLILLJJLI;
            if (message != null && (str = message.LJIILJJIL) != null && str.length() != 0) {
                TuxTextView tuxTextView = this.LLILLL.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView != null) {
                    Message message2 = this.LLILLJJLI;
                    if (message2 != null) {
                        str2 = message2.LJIILJJIL;
                    }
                    tuxTextView.setText(str2);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoReplyQuoteAssem@ec37.onBind$1");
                return unit;
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C1857310yQr c1857310yQr = new C1857310yQr(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1857310yQr);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoReplyQuoteAssem@ec37.onBind$1");
                return objLJFF;
            }
        }
        Message message3 = (Message) obj;
        if (message3 != null && (takoMixFeedLJIIIZ = message3.LJIIIZ()) != null) {
            string = takoMixFeedLJIIIZ.text;
        } else {
            string = null;
        }
        Message message4 = this.LLILLJJLI;
        if (message4 != null) {
            if (string != null && C123100dR.LIZ(string)) {
                str2 = string;
            }
            message4.LJIILJJIL = str2;
        }
        if (!C123100dR.LIZ(string) && ((context = this.LLILLL.getContext()) == null || (string = context.getString(2131849906)) == null)) {
            string = "";
        }
        TuxTextView tuxTextView2 = this.LLILLL.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(string);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoReplyQuoteAssem@ec37.onBind$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
