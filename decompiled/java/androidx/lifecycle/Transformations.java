package androidx.lifecycle;

import X.C013C;
import X.C259800zU;
import X.InterfaceC1294060jmO;
import X.InterfaceC2287108xh;
import androidx.lifecycle.Transformations;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class Transformations {

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$2, reason: invalid class name */
    public final class AnonymousClass2 implements Observer {
        public final /* synthetic */ MediatorLiveData $result;
        public final /* synthetic */ InterfaceC2287108xh $switchMapFunction;
        public LiveData liveData;

        public final LiveData getLiveData() {
            return this.liveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            LiveData liveData = (LiveData) this.$switchMapFunction.apply(obj);
            LiveData liveData2 = this.liveData;
            if (liveData2 == liveData) {
                return;
            }
            if (liveData2 != null) {
                this.$result.removeSource(liveData2);
            }
            this.liveData = liveData;
            if (liveData != null) {
                final MediatorLiveData mediatorLiveData = this.$result;
                mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: X.1Dj8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Transformations.AnonymousClass2.onChanged$lambda$0(mediatorLiveData, obj2);
                    }
                }));
            }
        }

        public final void setLiveData(LiveData liveData) {
            this.liveData = liveData;
        }

        public AnonymousClass2(InterfaceC2287108xh interfaceC2287108xh, MediatorLiveData mediatorLiveData) {
            this.$switchMapFunction = interfaceC2287108xh;
            this.$result = mediatorLiveData;
        }

        public static final Unit onChanged$lambda$0(MediatorLiveData mediatorLiveData, Object obj) {
            mediatorLiveData.setValue(obj);
            return Unit.LIZ;
        }
    }

    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        final MediatorLiveData mediatorLiveData;
        final C013C c013c = new C013C();
        c013c.element = true;
        if (liveData.isInitialized()) {
            c013c.element = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: X.1Dj3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Transformations.distinctUntilChanged$lambda$4(mediatorLiveData, c013c, obj);
            }
        }));
        return mediatorLiveData;
    }

    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, final Function1<X, Y> function1) {
        final MediatorLiveData mediatorLiveData;
        if (liveData.isInitialized()) {
            mediatorLiveData = new MediatorLiveData(function1.invoke(liveData.getValue()));
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: X.1Dj7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Transformations.map$lambda$0(mediatorLiveData, function1, obj);
            }
        }));
        return mediatorLiveData;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final Function1<X, LiveData<Y>> function1) {
        final MediatorLiveData mediatorLiveData;
        LiveData<Y> liveDataInvoke;
        final C259800zU c259800zU = new C259800zU();
        if (liveData.isInitialized() && (liveDataInvoke = function1.invoke(liveData.getValue())) != null && liveDataInvoke.isInitialized()) {
            mediatorLiveData = new MediatorLiveData(liveDataInvoke.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: X.1Dj5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Transformations.switchMap$lambda$3(function1, c259800zU, mediatorLiveData, obj);
            }
        }));
        return mediatorLiveData;
    }

    public static final Unit switchMap$lambda$3$lambda$2(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.setValue(obj);
        return Unit.LIZ;
    }

    @InterfaceC1294060jmO
    public static final /* synthetic */ LiveData map(LiveData liveData, final InterfaceC2287108xh interfaceC2287108xh) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: X.1Dj4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Transformations.map$lambda$1(mediatorLiveData, interfaceC2287108xh, obj);
            }
        }));
        return mediatorLiveData;
    }

    @InterfaceC1294060jmO
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, InterfaceC2287108xh interfaceC2287108xh) {
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new AnonymousClass2(interfaceC2287108xh, mediatorLiveData));
        return mediatorLiveData;
    }

    public static final Unit distinctUntilChanged$lambda$4(MediatorLiveData mediatorLiveData, C013C c013c, Object obj) {
        T value = mediatorLiveData.getValue();
        if (c013c.element || (value != 0 ? !Intrinsics.LJFF(value, obj) : obj != null)) {
            c013c.element = false;
            mediatorLiveData.setValue(obj);
        }
        return Unit.LIZ;
    }

    public static final Unit map$lambda$0(MediatorLiveData mediatorLiveData, Function1 function1, Object obj) {
        mediatorLiveData.setValue(function1.invoke(obj));
        return Unit.LIZ;
    }

    public static final Unit map$lambda$1(MediatorLiveData mediatorLiveData, InterfaceC2287108xh interfaceC2287108xh, Object obj) {
        mediatorLiveData.setValue(interfaceC2287108xh.apply(obj));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.lifecycle.LiveData] */
    public static final Unit switchMap$lambda$3(Function1 function1, C259800zU c259800zU, final MediatorLiveData mediatorLiveData, Object obj) {
        ?? r2 = (LiveData) function1.invoke(obj);
        T t = c259800zU.element;
        if (t != r2) {
            if (t != 0) {
                mediatorLiveData.removeSource((LiveData) t);
            }
            c259800zU.element = r2;
            if (r2 != 0) {
                mediatorLiveData.addSource(r2, new Transformations$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: X.1Dj6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Transformations.switchMap$lambda$3$lambda$2(mediatorLiveData, obj2);
                    }
                }));
            }
        }
        return Unit.LIZ;
    }
}
