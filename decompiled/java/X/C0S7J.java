package X;

import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S7J, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S7J extends C09AY implements Function1<C715890S6h, Unit> {
    public final /* synthetic */ C0S7K LL;
    public final /* synthetic */ VideoDescVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S7J(C0S7K c0s7k, VideoDescVM videoDescVM) {
        super(1);
        this.LL = c0s7k;
        this.LLILLJJLI = videoDescVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C715890S6h c715890S6h) {
        String str;
        String str2;
        C0S7K c0s7k = c715890S6h.LLJI;
        C0S7K c0s7k2 = this.LL;
        C0S7K c0s7k3 = null;
        charSequence = null;
        CharSequence charSequence = null;
        if (c0s7k2 != null) {
            CharSequence charSequence2 = c0s7k2.LIZIZ;
            if (charSequence2 == null) {
                if (c0s7k != null) {
                    str2 = c0s7k.LIZLLL;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, c0s7k2.LIZLLL) && c0s7k != null) {
                    charSequence2 = c0s7k.LIZIZ;
                } else {
                    charSequence2 = null;
                }
            }
            C0S7K c0s7k4 = this.LL;
            CharSequence charSequence3 = c0s7k4.LIZ;
            if (charSequence3 == null) {
                if (c0s7k != null) {
                    str = c0s7k.LIZLLL;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, c0s7k4.LIZLLL) && c0s7k != null) {
                    charSequence = c0s7k.LIZ;
                }
            } else {
                charSequence = charSequence3;
            }
            C0S7K c0s7k5 = this.LL;
            c0s7k3 = new C0S7K(charSequence, charSequence2, c0s7k5.LIZJ, c0s7k5.LIZLLL);
        }
        this.LLILLJJLI.setState(new C0S7I(c0s7k3));
        return Unit.LIZ;
    }
}
