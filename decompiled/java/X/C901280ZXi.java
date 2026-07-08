package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem$observeTranslation$1", f = "TextTranslateAssem.kt", l = {566}, m = "invokeSuspend")
public final class C901280ZXi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TextTranslateAssem LLILLJJLI;
    public final /* synthetic */ C0ZS7 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901280ZXi(TextTranslateAssem textTranslateAssem, C0ZS7 c0zs7, String str, C013C c013c, int i, InterfaceC1364105Vn<? super C901280ZXi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = textTranslateAssem;
        this.LLILLL = c0zs7;
        this.LLILZ = str;
        this.LLILZIL = c013c;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C901280ZXi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextTranslateAssem@98a8.observeTranslation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDqWQ2 = this.LLILLJJLI.Qp().wQ2();
            final TextTranslateAssem textTranslateAssem = this.LLILLJJLI;
            final C0ZS7 c0zs7 = this.LLILLL;
            final String str = this.LLILZ;
            final C013C c013c = this.LLILZIL;
            final int i2 = this.LLILZLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0ZXh
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    String str2;
                    C163T c163t;
                    int i3;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    AbstractC903430ZcL abstractC903430ZcL = (AbstractC903430ZcL) obj2;
                    TextTranslateAssem textTranslateAssem2 = textTranslateAssem;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("selectSubscribe ");
                    sbLIZ.append(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(textTranslateAssem)).getUuid());
                    sbLIZ.append(" state: ");
                    sbLIZ.append(abstractC903430ZcL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    textTranslateAssem2.getClass();
                    String strLLIFFJFJJ = ((C0ZS7) C631370Opb.LIZ(textTranslateAssem)).LLIFFJFJJ();
                    if (abstractC903430ZcL instanceof C903410ZcJ) {
                        return Unit.LIZ;
                    }
                    if (abstractC903430ZcL instanceof C903390ZcH) {
                        C903390ZcH c903390ZcH = (C903390ZcH) abstractC903430ZcL;
                        C903380ZcG c903380ZcG = c903390ZcH.LJI;
                        if (c903380ZcG != null && c903380ZcG.LIZLLL && (c163t = c903390ZcH.LIZJ) != null && (i3 = C207126163g.LIZ[c163t.ordinal()]) != -1) {
                            if (i3 != 1 && i3 != 2) {
                                if (i3 != 3 && i3 != 4) {
                                    if (i3 == 5) {
                                        C901130ZWt.LIZIZ.LJII(textTranslateAssem.Bp());
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    C901130ZWt.LIZIZ.LJIIJ(textTranslateAssem.Bp());
                                }
                            } else {
                                textTranslateAssem.getClass();
                                textTranslateAssem.getClass();
                                c0zs7.LJIILL().toString();
                                TextTranslateAssem textTranslateAssem3 = textTranslateAssem;
                                C013C c013c2 = c013c;
                                int iLIZJ = C461640I8k.LIZJ(C461640I8k.LIZ, textTranslateAssem3.Jp().getContext(), textTranslateAssem3.Ip().LLILLL, 0.0f, 0.0f, 124);
                                C724270Sb3 c724270Sb3 = textTranslateAssem3.LLJI;
                                Object obj6 = null;
                                if (c724270Sb3 != null) {
                                    obj3 = c724270Sb3.LL;
                                } else {
                                    obj3 = null;
                                }
                                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LIZLLL(((C0ZS7) obj3).LJII().LIZ.LIZ)));
                                C724270Sb3 c724270Sb32 = textTranslateAssem3.LLJI;
                                if (c724270Sb32 != null) {
                                    obj4 = c724270Sb32.LL;
                                } else {
                                    obj4 = null;
                                }
                                int iLIZIZ2 = iLIZJ - (iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LIZLLL(((C0ZS7) obj4).LJII().LIZ.LIZJ))));
                                C724270Sb3 c724270Sb33 = textTranslateAssem3.LLJI;
                                if (c724270Sb33 != null) {
                                    obj5 = c724270Sb33.LL;
                                } else {
                                    obj5 = null;
                                }
                                C0ZXR c0zxr = ((C0ZS7) obj5).LJII().LIZIZ;
                                C724270Sb3 c724270Sb34 = textTranslateAssem3.LLJI;
                                if (c724270Sb34 != null) {
                                    obj6 = c724270Sb34.LL;
                                }
                                textTranslateAssem3.sp(strLLIFFJFJJ, iLIZIZ2, c0zxr, ((C0ZS7) obj6).LJII().LIZ, new C901340ZXo(strLLIFFJFJJ), !c013c2.element);
                                C901130ZWt c901130ZWt = C901130ZWt.LIZIZ;
                                String str3 = str;
                                strLLIFFJFJJ.toString();
                                c901130ZWt.LJIILJJIL(str3, new C0ZLV(strLLIFFJFJJ));
                                c901130ZWt.LJIIZILJ(str, c903390ZcH.LJI);
                                c013c.element = false;
                                return Unit.LIZ;
                            }
                        }
                        TextTranslateAssem textTranslateAssem4 = textTranslateAssem;
                        textTranslateAssem4.sp(strLLIFFJFJJ, i2, ((C0ZS7) C631370Opb.LIZ(textTranslateAssem4)).LJII().LIZIZ, ((C0ZS7) C631370Opb.LIZ(textTranslateAssem)).LJII().LIZ, C901420ZXw.LIZ, !c013c.element);
                        C901130ZWt c901130ZWt2 = C901130ZWt.LIZIZ;
                        c901130ZWt2.LJIILJJIL(str, C1760706uz.LIZ);
                        c901130ZWt2.LJIIZILJ(str, c903390ZcH.LJI);
                    } else if (abstractC903430ZcL instanceof C903420ZcK) {
                        TextTranslateAssem textTranslateAssem5 = textTranslateAssem;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("selectSubscribe ");
                        sbLIZ2.append(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(textTranslateAssem)).getUuid());
                        sbLIZ2.append(" translating");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        textTranslateAssem5.getClass();
                        TextTranslateAssem textTranslateAssem6 = textTranslateAssem;
                        textTranslateAssem6.sp(strLLIFFJFJJ, i2, ((C0ZS7) C631370Opb.LIZ(textTranslateAssem6)).LJII().LIZIZ, ((C0ZS7) C631370Opb.LIZ(textTranslateAssem)).LJII().LIZ, C901410ZXv.LIZ, !c013c.element);
                        C901130ZWt.LIZIZ.LJIILJJIL(str, new InterfaceC901080ZWo() { // from class: X.0ZWr
                        });
                    } else if (abstractC903430ZcL instanceof C903400ZcI) {
                        TextTranslateAssem textTranslateAssem7 = textTranslateAssem;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("selectSubscribe ");
                        sbLIZ3.append(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(textTranslateAssem)).getUuid());
                        sbLIZ3.append(" translated");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        textTranslateAssem7.getClass();
                        C903400ZcI c903400ZcI = (C903400ZcI) abstractC903430ZcL;
                        C903380ZcG c903380ZcG2 = c903400ZcI.LIZLLL;
                        if (c903380ZcG2 != null && (str2 = c903380ZcG2.LIZ) != null) {
                            TextTranslateAssem textTranslateAssem8 = textTranslateAssem;
                            textTranslateAssem8.sp(strLLIFFJFJJ, i2, ((C0ZS7) C631370Opb.LIZ(textTranslateAssem8)).LJII().LIZIZ, ((C0ZS7) C631370Opb.LIZ(textTranslateAssem)).LJII().LIZ, new C901340ZXo(str2), !c013c.element);
                            C901130ZWt c901130ZWt3 = C901130ZWt.LIZIZ;
                            c901130ZWt3.LJIILJJIL(C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(textTranslateAssem)).getUuid(), new C0ZLV(str2));
                            c901130ZWt3.LJIIZILJ(str, c903400ZcI.LIZLLL);
                        } else {
                            "state is translated but no text is available".toString();
                            throw new IllegalStateException("state is translated but no text is available");
                        }
                    } else {
                        throw new C1954807lC();
                    }
                    c013c.element = false;
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c2252321DDqWQ2.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("TextTranslateAssem@98a8.observeTranslation$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
