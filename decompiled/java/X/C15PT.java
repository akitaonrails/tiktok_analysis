package X;

import Y.AComparatorS34S0000000_15;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;
import webcast.data.multi_guest_play.WallpaperContext;

/* JADX INFO: renamed from: X.15PT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15PT extends FrameLayout {
    public C15PU LL;
    public C1117360fBO LLILLJJLI;
    public String LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;
    public Integer LLIZ;
    public C15PX LLIZLLLIL;

    public final String getText() {
        C15PU c15pu = this.LL;
        if (c15pu != null) {
            return c15pu.getText();
        }
        return null;
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
        C15PU c15pu = this.LL;
        if (c15pu != null) {
            c15pu.setHint(str);
        }
    }

    public final void setListData(List<WallpaperContext> list) {
        C410901il c410901il = new C410901il();
        if (list.size() > 1) {
            C08XD.LJJ(list, new AComparatorS34S0000000_15(4));
        }
        c410901il.addAll(list);
        C1117360fBO c1117360fBO = this.LLILLJJLI;
        if (c1117360fBO != null) {
            c1117360fBO.LL = c410901il;
            c1117360fBO.notifyDataSetChanged();
        }
    }

    public final void setOutInputStateListener(C15PX c15px) {
        this.LLIZLLLIL = c15px;
    }

    public final void setText(String str) {
        C15PU c15pu = this.LL;
        if (c15pu != null) {
            c15pu.setText(str);
        }
    }

    public C15PT(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        C15PX c15px = new C15PX() { // from class: X.15PW
            @Override // X.C15PX
            public final void LIZIZ(boolean z) {
                this.LIZ.setSelected(z);
                C15PX c15px2 = this.LIZ.LLIZLLLIL;
                if (c15px2 != null) {
                    c15px2.LIZIZ(z);
                }
            }

            @Override // X.C15PX
            public final void LIZ(boolean z, boolean z2) {
                this.LIZ.setSelected(z);
                C15PX c15px2 = this.LIZ.LLIZLLLIL;
                if (c15px2 != null) {
                    c15px2.LIZ(z, z2);
                }
            }
        };
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CountableEditTextLayout);
        typedArrayObtainStyledAttributes.getInteger(R$styleable.CountableEditTextLayout_layout_count_maxCharacterCount, 30);
        this.LLILLL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.CountableEditTextLayout_layout_count_hintText);
        int i = R$styleable.CountableEditTextLayout_layout_count_hintTextColor;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ewz, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZ = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i, iIntValue));
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.CountableEditTextLayout_layout_count_contentText);
        this.LLILZIL = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(R$styleable.CountableEditTextLayout_layout_count_contentTextStyle, 0));
        int i2 = R$styleable.CountableEditTextLayout_layout_count_contentTextColor;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ewy, getContext());
        this.LLILZLL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i2, numLIZJ2 != null ? numLIZJ2.intValue() : 0));
        this.LLIZ = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CountableEditTextLayout_layout_count_contentTextSize, (int) C497740JfY.LIZIZ(16.0f)));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CountableEditTextLayout_layout_count_contentViewHeight, (int) C497740JfY.LIZIZ(140.0f));
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.f5c);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = FrameLayout.inflate(context, R.layout.hbu, this);
        C15PU c15pu = (C15PU) viewInflate.findViewById(R.id.hdc);
        String str = this.LLILLL;
        if (str != null) {
            c15pu.setHint(str);
        }
        Integer num = this.LLILZIL;
        if (num != null) {
            int iIntValue2 = num.intValue();
            LiveEditText liveEditText = c15pu.LL;
            if (liveEditText != null) {
                liveEditText.LLJI.LJI(iIntValue2);
            }
        }
        Integer num2 = this.LLILZLL;
        if (num2 != null) {
            c15pu.setTextColor(num2.intValue());
        }
        Integer num3 = this.LLIZ;
        if (num3 != null) {
            c15pu.setTextSize(num3.intValue());
        }
        Integer num4 = this.LLILZ;
        if (num4 != null) {
            c15pu.setHintColor(num4.intValue());
        }
        c15pu.setInputStateListener(c15px);
        this.LL = c15pu;
        c15pu.setMaxCount(30);
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) viewInflate.findViewById(R.id.twm);
        runnableC781530UlD.setLayoutManager(new SSLinearLayoutManager(context));
        runnableC781530UlD.LIZLLL();
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(WallpaperContext.class, new C0J8P<WallpaperContext, C497301wh>() { // from class: X.01wg
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, WallpaperContext wallpaperContext) {
                String strLIZIZ;
                C497301wh c497301wh = (C497301wh) viewHolder;
                WallpaperContext wallpaperContext2 = wallpaperContext;
                C12ES.LJIILL(0, (View) c497301wh.LL.getValue());
                ((TextView) c497301wh.LL.getValue()).setText(String.valueOf(c497301wh.getLayoutPosition() + 1));
                if (wallpaperContext2.nickname.length() > 15) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((Object) wallpaperContext2.nickname.subSequence(0, 15));
                    sbLIZ.append("...");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = wallpaperContext2.nickname;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(": ");
                sbLIZ2.append(wallpaperContext2.userKeywords);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int iLJJJ = a0.LJJJ(strLIZIZ2, ":", 0, false, 6) + 1;
                SpannableString spannableString = new SpannableString(strLIZIZ2);
                if (Build.VERSION.SDK_INT >= 28) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(C497740JfY.LIZLLL(R.attr.ex3, ((View) c497301wh.LLILLJJLI.getValue()).getContext())), 0, iLJJJ, 33);
                }
                ((TextView) c497301wh.LLILLJJLI.getValue()).setText(spannableString);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C497301wh(viewGroup);
            }
        });
        this.LLILLJJLI = c1117360fBO;
        runnableC781530UlD.setAdapter(c1117360fBO);
    }
}
