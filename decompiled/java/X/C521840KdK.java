package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.mvp.PaidRoomCheckDialog;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubSpaceEditorAbility;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubSpaceEditorVM;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.model.PGCSubSpaceEditorAbility;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui.PGCSubSpaceEditorDialogFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.view.fragment.SubSpaceCustomPostEditFragment;
import com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS25S0202000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521840KdK implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$7(C521840KdK c521840KdK, Editable editable) {
    }

    public static final void beforeTextChanged$0(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
            case 8:
                afterTextChanged$8(this, editable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                afterTextChanged$9(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onTextChanged$9(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C521840KdK(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C521840KdK c521840KdK, Editable editable) {
        int length;
        TextView textView = (TextView) ((TakoWaitingListActivity) c521840KdK.l0).findViewById(R.id.xl1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (editable != null) {
            length = editable.length();
        } else {
            length = 0;
        }
        sbLIZ.append(length);
        sbLIZ.append("/200");
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void afterTextChanged$1(C521840KdK c521840KdK, Editable editable) throws Throwable {
        String string;
        boolean z;
        PaidRoomCheckDialog paidRoomCheckDialog = (PaidRoomCheckDialog) c521840KdK.l0;
        if (!paidRoomCheckDialog.isViewValid) {
            return;
        }
        Editable editableLLLFZ = C2204961BRm.LLLFZ(paidRoomCheckDialog.getEditViewFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5jz7uHu0b4XGRa0ioFiY3CLo9Epb8uk=", null));
        if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
            string = "";
        }
        paidRoomCheckDialog.mInput = string;
        PaidRoomCheckDialog paidRoomCheckDialog2 = (PaidRoomCheckDialog) c521840KdK.l0;
        paidRoomCheckDialog2.counts = paidRoomCheckDialog2.mInput.length();
        C16FS submitViewFromXml = ((PaidRoomCheckDialog) c521840KdK.l0).getSubmitViewFromXml();
        PaidRoomCheckDialog paidRoomCheckDialog3 = (PaidRoomCheckDialog) c521840KdK.l0;
        if (!paidRoomCheckDialog3.mIsHide && paidRoomCheckDialog3.counts >= 4) {
            z = true;
        } else {
            z = false;
        }
        submitViewFromXml.setEnabled(z);
        PaidRoomCheckDialog paidRoomCheckDialog4 = (PaidRoomCheckDialog) c521840KdK.l0;
        if (paidRoomCheckDialog4.counts > 32) {
            ((PaidRoomCheckDialog) c521840KdK.l0).getEditViewFromXml().setText(paidRoomCheckDialog4.mInput.substring(0, 32));
            PaidRoomCheckDialog paidRoomCheckDialog5 = (PaidRoomCheckDialog) c521840KdK.l0;
            paidRoomCheckDialog5.counts = 32;
            paidRoomCheckDialog5.getEditViewFromXml().setSelection(32);
            PaidRoomCheckDialog paidRoomCheckDialog6 = (PaidRoomCheckDialog) c521840KdK.l0;
            paidRoomCheckDialog6.setCharLimit(paidRoomCheckDialog6.getEditViewFromXml(), 32);
            C786410Ut5.LL(0, ((PaidRoomCheckDialog) c521840KdK.l0).getWarnViewFromXml());
        } else {
            C786410Ut5.LL(8, paidRoomCheckDialog4.getWarnViewFromXml());
            PaidRoomCheckDialog paidRoomCheckDialog7 = (PaidRoomCheckDialog) c521840KdK.l0;
            paidRoomCheckDialog7.removeFilter(paidRoomCheckDialog7.getEditViewFromXml());
        }
        PaidRoomCheckDialog paidRoomCheckDialog8 = (PaidRoomCheckDialog) c521840KdK.l0;
        if (paidRoomCheckDialog8.isInput && paidRoomCheckDialog8.counts > 0) {
            paidRoomCheckDialog8.isInput = false;
        }
    }

    public static final void afterTextChanged$2(C521840KdK c521840KdK, Editable editable) {
        InterfaceC665370Q7z interfaceC665370Q7z = ((SubSpaceEditorVM) c521840KdK.l0).LLILLJJLI;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceEditorAbility subSpaceEditorAbility = (SubSpaceEditorAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceEditorAbility.class, null);
        if (subSpaceEditorAbility != null) {
            subSpaceEditorAbility.od();
        }
    }

    public static final void afterTextChanged$3(C521840KdK c521840KdK, Editable editable) {
        boolean z;
        if (editable != null && editable.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        PGCSubSpaceEditorDialogFragment pGCSubSpaceEditorDialogFragment = (PGCSubSpaceEditorDialogFragment) c521840KdK.l0;
        if (z) {
            View view = pGCSubSpaceEditorDialogFragment.LLIZLLLIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            View view2 = pGCSubSpaceEditorDialogFragment.LLIZLLLIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        C0JCO c0jco = ((PGCSubSpaceEditorDialogFragment) c521840KdK.l0).LLILLJJLI;
        if (c0jco != null) {
            if (editable != null) {
                editable.toString();
            }
            c0jco.Mc();
        }
    }

    public static final void afterTextChanged$4(C521840KdK c521840KdK, Editable editable) {
        InterfaceC665370Q7z interfaceC665370Q7z = ((com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM) c521840KdK.l0).LLILLJJLI;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        PGCSubSpaceEditorAbility pGCSubSpaceEditorAbility = (PGCSubSpaceEditorAbility) C1558520qew.LIZ(interfaceC665370Q7z, PGCSubSpaceEditorAbility.class, null);
        if (pGCSubSpaceEditorAbility != null) {
            pGCSubSpaceEditorAbility.od();
        }
    }

    public static final void afterTextChanged$5(C521840KdK c521840KdK, Editable editable) {
        boolean z;
        if (editable.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C470510Icj c470510Icj = null;
        if (z) {
            C786410Ut5.LLLLZLL(((GeoFencingSelectionActivity) c521840KdK.l0).LLLZ(), 8);
            C470510Icj c470510Icj2 = ((GeoFencingSelectionActivity) c521840KdK.l0).LLILZLL;
            if (c470510Icj2 != null) {
                c470510Icj = c470510Icj2;
            }
            c470510Icj.LLILZIL = "";
            c470510Icj.LLLII();
            c470510Icj.notifyDataSetChanged();
            return;
        }
        C786410Ut5.LLLLZLL(((GeoFencingSelectionActivity) c521840KdK.l0).LLLZ(), 0);
        C470510Icj c470510Icj3 = ((GeoFencingSelectionActivity) c521840KdK.l0).LLILZLL;
        if (c470510Icj3 != null) {
            c470510Icj = c470510Icj3;
        }
        c470510Icj.LLILZIL = editable.toString();
        c470510Icj.LLLII();
        c470510Icj.notifyDataSetChanged();
    }

    public static final void afterTextChanged$6(C521840KdK c521840KdK, Editable editable) {
        boolean z;
        if (editable.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C470510Icj c470510Icj = null;
        if (z) {
            C786410Ut5.LLLLZLL(((GeoFencingSelectionFragment) c521840KdK.l0).SR(), 8);
            C470510Icj c470510Icj2 = ((GeoFencingSelectionFragment) c521840KdK.l0).LLIZLLLIL;
            if (c470510Icj2 != null) {
                c470510Icj = c470510Icj2;
            }
            c470510Icj.LLILZIL = "";
            c470510Icj.LLLII();
            c470510Icj.notifyDataSetChanged();
            return;
        }
        C786410Ut5.LLLLZLL(((GeoFencingSelectionFragment) c521840KdK.l0).SR(), 0);
        C470510Icj c470510Icj3 = ((GeoFencingSelectionFragment) c521840KdK.l0).LLIZLLLIL;
        if (c470510Icj3 != null) {
            c470510Icj = c470510Icj3;
        }
        c470510Icj.LLILZIL = editable.toString();
        c470510Icj.LLLII();
        c470510Icj.notifyDataSetChanged();
    }

    public static final void afterTextChanged$8(C521840KdK c521840KdK, Editable editable) {
        C0K44 c0k44;
        String strValueOf = String.valueOf(editable);
        C511360K3q c511360K3q = (C511360K3q) c521840KdK.l0;
        C0K4G c0k4g = c511360K3q.LLILZLL;
        if (c0k4g != null && (c0k44 = c0k4g.LIZ) != null) {
            c0k44.LIZIZ = strValueOf;
        }
        c511360K3q.LLILLJJLI.IQ2();
    }

    public static final void afterTextChanged$9(C521840KdK c521840KdK, Editable editable) {
        int i;
        ((DrawGuessStartFragment) c521840KdK.l0).RR().setEnabled(!a0.LJJJIL(editable.toString()));
        DrawGuessStartFragment drawGuessStartFragment = (DrawGuessStartFragment) c521840KdK.l0;
        if (drawGuessStartFragment.LLJJIII) {
            drawGuessStartFragment.LLJJIII = false;
            return;
        }
        drawGuessStartFragment.LLJJI = false;
        String string = editable.toString();
        if (!Intrinsics.LJFF(drawGuessStartFragment.LLJJIJIIJIL, string)) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < string.length(); i4++) {
                if (new Regex("^[\\u4E00-\\u9FA5\\u3007\\uFA0E\\uFA0F\\uFA11\\uFA13\\uFA14\\uFA1F\\uFA21\\uFA23\\uFA24\\uFA27-\\uFA29\\u3004-\\u4DB5\\x{20000}-\\x{2A6D6}\\u9FA6-\\u9FB3\\u9FB4-\\u9FBB\\u9FBC-\\u9FC2\\u4039\\u9FC3\\x{2A700}-\\x{2B734}\\u9FC4-\\u9FCB\\x{2B740}-\\x{2B81D}\\u9FCC\\x{2B820}-\\x{2CEA1}\\u9FCD-\\u9FCF\\u4CA4\\u9FD0\\u9FD1-\\u9FD5\\x{2CEB0}-\\x{2EBE0}\\u9FD6-\\u9FEA\\u9FEB-\\u9FEF\\x{30000}-\\x{3134A}\\u9FF0-\\u9FFC\\u4DB6-\\u4DBF\\x{2A6D7}-\\x{2A6DD}\\x{31400}-\\x{33D1F}\\x{33E00}-\\x{355FF}]{0,}$").matches(String.valueOf(string.charAt(i4)))) {
                    i = 2;
                } else {
                    i = 1;
                }
                i2 += i;
                if (i2 > 15) {
                    C766270U4b.LIZLLL(2131841366);
                    drawGuessStartFragment.LLJJIJIIJIL = string.substring(0, i3);
                    drawGuessStartFragment.PR().setText(drawGuessStartFragment.LLJJIJIIJIL);
                    drawGuessStartFragment.PR().setSelection(String.valueOf(C2204961BRm.LLLFZ(drawGuessStartFragment.PR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl4iQ5gQpOwecRDs/gq5lfS27hzRCufHFDtUYeU+muc61pcf9u4X0jRpGUeVoQEsU=", null))).length());
                    return;
                }
                i3++;
            }
        }
    }

    public static final void onTextChanged$2(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
        SubSpaceEditorVM subSpaceEditorVM = (SubSpaceEditorVM) c521840KdK.l0;
        subSpaceEditorVM.getClass();
        subSpaceEditorVM.withState(new AwS25S0202000_7(subSpaceEditorVM, i3, charSequence, i, 0));
        if (charSequence != null && charSequence.length() > 140) {
            InterfaceC665370Q7z interfaceC665370Q7z = ((SubSpaceEditorVM) c521840KdK.l0).LLILLJJLI;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            SubSpaceEditorAbility subSpaceEditorAbility = (SubSpaceEditorAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceEditorAbility.class, null);
            if (subSpaceEditorAbility != null) {
                subSpaceEditorAbility.Jc(charSequence.subSequence(0, 140));
            }
        }
    }

    public static final void onTextChanged$4(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
        com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM subSpaceEditorVM = (com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM) c521840KdK.l0;
        subSpaceEditorVM.getClass();
        subSpaceEditorVM.withState(new AwS25S0202000_7(subSpaceEditorVM, i3, charSequence, i, 1));
        if (charSequence != null && charSequence.length() > 140) {
            InterfaceC665370Q7z interfaceC665370Q7z = ((com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM) c521840KdK.l0).LLILLJJLI;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            PGCSubSpaceEditorAbility pGCSubSpaceEditorAbility = (PGCSubSpaceEditorAbility) C1558520qew.LIZ(interfaceC665370Q7z, PGCSubSpaceEditorAbility.class, null);
            if (pGCSubSpaceEditorAbility != null) {
                pGCSubSpaceEditorAbility.Jc(charSequence.subSequence(0, 140));
            }
        }
    }

    public static final void onTextChanged$7(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        TextView textViewHS;
        int length;
        C0I7D c0i7dGS = ((SubSpaceCustomPostEditFragment) c521840KdK.l0).gS();
        if (c0i7dGS == null || (textViewHS = ((SubSpaceCustomPostEditFragment) c521840KdK.l0).hS()) == null) {
            return;
        }
        SubSpaceCustomPostEditFragment subSpaceCustomPostEditFragment = (SubSpaceCustomPostEditFragment) c521840KdK.l0;
        View viewFindViewById = subSpaceCustomPostEditFragment.LLJLIL;
        CharSequence charSequenceLJLIIIL = null;
        if (viewFindViewById == null) {
            View view = subSpaceCustomPostEditFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.f830xlp);
            } else {
                viewFindViewById = null;
            }
            subSpaceCustomPostEditFragment.LLJLIL = (TextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (charSequence != null && charSequence.length() > 300) {
            C0JCX.LIZLLL(((SubSpaceCustomPostEditFragment) c521840KdK.l0).getString(2131839334));
            c0i7dGS.setText(charSequence.subSequence(0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
            c0i7dGS.setSelection(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
        StringBuilder sb = new StringBuilder();
        Editable editableLLLLJI = C2204961BRm.LLLLJI(c0i7dGS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyWDU72fVAuS1kJclzonE/JMyt/d7Om6L4SFQ3itkBU5kKczBXM2BU1TQrPK/tT2f+LIhjJIp0eI6PSkjpLg5lTFUH2g==", null));
        if (editableLLLLJI != null) {
            length = editableLLLLJI.length();
        } else {
            length = 0;
        }
        sb.append(length);
        sb.append("/300");
        textView.setText(sb.toString());
        Editable editableLLLLJI2 = C2204961BRm.LLLLJI(c0i7dGS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0OAqDFRqxwzyWDU72fVAuS1kJclzonE/JMyt/d7Om6L4SFQ3itkBU5kKczBXM2BU1TQrPK/tT2f+LIhjJIp0eI6PSkjpLg5lTFUH2g==", null));
        if (editableLLLLJI2 != null) {
            charSequenceLJLIIIL = a0.LJLIIIL(editableLLLLJI2);
        }
        if (charSequenceLJLIIIL == null || charSequenceLJLIIIL.length() == 0) {
            z = true;
        }
        textViewHS.setEnabled(true ^ z);
    }

    public static final void onTextChanged$8(C521840KdK c521840KdK, CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.length() > 26) {
            C0JCX.LIZLLL(((C511360K3q) c521840KdK.l0).LL.getContext().getString(2131839334));
            ((C511360K3q) c521840KdK.l0).LLILLL.setText(charSequence.subSequence(0, 26));
            ((C511360K3q) c521840KdK.l0).LLILLL.setSelection(26);
        }
    }
}
