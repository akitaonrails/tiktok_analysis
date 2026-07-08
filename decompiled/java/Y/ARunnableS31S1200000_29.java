package Y;

import X.AnonymousClass1214;
import X.AnonymousClass1219;
import X.AnonymousClass1230;
import X.AnonymousClass1248;
import X.C0KW6;
import X.C0WZX;
import X.C121M;
import X.C121R;
import X.C122B;
import X.C122P;
import X.C123V;
import X.C123W;
import X.C12K4;
import X.C196871120v;
import X.C196874120y;
import X.C196878121c;
import X.C196899121x;
import X.C196925122x;
import X.C1C7U;
import X.C2204961BRm;
import X.C785410UrT;
import X.DialogC848920XRy;
import X.InterfaceC19472711Gj;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS31S1200000_29 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        StickerHintTextViewModel stickerHintTextViewModel = ((C122P) this.l1).LLJJIJIL;
        if (stickerHintTextViewModel == null) {
            stickerHintTextViewModel = null;
        }
        stickerHintTextViewModel.wQ2().postValue(new C122B(ScreenUtils.getScreenWidth(((C122P) this.l1).LLILZ.getContext()) / 2.0f, ((C196925122x) this.l2).getGuidanceRectBottom() + ((C122P) this.l1).LLLFF, 6, this.s0));
    }

    public final void LIZ$1() {
        Object parent = ((AnonymousClass1230) this.l1).LLILZ.getParent();
        if (parent != null) {
            AnonymousClass1230 anonymousClass1230 = (AnonymousClass1230) this.l1;
            View view = (View) parent;
            if (view.getTag() instanceof C123V) {
                C123V c123v = (C123V) view.getTag();
                if (!Intrinsics.LJFF(anonymousClass1230.LLLLJ, c123v)) {
                    anonymousClass1230.LLLLJ = c123v;
                    anonymousClass1230.LLLILZLLLI.setScaleInfo(anonymousClass1230.LLLLJ);
                }
            }
        }
        TextStickerData textStickerData = (TextStickerData) this.l2;
        if (textStickerData != null) {
            AnonymousClass1230 anonymousClass12302 = (AnonymousClass1230) this.l1;
            anonymousClass12302.LLLLIILLL = this.s0;
            anonymousClass12302.LLLLJI = new AnonymousClass1248(textStickerData.getTextWrapList());
            anonymousClass12302.LLLLIL = textStickerData.getEffectTextLayoutConfig();
            InnerEffectTextLayoutConfig effectTextLayoutConfig = textStickerData.getEffectTextLayoutConfig();
            textStickerData.setEffectTextLayoutConfig(effectTextLayoutConfig != null ? C12K4.LIZ(effectTextLayoutConfig, anonymousClass12302.LLLLJ.LIZ()) : null);
            anonymousClass12302.LIZIZ(textStickerData, false);
            C123W c123w = anonymousClass12302.LLLILZLLLI;
            c123w.getClass();
            c123w.setInnerLayoutConfig(textStickerData.getEffectTextLayoutConfig());
            if (c123w.LLLLLLIL != null) {
                c123w.setEffectText(textStickerData.getTextWrapList());
            } else {
                c123w.LJIL(textStickerData.getTextWrapList(), textStickerData.getInlineTextStyles(), textStickerData.getBgMode(), textStickerData.getColor(), textStickerData.getAlign(), textStickerData.getFontType(), false, textStickerData.getFontSize(), 0, null, textStickerData.isUseColorDropper(), textStickerData.isAdjustTextRollbar());
            }
        }
    }

    public static final void run$0(ARunnableS31S1200000_29 aRunnableS31S1200000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditTextStickerController@f6fd.addNewSticker$4");
        try {
            aRunnableS31S1200000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditTextStickerController@f6fd.addNewSticker$4");
    }

    public static final void run$1(ARunnableS31S1200000_29 aRunnableS31S1200000_29) {
        boolean zLIZ;
        C1C7U.LIZ("ImeServiceImpl@ce5f.updateKeyboardValue$1");
        try {
            EditText editText = (EditText) aRunnableS31S1200000_29.l1;
            if (editText != null) {
                editText.setText(aRunnableS31S1200000_29.s0);
            }
            EditText editText2 = (EditText) aRunnableS31S1200000_29.l1;
            if (editText2 != null) {
                editText2.setSelection(C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkjh+wulnh3d1aXyrGz0UnfM8Y1tSbv31a21ugw==", null)).length());
            }
            ((InterfaceC19472711Gj) aRunnableS31S1200000_29.l2).LIZ(0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImeServiceImpl@ce5f.updateKeyboardValue$1");
    }

    public static final void run$2(ARunnableS31S1200000_29 aRunnableS31S1200000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditEffectTextStickerController@67cd.showPreviewLayout$1");
        try {
            aRunnableS31S1200000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditEffectTextStickerController@67cd.showPreviewLayout$1");
    }

    public static final void run$3(ARunnableS31S1200000_29 aRunnableS31S1200000_29) {
        C0KW6 c0kw6;
        C196899121x c196899121x = (C196899121x) aRunnableS31S1200000_29.l1;
        AnonymousClass1219 anonymousClass1219 = (AnonymousClass1219) aRunnableS31S1200000_29.l2;
        String str = aRunnableS31S1200000_29.s0;
        c196899121x.getClass();
        C1C7U.LIZ("FTCInfoStickerHelper@ec40.initPinHelper$1$onFinish$1L");
        C196878121c c196878121c = c196899121x.LIZ.LLLFZ;
        C0KW6 c0kw62 = c196878121c.LJIIIZ;
        if (c0kw62 != null && c0kw62.isShowing() && (c0kw6 = c196878121c.LJIIIZ) != null) {
            c0kw6.dismiss();
            C785410UrT.LIZ(c0kw6);
        }
        if (anonymousClass1219 != null && !TextUtils.isEmpty(str)) {
            throw null;
        }
        c196899121x.LIZ.LLILLL.LLILZIL.LIZIZ(anonymousClass1219);
        C1C7U.LIZIZ("FTCInfoStickerHelper@ec40.initPinHelper$1$onFinish$1L");
    }

    public static final void run$4(ARunnableS31S1200000_29 aRunnableS31S1200000_29) {
        DialogC848920XRy dialogC848920XRy;
        DialogC848920XRy dialogC848920XRy2;
        C121R c121r = (C121R) aRunnableS31S1200000_29.l1;
        C196874120y c196874120y = (C196874120y) aRunnableS31S1200000_29.l2;
        String str = aRunnableS31S1200000_29.s0;
        c121r.getClass();
        C1C7U.LIZ("InfoStickerHelper@8ef8.initPinHelper$1$onFinish$1L");
        AnonymousClass1214 anonymousClass1214 = c121r.LIZ.LLLIIL;
        if (anonymousClass1214 != null && (dialogC848920XRy = anonymousClass1214.LJIIJ) != null && dialogC848920XRy.isShowing() && (dialogC848920XRy2 = anonymousClass1214.LJIIJ) != null) {
            dialogC848920XRy2.dismiss();
            C785410UrT.LIZ(dialogC848920XRy2);
        }
        if (c196874120y != null && !TextUtils.isEmpty(str)) {
            c196874120y.LLILLL.setPin(true);
        }
        C196871120v c196871120v = c121r.LIZ.LLILLL;
        if (c196871120v != null) {
            c196871120v.LLIZLLLIL.LJIIJJI(c196874120y);
        }
        C121M c121m = c121r.LIZ.LLLI;
        if (c121m != null) {
            c121m.LIZJ();
        }
        C1C7U.LIZIZ("InfoStickerHelper@8ef8.initPinHelper$1$onFinish$1L");
    }

    public ARunnableS31S1200000_29(C196899121x c196899121x, String str, int i) {
        this.$t = i;
        this.l1 = c196899121x;
        this.l2 = null;
        this.s0 = str;
    }

    public ARunnableS31S1200000_29(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
