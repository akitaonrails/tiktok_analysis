package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS41S0310000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595570rch extends C09AY implements Function1<C1595530rcd, C1595530rcd> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ C1595550rcf LLILLL;
    public final /* synthetic */ StoryToolBarIconViewModel LLILZ;
    public final /* synthetic */ C1595550rcf LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595570rch(String str, Bitmap bitmap, C1595550rcf c1595550rcf, StoryToolBarIconViewModel storyToolBarIconViewModel, C1595550rcf c1595550rcf2, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = bitmap;
        this.LLILLL = c1595550rcf;
        this.LLILZ = storyToolBarIconViewModel;
        this.LLILZIL = c1595550rcf2;
        this.LLILZLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1595530rcd invoke(C1595530rcd c1595530rcd) {
        boolean z;
        boolean z2;
        boolean z3;
        C1595530rcd c1595530rcdLIZ = C1595530rcd.LIZ(c1595530rcd, null, this.LL, false, false, false, 0, 0, this.LLILLJJLI, this.LLILLL, 0, null, 3709);
        C1595550rcf c1595550rcf = this.LLILLL;
        StoryToolBarIconViewModel storyToolBarIconViewModel = this.LLILZ;
        String str = this.LL;
        C1595550rcf c1595550rcf2 = this.LLILZIL;
        boolean z4 = this.LLILZLL;
        boolean z5 = true;
        if (c1595550rcf.LIZ(2) && Intrinsics.LJFF(storyToolBarIconViewModel.LLILLJJLI.get(str), Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        if (c1595550rcf2 != null && Integer.valueOf(c1595550rcf2.LJIIIIZZ) != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c1595550rcf.LIZIZ(c1595550rcf2) && !z4) {
            z3 = false;
        } else {
            z3 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z3);
        if (z && !z2) {
            z5 = false;
        }
        storyToolBarIconViewModel.getClass();
        storyToolBarIconViewModel.setState(new AwS41S0310000_24(storyToolBarIconViewModel, c1595530rcdLIZ, boolValueOf, z5, 1));
        return c1595530rcdLIZ;
    }
}
