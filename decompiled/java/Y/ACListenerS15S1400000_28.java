package Y;

import X.C0T82;
import X.C10BM;
import X.C11JN;
import X.C13054058y;
import X.C1391190mJ3;
import X.C1893580zNM;
import X.C1894320zOY;
import X.C1896360zRq;
import X.C191880104w;
import X.C19218610Gq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C259800zU;
import X.C343970De7;
import X.EnumC19218510Gp;
import X.InterfaceC19218710Gr;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.touchpoint.api.model.FeedButton;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.tpsc.model.ContentReuseAccountExtra;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS15S1400000_28 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void onClick$0(ACListenerS15S1400000_28 aCListenerS15S1400000_28, View view) {
        C259800zU c259800zU = (C259800zU) aCListenerS15S1400000_28.l1;
        T t = c259800zU.element;
        TuxIconView tuxIconView = (TuxIconView) aCListenerS15S1400000_28.l2;
        TuxIconView tuxIconView2 = (TuxIconView) aCListenerS15S1400000_28.l3;
        InterfaceC19218710Gr interfaceC19218710Gr = (InterfaceC19218710Gr) aCListenerS15S1400000_28.l4;
        T t2 = EnumC19218510Gp.LLILLJJLI;
        if (t == t2) {
            tuxIconView.setIconRes(R.raw.icon_thumbs_up);
            tuxIconView.setTintColorRes(R.attr.a1k);
            if (interfaceC19218710Gr != null) {
                interfaceC19218710Gr.LIZJ();
            }
            t2 = EnumC19218510Gp.LL;
        } else {
            if (t == EnumC19218510Gp.LLILLL) {
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconRes(R.raw.icon_thumbs_down);
                    tuxIconView2.setTintColorRes(R.attr.a1k);
                }
                if (interfaceC19218710Gr != null) {
                    interfaceC19218710Gr.LIZLLL();
                }
            }
            tuxIconView.setIconRes(R.raw.icon_thumbs_up_fill);
            tuxIconView.setTintColorRes(R.attr.a1h);
            if (interfaceC19218710Gr != null) {
                interfaceC19218710Gr.LIZIZ();
            }
        }
        c259800zU.element = t2;
        C19218610Gq.LIZ.put(aCListenerS15S1400000_28.s0, (EnumC19218510Gp) ((C259800zU) aCListenerS15S1400000_28.l1).element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void onClick$1(ACListenerS15S1400000_28 aCListenerS15S1400000_28, View view) {
        C259800zU c259800zU = (C259800zU) aCListenerS15S1400000_28.l1;
        T t = c259800zU.element;
        TuxIconView tuxIconView = (TuxIconView) aCListenerS15S1400000_28.l2;
        TuxIconView tuxIconView2 = (TuxIconView) aCListenerS15S1400000_28.l3;
        InterfaceC19218710Gr interfaceC19218710Gr = (InterfaceC19218710Gr) aCListenerS15S1400000_28.l4;
        T t2 = EnumC19218510Gp.LLILLL;
        if (t == t2) {
            tuxIconView2.setIconRes(R.raw.icon_thumbs_down);
            tuxIconView2.setTintColorRes(R.attr.a1k);
            if (interfaceC19218710Gr != null) {
                interfaceC19218710Gr.LIZLLL();
            }
            t2 = EnumC19218510Gp.LL;
        } else {
            if (t == EnumC19218510Gp.LLILLJJLI) {
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_thumbs_up);
                    tuxIconView.setTintColorRes(R.attr.a1k);
                }
                if (interfaceC19218710Gr != null) {
                    interfaceC19218710Gr.LIZJ();
                }
            }
            tuxIconView2.setIconRes(R.raw.icon_thumbs_down_fill);
            tuxIconView2.setTintColorRes(R.attr.a1h);
            if (interfaceC19218710Gr != null) {
                interfaceC19218710Gr.LIZ();
            }
        }
        c259800zU.element = t2;
        C19218610Gq.LIZ.put(aCListenerS15S1400000_28.s0, (EnumC19218510Gp) ((C259800zU) aCListenerS15S1400000_28.l1).element);
    }

    public static final void onClick$2(ACListenerS15S1400000_28 aCListenerS15S1400000_28, View view) {
        C1896360zRq c1896360zRq = (C1896360zRq) aCListenerS15S1400000_28.l1;
        ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) aCListenerS15S1400000_28.l2;
        c1896360zRq.getClass();
        C13054058y.LIZ(new ARunnableS39S0101000_28(0, referralFeedBanner, 6));
        C1893580zNM c1893580zNM = C1893580zNM.LIZ;
        Context context = (Context) aCListenerS15S1400000_28.l3;
        Integer numValueOf = Integer.valueOf(((ReferralFeedBanner) aCListenerS15S1400000_28.l2).LIZ);
        String str = ((FeedButton) aCListenerS15S1400000_28.l4).jumpLink;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        ReferralFeedBanner referralFeedBanner2 = (ReferralFeedBanner) aCListenerS15S1400000_28.l2;
        String str3 = referralFeedBanner2.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        C1893580zNM.LJ(c1893580zNM, context, numValueOf, str, str2, false, referralFeedBanner2.LJ, null, null, 192);
        C0T82.LIZJ(aCListenerS15S1400000_28.s0).LJIIJJI();
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        int i = ((ReferralFeedBanner) aCListenerS15S1400000_28.l2).LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("click_position", "confirm");
        c1894320zOY.getClass();
        C1894320zOY.LJIILJJIL(i, linkedHashMap, null, null, null);
    }

    public static final void onClick$3(ACListenerS15S1400000_28 aCListenerS15S1400000_28, View view) {
        C191880104w c191880104w = C191880104w.LIZ;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("account_content_reuse_setting", String.valueOf(((MutableLiveData) aCListenerS15S1400000_28.l1).getValue())));
        c191880104w.getClass();
        C11JN c11jnLJIILJJIL = C191880104w.LJIILJJIL(2, "account_content_reuse", mapLIZJ);
        MutableLiveData mutableLiveData = (MutableLiveData) aCListenerS15S1400000_28.l1;
        Function0 function0 = (Function0) aCListenerS15S1400000_28.l4;
        c11jnLJIILJJIL.LJJLL(new AfS162S0200000_28(mutableLiveData, (MutableLiveData<Integer>) function0, (Function0<Unit>) 20), new AfS185S0100000_16(function0, 52));
        C10BM.LIZLLL("account", aCListenerS15S1400000_28.s0, "ok", C2097608Jq.LJIIIIZZ(new Pair("duet_status", C10BM.LIZ(((ContentReuseAccountExtra) aCListenerS15S1400000_28.l2).noPaDuet)), new Pair("stitch_status", C10BM.LIZ(((ContentReuseAccountExtra) aCListenerS15S1400000_28.l2).noPaStitch)), new Pair("sticker_status", C10BM.LIZIZ(((ContentReuseAccountExtra) aCListenerS15S1400000_28.l2).noPaCreateSticker)), new Pair("story_status", C10BM.LIZIZ(((ContentReuseAccountExtra) aCListenerS15S1400000_28.l2).noPaShareToStory))));
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) aCListenerS15S1400000_28.l3, C343970De7.LIZ);
    }

    public ACListenerS15S1400000_28(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
    }
}
