package X;

import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SA7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SA7 extends C09AY implements Function1<C0S9P, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ PhotoViewModelV2 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SA7(int i, PhotoViewModelV2 photoViewModelV2, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = photoViewModelV2;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0S9P c0s9p) {
        C0S9P c0s9p2 = c0s9p;
        int i = c0s9p2.LL;
        int i2 = this.LL;
        C830490Whz c830490WhzLIZ = null;
        if (i != i2) {
            this.LLILLJJLI.EQ2(i2);
            if (c0s9p2.LLILZIL) {
                PhotoViewModelV2 photoViewModelV2 = this.LLILLJJLI;
                if (photoViewModelV2.LLJ < 0) {
                    photoViewModelV2.LLJ = System.currentTimeMillis() - this.LLILLJJLI.LLIZLLLIL;
                }
            }
            PhotoViewModelV2 photoViewModelV22 = this.LLILLJJLI;
            if (photoViewModelV22.LLJJJJ || photoViewModelV22.DQ2()) {
                if (C123100dR.LIZ(this.LLILLJJLI.yQ2())) {
                    c830490WhzLIZ = C0W38.LIZ(new Pair("action_from_page", this.LLILLJJLI.yQ2()));
                }
                PhotoViewModelV2 photoViewModelV23 = this.LLILLJJLI;
                photoViewModelV23.LL.LIZ(this.LL, c0s9p2.LLILZIL, c0s9p2.LLILZLL, this.LLILLL, photoViewModelV23.LLJ, c0s9p2.LLJJIJIL, c830490WhzLIZ);
            }
        } else if (c0s9p2.LLJJLIIIJLLLLLLLZ) {
            PhotoViewModelV2 photoViewModelV24 = this.LLILLJJLI;
            if (photoViewModelV24.LLJJJJ || photoViewModelV24.DQ2()) {
                if (C123100dR.LIZ(this.LLILLJJLI.yQ2())) {
                    c830490WhzLIZ = C0W38.LIZ(new Pair("action_from_page", this.LLILLJJLI.yQ2()));
                }
                this.LLILLJJLI.LL.LIZ(this.LL, c0s9p2.LLILZIL, c0s9p2.LLILZLL, this.LLILLL, -1L, false, c830490WhzLIZ);
            }
        }
        return Unit.LIZ;
    }
}
