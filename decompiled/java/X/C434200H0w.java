package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.span.TakoDataCollectionVideoSpan$loadBitmapFromDeferred$1$1", f = "TakoDataCollectionVideoSpan.kt", l = {219}, m = "invokeSuspend")
public final class C434200H0w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AnonymousClass0957<Bitmap> LLILZ;
    public final /* synthetic */ WeakReference<C434170H0t> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ BaseImage LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434200H0w(AnonymousClass0957<Bitmap> anonymousClass0957, WeakReference<C434170H0t> weakReference, String str, int i, BaseImage baseImage, InterfaceC1364105Vn<? super C434200H0w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = anonymousClass0957;
        this.LLILZIL = weakReference;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = baseImage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C434200H0w c434200H0w = new C434200H0w(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c434200H0w.LLILLL = obj;
        return c434200H0w;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        Object obj2;
        C434170H0t c434170H0t;
        Reference reference;
        Object obj3;
        Bitmap bitmapCopy;
        C434170H0t c434170H0t2;
        C1C7U.LIZ("TakoDataCollectionVideoSpan@e534.loadBitmapFromDeferred$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    obj3 = this.LL;
                    reference = (Reference) this.LLILLL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                AnonymousClass0957<Bitmap> anonymousClass0957 = this.LLILZ;
                reference = this.LLILZIL;
                obj3 = this.LLILZLL;
                this.LLILLL = reference;
                this.LL = obj3;
                this.LLILLJJLI = 1;
                obj = anonymousClass0957.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoDataCollectionVideoSpan@e534.loadBitmapFromDeferred$1$1");
                    return objLJFF;
                }
            }
            bitmapCopy = (Bitmap) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        if (bitmapCopy == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoDataCollectionVideoSpan@e534.loadBitmapFromDeferred$1$1");
            return unit;
        }
        C434170H0t c434170H0t3 = (C434170H0t) reference.get();
        if (c434170H0t3 != null) {
            if (!bitmapCopy.isRecycled()) {
                if (!C1E7C.LIZ()) {
                    Bitmap.Config config = bitmapCopy.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCopy = bitmapCopy.copy(config, false);
                }
                c434170H0t3.LLIZ = bitmapCopy;
                c434170H0t3.LLILLJJLI.invalidate();
                c434170H0t2 = c434170H0t3;
            } else {
                c434170H0t3.LLILZ.LJ(obj3);
                throw new IllegalStateException();
            }
        } else {
            c434170H0t2 = null;
        }
        C189200o6.m2constructorimpl(c434170H0t2);
        obj2 = c434170H0t2;
        int i2 = this.LLIZ;
        WeakReference<C434170H0t> weakReference = this.LLILZIL;
        BaseImage baseImage = this.LLIZLLLIL;
        String str = this.LLILZLL;
        if (C189200o6.m5exceptionOrNullimpl(obj2) != null && i2 < 3 && (c434170H0t = weakReference.get()) != null) {
            c434170H0t.LJII(baseImage, str, null, i2 + 1);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoDataCollectionVideoSpan@e534.loadBitmapFromDeferred$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
