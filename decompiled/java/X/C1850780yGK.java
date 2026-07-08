package X;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventPeriodicAnchorSetting;
import com.ss.android.ugc.aweme.live.liveevent.sticker.sheet.base.SingleOptionSelectionSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: renamed from: X.0yGK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850780yGK {
    public static final /* synthetic */ int LIZ = 0;

    public static SingleOptionSelectionSheet LIZ(Context context, List list, boolean z, float f, int i, Function2 function2, Function2 function22, Function2 function23, Function1 function1) {
        FragmentManager supportFragmentManager;
        String strLJIJJ;
        C1850790yGL c1850790yGL = new C1850790yGL();
        c1850790yGL.LIZ.LLJJIJI = 0;
        boolean zEnable = LiveEventPeriodicAnchorSetting.INSTANCE.enable();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LiveEventModule liveEventModule = (LiveEventModule) it2.next();
            String str = liveEventModule.id;
            if (str == null) {
                str = "";
            }
            if (zEnable && liveEventModule.LIZIZ()) {
                if (!liveEventModule.LIZIZ()) {
                    strLJIJJ = liveEventModule.title;
                } else {
                    strLJIJJ = liveEventModule.periodicTitle;
                    if (strLJIJJ == null || strLJIJJ.length() == 0) {
                        strLJIJJ = liveEventModule.title;
                    }
                }
            } else {
                long j = liveEventModule.startTime * 1000;
                int i2 = C1840150xzB.LIZ;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j);
                int i3 = calendar.get(1);
                calendar.setTimeInMillis(System.currentTimeMillis());
                if (i3 == calendar.get(1)) {
                    if (DateUtils.isToday(j)) {
                        strLJIJJ = C497740JfY.LJIJJ(2131834263, C1840140xzA.LIZJ.format(Long.valueOf(j)));
                    } else {
                        strLJIJJ = C1840140xzA.LIZIZ.format(Long.valueOf(j));
                    }
                } else {
                    strLJIJJ = C1840140xzA.LIZ.format(Long.valueOf(j));
                }
            }
            arrayList.add(new C1406260mhM(str, strLJIJJ, liveEventModule.title, null));
        }
        SingleOptionSelectionSheet singleOptionSelectionSheet = c1850790yGL.LIZ;
        singleOptionSelectionSheet.LLJJIJIL = arrayList;
        singleOptionSelectionSheet.LLJJJJ = false;
        String string = context.getString(2131851049);
        AwS641S0100000_27 awS641S0100000_27 = new AwS641S0100000_27(function23, (Function2<? super C1854470yMH, ? super Context, Unit>) 123);
        SingleOptionSelectionSheet singleOptionSelectionSheet2 = c1850790yGL.LIZ;
        singleOptionSelectionSheet2.LLJJJJLIIL = string;
        singleOptionSelectionSheet2.LLJJL = awS641S0100000_27;
        String string2 = context.getString(2131851048);
        AwS641S0100000_27 awS641S0100000_272 = new AwS641S0100000_27(function22, (Function2<? super C1854470yMH, ? super Context, Unit>) 124);
        SingleOptionSelectionSheet singleOptionSelectionSheet3 = c1850790yGL.LIZ;
        singleOptionSelectionSheet3.LLJJLIIIJLLLLLLLZ = string2;
        singleOptionSelectionSheet3.LLJL = awS641S0100000_272;
        singleOptionSelectionSheet3.LLJLILLLLZIIL = function2;
        singleOptionSelectionSheet3.LLJLIL = i;
        singleOptionSelectionSheet3.LLJLL = z;
        singleOptionSelectionSheet3.LLJLLIL = f;
        AwS428S0200000_27 awS428S0200000_27 = new AwS428S0200000_27(function1, (Function1<? super SingleOptionSelectionSheet, Unit>) c1850790yGL, (C1850790yGL) 94);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = context.getString(2131851050);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS571S0100000_27(awS428S0200000_27, 1270));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        SingleOptionSelectionSheet singleOptionSelectionSheet4 = c1850790yGL.LIZ;
        singleOptionSelectionSheet4.LLJJIII = c0om1;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            singleOptionSelectionSheet4.show(supportFragmentManager, "LiveEventSelection");
        }
        return singleOptionSelectionSheet4;
    }
}
