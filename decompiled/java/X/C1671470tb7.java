package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671470tb7 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocMediaResource LL;
    public final /* synthetic */ Function1<EnumC1360305Ub, Unit> LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;
    public final /* synthetic */ Function1<Float, Unit> LLILZ;
    public final /* synthetic */ C1683130ttv LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ MediaEngine LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1671470tb7(SocMediaResource socMediaResource, Function1<? super EnumC1360305Ub, Unit> function1, Function1<? super String, Unit> function12, Function1<? super Float, Unit> function13, C1683130ttv c1683130ttv, boolean z, MediaEngine mediaEngine, int i) {
        super(2);
        this.LL = socMediaResource;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
        this.LLILZ = function13;
        this.LLILZIL = c1683130ttv;
        this.LLILZLL = z;
        this.LLIZ = mediaEngine;
        this.LLIZLLLIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1671460tb6.LJII(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1));
        return Unit.LIZ;
    }
}
