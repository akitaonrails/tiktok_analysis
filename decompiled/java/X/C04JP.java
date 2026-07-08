package X;

import android.text.Editable;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04JP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JP implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) throws Throwable {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
            case 4:
                onFocusChange$4(this, view, z);
                break;
            case 5:
                onFocusChange$5(this, view, z);
                break;
            case 6:
                onFocusChange$6(this, view, z);
                break;
        }
    }

    public C04JP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(C04JP c04jp, View view, boolean z) {
        String str;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("hasFocus: " + z);
        if (z) {
            SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) c04jp.l0;
            subPaymentListAssem.LLJJIII = String.valueOf(C2204961BRm.LLLLJI(subPaymentListAssem.Ho(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35YltJ6zS44YdYsV6l0kQTwMM8x7baLzf51Mg4Q2Oyg==", null)));
            ((SubPaymentListAssem) c04jp.l0).LLJJI = System.currentTimeMillis();
            C926303jh c926303jh = ((SubPaymentListAssem) c04jp.l0).Jo().LLILZIL;
            c926303jh.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c926303jh.LIZ);
            C1018703yb.LIZIZ("tiktokec_input_click", linkedHashMap);
            return;
        }
        String strValueOf = String.valueOf(C2204961BRm.LLLLJI(((SubPaymentListAssem) c04jp.l0).Ho(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35YltJ6zS44YdYsV6l0kQTwMM8x7baLzf51Mg4Q2Oyg==", null)));
        long jCurrentTimeMillis = System.currentTimeMillis() - ((SubPaymentListAssem) c04jp.l0).LLJJI;
        int length = strValueOf.length() - ((SubPaymentListAssem) c04jp.l0).LLJJIII.length();
        if (length > 0) {
            str = "add";
        } else if (length < 0) {
            str = "del";
        } else {
            str = "";
        }
        C926303jh c926303jh2 = ((SubPaymentListAssem) c04jp.l0).Jo().LLILZIL;
        c926303jh2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(c926303jh2.LIZ);
        linkedHashMap2.put("stay_time", String.valueOf(jCurrentTimeMillis));
        linkedHashMap2.put("input_method", str);
        C1018703yb.LIZIZ("tiktokec_input_staytime", linkedHashMap2);
    }

    public static final void onFocusChange$1(C04JP c04jp, View view, boolean z) {
        List<String> listInvoke;
        ((C933403kq) c04jp.l0).LLILLJJLI.LJIILLIIL(z);
        ((C933403kq) c04jp.l0).setTextHasFocus(z);
        ((C933403kq) c04jp.l0).getOnFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((C933403kq) c04jp.l0).LJ(null);
            ((C933403kq) c04jp.l0).getOnErrorClear().invoke();
            return;
        }
        String strInvoke = ((C933403kq) c04jp.l0).getOnVerify().invoke(((C933403kq) c04jp.l0).getValue());
        if (strInvoke != null) {
            ((C933403kq) c04jp.l0).LJ(strInvoke);
        }
        String currentPaymentId = ((C933403kq) c04jp.l0).getCurrentPaymentId();
        if (currentPaymentId != null && currentPaymentId.length() != 0) {
            return;
        }
        C933403kq c933403kq = (C933403kq) c04jp.l0;
        Function0<List<String>> iconsProvider = c933403kq.getIconsProvider();
        if (iconsProvider == null || (listInvoke = iconsProvider.invoke()) == null) {
            listInvoke = C13BV.INSTANCE;
        }
        c933403kq.LJII(listInvoke);
    }

    public static final void onFocusChange$2(C04JP c04jp, View view, boolean z) {
        ((C942603mK) c04jp.l0).LLILLJJLI.LJIILLIIL(z);
        ((C942603mK) c04jp.l0).getFocusChange().invoke(Boolean.valueOf(z));
        ((C942603mK) c04jp.l0).setTextHasFocus(z);
        if (z) {
            ((C942603mK) c04jp.l0).LJ(null);
            ((C942603mK) c04jp.l0).getOnErrorClear().invoke();
        } else {
            String strInvoke = ((C942603mK) c04jp.l0).getOnVerify().invoke(((C942603mK) c04jp.l0).getValue());
            if (strInvoke == null) {
                return;
            }
            ((C942603mK) c04jp.l0).LJ(strInvoke);
        }
    }

    public static final void onFocusChange$3(C04JP c04jp, View view, boolean z) {
        ((C943103mP) c04jp.l0).LLILLJJLI.LJIILLIIL(z);
        ((C943103mP) c04jp.l0).getOnFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((C943103mP) c04jp.l0).LJ(null);
            ((C943103mP) c04jp.l0).getOnErrorClear().invoke();
            ((C943103mP) c04jp.l0).getEditText().setSelection(C2204961BRm.LLJILLL(((C943103mP) c04jp.l0).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde58Xh1Pqa6kfbPVpZa9a69E+bKvt", null)).length());
            return;
        }
        String strInvoke = ((C943103mP) c04jp.l0).getOnVerify().invoke(((C943103mP) c04jp.l0).getValue());
        if (strInvoke == null) {
            return;
        }
        ((C943103mP) c04jp.l0).LJ(strInvoke);
    }

    public static final void onFocusChange$4(C04JP c04jp, View view, boolean z) {
        ((C941803mC) c04jp.l0).getOnFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((C941803mC) c04jp.l0).LIZIZ();
            ((C941803mC) c04jp.l0).getOnErrorClear().invoke();
            return;
        }
        String strInvoke = ((C941803mC) c04jp.l0).getOnVerify().invoke(((C941803mC) c04jp.l0).getValue());
        if (strInvoke != null) {
            ((C941803mC) c04jp.l0).LJFF(new C1745340vWG(strInvoke, null, false, null, null, 30));
        } else {
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_osp_fill_cvv_event", "{}");
        }
    }

    public static final void onFocusChange$5(C04JP c04jp, View view, boolean z) throws Throwable {
        ((C941003m4) c04jp.l0).setTextHasFocus(z);
        ((C941003m4) c04jp.l0).getFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((C941003m4) c04jp.l0).LIZIZ();
            ((C941003m4) c04jp.l0).getOnErrorClear().invoke();
        } else {
            Editable editableLLLLJI = C2204961BRm.LLLLJI(((C941003m4) c04jp.l0).getInputWithIndicatorEditTextFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35YxxIKud/4cdYdQ6sKp2JjPA42b0LEIGfxxR6r1SiA==", null));
            if (editableLLLLJI == null || editableLLLLJI.length() == 0) {
                C941003m4 c941003m4 = (C941003m4) c04jp.l0;
                C941003m4.LJIIIZ(c941003m4, c941003m4.getAllCardIcons());
            }
            String strInvoke = ((C941003m4) c04jp.l0).getOnVerify().invoke(((C941003m4) c04jp.l0).getValue());
            if (strInvoke != null) {
                ((C941003m4) c04jp.l0).LJFF(new C1745340vWG(strInvoke, null, false, null, null, 30));
            }
        }
        String currentPaymentId = ((C941003m4) c04jp.l0).getCurrentPaymentId();
        if (currentPaymentId == null || currentPaymentId.length() == 0) {
            C941003m4.LJIIIZ((C941003m4) c04jp.l0, C13BV.INSTANCE);
        }
    }

    public static final void onFocusChange$6(C04JP c04jp, View view, boolean z) {
        if (z) {
            ((C942303mH) c04jp.l0).LIZIZ();
            ((C942303mH) c04jp.l0).getOnErrorClear().invoke();
        } else {
            String strInvoke = ((C942303mH) c04jp.l0).getOnVerify().invoke(((C942303mH) c04jp.l0).getValue());
            if (strInvoke == null) {
                return;
            }
            ((C942303mH) c04jp.l0).LJFF(new C1745340vWG(strInvoke, null, false, null, null, 30));
        }
    }
}
