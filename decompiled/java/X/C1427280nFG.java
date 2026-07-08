package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427280nFG extends AbstractC1664490tPr<C1424190nAH, C1424250nAN> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 410));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 411));
    public C1749260vca LLJJJJJIL;
    public View LLJJJJLIIL;
    public AwS566S0100000_22 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    public final void LLLLLJIL() {
        C1749260vca c1749260vca;
        C0I7D editTextView;
        CharSequence hint;
        String string;
        String string2;
        C0I7D editTextView2;
        Editable editableLLLLJI;
        String string3;
        C1749260vca c1749260vca2 = this.LLJJJJJIL;
        String string4 = null;
        if (c1749260vca2 != null && (editTextView2 = c1749260vca2.getEditTextView()) != null && (editableLLLLJI = C2204961BRm.LLLLJI(editTextView2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDFbEH4flThJDIhBUZ373mzt6jyZ2JbNG8f+I=", null))) != null && (string3 = editableLLLLJI.toString()) != null) {
            string4 = a0.LJLIIIL(string3).toString();
        }
        String str = "";
        if (string4 == null) {
            string4 = "";
        }
        if (string4.length() > 0) {
            str = string4;
        } else if (this.LLJJLIIIJLLLLLLLZ && (c1749260vca = this.LLJJJJJIL) != null && (editTextView = c1749260vca.getEditTextView()) != null && (hint = editTextView.getHint()) != null && (string = hint.toString()) != null && (string2 = a0.LJLIIIL(string).toString()) != null) {
            str = string2;
        }
        LLLLIL().LIZJ.invoke(str);
    }

    public final void LLLLLJLJLL(boolean z) {
        C0I7D editTextView;
        C1749260vca c1749260vca = this.LLJJJJJIL;
        if (c1749260vca != null && (editTextView = c1749260vca.getEditTextView()) != null) {
            if (z) {
                editTextView.requestFocus();
                KeyboardUtils.LIZLLL(editTextView);
            } else {
                KeyboardUtils.LIZIZ(editTextView);
                editTextView.clearFocus();
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String string;
        C0GXH c0gxh;
        super.onActivityCreated(bundle);
        View view = this.mView;
        if ((view instanceof C0GXH) && (c0gxh = (C0GXH) view) != null) {
            c0gxh.setOnTouchEventDispatch(new AwS601S0100000_22(this, 271));
        }
        this.LLJJJJLIIL = this.mView.findViewById(R.id.jq6);
        C1749260vca c1749260vca = (C1749260vca) this.mView.findViewById(R.id.u78);
        this.LLJJJJJIL = c1749260vca;
        C0I7D editTextView = c1749260vca.getEditTextView();
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            string = sceneContext.getString(2131850056);
        } else {
            string = null;
        }
        editTextView.setHint(string);
        editTextView.setFilters((InputFilter[]) C13DL.LJIIIIZZ(new InputFilter() { // from class: X.07k3
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                CharSequence charSequenceSubSequence;
                if (i3 == 0) {
                    CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, i2);
                    int length = charSequenceSubSequence2.length();
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            if (!C1244080iTm.LJ(charSequenceSubSequence2.charAt(i5))) {
                                charSequenceSubSequence = charSequenceSubSequence2.subSequence(i5, charSequenceSubSequence2.length());
                                break;
                            }
                            i5++;
                        } else {
                            charSequenceSubSequence = "";
                            break;
                        }
                    }
                    if (charSequenceSubSequence.length() < charSequenceSubSequence2.length()) {
                        return charSequenceSubSequence;
                    }
                    return null;
                }
                return null;
            }
        }, editTextView.getFilters()));
        editTextView.addTextChangedListener(new C1466740oGu(this, 1));
        editTextView.setOnEditorActionListener(new C1466600oGg(this, 1));
        editTextView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1466640oGk(this, 1));
        C1427310nFJ c1427310nFJ = new C1427310nFJ();
        c1427310nFJ.LIZIZ(EnumC1070180dxI.SECONDARY);
        c1427310nFJ.LJI = R.raw.icon_chevron_left_ltr;
        TuxIconView tuxIconView = c1427310nFJ.LJII;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_chevron_left_ltr);
        }
        c1427310nFJ.LIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0);
        C1466570oGd c1466570oGd = new C1466570oGd(this, 21);
        c1427310nFJ.LJFF = c1466570oGd;
        TuxIconView tuxIconView2 = c1427310nFJ.LJII;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, c1466570oGd);
        }
        c1749260vca.setStartAction(c1427310nFJ);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nEJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1424190nAH) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 288));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nEz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424190nAH) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 262));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nEN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424190nAH) obj).LIZLLL;
            }
        }, new AwS601S0100000_22(this, 291));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nEM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424190nAH) obj).LJ;
            }
        }, new AwS601S0100000_22(this, 267));
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(149));
        C1664590tQ1.LIZLLL(this, null, false, new AwS601S0100000_22(this, 280), 3);
        C1664600tQ2.LIZ(this, null, new AwS601S0100000_22(this, 285));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(C1425570nCV.LIZIZ.LIZLLL());
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.fs9, viewGroup, false);
    }
}
