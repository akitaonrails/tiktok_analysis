package X;

import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.List;

/* JADX INFO: renamed from: X.124U, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C124U extends C124T {
    public static final /* synthetic */ int LLLLLJIL = 0;
    public View.OnClickListener LLLLJI;
    public final BPEAHandler LLLLL;
    public ARunnableS104S0100000_4 LLLLLIL;
    public int LLLLLILLIL;

    @Override // X.C124T
    public final void LJIJ() {
    }

    @Override // X.C124T
    public final void LJJIIJ() {
    }

    @Override // X.C124T
    public int getLayoutRes() {
        return R.layout.c55;
    }

    @Override // X.C124T
    public final void LJIIZILJ() {
        View view = this.LLILLJJLI;
        C196964124k c196964124k = view != null ? (C196964124k) view.findViewById(R.id.xqd) : null;
        this.LLLJ = c196964124k;
        if (c196964124k != null) {
            c196964124k.setOnTextSizeChangedListener(new C0FM5() { // from class: X.124c
                @Override // X.C0FM5
                public final void LIZ() {
                    C124Q c124q = this.LIZ.LLILLL;
                    if (c124q != null) {
                        c124q.LLJL = false;
                    }
                }
            });
        }
        int[] iArr = C196962124i.LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            int[] iArr2 = (int[]) SettingsManager.LJII("textmode_font_size_slider_value_range", int[].class);
            if (iArr2 != null) {
                iArr = iArr2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLLJ.LJIIIIZZ(20, C13LQ.LJJIIJ(0, iArr), C13LQ.LJJIIJ(1, iArr));
        this.LLILLL.setMinTextSize(15);
    }

    @Override // X.C124T
    public int getSafeAreaHeight() {
        int i = this.LLLLLILLIL;
        if (i > 0) {
            return i;
        }
        Context context = getContext();
        if (context == null) {
            return 0;
        }
        return C1336100ksC.LIZIZ(context) - ((C1336100ksC.LIZLLL(context) + ((int) C0JAI.LJI(56.0f, context))) + ((int) C0JAI.LJI(185.0f, context)));
    }

    @Override // X.C124T
    public final int LJI() {
        return C444960Hcc.LIZJ(getContext()) ? 3 : 1;
    }

    @Override // X.C124T
    public final void LJIILL() {
        super.LJIILL();
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TextView textView = (TextView) this.LLILLJJLI.findViewById(R.id.tv_sure);
        C124Q c124q = this.LLILLL;
        if (c124q != null) {
            c124q.addTextChangedListener(new C12YZ(this, textView, 0));
        }
    }

    @Override // X.C124T
    public int getScene() {
        return super.getScene();
    }

    private final void setRealSafeAreaHeight(int i) {
        C124R c124r;
        this.LLLLLILLIL = i;
        C124Q c124q = this.LLILLL;
        if ((c124q instanceof C124R) && (c124r = (C124R) c124q) != null) {
            c124r.setSafeAreaHeight(i);
        }
    }

    @Override // X.C124T
    public final void LIZIZ(int i) {
        C124Q c124q = this.LLILLL;
        if (c124q != null) {
            c124q.LJIILJJIL(this.LLJILJILJ, i);
        }
        this.LLJJI = i;
        C197010126e.LIZ.getClass();
        C197010126e.LJI = Integer.valueOf(i);
        C197010126e.LJIIL().storeInt("text_color", i);
    }

    @Override // X.C124T
    public final void LIZJ(TextFontStyleData textFontStyleData) {
        String str;
        String str2;
        String str3;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name:");
        String str4 = null;
        if (textFontStyleData != null) {
            str = textFontStyleData.fileName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", type: ");
        if (textFontStyleData != null) {
            str2 = textFontStyleData.fontName;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        C197010126e c197010126e = C197010126e.LIZ;
        if (textFontStyleData != null) {
            str3 = textFontStyleData.fileName;
        } else {
            str3 = null;
        }
        c197010126e.getClass();
        C197010126e.LJFF = str3;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C197010126e.LJIIL().erase("font_name");
        } else {
            C197010126e.LJIIL().storeString("font_name", str3);
        }
        C124Q c124q = this.LLILLL;
        if (c124q != null) {
            if (textFontStyleData != null) {
                str4 = textFontStyleData.fileName;
            }
            c124q.LJIIJJI(str4);
        }
    }

    @Override // X.C124T
    public final int LIZLLL(int i) {
        int iLJI = LJI();
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 1;
                }
                return iLJI;
            }
            return 3;
        }
        return 2;
    }

    @Override // X.C124T
    public final String LJIIL(List<TextStickerTextWrap> list) {
        boolean z;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (list.size() > 1) {
            int size = list.size() - 2;
            if (size >= 0) {
                while (true) {
                    sb.append(((TextStickerTextWrap) ListProtector.get(list, i)).safeStrPair().first);
                    sb.append("\n");
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            sb.append(((TextStickerTextWrap) ListProtector.get(list, list.size() - 1)).safeStrPair().first);
        } else {
            sb.append(((TextStickerTextWrap) ListProtector.get(list, 0)).safeStrPair().first);
        }
        return sb.toString();
    }

    @Override // X.C124T
    public final void LJIILLIIL(View view) {
        ImageView imageView;
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.l_a)) != null) {
            C786410Ut5.LJZI(0, imageView);
            imageView.setImageResource(R.drawable.bx6);
            C786410Ut5.Q7(imageView, new AkS95S0100000_29(this, 45));
        }
    }

    public final void setBackEventCallBack(View.OnClickListener onClickListener) {
        this.LLLLJI = onClickListener;
    }

    @Override // X.C124T
    public void setSafeAreaHeight(int i) {
        setRealSafeAreaHeight(i - ((int) C0JAI.LJI(140.0f, getContext())));
    }

    public C124U(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLLL = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // X.C124T
    public final void LJIL(List<TextStickerTextWrap> list, List<? extends InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, Integer num, boolean z2, boolean z3) {
        int iIntValue;
        if (TextUtils.isEmpty(str)) {
            C197010126e c197010126e = C197010126e.LIZ;
            str = C197010126e.LJFF;
            if (str == null) {
                c197010126e.getClass();
                str = C197010126e.LJIIL().getString("font_name", null);
            } else {
                c197010126e.getClass();
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = C0FI2.LJIJJ().LJIILJJIL();
        }
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        if (z) {
            C0FRI c0fri = this.LLJ;
            if (c0fri != null) {
                c0fri.LIZIZ();
                c0fri.setSelectColorView(i2);
            }
            LJ();
            i3 = LJI();
            C197010126e.LIZ.getClass();
            Integer num2 = C197010126e.LJI;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = C197010126e.LJIIL().getInt("text_color", -1);
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (numValueOf != null) {
                i2 = numValueOf.intValue();
            }
            if (this.LLILLL.getEditFontSize() > 0) {
                i4 = this.LLILLL.getEditFontSize();
            } else {
                i4 = 20;
            }
            i = 1;
        }
        super.LJIL(list, list2, i, i2, i3, str, false, i4, i5, null, false, false);
    }

    @Override // X.C124T
    public final void LJJII(List<TextStickerTextWrap> list, List<? extends InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, String str2, Integer num, boolean z2, boolean z3) {
        super.LJJII(list, list2, i, i2, i3, str, z, i4, i5, str2, null, false, false);
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }
}
