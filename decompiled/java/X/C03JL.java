package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03JL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JL implements Function1<C1397660mTU, Unit> {
    public final C03DB LL;
    public final Context LLILLJJLI;
    public final ButtonAction LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function1<FetchInfo, Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function0<Unit> LLIZ;
    public final Function1<String, Unit> LLIZLLLIL;
    public final Function0<Unit> LLJ;
    public final Function0<Unit> LLJI;
    public final String LLJIJIL;
    public final HashMap<String, Object> LLJILJIL;
    public final Function0<Unit> LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public final Function0<Unit> LLJJ;
    public final C03O1 LLJJI;

    public final boolean LIZJ() {
        ButtonActionInfo buttonActionInfo;
        ButtonAction buttonAction = this.LLILLL;
        String str = null;
        if (buttonAction != null && (buttonActionInfo = buttonAction.buttonActionInfo) != null) {
            str = buttonActionInfo.schema;
        }
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        SmartRouter.buildRoute(this.LLILLJJLI, C919503ib.LIZ(str, C2097908Jt.LIZJ(new Pair("trackParams", C1741890vQh.LJIIIIZZ(C2097908Jt.LIZJ(new Pair("previous_page", "order_submit"))))))).open();
        return Unit.LIZ != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0259  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C1397660mTU r18) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03JL.invoke(java.lang.Object):java.lang.Object");
    }

    public static void LIZ(C03O1 c03o1, String str, String str2, String str3, String str4, Map map, boolean z) {
        if (c03o1 != null) {
            C03O1.LJIILLIIL(c03o1, str, str2, str3, str4, map, null, z, 32);
        } else {
            C03O0.LJJLIIIJ(C03O0.LIZ, str, str2, str3, str4, map, null, z, 32);
        }
    }

    public C03JL(C03DB c03db, Context context, ButtonAction buttonAction, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function1 function12, Function0 function04, Function0 function05, String str, HashMap map, Function0 function06, Function0 function07, Function0 function08, C03O1 c03o1, int i) {
        Function0 function09 = function03;
        Function0 function010 = function05;
        Function0 function011 = function04;
        Function1 function13 = function12;
        Function0 function012 = function06;
        HashMap map2 = map;
        String str2 = str;
        Function0 function013 = function08;
        Function0 function014 = function07;
        Function0 function015 = (i & 32) != 0 ? null : function02;
        function09 = (i & 64) != 0 ? null : function09;
        function13 = (i & 128) != 0 ? null : function13;
        function011 = (i & 256) != 0 ? null : function011;
        function010 = (i & 512) != 0 ? null : function010;
        str2 = (i & 1024) != 0 ? null : str2;
        map2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : map2;
        function012 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : function012;
        function014 = (i & 8192) != 0 ? null : function014;
        function013 = (32768 & i) != 0 ? null : function013;
        C03O1 c03o12 = (i & 65536) == 0 ? c03o1 : null;
        this.LL = c03db;
        this.LLILLJJLI = context;
        this.LLILLL = buttonAction;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = function015;
        this.LLIZ = function09;
        this.LLIZLLLIL = function13;
        this.LLJ = function011;
        this.LLJI = function010;
        this.LLJIJIL = str2;
        this.LLJILJIL = map2;
        this.LLJILJILJ = function012;
        this.LLJILLL = function014;
        this.LLJJ = function013;
        this.LLJJI = c03o12;
    }
}
