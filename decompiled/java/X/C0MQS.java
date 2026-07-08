package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MQS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MQS extends AbstractC568390MQz {
    public final C19A3 LLILZIL;
    public final VideoPublishEditModel LLILZLL;
    public final int LLIZ;
    public final C01GW LLIZLLLIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 1;
    }

    public final C568710MSf LJJIL() {
        return (C568710MSf) this.LLIZLLLIL.getValue();
    }

    @Override // X.C0MR0
    public final Object LJJIJL(int i) {
        return LJJIL();
    }

    public C0MQS(C19A3 c19a3, VideoPublishEditModel videoPublishEditModel, int i) {
        super(c19a3);
        this.LLILZIL = c19a3;
        this.LLILZLL = videoPublishEditModel;
        this.LLIZ = i;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 891));
    }
}
