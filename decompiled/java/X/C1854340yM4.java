package X;

import Y.ACListenerS129S0200000_27;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.view.TakoInputExpandTextViewFragment;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditBottomInputPromptItemCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS155S0400000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yM4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854340yM4 extends LinearLayout {
    public final C0I7D LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public Function1<? super String, Unit> LLJIJIL;
    public TakoInputExpandTextViewFragment LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public boolean LLJILLL;
    public Function0<Unit> LLJJ;
    public Function0<Unit> LLJJI;
    public Function0<Unit> LLJJIII;
    public Function0<Unit> LLJJIJI;

    private final boolean getHasImageStyleSelected() {
        C1854260yLw.LIZ.getClass();
        return C1854260yLw.LJIIJJI != null;
    }

    private final boolean getSendButtonEnabled() {
        Editable editableLLLLJI;
        String string;
        C1854260yLw.LIZ.getClass();
        if (!C1854260yLw.LJFF()) {
            if (!C1854260yLw.LJI()) {
                return true;
            }
            C0I7D c0i7d = this.LL;
            return (this.LLJ && !(c0i7d != null && (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA0yZP5SGk0u70KzM2C1bcUL93MSPufveHmvHesfuUlNXDDEIv53c4PNLwNmfvxDKnxQ==", null))) != null && (string = editableLLLLJI.toString()) != null && C123100dR.LIZ(string) && a0.LJLIIIL(string).toString().length() == 0)) || this.LLJI;
        }
        if (!this.LLJ && !this.LLJI) {
            return false;
        }
        if (!getHasImageStyleSelected() || this.LLJI || this.LLJ) {
            return !this.LLJ || this.LLJI || getHasImageStyleSelected();
        }
        return false;
    }

    public final void LIZIZ() {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C786410Ut5.LJLLLLLL(getSendButtonEnabled() ? 0 : 8, tuxIconView);
        }
        TakoInputExpandTextViewFragment takoInputExpandTextViewFragment = this.LLJILJIL;
        if (takoInputExpandTextViewFragment != null) {
            takoInputExpandTextViewFragment.SR(getSendButtonEnabled());
        }
    }

    public final String LIZ(String str) {
        ConvertStyleItem convertStyleItem;
        String str2;
        String str3;
        ConvertStyleItem convertStyleItem2;
        C1854260yLw.LIZ.getClass();
        if (C1854260yLw.LJFF() && this.LLJ && getHasImageStyleSelected()) {
            if (this.LLJI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(' ');
                C06X5 c06x5 = C1854260yLw.LJIIJJI;
                if (c06x5 != null && (convertStyleItem2 = c06x5.LLILLL) != null) {
                    str3 = convertStyleItem2.stylePromptContent;
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            C06X5 c06x52 = C1854260yLw.LJIIJJI;
            if (c06x52 != null && (convertStyleItem = c06x52.LLILLL) != null && (str2 = convertStyleItem.stylePromptContent) != null) {
                return str2;
            }
            return "";
        }
        return str;
    }

    public final void setDefaultInputText(String str) {
        int length;
        C0I7D c0i7d = this.LL;
        if (c0i7d != null) {
            c0i7d.setText(str);
        }
        C0I7D c0i7d2 = this.LL;
        if (c0i7d2 != null) {
            if (str != null) {
                length = str.length();
            } else {
                length = 0;
            }
            c0i7d2.setSelection(length);
        }
    }

    public final void setEditTextHeightChangeListener(Function0<Unit> function0) {
        this.LLJILJILJ = function0;
    }

    public final void setExpandInputFragmentDismissListener(Function0<Unit> function0) {
        this.LLJJIJI = function0;
    }

    public final void setExpandInputFragmentShowListener(Function0<Unit> function0) {
        this.LLJJIII = function0;
    }

    public final void setHasImageSelected(boolean z) {
        C0I7D c0i7d;
        String string;
        this.LLJ = z;
        LIZIZ();
        C0I7D c0i7d2 = this.LL;
        if (c0i7d2 != null) {
            C1854260yLw.LIZ.getClass();
            if (C1854260yLw.LJFF()) {
                if (this.LLJ) {
                    string = getContext().getString(2131849907);
                } else {
                    string = getContext().getString(2131849908);
                }
            } else if (!C1854260yLw.LJI() && this.LLJ) {
                string = getContext().getString(2131849907);
            } else {
                string = getContext().getString(2131849908);
            }
            c0i7d2.setHint(string);
        }
        C1854260yLw.LIZ.getClass();
        if (C1854260yLw.LJI() && z && (c0i7d = this.LL) != null) {
            HandlerHook.viewPostDelay(c0i7d, new ARunnableS124S0100000_24(c0i7d, 89), 300L);
        }
    }

    public final void setOnSendButtonClickListener(Function1<? super String, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setStylePanelDismissListener(Function0<Unit> function0) {
        this.LLJJ = function0;
    }

    public final void setStylePanelShowListener(Function0<Unit> function0) {
        this.LLJJI = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v32, types: [T, java.util.List] */
    public C1854340yM4(Context context, AttributeSet attributeSet) {
        String string;
        T arrayList;
        String str;
        ConvertStyleItem convertStyleItem;
        TakoSug takoSug;
        List<String> list;
        String str2;
        super(context, attributeSet, 0);
        View viewInflate = LinearLayout.inflate(context, R.layout.frk, this);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
        viewInflate.setBackground(c384050F3z.LIZ(context));
        View viewFindViewById = findViewById(R.id.x8r);
        C1842270y2b c1842270y2b = (C1842270y2b) viewFindViewById;
        c1842270y2b.setOnHeightChangedListener(new AwS571S0100000_27(this, 1021));
        c1842270y2b.addTextChangedListener(new C1864780ycu(this, c1842270y2b, 1));
        this.LL = (C0I7D) viewFindViewById;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.x90);
        C786410Ut5.a9(tuxIconView, new ACListenerS129S0200000_27(context, this, 20));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a0r);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        tuxIconView.setTuxIcon(c419910GdJ);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        tuxIconView.setBackground(c384050F3z2.LIZ(context));
        this.LLILLJJLI = tuxIconView;
        TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.x8s);
        C786410Ut5.a9(tuxIconView2, new ACListenerS129S0200000_27(context, this, 21));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_chevron_expand;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        tuxIconView2.setTuxIcon(c419910GdJ2);
        this.LLILLL = tuxIconView2;
        LIZIZ();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.x8t);
        C1854260yLw.LIZ.getClass();
        if (C1854260yLw.LJFF()) {
            C0DSB.LIZJ(viewOnAttachStateChangeListenerC20604515jv);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context, 0, false));
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoImageEditBottomInputPromptItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1864530ycV(context, 5));
            C259800zU c259800zU = new C259800zU();
            AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(this, 316);
            C1852650yJL c1852650yJL = C1854260yLw.LIZIZ;
            if (c1852650yJL != null && (takoSug = c1852650yJL.LIZLLL) != null && (list = takoSug.sugList) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                int i = 0;
                for (String str3 : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str4 = str3;
                        Integer num = takoSug.sugSource;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('\"');
                        sbLIZ.append(str4);
                        sbLIZ.append('\"');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C1852650yJL c1852650yJL2 = C1854260yLw.LIZIZ;
                        if (c1852650yJL2 != null) {
                            str2 = c1852650yJL2.LJ;
                        } else {
                            str2 = null;
                        }
                        arrayList.add(new C1854370yM7(Integer.valueOf(i), num, str4, new C1854350yM5(awS606S0100000_27, str4, takoSug, i), 0, strLIZIZ, (Integer) null, (String) null, str2, 418));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c259800zU.element = arrayList;
            C1854260yLw c1854260yLw = C1854260yLw.LIZ;
            AwS155S0400000_27 awS155S0400000_27 = new AwS155S0400000_27(this, (C1854340yM4) context, (Context) c259800zU, (C259800zU<List<C1854370yM7>>) viewOnAttachStateChangeListenerC20604515jv, (ViewOnAttachStateChangeListenerC20604515jv) 2);
            c1854260yLw.getClass();
            String strLJII = C1857750yRZ.LJII(2131849631);
            C06X5 c06x5 = C1854260yLw.LJIIJJI;
            if (c06x5 != null && (convertStyleItem = c06x5.LLILLL) != null) {
                str = convertStyleItem.picUrl;
            } else {
                str = null;
            }
            c259800zU.element = C13LP.LJLIL((Iterable) c259800zU.element, Collections.singletonList(new C1854370yM7((Integer) null, (Integer) null, (String) null, new AwS571S0100000_27(awS155S0400000_27, 1020), 1, strLJII, Integer.valueOf(R.raw.icon_convert), str, (String) null, 527)));
            viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL((Collection) c259800zU.element, null);
        } else if (C1854260yLw.LJI()) {
            C339190DRl.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
        }
        this.LLILZ = viewOnAttachStateChangeListenerC20604515jv;
        View viewFindViewById2 = findViewById(R.id.x8p);
        C1854260yLw.LIZ.getClass();
        if (C1854260yLw.LJFF()) {
            C0DSB.LIZJ(viewFindViewById2);
        } else if (C1854260yLw.LJI()) {
            C339190DRl.LIZIZ(viewFindViewById2);
        }
        this.LLILZIL = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.x8o);
        this.LLILZLL = viewFindViewById3;
        if (viewFindViewById3 != null) {
            C1852670yJN.LIZ.getClass();
            if (C1852670yJN.LIZ() && C1854260yLw.LJFF != null) {
                C426750GoL.LJIIIZ(viewFindViewById3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, 0, null, false, 26);
            } else {
                C426750GoL.LJIIIZ(viewFindViewById3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 26);
            }
        }
        C1852670yJN.LIZ.getClass();
        if (C1852670yJN.LIZ()) {
            View viewFindViewById4 = findViewById(R.id.x92);
            this.LLIZ = viewFindViewById4;
            SmartImageView smartImageView = (SmartImageView) findViewById(R.id.x94);
            TextView textView = (TextView) findViewById(R.id.x95);
            this.LLIZLLLIL = findViewById(R.id.x93);
            CreativeTemplate creativeTemplateLIZJ = C1854260yLw.LIZJ();
            if (creativeTemplateLIZJ != null) {
                if (viewFindViewById4 != null) {
                    C0DSB.LIZJ(viewFindViewById4);
                }
                if (smartImageView != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(creativeTemplateLIZJ.pictureUrl);
                    c1331670kl3LJIIIZ.LJJ(smartImageView);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
                    c1331670kl3LJIIIZ.LJJIIZI(numLIZJ != null ? new ColorDrawable(numLIZJ.intValue()) : null);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
                if (textView != null) {
                    Integer num2 = creativeTemplateLIZJ.templateType;
                    if (num2 != null && num2.intValue() == 2) {
                        string = context.getString(2131849875);
                    } else {
                        string = context.getString(2131849873);
                    }
                    textView.setText(string);
                    return;
                }
                return;
            }
            if (viewFindViewById4 == null) {
                return;
            }
            C339190DRl.LIZIZ(viewFindViewById4);
        }
    }
}
