package X;

import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayVideoPreloadSetting;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.player.LiveHighlightPreloadHelper$preloadUrl$1", f = "LiveHighlightPreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C1057360dcc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057360dcc(String str, String str2, InterfaceC1364105Vn<? super C1057360dcc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1057360dcc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveHighlightPreloadHelper@46cd.preloadUrl$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0THJ.LIZ.getClass();
        if (!C0THJ.LIZIZ()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LiveHighlightPreloadHelper@46cd.preloadUrl$1");
            return unit;
        }
        String str = this.LL;
        if (str == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LiveHighlightPreloadHelper@46cd.preloadUrl$1");
            return unit2;
        }
        if (str.length() == 0) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("LiveHighlightPreloadHelper@46cd.preloadUrl$1");
            return unit3;
        }
        String str2 = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload url = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" key = ");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("LiveHighlightPreloadHelper", C2188811AlT.LIZIZ(sbLIZ));
        C582130MsN.LIZ().LJ().getClass();
        C1482860ogu c1482860ogu = C1014030cUj.LIZ;
        if (C1482860ogu.LJL(str2) <= 0 && str2.length() != 0) {
            C1482580ogS c1482580ogS = new C1482580ogS();
            c1482580ogS.LIZ = str2;
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZIZ(str);
            c1058540deW.LIZIZ = str2;
            C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
            C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
            c1482580ogS2.LJ = c1482570ogRLIZ;
            C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogS2).LIZ();
            C582130MsN.LIZ().LJ().getClass();
            c1482860ogu.LJIILLIIL(LiveReplayVideoPreloadSetting.INSTANCE.getPreloadVideoSize(), Collections.singletonList(c1482560ogQLIZ));
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("LiveHighlightPreloadHelper@46cd.preloadUrl$1");
            return unit4;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("LiveHighlightPreloadHelper@46cd.preloadUrl$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
