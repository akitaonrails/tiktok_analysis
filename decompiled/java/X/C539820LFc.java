package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.v2t.nle.CameraNLEPlayerForTemplateScene$initVEVideoPlayer$1$1$1", f = "CameraNLEPlayerForTemplateScene.kt", l = {}, m = "invokeSuspend")
public final class C539820LFc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String[], ? extends String[]>>, Object> {
    public final /* synthetic */ List<C539860LFg> LL;
    public final /* synthetic */ C539910LFl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539820LFc(List<C539860LFg> list, C539910LFl c539910LFl, String str, InterfaceC1364105Vn<? super C539820LFc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c539910LFl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539820LFc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<C539860LFg> list = this.LL;
        C539910LFl c539910LFl = this.LLILLJJLI;
        String str = this.LLILLL;
        for (C539860LFg c539860LFg : list) {
            String str2 = c539860LFg.LIZ;
            if (str2 != null) {
                String strLJIJ = C08QA.LJIJ(new C0VSJ(str2));
                if (strLJIJ.length() <= 0) {
                    strLJIJ = "mp4";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('.');
                sbLIZ.append(strLJIJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c539910LFl.getClass();
                String strLLLLLJIL = C539910LFl.LLLLLJIL(str2, str, "template_video", strLIZIZ);
                if (strLLLLLJIL != null) {
                    Boolean.valueOf(arrayList.add(strLLLLLJIL));
                }
            }
            String str3 = c539860LFg.LJII;
            if (str3 != null) {
                String strLJIJ2 = C08QA.LJIJ(new C0VSJ(str3));
                if (strLJIJ2.length() <= 0) {
                    strLJIJ2 = "aac";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('.');
                sbLIZ2.append(strLJIJ2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c539910LFl.getClass();
                String strLLLLLJIL2 = C539910LFl.LLLLLJIL(str3, str, "template_audio", strLIZIZ2);
                if (strLLLLLJIL2 != null) {
                    arrayList2.add(strLLLLLJIL2);
                }
            }
        }
        Pair pair = new Pair(arrayList.toArray(new String[0]), arrayList2.toArray(new String[0]));
        C1C7U.LIZIZ("CameraNLEPlayerForTemplateScene@f18f.initVEVideoPlayer$1$1$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String[], ? extends String[]>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
