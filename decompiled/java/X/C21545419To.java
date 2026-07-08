package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.19To, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21545419To extends FrameLayout implements Checkable {
    public final C19SE LL;
    public final C21543419Su LLILLJJLI;
    public final EditText LLILLL;
    public final C21545519Tp LLILZ;
    public final TextView LLILZIL;

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.LL.isChecked();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.LL.toggle();
    }

    public C21543419Su getTextInput() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.LLILLL.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        this.LL.setChecked(z);
        EditText editText = this.LLILLL;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        int visibility = editText.getVisibility();
        editText.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, editText);
        C19SE c19se = this.LL;
        if (z) {
            i2 = 8;
        }
        int visibility2 = c19se.getVisibility();
        c19se.setVisibility(i2);
        C1602160rnK.LIZIZ(visibility2, i2, c19se);
        if (isChecked()) {
            this.LLILLL.requestFocus();
            if (!TextUtils.isEmpty(this.LLILLL.getText())) {
                EditText editText2 = this.LLILLL;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public void setChipDelegate(C20094213jo c20094213jo) {
        q0.LJIJ(this.LL, c20094213jo);
    }

    public void setCursorVisible(boolean z) {
        this.LLILLL.setCursorVisible(z);
    }

    public void setHelperText(CharSequence charSequence) {
        this.LLILZIL.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.s9(this.LL, onClickListener);
    }

    public void setText(CharSequence charSequence) {
        this.LL.setText(TimeModel.LIZ(getResources(), charSequence, "%02d"));
        if (!TextUtils.isEmpty(this.LLILLL.getText())) {
            this.LLILLL.removeTextChangedListener(this.LLILZ);
            this.LLILLL.setText((CharSequence) null);
            this.LLILLL.addTextChangedListener(this.LLILZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.19Tp, android.text.TextWatcher] */
    public C21545419To(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        C19SE c19se = (C19SE) C786410Ut5.Td(layoutInflaterNe, R.layout.dkv, this, false);
        this.LL = c19se;
        C21543419Su c21543419Su = (C21543419Su) C786410Ut5.Td(layoutInflaterNe, R.layout.dkw, this, false);
        this.LLILLJJLI = c21543419Su;
        EditText editText = c21543419Su.getEditText();
        this.LLILLL = editText;
        int visibility = editText.getVisibility();
        editText.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, editText);
        ?? r0 = new C0DL6() { // from class: X.19Tp
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable)) {
                    C21545419To c21545419To = this.LL;
                    c21545419To.LL.setText(TimeModel.LIZ(c21545419To.getResources(), "00", "%02d"));
                } else {
                    C21545419To c21545419To2 = this.LL;
                    c21545419To2.LL.setText(TimeModel.LIZ(c21545419To2.getResources(), editable, "%02d"));
                }
            }
        };
        this.LLILZ = r0;
        editText.addTextChangedListener(r0);
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(c19se);
        addView(c21543419Su);
        this.LLILZIL = (TextView) findViewById(R.id.o3r);
        editText.setSaveEnabled(false);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.LL.setTag(i, obj);
    }
}
