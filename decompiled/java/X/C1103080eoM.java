package X;

import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103080eoM {
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0eoL] */
    public static final C1103070eoL LIZ(Function1 function1) {
        C1103100eoO c1103100eoO = new C1103100eoO();
        function1.invoke(c1103100eoO);
        return new InterfaceC1102890eo3(c1103100eoO.LIZ, c1103100eoO.LIZIZ, c1103100eoO.LIZJ, c1103100eoO.LIZLLL) { // from class: X.0eoL
            public final Integer LL;
            public final Integer LLILLJJLI;
            public final Integer LLILLL;
            public final C1102880eo2 LLILZ;

            @Override // X.InterfaceC1102890eo3
            public final Integer icon(EnumC1099930ejH enumC1099930ejH) {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1102890eo3
            public final C1102880eo2 iconConfig(EnumC1099930ejH enumC1099930ejH) {
                return this.LLILZ;
            }

            @Override // X.InterfaceC1102890eo3
            public final Integer text(EnumC1099930ejH enumC1099930ejH) {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC1102890eo3
            public final Integer title(EnumC1099930ejH enumC1099930ejH) {
                return this.LL;
            }

            {
                this.LL = num;
                this.LLILLJJLI = num;
                this.LLILLL = num;
                this.LLILZ = c1102880eo2;
            }
        };
    }

    public static final int LIZIZ(EnumC1102740eno enumC1102740eno) {
        int i = C1102550enV.LIZ[enumC1102740eno.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return R.id.yvx;
                        }
                        return R.id.ceh;
                    }
                    return R.id.yvv;
                }
                return R.id.yvt;
            }
            return R.id.yvu;
        }
        return R.id.yvz;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0eoP] */
    public static final C1103110eoP LIZJ(Function1 function1) {
        C1103120eoQ c1103120eoQ = new C1103120eoQ();
        function1.invoke(c1103120eoQ);
        return new InterfaceC1102900eo4(c1103120eoQ.LIZ) { // from class: X.0eoP
            public final Integer LL;

            {
                this.LL = num;
            }

            @Override // X.InterfaceC1102900eo4
            public final boolean isLiveDesignLayout(EnumC1099930ejH enumC1099930ejH) {
                if (this.LL == null) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1102900eo4
            public final Integer layoutID(EnumC1099930ejH enumC1099930ejH) {
                return this.LL;
            }
        };
    }

    public static final Map<EnumC1099930ejH, C1102970eoB> LIZLLL(Function1<? super C1103090eoN, Unit> function1) {
        C1103090eoN c1103090eoN = new C1103090eoN();
        function1.invoke(c1103090eoN);
        return C2097608Jq.LJIIZILJ(c1103090eoN.LIZ);
    }

    public static final EnumC1102740eno LJ(int i) {
        switch (i) {
            case 161:
            case 162:
            case 163:
            case 164:
                return EnumC1102740eno.ICON_SLOT;
            case 165:
                return EnumC1102740eno.AUDIENCE_PARTNERSHIP;
            case 166:
                return EnumC1102740eno.AUDIENCE_SUBSCRIPTION;
            case 167:
                return EnumC1102740eno.MULTIGUEST;
            case 168:
                return EnumC1102740eno.FAST_GIFT;
            case 169:
                return EnumC1102740eno.GIFT;
            case 170:
                return EnumC1102740eno.AUDIENCE_SERVICE_PLUS;
            case 171:
                return EnumC1102740eno.SHARE;
            default:
                return null;
        }
    }
}
