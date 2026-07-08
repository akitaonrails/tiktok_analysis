package X;

import android.util.Size;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669560tY2 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1665870tS5 LL;
    public final /* synthetic */ SocMediaResource LLILLJJLI;
    public final /* synthetic */ MediaEngine LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Size LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669560tY2(InterfaceC1665870tS5 interfaceC1665870tS5, SocMediaResource socMediaResource, MediaEngine mediaEngine, boolean z, boolean z2, boolean z3, int i, Size size, boolean z4, int i2, int i3) {
        super(2);
        this.LL = interfaceC1665870tS5;
        this.LLILLJJLI = socMediaResource;
        this.LLILLL = mediaEngine;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = i;
        this.LLIZLLLIL = size;
        this.LLJ = z4;
        this.LLJI = i2;
        this.LLJIJIL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669600tY6.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1), this.LLJIJIL);
        return Unit.LIZ;
    }
}
