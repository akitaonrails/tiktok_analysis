package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import io.noties.markwon.core.spans.CustomLinkSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860140yVQ implements InterfaceC342000Daw {
    public static final Object LJIIIZ = new Object();
    public SpannableStringBuilder LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC1860180yVU LJ;
    public final C1877207Ww LJFF;
    public final WeakHashMap<View, List<C0DO0>> LJI = new WeakHashMap<>();
    public final C01GW LJII = C452501pT.LIZIZ(new AwS567S0100000_23(this, 193));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1317));

    @Override // X.InterfaceC342000Daw
    public final SpannableStringBuilder LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC342000Daw
    public final C1877207Ww LJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC342000Daw
    public final void LIZ(C0GV2 c0gv2) {
        SpannableStringBuilder spannableStringBuilder = this.LIZ;
        for (InterfaceC1859880yV0 interfaceC1859880yV0 : (InterfaceC1859880yV0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), InterfaceC1859880yV0.class)) {
            interfaceC1859880yV0.LIZ(c0gv2);
        }
    }

    @Override // X.InterfaceC342000Daw
    public final void LIZJ(C0GV3 c0gv3) {
        SpannableStringBuilder spannableStringBuilder = this.LIZ;
        for (InterfaceC1859880yV0 interfaceC1859880yV0 : (InterfaceC1859880yV0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), InterfaceC1859880yV0.class)) {
            interfaceC1859880yV0.LIZIZ(c0gv3);
        }
    }

    @Override // X.InterfaceC342000Daw
    public final void LJFF(SpannableStringBuilder spannableStringBuilder) {
        this.LIZ = spannableStringBuilder;
    }

    public final void LJIIIZ(View view) {
        List<C0DO0> listRemove = this.LJI.remove(view);
        if (listRemove != null) {
            Iterator<C0DO0> it2 = listRemove.iterator();
            while (it2.hasNext()) {
                this.LIZ.removeSpan(it2.next());
            }
        }
    }

    @Override // X.InterfaceC342000Daw
    public final void LIZIZ(View view, InterfaceC328600CuQ interfaceC328600CuQ) {
        SpannableStringBuilder spannableStringBuilder = this.LIZ;
        InterfaceC431020GvE[] interfaceC431020GvEArr = (InterfaceC431020GvE[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), InterfaceC431020GvE.class);
        for (InterfaceC431020GvE interfaceC431020GvE : interfaceC431020GvEArr) {
            interfaceC431020GvE.LJFF(null);
        }
        SpannableStringBuilder spannableStringBuilder2 = this.LIZ;
        InterfaceC431020GvE[] interfaceC431020GvEArr2 = (InterfaceC431020GvE[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), InterfaceC431020GvE.class);
        SpannableStringBuilder spannableStringBuilder3 = this.LIZ;
        for (C21408318qH c21408318qH : (C21408318qH[]) spannableStringBuilder3.getSpans(0, spannableStringBuilder3.length(), C21408318qH.class)) {
            c21408318qH.LLJJIJIIJIL = interfaceC328600CuQ;
        }
        for (InterfaceC431020GvE interfaceC431020GvE2 : interfaceC431020GvEArr2) {
            interfaceC431020GvE2.LJFF(interfaceC328600CuQ);
        }
    }

    @Override // X.InterfaceC342000Daw
    public final void LJ(InterfaceC328600CuQ interfaceC328600CuQ, C0R20 c0r20) {
        try {
            SpannableStringBuilder spannableStringBuilder = this.LIZ;
            for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CustomLinkSpan.class)) {
                CustomLinkSpan customLinkSpan = (CustomLinkSpan) obj;
                int spanStart = this.LIZ.getSpanStart(customLinkSpan);
                int spanEnd = this.LIZ.getSpanEnd(customLinkSpan);
                CharSequence charSequenceSubSequence = "";
                if (spanStart >= 0 && spanEnd <= this.LIZ.length() && spanStart < spanEnd) {
                    charSequenceSubSequence = this.LIZ.subSequence(spanStart, spanEnd);
                    if (charSequenceSubSequence.length() > 0) {
                        customLinkSpan.title = charSequenceSubSequence;
                    }
                }
                if (c0r20 != null) {
                    c0r20.LIZJ(customLinkSpan, customLinkSpan.link, charSequenceSubSequence);
                }
                customLinkSpan.LJFF(interfaceC328600CuQ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC342000Daw
    public final void LJII(View view, InterfaceC328580CuO interfaceC328580CuO) {
        LJIIIZ(view);
        SpannableStringBuilder spannableStringBuilder = this.LIZ;
        C1860910yWf[] c1860910yWfArr = (C1860910yWf[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1860910yWf.class);
        ArrayList arrayList = new ArrayList();
        for (C1860910yWf c1860910yWf : c1860910yWfArr) {
            int spanStart = this.LIZ.getSpanStart(c1860910yWf);
            int spanEnd = this.LIZ.getSpanEnd(c1860910yWf);
            int spanFlags = this.LIZ.getSpanFlags(c1860910yWf);
            C0DO0 c0do0 = new C0DO0(this, c1860910yWf, interfaceC328580CuO);
            arrayList.add(c0do0);
            C786410Ut5.q2(this.LIZ, c0do0, spanStart, spanEnd, spanFlags);
        }
        this.LJI.put(view, arrayList);
    }

    public final void LJIIIIZZ(Class cls, List list) {
        SpannableStringBuilder spannableStringBuilder = this.LIZ;
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls);
        int length = spans.length;
        for (int i = 0; i < length; i++) {
            int spanStart = this.LIZ.getSpanStart(spans[i]);
            int spanEnd = this.LIZ.getSpanEnd(spans[i]);
            if (spanStart >= 0 && spanStart <= spanEnd && spanEnd <= this.LIZ.length()) {
                ((ArrayList) list).add(new C1489000oqo(spanStart, spanEnd, spans[i]));
            }
        }
    }

    public C1860140yVQ(SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, boolean z3, InterfaceC1860180yVU interfaceC1860180yVU, C1877207Ww c1877207Ww) {
        this.LIZ = spannableStringBuilder;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = interfaceC1860180yVU;
        this.LJFF = c1877207Ww;
    }
}
