package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS108S0201000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yR6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.regenerate.TakoRegenerateHelper$clickRegenerateActionCallback$1", f = "TakoRegenerateHelper.kt", l = {}, m = "invokeSuspend")
public final class C1857460yR6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Message LL;
    public final /* synthetic */ InterfaceC665370Q7z LLILLJJLI;
    public final /* synthetic */ TakoChatUIAbility LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ RecyclerView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857460yR6(Message message, InterfaceC665370Q7z interfaceC665370Q7z, TakoChatUIAbility takoChatUIAbility, View view, RecyclerView recyclerView, InterfaceC1364105Vn<? super C1857460yR6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = message;
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = takoChatUIAbility;
        this.LLILZ = view;
        this.LLILZIL = recyclerView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1857460yR6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1857430yR3 enumC1857430yR3;
        int i;
        C1C7U.LIZ("TakoRegenerateHelper@b81d.clickRegenerateActionCallback$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoMixFeed takoMixFeedLJIIIZ = this.LL.LJIIIZ();
        if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 301) {
            C1857470yR7 c1857470yR7 = C1857470yR7.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            Message message = this.LL;
            c1857470yR7.getClass();
            C1857470yR7.LIZJ(interfaceC665370Q7z, message, 0);
            C1857470yR7.LIZIZ(this.LLILLJJLI, this.LL, 0);
        } else {
            this.LLILLL.iS1(false);
            Context context = this.LLILZ.getContext();
            C1857470yR7 c1857470yR72 = C1857470yR7.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7z2 = this.LLILLJJLI;
            Message message2 = this.LL;
            c1857470yR72.getClass();
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            Iterator it2 = C1697810uHb.LJIIJJI(0, 2, 1).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                C1857470yR7.LIZ.getClass();
                C419910GdJ c419910GdJ = null;
                if (iIntValue != 0) {
                    if (iIntValue != 1) {
                        if (iIntValue == 2) {
                            enumC1857430yR3 = EnumC1857430yR3.REGENERATE_DETAILED;
                        }
                    } else {
                        enumC1857430yR3 = EnumC1857430yR3.REGENERATE_CONCISE;
                    }
                } else {
                    enumC1857430yR3 = EnumC1857430yR3.REGENERATE_DEFAULT;
                }
                if (enumC1857430yR3 != null) {
                    if (iIntValue != 0) {
                        if (iIntValue != 1) {
                            if (iIntValue == 2) {
                                c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_arrow_text_long_ltr;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                            }
                        } else {
                            c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_arrow_text_short_ltr;
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                        }
                    } else {
                        c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_arrow_clockwise;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    }
                    if (iIntValue != 0) {
                        if (iIntValue != 1) {
                            if (iIntValue != 2) {
                                i = 0;
                            } else {
                                i = 2131822553;
                            }
                        } else {
                            i = 2131822555;
                        }
                    } else {
                        i = 2131822554;
                    }
                    c13dvLIZIZ.add(new C19723912Ez(enumC1857430yR3, Integer.valueOf(i), c419910GdJ, new AwS108S0201000_27(interfaceC665370Q7z2, message2, iIntValue, 3), 3050));
                }
            }
            new C1860010yVD(context, null, this.LL, this.LLILZIL, false, C1697820uHc.LIZ(c13dvLIZIZ), new AwS571S0100000_27(this.LLILLL, 1341), null, true, true, C2286608xc.LJ(R.style.agm), 130).LIZIZ(this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoRegenerateHelper@b81d.clickRegenerateActionCallback$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
