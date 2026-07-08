package X;

import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS128S0101000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375750lu9 extends AbstractC736370SuZ {
    public final C01GW LLILZ;
    public int LLILZIL;

    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        Aweme aweme = this.LLILLJJLI;
        if (aweme == null) {
            return;
        }
        ((InterfaceC1618460sDc) this.LLILZ.getValue()).LJIIJ(new C20271514Tp(view.getContext(), aweme, this.LLILLL, null, null, null, 0, C1375730lu7.LIZIZ.LJI(), null, false, null, null, C298460Bmu.LIZ(), false, null, null, null, null, 1031672));
        ((InterfaceC1618460sDc) this.LLILZ.getValue()).LJI(aweme, "share_to_story_click", new AwS600S0100000_21(this, 226));
    }

    public C1375750lu9(C1379170lzf c1379170lzf, InterfaceC1374230lrh interfaceC1374230lrh) {
        super(c1379170lzf, interfaceC1374230lrh);
        this.LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(435));
        this.LLILZIL = -1;
    }

    @Override // X.AbstractC1376810lvr
    public final void LJIIIIZZ(ImageView imageView, View view, int i) {
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            ((InterfaceC1618460sDc) this.LLILZ.getValue()).LJI(aweme, "share_to_story_show", new AwS128S0101000_21(this, i, 4));
        }
        this.LLILZIL = i;
    }
}
