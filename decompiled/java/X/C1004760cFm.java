package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minis.feed.instantplay.preview.MinisInstantPlayPreviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.preview.MinisInstantPlayPreviewFragment$observePreBootState$1", f = "MinisInstantPlayPreviewFragment.kt", l = {280}, m = "invokeSuspend")
public final class C1004760cFm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1006440cIU LLILLJJLI;
    public final /* synthetic */ C259800zU<C1006450cIV> LLILLL;
    public final /* synthetic */ MinisInstantPlayPreviewFragment LLILZ;
    public final /* synthetic */ Aweme LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004760cFm(C1006440cIU c1006440cIU, C259800zU<C1006450cIV> c259800zU, MinisInstantPlayPreviewFragment minisInstantPlayPreviewFragment, Aweme aweme, InterfaceC1364105Vn<? super C1004760cFm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1006440cIU;
        this.LLILLL = c259800zU;
        this.LLILZ = minisInstantPlayPreviewFragment;
        this.LLILZIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1004760cFm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisInstantPlayPreviewFragment@237b.observePreBootState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950LIZ = C09IC.LIZ(this.LLILLJJLI.LJIILJJIL);
            final C259800zU<C1006450cIV> c259800zU = this.LLILLL;
            final MinisInstantPlayPreviewFragment minisInstantPlayPreviewFragment = this.LLILZ;
            final Aweme aweme = this.LLILZIL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0cIX
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0cIV] */
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    String str;
                    String strLIZIZ;
                    String strLIZIZ2;
                    ?? r4 = (T) ((C1006450cIV) obj2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preBootState collect status=");
                    sbLIZ.append(r4.LIZ);
                    sbLIZ.append(" durationMs=");
                    sbLIZ.append(r4.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1007120cJa.LIZ();
                    EnumC1006480cIY enumC1006480cIY = r4.LIZ;
                    EnumC1006480cIY enumC1006480cIY2 = EnumC1006480cIY.FAILED;
                    if (enumC1006480cIY == enumC1006480cIY2) {
                        c259800zU.element = r4;
                    }
                    C1006450cIV c1006450cIV = c259800zU.element;
                    C1006450cIV c1006450cIV2 = c1006450cIV;
                    if (c1006450cIV == null) {
                        c1006450cIV2 = r4;
                    }
                    MinisInstantPlayPreviewFragment minisInstantPlayPreviewFragment2 = minisInstantPlayPreviewFragment;
                    EnumC1006480cIY enumC1006480cIY3 = c1006450cIV2.LIZ;
                    minisInstantPlayPreviewFragment2.getClass();
                    switch (C1006460cIW.LIZ[enumC1006480cIY3.ordinal()]) {
                        case 1:
                            str = "idle";
                            break;
                        case 2:
                        case 3:
                            str = "loading";
                            break;
                        case 4:
                            str = "game ready";
                            break;
                        case 5:
                            str = "failed";
                            break;
                        case 6:
                            str = "released";
                            break;
                        default:
                            throw new C1954807lC();
                    }
                    Long l = c1006450cIV2.LIZIZ;
                    String strLJJLIIIJ = null;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(jLongValue);
                        sbLIZ2.append("ms");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        strLIZIZ = null;
                    }
                    minisInstantPlayPreviewFragment.getClass();
                    if (c1006450cIV2.LIZ == enumC1006480cIY2) {
                        String[] strArr = new String[2];
                        Integer num = c1006450cIV2.LIZJ;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("code=");
                            sbLIZ3.append(iIntValue);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        } else {
                            strLIZIZ2 = null;
                        }
                        strArr[0] = strLIZIZ2;
                        strArr[1] = c1006450cIV2.LIZLLL;
                        strLJJLIIIJ = C13LP.LJJLIIIJ(C13LQ.LJIJI(strArr), ", ", null, null, 0, null, null, 62);
                        if (strLJJLIIIJ.length() <= 0) {
                            strLJJLIIIJ = "unknown error";
                        }
                    }
                    minisInstantPlayPreviewFragment2.LLJ.LLLFZ("pre_boot_status", str);
                    minisInstantPlayPreviewFragment2.LLJ.LLLFZ("pre_boot_duration", strLIZIZ);
                    minisInstantPlayPreviewFragment2.LLJ.LLLFZ("error_message", strLJJLIIIJ);
                    if (r4.LIZ == EnumC1006480cIY.FP_READY) {
                        MinisInstantPlayPreviewFragment minisInstantPlayPreviewFragment3 = minisInstantPlayPreviewFragment;
                        Aweme aweme2 = aweme;
                        if (!minisInstantPlayPreviewFragment3.LLJIJIL) {
                            minisInstantPlayPreviewFragment3.LLJIJIL = true;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("onFpReady aid=");
                            sbLIZ4.append(aweme2.getAid());
                            sbLIZ4.append(", request fyf insert");
                            C2188811AlT.LIZIZ(sbLIZ4);
                            C1007120cJa.LIZ();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("insertReadyAwemeToForYouFeed post aid=");
                            sbLIZ5.append(aweme2.getAid());
                            C2188811AlT.LIZIZ(sbLIZ5);
                            C1007120cJa.LIZ();
                            C1440005kM.LIZ(new C1006500cIa(aweme2));
                            C1389890mGx c1389890mGx = new C1389890mGx(minisInstantPlayPreviewFragment3);
                            c1389890mGx.LJIIJ("The game is ready, you can now return to the For You Feed page to preview the Instant Play card.");
                            c1389890mGx.LJIIJJI();
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0950LIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MinisInstantPlayPreviewFragment@237b.observePreBootState$1");
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
