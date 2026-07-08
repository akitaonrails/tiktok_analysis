package X;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1333105Jp extends C09AY implements Function1<EnumC1333405Js, Unit> {
    public final /* synthetic */ C1333305Jr<Object, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1333105Jp(C1333305Jr<Object, Object> c1333305Jr) {
        super(1);
        this.LL = c1333305Jr;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC1333405Js enumC1333405Js) {
        C1333305Jr<Object, Object> c1333305Jr = this.LL;
        EnumC1333405Js enumC1333405Js2 = c1333305Jr.LJ.LIZ;
        if (enumC1333405Js2 != EnumC1333405Js.DESTROY) {
            if (enumC1333405Js2 == EnumC1333405Js.IMMEDIATE_START) {
                Collection<AbstractC1333605Ju<? extends Object, Object>> collectionValues = c1333305Jr.LIZJ.values();
                ArrayList<AbstractC1333605Ju<? extends Object, Object>> arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    EnumC1579210rCJ enumC1579210rCJ = ((AbstractC1333605Ju) obj).LIZIZ;
                    if (enumC1579210rCJ == null) {
                        enumC1579210rCJ = null;
                    }
                    if (enumC1579210rCJ == EnumC1579210rCJ.IMMEDIATE) {
                        arrayList.add(obj);
                    }
                }
                for (AbstractC1333605Ju<? extends Object, Object> abstractC1333605Ju : arrayList) {
                    C1333805Jw<Object, Object> c1333805Jw = c1333305Jr.LIZLLL;
                    c1333805Jw.getClass();
                    ?? r1 = abstractC1333605Ju.LIZ;
                    if (r1 != 0 && ((Boolean) r1.invoke(c1333805Jw.LIZJ)).booleanValue()) {
                        c1333805Jw.LIZ(abstractC1333605Ju);
                    }
                }
                C1333205Jq c1333205Jq = c1333305Jr.LJ;
                c1333205Jq.getClass();
                c1333205Jq.LIZ(EnumC1333405Js.IMMEDIATE_COMPLETE);
            }
            if (c1333305Jr.LJ.LIZ == EnumC1333405Js.RENDER_FIRST_FRAME) {
                Collection<AbstractC1333605Ju<? extends Object, Object>> collectionValues2 = c1333305Jr.LIZJ.values();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionValues2) {
                    EnumC1579210rCJ enumC1579210rCJ2 = ((AbstractC1333605Ju) obj2).LIZIZ;
                    if (enumC1579210rCJ2 == null) {
                        enumC1579210rCJ2 = null;
                    }
                    if (enumC1579210rCJ2 == EnumC1579210rCJ.VIDEO_FIRST_FRAME) {
                        arrayList2.add(obj2);
                    }
                }
                C23250099c.LIZLLL(c1333305Jr.LIZ, C0PEM.LIZJ, null, new C1331805Jc(arrayList2, c1333305Jr, null), 2);
            }
            if (c1333305Jr.LJ.LIZ.compareTo(EnumC1333405Js.FIRST_FRAME_COMPLETE) >= 0) {
                Collection<AbstractC1333605Ju<? extends Object, Object>> collectionValues3 = c1333305Jr.LIZJ.values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : collectionValues3) {
                    EnumC1579210rCJ enumC1579210rCJ3 = ((AbstractC1333605Ju) obj3).LIZIZ;
                    if (enumC1579210rCJ3 == null) {
                        enumC1579210rCJ3 = null;
                    }
                    if (enumC1579210rCJ3 == EnumC1579210rCJ.SPARSE) {
                        arrayList3.add(obj3);
                    }
                }
                C23250099c.LIZLLL(c1333305Jr.LIZ, null, null, new C1331605Ja(arrayList3, c1333305Jr, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
