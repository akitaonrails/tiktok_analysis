package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15PU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15PU extends RelativeLayout {
    public LiveEditText LL;
    public C16F5 LLILLJJLI;
    public C15PX LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public Integer LLILZLL;
    public Integer LLIZ;
    public Integer LLIZLLLIL;
    public Integer LLJ;

    public final String getText() {
        Editable editableLLLFZ;
        LiveEditText liveEditText = this.LL;
        if (liveEditText == null || (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpnq5tO+U5XTzG6bOLLV/oAHDvko0EOKtn9XepZLhsroCX60e58LXqFTYWWl70hQ==", null))) == null) {
            return null;
        }
        return editableLLLFZ.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent != null && motionEvent.getAction() == 0 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setHint(String str) {
        LiveEditText liveEditText = this.LL;
        if (liveEditText != null) {
            liveEditText.setHint(str);
        }
    }

    public final void setHintColor(int i) {
        LiveEditText liveEditText = this.LL;
        if (liveEditText != null) {
            liveEditText.setHintTextColor(i);
        }
    }

    public final void setInputStateListener(C15PX c15px) {
        this.LLILLL = c15px;
    }

    public final void setMaxCount(int i) {
        this.LLILZ = i;
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("0/");
            sbLIZ.append(this.LLILZ);
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void setText(String str) {
        LiveEditText liveEditText = this.LL;
        if (liveEditText != null) {
            liveEditText.setText(str);
        }
    }

    public final void setTextColor(int i) {
        LiveEditText liveEditText = this.LL;
        if (liveEditText != null) {
            liveEditText.setTextColor(i);
        }
    }

    public final void setTextSize(int i) {
        LiveEditText liveEditText = this.LL;
        if (liveEditText != null) {
            liveEditText.setTextSize(0, i);
        }
    }

    public C15PU(final Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, 0);
        this.LLILZ = 60;
        TextWatcher textWatcher = new TextWatcher() { // from class: X.15PV
            public String LL;
            public int LLILLJJLI;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int selectionStart;
                int iIntValue3;
                int iIntValue4;
                int iIntValue5;
                int iIntValue6;
                int iIntValue7;
                LiveEditText liveEditText = this.LLILLL.LL;
                int iIntValue8 = 0;
                if (liveEditText != null) {
                    selectionStart = liveEditText.getSelectionStart();
                } else {
                    selectionStart = 0;
                }
                this.LLILLJJLI = selectionStart;
                LiveEditText liveEditText2 = this.LLILLL.LL;
                if (liveEditText2 != null) {
                    liveEditText2.getSelectionEnd();
                }
                LiveEditText liveEditText3 = this.LLILLL.LL;
                if (liveEditText3 != null) {
                    liveEditText3.setSelection(this.LLILLJJLI);
                }
                if (editable != null) {
                    int length = editable.length();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(length);
                    sbLIZ.append('/');
                    sbLIZ.append(this.LLILLL.LLILZ);
                    this.LL = C2188811AlT.LIZIZ(sbLIZ);
                    this.LLILLL.getClass();
                    boolean zFind = PatternProtector.compile("[🀀-🏿]|[🐀-\u1f7ff]|[☀-⟿]").matcher(editable).find();
                    if (zFind) {
                        this.LLILLL.setSelected(zFind);
                        C15PX c15px = this.LLILLL.LLILLL;
                        if (c15px != null) {
                            c15px.LIZIZ(zFind);
                        }
                        C15PU c15pu = this.LLILLL;
                        if (length > c15pu.LLILZ) {
                            C16F5 c16f5 = c15pu.LLILLJJLI;
                            String strValueOf = String.valueOf(length);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.etr, context);
                            if (numLIZJ != null) {
                                iIntValue7 = numLIZJ.intValue();
                            } else {
                                iIntValue7 = 0;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append('/');
                            sbLIZ2.append(this.LLILLL.LLILZ);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ezy, context);
                            if (numLIZJ2 != null) {
                                iIntValue8 = numLIZJ2.intValue();
                            }
                            C15PU.LIZ(c16f5, strValueOf, iIntValue7, strLIZIZ, iIntValue8);
                            return;
                        }
                        C16F5 c16f52 = c15pu.LLILLJJLI;
                        if (c16f52 != null) {
                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ezy, context);
                            if (numLIZJ3 != null) {
                                iIntValue8 = numLIZJ3.intValue();
                            }
                            c16f52.setTextColor(iIntValue8);
                        }
                        C16F5 c16f53 = this.LLILLL.LLILLJJLI;
                        if (c16f53 == null) {
                            return;
                        }
                        c16f53.setText(this.LL);
                        return;
                    }
                    C15PU c15pu2 = this.LLILLL;
                    if (length > c15pu2.LLILZ) {
                        C16F5 c16f54 = c15pu2.LLILLJJLI;
                        String strValueOf2 = String.valueOf(length);
                        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.etr, context);
                        if (numLIZJ4 != null) {
                            iIntValue5 = numLIZJ4.intValue();
                        } else {
                            iIntValue5 = 0;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('/');
                        sbLIZ3.append(this.LLILLL.LLILZ);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.ezy, context);
                        if (numLIZJ5 != null) {
                            iIntValue6 = numLIZJ5.intValue();
                        } else {
                            iIntValue6 = 0;
                        }
                        C15PU.LIZ(c16f54, strValueOf2, iIntValue5, strLIZIZ2, iIntValue6);
                        this.LLILLL.setSelected(true);
                        C15PX c15px2 = this.LLILLL.LLILLL;
                        if (c15px2 != null) {
                            c15px2.LIZ(true, false);
                            return;
                        }
                        return;
                    }
                    if (length == 0) {
                        C16F5 c16f55 = c15pu2.LLILLJJLI;
                        if (c16f55 != null) {
                            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.ezy, context);
                            if (numLIZJ6 != null) {
                                iIntValue4 = numLIZJ6.intValue();
                            } else {
                                iIntValue4 = 0;
                            }
                            c16f55.setTextColor(iIntValue4);
                        }
                        C16F5 c16f56 = this.LLILLL.LLILLJJLI;
                        if (c16f56 != null) {
                            c16f56.setText(this.LL);
                        }
                        this.LLILLL.setSelected(false);
                        C15PX c15px3 = this.LLILLL.LLILLL;
                        if (c15px3 != null) {
                            c15px3.LIZ(false, true);
                            return;
                        }
                        return;
                    }
                    C16F5 c16f57 = c15pu2.LLILLJJLI;
                    if (c16f57 != null) {
                        Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.ezy, context);
                        if (numLIZJ7 != null) {
                            iIntValue3 = numLIZJ7.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        c16f57.setTextColor(iIntValue3);
                    }
                    C16F5 c16f58 = this.LLILLL.LLILLJJLI;
                    if (c16f58 != null) {
                        c16f58.setText(this.LL);
                    }
                    this.LLILLL.setSelected(false);
                    if (a0.LJLJJL(editable).length() == 0) {
                        C15PX c15px4 = this.LLILLL.LLILLL;
                        if (c15px4 != null) {
                            c15px4.LIZ(false, true);
                            return;
                        }
                        return;
                    }
                    C15PX c15px5 = this.LLILLL.LLILLL;
                    if (c15px5 == null) {
                        return;
                    }
                    c15px5.LIZ(false, false);
                }
            }

            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("0/");
                sbLIZ.append(this.LLILLL.LLILZ);
                this.LL = C2188811AlT.LIZIZ(sbLIZ);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CountableEditText);
        this.LLILZ = typedArrayObtainStyledAttributes.getInteger(R$styleable.CountableEditText_count_maxCharacterCount, 60);
        this.LLILZIL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.CountableEditText_count_hintText);
        int i = R$styleable.CountableEditText_count_hintTextColor;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ewy, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZLL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i, iIntValue));
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.CountableEditText_count_contentText);
        this.LLIZ = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R$styleable.CountableEditText_count_contentTextStyle, 0));
        int i2 = R$styleable.CountableEditText_count_contentTextColor;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ewy, getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LLIZLLLIL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i2, iIntValue2));
        this.LLJ = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CountableEditText_count_contentTextSize, (int) C497740JfY.LIZIZ(16.0f)));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CountableEditText_count_contentViewHeight, (int) C497740JfY.LIZIZ(140.0f));
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = RelativeLayout.inflate(context, R.layout.hbn, this);
        C16F5 c16f5 = (C16F5) viewInflate.findViewById(R.id.zd8);
        this.LLILLJJLI = c16f5;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("0/");
            sbLIZ.append(this.LLILZ);
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        LiveEditText liveEditText = (LiveEditText) viewInflate.findViewById(R.id.gp_);
        liveEditText.setHint(this.LLILZIL);
        Integer num = this.LLIZ;
        if (num != null) {
            liveEditText.LLJI.LJI(num.intValue());
        }
        Integer num2 = this.LLIZLLLIL;
        if (num2 != null) {
            liveEditText.setTextColor(num2.intValue());
        }
        if (this.LLJ != null) {
            liveEditText.setTextSize(0, r0.intValue());
        }
        liveEditText.setHint(this.LLILZIL);
        Integer num3 = this.LLILZLL;
        if (num3 != null) {
            liveEditText.setHintTextColor(num3.intValue());
        }
        liveEditText.addTextChangedListener(textWatcher);
        this.LL = liveEditText;
    }

    public static void LIZ(C16F5 c16f5, String str, int i, String str2, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(i), 0, str.length(), 33);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(i2), str.length(), strLIZIZ.length(), 33);
        if (c16f5 != null) {
            c16f5.setText(spannableString);
        }
    }
}
