package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.063r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.StudioAIGCSafetyProtocol$writeAIGCMetadata$1", f = "StudioAIGCSafetyProtocol.kt", l = {79}, m = "invokeSuspend")
public final class C15465063r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<C15470063w, Unit> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ EnumC15469063v LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15465063r(String str, Function1<? super C15470063w, Unit> function1, boolean z, Context context, EnumC15469063v enumC15469063v, InterfaceC1364105Vn<? super C15465063r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
        this.LLILZ = z;
        this.LLILZIL = context;
        this.LLILZLL = enumC15469063v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15465063r(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        boolean z;
        String str;
        String str2;
        boolean z2;
        String strLIZ;
        int iIntValue;
        C1C7U.LIZ("StudioAIGCSafetyProtocol@d95d.writeAIGCMetadata$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            Function1<C15470063w, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                function1.invoke(new C15470063w(C2286608xc.LJ(-105), "Something went wrong while writing c2pa data", false));
            }
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str3 = this.LLILLJJLI;
            if (str3 != null && str3.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Function1<C15470063w, Unit> function12 = this.LLILLL;
                if (function12 != null) {
                    function12.invoke(new C15470063w(C2286608xc.LJ(-101), "Invalid file path", false));
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StudioAIGCSafetyProtocol@d95d.writeAIGCMetadata$1");
                return unit;
            }
            C259800zU c259800zU = new C259800zU();
            ?? r2 = this.LLILLJJLI;
            c259800zU.element = r2;
            if (this.LLILZ) {
                Context context = this.LLILZIL;
                if (context == null) {
                    Function1<C15470063w, Unit> function13 = this.LLILLL;
                    if (function13 != null) {
                        function13.invoke(new C15470063w(C2286608xc.LJ(-104), "Invalid context", false));
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("StudioAIGCSafetyProtocol@d95d.writeAIGCMetadata$1");
                    return unit2;
                }
                C140D.LIZ.getClass();
                ?? LJIL = C140D.LJIL(context, r2);
                c259800zU.element = LJIL;
                if (LJIL == 0) {
                    Function1<C15470063w, Unit> function14 = this.LLILLL;
                    if (function14 != null) {
                        function14.invoke(new C15470063w(C2286608xc.LJ(-101), "Invalid file path", false));
                    }
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("StudioAIGCSafetyProtocol@d95d.writeAIGCMetadata$1");
                    return unit3;
                }
            }
            File fileLJFF = C2114508Qd.LJFF(new C0VSJ(""), (String) c259800zU.element);
            if (fileLJFF == null) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("StudioAIGCSafetyProtocol@d95d.writeAIGCMetadata$1");
                return unit4;
            }
            if (fileLJFF.exists()) {
                C140D.LIZ.LJJIIJ(false);
                EnumC15469063v enumC15469063v = this.LLILZLL;
                int[] iArr = C15468063u.LIZ;
                int i2 = iArr[enumC15469063v.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            str = "published";
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        str = "c2pa.edited";
                    }
                } else {
                    str = "c2pa.created";
                }
                int i3 = iArr[enumC15469063v.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    if (i3 == 3) {
                        str2 = "http://cv.iptc.org/newscodes/digitalsourcetype/compositeWithTrainedAlgorithmicMedia";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str2 = "http://cv.iptc.org/newscodes/digitalsourcetype/trainedAlgorithmicMedia";
                }
                JSONObject jSONObjectLJFF = C140D.LJFF(str, str2);
                long jLJIIZILJ = C140D.LJIIZILJ();
                C15458063k c15458063k = new C15458063k(c259800zU, jSONObjectLJFF, null);
                this.LL = 1;
                obj = C099A.LIZJ(jLJIIZILJ, c15458063k, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StudioAIGCSafetyProtocol@d95d.writeAIGCMetadata$1");
                    return objLJFF;
                }
            } else {
                Function1<C15470063w, Unit> function15 = this.LLILLL;
                if (function15 != null) {
                    function15.invoke(new C15470063w(C2286608xc.LJ(-103), "File does not exist", false));
                }
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("StudioAIGCSafetyProtocol@d95d.writeAIGCMetadata$1");
                return unit5;
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null || ((Number) pair.getSecond()).intValue() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            Function1<C15470063w, Unit> function16 = this.LLILLL;
            if (function16 != null) {
                function16.invoke(new C15470063w(null, null, true));
            }
        } else {
            if (pair == null) {
                strLIZ = "Something went wrong while writing c2pa data";
            } else {
                strLIZ = C15467063t.LIZ(((Number) pair.getSecond()).intValue());
            }
            Function1<C15470063w, Unit> function17 = this.LLILLL;
            if (function17 != null) {
                if (pair != null) {
                    iIntValue = ((Number) pair.getSecond()).intValue();
                } else {
                    iIntValue = -105;
                }
                function17.invoke(new C15470063w(C2286608xc.LJ(iIntValue), strLIZ, false));
            }
        }
        Unit unit52 = Unit.LIZ;
        C1C7U.LIZIZ("StudioAIGCSafetyProtocol@d95d.writeAIGCMetadata$1");
        return unit52;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
