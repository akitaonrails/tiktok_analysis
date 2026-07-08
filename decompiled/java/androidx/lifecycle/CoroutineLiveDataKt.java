package androidx.lifecycle;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C23271099x;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.time.Duration;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineLiveDataKt {

    /* JADX INFO: renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2, reason: invalid class name */
    @C09DV(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EmittedSource>, Object> {
        public final /* synthetic */ LiveData<T> $source;
        public final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$this_addDisposableSource = mediatorLiveData;
            this.$source = liveData;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass2(this.$this_addDisposableSource, this.$source, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EmittedSource> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
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
            C099R.LJFF();
            if (this.label == 0) {
                C155000ia.LIZIZ(obj);
                final MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
                mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: X.09Az
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CoroutineLiveDataKt.AnonymousClass2.invokeSuspend$lambda$0(mediatorLiveData, obj2);
                    }
                }));
                return new EmittedSource(this.$source, this.$this_addDisposableSource);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public static final Unit invokeSuspend$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return Unit.LIZ;
        }
    }

    public static final <T> LiveData<T> liveData(Function2<? super LiveDataScope<T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        return liveData(C23271099x.INSTANCE, Mp4ScreenVideoLoadTimeout.CONTROL, function2);
    }

    public static final <T> LiveData<T> liveData(Duration duration, Function2<? super LiveDataScope<T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        return liveData(duration, C23271099x.INSTANCE, function2);
    }

    public static final <T> LiveData<T> liveData(CoroutineContext coroutineContext, Function2<? super LiveDataScope<T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        return liveData(coroutineContext, Mp4ScreenVideoLoadTimeout.CONTROL, function2);
    }

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, InterfaceC1364105Vn<? super EmittedSource> interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ.LLIILII(), new AnonymousClass2(mediatorLiveData, liveData, null));
    }

    public static final <T> LiveData<T> liveData(Duration duration, CoroutineContext coroutineContext, Function2<? super LiveDataScope<T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        return new CoroutineLiveData(coroutineContext, Api26Impl.INSTANCE.toMillis(duration), function2);
    }

    public static final <T> LiveData<T> liveData(CoroutineContext coroutineContext, long j, Function2<? super LiveDataScope<T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        return new CoroutineLiveData(coroutineContext, j, function2);
    }
}
