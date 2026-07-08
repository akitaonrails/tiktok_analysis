package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.component.alttext.AltTextViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748630vbZ extends RecyclerView.ViewHolder {
    public final AltTextViewModel LL;
    public final Context LLILLJJLI;
    public final SmartImageView LLILLL;
    public final C0I7D LLILZ;
    public final C1748330vb5 LLILZIL;
    public final C1748620vbY LLILZLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0vbY] */
    public C1748630vbZ(final View view, AltTextViewModel altTextViewModel, Context context) {
        super(view);
        this.LL = altTextViewModel;
        this.LLILLJJLI = context;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.kbl);
        this.LLILLL = smartImageView;
        C0I7D c0i7d = (C0I7D) view.findViewById(R.id.xl7);
        this.LLILZ = c0i7d;
        C1748330vb5 c1748330vb5 = (C1748330vb5) view.findViewById(R.id.ihe);
        this.LLILZIL = c1748330vb5;
        this.LLILZLL = new TextWatcher() { // from class: X.0vbY
            public final StringBuilder LL = new StringBuilder();

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.LL.setLength(0);
                this.LL.append(charSequence);
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int length;
                ArrayList arrayList;
                if (Intrinsics.LJFF(String.valueOf(charSequence), this.LL.toString())) {
                    return;
                }
                if (charSequence != null && charSequence.length() > 300) {
                    this.LLILLJJLI.LLILZ.removeTextChangedListener(this);
                    this.LLILLJJLI.LLILZ.setText(this.LL);
                    C0I7D c0i7d2 = this.LLILLJJLI.LLILZ;
                    c0i7d2.setSelection(c0i7d2.getSelectionEnd());
                    C1389890mGx c1389890mGx = new C1389890mGx(view);
                    c1389890mGx.LJIIJ(this.LLILLJJLI.LLILLJJLI.getString(2131826455));
                    c1389890mGx.LJIIJJI();
                    this.LLILLJJLI.LLILZ.addTextChangedListener(this);
                    return;
                }
                C1748330vb5 c1748330vb52 = this.LLILLJJLI.LLILZIL;
                if (charSequence != null) {
                    length = charSequence.length();
                } else {
                    length = 0;
                }
                c1748330vb52.LLJJI = length;
                c1748330vb52.LLJJIII = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                c1748330vb52.LIZ();
                C1748630vbZ c1748630vbZ = this.LLILLJJLI;
                AltTextViewModel altTextViewModel2 = c1748630vbZ.LL;
                int layoutPosition = c1748630vbZ.getLayoutPosition();
                String strValueOf = String.valueOf(charSequence);
                MutableLiveData<List<String>> mutableLiveData = altTextViewModel2.LL;
                List<String> value = mutableLiveData.getValue();
                if (value != null) {
                    arrayList = new ArrayList(value);
                    if (layoutPosition >= 0 && layoutPosition < arrayList.size()) {
                        ListProtector.set(arrayList, layoutPosition, strValueOf);
                    }
                } else {
                    arrayList = null;
                }
                mutableLiveData.postValue(arrayList);
            }
        };
        C1378990lzN.LIZIZ(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, null, null, 30);
        c1748330vb5.setHasCounter(true);
        c0i7d.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 9));
    }
}
