package X;

import Y.ARunnableS23S0101000_12;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.sticker.LivePreviewableEffectSheet;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ttz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.LivePreviewableEffectSheet$initObserver$1$1$1", f = "LivePreviewableEffectSheet.kt", l = {}, m = "invokeSuspend")
public final class C761490Ttz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC401801hI<LiveEffect> LL;
    public final /* synthetic */ LivePreviewableEffectSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C761490Ttz(AbstractC401801hI<? extends LiveEffect> abstractC401801hI, LivePreviewableEffectSheet livePreviewableEffectSheet, InterfaceC1364105Vn<? super C761490Ttz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC401801hI;
        this.LLILLJJLI = livePreviewableEffectSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761490Ttz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

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
        boolean z;
        int iIndexOf;
        LivePreviewableEffectSheet livePreviewableEffectSheet;
        RecyclerView recyclerView;
        LiveEffect liveEffectOld;
        C1C7U.LIZ("LivePreviewableEffectSheet@dba.initObserver$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        if (!((LiveEffect) C13LP.LJJJJZI(((C226500u7) this.LL).LIZJ)).LJJIJIIJI()) {
            LiveEffect liveEffectLIZ = C767250U7v.LIZ();
            liveEffectLIZ.LLJLILLLLZIIL(C0U9E.NONE);
            arrayList.add(liveEffectLIZ);
        }
        arrayList.addAll(((C226500u7) this.LL).LIZJ);
        if (this.LLILLJJLI.LLLF.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        LiveEffect liveEffect = null;
        Object obj2 = null;
        if (z) {
            LivePreviewableEffectSheet livePreviewableEffectSheet2 = this.LLILLJJLI;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((LiveEffect) next).getResourceId().equals(livePreviewableEffectSheet2.LLLF)) {
                    obj2 = next;
                    break;
                }
            }
            liveEffect = (LiveEffect) obj2;
            this.LLILLJJLI.LLLF = "";
        }
        C0U9M c0u9m = this.LLILLJJLI.LLLII;
        if (c0u9m != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C766240U3y(c0u9m.LL, arrayList2), true);
            ((ArrayList) c0u9m.LL).clear();
            ((ArrayList) c0u9m.LL).addAll(arrayList2);
            c21341918fZLIZ.LIZJ(c0u9m);
            if (liveEffect != null) {
                c0u9m.LLZILL(false, false);
                c0u9m.LLLZZIL(liveEffect);
                liveEffectOld = liveEffect;
            } else {
                liveEffectOld = new LiveEffectOld();
            }
            c0u9m.LLLLLLIL(liveEffectOld);
        }
        if (liveEffect != null && (iIndexOf = arrayList.indexOf(liveEffect)) > 0 && (recyclerView = (livePreviewableEffectSheet = this.LLILLJJLI).LLLI) != null) {
            Boolean.valueOf(HandlerHook.viewPost(recyclerView, new ARunnableS23S0101000_12(iIndexOf, livePreviewableEffectSheet, 1)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LivePreviewableEffectSheet@dba.initObserver$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
