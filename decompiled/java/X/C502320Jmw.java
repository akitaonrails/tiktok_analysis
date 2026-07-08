package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.android.livesdk.livesetting.other.subscribe.LiveSubscribePollViewActionNextSettings;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502320Jmw extends C502700JnY {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final LiveEditText LLILLL;
    public final C16F5 LLILZ;

    public C502320Jmw(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (LiveEditText) view.findViewById(R.id.rge);
        this.LLILZ = (C16F5) view.findViewById(R.id.f830xlp);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C502460JnA c502460JnA;
        final C501810Jm7 c501810Jm7;
        if ((abstractC503810JpL instanceof C502460JnA) && (c502460JnA = (C502460JnA) abstractC503810JpL) != null && (interfaceC2753014t instanceof C501810Jm7) && (c501810Jm7 = (C501810Jm7) interfaceC2753014t) != null) {
            LiveEditText liveEditText = this.LLILLL;
            if (LiveSubscribePollViewActionNextSettings.INSTANCE.getValue() && liveEditText != null) {
                liveEditText.setImeOptions(268435461);
            }
            this.LLILZ.setText("0/50");
            this.LLILLL.addTextChangedListener(new TextWatcher() { // from class: X.0Jmv
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    c502460JnA.LIZ.LIZ = String.valueOf(editable);
                    SubSpaceNewPostVM subSpaceNewPostVM = this.LL.LLILLJJLI;
                    subSpaceNewPostVM.getClass();
                    subSpaceNewPostVM.setState(new C502210Jml());
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
                    int length = 0;
                    if (charSequence != null && charSequence.length() > 50) {
                        C766270U4b.LJIIJJI(this.LL.LL.getContext().getString(2131841268));
                        this.LL.LLILLL.setText(charSequence.subSequence(0, 50));
                        this.LL.LLILLL.setSelection(50);
                    }
                    C16F5 c16f5 = this.LL.LLILZ;
                    StringBuilder sb = new StringBuilder();
                    Editable editableLLLFZ = C2204961BRm.LLLFZ(this.LL.LLILLL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGyBgzwf0iqbha6GwAgZTWkehRdBNRKoTaUD6d7rL7MZ+jz+Rcd/MNMWgyRg3G+rjPCsjO+gbXbBQsSN3A6O8E=", null));
                    if (editableLLLFZ != null) {
                        length = editableLLLFZ.length();
                    }
                    sb.append(length);
                    sb.append("/50");
                    c16f5.setText(sb.toString());
                }
            });
            this.LLILLL.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0Jmy
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        C502520JnG.LIZJ("edit", "poll", c501810Jm7.LLILLJJLI);
                    }
                }
            });
        }
    }
}
