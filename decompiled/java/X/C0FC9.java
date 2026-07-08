package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FC9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0FC9<STATE, ACTION> extends AbstractC1664490tPr<STATE, ACTION> {
    public final C1DRG LLJJJIL;
    public final C01GW LLJJJJ;

    public static final VideoPublishEditModel LLLLLJIL() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final C0E48 LIZIZ() {
        return (C0E48) this.LLJJJJ.getValue();
    }

    public C0FC9(C1DRG c1drg) {
        this.LLJJJIL = c1drg;
        setTheme(R.style.y0);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1050));
    }
}
