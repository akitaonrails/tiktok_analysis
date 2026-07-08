package X;

import Y.ARunnableS121S0100000_21;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0lw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376910lw1 extends AbstractC736370SuZ {
    public final C1379170lzf LLILZ;
    public final InterfaceC1374230lrh LLILZIL;

    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        float f = CastFloatProtector.parseFloat(((AppCompatTextView) view).getText().subSequence(0, r10.getText().length() - 1).toString());
        C589960NBy c589960NBy = C589960NBy.LIZ;
        Aweme aweme = this.LLILLJJLI;
        c589960NBy.getClass();
        if (C589960NBy.LIZLLL(f, aweme)) {
            C1386110mAr c1386110mAr = C1386110mAr.LIZ;
            Aweme aweme2 = this.LLILLJJLI;
            String str = this.LLILZ.LLILLJJLI;
            HashMap map = new HashMap();
            c1386110mAr.getClass();
            C1386110mAr.LIZIZ(f, aweme2, null, str, "long_press", map);
            C589960NBy.LJ(f, this.LLILLJJLI, this.LLILZ.LLILLJJLI, "long_press");
            if (C299550Bof.LIZ()) {
                C1386110mAr.LIZIZ = "long_press";
            }
        }
    }

    @Override // X.AbstractC1376810lvr
    public final void LJII(View view) {
        C786410Ut5.LJLIIL(100L, new BPEAHandler(view.getContext().getMainLooper()), new ARunnableS121S0100000_21(this, 94));
        LIZIZ(view);
    }

    public C1376910lw1(C1379170lzf c1379170lzf, InterfaceC1374230lrh interfaceC1374230lrh) {
        super(c1379170lzf, interfaceC1374230lrh);
        this.LLILZ = c1379170lzf;
        this.LLILZIL = interfaceC1374230lrh;
    }
}
