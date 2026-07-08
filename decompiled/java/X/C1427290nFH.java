package X;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS60S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427290nFH extends AbstractC1664490tPr<C1426330nDj, C1426370nDn> {
    public C1427320nFK LLJJJIL;

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this, new C1466910oHB(this, 0));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C1749260vca c1749260vca;
        String string;
        super.onViewCreated(view, bundle);
        C1427320nFK c1427320nFK = this.LLJJJIL;
        if (c1427320nFK != null && (c1749260vca = c1427320nFK.LLILLJJLI) != null) {
            C0I7D editTextView = c1749260vca.getEditTextView();
            Context sceneContext = getSceneContext();
            String string2 = null;
            if (sceneContext != null) {
                string = sceneContext.getString(2131834082);
            } else {
                string = null;
            }
            editTextView.setHint(string);
            editTextView.setFilters((InputFilter[]) C13DL.LJIIIIZZ(new InputFilter() { // from class: X.07k2
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
            editTextView.addTextChangedListener(new C1466740oGu(this, 0));
            editTextView.setOnEditorActionListener(new C1466600oGg(this, 0));
            editTextView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1466640oGk(this, 0));
            C1427300nFI c1427300nFI = new C1427300nFI();
            c1427300nFI.LIZIZ(EnumC1070180dxI.SECONDARY);
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 != null) {
                string2 = sceneContext2.getString(2131834081);
            }
            c1427300nFI.LJI = string2;
            TuxTextView tuxTextView = c1427300nFI.LJII;
            if (tuxTextView != null) {
                tuxTextView.setText(string2);
            }
            c1427300nFI.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0);
            C1466570oGd c1466570oGd = new C1466570oGd(this, 11);
            c1427300nFI.LJFF = c1466570oGd;
            TuxTextView tuxTextView2 = c1427300nFI.LJII;
            if (tuxTextView2 != null) {
                C786410Ut5.h9(tuxTextView2, c1466570oGd);
            }
            c1749260vca.setEndAction(c1427300nFI);
            c1749260vca.setOnClickClearListener(new AkS60S0200000_22(c1749260vca, this, 0));
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nDp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426330nDj) obj).LIZ;
            }
        }, new AwS601S0100000_22(this, 77));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nEy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426330nDj) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 78));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f902eo5, viewGroup, false);
        if (viewTd != null) {
            C1749260vca c1749260vca = (C1749260vca) viewTd;
            this.LLJJJIL = new C1427320nFK(c1749260vca, c1749260vca);
            return c1749260vca;
        }
        throw new NullPointerException("rootView");
    }
}
