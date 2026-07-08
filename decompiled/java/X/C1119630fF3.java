package X;

import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: renamed from: X.0fF3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119630fF3 extends AbstractC1119600fF0 {
    public final Context LIZIZ;
    public final List<String> LIZJ;
    public C11JF LIZLLL;

    @Override // X.AbstractC1119600fF0
    public final void LIZJ() {
        C11JF c11jf = this.LIZLLL;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        c11jf.dispose();
    }

    @Override // X.AbstractC1119600fF0
    public final EnumC1119730fFD LIZ() {
        return EnumC1119730fFD.REMOTE;
    }

    @Override // X.AbstractC1119600fF0
    public final void LIZIZ(C1119650fF5 c1119650fF5) {
        ImageModel imageModel = new ImageModel();
        imageModel.setUrls(this.LIZJ);
        this.LIZLLL = (C11JF) C1121670fIL.LJ(imageModel).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS153S0200000_17(this, c1119650fF5, 36), new AfS186S0100000_17(c1119650fF5, 199));
    }

    public C1119630fF3(Context context, List<String> list) {
        super(list);
        this.LIZIZ = context;
        this.LIZJ = list;
    }
}
