package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.0mXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400390mXt {
    public Function0<? extends Map<String, String>> LIZ;
    public Function0<? extends Map<String, String>> LIZIZ;
    public Function0<? extends Map<String, String>> LIZJ;
    public final Function0<? extends Map<String, String>> LIZLLL;
    public final Function0<? extends Map<String, String>> LJ;

    public C1400390mXt() {
        this(null, null, null, null, null, 31);
    }

    public C1400390mXt(Function0 function0, Function0 function02, Function0 function03, Function0 function04, AwS547S0100000_3 awS547S0100000_3, int i) {
        function0 = (i & 1) != 0 ? new C1400400mXu() : function0;
        function02 = (i & 2) != 0 ? new C1400410mXv() : function02;
        function03 = (i & 4) != 0 ? new C1400420mXw() : function03;
        function04 = (i & 8) != 0 ? new C1400430mXx() : function04;
        Function0<? extends Map<String, String>> function05 = (i & 16) != 0 ? AFwS209S0000000_21.get$arr$(489) : awS547S0100000_3;
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
        this.LIZLLL = function04;
        this.LJ = function05;
    }
}
