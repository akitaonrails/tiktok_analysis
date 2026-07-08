package X;

import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901910ZZt extends C09AY implements InterfaceC1631620sYq<Uri, View, Throwable, Unit> {
    public final /* synthetic */ Function1<InterfaceC902450Zal, Unit> LL;
    public final /* synthetic */ C901890ZZr LLILLJJLI;
    public final /* synthetic */ C0ZSW LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ BaseTemplate LLILZIL;
    public final /* synthetic */ UrlModel LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C901910ZZt(Function1<? super InterfaceC902450Zal, Unit> function1, C901890ZZr c901890ZZr, C0ZSW c0zsw, C869590Y9l c869590Y9l, BaseTemplate baseTemplate, UrlModel urlModel, String str) {
        super(3);
        this.LL = function1;
        this.LLILLJJLI = c901890ZZr;
        this.LLILLL = c0zsw;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = baseTemplate;
        this.LLILZLL = urlModel;
        this.LLIZ = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Uri uri, View view, Throwable th) {
        long jLongValue;
        String message;
        Throwable th2 = th;
        C901890ZZr c901890ZZr = this.LLILLJJLI;
        C0ZSW c0zsw = this.LLILLL;
        C869590Y9l c869590Y9l = this.LLILZ;
        BaseTemplate baseTemplate = this.LLILZIL;
        UrlModel urlModel = this.LLILZLL;
        String str = this.LLIZ;
        c901890ZZr.LLJILJILJ.setValue(EnumC901970ZZz.LLILZ);
        if (th2 == null) {
            new Throwable();
        }
        c901890ZZr.LJIILIIL();
        C869590Y9l c869590Y9l2 = c901890ZZr.LLJ;
        if (c869590Y9l2 == null || !C0ZDX.LJJJJ(c869590Y9l2)) {
            if (c0zsw == C0ZSW.NUDE_MASK) {
                c901890ZZr.LJIIJ(new C902040Za6(c0zsw));
                c901890ZZr.LJIILIIL();
            } else {
                if ((th2 instanceof C1494690ozz) && ((C1494690ozz) th2).getStatusCode() == 403) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C01GW c01gw = C902120ZaE.LIZ;
                    Long l = (Long) ((ConcurrentHashMap) c01gw.getValue()).get(Long.valueOf(c869590Y9l.getMsgId()));
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (jCurrentTimeMillis - jLongValue > FriendsTabPreloadTTLSetting.DEFAULT) {
                        C0Z85.LIZIZ.LIZ.LIZLLL(c869590Y9l);
                        ((ConcurrentHashMap) c01gw.getValue()).put(Long.valueOf(c869590Y9l.getMsgId()), Long.valueOf(jCurrentTimeMillis));
                    }
                }
                InterfaceC902110ZaD interfaceC902110ZaD = c901890ZZr.LLILLJJLI;
                if (Intrinsics.LJFF(interfaceC902110ZaD, C902000Za2.LIZ)) {
                    C419910GdJ c419910GdJ = C901930ZZv.LIZ;
                    c901890ZZr.LJIIJ(C901930ZZv.LIZ(c901890ZZr.LLILLJJLI, c869590Y9l, c901890ZZr.LIZJ().LIZ(), "thumbnail-load-failure", new C902090ZaB(c901890ZZr, c869590Y9l, baseTemplate, urlModel, c0zsw, str)));
                } else if (Intrinsics.LJFF(interfaceC902110ZaD, C902010Za3.LIZ)) {
                    c901890ZZr.LJIIJ(new C902050Za7(c0zsw));
                } else {
                    throw new C1954807lC();
                }
            }
        }
        Function1<InterfaceC902450Zal, Unit> function1 = this.LL;
        if (function1 != null) {
            if (th2 == null || (message = th2.getMessage()) == null) {
                message = "";
            }
            function1.invoke(new C0ZYR(message));
        }
        return Unit.LIZ;
    }
}
