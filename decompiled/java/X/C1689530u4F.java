package X;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS426S0200000_25;
import njp.a;

/* JADX INFO: renamed from: X.0u4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealNotificationSheetHelper$runShowFlow$2", f = "StoryRevealNotificationSheetHelper.kt", l = {}, m = "invokeSuspend")
public final class C1689530u4F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1673620tea> LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C1689500u4C LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ IUpdateSettingService LLILZIL;
    public final /* synthetic */ ISettingService LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689530u4F(List<C1673620tea> list, Function0<Unit> function0, C1689500u4C c1689500u4C, C19EG c19eg, IUpdateSettingService iUpdateSettingService, ISettingService iSettingService, String str, String str2, Function0<Unit> function02, InterfaceC1364105Vn<? super C1689530u4F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = function0;
        this.LLILLL = c1689500u4C;
        this.LLILZ = c19eg;
        this.LLILZIL = iUpdateSettingService;
        this.LLILZLL = iSettingService;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1689530u4F(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("StoryRevealNotificationSheetHelper@bf38.runShowFlow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isEmpty()) {
            Function0<Unit> function0 = this.LLILLJJLI;
            if (function0 != null) {
                function0.invoke();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.runShowFlow$2");
            return unit;
        }
        C1689500u4C c1689500u4C = this.LLILLL;
        C19EG c19eg = this.LLILZ;
        List<C1673620tea> list = this.LL;
        IUpdateSettingService iUpdateSettingService = this.LLILZIL;
        ISettingService iSettingService = this.LLILZLL;
        String str = this.LLIZ;
        String str2 = this.LLIZLLLIL;
        Function0<Unit> function02 = this.LLILLJJLI;
        synchronized (c1689500u4C) {
            try {
                if (c1689500u4C.LIZ == null) {
                    C13ES c13es = new C13ES();
                    c13es.addAll(list);
                    ComposeView composeView = new ComposeView(c19eg, null, 6);
                    C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1110326998, new C1673590teX(c13es, c1689500u4C, str, str2, iUpdateSettingService, iSettingService), true));
                    AwS426S0200000_25 awS426S0200000_25 = new AwS426S0200000_25(c1689500u4C, (C1689500u4C) function02, (Function0<Unit>) 153);
                    final C259800zU c259800zU = new C259800zU();
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1f, c19eg);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = Integer.valueOf(iIntValue);
                    c384050F3z.LIZJ = Float.valueOf(iLIZIZ / 2.0f);
                    c384050F3z.LJII = iLIZIZ;
                    c384050F3z.LJI = iLIZIZ;
                    Drawable drawableLIZ = c384050F3z.LIZ(c19eg);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_x_mark_small;
                    int iLIZJ = C1308910kAL.LIZJ(R.attr.a1j, c19eg);
                    if (iLIZJ == null) {
                        iLIZJ = 0;
                    }
                    c419910GdJ.LIZLLL = iLIZJ;
                    c419910GdJ.LIZIZ = iLIZIZ2;
                    c419910GdJ.LIZJ = iLIZIZ2;
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c19eg);
                    C0OM1 c0om1 = new C0OM1();
                    C1250250idj c1250250idj = new C1250250idj();
                    c1250250idj.LIZJ = c19eg.getString(2131849061);
                    c0om1.LIZJ = c1250250idj;
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    AwS370S0200000_4 awS370S0200000_4 = new AwS370S0200000_4(tuxIconDrawableLIZ, drawableLIZ, 87);
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LJFF = awS370S0200000_4;
                    c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.0Thx
                        @Override // X.InterfaceC197023126r
                        public final void LIZ() {
                            TuxSheet tuxSheet = c259800zU.element;
                            if (tuxSheet != null) {
                                tuxSheet.dismissAllowingStateLoss();
                            }
                        }
                    };
                    c0om1.LIZIZ(c1251150ifB);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIII = composeView;
                    tuxSheet.LLJJIJIL = c0om1;
                    tuxSheet.LLJJJ = null;
                    c1390920mIc.LJIIIIZZ(0);
                    c1390920mIc.LIZ.LLJJIJIIJIL = true;
                    c1390920mIc.LIZJ(false);
                    ?? r2 = c1390920mIc.LIZ;
                    r2.LLJI = numLIZJ2;
                    r2.LLJLILLLLZIIL = false;
                    r2.LLILLJJLI = new DialogInterfaceOnDismissListenerC1698140uI8(awS426S0200000_25, 1);
                    c259800zU.element = r2;
                    synchronized (c1689500u4C) {
                        try {
                            if (c1689500u4C.LIZ == null) {
                                c1689500u4C.LIZ = r2;
                                r2.show(c19eg.getSupportFragmentManager(), "StoryRevealNotifications");
                                Function0<Unit> function03 = this.LLJ;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.runShowFlow$2");
                    return unit2;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        Function0<Unit> function04 = this.LLILLJJLI;
        if (function04 != null) {
            function04.invoke();
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.runShowFlow$2");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
