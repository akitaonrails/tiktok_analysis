package X;

import Y.AComparatorS505S0100000_6;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS692S0100000_10;

/* JADX INFO: renamed from: X.0R1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689140R1k extends FrameLayout {
    public static final /* synthetic */ int LLIZ = 0;
    public C431730GwN LL;
    public C689200R1q LLILLJJLI;
    public C21415018rM LLILLL;
    public boolean LLILZ;
    public InterfaceC689210R1r LLILZIL;
    public C689170R1n LLILZLL;

    private final List<Integer> getExposedQuotesCount() {
        SpannableString spannableString;
        SpannableString spannableString2;
        C689200R1q c689200R1q = this.LLILLJJLI;
        if (c689200R1q != null) {
            CharSequence text = c689200R1q.getText();
            if ((text instanceof SpannableString) && (spannableString2 = (SpannableString) text) != null) {
                Object[] spans = spannableString2.getSpans(0, spannableString2.length(), C418260Gae.class);
                C418260Gae[] c418260GaeArr = (C418260Gae[]) spans;
                if (c418260GaeArr.length > 1) {
                    AComparatorS505S0100000_6 aComparatorS505S0100000_6 = new AComparatorS505S0100000_6(spannableString2, 5);
                    if (c418260GaeArr.length > 1) {
                        Arrays.sort(c418260GaeArr, aComparatorS505S0100000_6);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(((C418260Gae) obj).LLILLL.toString());
                    if (numLJIIJJI != null) {
                        arrayList.add(numLJIIJJI);
                    }
                }
                return arrayList;
            }
            C13BV c13bv = C13BV.INSTANCE;
            if (c13bv != null) {
                return c13bv;
            }
        }
        C431730GwN c431730GwN = this.LL;
        if (c431730GwN == null) {
            return C13BV.INSTANCE;
        }
        CharSequence text2 = c431730GwN.getText();
        if (!(text2 instanceof SpannableString) || (spannableString = (SpannableString) text2) == null) {
            return C13BV.INSTANCE;
        }
        Object[] spans2 = spannableString.getSpans(0, spannableString.length(), C418260Gae.class);
        C418260Gae[] c418260GaeArr2 = (C418260Gae[]) spans2;
        if (c418260GaeArr2.length > 1) {
            AComparatorS505S0100000_6 aComparatorS505S0100000_62 = new AComparatorS505S0100000_6(spannableString, 4);
            if (c418260GaeArr2.length > 1) {
                Arrays.sort(c418260GaeArr2, aComparatorS505S0100000_62);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : spans2) {
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(((C418260Gae) obj2).LLILLL.toString());
            if (numLJIIJJI2 != null) {
                arrayList2.add(numLJIIJJI2);
            }
        }
        return arrayList2;
    }

    public final InterfaceC689210R1r getOnMarkdownClickListener() {
        return this.LLILZIL;
    }

    public C689140R1k(Context context) {
        int i;
        C431730GwN c431730GwN;
        super(context, null, 0);
        this.LLILZLL = new C689170R1n(0, null, false);
        if (C301250BrP.LIZ()) {
            i = R.layout.f4o;
        } else if (C301240BrO.LIZ()) {
            i = R.layout.f4n;
        } else {
            i = R.layout.f4m;
        }
        if (C301150BrF.LIZ() != 0) {
            C650520PfO c650520PfO = C650520PfO.LIZ;
            Context context2 = getContext();
            c650520PfO.getClass();
            C650520PfO.LIZIZ(context2, i, this, true);
        } else {
            C786410Ut5.Td(C786410Ut5.ne(getContext()), i, this, true);
        }
        View viewFindViewById = findViewById(R.id.o03);
        if (viewFindViewById instanceof C431730GwN) {
            c431730GwN = (C431730GwN) viewFindViewById;
        } else {
            c431730GwN = null;
        }
        this.LL = c431730GwN;
        this.LLILLJJLI = viewFindViewById instanceof C689200R1q ? (C689200R1q) viewFindViewById : null;
        if (C301240BrO.LIZ()) {
            this.LLILLL = (C21415018rM) findViewById(R.id.o04);
            LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
            if (localTestApi != null && Intrinsics.LJFF(localTestApi.getSearchDebugSwitch(), Boolean.TRUE)) {
                C21415018rM c21415018rM = this.LLILLL;
                if (c21415018rM != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    c419910GdJ.LIZ = R.raw.icon_emoji_like;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ob);
                    c21415018rM.setBackground(c419910GdJ.LIZ(getContext()));
                }
                C431730GwN c431730GwN2 = this.LL;
                if (c431730GwN2 != null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    c419910GdJ2.LIZ = R.raw.icon_lines_horizontal_decrease_rectangle_ltr;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.ob);
                    c431730GwN2.setBackground(c419910GdJ2.LIZ(getContext()));
                }
                C689200R1q c689200R1q = this.LLILLJJLI;
                if (c689200R1q != null) {
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    c419910GdJ3.LIZ = R.raw.icon_update;
                    c419910GdJ3.LJ = Integer.valueOf(R.attr.ob);
                    c689200R1q.setBackground(c419910GdJ3.LIZ(getContext()));
                }
            }
        }
        C431730GwN c431730GwN3 = this.LL;
        if (c431730GwN3 != null) {
            C341990Dav.LIZ(c431730GwN3, c431730GwN3.getContext(), 0, 0, null, 14);
            c431730GwN3.setTruncateType(EnumC431710GwL.VIEW_ALL);
            c431730GwN3.setCustomShowTruncateIcon(true);
            c431730GwN3.setEnableToggleAction(false);
            C786410Ut5.I7(new AbS692S0100000_10(this, 31), c431730GwN3);
        }
        C689200R1q c689200R1q2 = this.LLILLJJLI;
        if (c689200R1q2 != null) {
            c689200R1q2.setCustomShowTruncateIcon(true);
            c689200R1q2.setEnableToggleAction(false);
            C786410Ut5.I7(new AbS692S0100000_10(this, 32), c689200R1q2);
        }
    }

    public final void LIZ(Callback callback) {
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putArray("quoteList", JavaOnlyArray.from(getExposedQuotesCount()));
        callback.invoke(0, javaOnlyMap);
    }

    public final void LIZIZ(C689170R1n c689170R1n) {
        String str;
        Integer numLIZJ;
        if (C301240BrO.LIZ() && this.LLILZ && !Intrinsics.LJFF(c689170R1n, this.LLILZLL)) {
            this.LLILZLL = c689170R1n;
            if (c689170R1n.LIZ > 0 && (str = c689170R1n.LIZIZ) != null) {
                C1860130yVP c1860130yVP = this.LLILLJJLI;
                if (c1860130yVP == null) {
                    c1860130yVP = this.LL;
                }
                CharSequence charSequenceLIZIZ = C688750Qzx.LIZIZ(c1860130yVP, str, c689170R1n.LIZJ);
                int i = c689170R1n.LIZ;
                boolean z = c689170R1n.LIZJ;
                Context context = getContext();
                if (context != null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                } else {
                    numLIZJ = null;
                }
                Layout layoutLIZ = C688750Qzx.LIZ(i, charSequenceLIZIZ, z, numLIZJ);
                C21415018rM c21415018rM = this.LLILLL;
                if (c21415018rM != null) {
                    c21415018rM.setTextLayout(layoutLIZ);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setConfig(com.lynx.react.bridge.ReadableMap r69) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C689140R1k.setConfig(com.lynx.react.bridge.ReadableMap):void");
    }

    public final void setOnMarkdownClickListener(InterfaceC689210R1r interfaceC689210R1r) {
        this.LLILZIL = interfaceC689210R1r;
    }
}
