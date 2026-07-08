package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FCG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.text.resource.TextResourceRepository$downloadCaptionTemplate$3", f = "TextResourceRepository.kt", l = {231}, m = "invokeSuspend")
public final class C0FCG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends Pair<? extends String, ? extends Effect>>>>, Object> {
    public CaptionTemplateData LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ CaptionTemplateData LLILZIL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZLL;
    public final /* synthetic */ C0FDM LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FCG(CaptionTemplateData captionTemplateData, Function1<? super Integer, Unit> function1, C0FDM c0fdm, InterfaceC1364105Vn<? super C0FCG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = captionTemplateData;
        this.LLILZLL = function1;
        this.LLIZ = c0fdm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FCG c0fcg = new C0FCG(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0fcg.LLILZ = obj;
        return c0fcg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object c098200Yq2;
        long jCurrentTimeMillis;
        C0FDM c0fdm;
        CaptionTemplateData captionTemplateData;
        Object next;
        Object obj2;
        Object next2;
        int i;
        Object objLIZ = obj;
        C1C7U.LIZ("TextResourceRepository@b217.downloadCaptionTemplate$3");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLL;
        Object obj3 = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    jCurrentTimeMillis = this.LLILLJJLI;
                    captionTemplateData = this.LL;
                    c0fdm = (C0FDM) this.LLILZ;
                    C155000ia.LIZIZ(objLIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZ);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                jCurrentTimeMillis = System.currentTimeMillis();
                HashSet hashSet = new HashSet();
                String str = this.LLILZIL.fontId;
                if (str != null) {
                    Boolean.valueOf(hashSet.add(str));
                }
                String str2 = this.LLILZIL.styleId;
                if (str2 != null) {
                    Boolean.valueOf(hashSet.add(str2));
                }
                String str3 = this.LLILZIL.textAnimId;
                if (str3 != null) {
                    Boolean.valueOf(hashSet.add(str3));
                }
                String str4 = this.LLILZIL.captionAnimId;
                if (str4 != null) {
                    Boolean.valueOf(hashSet.add(str4));
                }
                this.LLILZLL.invoke(C2286608xc.LJ(0));
                Object obj4 = new Object();
                HashMap map = new HashMap();
                C0FDM c0fdm2 = this.LLIZ;
                CaptionTemplateData captionTemplateData2 = this.LLILZIL;
                Function1<Integer, Unit> function1 = this.LLILZLL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(hashSet, 10));
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    CaptionTemplateData captionTemplateData3 = captionTemplateData2;
                    C0FDM c0fdm3 = c0fdm2;
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0FCH(c0fdm3, captionTemplateData3, (String) it2.next(), obj4, function1, map, hashSet, jCurrentTimeMillis, null), 3));
                    captionTemplateData2 = captionTemplateData3;
                    c0fdm2 = c0fdm3;
                }
                c0fdm = this.LLIZ;
                captionTemplateData = this.LLILZIL;
                this.LLILZ = c0fdm;
                this.LL = captionTemplateData;
                this.LLILLJJLI = jCurrentTimeMillis;
                this.LLILLL = 1;
                objLIZ = C1D9F.LIZ(arrayList, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("TextResourceRepository@b217.downloadCaptionTemplate$3");
                    return objLJFF;
                }
            }
            List list = (List) objLIZ;
            C0FGR c0fgr = c0fdm.LIZIZ;
            if (c0fgr != null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (C189200o6.m7isFailureimpl(((C189200o6) next2).m10unboximpl())) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (next2 == null) {
                    i = 0;
                } else {
                    i = 1;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String str5 = captionTemplateData.resID;
                c0fgr.LJJIIJ(i, jCurrentTimeMillis2, str5, "caption_template", str5, false, null, null);
            }
            Iterator it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    if (C189200o6.m7isFailureimpl(((C189200o6) next).m10unboximpl())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    Object objM10unboximpl = ((C189200o6) it5.next()).m10unboximpl();
                    if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
                        objM10unboximpl = null;
                    }
                    Pair pair = (Pair) objM10unboximpl;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                C189200o6.m2constructorimpl(arrayList2);
                obj2 = arrayList2;
            } else {
                C098200Yq c098200Yq3 = new C098200Yq(new RuntimeException("download failed"));
                C189200o6.m2constructorimpl(c098200Yq3);
                obj2 = c098200Yq3;
            }
            c098200Yq = C189200o6.m1boximpl(obj2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj3 = c098200Yq;
        }
        C189200o6 c189200o6 = (C189200o6) obj3;
        if (c189200o6 != null) {
            c098200Yq2 = c189200o6.m10unboximpl();
        } else {
            c098200Yq2 = new C098200Yq(new RuntimeException("download failed"));
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq2);
        C1C7U.LIZIZ("TextResourceRepository@b217.downloadCaptionTemplate$3");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends Pair<? extends String, ? extends Effect>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
