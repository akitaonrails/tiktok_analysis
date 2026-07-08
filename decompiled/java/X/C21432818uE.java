package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;

/* JADX INFO: renamed from: X.18uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21432818uE extends AbstractC21425218t0 {
    public C21432918uF LIZJ;
    public AbstractC21438018v4 LIZLLL;
    public final C21423618sk LJ = new C21423618sk();
    public final C21436118ul LIZ = new C21436118ul();
    public final C21433618uM LIZIZ = new C21433618uM();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.18uv] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.18wT] */
    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJIIJ(C21434618uW c21434618uW) {
        AbstractC21438018v4 c21433418uK;
        C21436118ul c21436118ul = this.LIZ;
        this.LIZIZ.getClass();
        C21433618uM c21433618uM = this.LIZIZ;
        final C21431818u4 c21431818u4 = new C21431818u4(new AbstractC21446018wM() { // from class: X.18uv
        });
        c21433618uM.LIZ(new AbstractC21434518uV(c21431818u4) { // from class: X.18u0
            public final InterfaceC21447618wc LIZ;

            @Override // X.AbstractC21434218uS
            public final Collection<String> LIZJ() {
                return Collections.singleton("img");
            }

            {
                this.LIZ = c21431818u4;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
            
                if (r1 != null) goto L23;
             */
            @Override // X.AbstractC21434518uV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJ(X.C21432118u7 r13, X.C14S7 r14, X.InterfaceC21435018ua r15) {
                /*
                    Method dump skipped, instruction units count: 235
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21431418u0.LJ(X.18u7, X.14S7, X.18ua):java.lang.Object");
            }
        });
        this.LIZIZ.LIZ(new C21431718u3());
        this.LIZIZ.LIZ(new AbstractC21434218uS() { // from class: X.18uH
            @Override // X.AbstractC21434218uS
            public final Collection<String> LIZJ() {
                return Collections.singleton("blockquote");
            }

            @Override // X.AbstractC21434218uS
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK2, InterfaceC21435018ua interfaceC21435018ua) {
                if (interfaceC21435018ua.LJ()) {
                    AbstractC21434218uS.LIZLLL(interfaceC21427218tK, c21433418uK2, interfaceC21435018ua.LIZJ());
                }
                C21432118u7 c21432118u7LJJIII = interfaceC21427218tK.LJJIII();
                InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) c21432118u7LJJIII.LJFF).LIZ(C21445018wC.class);
                if (interfaceC21446318wPLIZ != null) {
                    C21423918sn.LJI(interfaceC21427218tK.builder(), interfaceC21446318wPLIZ.LIZ(c21432118u7LJJIII, interfaceC21427218tK.LJIL()), interfaceC21435018ua.start(), interfaceC21435018ua.end());
                }
            }
        });
        this.LIZIZ.LIZ(new AbstractC21434518uV() { // from class: X.18rp
            @Override // X.AbstractC21434218uS
            public final Collection<String> LIZJ() {
                return Collections.singleton("sub");
            }

            @Override // X.AbstractC21434518uV
            public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                return new MetricAffectingSpan() { // from class: X.0uFi
                    @Override // android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                        textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
                    }

                    @Override // android.text.style.MetricAffectingSpan
                    public final void updateMeasureState(TextPaint textPaint) {
                        textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                        textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
                    }
                };
            }
        });
        this.LIZIZ.LIZ(new AbstractC21434518uV() { // from class: X.18uQ
            @Override // X.AbstractC21434218uS
            public final Collection<String> LIZJ() {
                return Arrays.asList("b", "strong");
            }

            @Override // X.AbstractC21434518uV
            public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) c21432118u7.LJFF).LIZ(C21438718vB.class);
                if (interfaceC21446318wPLIZ == null) {
                    return null;
                }
                return interfaceC21446318wPLIZ.LIZ(c21432118u7, c14s7);
            }
        });
        this.LIZIZ.LIZ(new AbstractC21434218uS() { // from class: X.18uC
            public static final boolean LIZ;

            static {
                boolean z;
                try {
                    Class.forName("org.commonmark.ext.gfm.strikethrough.Strikethrough");
                    z = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    z = false;
                }
                LIZ = z;
            }

            @Override // X.AbstractC21434218uS
            public final Collection<String> LIZJ() {
                return Arrays.asList("s", "del");
            }

            public static Object LJ(InterfaceC21427218tK interfaceC21427218tK) {
                C21432118u7 c21432118u7LJJIII = interfaceC21427218tK.LJJIII();
                InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) c21432118u7LJJIII.LJFF).LIZ(Strikethrough.class);
                if (interfaceC21446318wPLIZ == null) {
                    return null;
                }
                return interfaceC21446318wPLIZ.LIZ(c21432118u7LJJIII, interfaceC21427218tK.LJIL());
            }

            @Override // X.AbstractC21434218uS
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK2, InterfaceC21435018ua interfaceC21435018ua) {
                Object strikethroughSpan;
                if (interfaceC21435018ua.LJ()) {
                    AbstractC21434218uS.LIZLLL(interfaceC21427218tK, c21433418uK2, interfaceC21435018ua.LIZJ());
                }
                C21423918sn c21423918snBuilder = interfaceC21427218tK.builder();
                if (LIZ) {
                    strikethroughSpan = LJ(interfaceC21427218tK);
                } else {
                    strikethroughSpan = new StrikethroughSpan();
                }
                C21423918sn.LJI(c21423918snBuilder, strikethroughSpan, interfaceC21435018ua.start(), interfaceC21435018ua.end());
            }
        });
        this.LIZIZ.LIZ(new C21433318uJ());
        this.LIZIZ.LIZ(new AbstractC21434218uS() { // from class: X.18uB
            @Override // X.AbstractC21434218uS
            public final Collection<String> LIZJ() {
                return Arrays.asList("ol", "ul");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC21434218uS
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, C21433418uK c21433418uK2, InterfaceC21435018ua interfaceC21435018ua) {
                if (!interfaceC21435018ua.LJ()) {
                    return;
                }
                InterfaceC21436718ur interfaceC21436718urLIZJ = interfaceC21435018ua.LIZJ();
                boolean zEquals = "ol".equals(interfaceC21436718urLIZJ.name());
                boolean zEquals2 = "ul".equals(interfaceC21436718urLIZJ.name());
                if (!zEquals && !zEquals2) {
                    return;
                }
                C21432118u7 c21432118u7LJJIII = interfaceC21427218tK.LJJIII();
                C14S7 c14s7LJIL = interfaceC21427218tK.LJIL();
                InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) c21432118u7LJJIII.LJFF).LIZ(C21445118wD.class);
                int i = 0;
                C21433518uL c21433518uLParent = interfaceC21436718urLIZJ;
                while (true) {
                    c21433518uLParent = c21433518uLParent.parent();
                    if (c21433518uLParent == 0) {
                        break;
                    } else if ("ul".equals(c21433518uLParent.LIZ) || "ol".equals(c21433518uLParent.LIZ)) {
                        i++;
                    }
                }
                int i2 = 1;
                for (InterfaceC21436718ur interfaceC21436718ur : interfaceC21436718urLIZJ.LIZ()) {
                    AbstractC21434218uS.LIZLLL(interfaceC21427218tK, c21433418uK2, interfaceC21436718ur);
                    if (interfaceC21446318wPLIZ != null && "li".equals(interfaceC21436718ur.name())) {
                        if (zEquals) {
                            c14s7LJIL.LIZ(AbstractC20267814Se.LIZ, C14S1.ORDERED);
                            c14s7LJIL.LIZ(AbstractC20267814Se.LIZJ, Integer.valueOf(i2));
                            i2++;
                        } else {
                            c14s7LJIL.LIZ(AbstractC20267814Se.LIZ, C14S1.BULLET);
                            c14s7LJIL.LIZ(AbstractC20267814Se.LIZIZ, Integer.valueOf(i));
                        }
                        C21423918sn.LJI(interfaceC21427218tK.builder(), interfaceC21446318wPLIZ.LIZ(c21432118u7LJJIII, c14s7LJIL), interfaceC21436718ur.start(), interfaceC21436718ur.end());
                    }
                }
            }
        });
        this.LIZIZ.LIZ(new AbstractC21434518uV() { // from class: X.18uO
            @Override // X.AbstractC21434218uS
            public final Collection<String> LIZJ() {
                return Arrays.asList("i", "em", "cite", "dfn");
            }

            @Override // X.AbstractC21434518uV
            public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) c21432118u7.LJFF).LIZ(C21438118v5.class);
                if (interfaceC21446318wPLIZ == null) {
                    return null;
                }
                return interfaceC21446318wPLIZ.LIZ(c21432118u7, c14s7);
            }
        });
        this.LIZIZ.LIZ(new AbstractC21434518uV() { // from class: X.18uD
            @Override // X.AbstractC21434218uS
            public final Collection<String> LIZJ() {
                return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
            }

            @Override // X.AbstractC21434518uV
            public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
                int i;
                InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) c21432118u7.LJFF).LIZ(C21439318vH.class);
                if (interfaceC21446318wPLIZ == null) {
                    return null;
                }
                try {
                    i = CastIntegerProtector.parseInt(interfaceC21435018ua.name().substring(1));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    i = 0;
                }
                if (i < 1 || i > 6) {
                    return null;
                }
                c14s7.LIZ(AbstractC20267814Se.LIZLLL, Integer.valueOf(i));
                return interfaceC21446318wPLIZ.LIZ(c21432118u7, c14s7);
            }
        });
        C21433618uM c21433618uM2 = this.LIZIZ;
        if (!c21433618uM2.LIZLLL) {
            c21433618uM2.LIZLLL = true;
            Map<String, AbstractC21434218uS> mapUnmodifiableMap = Collections.unmodifiableMap(c21433618uM2.LIZ);
            C21423618sk c21423618sk = this.LJ;
            C21433618uM c21433618uM3 = this.LIZIZ;
            this.LIZJ = new C21432918uF(c21423618sk, mapUnmodifiableMap, new AbstractC21446818wU() { // from class: X.18wT
            }, c21433618uM3.LIZIZ, c21433618uM3.LIZJ);
            if (!c21436118ul.LIZIZ) {
                c21436118ul.LIZ = mapUnmodifiableMap;
                c21436118ul.LIZIZ = true;
                if (mapUnmodifiableMap.size() > 0) {
                    c21433418uK = new C21433418uK(c21436118ul.LIZ);
                } else {
                    c21433418uK = new AbstractC21438018v4() { // from class: X.18ub
                        @Override // X.AbstractC21438018v4
                        public final void LIZ(C21431218ty c21431218ty, C21432918uF c21432918uF) {
                            ((ArrayList) c21432918uF.LJFF).clear();
                            c21432918uF.LJI = new C21433518uL("", 0, Collections.emptyMap(), null);
                        }
                    };
                }
                this.LIZLLL = c21433418uK;
                return;
            }
            throw new IllegalStateException("Builder has been already built");
        }
        throw new IllegalStateException("Builder has been already built");
    }

    public final void LJIIL(AbstractC21434218uS abstractC21434218uS) {
        C21433618uM c21433618uM = this.LIZIZ;
        if (!c21433618uM.LIZLLL) {
            Iterator<String> it2 = abstractC21434218uS.LIZJ().iterator();
            while (it2.hasNext()) {
                ((HashMap) c21433618uM.LIZ).put(it2.next(), abstractC21434218uS);
            }
            return;
        }
        throw new IllegalStateException("Builder has been already built");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIILIIL(X.InterfaceC21427218tK r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21432818uE.LJIILIIL(X.18tK, java.lang.String):void");
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJII(TextView textView, AbstractC21430218to abstractC21430218to, C21431218ty c21431218ty) {
        AbstractC21438018v4 abstractC21438018v4 = this.LIZLLL;
        if (abstractC21438018v4 != null) {
            abstractC21438018v4.LIZ(c21431218ty, this.LIZJ);
            return;
        }
        throw new IllegalStateException("Unexpected state, html-renderer is not defined");
    }
}
