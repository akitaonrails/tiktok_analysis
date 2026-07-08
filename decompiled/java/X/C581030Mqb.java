package X;

import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Mqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581030Mqb implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
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
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
        }
    }

    public C581030Mqb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C581030Mqb c581030Mqb, Editable editable) throws Throwable {
        if (editable == null) {
            return;
        }
        int length = editable.length();
        if (length > 0) {
            int i = length - 1;
            if (editable.charAt(i) == '\n') {
                editable.delete(i, length);
            }
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI(((FTCVideoPublishFragment) c581030Mqb.l0).MR(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJFPsYx7/uf49AbXj94wjvcWM+ig44Omg==", null));
        if (editableLLLLJI != null && editableLLLLJI.length() > ((FTCVideoPublishFragment) c581030Mqb.l0).LLIZLLLIL) {
            int selectionEnd = Selection.getSelectionEnd(editableLLLLJI);
            ((FTCVideoPublishFragment) c581030Mqb.l0).MR().setText(editableLLLLJI.toString().substring(0, ((FTCVideoPublishFragment) c581030Mqb.l0).LLIZLLLIL));
            Editable editableLLLLJI2 = C2204961BRm.LLLLJI(((FTCVideoPublishFragment) c581030Mqb.l0).MR(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJFPsYx7/uf49AbXj94wjvcWM+ig44Omg==", null));
            if (editableLLLLJI2 == null) {
                return;
            }
            if (selectionEnd > editableLLLLJI2.length()) {
                selectionEnd = editableLLLLJI2.length();
            }
            Selection.setSelection(editableLLLLJI2, selectionEnd);
            C1233040iBy c1233040iBy = new C1233040iBy(((FTCVideoPublishFragment) c581030Mqb.l0).requireContext());
            c1233040iBy.LIZIZ(R.string.words_overflow);
            c1233040iBy.LIZLLL();
        }
    }

    public static final void afterTextChanged$1(C581030Mqb c581030Mqb, Editable editable) {
        Bundle argumentsSafely;
        if (editable != null) {
            C572260McS c572260McS = (C572260McS) c581030Mqb.l0;
            String string = editable.toString();
            if (!Intrinsics.LJFF(string, "\n")) {
                c572260McS.LLLIL().wI0(string, false);
                String strReplace = new Regex("\n{3,}").replace(string, "\n\n");
                if (!Intrinsics.LJFF(strReplace, string)) {
                    C0I7D c0i7d = c572260McS.LLJILLL;
                    if (c0i7d != null) {
                        c0i7d.setText(strReplace);
                    }
                    C0I7D c0i7d2 = c572260McS.LLJILLL;
                    if (c0i7d2 != null) {
                        c0i7d2.setSelection(strReplace.length());
                    }
                }
                if (editable.length() > 0) {
                    VideoPublishEditModel videoPublishEditModelLLLILZ = c572260McS.LLLILZ();
                    AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(c572260McS);
                    String string2 = null;
                    if (abstractC214814194yLIZ != null) {
                        argumentsSafely = abstractC214814194yLIZ.getArgumentsSafely();
                    } else {
                        argumentsSafely = null;
                    }
                    if (!C572240McQ.LJI) {
                        C572240McQ.LJI = true;
                        C0LAB c0lab = new C0LAB();
                        String enterFrom = videoPublishEditModelLLLILZ.getEnterFrom();
                        if (enterFrom == null) {
                            if (argumentsSafely != null) {
                                string2 = argumentsSafely.getString("enter_from");
                            }
                        } else {
                            string2 = enterFrom;
                        }
                        c0lab.LJ("enter_from", string2);
                        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelLLLILZ));
                        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelLLLILZ));
                        c0lab.LJ("shoot_way", videoPublishEditModelLLLILZ.mShootWay);
                        c0lab.LJ("creation_id", videoPublishEditModelLLLILZ.getCreationId());
                        c0lab.LIZ(1, "is_text_mode");
                        c0lab.LIZ(1, "is_text_trans_pic");
                        C572310McX.LJFF(videoPublishEditModelLLLILZ, c0lab);
                        c0lab.LJ("entrance", C572310McX.LJI(videoPublishEditModelLLLILZ));
                        c0lab.LJ("enter_method", videoPublishEditModelLLLILZ.getShootEnterMethod());
                        c0lab.LIZ(C572240McQ.LJFF, "is_user_education_show");
                        C20684815ws.LJIILLIIL("text_input", c0lab.LIZ);
                    }
                }
                if (c572260McS.LLJL) {
                    c572260McS.LLJL = false;
                    View view = c572260McS.LLJLILLLLZIIL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                }
            }
        }
    }

    public static final void afterTextChanged$2(C581030Mqb c581030Mqb, Editable editable) {
        boolean z;
        PromptModel promptModelLIZ;
        String string = editable.toString();
        Function1<PromptModel, Unit> function1 = ((C0MDX) c581030Mqb.l0).LLLLIL().LIZ;
        C0MDX c0mdx = (C0MDX) c581030Mqb.l0;
        PromptModel promptModel = c0mdx.LLLLILI().LIZ.LIZJ;
        int i = 0;
        if (!((Boolean) new AwS587S0100000_8((C0MDX) c581030Mqb.l0, 343).invoke(string)).booleanValue()) {
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                promptModelLIZ = C0MD9.LIZ("", PromptType.NO_PROMPT, false, 28);
            } else {
                promptModelLIZ = C0MD9.LIZ(string, PromptType.INPUT, false, 28);
            }
            String str = promptModel.promptTypeMob;
            if (!c0mdx.LLJLLIL) {
                C564410MBr c564410MBr = C564410MBr.LIZ;
                VideoPublishEditModel videoPublishEditModel = c0mdx.LLLLILI().LIZ.LIZIZ;
                c564410MBr.getClass();
                C0LAB c0labLJI = C564410MBr.LJI(videoPublishEditModel);
                c0labLJI.LJ("last_prompt_type", str);
                C20684815ws.LJIILLIIL("ai_livephoto_manual_edit_prompt", c0labLJI.LIZ);
                c0mdx.LLJLLIL = true;
            }
            Function1<PromptPageMobParam, Unit> function12 = c0mdx.LLLLIL().LJ;
            PromptPageMobParam promptPageMobParam = c0mdx.LLLLILI().LIZ.LIZIZ.getAILivePhotoModel().mobParam;
            promptPageMobParam.hasInputPrompt = true;
            function12.invoke(promptPageMobParam);
            promptModel = promptModelLIZ;
        }
        function1.invoke(promptModel);
        TuxIconView tuxIconView = (TuxIconView) ((C0MDX) c581030Mqb.l0).LLJL.getValue();
        if (string.length() == 0) {
            i = 4;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
    }

    public static final void afterTextChanged$3(C581030Mqb c581030Mqb, Editable editable) {
        boolean z;
        PromptModel promptModelLIZ;
        String string = editable.toString();
        Function1<PromptModel, Unit> function1 = ((C0MFP) c581030Mqb.l0).LLLLIL().LIZ;
        C0MFP c0mfp = (C0MFP) c581030Mqb.l0;
        PromptModel promptModel = c0mfp.LLLLILI().LIZ.LIZJ;
        if (!((Boolean) new AwS587S0100000_8((C0MFP) c581030Mqb.l0, 361).invoke(string)).booleanValue()) {
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                promptModelLIZ = C0MD9.LIZ("", PromptType.NO_PROMPT, false, 28);
            } else {
                promptModelLIZ = C0MD9.LIZ(string, PromptType.INPUT, false, 28);
            }
            String str = promptModel.promptTypeMob;
            if (!c0mfp.LLLIILIL && c0mfp.LLLLILI().LIZ.LIZJ.promptType != PromptType.AI_WRITE && c0mfp.LLLLILI().LIZ.LIZJ.promptType != PromptType.DEFAULT) {
                C564410MBr c564410MBr = C564410MBr.LIZ;
                VideoPublishEditModel videoPublishEditModel = c0mfp.LLLLILI().LIZ.LIZIZ;
                c564410MBr.getClass();
                C0LAB c0labLJI = C564410MBr.LJI(videoPublishEditModel);
                c0labLJI.LJ("last_prompt_type", str);
                C20684815ws.LJIILLIIL("ai_livephoto_manual_edit_prompt", c0labLJI.LIZ);
                c0mfp.LLLIILIL = true;
            }
            Function1<PromptPageMobParam, Unit> function12 = c0mfp.LLLLIL().LJFF;
            PromptPageMobParam promptPageMobParam = c0mfp.LLLLILI().LIZ.LIZIZ.getAILivePhotoModel().mobParam;
            promptPageMobParam.hasInputPrompt = true;
            function12.invoke(promptPageMobParam);
            promptModel = promptModelLIZ;
        }
        function1.invoke(promptModel);
    }

    public static final void afterTextChanged$4(C581030Mqb c581030Mqb, Editable editable) {
        ((C0MG0) c581030Mqb.l0).LJIILL();
        ((C0MG0) c581030Mqb.l0).LJIIIIZZ();
    }

    public static final void afterTextChanged$5(C581030Mqb c581030Mqb, Editable editable) {
        boolean z;
        if (editable == null) {
            return;
        }
        String string = editable.toString();
        C0MFE c0mfe = (C0MFE) c581030Mqb.l0;
        if (a0.LJLIIIL(string).toString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        c0mfe.LIZ(z);
        if (string.length() > ((C0MFE) c581030Mqb.l0).getTextLengthLimit()) {
            ((C0MFE) c581030Mqb.l0).LIZLLL(string.substring(0, ((C0MFE) c581030Mqb.l0).getTextLengthLimit()));
            ((C0MFE) c581030Mqb.l0).LIZIZ();
            return;
        }
        C0MFE c0mfe2 = (C0MFE) c581030Mqb.l0;
        c0mfe2.LLJI = string;
        TuxTextView tuxTextView = c0mfe2.LLILZLL;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0mfe2.LLJI.length());
            sbLIZ.append('/');
            sbLIZ.append(c0mfe2.LLJIJIL);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C0MFE c0mfe3 = (C0MFE) c581030Mqb.l0;
        if (c0mfe3.LLIZ) {
            c0mfe3.setEdited(true);
        }
    }

    public static final void onTextChanged$1(C581030Mqb c581030Mqb, CharSequence charSequence, int i, int i2, int i3) {
        Character chLJLLILLLL;
        if ((charSequence == null || a0.LJJJIL(charSequence)) && i3 > 0 && charSequence != null && (chLJLLILLLL = C13LN.LJLLILLLL(charSequence)) != null && chLJLLILLLL.charValue() == '\n') {
            C0I7D c0i7d = ((C572260McS) c581030Mqb.l0).LLJILLL;
            if (c0i7d != null) {
                c0i7d.setText("");
            }
            C0I7D c0i7d2 = ((C572260McS) c581030Mqb.l0).LLJILLL;
            if (c0i7d2 != null) {
                c0i7d2.setSelection(0);
            }
        }
    }
}
