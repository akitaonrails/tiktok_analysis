package Y;

import X.C0LAB;
import X.C0LXN;
import X.C1281904zx;
import X.C1412800mru;
import X.C1418910n1l;
import X.C1419030n1x;
import X.C1449000noI;
import X.C1449010noJ;
import X.C1449120noU;
import X.C1449130noV;
import X.C1449140noW;
import X.C1449220noe;
import X.C1449230nof;
import X.C1449240nog;
import X.C1624200sMs;
import X.C1665200tR0;
import X.C1934507hv;
import X.C1ER1;
import X.C212600rs;
import X.C2341909Fp;
import X.C523280Kfe;
import X.C533930Kwp;
import X.C682370Qpf;
import X.C786410Ut5;
import X.InterfaceC1419090n23;
import X.InterfaceC1624480sNK;
import X.InterfaceC2342209Fs;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public class ACListenerS87S0300000_22 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS87S0300000_22 aCListenerS87S0300000_22, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        InterfaceC1624480sNK interfaceC1624480sNKC0 = ((C1449130noV) aCListenerS87S0300000_22.l0).LLILLJJLI.C0();
        Effect effect = (Effect) aCListenerS87S0300000_22.l1;
        if (((C1449130noV) aCListenerS87S0300000_22.l0).LLJI) {
            str = "prop_recommend";
        } else {
            str = "prop_search";
        }
        effect.setSearchType(str);
        int position = ((C1449120noU) aCListenerS87S0300000_22.l2).getPosition();
        ((C1449130noV) aCListenerS87S0300000_22.l0).LLILLJJLI.C0().LJIIIZ();
        if (position < 0) {
            position = 0;
        }
        interfaceC1624480sNKC0.LJJLIIIJILLIZJL(position);
        int i = position + 1;
        interfaceC1624480sNKC0.LJIJJ();
        interfaceC1624480sNKC0.LJII().LJIIIZ(new C1449000noI((Effect) aCListenerS87S0300000_22.l1, -1, i, false, false, false, false, (String) null, "search", "search", 1264));
        Function2<Effect, Bundle, Unit> function2 = ((C1449130noV) aCListenerS87S0300000_22.l0).LLIZ;
        Effect effect2 = (Effect) aCListenerS87S0300000_22.l1;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("tab_name", "search", bundle);
        C786410Ut5.LJJJI("tab_key", "search", bundle);
        bundle.putInt("impr_position", i);
        bundle.putBoolean("need_report_prop_click", false);
        function2.invoke(effect2, bundle);
        if (!((C1449130noV) aCListenerS87S0300000_22.l0).LLJI) {
            str2 = "search";
        } else {
            str2 = "recommend";
        }
        String effectId = ((Effect) aCListenerS87S0300000_22.l1).getEffectId();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("tab_name", "search");
        c0lab.LJ("tab_key", "search");
        c0lab.LJ("shoot_way", ((C1449130noV) aCListenerS87S0300000_22.l0).LLILZ);
        c0lab.LJ("search_id", ((C1449130noV) aCListenerS87S0300000_22.l0).LLJ);
        c0lab.LJ("creation_id", ((C1449130noV) aCListenerS87S0300000_22.l0).LLILLL);
        C1ER1 c1er1 = C1ER1.LIZIZ;
        c0lab.LJ("effect_session_id", c1er1.LJJIIJZLJL().LJIL());
        c0lab.LJ("search_method", str2);
        c0lab.LIZ(i, "impr_position");
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("resource_id", ((Effect) aCListenerS87S0300000_22.l1).getResourceId());
        c0lab.LIZ(0, "is_auto_applied");
        c0lab.LJ("prop_id", effectId);
        String str5 = "1";
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_camera_permission", str3);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_microphone_permission", str4);
        C1934507hv.LIZ(new C1449010noJ(c0lab), ((C1449130noV) aCListenerS87S0300000_22.l0).LLILZLL.propFromGroupModel, effectId);
        C1665200tR0 c1665200tR0 = C1665200tR0.LIZ;
        Effect effect3 = (Effect) aCListenerS87S0300000_22.l1;
        c1665200tR0.getClass();
        c0lab.LIZ(C1665200tR0.LIZJ(effect3) ? 1 : 0, "is_met_music_reuse");
        c0lab.LJ("effect_source", C1449140noW.LIZ((Effect) aCListenerS87S0300000_22.l1));
        Effect effect4 = (Effect) aCListenerS87S0300000_22.l1;
        if (C212600rs.LIZ()) {
            c0lab.LIZ(effect4.getFrom_source(), "prop_panel_delivery_source");
        }
        C1449130noV c1449130noV = (C1449130noV) aCListenerS87S0300000_22.l0;
        Effect effect5 = (Effect) aCListenerS87S0300000_22.l1;
        CreativeModel creativeModel = c1449130noV.LLILZLL;
        C1449220noe.LIZIZ(new C1449240nog(creativeModel), creativeModel, effect5, "search", "search", i);
        CreativeModel creativeModel2 = c1449130noV.LLILZLL;
        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(296);
        C1449230nof c1449230nof = new C1449230nof(creativeModel2, "prop_click", new C1281904zx(c0lab));
        aFwS261S0000000_22.invoke(c1449230nof);
        c1449230nof.LIZ();
        C1449130noV.LLLIIIIL(c0lab, (Effect) aCListenerS87S0300000_22.l1);
        Effect effect6 = (Effect) aCListenerS87S0300000_22.l1;
        C0LXN.LIZ.getClass();
        C0LXN.LIZIZ(c0lab, effect6);
        if (!C1624200sMs.LJ(effect6)) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_aigc_prop", str5);
        C523280Kfe.LIZ.getClass();
        C523280Kfe.LIZ(c0lab);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("prop_click", c0lab.LIZ);
        c1er1.LJJIIJZLJL().LIZLLL(new C682370Qpf(((C1449130noV) aCListenerS87S0300000_22.l0).LLJ, effectId, ((Effect) aCListenerS87S0300000_22.l1).getDoc_id(), ((C1449130noV) aCListenerS87S0300000_22.l0).LLILLJJLI.C0().LJI(), ((C1449130noV) aCListenerS87S0300000_22.l0).LLILLL, str2));
    }

    public static final void onClick$1(ACListenerS87S0300000_22 aCListenerS87S0300000_22, View view) {
        ((C1418910n1l) aCListenerS87S0300000_22.l0).setBack(false);
        ((Function0) aCListenerS87S0300000_22.l1).invoke();
        ((TuxSheet) aCListenerS87S0300000_22.l2).dismiss();
    }

    public static final void onClick$2(ACListenerS87S0300000_22 aCListenerS87S0300000_22, View view) {
        ((C1418910n1l) aCListenerS87S0300000_22.l0).setBack(false);
        ((Function0) aCListenerS87S0300000_22.l1).invoke();
        ((TuxSheet) aCListenerS87S0300000_22.l2).dismiss();
    }

    public static final void onClick$3(ACListenerS87S0300000_22 aCListenerS87S0300000_22, View view) {
        ((C1418910n1l) aCListenerS87S0300000_22.l0).setBack(false);
        ((Function2) aCListenerS87S0300000_22.l1).invoke((TuxSheet) aCListenerS87S0300000_22.l2, (C1418910n1l) aCListenerS87S0300000_22.l0);
    }

    public static final void onClick$4(ACListenerS87S0300000_22 aCListenerS87S0300000_22, View view) {
        InterfaceC1419090n23 interfaceC1419090n23 = (InterfaceC1419090n23) aCListenerS87S0300000_22.l0;
        if (interfaceC1419090n23 != null) {
            interfaceC1419090n23.LIZ((C1412800mru) aCListenerS87S0300000_22.l1, ((C1419030n1x) aCListenerS87S0300000_22.l2).getPosition());
        }
    }

    public ACListenerS87S0300000_22(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
