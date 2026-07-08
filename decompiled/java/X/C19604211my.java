package X;

import Y.ACListenerS131S0200000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import avg.f;
import com.ss.android.ugc.aweme.social.sticker.model.SocialEmoji;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11my, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19604211my extends FrameLayout {
    public EmojiSliderStickerModel LL;
    public C0FSC LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public C19604211my() {
        throw null;
    }

    private final SeekBar getEmojiSliderSeekBar() {
        return (SeekBar) this.LLILZ.getValue();
    }

    public final C0I7D getEmojiSliderEditText() {
        return (C0I7D) this.LLILLL.getValue();
    }

    public final InterfaceC19604511n1 getEmojiSliderService() {
        return (InterfaceC19604511n1) this.LLILZIL.getValue();
    }

    public final C0FSC getStickerEditListener() {
        return this.LLILLJJLI;
    }

    private final void setEmoji(String str) {
        Bitmap bitmapLIZIZ = C0GZ1.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), str);
        if (bitmapLIZIZ == null) {
            return;
        }
        getEmojiSliderSeekBar().setThumb(new BitmapDrawable(getResources(), bitmapLIZIZ));
    }

    public final void LIZ(SocialEmoji socialEmoji) {
        EmojiSliderStickerModel emojiSliderStickerModel = this.LL;
        emojiSliderStickerModel.setEmojiContent(socialEmoji.emoji);
        emojiSliderStickerModel.setAndroidVer(socialEmoji.and);
        emojiSliderStickerModel.setIosVer(socialEmoji.ios);
        setEmoji(socialEmoji.emoji);
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLILLJJLI = c0fsc;
    }

    public final void LIZIZ(EmojiSliderStickerModel emojiSliderStickerModel, C390370FSh c390370FSh) {
        this.LL = emojiSliderStickerModel;
        this.LLILLJJLI = c390370FSh;
        setEmoji(emojiSliderStickerModel.getEmojiContent());
        getEmojiSliderEditText().setText(emojiSliderStickerModel.getQuestionText());
    }

    public C19604211my(Context context, C390420FSm c390420FSm, EmojiSliderStickerModel emojiSliderStickerModel, C390370FSh c390370FSh) {
        super(context, null, 0);
        this.LL = emojiSliderStickerModel;
        this.LLILLJJLI = c390370FSh;
        this.LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 296));
        this.LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 297));
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 119));
        FrameLayout.inflate(context, R.layout.c43, this);
        View.OnClickListener aCListenerS131S0200000_29 = new ACListenerS131S0200000_29(this, null, 11);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS131S0200000_29) : aCListenerS131S0200000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C786410Ut5.Sd(R.layout.c44, C786410Ut5.ne(getContext()), (ViewGroup) findViewById(R.id.i5l)).setOnTouchListener(new View.OnTouchListener() { // from class: X.11n2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        final C0I7D emojiSliderEditText = getEmojiSliderEditText();
        emojiSliderEditText.setMaxLines(3);
        emojiSliderEditText.setOnFocusChangeListener(new C12YL(this, 0));
        emojiSliderEditText.addTextChangedListener(new TextWatcher(emojiSliderEditText) { // from class: X.0Hge
            public final EditText LL;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.LL = emojiSliderEditText;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Editable editableLLJILLL;
                EditText editText = this.LL;
                if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxrPah5xMPTV/JolMnC3GIt2Qychq2+8uTDJ0RpSV0UAh7MDG8lGTzzLivhVG0VWrB/Y3VosTPd5nFKxea6aA==", null))) != null && editableLLJILLL.length() != 0 && editText.getLineCount() > 3) {
                    String string = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxrPah5xMPTV/JolMnC3GIt2Qychq2+8uTDJ0RpSV0UAh7MDG8lGTzzLivhVG0VWrB/Y3VosTPd5nFKxea6aA==", null)).toString();
                    if (string.length() >= 150) {
                        string = string.substring(0, 150);
                    }
                    String strSubstring = string.substring(0, string.length() - 1);
                    for (int length = strSubstring.length() - 1; length >= 0 && Character.isHighSurrogate(strSubstring.charAt(length)); length--) {
                        strSubstring = strSubstring.substring(0, length);
                    }
                    editText.setText(strSubstring);
                    editText.setSelection(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxrPah5xMPTV/JolMnC3GIt2Qychq2+8uTDJ0RpSV0UAh7MDG8lGTzzLivhVG0VWrB/Y3VosTPd5nFKxea6aA==", null)).length());
                }
                C447470Hgf.LIZ = this.LL.getLineCount();
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C19591311kt c19591311kt = C19591311kt.LIZ;
                EditText editText = this.LL;
                c19591311kt.getClass();
                C19591311kt.LJIIIIZZ(editText, 0.0d);
            }
        });
        C19591311kt.LIZ.getClass();
        C19591311kt.LJIIIIZZ(emojiSliderEditText, 0.0d);
        emojiSliderEditText.setOnKeyListener(new View.OnKeyListener() { // from class: X.0Hgg
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (66 == i && keyEvent.getAction() == 0 && C447470Hgf.LIZ >= 3) {
                    return true;
                }
                return false;
            }
        });
        emojiSliderEditText.setText(this.LL.getQuestionText());
        SeekBar emojiSliderSeekBar = getEmojiSliderSeekBar();
        emojiSliderSeekBar.setEnabled(false);
        emojiSliderSeekBar.setMax(100);
        emojiSliderSeekBar.setProgress(0);
        C786410Ut5.x3(getRootView().getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(this, 1));
        InterfaceC19604511n1 emojiSliderService = getEmojiSliderService();
        if (emojiSliderService != null) {
            emojiSliderService.LIZIZ(this, context, new C19604311mz(this));
        }
        setEmoji(this.LL.getEmojiContent());
    }
}
