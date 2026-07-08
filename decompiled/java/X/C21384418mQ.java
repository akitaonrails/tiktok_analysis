package X;

import Y.ACListenerS134S0200000_32;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21384418mQ extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final EditText LLILLJJLI;
    public final ConstraintLayout LLILLL;
    public final C1295960jpS LLILZ;
    public final ImageView LLILZIL;
    public CreatorCaptionEditData LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final /* synthetic */ C21384318mP LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21384418mQ(final C21384318mP c21384318mP, final View view) {
        super(view);
        this.LLJ = c21384318mP;
        this.LL = (TuxTextView) view.findViewById(R.id.pu6);
        EditText editText = (EditText) view.findViewById(R.id.dch);
        this.LLILLJJLI = editText;
        this.LLILLL = (ConstraintLayout) view.findViewById(R.id.ddc);
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.ns2);
        this.LLILZ = c1295960jpS;
        ImageView imageView = (ImageView) view.findViewById(R.id.dd_);
        this.LLILZIL = imageView;
        editText.addTextChangedListener(new TextWatcher() { // from class: X.18mR
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                for (int length = editable.length() - 1; -1 < length; length--) {
                    if (editable.charAt(length) == '\n' || editable.charAt(length) == '\r') {
                        editable.delete(length, length + 1);
                        return;
                    }
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean z;
                C21384418mQ c21384418mQ = this.LL;
                if (i2 > 0 && i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c21384418mQ.LLIZ = z;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean zEnableToastCenter;
                if (!this.LL.LLIZ && charSequence.length() > c21384318mP.LLJ) {
                    int i4 = i + i3;
                    int length = i4 - (charSequence.length() - c21384318mP.LLJ);
                    this.LL.LLILLJJLI.setText(a0.LJJJJZI(length, i4, charSequence));
                    EditText editText2 = this.LL.LLILLJJLI;
                    editText2.setSelection(Math.min(length, C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOStdJzc2TMeLvBBdF5VGA4z4xDMpmN5p5JXKi8p/FMFEa+iQZAlt1vCN6k=", null)).length()));
                    c21384318mP.getClass();
                    IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
                    if (iAVPublishPageUIRefactorService == null) {
                        zEnableToastCenter = false;
                    } else {
                        zEnableToastCenter = iAVPublishPageUIRefactorService.enableToastCenter();
                    }
                    if (zEnableToastCenter) {
                        C1389880mGw c1389880mGw = new C1389880mGw(view);
                        C844470XAv.LIZ.getClass();
                        c1389880mGw.LJIIIZ(C844470XAv.LIZ().getResources().getString(2131828402, Integer.valueOf(c21384318mP.LLJ)));
                        c1389880mGw.LJIIJ();
                        return;
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx(view);
                    C844470XAv.LIZ.getClass();
                    c1389890mGx.LJIIJ(C844470XAv.LIZ().getResources().getString(2131828402, Integer.valueOf(c21384318mP.LLJ)));
                    c1389890mGx.LJIIJJI();
                    return;
                }
                C21384418mQ c21384418mQ = this.LL;
                CreatorCaptionEditData creatorCaptionEditData = c21384418mQ.LLILZLL;
                if (creatorCaptionEditData != null) {
                    creatorCaptionEditData.setText(C2204961BRm.LLJILLL(c21384418mQ.LLILLJJLI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOStdJzc2TMeLvBBdF5VGA4z4xDMpmN5p5JXKi8p/FMFEa+iQZAlt1vCN6k=", null)).toString());
                }
                C21384318mP c21384318mP2 = c21384318mP;
                c21384318mP2.LL.AQ2(c21384318mP2.LLILLL);
            }
        });
        setIsRecyclable(false);
        c1295960jpS.setAnimation("creation_audio_wave_anim_tux_lottie.json");
        c1295960jpS.setRepeatCount(-1);
        editText.setFocusable(c21384318mP.LLLIIIIL());
        C786410Ut5.N7(editText, new ACListenerS134S0200000_32(c21384318mP, this, 5));
        c1295960jpS.pauseAnimation();
        C786410Ut5.LLD(8, c1295960jpS);
        C786410Ut5.LJZI(8, imageView);
        editText.setOnFocusChangeListener(new C19LW(c21384318mP, this, 0));
        C786410Ut5.Q7(imageView, new ACListenerS134S0200000_32(c21384318mP, this, 6));
    }
}
