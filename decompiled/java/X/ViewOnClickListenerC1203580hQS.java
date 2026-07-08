package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import p5a.a;

/* JADX INFO: renamed from: X.0hQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ViewOnClickListenerC1203580hQS extends LinearLayout implements View.OnClickListener {
    public RemoteImageView LL;
    public TuxIconView LLILLJJLI;
    public TextView LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public InterfaceC1203590hQT LLILZLL;

    public TextView getTitleTextView() {
        return this.LLILLL;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LLILZLL == null) {
            return;
        }
        if (view.getId() == R.id.lc0) {
            this.LLILZLL.LIZ();
        } else {
            if (view.getId() != R.id.y0w) {
                return;
            }
            this.LLILZLL.LIZIZ();
        }
    }

    public void setCloseImage(int i) {
        this.LLILLJJLI.setImageResource(i);
    }

    public void setIconImage(Drawable drawable) {
        this.LL.getHierarchy().LJIJ(drawable, 1);
    }

    public void setIconImageResource(Drawable drawable) {
        this.LL.setImageDrawable(drawable);
    }

    public void setNoticeBackgroundColor(int i) {
        this.LLILZIL.setBackgroundColor(i);
    }

    public void setOnInternalClickListener(InterfaceC1203590hQT interfaceC1203590hQT) {
        this.LLILZLL = interfaceC1203590hQT;
    }

    public void setTitleText(int i) {
        this.LLILLL.setText(getContext().getResources().getText(i));
    }

    public void setTitleTextColor(int i) {
        this.LLILLL.setTextColor(i);
    }

    public void setCloseImage(Bitmap bitmap) {
        this.LLILLJJLI.setImageBitmap(bitmap);
    }

    public void setIconImage(int i) {
        this.LL.setImageResource(i);
    }

    public void setTitleText(CharSequence charSequence) {
        this.LLILLL.setText(charSequence);
    }

    public void setCloseImage(Drawable drawable) {
        this.LLILLJJLI.setImageDrawable(drawable);
    }

    public void setIconImage(Bitmap bitmap) {
        this.LL.setImageBitmap(bitmap);
    }

    public void setTitleText(String str) {
        this.LLILLL.setText(str);
    }

    public void setIconImage(UrlModel urlModel) {
        C1324840ka2.LJFF(this.LL, urlModel);
    }

    public ViewOnClickListenerC1203580hQS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout.inflate(context, R.layout.d_t, this);
        this.LL = (RemoteImageView) findViewById(R.id.lkw);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.lc0);
        this.LLILLL = (TextView) findViewById(R.id.tv_title);
        this.LLILZ = findViewById(R.id.y0w);
        this.LLILZIL = findViewById(R.id.pco);
        this.LLILLJJLI.setOnTouchListener(new a(0.5f, 150L));
        this.LLILZ.setOnTouchListener(new a(0.5f, 150L));
        C786410Ut5.a9(this.LLILLJJLI, this);
        C786410Ut5.I7(this, this.LLILZ);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NoticeView);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NoticeView_iconImage);
        if (drawable != null) {
            this.LL.setImageDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.getDrawable(R$styleable.NoticeView_closeImage);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NoticeView_closeImage, 0);
        if (resourceId != 0) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = resourceId;
            c419910GdJ.LIZLLL = Integer.valueOf(R.attr.a1j);
            this.LLILLJJLI.setTuxIcon(c419910GdJ);
        }
        this.LLILLL.setText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.NoticeView_titleText));
        this.LLILLL.setTextColor(C960203pA.LIZ(R.attr.a1h, getContext()));
        this.LLILZIL.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(R$styleable.NoticeView_noticeBackgroundColor, getResources().getColor(R.color.ao)));
        typedArrayObtainStyledAttributes.recycle();
    }
}
