package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import ln3.a;

/* JADX INFO: renamed from: X.0Mmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.shooting.PhotoProcessor$captureImage$1", f = "PhotoProcessor.kt", l = {140, 147}, m = "invokeSuspend")
public final class C578710Mmr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public AnonymousClass0957 LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C578810Mn1 LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578710Mmr(C578810Mn1 c578810Mn1, Function0<Unit> function0, InterfaceC1364105Vn<? super C578710Mmr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c578810Mn1;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C578710Mmr c578710Mmr = new C578710Mmr(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c578710Mmr.LLILZIL = obj;
        return c578710Mmr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0Mn1] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        FilterBean filterBeanLIZJ;
        C1643870ssb value;
        ?? r8;
        String strLIZJ;
        String str;
        AnonymousClass0957<Pair<Bitmap, Long>> second;
        float fLJIIIIZZ;
        InterfaceC1452660nuC interfaceC1452660nuC;
        LiveData<C1643870ssb> liveDataRT;
        C385670FAf<FilterBean> c385670FAfI70;
        a aVar;
        C12I9 c12i9Je;
        List<ComposerBeauty> listWe;
        ?? r82;
        boolean z;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("PhotoProcessor@9c21.captureImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJLIIIL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PhotoProcessor@9c21.captureImage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.LLILLL;
            second = this.LLILLJJLI;
            strLIZJ = (String) this.LL;
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
            C155000ia.LIZIZ(objLJLIIIL);
            r82 = i2;
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
            C578810Mn1 c578810Mn1 = this.LLILZLL;
            ShortVideoContext shortVideoContextLJFF = c578810Mn1.LJFF();
            if (shortVideoContextLJFF.beautyMobParam == null && (aVar = (a) c578810Mn1.LLIZLLLIL.getValue(c578810Mn1, C578810Mn1.LLJILJIL[5])) != null && (c12i9Je = aVar.je()) != null && (listWe = c12i9Je.We()) != null) {
                shortVideoContextLJFF.beautyMobParam = C1409960mnK.LIZIZ(listWe);
            }
            C1664740tQG c1664740tQG = c578810Mn1.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C578810Mn1.LLJILJIL;
            InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) c1664740tQG.getValue(c578810Mn1, interfaceC2217461BqaArr[6]);
            if (interfaceC1644770su3 != null && (c385670FAfI70 = interfaceC1644770su3.i70()) != null) {
                filterBeanLIZJ = c385670FAfI70.LIZJ();
            } else {
                filterBeanLIZJ = null;
            }
            InterfaceC1644770su3 interfaceC1644770su32 = (InterfaceC1644770su3) c578810Mn1.LLJ.getValue(c578810Mn1, interfaceC2217461BqaArr[6]);
            if (interfaceC1644770su32 != null && (liveDataRT = interfaceC1644770su32.RT()) != null) {
                value = liveDataRT.getValue();
            } else {
                value = null;
            }
            if (filterBeanLIZJ != null) {
                String enName = filterBeanLIZJ.getEnName();
                if (enName != null) {
                    shortVideoContextLJFF.cameraComponentModel.recordContext.filterLabels.add(enName);
                    shortVideoContextLJFF.cameraComponentModel.recordContext.filterLabels.addIndex();
                    if (value != null && (interfaceC1452660nuC = value.LIZJ) != null) {
                        fLJIIIIZZ = C1453230nv7.LJIIIIZZ(filterBeanLIZJ, interfaceC1452660nuC);
                    } else {
                        fLJIIIIZZ = 0.0f;
                    }
                    shortVideoContextLJFF.cameraComponentModel.recordContext.filterValues.add(String.valueOf(fLJIIIIZZ));
                    shortVideoContextLJFF.cameraComponentModel.recordContext.filterValues.addIndex();
                }
                if (filterBeanLIZJ.getId() != null) {
                    C1645000suQ.LIZ(value, shortVideoContextLJFF.cameraComponentModel.recordContext.filterIds, filterBeanLIZJ);
                    shortVideoContextLJFF.cameraComponentModel.recordContext.filterIds.addIndex();
                }
            }
            C578810Mn1 c578810Mn12 = this.LLILZLL;
            InterfaceC1648570t0B interfaceC1648570t0B = (InterfaceC1648570t0B) c578810Mn12.LLIZ.getValue(c578810Mn12, interfaceC2217461BqaArr[4]);
            if (interfaceC1648570t0B != null) {
                interfaceC1648570t0B.KQ();
            }
            if (C1624010sMZ.LIZIZ(this.LLILZLL.LJI()) != null) {
                r8 = 1;
            } else {
                r8 = 0;
            }
            strLIZJ = this.LLILZLL.LIZJ();
            C578810Mn1 c578810Mn13 = this.LLILZLL;
            c578810Mn13.getClass();
            if (((Boolean) C280920Azi.LIZ.getValue()).booleanValue() && !c578810Mn13.LJFF().LJJIL() && !c578810Mn13.LJFF().LJJJ() && !c578810Mn13.LJFF().creativeModel.aigcOfflineModel.isOfflineAIGCEffectEnabled && !c578810Mn13.LJFF().creativeModel.aigcMetadataModel.isAigcEffect && !c578810Mn13.LJFF().LJJIIZI() && !c578810Mn13.LJFF().LJJIJ()) {
                str = strLIZJ;
            } else {
                str = null;
            }
            ?? r1 = this.LLILZLL;
            Pair<AnonymousClass0957<C443120HZe<Bitmap, Long, Boolean>>, AnonymousClass0957<Pair<Bitmap, Long>>> pairLJIIIIZZ = r1.LJIIIIZZ(r1.LJFF(), r8, str, null);
            AnonymousClass0957<C443120HZe<Bitmap, Long, Boolean>> first = pairLJIIIIZZ.getFirst();
            second = pairLJIIIIZZ.getSecond();
            this.LLILZIL = interfaceC497601wk;
            this.LL = strLIZJ;
            this.LLILLJJLI = second;
            this.LLILLL = r8;
            this.LLILZ = 1;
            objLJLIIIL = first.LJLIIIL(this);
            r82 = r8;
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("PhotoProcessor@9c21.captureImage$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) ((C443120HZe) objLJLIIIL).getFirst();
        if (bitmap == null) {
            C0CNO.LIZLLL(0L, new AwS552S0100000_8(this.LLIZ, (Function0<Unit>) 956));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PhotoProcessor@9c21.captureImage$1");
            return unit2;
        }
        C578810Mn1 c578810Mn14 = this.LLILZLL;
        if (r82 != 0) {
            z = true;
        } else {
            z = false;
        }
        Function0<Unit> function0 = this.LLIZ;
        this.LLILZIL = null;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILZ = 2;
        if (c578810Mn14.LIZ(interfaceC497601wk, bitmap, strLIZJ, z, second, function0, C2097608Jq.LJ(), this) == objLJFF) {
            C1C7U.LIZIZ("PhotoProcessor@9c21.captureImage$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PhotoProcessor@9c21.captureImage$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
