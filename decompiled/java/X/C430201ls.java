package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C430201ls extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C430001lq LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C430201ls(C430001lq c430001lq, int i) {
        super(1);
        this.LL = c430001lq;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.requestFocus();
        int i = this.LLILLJJLI;
        C430001lq c430001lq = this.LL;
        if (i == c430001lq.LLILZLL) {
            C447270HgL c447270HgL = c430001lq.LLILZIL.get(Integer.valueOf(i));
            if (c447270HgL != null) {
                c447270HgL.setSelected(false);
            }
            c430001lq.LLILZLL = 0;
            C447270HgL c447270HgL2 = c430001lq.LLILZIL.get(Integer.valueOf(i));
            if (c447270HgL2 != null) {
                c447270HgL2.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, c430001lq.getContext()));
            }
            C447270HgL c447270HgL3 = c430001lq.LLILZIL.get(Integer.valueOf(i));
            if (c447270HgL3 != null) {
                c447270HgL3.setIconColor(C20736316Cj.LIZIZ(R.attr.ezs, c430001lq.getContext()));
            }
            InterfaceC430501lv interfaceC430501lv = c430001lq.LLIZ;
            if (interfaceC430501lv != null) {
                interfaceC430501lv.LIZ();
            }
        } else {
            for (C447270HgL c447270HgL4 : c430001lq.LLILZIL.values()) {
                if (c447270HgL4 != null) {
                    c447270HgL4.setSelected(false);
                    c447270HgL4.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, c430001lq.getContext()));
                    c447270HgL4.setIconColor(C20736316Cj.LIZIZ(R.attr.ezs, c430001lq.getContext()));
                }
            }
            C447270HgL c447270HgL5 = c430001lq.LLILZIL.get(Integer.valueOf(i));
            if (c447270HgL5 != null) {
                c447270HgL5.setSelected(true);
            }
            c430001lq.LLILZLL = i;
            C447270HgL c447270HgL6 = c430001lq.LLILZIL.get(Integer.valueOf(i));
            if (c447270HgL6 != null) {
                c447270HgL6.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, c430001lq.getContext()));
            }
            C447270HgL c447270HgL7 = c430001lq.LLILZIL.get(Integer.valueOf(i));
            if (c447270HgL7 != null) {
                c447270HgL7.setIconColor(C20736316Cj.LIZIZ(R.attr.ezq, c430001lq.getContext()));
            }
            InterfaceC430501lv interfaceC430501lv2 = c430001lq.LLIZ;
            if (interfaceC430501lv2 != null) {
                interfaceC430501lv2.LIZ();
            }
        }
        return Unit.LIZ;
    }
}
